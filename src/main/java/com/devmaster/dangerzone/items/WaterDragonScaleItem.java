package com.devmaster.dangerzone.items;

import net.minecraft.world.item.Rarity;


public class WaterDragonScaleItem extends AItem {
    public WaterDragonScaleItem() {
        super(new Properties()
                .stacksTo(64)
                .rarity(Rarity.COMMON));
                addInfo("§bDropped by the Water Dragon.§b");
    }
}
