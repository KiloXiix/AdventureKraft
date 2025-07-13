package com.devmaster.dangerzone.configs;

import com.devmaster.dangerzone.misc.DangerZone;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber
public class DZConfig {
    // === Config fields ===
    private static boolean loaded = false;

    public static boolean isLoaded() {
        return loaded;
    }

    public static void setLoaded() {
        loaded = true;
    }



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




    // === Tools and Weapons Attributes ===

    //Kyanite Sword
    private static ForgeConfigSpec.IntValue KyaniteSwordDurability;
    private static ForgeConfigSpec.IntValue KyaniteSwordHitCost;
    private static ForgeConfigSpec.IntValue KyaniteSwordEnchantability;
    private static ForgeConfigSpec.IntValue KyaniteSwordDamage;
    private static ForgeConfigSpec.IntValue KyaniteSwordHarvestLevel;
    private static ForgeConfigSpec.IntValue KyaniteSwordEfficiency;
    private static ForgeConfigSpec.IntValue KyaniteSwordAttackSpeed;

    //Kyanite Pickaxe
    private static ForgeConfigSpec.IntValue KyanitePickaxeDurability;
    private static ForgeConfigSpec.IntValue KyanitePickaxeHitCost;
    private static ForgeConfigSpec.IntValue KyanitePickaxeEnchantability;
    private static ForgeConfigSpec.IntValue KyanitePickaxeDamage;
    private static ForgeConfigSpec.IntValue KyanitePickaxeHarvestLevel;
    private static ForgeConfigSpec.IntValue KyanitePickaxeEfficiency;
    private static ForgeConfigSpec.IntValue KyanitePickaxeAttackSpeed;
    
    //Kyanite Axe
    private static ForgeConfigSpec.IntValue KyaniteAxeDurability;
    private static ForgeConfigSpec.IntValue KyaniteAxeHitCost;
    private static ForgeConfigSpec.IntValue KyaniteAxeEnchantability;
    private static ForgeConfigSpec.IntValue KyaniteAxeDamage;
    private static ForgeConfigSpec.IntValue KyaniteAxeHarvestLevel;
    private static ForgeConfigSpec.IntValue KyaniteAxeEfficiency;
    private static ForgeConfigSpec.IntValue KyaniteAxeAttackSpeed;

    //Kyanite Hoe
    private static ForgeConfigSpec.IntValue KyaniteHoeDurability;
    private static ForgeConfigSpec.IntValue KyaniteHoeHitCost;
    private static ForgeConfigSpec.IntValue KyaniteHoeEnchantability;
    private static ForgeConfigSpec.IntValue KyaniteHoeDamage;
    private static ForgeConfigSpec.IntValue KyaniteHoeHarvestLevel;
    private static ForgeConfigSpec.IntValue KyaniteHoeEfficiency;
    private static ForgeConfigSpec.IntValue KyaniteHoeAttackSpeed;

    //Kyanite Shovel
    private static ForgeConfigSpec.IntValue KyaniteShovelDurability;
    private static ForgeConfigSpec.IntValue KyaniteShovelHitCost;
    private static ForgeConfigSpec.IntValue KyaniteShovelEnchantability;
    private static ForgeConfigSpec.IntValue KyaniteShovelDamage;
    private static ForgeConfigSpec.IntValue KyaniteShovelHarvestLevel;
    private static ForgeConfigSpec.IntValue KyaniteShovelEfficiency;
    private static ForgeConfigSpec.IntValue KyaniteShovelAttackSpeed;





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

        // Kyanite Sword
        builder.push("Kyanite Sword");
        KyaniteSwordDamage = builder.comment("Damage dealt by Kyanite Sword (Default: 30)")
                  .defineInRange("damage", 30, 0, 1000);
        KyaniteSwordDurability = builder.comment("Durability of Kyanite Sword (Default: 2000)")
                 .defineInRange("durability", 2000, 0, 10000);
        KyaniteSwordHitCost = builder.comment("Durability lost per hit (Default: 1)")
               .defineInRange("hitCost", 1, 0, 10000);
        KyaniteSwordHarvestLevel = builder.comment("Harvest level of Kyanite Sword (Default: 4)")
              .defineInRange("harvestLevel", 4, 0, 1000);
        KyaniteSwordEnchantability = builder.comment("Enchantability of Kyanite Sword (Default: 70)")
              .defineInRange("enchantability", 70, 0, 1000);
        KyaniteSwordEfficiency = builder.comment("Efficiency of Kyanite Sword (Default: 11)")
            .defineInRange("efficiency", 11, 0, 1000);
        KyaniteSwordAttackSpeed = builder.comment("Attack speed of Kyanite Sword (Default: 1)")
                .defineInRange("attackSpeed", 1, 0, 1000);
        builder.pop();


