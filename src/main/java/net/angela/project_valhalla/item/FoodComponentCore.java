package net.angela.project_valhalla.item;

import net.minecraft.item.FoodComponent;

public class FoodComponentCore {

   /*
   This class defines the FoodComponents, properties of food that makes them edible as items.
   Refer to the Minecraft source class FoodComponent for all component types.
    */
   public static final FoodComponent APPLE_PIE = new FoodComponent.Builder().hunger(8).saturationModifier(12f).build();
   public static final FoodComponent BERRY_PIE = new FoodComponent.Builder().hunger(8).saturationModifier(12f).build();


}
