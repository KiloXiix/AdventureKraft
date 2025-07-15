package com.devmaster.dangerzone.items;

import com.devmaster.dangerzone.misc.DangerZone;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;
import java.util.List;



public class MinersDreamItem extends Item {

    public MinersDreamItem() {
        super(new Item.Properties().stacksTo(64));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        player.startUsingItem(hand);
        BlockPos pos = player.blockPosition();
        Direction direction = player.getDirection();

        if (!player.getAbilities().instabuild) {
            stack.shrink(1);
        }

        if (!level.isClientSide) {
            for (int x = -5; x <= 5; x++) {
                for (int y = 0; y <= 5; y++) {
                    for (int z = 1; z <= 50; z++) {
                        BlockPos newPos = pos;
                        switch (direction) {
                            case SOUTH -> newPos = new BlockPos(pos.getX() + x, pos.getY() + y, pos.getZ() + z);
                            case NORTH -> newPos = new BlockPos(pos.getX() + x, pos.getY() + y, pos.getZ() - z);
                            case EAST -> newPos = new BlockPos(pos.getX() + z, pos.getY() + y, pos.getZ() + x);
                            case WEST -> newPos = new BlockPos(pos.getX() - z, pos.getY() + y, pos.getZ() + x);
                        }

                        BlockState currentState = level.getBlockState(newPos);
                        if (currentState.is(DangerZone.MINERS_DREAM_MINEABLE)) {
                            level.setBlock(newPos, Blocks.AIR.defaultBlockState(), 3);
                            if (x == 0 && y == 0 && z % 5 == 0) {
                                level.setBlock(newPos, Blocks.TORCH.defaultBlockState(), 3);
                            }
                        }

                        // Add ceiling protection
                        BlockPos topPos = newPos.above();
                        BlockState topState = level.getBlockState(topPos);
                        if (topState.is(Blocks.AIR) || topState.is(Blocks.WATER) || topState.is(Blocks.LAVA)) {
                            level.setBlock(topPos, Blocks.COBBLESTONE.defaultBlockState(), 3);
                        }
                    }
                }
            }
            return InteractionResultHolder.success(stack);
        }
        return InteractionResultHolder.fail(stack);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Component.literal("§2You've gotta try it! Make one then take it underground, tap it on a block in front of you at your feet, and be amazed! Indeed, it removes blocks from a large area, leaving only the ores behind instantly. It even lights the place up with torches. All you need to do is run amok with your pickaxe and reap the rewards!§2"));
        } else {
            tooltip.add(Component.literal("§7Hold §eShift §7for more info"));
        }
    }
}