package net.angela.project_valhalla.item;

import net.angela.project_valhalla.ModCore;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemCore {

    public static final Item APPLE_PIE = new Item(new FabricItemSettings().group(ModItemGroup.VALHALLA));
    public static final Item BERRY_PIE = new Item(new FabricItemSettings().group(ModItemGroup.VALHALLA));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ModCore.MOD_ID, name), item);
    }

}

