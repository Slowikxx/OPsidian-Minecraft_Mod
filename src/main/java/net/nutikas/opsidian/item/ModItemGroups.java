package net.nutikas.opsidian.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nutikas.opsidian.OPsidian;
import net.minecraft.text.Text;

import static net.nutikas.opsidian.item.ModItems.*;

public class ModItemGroups {

    public static final ItemGroup OBSIDIAN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OPsidian.MOD_ID, "obsidian"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.obsidian"))
                    .icon(() -> new ItemStack(OBSIDIAN_INGOT)).entries((displayContext, entries) -> {
                        // items
                        entries.add(OBSIDIAN_INGOT);
                        entries.add(NETHERITE_STICK);
                        // tools
                        entries.add(OBSIDIAN_NETHERITE_PICKAXE);
                        entries.add(OBSIDIAN_NETHERITE_SWORD);
                        entries.add(OBSIDIAN_NETHERITE_AXE);
                        entries.add(OBSIDIAN_NETHERITE_SHOVEL);
                        entries.add(OBSIDIAN_NETHERITE_HOE);
                        //armor
                        entries.add(OBSIDIAN_HELMET);
                        entries.add(OBSIDIAN_CHESTPLATE);
                        entries.add(OBSIDIAN_LEGGINGS);
                        entries.add(OBSIDIAN_BOOTS);
                    } ).build()
            );
    public static void registerItemGroups() {
        OPsidian.LOGGER.info("Registering Item Groups for " + OPsidian.MOD_ID);
    }
}
