package duke605.ms.glow.lib;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class Reference {

	// Mod Attributes
	public static final String MODID = "Glow";
	public static final String NAME = "Glow";
	public static final String VERSION = "1.0.0.1";
	public static final String DEPENDENCIES = "";
	public static final String DOMAIN = "glow:";
	
	// Proxies
	public static final String COMMON_PROXY = "duke605.ms.glow.proxy.CommonProxy";
	public static final String CLIENT_PROXY = "duke605.ms.glow.proxy.ClientProxy";
	
	// Rendering
	public static final int LAMP_RENDER_ID = RenderingRegistry.getNextAvailableRenderId();
}
