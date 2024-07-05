package net.nutikas.opsidian;

import net.fabricmc.api.ModInitializer;

import net.nutikas.opsidian.item.ModDropModifier;
import net.nutikas.opsidian.item.ModItemGroups;
import net.nutikas.opsidian.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OPsidian implements ModInitializer {
	public static final String MOD_ID = "opsidian";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModDropModifier.modifyDrops();
	}
}