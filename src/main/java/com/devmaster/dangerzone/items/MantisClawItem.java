package com.devmaster.dangerzone.items;

import com.devmaster.dangerzone.configs.DZConfig;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.UUID;

public class MantisClawItem extends SwordItem {
    private static final UUID ATTACK_SPEED_MODIFIER_UUID = UUID.fromString("fa233e1c-4180-4865-b01b-bcce9785aca3");
    private volatile Multimap<Attribute, AttributeModifier> attributeModifiers;

    public MantisClawItem() {

        super(new Tier() {
            @Override public int getUses() { return 1; } // Temporary dummy value
            @Override public float getSpeed() { return 1; }
            @Override public float getAttackDamageBonus() { return 1; }
            @Override public int getLevel() { return 1; }
            @Override public int getEnchantmentValue() { return 1; }
            @Override public Ingredient getRepairIngredient() { return Ingredient.EMPTY; }
        }, 0, -2.4f, new Properties().rarity(Rarity.UNCOMMON));
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot slot) {
        if (slot == EquipmentSlot.MAINHAND) {
            if (attributeModifiers == null) {
                synchronized (this) {
                    if (attributeModifiers == null) {
                        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();

                        builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(
                                BASE_ATTACK_DAMAGE_UUID, "Weapon modifier",
                                DZConfig.getMantisClawDamage() - 1.0F,
                                AttributeModifier.Operation.ADDITION));

                        builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(
                                ATTACK_SPEED_MODIFIER_UUID,
                                "Weapon modifier",
                                -4.0F + 4.0F + DZConfig.getMantisClawAttackSpeed(),
                                AttributeModifier.Operation.ADDITION));

                        attributeModifiers = builder.build();
                    }
                }
            }
            return attributeModifiers;
        }
        return super.getDefaultAttributeModifiers(slot);
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return DZConfig.getMantisClawDurability();
    }

    @Override
    public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {
        stack.hurtAndBreak(DZConfig.getMantisClawHitCost(), attacker,
                entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));

        if (!attacker.level().isClientSide()) {
            target.heal(-2.0F);
            attacker.heal(2.0F);
        }
        return true;
    }

    @Override
    public void appendHoverText(@Nonnull ItemStack stack, @Nonnull Level world,
                                @Nonnull List<Component> tooltip, @Nonnull TooltipFlag flag) {
        tooltip.add(Component.literal("§2You killed a Mantis. This is your reward! Not only does it do a respectable amount of damage,§2"));
        tooltip.add(Component.literal("§2but with every hit it sucks half a heart out of its victim... and gives it to you!§2"));
    }

    @Override
    public int getEnchantmentValue() {
        return DZConfig.getMantisClawEnchantability();
    }

    @Override
    public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {
        return false; // Mantis Claw cannot be repaired
    }

    // Helper method to get the tier with proper config values when needed
    private Tier getRealTier() {
        return new Tier() {
            @Override public int getUses() { return DZConfig.getMantisClawDurability(); }
            @Override public float getSpeed() { return DZConfig.getMantisClawEfficiency(); }
            @Override public float getAttackDamageBonus() { return DZConfig.getMantisClawDamage() - 1.0F; }
            @Override public int getLevel() { return DZConfig.getMantisClawHarvestLevel(); }
            @Override public int getEnchantmentValue() { return DZConfig.getMantisClawEnchantability(); }
            @Override public Ingredient getRepairIngredient() { return Ingredient.EMPTY; }
        };
    }
}