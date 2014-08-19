package duke605.ms.glow.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import duke605.ms.glow.Glow;
import duke605.ms.glow.block.BlockGhostLight;
import duke605.ms.glow.block.BlockGlowstoneLamp;
import duke605.ms.glow.block.BlockPhantomLight;
import net.minecraft.block.Block;

public class LibBlocks {

	// Blocks
	public static Block phantomLight;
	public static Block glowstoneLamp;
	public static Block ghostLight;
	
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
		ghostLight = new BlockGhostLight().setLightLevel(1.0F).setLightOpacity(0).setBlockUnbreakable().setBlockName("ghostLight");
	}
	
	private static void registerBlocks() {
		GameRegistry.registerBlock(phantomLight, "phantomLight");
		GameRegistry.registerBlock(glowstoneLamp, "glowstoneLamp");
		GameRegistry.registerBlock(ghostLight, "shouldntHave");
	}
	
	public static void addRecipes() {
		
	}
}
