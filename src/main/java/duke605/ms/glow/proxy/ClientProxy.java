package duke605.ms.glow.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import duke605.kingcore.lib.ModInfo;
import duke605.kingcore.registry.VersionRegistry;
import duke605.ms.glow.Glow;
import duke605.ms.glow.handler.ConfigurationHandler;
import duke605.ms.glow.handler.RenderHandler;

public class ClientProxy extends CommonProxy {

	/**
	 * Registers a mod with the version checker in KingCore
	 */
	public void registerMod() {
		ModInfo info;
		
		// Registering update check
		VersionRegistry.instance.register(Glow.instance, ConfigurationHandler.configFile.getPath());
		
		// Updating credits
		if ((info = VersionRegistry.instance.modDetailsWithId.get("Glow")) != null)
			info.credits = new String[] {"Ntzrmtthihu777", "Hotel"};
	}
	
	public void registerRenderers() {
		RenderingRegistry.registerBlockHandler(new RenderHandler());
	}
}
