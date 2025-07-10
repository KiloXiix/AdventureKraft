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
    public static final RegistryObject<Item> COARSE_AMETHYST = ITEMS.register("coarse_amethyst",
            () -> new CoarseAmethystItem());
    public static final RegistryObject<Item> MANTIS_CLAW = ITEMS.register("mantis_claw",
            () -> new MantisClawItem());

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
    public static final RegistryObject<CreativeModeTab> ADVENTUREKRAFT_A_BLOCKS_TAB = CREATIVE_MODE_TABS.register(
            "adventurekraftablocks",
            RegistryHandler::createBlocksTab);
    public static final RegistryObject<CreativeModeTab> ADVENTUREKRAFT_B_PORES_TAB = CREATIVE_MODE_TABS.register(
            "adventurekraftbblocks",
            RegistryHandler::createPoresTab);
    public static final RegistryObject<CreativeModeTab> ADVENTUREKRAFT_C_FOOD_TAB = CREATIVE_MODE_TABS.register(
            "adventurekraftcfood",
            RegistryHandler::createFoodTab);
    public static final RegistryObject<CreativeModeTab> ADVENTUREKRAFT_D_ITEMS_TAB = CREATIVE_MODE_TABS.register(
            "adventurekraftditems",
            RegistryHandler::createItemsTab);
    public static final RegistryObject<CreativeModeTab> ADVENTUREKRAFT_E_ARMORY_TAB = CREATIVE_MODE_TABS.register(
            "adventurekraftearmory",
            RegistryHandler::createArmorTab);
    public static final RegistryObject<CreativeModeTab> ADVENTUREKRAFT_F_TOOLS_TAB = CREATIVE_MODE_TABS.register(
            "adventurekraftftools",
            RegistryHandler::createToolsTab);
    public static final RegistryObject<CreativeModeTab> ADVENTUREKRAFT_G_WEAPONS_TAB = CREATIVE_MODE_TABS.register(
            "adventurekraftgweapons",
            RegistryHandler::createWeaponsTab);
    public static final RegistryObject<CreativeModeTab> ADVENTUREKRAFT_H_WIP_TAB = CREATIVE_MODE_TABS.register(
            "adventurekrafthwip",
            RegistryHandler::createWIPTab);


    public static void init(IEventBus modEventBus) {
        // Register all deferred registers with the mod event bus
        ITEMS.register(modEventBus);
        BLOCKS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
    }


    // === AdventureKraft Blocks Creative Tab ===
    private static CreativeModeTab createBlocksTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.adventurekraftablockstab"))
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
                .title(Component.translatable("itemGroup.adventurekraftbporestab"))
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
                .title(Component.translatable("itemGroup.adventurekraftcfoodtab"))
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


    // === AdventureKraft Items Creative Tab ===
    private static CreativeModeTab createItemsTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.adventurekraftditemstab"))
                .icon(() -> new ItemStack(COARSE_AMETHYST.get()))
                .displayItems((params, output) -> {
                    output.accept(BIORAPTOR_SCALE.get());
                    output.accept(MANTIS_CLAW.get());
                    output.accept(COARSE_AMETHYST.get());
                })
                .withBackgroundLocation(new ResourceLocation("dangerzone", "textures/gui/inventory_tab.png"))
                .withTabsImage(new ResourceLocation("dangerzone", "textures/gui/tab_icons.png"))
                .build();
    }


    // === AdventureKraft Armory Creative Tab ===
    private static CreativeModeTab createArmorTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.adventurekraftearmorytab"))
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


    // === AdventureKraft Tools Creative Tab ===
    private static CreativeModeTab createToolsTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.adventurekraftftoolstab"))
                // .icon(() -> new ItemStack(COARSE_AMETHYST_CHESTPLATE.get()))
                .icon(() -> new ItemStack(Items.IRON_PICKAXE)) // Temp icon for tools tab
                .displayItems((params, output) -> {
                    //Tools Go Here
                    output.accept(Items.COBBLESTONE); // Temp item to prevent empty tab
                })
                .withBackgroundLocation(new ResourceLocation("dangerzone", "textures/gui/inventory_tab.png"))
                .withTabsImage(new ResourceLocation("dangerzone", "textures/gui/tab_icons.png"))
                .build();
    }


    // === AdventureKraft Weapons Creative Tab ===
    private static CreativeModeTab createWeaponsTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.adventurekraftgweaponstab"))
                // .icon(() -> new ItemStack(COARSE_AMETHYST_CHESTPLATE.get()))
                .icon(() -> new ItemStack(Items.IRON_SWORD)) // Temp icon for weapons tab
                .displayItems((params, output) -> {
                    //Weapons Go Here
                    output.accept(Items.COBBLESTONE); // Temp item to prevent empty tab
                })
                .withBackgroundLocation(new ResourceLocation("dangerzone", "textures/gui/inventory_tab.png"))
                .withTabsImage(new ResourceLocation("dangerzone", "textures/gui/tab_icons.png"))
                .build();
    }


    // === AdventureKraft WIP Creative Tab ===
    private static CreativeModeTab createWIPTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.adventurekrafthwiptab"))
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