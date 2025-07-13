package com.devmaster.dangerzone.util;

import com.devmaster.dangerzone.items.*;
import com.devmaster.dangerzone.misc.DangerZone;
import net.minecraft.core.registries.Registries;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegistryHandler {
    // === Deferred Registers ===
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DangerZone.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DangerZone.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DangerZone.MOD_ID);

    // === Regular Items ===
    public static final RegistryObject<Item> BIORAPTOR_SCALE = ITEMS.register("bioraptor_scale",
            () -> new BioraptorScaleItem());
    public static final RegistryObject<Item> WATER_DRAGON_SCALE = ITEMS.register("water_dragon_scale",
            () -> new WaterDragonScaleItem());
    public static final RegistryObject<Item> COARSE_AMETHYST = ITEMS.register("coarse_amethyst",
            () -> new CoarseAmethystItem());


    // === Weapon Items ===
    public static final RegistryObject<Item> MANTIS_CLAW = ITEMS.register("mantis_claw",
            () -> new MantisClawItem());
    public static final RegistryObject<Item> KYANITE_SWORD = ITEMS.register("kyanite_sword",
            () -> new KyaniteSword());


    // === Tool Items ===
    public static final RegistryObject<Item> KYANITE_PICKAXE =
            ITEMS.register("kyanite_pickaxe", () -> new KyanitePickaxe());
    public static final RegistryObject<Item> KYANITE_AXE =
            ITEMS.register("kyanite_axe", () -> new KyaniteAxe());
    public static final RegistryObject<Item> KYANITE_SHOVEL =
            ITEMS.register("kyanite_shovel", () -> new KyaniteShovel());
    public static final RegistryObject<Item> KYANITE_HOE =
            ITEMS.register("kyanite_hoe", () -> new KyaniteHoe());


    // === Armor Items ===
    public static final RegistryObject<Item> COARSE_AMETHYST_HELMET = ITEMS.register(
            "coarse_amethyst_helmet",
            () -> CoarseAmethystArmor.createHelmet());
    public static final RegistryObject<Item> COARSE_AMETHYST_CHESTPLATE = ITEMS.register(
            "coarse_amethyst_chestplate",
            () -> CoarseAmethystArmor.createChestplate());
    public static final RegistryObject<Item> COARSE_AMETHYST_LEGGINGS = ITEMS.register(
            "coarse_amethyst_leggings",
            () -> CoarseAmethystArmor.createLeggings());
    public static final RegistryObject<Item> COARSE_AMETHYST_BOOTS = ITEMS.register(
            "coarse_amethyst_boots",
            () -> CoarseAmethystArmor.createBoots());



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