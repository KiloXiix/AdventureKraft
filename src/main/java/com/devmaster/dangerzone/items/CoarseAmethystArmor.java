package com.devmaster.dangerzone.items;

import com.devmaster.dangerzone.configs.DZConfig;
import com.devmaster.dangerzone.util.ArmourTier;
import com.devmaster.dangerzone.util.RegistryHandler;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.crafting.Ingredient;

public class CoarseAmethystArmor {

    private static ArmourTier createArmorTier(ArmorItem.Type type) {
        return new ArmourTier(
                "coarse_amethyst",
                () -> getDurabilityForType(type),
                () -> getArmorForType(type),
                () -> getEnchantabilityForType(type),
                () -> getToughnessForType(type),
                () -> getKnockbackResistanceForType(type),
                true,
                () -> Ingredient.of(RegistryHandler.COARSE_AMETHYST.get())
        );
    }

    private static int getDurabilityForType(ArmorItem.Type type) {
        return switch (type) {
            case HELMET -> DZConfig.getCoarseAmethystHelmetDurability();
            case CHESTPLATE -> DZConfig.getCoarseAmethystChestplateDurability();
            case LEGGINGS -> DZConfig.getCoarseAmethystLeggingsDurability();
            case BOOTS -> DZConfig.getCoarseAmethystBootsDurability();
        };
    }

    private static int getArmorForType(ArmorItem.Type type) {
        return switch (type) {
            case HELMET -> DZConfig.getCoarseAmethystHelmetArmor();
            case CHESTPLATE -> DZConfig.getCoarseAmethystChestplateArmor();
            case LEGGINGS -> DZConfig.getCoarseAmethystLeggingsArmor();
            case BOOTS -> DZConfig.getCoarseAmethystBootsArmor();
        };
    }

    private static int getEnchantabilityForType(ArmorItem.Type type) {
        return switch (type) {
            case HELMET -> DZConfig.getCoarseAmethystHelmetEnchantability();
            case CHESTPLATE -> DZConfig.getCoarseAmethystChestplateEnchantability();
            case LEGGINGS -> DZConfig.getCoarseAmethystLeggingsEnchantability();
            case BOOTS -> DZConfig.getCoarseAmethystBootsEnchantability();
        };
    }

    private static float getToughnessForType(ArmorItem.Type type) {
        return (float) switch (type) {
            case HELMET -> DZConfig.getCoarseAmethystHelmetToughness();
            case CHESTPLATE -> DZConfig.getCoarseAmethystChestplateToughness();
            case LEGGINGS -> DZConfig.getCoarseAmethystLeggingsToughness();
            case BOOTS -> DZConfig.getCoarseAmethystBootsToughness();
        };
    }

    private static float getKnockbackResistanceForType(ArmorItem.Type type) {
        return (float) switch (type) {
            case HELMET -> DZConfig.getCoarseAmethystHelmetKnockBackResistance();
            case CHESTPLATE -> DZConfig.getCoarseAmethystChestplateKnockBackResistance();
            case LEGGINGS -> DZConfig.getCoarseAmethystLeggingsKnockBackResistance();
            case BOOTS -> DZConfig.getCoarseAmethystBootsKnockBackResistance();
        };
    }

    private static int getHitCostForType(ArmorItem.Type type) {
        return switch (type) {
            case HELMET -> DZConfig.getCoarseAmethystHelmetHitCost();
            case CHESTPLATE -> DZConfig.getCoarseAmethystChestplateHitCost();
            case LEGGINGS -> DZConfig.getCoarseAmethystLeggingsHitCost();
            case BOOTS -> DZConfig.getCoarseAmethystBootsHitCost();
        };
    }

    public static ArmorItem createHelmet() {
        return new Armour(
                () -> createArmorTier(ArmorItem.Type.HELMET),
                ArmorItem.Type.HELMET,
                new Item.Properties().rarity(Rarity.COMMON),  // Changed this line
                () -> getHitCostForType(ArmorItem.Type.HELMET),
                "\u00A75Glittering\u00A75"
        );
    }

    public static ArmorItem createChestplate() {
        return new Armour(
                () -> createArmorTier(ArmorItem.Type.CHESTPLATE),
                ArmorItem.Type.CHESTPLATE,
                new Item.Properties().rarity(Rarity.COMMON),  // Changed
                () -> getHitCostForType(ArmorItem.Type.CHESTPLATE),
                "\u00A75DAZZLING\u00A75"
        );
    }

    public static ArmorItem createLeggings() {
        return new Armour(
                () -> createArmorTier(ArmorItem.Type.LEGGINGS),
                ArmorItem.Type.LEGGINGS,
                new Item.Properties().rarity(Rarity.COMMON),  // Changed
                () -> getHitCostForType(ArmorItem.Type.LEGGINGS),
                "\u00A75Shining\u00A75"
        );
    }

    public static ArmorItem createBoots() {
        return new Armour(
                () -> createArmorTier(ArmorItem.Type.BOOTS),
                ArmorItem.Type.BOOTS,
                new Item.Properties().rarity(Rarity.COMMON),  // Changed
                () -> getHitCostForType(ArmorItem.Type.BOOTS),
                "\u00A75Sparkling\u00A75"
        );
    }
}