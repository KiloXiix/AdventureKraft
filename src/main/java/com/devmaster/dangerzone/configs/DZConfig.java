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
    private static ForgeConfigSpec.IntValue coarseAmethystHelmetToughness;
    private static ForgeConfigSpec.IntValue coarseAmethystHelmetKnockBackResistance;
    private static ForgeConfigSpec.IntValue coarseAmethystHelmetArmor;

    private static ForgeConfigSpec.IntValue coarseAmethystChestplateDurability;
    private static ForgeConfigSpec.IntValue coarseAmethystChestplateHitCost;
    private static ForgeConfigSpec.IntValue coarseAmethystChestplateEnchantability;
    private static ForgeConfigSpec.IntValue coarseAmethystChestplateToughness;
    private static ForgeConfigSpec.IntValue coarseAmethystChestplateKnockBackResistance;
    private static ForgeConfigSpec.IntValue coarseAmethystChestplateArmor;

    private static ForgeConfigSpec.IntValue coarseAmethystLeggingsDurability;
    private static ForgeConfigSpec.IntValue coarseAmethystLeggingsHitCost;
    private static ForgeConfigSpec.IntValue coarseAmethystLeggingsEnchantability;
    private static ForgeConfigSpec.IntValue coarseAmethystLeggingsToughness;
    private static ForgeConfigSpec.IntValue coarseAmethystLeggingsKnockBackResistance;
    private static ForgeConfigSpec.IntValue coarseAmethystLeggingsArmor;

    private static ForgeConfigSpec.IntValue coarseAmethystBootsDurability;
    private static ForgeConfigSpec.IntValue coarseAmethystBootsHitCost;
    private static ForgeConfigSpec.IntValue coarseAmethystBootsEnchantability;
    private static ForgeConfigSpec.IntValue coarseAmethystBootsToughness;
    private static ForgeConfigSpec.IntValue coarseAmethystBootsKnockBackResistance;
    private static ForgeConfigSpec.IntValue coarseAmethystBootsArmor;


    // Lapis Armor Attributes
    private static ForgeConfigSpec.IntValue LapisHelmetDurability;
    private static ForgeConfigSpec.IntValue LapisHelmetHitCost;
    private static ForgeConfigSpec.IntValue LapisHelmetEnchantability;
    private static ForgeConfigSpec.IntValue LapisHelmetToughness;
    private static ForgeConfigSpec.IntValue LapisHelmetKnockBackResistance;
    private static ForgeConfigSpec.IntValue LapisHelmetArmor;

    private static ForgeConfigSpec.IntValue LapisChestplateDurability;
    private static ForgeConfigSpec.IntValue LapisChestplateHitCost;
    private static ForgeConfigSpec.IntValue LapisChestplateEnchantability;
    private static ForgeConfigSpec.IntValue LapisChestplateToughness;
    private static ForgeConfigSpec.IntValue LapisChestplateKnockBackResistance;
    private static ForgeConfigSpec.IntValue LapisChestplateArmor;

    private static ForgeConfigSpec.IntValue LapisLeggingsDurability;
    private static ForgeConfigSpec.IntValue LapisLeggingsHitCost;
    private static ForgeConfigSpec.IntValue LapisLeggingsEnchantability;
    private static ForgeConfigSpec.IntValue LapisLeggingsToughness;
    private static ForgeConfigSpec.IntValue LapisLeggingsKnockBackResistance;
    private static ForgeConfigSpec.IntValue LapisLeggingsArmor;

    private static ForgeConfigSpec.IntValue LapisBootsDurability;
    private static ForgeConfigSpec.IntValue LapisBootsHitCost;
    private static ForgeConfigSpec.IntValue LapisBootsEnchantability;
    private static ForgeConfigSpec.IntValue LapisBootsToughness;
    private static ForgeConfigSpec.IntValue LapisBootsKnockBackResistance;
    private static ForgeConfigSpec.IntValue LapisBootsArmor;


    // Lava Crystal Armor Attributes
    private static ForgeConfigSpec.IntValue LavaCrystalHelmetDurability;
    private static ForgeConfigSpec.IntValue LavaCrystalHelmetHitCost;
    private static ForgeConfigSpec.IntValue LavaCrystalHelmetEnchantability;
    private static ForgeConfigSpec.IntValue LavaCrystalHelmetToughness;
    private static ForgeConfigSpec.IntValue LavaCrystalHelmetKnockBackResistance;
    private static ForgeConfigSpec.IntValue LavaCrystalHelmetArmor;

    private static ForgeConfigSpec.IntValue LavaCrystalChestplateDurability;
    private static ForgeConfigSpec.IntValue LavaCrystalChestplateHitCost;
    private static ForgeConfigSpec.IntValue LavaCrystalChestplateEnchantability;
    private static ForgeConfigSpec.IntValue LavaCrystalChestplateToughness;
    private static ForgeConfigSpec.IntValue LavaCrystalChestplateKnockBackResistance;
    private static ForgeConfigSpec.IntValue LavaCrystalChestplateArmor;

    private static ForgeConfigSpec.IntValue LavaCrystalLeggingsDurability;
    private static ForgeConfigSpec.IntValue LavaCrystalLeggingsHitCost;
    private static ForgeConfigSpec.IntValue LavaCrystalLeggingsEnchantability;
    private static ForgeConfigSpec.IntValue LavaCrystalLeggingsToughness;
    private static ForgeConfigSpec.IntValue LavaCrystalLeggingsKnockBackResistance;
    private static ForgeConfigSpec.IntValue LavaCrystalLeggingsArmor;

    private static ForgeConfigSpec.IntValue LavaCrystalBootsDurability;
    private static ForgeConfigSpec.IntValue LavaCrystalBootsHitCost;
    private static ForgeConfigSpec.IntValue LavaCrystalBootsEnchantability;
    private static ForgeConfigSpec.IntValue LavaCrystalBootsToughness;
    private static ForgeConfigSpec.IntValue LavaCrystalBootsKnockBackResistance;
    private static ForgeConfigSpec.IntValue LavaCrystalBootsArmor;


    // Lava Crystal Armor Attributes
    private static ForgeConfigSpec.IntValue PinkHelmetDurability;
    private static ForgeConfigSpec.IntValue PinkHelmetHitCost;
    private static ForgeConfigSpec.IntValue PinkHelmetEnchantability;
    private static ForgeConfigSpec.IntValue PinkHelmetToughness;
    private static ForgeConfigSpec.IntValue PinkHelmetKnockBackResistance;
    private static ForgeConfigSpec.IntValue PinkHelmetArmor;

    private static ForgeConfigSpec.IntValue PinkChestplateDurability;
    private static ForgeConfigSpec.IntValue PinkChestplateHitCost;
    private static ForgeConfigSpec.IntValue PinkChestplateEnchantability;
    private static ForgeConfigSpec.IntValue PinkChestplateToughness;
    private static ForgeConfigSpec.IntValue PinkChestplateKnockBackResistance;
    private static ForgeConfigSpec.IntValue PinkChestplateArmor;

    private static ForgeConfigSpec.IntValue PinkLeggingsDurability;
    private static ForgeConfigSpec.IntValue PinkLeggingsHitCost;
    private static ForgeConfigSpec.IntValue PinkLeggingsEnchantability;
    private static ForgeConfigSpec.IntValue PinkLeggingsToughness;
    private static ForgeConfigSpec.IntValue PinkLeggingsKnockBackResistance;
    private static ForgeConfigSpec.IntValue PinkLeggingsArmor;

    private static ForgeConfigSpec.IntValue PinkBootsDurability;
    private static ForgeConfigSpec.IntValue PinkBootsHitCost;
    private static ForgeConfigSpec.IntValue PinkBootsEnchantability;
    private static ForgeConfigSpec.IntValue PinkBootsToughness;
    private static ForgeConfigSpec.IntValue PinkBootsKnockBackResistance;
    private static ForgeConfigSpec.IntValue PinkBootsArmor;





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



    //Lapis Sword
    private static ForgeConfigSpec.IntValue LapisSwordDurability;
    private static ForgeConfigSpec.IntValue LapisSwordHitCost;
    private static ForgeConfigSpec.IntValue LapisSwordEnchantability;
    private static ForgeConfigSpec.IntValue LapisSwordDamage;
    private static ForgeConfigSpec.IntValue LapisSwordHarvestLevel;
    private static ForgeConfigSpec.IntValue LapisSwordEfficiency;
    private static ForgeConfigSpec.IntValue LapisSwordAttackSpeed;

    //Lapis Pickaxe
    private static ForgeConfigSpec.IntValue LapisPickaxeDurability;
    private static ForgeConfigSpec.IntValue LapisPickaxeHitCost;
    private static ForgeConfigSpec.IntValue LapisPickaxeEnchantability;
    private static ForgeConfigSpec.IntValue LapisPickaxeDamage;
    private static ForgeConfigSpec.IntValue LapisPickaxeHarvestLevel;
    private static ForgeConfigSpec.IntValue LapisPickaxeEfficiency;
    private static ForgeConfigSpec.IntValue LapisPickaxeAttackSpeed;

    //Lapis Axe
    private static ForgeConfigSpec.IntValue LapisAxeDurability;
    private static ForgeConfigSpec.IntValue LapisAxeHitCost;
    private static ForgeConfigSpec.IntValue LapisAxeEnchantability;
    private static ForgeConfigSpec.IntValue LapisAxeDamage;
    private static ForgeConfigSpec.IntValue LapisAxeHarvestLevel;
    private static ForgeConfigSpec.IntValue LapisAxeEfficiency;
    private static ForgeConfigSpec.IntValue LapisAxeAttackSpeed;

    //Lapis Hoe
    private static ForgeConfigSpec.IntValue LapisHoeDurability;
    private static ForgeConfigSpec.IntValue LapisHoeHitCost;
    private static ForgeConfigSpec.IntValue LapisHoeEnchantability;
    private static ForgeConfigSpec.IntValue LapisHoeDamage;
    private static ForgeConfigSpec.IntValue LapisHoeHarvestLevel;
    private static ForgeConfigSpec.IntValue LapisHoeEfficiency;
    private static ForgeConfigSpec.IntValue LapisHoeAttackSpeed;

    //Lapis Shovel
    private static ForgeConfigSpec.IntValue LapisShovelDurability;
    private static ForgeConfigSpec.IntValue LapisShovelHitCost;
    private static ForgeConfigSpec.IntValue LapisShovelEnchantability;
    private static ForgeConfigSpec.IntValue LapisShovelDamage;
    private static ForgeConfigSpec.IntValue LapisShovelHarvestLevel;
    private static ForgeConfigSpec.IntValue LapisShovelEfficiency;
    private static ForgeConfigSpec.IntValue LapisShovelAttackSpeed;




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



        // Lapis Sword
        builder.push("Lapis Sword");
        LapisSwordDamage = builder.comment("Damage dealt by Lapis Sword (Default: 30)")
                .defineInRange("damage", 30, 0, 1000);
        LapisSwordDurability = builder.comment("Durability of Lapis Sword (Default: 2000)")
                .defineInRange("durability", 2000, 0, 10000);
        LapisSwordHitCost = builder.comment("Durability lost per hit (Default: 1)")
                .defineInRange("hitCost", 1, 0, 10000);
        LapisSwordHarvestLevel = builder.comment("Harvest level of Lapis Sword (Default: 4)")
                .defineInRange("harvestLevel", 4, 0, 1000);
        LapisSwordEnchantability = builder.comment("Enchantability of Lapis Sword (Default: 70)")
                .defineInRange("enchantability", 70, 0, 1000);
        LapisSwordEfficiency = builder.comment("Efficiency of Lapis Sword (Default: 11)")
                .defineInRange("efficiency", 11, 0, 1000);
        LapisSwordAttackSpeed = builder.comment("Attack speed of Lapis Sword (Default: 1)")
                .defineInRange("attackSpeed", 1, 0, 1000);
        builder.pop();


        // Lapis Pickaxe
        builder.push("Lapis Pickaxe");
        LapisPickaxeDamage = builder.comment("Damage dealt by Lapis Pickaxe (Default: 30)")
                .defineInRange("damage", 10, 0, 1000);
        LapisPickaxeDurability = builder.comment("Durability of Lapis Pickaxe (Default: 2000)")
                .defineInRange("durability", 2000, 0, 10000);
        LapisPickaxeHitCost = builder.comment("Durability lost per hit (Default: 1)")
                .defineInRange("hitCost", 1, 0, 10000);
        LapisPickaxeHarvestLevel = builder.comment("Harvest level of Lapis Pickaxe (Default: 4)")
                .defineInRange("harvestLevel", 4, 0, 1000);
        LapisPickaxeEnchantability = builder.comment("Enchantability of Lapis Pickaxe (Default: 70)")
                .defineInRange("enchantability", 70, 0, 1000);
        LapisPickaxeEfficiency = builder.comment("Efficiency of Lapis Pickaxe (Default: 11)")
                .defineInRange("efficiency", 1, 0, 1000);
        LapisPickaxeAttackSpeed = builder.comment("Attack speed of Lapis Pickaxe (Default: 1)")
                .defineInRange("attackSpeed", 1, 0, 1000);
        builder.pop();


        // Lapis Axe
        builder.push("Lapis Axe");
        LapisAxeDamage = builder.comment("Damage dealt by Lapis Axe (Default: 30)")
                .defineInRange("damage", 10, 0, 1000);
        LapisAxeDurability = builder.comment("Durability of Lapis Axe (Default: 2000)")
                .defineInRange("durability", 2000, 0, 10000);
        LapisAxeHitCost = builder.comment("Durability lost per hit (Default: 1)")
                .defineInRange("hitCost", 1, 0, 10000);
        LapisAxeHarvestLevel = builder.comment("Harvest level of Lapis Axe (Default: 4)")
                .defineInRange("harvestLevel", 4, 0, 1000);
        LapisAxeEnchantability = builder.comment("Enchantability of Lapis Axe (Default: 70)")
                .defineInRange("enchantability", 70, 0, 1000);
        LapisAxeEfficiency = builder.comment("Efficiency of Lapis Axe (Default: 11)")
                .defineInRange("efficiency", 1, 0, 1000);
        LapisAxeAttackSpeed = builder.comment("Attack speed of Lapis Axe (Default: 1)")
                .defineInRange("attackSpeed", 1, 0, 1000);
        builder.pop();


        // Lapis Hoe
        builder.push("Lapis Hoe");
        LapisHoeDamage = builder.comment("Damage dealt by Lapis Hoe (Default: 30)")
                .defineInRange("damage", 10, 0, 1000);
        LapisHoeDurability = builder.comment("Durability of Lapis Hoe (Default: 2000)")
                .defineInRange("durability", 2000, 0, 10000);
        LapisHoeHitCost = builder.comment("Durability lost per hit (Default: 1)")
                .defineInRange("hitCost", 1, 0, 10000);
        LapisHoeHarvestLevel = builder.comment("Harvest level of Lapis Hoe (Default: 4)")
                .defineInRange("harvestLevel", 4, 0, 1000);
        LapisHoeEnchantability = builder.comment("Enchantability of Lapis Hoe (Default: 70)")
                .defineInRange("enchantability", 70, 0, 1000);
        LapisHoeEfficiency = builder.comment("Efficiency of Lapis Hoe (Default: 11)")
                .defineInRange("efficiency", 1, 0, 1000);
        LapisHoeAttackSpeed = builder.comment("Attack speed of Lapis Hoe (Default: 1)")
                .defineInRange("attackSpeed", 1, 0, 1000);
        builder.pop();


        // Lapis Shovel
        builder.push("Lapis Shovel");
        LapisShovelDamage = builder.comment("Damage dealt by Lapis Shovel (Default: 30)")
                .defineInRange("damage", 10, 0, 1000);
        LapisShovelDurability = builder.comment("Durability of Lapis Shovel (Default: 2000)")
                .defineInRange("durability", 2000, 0, 10000);
        LapisShovelHitCost = builder.comment("Durability lost per hit (Default: 1)")
                .defineInRange("hitCost", 1, 0, 10000);
        LapisShovelHarvestLevel = builder.comment("Harvest level of Lapis Shovel (Default: 4)")
                .defineInRange("harvestLevel", 4, 0, 1000);
        LapisShovelEnchantability = builder.comment("Enchantability of Lapis Shovel (Default: 70)")
                .defineInRange("enchantability", 70, 0, 1000);
        LapisShovelEfficiency = builder.comment("Efficiency of Lapis Shovel (Default: 11)")
                .defineInRange("efficiency", 1, 0, 1000);
        LapisShovelAttackSpeed = builder.comment("Attack speed of Lapis Shovel (Default: 1)")
                .defineInRange("attackSpeed", 1, 0, 1000);
        builder.pop();


        // === Armor ===

        builder.push("Armor Sets");

        //Coarse Amethyst Armor Set
        builder.comment("Coarse Amethyst Set Attributes");
        coarseAmethystHelmetDurability = builder.comment("Coarse Amethyst Helmet Durability").defineInRange("coarseAmethystHelmetDurability", 1300, 0, 10000);
        coarseAmethystHelmetHitCost = builder.comment("How much durability a Coarse Amethyst helmet loses when a entity hits").defineInRange("coarseAmethystHelmetHitCost", 1, 0, 1000);
        coarseAmethystHelmetArmor = builder.comment("How much armor the Coarse Amethyst Helmet Has").defineInRange("coarseAmethystHelmetArmor", 23, 0, 1000);
        coarseAmethystHelmetEnchantability = builder.comment("Coarse Amethyst Helmet Enchantability").defineInRange("coarseAmethystHelmetEnchantability", 40, 0, 1000);
        coarseAmethystHelmetToughness = builder.comment("Coarse Amethyst Helmet Toughness").defineInRange("coarseAmethystHelmetToughness", 0, 0, 1000);
        coarseAmethystHelmetKnockBackResistance = builder.comment("Coarse Amethyst Helmet Knockback Resistance").defineInRange("coarseAmethystHelmetKnockBackResistance", 0, 0, 1000);

        coarseAmethystChestplateArmor = builder.comment("How much armor the Coarse Amethyst Chestplate has").defineInRange("coarseAmethystChestplateArmor", 23, 0, 1000);
        coarseAmethystChestplateEnchantability = builder.comment("Coarse Amethyst Chestplate Enchantability").defineInRange("coarseAmethystChestplateEnchantability", 40, 0, 1000);
        coarseAmethystChestplateToughness = builder.comment("Coarse Amethyst Boots Toughness").defineInRange("coarseAmethystChestplateToughness", 0, 0, 1000);
        coarseAmethystChestplateKnockBackResistance = builder.comment("Coarse Amethyst Chestplate  Knockback Resistance").defineInRange("coarseAmethystChestplateKnockBackResistance", 0, 0, 1000);
        coarseAmethystChestplateDurability = builder.comment("Coarse Amethyst Chestplate Durability").defineInRange("coarseAmethystChestplateDurability", 1500, 0, 10000);
        coarseAmethystChestplateHitCost = builder.comment("How much durability a Coarse Amethyst chestplate loses when a entity hits").defineInRange("coarseAmethystChestplateHitCost", 1, 0, 1000);

        coarseAmethystLeggingsArmor = builder.comment("How much armor the Coarse Amethyst Leggings have").defineInRange("coarseAmethystLeggingsArmor", 23, 0, 1000);
        coarseAmethystLeggingsDurability = builder.comment("Coarse Amethyst Leggings Durability").defineInRange("coarseAmethystLeggingsDurability", 1600, 0, 10000);
        coarseAmethystLeggingsHitCost = builder.comment("How much durability the Coarse Amethyst leggings lose when a entity hits").defineInRange("coarseAmethystLeggingsHitCost", 1, 0, 1000);
        coarseAmethystLeggingsEnchantability = builder.comment("Coarse Amethyst Leggings Enchantability").defineInRange("coarseAmethystLeggingsEnchantability", 40, 0, 1000);
        coarseAmethystLeggingsToughness = builder.comment("Coarse Amethyst Leggings Toughness").defineInRange("coarseAmethystLeggingsToughness", 0, 0, 1000);
        coarseAmethystLeggingsKnockBackResistance = builder.comment("Coarse Amethyst Leggings Knockback Resistance").defineInRange("coarseAmethystLeggingsKnockBackResistance", 0, 0, 1000);

        coarseAmethystBootsDurability = builder.comment("Coarse Amethyst Boots Durability").defineInRange("coarseAmethystBootsDurability", 1100, 0, 10000);
        coarseAmethystBootsHitCost = builder.comment("How much durability the Coarse Amethyst boots lose when a entity hits").defineInRange("coarseAmethystBootsHitCost", 1, 0, 1000);
        coarseAmethystBootsArmor = builder.comment("How much armor the Coarse Amethyst boots have").defineInRange("coarseAmethystBootsArmor", 23, 0, 1000);
        coarseAmethystBootsEnchantability = builder.comment("Coarse Amethyst Boots Enchantability").defineInRange("coarseAmethystBootsEnchantability", 40, 0, 1000);
        coarseAmethystBootsToughness = builder.comment("Coarse Amethyst Boots Toughness").defineInRange("coarseAmethystBootsToughness", 0, 0, 1000);
        coarseAmethystBootsKnockBackResistance = builder.comment("Coarse Amethyst Boots Knockback Resistance").defineInRange("coarseAmethystBootsKnockBackResistance", 0, 0, 1000);



        // Lapis Armor Set
        LapisHelmetDurability = builder.comment("Lapis Helmet Durability").defineInRange("LapisHelmetDurability", 1170, 0, 10000);
        LapisHelmetHitCost = builder.comment("How much durability the Lapis Helmet loses when an entity hit").defineInRange("LapisHelmetHitCost", 1, 0, 10000);
        LapisHelmetArmor = builder.comment("How much armor the Lapis Helmet has").defineInRange("LapisHelmetArmor", 3, 0, 1000);
        LapisHelmetEnchantability = builder.comment("Lapis Helmet Enchantability").defineInRange("LapisHelmetEnchantability", 60, 0, 1000);
        LapisHelmetToughness = builder.comment("Lapis Helmet Toughness").defineInRange("LapisHelmetToughness", 0, 0, 1000);
        LapisHelmetKnockBackResistance = builder.comment("Lapis Helmet Knockback Resistance").defineInRange("LapisHelmetKnockBackResistance", 0, 0, 1000);
        
        LapisChestplateDurability = builder.comment("Lapis Chestplate Durability").defineInRange("LapisChestplateDurability", 1350, 0, 10000);
        LapisChestplateHitCost = builder.comment("How much durability the Lapis chestplate loses when an entity is hit").defineInRange("LapisChestplateHitCost", 1, 0, 10000);
        LapisChestplateArmor = builder.comment("How much armor the Lapis Chestplate has").defineInRange("LapisChestplateArmor", 3, 0, 1000);
        LapisChestplateEnchantability = builder.comment("Lapis Chestplate Enchantability").defineInRange("LapisChestplateEnchantability", 60, 0, 1000);
        LapisChestplateToughness = builder.comment("Lapis Chestplate Toughness").defineInRange("LapisChestplateToughness", 0, 0, 1000);
        LapisChestplateKnockBackResistance = builder.comment("Lapis Chestplate Knockback Resistance").defineInRange("LapisChestplateKnockBackResistance", 0, 0, 1000);
        
        LapisLeggingsDurability = builder.comment("Lapis Leggings Durability").defineInRange("LapisLeggingsDurability", 1440, 100, 10000);
        LapisLeggingsHitCost = builder.comment("How much durability the Lapis leggings loses when an entity is hit").defineInRange("LapisLeggingsHitCost", 1, 0, 10000);
        LapisLeggingsArmor = builder.comment("How much armor the Lapis Leggings has").defineInRange("LapisLeggingsArmor", 3, 0, 1000);
        LapisLeggingsEnchantability = builder.comment("Lapis Leggings Enchantability").defineInRange("LapisLeggingsEnchantability", 60, 0, 1000);
        LapisLeggingsToughness = builder.comment("Lapis Leggings Toughness").defineInRange("LapisLeggingsToughness", 0, 0, 1000);
        LapisLeggingsKnockBackResistance = builder.comment("Lapis Leggings Knockback Resistance").defineInRange("LapisLeggingsKnockBackResistance", 0, 0, 1000);
        
        LapisBootsDurability = builder.comment("Lapis Boots Durability").defineInRange("LapisBootsDurability", 990, 0, 10000);
        LapisBootsHitCost = builder.comment("How much durability the Lapis boots lose when an entity hits").defineInRange("LapisBootsHitCost", 1, 0, 10000);
        LapisBootsArmor = builder.comment("How much armor the Lapis Boots has").defineInRange("LapisBootsArmor", 3, 0, 1000);
        LapisBootsEnchantability = builder.comment("Lapis Boots Enchantability").defineInRange("LapisBootsEnchantability", 60, 0, 1000);
        LapisBootsToughness = builder.comment("Lapis Boots Toughness").defineInRange("LapisBootsToughness", 0, 0, 1000);
        LapisBootsKnockBackResistance = builder.comment("Lapis Boots Knockback Resistance").defineInRange("LapisBootsKnockBackResistance", 0, 0, 1000);


        // Lava Crystal Armor Set
        LavaCrystalHelmetDurability = builder.comment("Lava Crystal Helmet Durability").defineInRange("Lava CrystalHelmetDurability", 1170, 0, 10000);
        LavaCrystalHelmetHitCost = builder.comment("How much durability the Lava Crystal Helmet loses when an entity hit").defineInRange("Lava CrystalHelmetHitCost", 1, 0, 10000);
        LavaCrystalHelmetArmor = builder.comment("How much armor the Lava Crystal Helmet has").defineInRange("Lava CrystalHelmetArmor", 3, 0, 1000);
        LavaCrystalHelmetEnchantability = builder.comment("Lava Crystal Helmet Enchantability").defineInRange("Lava CrystalHelmetEnchantability", 60, 0, 1000);
        LavaCrystalHelmetToughness = builder.comment("Lava Crystal Helmet Toughness").defineInRange("Lava CrystalHelmetToughness", 0, 0, 1000);
        LavaCrystalHelmetKnockBackResistance = builder.comment("Lava Crystal Helmet Knockback Resistance").defineInRange("Lava CrystalHelmetKnockBackResistance", 0, 0, 1000);
        LavaCrystalChestplateDurability = builder.comment("Lava Crystal Chestplate Durability").defineInRange("Lava CrystalChestplateDurability", 1350, 0, 10000);
        LavaCrystalChestplateHitCost = builder.comment("How much durability the Lava Crystal chestplate loses when an entity is hit").defineInRange("Lava CrystalChestplateHitCost", 1, 0, 10000);
        LavaCrystalChestplateArmor = builder.comment("How much armor the Lava Crystal Chestplate has").defineInRange("Lava CrystalChestplateArmor", 3, 0, 1000);
        LavaCrystalChestplateEnchantability = builder.comment("Lava Crystal Chestplate Enchantability").defineInRange("Lava CrystalChestplateEnchantability", 60, 0, 1000);
        LavaCrystalChestplateToughness = builder.comment("Lava Crystal Chestplate Toughness").defineInRange("Lava CrystalChestplateToughness", 0, 0, 1000);
        LavaCrystalChestplateKnockBackResistance = builder.comment("Lava Crystal Chestplate Knockback Resistance").defineInRange("Lava CrystalChestplateKnockBackResistance", 0, 0, 1000);
        LavaCrystalLeggingsDurability = builder.comment("Lava Crystal Leggings Durability").defineInRange("Lava CrystalLeggingsDurability", 1440, 100, 10000);
        LavaCrystalLeggingsHitCost = builder.comment("How much durability the Lava Crystal leggings loses when an entity is hit").defineInRange("Lava CrystalLeggingsHitCost", 1, 0, 10000);
        LavaCrystalLeggingsArmor = builder.comment("How much armor the Lava Crystal Leggings has").defineInRange("Lava CrystalLeggingsArmor", 3, 0, 1000);
        LavaCrystalLeggingsEnchantability = builder.comment("Lava Crystal Leggings Enchantability").defineInRange("Lava CrystalLeggingsEnchantability", 60, 0, 1000);
        LavaCrystalLeggingsToughness = builder.comment("Lava Crystal Leggings Toughness").defineInRange("Lava CrystalLeggingsToughness", 0, 0, 1000);
        LavaCrystalLeggingsKnockBackResistance = builder.comment("Lava Crystal Leggings Knockback Resistance").defineInRange("Lava CrystalLeggingsKnockBackResistance", 0, 0, 1000);
        LavaCrystalBootsDurability = builder.comment("Lava Crystal Boots Durability").defineInRange("Lava CrystalBootsDurability", 990, 0, 10000);
        LavaCrystalBootsHitCost = builder.comment("How much durability the Lava Crystal boots lose when an entity hits").defineInRange("Lava CrystalBootsHitCost", 1, 0, 10000);
        LavaCrystalBootsArmor = builder.comment("How much armor the Lava Crystal Boots has").defineInRange("Lava CrystalBootsArmor", 3, 0, 1000);
        LavaCrystalBootsEnchantability = builder.comment("Lava Crystal Boots Enchantability").defineInRange("Lava CrystalBootsEnchantability", 60, 0, 1000);
        LavaCrystalBootsToughness = builder.comment("Lava Crystal Boots Toughness").defineInRange("Lava CrystalBootsToughness", 0, 0, 1000);
        LavaCrystalBootsKnockBackResistance = builder.comment("Lava Crystal Boots Knockback Resistance").defineInRange("Lava CrystalBootsKnockBackResistance", 0, 0, 1000);


        // Pink Armor Set
        PinkHelmetDurability = builder.comment("Pink Helmet Durability").defineInRange("PinkHelmetDurability", 1170, 0, 10000);
        PinkHelmetHitCost = builder.comment("How much durability the Pink Helmet loses when an entity hit").defineInRange("PinkHelmetHitCost", 1, 0, 10000);
        PinkHelmetArmor = builder.comment("How much armor the Pink Helmet has").defineInRange("PinkHelmetArmor", 3, 0, 1000);
        PinkHelmetEnchantability = builder.comment("Pink Helmet Enchantability").defineInRange("PinkHelmetEnchantability", 60, 0, 1000);
        PinkHelmetToughness = builder.comment("Pink Helmet Toughness").defineInRange("PinkHelmetToughness", 0, 0, 1000);
        PinkHelmetKnockBackResistance = builder.comment("Pink Helmet Knockback Resistance").defineInRange("PinkHelmetKnockBackResistance", 0, 0, 1000);
        PinkChestplateDurability = builder.comment("Pink Chestplate Durability").defineInRange("PinkChestplateDurability", 1350, 0, 10000);
        PinkChestplateHitCost = builder.comment("How much durability the Pink chestplate loses when an entity is hit").defineInRange("PinkChestplateHitCost", 1, 0, 10000);
        PinkChestplateArmor = builder.comment("How much armor the Pink Chestplate has").defineInRange("PinkChestplateArmor", 3, 0, 1000);
        PinkChestplateEnchantability = builder.comment("Pink Chestplate Enchantability").defineInRange("PinkChestplateEnchantability", 60, 0, 1000);
        PinkChestplateToughness = builder.comment("Pink Chestplate Toughness").defineInRange("PinkChestplateToughness", 0, 0, 1000);
        PinkChestplateKnockBackResistance = builder.comment("Pink Chestplate Knockback Resistance").defineInRange("PinkChestplateKnockBackResistance", 0, 0, 1000);
        PinkLeggingsDurability = builder.comment("Pink Leggings Durability").defineInRange("PinkLeggingsDurability", 1440, 100, 10000);
        PinkLeggingsHitCost = builder.comment("How much durability the Pink leggings loses when an entity is hit").defineInRange("PinkLeggingsHitCost", 1, 0, 10000);
        PinkLeggingsArmor = builder.comment("How much armor the Pink Leggings has").defineInRange("PinkLeggingsArmor", 3, 0, 1000);
        PinkLeggingsEnchantability = builder.comment("Pink Leggings Enchantability").defineInRange("PinkLeggingsEnchantability", 60, 0, 1000);
        PinkLeggingsToughness = builder.comment("Pink Leggings Toughness").defineInRange("PinkLeggingsToughness", 0, 0, 1000);
        PinkLeggingsKnockBackResistance = builder.comment("Pink Leggings Knockback Resistance").defineInRange("PinkLeggingsKnockBackResistance", 0, 0, 1000);
        PinkBootsDurability = builder.comment("Pink Boots Durability").defineInRange("PinkBootsDurability", 990, 0, 10000);
        PinkBootsHitCost = builder.comment("How much durability the Pink boots lose when an entity hits").defineInRange("PinkBootsHitCost", 1, 0, 10000);
        PinkBootsArmor = builder.comment("How much armor the Pink Boots has").defineInRange("PinkBootsArmor", 3, 0, 1000);
        PinkBootsEnchantability = builder.comment("Pink Boots Enchantability").defineInRange("PinkBootsEnchantability", 60, 0, 1000);
        PinkBootsToughness = builder.comment("Pink Boots Toughness").defineInRange("PinkBootsToughness", 0, 0, 1000);
        PinkBootsKnockBackResistance = builder.comment("Pink Boots Knockback Resistance").defineInRange("PinkBootsKnockBackResistance", 0, 0, 1000);



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



    // Lapis Sword Getters
    public static int getLapisSwordDamage() { return LapisSwordDamage != null ? LapisSwordDamage.get() : 30; }
    public static int getLapisSwordDurability() { return LapisSwordDurability != null ? LapisSwordDurability.get() : 2000; }
    public static int getLapisSwordHitCost() { return LapisSwordHitCost != null ? LapisSwordHitCost.get() : 1; }
    public static int getLapisSwordHarvestLevel() { return LapisSwordHarvestLevel != null ? LapisSwordHarvestLevel.get() : 4; }
    public static int getLapisSwordEnchantability() { return LapisSwordEnchantability != null ? LapisSwordEnchantability.get() : 70; }
    public static float getLapisSwordEfficiency() { return LapisSwordEfficiency != null ? LapisSwordEfficiency.get() : 11; }
    public static float getLapisSwordAttackSpeed() { return LapisSwordAttackSpeed != null ? LapisSwordAttackSpeed.get() : 1; }


    // Lapis Pickaxe Getters
    public static int getLapisPickaxeDamage() { return LapisPickaxeDamage != null ? LapisPickaxeDamage.get() : 10; }
    public static int getLapisPickaxeDurability() { return LapisPickaxeDurability != null ? LapisPickaxeDurability.get() : 2000; }
    public static int getLapisPickaxeHitCost() { return LapisPickaxeHitCost != null ? LapisPickaxeHitCost.get() : 1; }
    public static int getLapisPickaxeHarvestLevel() { return LapisPickaxeHarvestLevel != null ? LapisPickaxeHarvestLevel.get() : 4; }
    public static int getLapisPickaxeEnchantability() { return LapisPickaxeEnchantability != null ? LapisPickaxeEnchantability.get() : 70; }
    public static float getLapisPickaxeEfficiency() { return LapisPickaxeEfficiency != null ? LapisPickaxeEfficiency.get() : 1; }
    public static float getLapisPickaxeAttackSpeed() { return LapisPickaxeAttackSpeed != null ? LapisPickaxeAttackSpeed.get() : 1; }


    // Lapis Axe Getters
    public static int getLapisAxeDamage() { return LapisAxeDamage != null ? LapisAxeDamage.get() : 10; }
    public static int getLapisAxeDurability() { return LapisAxeDurability != null ? LapisAxeDurability.get() : 2000; }
    public static int getLapisAxeHitCost() { return LapisAxeHitCost != null ? LapisAxeHitCost.get() : 1; }
    public static int getLapisAxeHarvestLevel() { return LapisAxeHarvestLevel != null ? LapisAxeHarvestLevel.get() : 4; }
    public static int getLapisAxeEnchantability() { return LapisAxeEnchantability != null ? LapisAxeEnchantability.get() : 70; }
    public static float getLapisAxeEfficiency() { return LapisAxeEfficiency != null ? LapisAxeEfficiency.get() : 1; }
    public static float getLapisAxeAttackSpeed() { return LapisAxeAttackSpeed != null ? LapisAxeAttackSpeed.get() : 1; }


    // Lapis Hoe Getters
    public static int getLapisHoeDamage() { return LapisHoeDamage != null ? LapisHoeDamage.get() : 10; }
    public static int getLapisHoeDurability() { return LapisHoeDurability != null ? LapisHoeDurability.get() : 2000; }
    public static int getLapisHoeHitCost() { return LapisHoeHitCost != null ? LapisHoeHitCost.get() : 1; }
    public static int getLapisHoeHarvestLevel() { return LapisHoeHarvestLevel != null ? LapisHoeHarvestLevel.get() : 4; }
    public static int getLapisHoeEnchantability() { return LapisHoeEnchantability != null ? LapisHoeEnchantability.get() : 70; }
    public static float getLapisHoeEfficiency() { return LapisHoeEfficiency != null ? LapisHoeEfficiency.get() : 1; }
    public static float getLapisHoeAttackSpeed() { return LapisHoeAttackSpeed != null ? LapisHoeAttackSpeed.get() : 1; }


    // Lapis Shovel Getters
    public static int getLapisShovelDamage() { return LapisShovelDamage != null ? LapisShovelDamage.get() : 10; }
    public static int getLapisShovelDurability() { return LapisShovelDurability != null ? LapisShovelDurability.get() : 2000; }
    public static int getLapisShovelHitCost() { return LapisShovelHitCost != null ? LapisShovelHitCost.get() : 1; }
    public static int getLapisShovelHarvestLevel() { return LapisShovelHarvestLevel != null ? LapisShovelHarvestLevel.get() : 4; }
    public static int getLapisShovelEnchantability() { return LapisShovelEnchantability != null ? LapisShovelEnchantability.get() : 70; }
    public static float getLapisShovelEfficiency() { return LapisShovelEfficiency != null ? LapisShovelEfficiency.get() : 1; }
    public static float getLapisShovelAttackSpeed() { return LapisShovelAttackSpeed != null ? LapisShovelAttackSpeed.get() : 1; }



    // === Armors ===

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



    // Lapis Helmet Getters
    public static int getLapisHelmetDurability() { return LapisHelmetDurability != null ? LapisHelmetDurability.get() : 1170; }
    public static int getLapisHelmetHitCost() { return LapisHelmetHitCost != null ? LapisHelmetHitCost.get() : 1; }
    public static int getLapisHelmetEnchantability() { return LapisHelmetEnchantability != null ? LapisHelmetEnchantability.get() : 60; }
    public static double getLapisHelmetToughness() { return LapisHelmetToughness != null ? LapisHelmetToughness.get() : 0.0; }
    public static double getLapisHelmetKnockBackResistance() { return LapisHelmetKnockBackResistance != null ? LapisHelmetKnockBackResistance.get() : 0.0; }
    public static int getLapisHelmetArmor() { return LapisHelmetArmor != null ? LapisHelmetArmor.get() : 3; }


    // Lapis Chestplate Getters
    public static int getLapisChestplateDurability() { return LapisChestplateDurability != null ? LapisChestplateDurability.get() : 1350; }
    public static int getLapisChestplateHitCost() { return LapisChestplateHitCost != null ? LapisChestplateHitCost.get() : 1; }
    public static int getLapisChestplateEnchantability() { return LapisChestplateEnchantability != null ? LapisChestplateEnchantability.get() : 60; }
    public static double getLapisChestplateToughness() { return LapisChestplateToughness != null ? LapisChestplateToughness.get() : 0.0; }
    public static double getLapisChestplateKnockBackResistance() { return LapisChestplateKnockBackResistance != null ? LapisChestplateKnockBackResistance.get() : 0.0; }
    public static int getLapisChestplateArmor() { return LapisChestplateArmor != null ? LapisChestplateArmor.get() : 3; }


    // Lapis Leggings Getters
    public static int getLapisLeggingsDurability() { return LapisLeggingsDurability != null ? LapisLeggingsDurability.get() : 1440; }
    public static int getLapisLeggingsHitCost() { return LapisLeggingsHitCost != null ? LapisLeggingsHitCost.get() : 1; }
    public static int getLapisLeggingsEnchantability() { return LapisLeggingsEnchantability != null ? LapisLeggingsEnchantability.get() : 60; }
    public static double getLapisLeggingsToughness() { return LapisLeggingsToughness != null ? LapisLeggingsToughness.get() : 0.0; }
    public static double getLapisLeggingsKnockBackResistance() { return LapisLeggingsKnockBackResistance != null ? LapisLeggingsKnockBackResistance.get() : 0.0; }
    public static int getLapisLeggingsArmor() { return LapisLeggingsArmor != null ? LapisLeggingsArmor.get() : 3; }


    // Lapis Boots Getters
    public static int getLapisBootsDurability() { return LapisBootsDurability != null ? LapisBootsDurability.get() : 990; }
    public static int getLapisBootsHitCost() { return LapisBootsHitCost != null ? LapisBootsHitCost.get() : 1; }
    public static int getLapisBootsEnchantability() { return LapisBootsEnchantability != null ? LapisBootsEnchantability.get() : 60; }
    public static double getLapisBootsToughness() { return LapisBootsToughness != null ? LapisBootsToughness.get() : 0.0; }
    public static double getLapisBootsKnockBackResistance() { return LapisBootsKnockBackResistance != null ? LapisBootsKnockBackResistance.get() : 0.0; }
    public static int getLapisBootsArmor() { return LapisBootsArmor != null ? LapisBootsArmor.get() : 3; }


    // LavaCrystal Helmet Getters
    public static int getLavaCrystalHelmetDurability() { return LavaCrystalHelmetDurability != null ? LavaCrystalHelmetDurability.get() : 1170; }
    public static int getLavaCrystalHelmetHitCost() { return LavaCrystalHelmetHitCost != null ? LavaCrystalHelmetHitCost.get() : 1; }
    public static int getLavaCrystalHelmetEnchantability() { return LavaCrystalHelmetEnchantability != null ? LavaCrystalHelmetEnchantability.get() : 60; }
    public static double getLavaCrystalHelmetToughness() { return LavaCrystalHelmetToughness != null ? LavaCrystalHelmetToughness.get() : 0.0; }
    public static double getLavaCrystalHelmetKnockBackResistance() { return LavaCrystalHelmetKnockBackResistance != null ? LavaCrystalHelmetKnockBackResistance.get() : 0.0; }
    public static int getLavaCrystalHelmetArmor() { return LavaCrystalHelmetArmor != null ? LavaCrystalHelmetArmor.get() : 3; }


    // LavaCrystal Chestplate Getters
    public static int getLavaCrystalChestplateDurability() { return LavaCrystalChestplateDurability != null ? LavaCrystalChestplateDurability.get() : 1350; }
    public static int getLavaCrystalChestplateHitCost() { return LavaCrystalChestplateHitCost != null ? LavaCrystalChestplateHitCost.get() : 1; }
    public static int getLavaCrystalChestplateEnchantability() { return LavaCrystalChestplateEnchantability != null ? LavaCrystalChestplateEnchantability.get() : 60; }
    public static double getLavaCrystalChestplateToughness() { return LavaCrystalChestplateToughness != null ? LavaCrystalChestplateToughness.get() : 0.0; }
    public static double getLavaCrystalChestplateKnockBackResistance() { return LavaCrystalChestplateKnockBackResistance != null ? LavaCrystalChestplateKnockBackResistance.get() : 0.0; }
    public static int getLavaCrystalChestplateArmor() { return LavaCrystalChestplateArmor != null ? LavaCrystalChestplateArmor.get() : 3; }


    // LavaCrystal Leggings Getters
    public static int getLavaCrystalLeggingsDurability() { return LavaCrystalLeggingsDurability != null ? LavaCrystalLeggingsDurability.get() : 1440; }
    public static int getLavaCrystalLeggingsHitCost() { return LavaCrystalLeggingsHitCost != null ? LavaCrystalLeggingsHitCost.get() : 1; }
    public static int getLavaCrystalLeggingsEnchantability() { return LavaCrystalLeggingsEnchantability != null ? LavaCrystalLeggingsEnchantability.get() : 60; }
    public static double getLavaCrystalLeggingsToughness() { return LavaCrystalLeggingsToughness != null ? LavaCrystalLeggingsToughness.get() : 0.0; }
    public static double getLavaCrystalLeggingsKnockBackResistance() { return LavaCrystalLeggingsKnockBackResistance != null ? LavaCrystalLeggingsKnockBackResistance.get() : 0.0; }
    public static int getLavaCrystalLeggingsArmor() { return LavaCrystalLeggingsArmor != null ? LavaCrystalLeggingsArmor.get() : 3; }


    // LavaCrystal Boots Getters
    public static int getLavaCrystalBootsDurability() { return LavaCrystalBootsDurability != null ? LavaCrystalBootsDurability.get() : 990; }
    public static int getLavaCrystalBootsHitCost() { return LavaCrystalBootsHitCost != null ? LavaCrystalBootsHitCost.get() : 1; }
    public static int getLavaCrystalBootsEnchantability() { return LavaCrystalBootsEnchantability != null ? LavaCrystalBootsEnchantability.get() : 60; }
    public static double getLavaCrystalBootsToughness() { return LavaCrystalBootsToughness != null ? LavaCrystalBootsToughness.get() : 0.0; }
    public static double getLavaCrystalBootsKnockBackResistance() { return LavaCrystalBootsKnockBackResistance != null ? LavaCrystalBootsKnockBackResistance.get() : 0.0; }
    public static int getLavaCrystalBootsArmor() { return LavaCrystalBootsArmor != null ? LavaCrystalBootsArmor.get() : 3; }


    // Pink Helmet Getters
    public static int getPinkHelmetDurability() { return PinkHelmetDurability != null ? PinkHelmetDurability.get() : 1170; }
    public static int getPinkHelmetHitCost() { return PinkHelmetHitCost != null ? PinkHelmetHitCost.get() : 1; }
    public static int getPinkHelmetEnchantability() { return PinkHelmetEnchantability != null ? PinkHelmetEnchantability.get() : 60; }
    public static double getPinkHelmetToughness() { return PinkHelmetToughness != null ? PinkHelmetToughness.get() : 0.0; }
    public static double getPinkHelmetKnockBackResistance() { return PinkHelmetKnockBackResistance != null ? PinkHelmetKnockBackResistance.get() : 0.0; }
    public static int getPinkHelmetArmor() { return PinkHelmetArmor != null ? PinkHelmetArmor.get() : 3; }


    // Pink Chestplate Getters
    public static int getPinkChestplateDurability() { return PinkChestplateDurability != null ? PinkChestplateDurability.get() : 1350; }
    public static int getPinkChestplateHitCost() { return PinkChestplateHitCost != null ? PinkChestplateHitCost.get() : 1; }
    public static int getPinkChestplateEnchantability() { return PinkChestplateEnchantability != null ? PinkChestplateEnchantability.get() : 60; }
    public static double getPinkChestplateToughness() { return PinkChestplateToughness != null ? PinkChestplateToughness.get() : 0.0; }
    public static double getPinkChestplateKnockBackResistance() { return PinkChestplateKnockBackResistance != null ? PinkChestplateKnockBackResistance.get() : 0.0; }
    public static int getPinkChestplateArmor() { return PinkChestplateArmor != null ? PinkChestplateArmor.get() : 3; }


    // Pink Leggings Getters
    public static int getPinkLeggingsDurability() { return PinkLeggingsDurability != null ? PinkLeggingsDurability.get() : 1440; }
    public static int getPinkLeggingsHitCost() { return PinkLeggingsHitCost != null ? PinkLeggingsHitCost.get() : 1; }
    public static int getPinkLeggingsEnchantability() { return PinkLeggingsEnchantability != null ? PinkLeggingsEnchantability.get() : 60; }
    public static double getPinkLeggingsToughness() { return PinkLeggingsToughness != null ? PinkLeggingsToughness.get() : 0.0; }
    public static double getPinkLeggingsKnockBackResistance() { return PinkLeggingsKnockBackResistance != null ? PinkLeggingsKnockBackResistance.get() : 0.0; }
    public static int getPinkLeggingsArmor() { return PinkLeggingsArmor != null ? PinkLeggingsArmor.get() : 3; }


    // Pink Boots Getters
    public static int getPinkBootsDurability() { return PinkBootsDurability != null ? PinkBootsDurability.get() : 990; }
    public static int getPinkBootsHitCost() { return PinkBootsHitCost != null ? PinkBootsHitCost.get() : 1; }
    public static int getPinkBootsEnchantability() { return PinkBootsEnchantability != null ? PinkBootsEnchantability.get() : 60; }
    public static double getPinkBootsToughness() { return PinkBootsToughness != null ? PinkBootsToughness.get() : 0.0; }
    public static double getPinkBootsKnockBackResistance() { return PinkBootsKnockBackResistance != null ? PinkBootsKnockBackResistance.get() : 0.0; }
    public static int getPinkBootsArmor() { return PinkBootsArmor != null ? PinkBootsArmor.get() : 3; }


}
