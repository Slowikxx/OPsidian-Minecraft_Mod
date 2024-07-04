package net.nutikas.opsidian.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.nutikas.opsidian.item.ModItems;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(AbstractBlock.class)
public class AbstractBlockMixin {
    @Unique
    private static final float BLOCK_HARDNESS = 5.0F;
    @Unique
    private static final int EFFECTIVE_TOOL_MODIFIER = 5;

    @Inject(at = @At(value = "JUMP", opcode = Opcodes.IFNE, shift = At.Shift.AFTER),
            method = "Lnet/minecraft/block/AbstractBlock;calcBlockBreakingDelta(" +
                    "Lnet/minecraft/block/BlockState;" +
                    "Lnet/minecraft/entity/player/PlayerEntity;" +
                    "Lnet/minecraft/world/BlockView;" +
                    "Lnet/minecraft/util/math/BlockPos;)F",
            cancellable = true,
            locals = LocalCapture.CAPTURE_FAILSOFT)
    public void allowBedrockBreaking(BlockState state, PlayerEntity player, BlockView world, BlockPos pos,
                                     CallbackInfoReturnable<Float> cir, float hardness) {
        ItemStack stackInHand = player.getStackInHand(Hand.MAIN_HAND);

        if (state.isOf(Blocks.BEDROCK) || state.isOf(Blocks.END_PORTAL_FRAME) && hardness == -1.0F && stackInHand.getItem() == ModItems.OBSIDIAN_NETHERITE_PICKAXE) {
            float blockBreakingSpeed = player.getBlockBreakingSpeed(state);
            cir.setReturnValue(blockBreakingSpeed / BLOCK_HARDNESS / EFFECTIVE_TOOL_MODIFIER);
        }
    }
}