        // Kyanite Pickaxe
        builder.push("Kyanite Pickaxe");
        KyanitePickaxeDamage = builder.comment("Damage dealt by Kyanite Pickaxe (Default: 30)")
                .defineInRange("damage", 10, 0, 1000);
        KyanitePickaxeDurability = builder.comment("Durability of Kyanite Pickaxe (Default: 2000)")
                .defineInRange("durability", 2000, 0, 10000);
        KyanitePickaxeHitCost = builder.comment("Durability lost per hit (Default: 1)")
                .defineInRange("hitCost", 1, 0, 10000);
        KyanitePickaxeHarvestLevel = builder.comment("Harvest level of Kyanite Pickaxe (Default: 4)")
                .defineInRange("harvestLevel", 4, 0, 1000);
        KyanitePickaxeEnchantability = builder.comment("Enchantability of Kyanite Pickaxe (Default: 70)")
                .defineInRange("enchantability", 70, 0, 1000);
        KyanitePickaxeEfficiency = builder.comment("Efficiency of Kyanite Pickaxe (Default: 11)")
                .defineInRange("efficiency", 1, 0, 1000);
        KyanitePickaxeAttackSpeed = builder.comment("Attack speed of Kyanite Pickaxe (Default: 1)")
                .defineInRange("attackSpeed", 1, 0, 1000);
        builder.pop();


        // Kyanite Axe
        builder.push("Kyanite Axe");
        KyaniteAxeDamage = builder.comment("Damage dealt by Kyanite Axe (Default: 30)")
                .defineInRange("damage", 10, 0, 1000);
        KyaniteAxeDurability = builder.comment("Durability of Kyanite Axe (Default: 2000)")
                .defineInRange("durability", 2000, 0, 10000);
        KyaniteAxeHitCost = builder.comment("Durability lost per hit (Default: 1)")
                .defineInRange("hitCost", 1, 0, 10000);
        KyaniteAxeHarvestLevel = builder.comment("Harvest level of Kyanite Axe (Default: 4)")
                .defineInRange("harvestLevel", 4, 0, 1000);
        KyaniteAxeEnchantability = builder.comment("Enchantability of Kyanite Axe (Default: 70)")
                .defineInRange("enchantability", 70, 0, 1000);
        KyaniteAxeEfficiency = builder.comment("Efficiency of Kyanite Axe (Default: 11)")
                .defineInRange("efficiency", 1, 0, 1000);
        KyaniteAxeAttackSpeed = builder.comment("Attack speed of Kyanite Axe (Default: 1)")
                .defineInRange("attackSpeed", 1, 0, 1000);
        builder.pop();


        // Kyanite Hoe
        builder.push("Kyanite Hoe");
        KyaniteHoeDamage = builder.comment("Damage dealt by Kyanite Hoe (Default: 30)")
                .defineInRange("damage", 10, 0, 1000);
        KyaniteHoeDurability = builder.comment("Durability of Kyanite Hoe (Default: 2000)")
                .defineInRange("durability", 2000, 0, 10000);
        KyaniteHoeHitCost = builder.comment("Durability lost per hit (Default: 1)")
                .defineInRange("hitCost", 1, 0, 10000);
        KyaniteHoeHarvestLevel = builder.comment("Harvest level of Kyanite Hoe (Default: 4)")
                .defineInRange("harvestLevel", 4, 0, 1000);
        KyaniteHoeEnchantability = builder.comment("Enchantability of Kyanite Hoe (Default: 70)")
                .defineInRange("enchantability", 70, 0, 1000);
        KyaniteHoeEfficiency = builder.comment("Efficiency of Kyanite Hoe (Default: 11)")
                .defineInRange("efficiency", 1, 0, 1000);
        KyaniteHoeAttackSpeed = builder.comment("Attack speed of Kyanite Hoe (Default: 1)")
                .defineInRange("attackSpeed", 1, 0, 1000);
        builder.pop();


