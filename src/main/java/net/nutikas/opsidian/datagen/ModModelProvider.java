package net.nutikas.opsidian.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.nutikas.opsidian.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // items
        itemModelGenerator.register(ModItems.NETHERITE_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_INGOT, Models.GENERATED);

        //tools
        itemModelGenerator.register(ModItems.OBSIDIAN_NETHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_NETHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_NETHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_NETHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_NETHERITE_HOE, Models.HANDHELD);

    }
}
