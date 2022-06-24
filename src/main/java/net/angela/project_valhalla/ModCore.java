package net.angela.project_valhalla;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.angela.project_valhalla.item.ItemCore.*;

public class ModCore implements ModInitializer {
	public static final String MOD_ID = "project_valhalla";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCore.LOGGER.debug("Execute://ItemRegister(All)");
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "apple_pie"), APPLE_PIE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "berry_pie"), BERRY_PIE);

	}
}
