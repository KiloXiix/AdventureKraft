// === Base Item Class for Basic Items to be used for reference later ===

package com.devmaster.dangerzone.items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class AItem extends Item
{

    private String[] info = new String[0];

    public AItem(int stacksize)
    {
        this(get(stacksize));
    }

    public AItem()
    {
        this(get(64));
    }


    public AItem(Properties p)
    {
        super(p);

    }

    protected static final Properties get(int stacksize)
    {
        return new Properties().stacksTo(stacksize);
    }

    public AItem addInfo(String... newInfo) {
        if (newInfo != null && newInfo.length > 0) {
            String[] combinedInfo = new String[this.info.length + newInfo.length];
            System.arraycopy(this.info, 0, combinedInfo, 0, this.info.length);
            System.arraycopy(newInfo, 0, combinedInfo, this.info.length, newInfo.length);
            this.info = combinedInfo;
        }
        return this;
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, List<Component> list, TooltipFlag flag){
        for (String s : info) {
            list.add(Component.literal(s));
        }
    }
}