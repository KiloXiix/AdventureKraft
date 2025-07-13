package com.devmaster.dangerzone.items;

import com.devmaster.dangerzone.configs.DZConfig;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class MantisClawItem extends Sword {
    public MantisClawItem() {
        super(new Properties().durability(1));

        this.addInfo(
                "§2You killed a Mantis. This is your reward! Not only does it do a respectable amount of damage,",
                "§2but with every hit it sucks half a heart out of its victim... and gives it to you!"
        );
    }

    @Override
    protected ConfigValues getConfigValues() {
        return new ConfigValues(
                DZConfig.getMantisClawDurability(),
                DZConfig.getMantisClawDamage(),
                DZConfig.getMantisClawEfficiency(),
                DZConfig.getMantisClawAttackSpeed(),
                DZConfig.getMantisClawHarvestLevel(),
                DZConfig.getMantisClawEnchantability(),
                DZConfig.getMantisClawHitCost()
        );
    }

    @Override
    public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {
        stack.hurtAndBreak(getConfigValues().hitCost, attacker,
                entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));

        if (!attacker.level().isClientSide()) {
            target.heal(-2.0F);
            attacker.heal(2.0F);
        }
        return true;
    }

    @Override
    public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {
        return false;
    }
}