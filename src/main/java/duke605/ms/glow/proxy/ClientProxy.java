package duke605.ms.glow.proxy;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import duke605.ms.glow.handler.RenderHandler;
import duke605.ms.glow.lib.LibBlocks;
import duke605.ms.glow.lib.Reference;

public class ClientProxy extends CommonProxy {

	public void registerRenderers() {
		
		RenderingRegistry.registerBlockHandler(new RenderHandler());
	}
}
