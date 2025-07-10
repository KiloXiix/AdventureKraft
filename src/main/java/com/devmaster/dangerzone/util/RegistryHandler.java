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
    public static final RegistryObject<CreativeModeTab> ADVENTUREKRAFT_A_ITEMS_TAB = CREATIVE_MODE_TABS.register(
            "adventurekraftaitems",
            RegistryHandler::createItemsTab);
    public static final RegistryObject<CreativeModeTab> ADVENTUREKRAFT_B_ARMORY_TAB = CREATIVE_MODE_TABS.register(
            "adventurekraftbarmory",
            RegistryHandler::createArmorTab);

    public static void init(IEventBus modEventBus) {
        // Register all deferred registers with the mod event bus
        ITEMS.register(modEventBus);
        BLOCKS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
    }


    // === AdventureKraft Items Creative Tab ===
    private static CreativeModeTab createItemsTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.adventurekraftaitemstab"))
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
                .title(Component.translatable("itemGroup.adventurekraftbarmorytab"))
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
}