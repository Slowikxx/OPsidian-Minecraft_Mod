package net.nutikas.opsidian.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.nutikas.opsidian.OPsidian;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nutikas.opsidian.item.custom.ModArmorItem;

public class ModItems {

    // items
    public static final Item OBSIDIAN_INGOT = registerItem("obsidian_ingot", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_STICK = registerItem("netherite_stick", new Item(new FabricItemSettings()));

    // tools
    public static final Item OBSIDIAN_NETHERITE_PICKAXE = registerItem("obsidian_netherite_pickaxe", new PickaxeItem(ModToolMaterial.OBSIDIAN, 3, 2f, new FabricItemSettings()));
    public static final Item OBSIDIAN_NETHERITE_SWORD = registerItem("obsidian_netherite_sword", new SwordItem(ModToolMaterial.OBSIDIAN, 8, 4f, new FabricItemSettings()));
    public static final Item OBSIDIAN_NETHERITE_AXE = registerItem("obsidian_netherite_axe", new AxeItem(ModToolMaterial.OBSIDIAN, 5, 3f, new FabricItemSettings()));
    public static final Item OBSIDIAN_NETHERITE_SHOVEL = registerItem("obsidian_netherite_shovel", new ShovelItem(ModToolMaterial.OBSIDIAN,2 , 2f, new FabricItemSettings()));
    public static final Item OBSIDIAN_NETHERITE_HOE = registerItem("obsidian_netherite_hoe", new HoeItem(ModToolMaterial.OBSIDIAN, 1, 1f, new FabricItemSettings()));

    // armor
    public static final Item OBSIDIAN_HELMET = registerItem("obsidian_helmet", new ModArmorItem(ModArmorMaterial.OBSIDIAN, ModArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item OBSIDIAN_CHESTPLATE = registerItem("obsidian_chestplate", new ArmorItem(ModArmorMaterial.OBSIDIAN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item OBSIDIAN_LEGGINGS = registerItem("obsidian_leggings", new ArmorItem(ModArmorMaterial.OBSIDIAN, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item OBSIDIAN_BOOTS = registerItem("obsidian_boots", new ArmorItem(ModArmorMaterial.OBSIDIAN, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OPsidian.MOD_ID, name), item);
    }
    public static void registerModItems() {
        OPsidian.LOGGER.info("Registering Mod Items for" + OPsidian.MOD_ID);
    }
}
