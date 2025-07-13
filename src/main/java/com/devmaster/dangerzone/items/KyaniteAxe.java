package com.devmaster.dangerzone.items;

import com.devmaster.dangerzone.configs.DZConfig;
import com.devmaster.dangerzone.util.ModdedTier;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nonnull;
import java.util.List;

public class KyaniteAxe extends Axe {

    // Dummy constructor with a temporary tier — real values will be read from config later
    public KyaniteAxe() {
        super(createTempTier(), 0, 0f, new Properties());
    }

    // Called whenever you need the current config values
    @Override
    protected ConfigValues getConfigValues() {
        return new ConfigValues(
                DZConfig.getKyaniteAxeDurability(),
                DZConfig.getKyaniteAxeDamage(),
                DZConfig.getKyaniteAxeEfficiency(),
                DZConfig.getKyaniteAxeAttackSpeed(),
                DZConfig.getKyaniteAxeHarvestLevel(),
                DZConfig.getKyaniteAxeEnchantability(),
                DZConfig.getKyaniteAxeHitCost()
        );
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
    public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {
        stack.hurtAndBreak(getConfigValues().hitCost, attacker,
                entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));
        return true;
    }

    @Override
    public void appendHoverText(@Nonnull ItemStack stack, @Nonnull Level world,
                                @Nonnull List<Component> tooltip, @Nonnull TooltipFlag flag) {
        super.appendHoverText(stack, world, tooltip, flag);
    }

    @Override
    public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {
        return false;
    }

    // Temporary tier used at construction, avoids early config calls
    private static ModdedTier createTempTier() {
        return new ModdedTier(1, 1, 1, 1).withEmptyRepair();
    }
}
