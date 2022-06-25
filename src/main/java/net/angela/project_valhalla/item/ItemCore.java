package net.angela.project_valhalla.item;

import net.angela.project_valhalla.ModCore;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemCore {

    /*
    This class contains registers and properties for items, as well as the method to register all items.
     */
    public static final Item APPLE_PIE = new Item(new FabricItemSettings()
            .group(ItemGroupCore.VALHALLA)
            .food(FoodComponentCore.APPLE_PIE)
    );
    public static final Item BERRY_PIE = new Item(new FabricItemSettings()
            .group(ItemGroupCore.VALHALLA)
            .food(FoodComponentCore.BERRY_PIE)
    );

    //Common method to register any generic item
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ModCore.MOD_ID, name), item);
    }

    //Pass to ModCore to register all new items in one call.
    public static void registerFoodItems() {
        ModCore.LOGGER.debug("Execute://ItemRegister(All)");
        Registry.register(Registry.ITEM, new Identifier(ModCore.MOD_ID, "apple_pie"), APPLE_PIE);
        Registry.register(Registry.ITEM, new Identifier(ModCore.MOD_ID, "berry_pie"), BERRY_PIE);
    }
}