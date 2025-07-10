package com.devmaster.dangerzone.items;


import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class CoarseAmethystItem extends Item {
    public CoarseAmethystItem() {
        super(new Item.Properties()
                .stacksTo(64)
                .rarity(Rarity.COMMON));
    }
}

