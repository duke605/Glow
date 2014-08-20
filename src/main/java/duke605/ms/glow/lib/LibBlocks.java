package duke605.ms.glow.lib;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.AnvilUpdateEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import duke605.ms.glow.Glow;
import duke605.ms.glow.block.BlockGhostLight;
import duke605.ms.glow.block.BlockGlowstoneLamp;

public class LibBlocks {

	// Blocks
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
		glowstoneLamp = new BlockGlowstoneLamp().setLightLevel(1.0F).setLightOpacity(0).setHardness(0.5F).setCreativeTab(Glow.tab).setBlockName("glowstoneLamp");
		ghostLight = new BlockGhostLight().setLightLevel(1.0F).setLightOpacity(0).setBlockUnbreakable().setBlockName("ghostLight");
	}
	
	private static void registerBlocks() {
		GameRegistry.registerBlock(glowstoneLamp, "glowstoneLamp");
		GameRegistry.registerBlock(ghostLight, "shouldntHave");
	}
	
	public static void addRecipes() {
		GameRegistry.addRecipe(new ItemStack(glowstoneLamp), new Object[] {"OPO", "PGP", "OPO", 'O', Blocks.obsidian, 'P', Blocks.glass_pane, 'G', Blocks.glowstone});
	}
}
