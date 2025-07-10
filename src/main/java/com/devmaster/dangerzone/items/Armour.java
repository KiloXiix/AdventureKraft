package com.devmaster.dangerzone.items;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;

import javax.annotation.Nullable;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class Armour extends ArmorItem {
    private static final UUID[] ARMOR_MODIFIER_UUIDS = new UUID[] {
            UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"), // boots
            UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), // leggings
            UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"), // chestplate
            UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")  // helmet
    };

    private final Supplier<ArmorMaterial> materialSupplier;
    private final Supplier<Integer> hitCostSupplier;
    private final String infoText;
    private volatile ArmorMaterial cachedMaterial;
    private volatile Multimap<Attribute, AttributeModifier> attributeModifiers;

    public Armour(Supplier<ArmorMaterial> materialSupplier,
                  ArmorItem.Type type,
                  Properties properties,
                  Supplier<Integer> hitCostSupplier,
                  String infoText) {
        super(createDummyMaterial(), type, properties);
        this.materialSupplier = materialSupplier;
        this.hitCostSupplier = hitCostSupplier;
        this.infoText = infoText;
    }

    private static ArmorMaterial createDummyMaterial() {
        return new ArmorMaterial() {
            @Override public int getDurabilityForType(Type type) { return 1; }
            @Override public int getDefenseForType(Type type) { return 1; }
            @Override public int getEnchantmentValue() { return 1; }
            @Override public net.minecraft.sounds.SoundEvent getEquipSound() {
                return net.minecraft.sounds.SoundEvents.ARMOR_EQUIP_LEATHER;
            }
            @Override public net.minecraft.world.item.crafting.Ingredient getRepairIngredient() {
                return net.minecraft.world.item.crafting.Ingredient.EMPTY;
            }
            @Override public String getName() { return "dummy"; }
            @Override public float getToughness() { return 0.0f; }
            @Override public float getKnockbackResistance() { return 0.0f; }
        };
    }

    private ArmorMaterial getRealMaterial() {
        if (cachedMaterial == null) {
            synchronized (this) { // Thread-safe lazy initialization
                if (cachedMaterial == null) {
                    cachedMaterial = materialSupplier.get(); // Load the real material
                }
            }
        }
        return cachedMaterial;
    }

    @Override
    public String getArmorTexture(ItemStack stack, net.minecraft.world.entity.Entity entity,
                                  EquipmentSlot slot, String type) {
        ArmorMaterial material = getRealMaterial();
        String materialName = material.getName();

        // Determines the layer based on slot using layer_2 for the legs and layer_1 for all other pieces
        String layer = (slot == EquipmentSlot.LEGS) ? "layer_2" : "layer_1";

        return "dangerzone:textures/models/armor/" + materialName + "_" + layer + ".png";
    }

    private Multimap<Attribute, AttributeModifier> buildDefaultAttributeModifiers() {
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        UUID uuid = ARMOR_MODIFIER_UUIDS[this.type.getSlot().getIndex()];
        ArmorMaterial material = getRealMaterial();

        builder.put(Attributes.ARMOR, new AttributeModifier(uuid, "Armor modifier",
                material.getDefenseForType(this.type), AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(uuid, "Armor toughness",
                material.getToughness(), AttributeModifier.Operation.ADDITION));

        if (material.getKnockbackResistance() > 0) {
            builder.put(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(uuid, "Armor knockback resistance",
                    material.getKnockbackResistance(), AttributeModifier.Operation.ADDITION));
        }

        return builder.build();
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot slot) {
        if (slot == this.type.getSlot()) {
            if (attributeModifiers == null) {
                synchronized (this) {
                    if (attributeModifiers == null) {
                        attributeModifiers = buildDefaultAttributeModifiers();
                    }
                }
            }
            return attributeModifiers;
        }
        return super.getDefaultAttributeModifiers(slot);
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return getRealMaterial().getDurabilityForType(this.type);
    }

    @Override
    public int getDefense() {
        return getRealMaterial().getDefenseForType(this.type);
    }

    @Override
    public float getToughness() {
        return getRealMaterial().getToughness();
    }

    @Override
    public int getEnchantmentValue() {
        return getRealMaterial().getEnchantmentValue();
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level,
                                List<Component> tooltip, net.minecraft.world.item.TooltipFlag flag) {
        super.appendHoverText(stack, level, tooltip, flag);
        if (infoText != null && !infoText.isEmpty()) {
            tooltip.add(Component.literal(infoText));
        }
    }

    @Override
    public <T extends LivingEntity> int damageItem(ItemStack stack, int amount, T entity,
                                                   java.util.function.Consumer<T> onBroken) {
        return hitCostSupplier.get();
    }

    @Override
    public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {
        return getRealMaterial().getRepairIngredient().test(repairCandidate);
    }
}