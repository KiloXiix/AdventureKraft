package com.devmaster.dangerzone.configs;

import com.devmaster.dangerzone.misc.DangerZone;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber
public class DZConfig {
    // === Config fields ===

    //Mantis Claw Attributes
    private static ForgeConfigSpec.IntValue mantisClawDamage;
    private static ForgeConfigSpec.IntValue mantisClawDurability;
    private static ForgeConfigSpec.IntValue mantisClawHitCost;
    private static ForgeConfigSpec.IntValue mantisClawHarvestLevel;
    private static ForgeConfigSpec.IntValue mantisClawEnchantability;
    private static ForgeConfigSpec.IntValue mantisClawEfficiency;
    private static ForgeConfigSpec.IntValue mantisClawAttackSpeed;

    // Coarse Amethyst Armor Attributes
    private static ForgeConfigSpec.IntValue coarseAmethystHelmetDurability;
    private static ForgeConfigSpec.IntValue coarseAmethystHelmetHitCost;
    private static ForgeConfigSpec.IntValue coarseAmethystHelmetEnchantability;
    private static ForgeConfigSpec.DoubleValue coarseAmethystHelmetToughness;
    private static ForgeConfigSpec.DoubleValue coarseAmethystHelmetKnockBackResistance;
    private static ForgeConfigSpec.IntValue coarseAmethystHelmetArmor;

    private static ForgeConfigSpec.IntValue coarseAmethystChestplateDurability;
    private static ForgeConfigSpec.IntValue coarseAmethystChestplateHitCost;
    private static ForgeConfigSpec.IntValue coarseAmethystChestplateEnchantability;
    private static ForgeConfigSpec.DoubleValue coarseAmethystChestplateToughness;
    private static ForgeConfigSpec.DoubleValue coarseAmethystChestplateKnockBackResistance;
    private static ForgeConfigSpec.IntValue coarseAmethystChestplateArmor;

    private static ForgeConfigSpec.IntValue coarseAmethystLeggingsDurability;
    private static ForgeConfigSpec.IntValue coarseAmethystLeggingsHitCost;
    private static ForgeConfigSpec.IntValue coarseAmethystLeggingsEnchantability;
    private static ForgeConfigSpec.DoubleValue coarseAmethystLeggingsToughness;
    private static ForgeConfigSpec.DoubleValue coarseAmethystLeggingsKnockBackResistance;
    private static ForgeConfigSpec.IntValue coarseAmethystLeggingsArmor;

    private static ForgeConfigSpec.IntValue coarseAmethystBootsDurability;
    private static ForgeConfigSpec.IntValue coarseAmethystBootsHitCost;
    private static ForgeConfigSpec.IntValue coarseAmethystBootsEnchantability;
    private static ForgeConfigSpec.DoubleValue coarseAmethystBootsToughness;
    private static ForgeConfigSpec.DoubleValue coarseAmethystBootsKnockBackResistance;
    private static ForgeConfigSpec.IntValue coarseAmethystBootsArmor;

    @SubscribeEvent
    public static void onConfigLoading(ModConfigEvent.Loading event) {
        if (event.getConfig().getSpec() == BaseConfig.COMMON_CONFIG) {
            DangerZone.LOGGER.info("Config loaded successfully");
        }
    }

    @SubscribeEvent
    public static void onConfigReloading(ModConfigEvent.Reloading event) {
        if (event.getConfig().getSpec() == BaseConfig.COMMON_CONFIG) {
            DangerZone.LOGGER.info("Config reloaded");
        }
    }

