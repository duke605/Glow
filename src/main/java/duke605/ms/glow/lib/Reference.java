package duke605.ms.glow.lib;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class Reference {

	// Mod Attributes
	public static final String MODID = "Glow";
	public static final String NAME = "Glow";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDENCIES = "required-after:DC1@[3.4.2.19,)";
	public static final String DOMAIN = "glow:";
	
	// Proxies
	public static final String COMMON_PROXY = "duke605.ms.glow.proxy.CommonProxy";
	public static final String CLIENT_PROXY = "duke605.ms.glow.proxy.ClientProxy";
	
	// Rendering
	public static final int LAMP_RENDER_ID = RenderingRegistry.getNextAvailableRenderId();
}
