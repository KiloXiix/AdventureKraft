package com.devmaster.dangerzone.items;

import com.devmaster.dangerzone.configs.DZConfig;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class KyaniteSword extends Sword {
    public KyaniteSword() {
        super(new Properties().durability(1)); // Temporary dummy value

        // Add any tooltip info here
        // this.addInfo("§9Some tooltip text");
    }

    @Override
    protected ConfigValues getConfigValues() {
        return new ConfigValues(
                DZConfig.getKyaniteSwordDurability(),
                DZConfig.getKyaniteSwordDamage(),
                DZConfig.getKyaniteSwordEfficiency(),
                DZConfig.getKyaniteSwordAttackSpeed(),
                DZConfig.getKyaniteSwordHarvestLevel(),
                DZConfig.getKyaniteSwordEnchantability(),
                DZConfig.getKyaniteSwordHitCost()
        );
    }

    @Override
    public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {
        stack.hurtAndBreak(getConfigValues().hitCost, attacker,
                entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));
        return true;
    }

    @Override
    public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {
        return false; // Kyanite Sword cannot be repaired
    }
}