    public static void COMMON(ForgeConfigSpec.Builder builder) {
        builder.push("Mantis Claw");
        mantisClawDamage = builder.comment("Damage dealt by Mantis Claw (Default: 14)")
                .defineInRange("damage", 14, 0, 1000);
        mantisClawDurability = builder.comment("Durability of Mantis Claw (Default: 800)")
                .defineInRange("durability", 800, 0, 10000);
        mantisClawHitCost = builder.comment("Durability lost per hit (Default: 1)")
                .defineInRange("hitCost", 1, 0, 10000);
        mantisClawHarvestLevel = builder.comment("Harvest level of Mantis Claw (Default: 4)")
                .defineInRange("harvestLevel", 4, 0, 1000);
        mantisClawEnchantability = builder.comment("Enchantability of Mantis Claw (Default: 70)")
                .defineInRange("enchantability", 70, 0, 1000);
        mantisClawEfficiency = builder.comment("Efficiency of Mantis Claw (Default: 11)")
                .defineInRange("efficiency", 11, 0, 1000);
        mantisClawAttackSpeed = builder.comment("Attack speed of Mantis Claw (Default: 1)")
                .defineInRange("attackSpeed", 1, 0, 1000);
        builder.pop();

        builder.push("Coarse Amethyst Armor");

        builder.push("Helmet");
        coarseAmethystHelmetDurability = builder.comment("Helmet durability (Default: 1300)")
                .defineInRange("durability", 1300, 0, 10000);
        coarseAmethystHelmetHitCost = builder.comment("Helmet durability loss per hit (Default: 1)")
                .defineInRange("hitCost", 1, 0, 1000);
        coarseAmethystHelmetEnchantability = builder.comment("Helmet enchantability (Default: 40)")
                .defineInRange("enchantability", 40, 0, 1000);
        coarseAmethystHelmetToughness = builder.comment("Helmet toughness (Default: 0.0)")
                .defineInRange("toughness", 0.0, 0.0, 20.0);
        coarseAmethystHelmetKnockBackResistance = builder.comment("Helmet knockback resistance (Default: 0.0)")
                .defineInRange("knockBackResistance", 0.0, 0.0, 1.0);
        coarseAmethystHelmetArmor = builder.comment("Helmet armor value (Default: 23)")
                .defineInRange("armor", 23, 0, 1000);
        builder.pop();

        builder.push("Chestplate");
        coarseAmethystChestplateDurability = builder.comment("Chestplate durability (Default: 1500)")
                .defineInRange("durability", 1500, 0, 10000);
        coarseAmethystChestplateHitCost = builder.comment("Chestplate durability loss per hit (Default: 1)")
                .defineInRange("hitCost", 1, 0, 1000);
        coarseAmethystChestplateEnchantability = builder.comment("Chestplate enchantability (Default: 40)")
                .defineInRange("enchantability", 40, 0, 1000);
        coarseAmethystChestplateToughness = builder.comment("Chestplate toughness (Default: 0.0)")
                .defineInRange("toughness", 0.0, 0.0, 20.0);
        coarseAmethystChestplateKnockBackResistance = builder.comment("Chestplate knockback resistance (Default: 0.0)")
                .defineInRange("knockBackResistance", 0.0, 0.0, 1.0);
        coarseAmethystChestplateArmor = builder.comment("Chestplate armor value (Default: 23)")
                .defineInRange("armor", 23, 0, 1000);
        builder.pop();

        builder.push("Leggings");
        coarseAmethystLeggingsDurability = builder.comment("Leggings durability (Default: 1600)")
                .defineInRange("durability", 1600, 0, 10000);
        coarseAmethystLeggingsHitCost = builder.comment("Leggings durability loss per hit (Default: 1)")
                .defineInRange("hitCost", 1, 0, 1000);
        coarseAmethystLeggingsEnchantability = builder.comment("Leggings enchantability (Default: 40)")
                .defineInRange("enchantability", 40, 0, 1000);
        coarseAmethystLeggingsToughness = builder.comment("Leggings toughness (Default: 0.0)")
                .defineInRange("toughness", 0.0, 0.0, 20.0);
        coarseAmethystLeggingsKnockBackResistance = builder.comment("Leggings knockback resistance (Default: 0.0)")
                .defineInRange("knockBackResistance", 0.0, 0.0, 1.0);
        coarseAmethystLeggingsArmor = builder.comment("Leggings armor value (Default: 23)")
                .defineInRange("armor", 23, 0, 1000);
        builder.pop();

        builder.push("Boots");
        coarseAmethystBootsDurability = builder.comment("Boots durability (Default: 1100)")
                .defineInRange("durability", 1100, 0, 10000);
        coarseAmethystBootsHitCost = builder.comment("Boots durability loss per hit (Default: 1)")
                .defineInRange("hitCost", 1, 0, 1000);
        coarseAmethystBootsEnchantability = builder.comment("Boots enchantability (Default: 40)")
                .defineInRange("enchantability", 40, 0, 1000);
        coarseAmethystBootsToughness = builder.comment("Boots toughness (Default: 0.0)")
                .defineInRange("toughness", 0.0, 0.0, 20.0);
        coarseAmethystBootsKnockBackResistance = builder.comment("Boots knockback resistance (Default: 0.0)")
                .defineInRange("knockBackResistance", 0.0, 0.0, 1.0);
        coarseAmethystBootsArmor = builder.comment("Boots armor value (Default: 23)")
                .defineInRange("armor", 23, 0, 1000);
        builder.pop();

        builder.pop(); // Coarse Amethyst Armor
    }