        // Kyanite Shovel
        builder.push("Kyanite Shovel");
        KyaniteShovelDamage = builder.comment("Damage dealt by Kyanite Shovel (Default: 30)")
                .defineInRange("damage", 10, 0, 1000);
        KyaniteShovelDurability = builder.comment("Durability of Kyanite Shovel (Default: 2000)")
                .defineInRange("durability", 2000, 0, 10000);
        KyaniteShovelHitCost = builder.comment("Durability lost per hit (Default: 1)")
                .defineInRange("hitCost", 1, 0, 10000);
        KyaniteShovelHarvestLevel = builder.comment("Harvest level of Kyanite Shovel (Default: 4)")
                .defineInRange("harvestLevel", 4, 0, 1000);
        KyaniteShovelEnchantability = builder.comment("Enchantability of Kyanite Shovel (Default: 70)")
                .defineInRange("enchantability", 70, 0, 1000);
        KyaniteShovelEfficiency = builder.comment("Efficiency of Kyanite Shovel (Default: 11)")
                .defineInRange("efficiency", 1, 0, 1000);
        KyaniteShovelAttackSpeed = builder.comment("Attack speed of Kyanite Shovel (Default: 1)")
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

        builder.pop(); // Coarse Amethyst Armor End


    }


    // Mantis Claw Getters
    public static int getMantisClawDamage() { return mantisClawDamage != null ? mantisClawDamage.get() : 14; }
    public static int getMantisClawDurability() { return mantisClawDurability != null ? mantisClawDurability.get() : 800; }
    public static int getMantisClawHitCost() { return mantisClawHitCost != null ? mantisClawHitCost.get() : 1; }
    public static int getMantisClawHarvestLevel() { return mantisClawHarvestLevel != null ? mantisClawHarvestLevel.get() : 4; }
    public static int getMantisClawEnchantability() { return mantisClawEnchantability != null ? mantisClawEnchantability.get() : 70; }
    public static float getMantisClawEfficiency() { return mantisClawEfficiency != null ? mantisClawEfficiency.get() : 11; }
    public static float getMantisClawAttackSpeed() { return mantisClawAttackSpeed != null ? mantisClawAttackSpeed.get() : 1; }


    // Kyanite Sword Getters
    public static int getKyaniteSwordDamage() { return KyaniteSwordDamage != null ? KyaniteSwordDamage.get() : 30; }
    public static int getKyaniteSwordDurability() { return KyaniteSwordDurability != null ? KyaniteSwordDurability.get() : 2000; }
    public static int getKyaniteSwordHitCost() { return KyaniteSwordHitCost != null ? KyaniteSwordHitCost.get() : 1; }
    public static int getKyaniteSwordHarvestLevel() { return KyaniteSwordHarvestLevel != null ? KyaniteSwordHarvestLevel.get() : 4; }
    public static int getKyaniteSwordEnchantability() { return KyaniteSwordEnchantability != null ? KyaniteSwordEnchantability.get() : 70; }
    public static float getKyaniteSwordEfficiency() { return KyaniteSwordEfficiency != null ? KyaniteSwordEfficiency.get() : 11; }
    public static float getKyaniteSwordAttackSpeed() { return KyaniteSwordAttackSpeed != null ? KyaniteSwordAttackSpeed.get() : 1; }


    // Kyanite Pickaxe Getters
    public static int getKyanitePickaxeDamage() { return KyanitePickaxeDamage != null ? KyanitePickaxeDamage.get() : 10; }
    public static int getKyanitePickaxeDurability() { return KyanitePickaxeDurability != null ? KyanitePickaxeDurability.get() : 2000; }
    public static int getKyanitePickaxeHitCost() { return KyanitePickaxeHitCost != null ? KyanitePickaxeHitCost.get() : 1; }
    public static int getKyanitePickaxeHarvestLevel() { return KyanitePickaxeHarvestLevel != null ? KyanitePickaxeHarvestLevel.get() : 4; }
    public static int getKyanitePickaxeEnchantability() { return KyanitePickaxeEnchantability != null ? KyanitePickaxeEnchantability.get() : 70; }
    public static float getKyanitePickaxeEfficiency() { return KyanitePickaxeEfficiency != null ? KyanitePickaxeEfficiency.get() : 1; }
    public static float getKyanitePickaxeAttackSpeed() { return KyanitePickaxeAttackSpeed != null ? KyanitePickaxeAttackSpeed.get() : 1; }

    
    // Kyanite Axe Getters
    public static int getKyaniteAxeDamage() { return KyaniteAxeDamage != null ? KyaniteAxeDamage.get() : 10; }
    public static int getKyaniteAxeDurability() { return KyaniteAxeDurability != null ? KyaniteAxeDurability.get() : 2000; }
    public static int getKyaniteAxeHitCost() { return KyaniteAxeHitCost != null ? KyaniteAxeHitCost.get() : 1; }
    public static int getKyaniteAxeHarvestLevel() { return KyaniteAxeHarvestLevel != null ? KyaniteAxeHarvestLevel.get() : 4; }
    public static int getKyaniteAxeEnchantability() { return KyaniteAxeEnchantability != null ? KyaniteAxeEnchantability.get() : 70; }
    public static float getKyaniteAxeEfficiency() { return KyaniteAxeEfficiency != null ? KyaniteAxeEfficiency.get() : 1; }
    public static float getKyaniteAxeAttackSpeed() { return KyaniteAxeAttackSpeed != null ? KyaniteAxeAttackSpeed.get() : 1; }


    // Kyanite Hoe Getters
    public static int getKyaniteHoeDamage() { return KyaniteHoeDamage != null ? KyaniteHoeDamage.get() : 10; }
    public static int getKyaniteHoeDurability() { return KyaniteHoeDurability != null ? KyaniteHoeDurability.get() : 2000; }
    public static int getKyaniteHoeHitCost() { return KyaniteHoeHitCost != null ? KyaniteHoeHitCost.get() : 1; }
    public static int getKyaniteHoeHarvestLevel() { return KyaniteHoeHarvestLevel != null ? KyaniteHoeHarvestLevel.get() : 4; }
    public static int getKyaniteHoeEnchantability() { return KyaniteHoeEnchantability != null ? KyaniteHoeEnchantability.get() : 70; }
    public static float getKyaniteHoeEfficiency() { return KyaniteHoeEfficiency != null ? KyaniteHoeEfficiency.get() : 1; }
    public static float getKyaniteHoeAttackSpeed() { return KyaniteHoeAttackSpeed != null ? KyaniteHoeAttackSpeed.get() : 1; }


    // Kyanite Shovel Getters
    public static int getKyaniteShovelDamage() { return KyaniteShovelDamage != null ? KyaniteShovelDamage.get() : 10; }
    public static int getKyaniteShovelDurability() { return KyaniteShovelDurability != null ? KyaniteShovelDurability.get() : 2000; }
    public static int getKyaniteShovelHitCost() { return KyaniteShovelHitCost != null ? KyaniteShovelHitCost.get() : 1; }
    public static int getKyaniteShovelHarvestLevel() { return KyaniteShovelHarvestLevel != null ? KyaniteShovelHarvestLevel.get() : 4; }
    public static int getKyaniteShovelEnchantability() { return KyaniteShovelEnchantability != null ? KyaniteShovelEnchantability.get() : 70; }
    public static float getKyaniteShovelEfficiency() { return KyaniteShovelEfficiency != null ? KyaniteShovelEfficiency.get() : 1; }
    public static float getKyaniteShovelAttackSpeed() { return KyaniteShovelAttackSpeed != null ? KyaniteShovelAttackSpeed.get() : 1; }





    // Coarse Amethyst Helmet Getters
    public static int getCoarseAmethystHelmetDurability() { return coarseAmethystHelmetDurability != null ? coarseAmethystHelmetDurability.get() : 1300; }
    public static int getCoarseAmethystHelmetHitCost() { return coarseAmethystHelmetHitCost != null ? coarseAmethystHelmetHitCost.get() : 1; }
    public static int getCoarseAmethystHelmetEnchantability() { return coarseAmethystHelmetEnchantability != null ? coarseAmethystHelmetEnchantability.get() : 40; }
    public static double getCoarseAmethystHelmetToughness() { return coarseAmethystHelmetToughness != null ? coarseAmethystHelmetToughness.get() : 0.0; }
    public static double getCoarseAmethystHelmetKnockBackResistance() { return coarseAmethystHelmetKnockBackResistance != null ? coarseAmethystHelmetKnockBackResistance.get() : 0.0; }
    public static int getCoarseAmethystHelmetArmor() { return coarseAmethystHelmetArmor != null ? coarseAmethystHelmetArmor.get() : 23; }


    // Coarse Amethyst Chestplate Getters
    public static int getCoarseAmethystChestplateDurability() { return coarseAmethystChestplateDurability != null ? coarseAmethystChestplateDurability.get() : 1500; }
    public static int getCoarseAmethystChestplateHitCost() { return coarseAmethystChestplateHitCost != null ? coarseAmethystChestplateHitCost.get() : 1; }
    public static int getCoarseAmethystChestplateEnchantability() { return coarseAmethystChestplateEnchantability != null ? coarseAmethystChestplateEnchantability.get() : 40; }
    public static double getCoarseAmethystChestplateToughness() { return coarseAmethystChestplateToughness != null ? coarseAmethystChestplateToughness.get() : 0.0; }
    public static double getCoarseAmethystChestplateKnockBackResistance() { return coarseAmethystChestplateKnockBackResistance != null ? coarseAmethystChestplateKnockBackResistance.get() : 0.0; }
    public static int getCoarseAmethystChestplateArmor() { return coarseAmethystChestplateArmor != null ? coarseAmethystChestplateArmor.get() : 23; }


    // Coarse Amethyst Leggings Getters
    public static int getCoarseAmethystLeggingsDurability() { return coarseAmethystLeggingsDurability != null ? coarseAmethystLeggingsDurability.get() : 1600; }
    public static int getCoarseAmethystLeggingsHitCost() { return coarseAmethystLeggingsHitCost != null ? coarseAmethystLeggingsHitCost.get() : 1; }
    public static int getCoarseAmethystLeggingsEnchantability() { return coarseAmethystLeggingsEnchantability != null ? coarseAmethystLeggingsEnchantability.get() : 40; }
    public static double getCoarseAmethystLeggingsToughness() { return coarseAmethystLeggingsToughness != null ? coarseAmethystLeggingsToughness.get() : 0.0; }
    public static double getCoarseAmethystLeggingsKnockBackResistance() { return coarseAmethystLeggingsKnockBackResistance != null ? coarseAmethystLeggingsKnockBackResistance.get() : 0.0; }
    public static int getCoarseAmethystLeggingsArmor() { return coarseAmethystLeggingsArmor != null ? coarseAmethystLeggingsArmor.get() : 23; }


    // Coarse Amethyst Boots Getters
    public static int getCoarseAmethystBootsDurability() { return coarseAmethystBootsDurability != null ? coarseAmethystBootsDurability.get() : 1100; }
    public static int getCoarseAmethystBootsHitCost() { return coarseAmethystBootsHitCost != null ? coarseAmethystBootsHitCost.get() : 1; }
    public static int getCoarseAmethystBootsEnchantability() { return coarseAmethystBootsEnchantability != null ? coarseAmethystBootsEnchantability.get() : 40; }
    public static double getCoarseAmethystBootsToughness() { return coarseAmethystBootsToughness != null ? coarseAmethystBootsToughness.get() : 0.0; }
    public static double getCoarseAmethystBootsKnockBackResistance() { return coarseAmethystBootsKnockBackResistance != null ? coarseAmethystBootsKnockBackResistance.get() : 0.0; }
    public static int getCoarseAmethystBootsArmor() { return coarseAmethystBootsArmor != null ? coarseAmethystBootsArmor.get() : 23; }


}
