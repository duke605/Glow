package duke605.ms.glow.handler;

import java.io.File;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {

	// Configuration
	public static Configuration config;
	public static File configFile;
	
	// Configuration Settings
	public static float defaultGamma;
	public static int lampRange;
	
	public static void initConfig(FMLPreInitializationEvent event) {
		configFile = new File(event.getModConfigurationDirectory(), "/Micro/Glow.cfg");
		config = new Configuration(configFile);
		
		config.load();
		
		// Getting settings
		defaultGamma = config.getFloat("defaultBrightness", Configuration.CATEGORY_GENERAL, 0.5F, 0.0F, 1.0F, "What brightness level do you usually play at? This is used to reset the game brightness to normal when Glowstone Goggles are unequipped.");
		lampRange = config.getInt("lampRange", Configuration.CATEGORY_GENERAL, 8, 8, 32, "Determines how far the Glowstone Lamp's RADIUS is.");
		
		config.save();
	}
}