    // Simplified getters
    public static int getMantisClawDamage() { return mantisClawDamage != null ? mantisClawDamage.get() : 14; }
    public static int getMantisClawDurability() { return mantisClawDurability != null ? mantisClawDurability.get() : 800; }
    public static int getMantisClawHitCost() { return mantisClawHitCost != null ? mantisClawHitCost.get() : 1; }
    public static int getMantisClawHarvestLevel() { return mantisClawHarvestLevel != null ? mantisClawHarvestLevel.get() : 4; }
    public static int getMantisClawEnchantability() { return mantisClawEnchantability != null ? mantisClawEnchantability.get() : 70; }
    public static float getMantisClawEfficiency() { return mantisClawEfficiency != null ? mantisClawEfficiency.get() : 11; }
    public static float getMantisClawAttackSpeed() { return mantisClawAttackSpeed != null ? mantisClawAttackSpeed.get() : 1; }

    public static int getCoarseAmethystHelmetDurability() { return coarseAmethystHelmetDurability != null ? coarseAmethystHelmetDurability.get() : 1300; }
    public static int getCoarseAmethystHelmetHitCost() { return coarseAmethystHelmetHitCost != null ? coarseAmethystHelmetHitCost.get() : 1; }
    public static int getCoarseAmethystHelmetEnchantability() { return coarseAmethystHelmetEnchantability != null ? coarseAmethystHelmetEnchantability.get() : 40; }
    public static double getCoarseAmethystHelmetToughness() { return coarseAmethystHelmetToughness != null ? coarseAmethystHelmetToughness.get() : 0.0; }
    public static double getCoarseAmethystHelmetKnockBackResistance() { return coarseAmethystHelmetKnockBackResistance != null ? coarseAmethystHelmetKnockBackResistance.get() : 0.0; }
    public static int getCoarseAmethystHelmetArmor() { return coarseAmethystHelmetArmor != null ? coarseAmethystHelmetArmor.get() : 23; }

    public static int getCoarseAmethystChestplateDurability() { return coarseAmethystChestplateDurability != null ? coarseAmethystChestplateDurability.get() : 1500; }
    public static int getCoarseAmethystChestplateHitCost() { return coarseAmethystChestplateHitCost != null ? coarseAmethystChestplateHitCost.get() : 1; }
    public static int getCoarseAmethystChestplateEnchantability() { return coarseAmethystChestplateEnchantability != null ? coarseAmethystChestplateEnchantability.get() : 40; }
    public static double getCoarseAmethystChestplateToughness() { return coarseAmethystChestplateToughness != null ? coarseAmethystChestplateToughness.get() : 0.0; }
    public static double getCoarseAmethystChestplateKnockBackResistance() { return coarseAmethystChestplateKnockBackResistance != null ? coarseAmethystChestplateKnockBackResistance.get() : 0.0; }
    public static int getCoarseAmethystChestplateArmor() { return coarseAmethystChestplateArmor != null ? coarseAmethystChestplateArmor.get() : 23; }

    public static int getCoarseAmethystLeggingsDurability() { return coarseAmethystLeggingsDurability != null ? coarseAmethystLeggingsDurability.get() : 1600; }
    public static int getCoarseAmethystLeggingsHitCost() { return coarseAmethystLeggingsHitCost != null ? coarseAmethystLeggingsHitCost.get() : 1; }
    public static int getCoarseAmethystLeggingsEnchantability() { return coarseAmethystLeggingsEnchantability != null ? coarseAmethystLeggingsEnchantability.get() : 40; }
    public static double getCoarseAmethystLeggingsToughness() { return coarseAmethystLeggingsToughness != null ? coarseAmethystLeggingsToughness.get() : 0.0; }
    public static double getCoarseAmethystLeggingsKnockBackResistance() { return coarseAmethystLeggingsKnockBackResistance != null ? coarseAmethystLeggingsKnockBackResistance.get() : 0.0; }
    public static int getCoarseAmethystLeggingsArmor() { return coarseAmethystLeggingsArmor != null ? coarseAmethystLeggingsArmor.get() : 23; }

    public static int getCoarseAmethystBootsDurability() { return coarseAmethystBootsDurability != null ? coarseAmethystBootsDurability.get() : 1100; }
    public static int getCoarseAmethystBootsHitCost() { return coarseAmethystBootsHitCost != null ? coarseAmethystBootsHitCost.get() : 1; }
    public static int getCoarseAmethystBootsEnchantability() { return coarseAmethystBootsEnchantability != null ? coarseAmethystBootsEnchantability.get() : 40; }
    public static double getCoarseAmethystBootsToughness() { return coarseAmethystBootsToughness != null ? coarseAmethystBootsToughness.get() : 0.0; }
    public static double getCoarseAmethystBootsKnockBackResistance() { return coarseAmethystBootsKnockBackResistance != null ? coarseAmethystBootsKnockBackResistance.get() : 0.0; }
    public static int getCoarseAmethystBootsArmor() { return coarseAmethystBootsArmor != null ? coarseAmethystBootsArmor.get() : 23; }
}