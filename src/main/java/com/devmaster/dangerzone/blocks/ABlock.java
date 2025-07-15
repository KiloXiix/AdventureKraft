package com.devmaster.dangerzone.blocks;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.util.RandomSource;


import java.util.Collections;
import java.util.List;

public class ABlock extends Block {
    protected int xpdropped;

    protected String name;
    private String[] info = new String[0];

    public ABlock(String name, Properties properties, int xpdropped) {
        super(properties);
        this.name = name;
        this.xpdropped = xpdropped;
    }


    public ABlock(String name, Properties properties, int xpdropped, String... tooltips) {
        this(name, properties, xpdropped);
        if (tooltips != null && tooltips.length > 0) {
            this.info = tooltips;
        }
    }

    @Override
    public int getExpDrop(BlockState state, LevelReader level, RandomSource randomSource, BlockPos pos, int fortune, int silktouch) {
        if (xpdropped == 0) {
            return 0;
        }
        int min = (int) (xpdropped * 0.667);
        int max = (int) (xpdropped * 1.5);
        return silktouch == 0 ? randomSource.nextInt(max - min) + min : 0;
    }

    public ABlock addInfo(String... newInfo) {
        if (newInfo != null && newInfo.length > 0) {
            String[] combinedInfo = new String[this.info.length + newInfo.length];
            System.arraycopy(this.info, 0, combinedInfo, 0, this.info.length);
            System.arraycopy(newInfo, 0, combinedInfo, this.info.length, newInfo.length);
            this.info = combinedInfo;
        }
        return this;
    }

    @Override
    public void appendHoverText(ItemStack stack, BlockGetter level, List<Component> tooltip, TooltipFlag flag) {
        for (String s : info) {
            tooltip.add(Component.literal(s));
        }
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }
}