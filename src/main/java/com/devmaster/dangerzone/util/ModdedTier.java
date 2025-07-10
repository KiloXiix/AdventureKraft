// === DIRECT PORT OF ModdedTier FROM 1.16.5 Chaos-Update ===


package com.devmaster.dangerzone.util;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public class ModdedTier implements Tier {
    private int uses = 0, enchantability = 0, level = 2;
    private float efficiency = 0, swingspeed = 1, damage = 0;
    private ItemStack repairitem;
    private TagKey<Block> incorrectBlocksForDrops;

    public ModdedTier(int uses, float damage, float efficiency, float swingspeed) {
        this.uses = uses;
        this.damage = damage;
        this.efficiency = efficiency;
        this.swingspeed = swingspeed;
    }

    public ModdedTier level(int i) {
        this.level = i;
        return this;
    }

    public ModdedTier enchanting(int i) {
        this.enchantability = i;
        return this;
    }

    public ModdedTier material(Item item) {
        repairitem = new ItemStack(item);
        return this;
    }

    public ModdedTier incorrectBlocksForDrops(TagKey<Block> tag) {
        this.incorrectBlocksForDrops = tag;
        return this;
    }

    public ItemStack getRepairItem() {
        return repairitem;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getUses() {
        return uses;
    }

    // Modified method to set attack speed
    public ModdedTier speed(float f) {
        this.swingspeed = f;
        return this;
    }

    // New getter method for attack speed
    public float getAttackSpeed() {
        return swingspeed;
    }

    @Override
    public float getSpeed() {
        return efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return damage;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairitem != null ? Ingredient.of(repairitem) : Ingredient.EMPTY;
    }

    public TagKey<Block> getIncorrectBlocksForDrops() {
        return incorrectBlocksForDrops;
    }
}