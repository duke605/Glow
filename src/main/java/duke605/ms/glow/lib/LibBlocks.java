package duke605.ms.glow.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import duke605.ms.glow.Glow;
import duke605.ms.glow.block.BlockGlowstoneLamp;
import duke605.ms.glow.block.BlockPhantomLight;
import net.minecraft.block.Block;

public class LibBlocks {

	// Blocks
	public static Block phantomLight;
	public static Block glowstoneLamp;
	
	/**
	 * Starts blocks
	 */
	public static void initBlocks() {
		assignBlocks();
		registerBlocks();
		addRecipes();
	}
	
	private static void assignBlocks() {
		phantomLight = new BlockPhantomLight().setLightLevel(1.0F).setLightOpacity(0).setHardness(0.3F).setCreativeTab(Glow.tab).setBlockName("phantomLight");
		glowstoneLamp = new BlockGlowstoneLamp().setLightLevel(1.0F).setLightOpacity(0).setHardness(0.5F).setCreativeTab(Glow.tab).setBlockName("glowstoneLamp");
	}
	
	private static void registerBlocks() {
		GameRegistry.registerBlock(phantomLight, "phantomLight");
		GameRegistry.registerBlock(glowstoneLamp, "glowstoneLamp");
	}
	
	public static void addRecipes() {
		
	}
}
