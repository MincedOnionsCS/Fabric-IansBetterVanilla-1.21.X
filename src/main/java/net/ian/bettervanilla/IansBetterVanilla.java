package net.ian.bettervanilla;

import net.fabricmc.api.ModInitializer;

import net.ian.bettervanilla.block.ModBlocks;
import net.ian.bettervanilla.item.ModItemGroups;
import net.ian.bettervanilla.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IansBetterVanilla implements ModInitializer {
	public static final String MOD_ID = "iansbettervanilla";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Ian's Better Vanilla Mod Pack...");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}