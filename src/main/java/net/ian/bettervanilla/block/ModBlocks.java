package net.ian.bettervanilla.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.ian.bettervanilla.IansBetterVanilla;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //custom blocks
    public static final Block Pink_Garnet_Block = registerBlock("pink_garnet_block",
            new Block(AbstractBlock.Settings.create().strength(.01f).requiresTool().
                    sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    //block registry
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(IansBetterVanilla.MOD_ID, name), block);
    }
    //item to block registry
    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(IansBetterVanilla.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    //registers all blocks
    public static void registerModBlocks(){
        IansBetterVanilla.LOGGER.info("Registering Mod Blocks for" + IansBetterVanilla.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->{
        //    entries.add(ModBlocks.Pink_Garnet_Block);
        //});
    }
}
