package com.devmaster.dangerzone.items;

import net.minecraft.world.item.Rarity;

public class CoarseAmethystItem extends AItem {
    public CoarseAmethystItem() {
        super(new Properties()
                .stacksTo(64)
                .rarity(Rarity.COMMON));
        addInfo("§5 They make some pretty cool Coarse Amethyst Tools & a Coarse Amethyst Sword, you can also make Coarse Amethyst Armor §5");
    }
}