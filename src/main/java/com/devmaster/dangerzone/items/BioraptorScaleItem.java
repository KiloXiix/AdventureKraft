package com.devmaster.dangerzone.items;

import net.minecraft.world.item.Rarity;

public class BioraptorScaleItem extends AItem {
    public BioraptorScaleItem() {
        super(new Properties()
                .stacksTo(64)
                .rarity(Rarity.COMMON));
//                addInfo("A ToolTip Can Go Here");
    }
}