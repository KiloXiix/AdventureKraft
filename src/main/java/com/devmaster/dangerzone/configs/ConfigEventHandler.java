package com.devmaster.dangerzone.configs;

import com.devmaster.dangerzone.misc.DangerZone;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = DangerZone.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ConfigEventHandler {
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
}