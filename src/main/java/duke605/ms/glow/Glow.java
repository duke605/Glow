package duke605.ms.glow;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import duke605.ms.glow.handler.ConfigurationHandler;
import duke605.ms.glow.handler.EventManager;
import duke605.ms.glow.lib.GlowTab;
import duke605.ms.glow.lib.LibBlocks;
import duke605.ms.glow.lib.LibItems;
import duke605.ms.glow.lib.Reference;
import duke605.ms.glow.proxy.CommonProxy;

@Mod(
		modid = Reference.MODID,
		name = Reference.NAME,
		version = Reference.VERSION,
		dependencies = Reference.DEPENDENCIES
	)
public class Glow {

	@Instance(Reference.MODID)
	public static Glow instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;
	
	public static final CreativeTabs tab = new GlowTab(); // Creative tab
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.initConfig(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		LibBlocks.initBlocks(); // Loading blocks
		LibItems.initItems(); // Loading items
		
		// Registering event handling
		FMLCommonHandler.instance().bus().register(EventManager.INSTANCE); 
		MinecraftForge.EVENT_BUS.register(EventManager.INSTANCE);

		proxy.registerMod();
		proxy.registerRenderers(); // Loading renderers
	}
}
