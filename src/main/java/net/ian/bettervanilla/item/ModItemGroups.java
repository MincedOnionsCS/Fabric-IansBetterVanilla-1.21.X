package net.ian.bettervanilla.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.ian.bettervanilla.IansBetterVanilla;
import net.ian.bettervanilla.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TestMod_Item_Group = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(IansBetterVanilla.MOD_ID, "iansbettervanilla_items"), FabricItemGroup.builder().
                    icon(() -> new ItemStack(ModItems.Pink_Garnet)).
                    displayName(Text.translatable("itemgroup.iansbettervanilla.iansbettervanilla_items")).
                    entries((displayContext, entries) -> {
                        entries.add(ModItems.Pink_Garnet);
                        entries.add(ModBlocks.Pink_Garnet_Block);
                    })
                    .build());
    public static void registerItemGroups(){
        IansBetterVanilla.LOGGER.info("Register item group for " + IansBetterVanilla.MOD_ID);
    }
}
