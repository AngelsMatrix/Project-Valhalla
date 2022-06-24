package net.angela.project_valhalla.item;

import net.angela.project_valhalla.ModCore;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final net.minecraft.item.ItemGroup VALHALLA = FabricItemGroupBuilder.build(
            new Identifier(ModCore.MOD_ID, "project_valhalla"),
            () -> new ItemStack(ItemCore.APPLE_PIE));
}
