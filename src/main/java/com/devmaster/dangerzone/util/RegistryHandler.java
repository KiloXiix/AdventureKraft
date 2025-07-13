package com.devmaster.dangerzone.util;

import com.devmaster.dangerzone.configs.DZConfig;
import com.devmaster.dangerzone.items.*;
import com.devmaster.dangerzone.misc.DangerZone;
import net.minecraft.core.registries.Registries;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;
import java.util.List;

public class RegistryHandler {
    // === Deferred Registers ===
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DangerZone.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DangerZone.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DangerZone.MOD_ID);

    // === Regular Items ===
    public static final RegistryObject<Item> BIORAPTOR_SCALE = ITEMS.register("bioraptor_scale", () -> new AItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)) {});
    public static final RegistryObject<Item> WATER_DRAGON_SCALE = ITEMS.register("water_dragon_scale", () -> new AItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)) {{addInfo("§bDropped by the Water Dragon.§b");}});
    public static final RegistryObject<Item> COARSE_AMETHYST = ITEMS.register("coarse_amethyst", () -> new AItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)) {{addInfo("§5 They make some pretty cool Coarse Amethyst Tools & a Coarse Amethyst Sword, you can also make Coarse Amethyst Armor §5");}});

    // === Weapon Items ===
    public static final RegistryObject<Item> MANTIS_CLAW = ITEMS.register("mantis_claw", () -> new Sword(new Item.Properties().durability(1)) {{this.addInfo("§2You killed a Mantis. This is your reward! Not only does it do a respectable amount of damage,", "§2but with every hit it sucks half a heart out of its victim... and gives it to you!");}@Override protected ConfigValues getConfigValues() {return new ConfigValues(DZConfig.getMantisClawDurability(), DZConfig.getMantisClawDamage(), DZConfig.getMantisClawEfficiency(), DZConfig.getMantisClawAttackSpeed(), DZConfig.getMantisClawHarvestLevel(), DZConfig.getMantisClawEnchantability(), DZConfig.getMantisClawHitCost());}@Override public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {stack.hurtAndBreak(getConfigValues().hitCost, attacker, entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));if (!attacker.level().isClientSide()) {target.heal(-2.0F);attacker.heal(2.0F);}return true;}@Override public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {return false;}});
    public static final RegistryObject<Item> KYANITE_AXE = ITEMS.register("kyanite_axe", () -> new Axe(createTempTier(), 0, 0f, new Item.Properties()) {@Override protected ConfigValues getConfigValues() {return new ConfigValues(DZConfig.getKyaniteAxeDurability(), DZConfig.getKyaniteAxeDamage(), DZConfig.getKyaniteAxeEfficiency(), DZConfig.getKyaniteAxeAttackSpeed(), DZConfig.getKyaniteAxeHarvestLevel(), DZConfig.getKyaniteAxeEnchantability(), DZConfig.getKyaniteAxeHitCost());}@Override public int getMaxDamage(ItemStack stack) {return getConfigValues().durability;}@Override public int getEnchantmentValue() {return getConfigValues().enchantability;}@Override public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {stack.hurtAndBreak(getConfigValues().hitCost, attacker, entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));return true;}@Override public void appendHoverText(@Nonnull ItemStack stack, @Nonnull Level world, @Nonnull List<Component> tooltip, @Nonnull TooltipFlag flag) {super.appendHoverText(stack, world, tooltip, flag);}@Override public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {return false;}});
    public static final RegistryObject<Item> KYANITE_HOE = ITEMS.register("kyanite_hoe", () -> new Hoe(createTempTier(), 0, 0f, new Item.Properties()) {@Override protected ConfigValues getConfigValues() {return new ConfigValues(DZConfig.getKyaniteHoeDurability(), DZConfig.getKyaniteHoeDamage(), DZConfig.getKyaniteHoeEfficiency(), DZConfig.getKyaniteHoeAttackSpeed(), DZConfig.getKyaniteHoeHarvestLevel(), DZConfig.getKyaniteHoeEnchantability(), DZConfig.getKyaniteHoeHitCost());}@Override public int getMaxDamage(ItemStack stack) {return getConfigValues().durability;}@Override public int getEnchantmentValue() {return getConfigValues().enchantability;}@Override public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {stack.hurtAndBreak(getConfigValues().hitCost, attacker, entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));return true;}@Override public void appendHoverText(@Nonnull ItemStack stack, @Nonnull Level world, @Nonnull List<Component> tooltip, @Nonnull TooltipFlag flag) {super.appendHoverText(stack, world, tooltip, flag);}@Override public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {return false;}});
    public static final RegistryObject<Item> KYANITE_PICKAXE = ITEMS.register("kyanite_pickaxe", () -> new Pickaxe(createTempTier(), 0, 0f, new Item.Properties()) {@Override protected ConfigValues getConfigValues() {return new ConfigValues(DZConfig.getKyanitePickaxeDurability(), DZConfig.getKyanitePickaxeDamage(), DZConfig.getKyanitePickaxeEfficiency(), DZConfig.getKyanitePickaxeAttackSpeed(), DZConfig.getKyanitePickaxeHarvestLevel(), DZConfig.getKyanitePickaxeEnchantability(), DZConfig.getKyanitePickaxeHitCost());}@Override public int getMaxDamage(ItemStack stack) {return getConfigValues().durability;}@Override public int getEnchantmentValue() {return getConfigValues().enchantability;}@Override public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {stack.hurtAndBreak(getConfigValues().hitCost, attacker, entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));return true;}@Override public void appendHoverText(@Nonnull ItemStack stack, @Nonnull Level world, @Nonnull List<Component> tooltip, @Nonnull TooltipFlag flag) {super.appendHoverText(stack, world, tooltip, flag);}@Override public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {return false;}});
    public static final RegistryObject<Item> KYANITE_SHOVEL = ITEMS.register("kyanite_shovel", () -> new Shovel(createTempTier(), 0, 0f, new Item.Properties()) {@Override protected ConfigValues getConfigValues() {return new ConfigValues(DZConfig.getKyaniteShovelDurability(), DZConfig.getKyaniteShovelDamage(), DZConfig.getKyaniteShovelEfficiency(), DZConfig.getKyaniteShovelAttackSpeed(), DZConfig.getKyaniteShovelHarvestLevel(), DZConfig.getKyaniteShovelEnchantability(), DZConfig.getKyaniteShovelHitCost());}@Override public int getMaxDamage(ItemStack stack) {return getConfigValues().durability;}@Override public int getEnchantmentValue() {return getConfigValues().enchantability;}@Override public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {stack.hurtAndBreak(getConfigValues().hitCost, attacker, entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));return true;}@Override public void appendHoverText(@Nonnull ItemStack stack, @Nonnull Level world, @Nonnull List<Component> tooltip, @Nonnull TooltipFlag flag) {super.appendHoverText(stack, world, tooltip, flag);}@Override public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {return false;}});
    public static final RegistryObject<Item> KYANITE_SWORD = ITEMS.register("kyanite_sword", () -> new Sword(new Item.Properties().durability(1)) {@Override protected ConfigValues getConfigValues() {return new ConfigValues(DZConfig.getKyaniteSwordDurability(), DZConfig.getKyaniteSwordDamage(), DZConfig.getKyaniteSwordEfficiency(), DZConfig.getKyaniteSwordAttackSpeed(), DZConfig.getKyaniteSwordHarvestLevel(), DZConfig.getKyaniteSwordEnchantability(), DZConfig.getKyaniteSwordHitCost());}@Override public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {stack.hurtAndBreak(getConfigValues().hitCost, attacker, entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));return true;}@Override public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {return false;}});private static ModdedTier createTempTier() {return new ModdedTier(1, 1, 1, 1).withEmptyRepair();}


    // === Armor Items ===
    public static final RegistryObject<ArmorItem> COARSE_AMETHYST_HELMET = ITEMS.register("coarse_amethyst_helmet", () -> new Armour(() -> createCoarseAmethystArmorTier(ArmorItem.Type.HELMET), ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.COMMON), () -> DZConfig.getCoarseAmethystHelmetHitCost(), "\u00A75Glittering\u00A75"));
    public static final RegistryObject<ArmorItem> COARSE_AMETHYST_CHESTPLATE = ITEMS.register("coarse_amethyst_chestplate", () -> new Armour(() -> createCoarseAmethystArmorTier(ArmorItem.Type.CHESTPLATE), ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.COMMON), () -> DZConfig.getCoarseAmethystChestplateHitCost(), "\u00A75DAZZLING\u00A75"));
    public static final RegistryObject<ArmorItem> COARSE_AMETHYST_LEGGINGS = ITEMS.register("coarse_amethyst_leggings", () -> new Armour(() -> createCoarseAmethystArmorTier(ArmorItem.Type.LEGGINGS), ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.COMMON), () -> DZConfig.getCoarseAmethystLeggingsHitCost(), "\u00A75Shining\u00A75"));
    public static final RegistryObject<ArmorItem> COARSE_AMETHYST_BOOTS = ITEMS.register("coarse_amethyst_boots", () -> new Armour(() -> createCoarseAmethystArmorTier(ArmorItem.Type.BOOTS), ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.COMMON), () -> DZConfig.getCoarseAmethystBootsHitCost(), "\u00A75Sparkling\u00A75"));
    private static ArmourTier createCoarseAmethystArmorTier(ArmorItem.Type type) {return new ArmourTier("coarse_amethyst", () -> getCoarseAmethystDurabilityForType(type), () -> getCoarseAmethystArmorForType(type), () -> getCoarseAmethystEnchantabilityForType(type), () -> getCoarseAmethystToughnessForType(type), () -> getCoarseAmethystKnockbackResistanceForType(type), true, () -> Ingredient.of(RegistryHandler.COARSE_AMETHYST.get()));}private static int getCoarseAmethystDurabilityForType(ArmorItem.Type type) {return switch (type) {case HELMET -> DZConfig.getCoarseAmethystHelmetDurability();case CHESTPLATE -> DZConfig.getCoarseAmethystChestplateDurability();case LEGGINGS -> DZConfig.getCoarseAmethystLeggingsDurability();case BOOTS -> DZConfig.getCoarseAmethystBootsDurability();};}private static int getCoarseAmethystArmorForType(ArmorItem.Type type) {return switch (type) {case HELMET -> DZConfig.getCoarseAmethystHelmetArmor();case CHESTPLATE -> DZConfig.getCoarseAmethystChestplateArmor();case LEGGINGS -> DZConfig.getCoarseAmethystLeggingsArmor();case BOOTS -> DZConfig.getCoarseAmethystBootsArmor();};}private static int getCoarseAmethystEnchantabilityForType(ArmorItem.Type type) {return switch (type) {case HELMET -> DZConfig.getCoarseAmethystHelmetEnchantability();case CHESTPLATE -> DZConfig.getCoarseAmethystChestplateEnchantability();case LEGGINGS -> DZConfig.getCoarseAmethystLeggingsEnchantability();case BOOTS -> DZConfig.getCoarseAmethystBootsEnchantability();};}private static float getCoarseAmethystToughnessForType(ArmorItem.Type type) {return (float) switch (type) {case HELMET -> DZConfig.getCoarseAmethystHelmetToughness();case CHESTPLATE -> DZConfig.getCoarseAmethystChestplateToughness();case LEGGINGS -> DZConfig.getCoarseAmethystLeggingsToughness();case BOOTS -> DZConfig.getCoarseAmethystBootsToughness();};}private static float getCoarseAmethystKnockbackResistanceForType(ArmorItem.Type type) {return (float) switch (type) {case HELMET -> DZConfig.getCoarseAmethystHelmetKnockBackResistance();case CHESTPLATE -> DZConfig.getCoarseAmethystChestplateKnockBackResistance();case LEGGINGS -> DZConfig.getCoarseAmethystLeggingsKnockBackResistance();case BOOTS -> DZConfig.getCoarseAmethystBootsKnockBackResistance();};}



    // === Creative Tabs ===
    public static final RegistryObject<CreativeModeTab> A_ADVENTUREKRAFT_A_ITEMS_TAB = CREATIVE_MODE_TABS.register(
            "aadventurekraftaitems",
            RegistryHandler::createItemsTab);
    public static final RegistryObject<CreativeModeTab> B_ADVENTUREKRAFT_B_ARMORY_TAB = CREATIVE_MODE_TABS.register(
            "badventurekraftbarmory",
            RegistryHandler::createArmorTab);
    public static final RegistryObject<CreativeModeTab> C_ADVENTUREKRAFT_C_WEAPONRY_TAB = CREATIVE_MODE_TABS.register(
            "cadventurekraftcweaponry",
            RegistryHandler::createWeaponsTab);
    public static final RegistryObject<CreativeModeTab> D_ADVENTUREKRAFT_D_TOOLS_TAB = CREATIVE_MODE_TABS.register(
            "dadventurekraftdtools",
            RegistryHandler::createToolsTab);
    public static final RegistryObject<CreativeModeTab> E_ADVENTUREKRAFT_E_BLOCKS_TAB = CREATIVE_MODE_TABS.register(
            "eadventurekrafteblocks",
            RegistryHandler::createBlocksTab);
    public static final RegistryObject<CreativeModeTab> F_ADVENTUREKRAFT_F_PORES_TAB = CREATIVE_MODE_TABS.register(
            "fadventurekraftfpores",
            RegistryHandler::createPoresTab);
    public static final RegistryObject<CreativeModeTab> G_ADVENTUREKRAFT_G_FOOD_TAB = CREATIVE_MODE_TABS.register(
            "gadventurekraftgfood",
            RegistryHandler::createFoodTab);
    public static final RegistryObject<CreativeModeTab> H_ADVENTUREKRAFT_H_WIP_TAB = CREATIVE_MODE_TABS.register(
            "hadventurekrafhhwip",
            RegistryHandler::createWIPTab);


    public static void init(IEventBus modEventBus) {
        // Register all deferred registers with the mod event bus
        ITEMS.register(modEventBus);
        BLOCKS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
    }



    // === AdventureKraft Items Creative Tab ===
    private static CreativeModeTab createItemsTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.aadventurekraftaitemstab"))
                .icon(() -> new ItemStack(COARSE_AMETHYST.get()))
                .displayItems((params, output) -> {
                    output.accept(COARSE_AMETHYST.get());
                    output.accept(BIORAPTOR_SCALE.get());
                    output.accept(WATER_DRAGON_SCALE.get());
                })
                .withBackgroundLocation(new ResourceLocation("dangerzone", "textures/gui/inventory_tab.png"))
                .withTabsImage(new ResourceLocation("dangerzone", "textures/gui/tab_icons.png"))
                .build();
    }


    // === AdventureKraft Armory Creative Tab ===
    private static CreativeModeTab createArmorTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.badventurekraftbarmorytab"))
                .icon(() -> new ItemStack(COARSE_AMETHYST_CHESTPLATE.get()))
                .displayItems((params, output) -> {
                    output.accept(COARSE_AMETHYST_HELMET.get());
                    output.accept(COARSE_AMETHYST_CHESTPLATE.get());
                    output.accept(COARSE_AMETHYST_LEGGINGS.get());
                    output.accept(COARSE_AMETHYST_BOOTS.get());

                })
                .withBackgroundLocation(new ResourceLocation("dangerzone", "textures/gui/inventory_tab.png"))
                .withTabsImage(new ResourceLocation("dangerzone", "textures/gui/tab_icons.png"))
                .build();
    }



    // === AdventureKraft Weapons Creative Tab ===
    private static CreativeModeTab createWeaponsTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.cadventurekraftcweaponrytab"))
                 .icon(() -> new ItemStack(KYANITE_SWORD.get()))
                .displayItems((params, output) -> {
                    //Weapons Go Here
//                    output.accept(MANTIS_CLAW.get()); // Placeholder until items are added
//                    output.accept(MANTIS_CLAW.get()); // Placeholder until items are added
//                    output.accept(MANTIS_CLAW.get()); // Placeholder until items are added
//                    output.accept(MANTIS_CLAW.get()); // Placeholder until items are added
                    output.accept(KYANITE_SWORD.get());
                    output.accept(MANTIS_CLAW.get()); // Temp item to prevent empty tab
                })
                .withBackgroundLocation(new ResourceLocation("dangerzone", "textures/gui/inventory_tab.png"))
                .withTabsImage(new ResourceLocation("dangerzone", "textures/gui/tab_icons.png"))
                .build();
    }



    // === AdventureKraft Tools Creative Tab ===
    private static CreativeModeTab createToolsTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.dadventurekraftdtoolstab"))
                 .icon(() -> new ItemStack(KYANITE_PICKAXE.get()))

                .displayItems((params, output) -> {
                    //Tools Can Go Here
                    output.accept(KYANITE_PICKAXE.get()); // Temp item to prevent empty tab
                    output.accept(KYANITE_AXE.get());
                    output.accept(KYANITE_SHOVEL.get());
                    output.accept(KYANITE_HOE.get());
                })
                .withBackgroundLocation(new ResourceLocation("dangerzone", "textures/gui/inventory_tab.png"))
                .withTabsImage(new ResourceLocation("dangerzone", "textures/gui/tab_icons.png"))
                .build();
    }

    // === AdventureKraft Blocks Creative Tab ===
    private static CreativeModeTab createBlocksTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.eadventurekrafteblockstab"))
                // .icon(() -> new ItemStack(COARSE_AMETHYST_CHESTPLATE.get()))
                .icon(() -> new ItemStack(Items.STONE)) // Temp icon for blocks tab
                .displayItems((params, output) -> {
                    //Blocks Go Here
                    output.accept(Items.COBBLESTONE); // Temp item to prevent empty tab
                })
                .withBackgroundLocation(new ResourceLocation("dangerzone", "textures/gui/inventory_tab.png"))
                .withTabsImage(new ResourceLocation("dangerzone", "textures/gui/tab_icons.png"))
                .build();
    }

    // === AdventureKraft Petrified Ores Creative Tab
    private static CreativeModeTab createPoresTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.fadventurekraftfporestab"))
                // .icon(() -> new ItemStack(COARSE_AMETHYST_CHESTPLATE.get()))
                .icon(() -> new ItemStack(Items.COAL_ORE)) // Temp icon for petrified ores tab
                .displayItems((params, output) -> {
                    //Petrified Ore Blocks Go Here
                    output.accept(Items.COBBLESTONE); // Temp item to prevent empty tab
                })
                .withBackgroundLocation(new ResourceLocation("dangerzone", "textures/gui/inventory_tab.png"))
                .withTabsImage(new ResourceLocation("dangerzone", "textures/gui/tab_icons.png"))
                .build();
    }


    // === AdventureKraft Food Creative Tab ===
    private static CreativeModeTab createFoodTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.gadventurekraftgfoodtab"))
                // .icon(() -> new ItemStack(COARSE_AMETHYST.get()))
                .icon(() -> new ItemStack(Items.APPLE)) // Temp icon for food tab
                .displayItems((params, output) -> {
                    //Food Goes here
                    output.accept(Items.COBBLESTONE); // Temp item to prevent empty tab
                })
                .withBackgroundLocation(new ResourceLocation("dangerzone", "textures/gui/inventory_tab.png"))
                .withTabsImage(new ResourceLocation("dangerzone", "textures/gui/tab_icons.png"))
                .build();
    }



    // === AdventureKraft WIP Creative Tab ===
    private static CreativeModeTab createWIPTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.hadventurekrafthwiptab"))
                // .icon(() -> new ItemStack(COARSE_AMETHYST_CHESTPLATE.get()))
                .icon(() -> new ItemStack(Items.BARRIER)) // Temp icon for WIP tab
                .displayItems((params, output) -> {
                    //WIP Stuff Goes Here
                    output.accept(Items.COBBLESTONE); // Temp item to prevent empty tab
                })
                .withBackgroundLocation(new ResourceLocation("dangerzone", "textures/gui/inventory_tab.png"))
                .withTabsImage(new ResourceLocation("dangerzone", "textures/gui/tab_icons.png"))
                .build();
    }

}