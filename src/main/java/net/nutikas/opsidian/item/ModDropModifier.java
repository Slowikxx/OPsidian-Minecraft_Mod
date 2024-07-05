package net.nutikas.opsidian.item;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

public class ModDropModifier {

    public static void modifyDrops() {
        PlayerBlockBreakEvents.BEFORE.register((world, player, pos, state, blockEntity) -> {
            ItemStack stack = player.getStackInHand(Hand.MAIN_HAND);
            if (!(stack.getItem() == ModItems.OBSIDIAN_NETHERITE_PICKAXE) || player.isCreative()) {
                return true;
            }
            if (state.getBlock() == Blocks.BEDROCK) {
                Block.dropStack(world, pos, new ItemStack(Blocks.BEDROCK));
            } else if (state.getBlock() == Blocks.END_PORTAL_FRAME) {
                Block.dropStack(world, pos, new ItemStack(Blocks.END_PORTAL_FRAME));
            } else if (state.getBlock() == Blocks.SPAWNER) {
                Block.dropStack(world, pos, new ItemStack(Blocks.SPAWNER));
            }
            return true;
        });
    }
}
