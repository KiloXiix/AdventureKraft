package com.devmaster.dangerzone.util;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import java.util.function.Supplier;

public class ArmourTier implements ArmorMaterial {
    private final String resourcename;
    private final Supplier<Integer> durabilitySupplier;
    private final Supplier<Integer> armorSupplier;
    private final Supplier<Integer> enchantabilitySupplier;
    private final Supplier<Float> toughnessSupplier;
    private final Supplier<Float> knockbackSupplier;
    private final Supplier<Ingredient> repairIngredientSupplier;
    private final boolean ismetal;

    public ArmourTier(String resourcename,
                      Supplier<Integer> durabilitySupplier,
                      Supplier<Integer> armorSupplier,
                      Supplier<Integer> enchantabilitySupplier,
                      Supplier<Float> toughnessSupplier,
                      Supplier<Float> knockbackSupplier,
                      boolean ismetal,
                      Supplier<Ingredient> repairIngredientSupplier) {
        this.resourcename = resourcename;
        this.durabilitySupplier = durabilitySupplier;
        this.armorSupplier = armorSupplier;
        this.enchantabilitySupplier = enchantabilitySupplier;
        this.toughnessSupplier = toughnessSupplier;
        this.knockbackSupplier = knockbackSupplier;
        this.repairIngredientSupplier = repairIngredientSupplier;
        this.ismetal = ismetal;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return durabilitySupplier.get();
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return armorSupplier.get();
    }

    @Override
    public int getEnchantmentValue() {
        return enchantabilitySupplier.get();
    }

    @Override
    public SoundEvent getEquipSound() {
        return ismetal ? SoundEvents.ARMOR_EQUIP_IRON : SoundEvents.ARMOR_EQUIP_LEATHER;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredientSupplier.get();
    }

    @Override
    public String getName() {
        return resourcename;
    }

    @Override
    public float getToughness() {
        return toughnessSupplier.get();
    }

    @Override
    public float getKnockbackResistance() {
        return knockbackSupplier.get();
    }
}