package com.devmaster.dangerzone.items;

import com.devmaster.dangerzone.util.ModdedTier;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.collect.Multimap;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeMod;

import java.util.List;
import java.util.UUID;

public abstract class Shovel extends ShovelItem {
    protected static final UUID MOVESPEED = UUID.fromString("d6196d8f-07db-4eaf-9738-08d1d01b26c7");
    protected static final UUID REACH = UUID.fromString("015ecec9-071b-44fe-901f-d9616c2dd446");
    protected String name;
    private String[] info = new String[0];
    protected float reach = 0, movespeed = 0, attackspeed = 0;
    protected volatile Multimap<Attribute, AttributeModifier> modifiers;
    protected ItemStack repairitem;
    public int durabilityMultiplier;
    protected ModdedTier moddedTier;
    protected Properties properties;

    public Shovel(ModdedTier tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
        this.moddedTier = tier;
        this.properties = properties;
        this.repairitem = tier.getRepairIngredient().getItems().length > 0
                ? tier.getRepairIngredient().getItems()[0]
                : ItemStack.EMPTY;
    }


    public Shovel(Properties properties) {
        super(createTempTier(), -1, -2.4F, properties);
        this.properties = properties;
        this.moddedTier = createTempTier();
    }

    private static ModdedTier createTempTier() {
        return new ModdedTier(1, 0, 0, 0).withEmptyRepair();
    }


    protected abstract ConfigValues getConfigValues();

    // Helper class to hold config values
    protected static class ConfigValues {
        public final int durability;
        public final float damage;
        public final float efficiency;
        public final float attackSpeed;
        public final int harvestLevel;
        public final int enchantability;
        public final int hitCost;

        public ConfigValues(int durability, float damage, float efficiency, float attackSpeed,
                            int harvestLevel, int enchantability, int hitCost) {
            this.durability = durability;
            this.damage = damage;
            this.efficiency = efficiency;
            this.attackSpeed = attackSpeed;
            this.harvestLevel = harvestLevel;
            this.enchantability = enchantability;
            this.hitCost = hitCost;
        }
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return getConfigValues().durability;
    }

    @Override
    public int getEnchantmentValue() {
        return getConfigValues().enchantability;
    }

    @Override
    public float getDestroySpeed(ItemStack stack, net.minecraft.world.level.block.state.BlockState state) {
        return getConfigValues().efficiency;
    }

    public Shovel build(float reach, float movespeed) {
        this.reach = reach;
        this.movespeed = movespeed;
        return this;
    }

    public Shovel rebuild() {
        this.modifiers = null;
        return this;
    }

    public Shovel rebuildWith(Attribute attribute, UUID id, String modifiername, double value, AttributeModifier.Operation valuetype) {
        this.modifiers = null;
        return this;
    }

    public Shovel addInfo(String... newInfo) {
        if (newInfo != null && newInfo.length > 0) {
            String[] combinedInfo = new String[this.info.length + newInfo.length];
            System.arraycopy(this.info, 0, combinedInfo, 0, this.info.length);
            System.arraycopy(newInfo, 0, combinedInfo, this.info.length, newInfo.length);
            this.info = combinedInfo;
        }
        return this;
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
        for (String s : info) {
            tooltip.add(Component.literal(s));
        }
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot slot) {
        if (slot == EquipmentSlot.MAINHAND) {
            if (modifiers == null) {
                synchronized (this) {
                    if (modifiers == null) {
                        ConfigValues config = getConfigValues();
                        Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();

                        builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(
                                BASE_ATTACK_DAMAGE_UUID,
                                "Shovel modifier",
                                config.damage - 1.0F,
                                AttributeModifier.Operation.ADDITION));

                        builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(
                                BASE_ATTACK_SPEED_UUID,
                                "Shovel modifier",
                                -2.4F + config.attackSpeed,
                                AttributeModifier.Operation.ADDITION));

                        if (movespeed != 0) {
                            builder.put(Attributes.MOVEMENT_SPEED, new AttributeModifier(
                                    MOVESPEED, "Shovel modifier", (double) movespeed,
                                    AttributeModifier.Operation.MULTIPLY_TOTAL));
                        }

                        if (reach != 0) {
                            builder.put(ForgeMod.ENTITY_REACH.get(), new AttributeModifier(
                                    REACH, "Shovel modifier", (double) reach,
                                    AttributeModifier.Operation.MULTIPLY_TOTAL));
                        }

                        modifiers = builder.build();
                    }
                }
            }
            return modifiers;
        }
        return super.getDefaultAttributeModifiers(slot);
    }
}