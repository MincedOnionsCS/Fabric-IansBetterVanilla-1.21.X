package net.ian.bettervanilla.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.ian.bettervanilla.IansBetterVanilla;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;

public class ModItems {

    public static final Item Pink_Garnet = registerItem("pink_garnet", new Item(new Item.Settings()));

    private static Item registerItem (String name, Item item){

        return Registry.register(Registries.ITEM, Identifier.of(IansBetterVanilla.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        IansBetterVanilla.LOGGER.info("Registering Mod Items for" + IansBetterVanilla.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries->{
       //     entries.add(Pink_Garnet);
        //});

    }

}
