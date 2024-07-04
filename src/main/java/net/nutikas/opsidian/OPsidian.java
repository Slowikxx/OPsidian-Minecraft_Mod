package net.nutikas.opsidian;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.nutikas.opsidian.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

public class OPsidian implements ModInitializer {
	public static final String MOD_ID = "opsidian";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		// Registering the block break event
		PlayerBlockBreakEvents.BEFORE.register((world, player, pos, state, blockEntity) -> {
			ItemStack stack = player.getStackInHand(Hand.MAIN_HAND);
			if (!(stack.getItem() == ModItems.OBSIDIAN_NETHERITE_PICKAXE) || player.isCreative()) {
				return true; // Continue with the default block breaking logic
			}
			if (state.getBlock() == Blocks.BEDROCK) {
				Block.dropStack(world, pos, new ItemStack(Blocks.BEDROCK));
			} else if (state.getBlock() == Blocks.END_PORTAL_FRAME) {
				Block.dropStack(world, pos, new ItemStack(Blocks.END_PORTAL_FRAME));
			} else if (state.getBlock() == Blocks.SPAWNER) {
				Block.dropStack(world, pos, new ItemStack(Blocks.SPAWNER));
			}

			return true; // Continue with the default block breaking logic
		});
	}
}