package net.nutikas.opsidian.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.nutikas.opsidian.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.OBSIDIAN_INGOT, RecipeCategory.BUILDING_BLOCKS, Blocks.OBSIDIAN);

        // items
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NETHERITE_STICK, 1)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .input('#', Items.NETHERITE_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_STICK)));

        // tools
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OBSIDIAN_NETHERITE_PICKAXE, 1)
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.OBSIDIAN_INGOT)
                .input('S', ModItems.NETHERITE_STICK)
                .criterion(hasItem(ModItems.OBSIDIAN_INGOT), conditionsFromItem(ModItems.OBSIDIAN_INGOT))
                .criterion(hasItem(ModItems.NETHERITE_STICK), conditionsFromItem(ModItems.NETHERITE_STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_NETHERITE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OBSIDIAN_NETHERITE_SWORD, 1)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" S ")
                .input('#', ModItems.OBSIDIAN_INGOT)
                .input('S', ModItems.NETHERITE_STICK)
                .criterion(hasItem(ModItems.OBSIDIAN_INGOT), conditionsFromItem(ModItems.OBSIDIAN_INGOT))
                .criterion(hasItem(ModItems.NETHERITE_STICK), conditionsFromItem(ModItems.NETHERITE_STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_NETHERITE_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OBSIDIAN_NETHERITE_AXE, 1)
                .pattern("## ")
                .pattern("#S ")
                .pattern(" S ")
                .input('#', ModItems.OBSIDIAN_INGOT)
                .input('S', ModItems.NETHERITE_STICK)
                .criterion(hasItem(ModItems.OBSIDIAN_INGOT), conditionsFromItem(ModItems.OBSIDIAN_INGOT))
                .criterion(hasItem(ModItems.NETHERITE_STICK), conditionsFromItem(ModItems.NETHERITE_STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_NETHERITE_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OBSIDIAN_NETHERITE_SHOVEL, 1)
                .pattern(" # ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.OBSIDIAN_INGOT)
                .input('S', ModItems.NETHERITE_STICK)
                .criterion(hasItem(ModItems.OBSIDIAN_INGOT), conditionsFromItem(ModItems.OBSIDIAN_INGOT))
                .criterion(hasItem(ModItems.NETHERITE_STICK), conditionsFromItem(ModItems.NETHERITE_STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_NETHERITE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OBSIDIAN_NETHERITE_HOE, 1)
                .pattern("## ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.OBSIDIAN_INGOT)
                .input('S', ModItems.NETHERITE_STICK)
                .criterion(hasItem(ModItems.OBSIDIAN_INGOT), conditionsFromItem(ModItems.OBSIDIAN_INGOT))
                .criterion(hasItem(ModItems.NETHERITE_STICK), conditionsFromItem(ModItems.NETHERITE_STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_NETHERITE_HOE)));

        // armor
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OBSIDIAN_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .input('#', ModItems.OBSIDIAN_INGOT)
                .criterion(hasItem(ModItems.OBSIDIAN_INGOT), conditionsFromItem(ModItems.OBSIDIAN_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OBSIDIAN_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.OBSIDIAN_INGOT)
                .criterion(hasItem(ModItems.OBSIDIAN_INGOT), conditionsFromItem(ModItems.OBSIDIAN_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OBSIDIAN_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.OBSIDIAN_INGOT)
                .criterion(hasItem(ModItems.OBSIDIAN_INGOT), conditionsFromItem(ModItems.OBSIDIAN_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OBSIDIAN_BOOTS, 1)
                .pattern("   ")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.OBSIDIAN_INGOT)
                .criterion(hasItem(ModItems.OBSIDIAN_INGOT), conditionsFromItem(ModItems.OBSIDIAN_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_BOOTS)));
    }
}
