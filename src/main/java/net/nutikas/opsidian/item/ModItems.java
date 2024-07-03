package net.nutikas.opsidian.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.nutikas.opsidian.OPsidian;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // items
    public static final Item OBSIDIAN_INGOT = registerItem("obsidian_ingot", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_STICK = registerItem("netherite_stick", new Item(new FabricItemSettings()));

    // tools
    public static final Item OBSIDIAN_NETHERITE_PICKAXE = registerItem("obsidian_netherite_pickaxe", new PickaxeItem(ModToolMaterial.OBSIDIAN, 2, 2f, new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(OBSIDIAN_INGOT);
        entries.add(NETHERITE_STICK);
        entries.add(OBSIDIAN_NETHERITE_PICKAXE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OPsidian.MOD_ID, name), item);
    }
    public static void registerModItems() {
        OPsidian.LOGGER.info("Registering Mod Items for" + OPsidian.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
