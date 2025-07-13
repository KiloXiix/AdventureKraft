package com.devmaster.dangerzone.misc;

import com.devmaster.dangerzone.configs.BaseConfig;
import com.devmaster.dangerzone.util.RegistryHandler;
import com.devmaster.dangerzone.world.gen.ArmoredMobSpawnEvents;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



@Mod(DangerZone.MOD_ID)
public class DangerZone {
    public static final String MOD_ID = "dangerzone";
    public static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(MOD_ID);

    public DangerZone() {
        // Register config FIRST
        BaseConfig.register();

        // Get mod event bus
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Initialize and register all items and blocks
        RegistryHandler.init(modEventBus);

        // Hook into the common setup phase
        modEventBus.addListener(this::onCommonSetup);

        // Register event handlers
        MinecraftForge.EVENT_BUS.register(ArmoredMobSpawnEvents.class);
    }

    private void onCommonSetup(FMLCommonSetupEvent event) {
        // Common Setup Code can go here
    }
}
