package net.angela.project_valhalla.block;

import net.angela.project_valhalla.ModCore;
import net.angela.project_valhalla.item.ItemGroupCore;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlocksCore {


    public static final Block OVEN = new Block(FabricBlockSettings.of(Material.STONE));

    //Registers new Block and its BlockItem
    private static Block registerNewBlock(String name, Block block, ItemGroup itemGroup) {
        ModCore.LOGGER.debug("Execute://BlockRegister(All)");
        BlockItem blockItem = new BlockItem(block, new FabricItemSettings().group(itemGroup));
        Registry.register(Registry.ITEM, new Identifier(ModCore.MOD_ID, name), blockItem);
        return Registry.register(Registry.BLOCK, new Identifier(ModCore.MOD_ID, name), block);
    }

    public static void registerBlocks() {
        registerNewBlock("oven", OVEN, ItemGroupCore.VALHALLA);
    }

}
