package duke605.ms.glow.handler;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import duke605.ms.glow.lib.Reference;

public class RenderHandler implements ISimpleBlockRenderingHandler {

	@Override
	public void renderInventoryBlock(Block block, int metadata, int ID, RenderBlocks renderer) {
		IIcon obsidian = Blocks.obsidian.getIcon(0, metadata);
		IIcon glass = Blocks.glass.getIcon(0, metadata);
		IIcon glowstone = Blocks.glowstone.getIcon(0, metadata);

		Tessellator tess = Tessellator.instance;

		renderer.setRenderBounds(0.25D, 0.2D, 0.25D, 0.3D, 0.8D, 0.3D);

		tess.startDrawingQuads();
		tess.setNormal(0.0F, -1.0F, 0.0F);
		renderer.renderFaceYNeg(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 1.0F, 0.0F);
		renderer.renderFaceYPos(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 0.0F, -1.0F);
		renderer.renderFaceZNeg(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 0.0F, 1.0F);
		renderer.renderFaceZPos(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(-1.0F, 0.0F, 0.0F);
		renderer.renderFaceXNeg(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(1.0F, 0.0F, 0.0F);
		renderer.renderFaceXPos(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		renderer.setRenderBounds(0.7, 0.2, 0.7, 0.75, 0.8, 0.75);

		tess.startDrawingQuads();
		tess.setNormal(0.0F, -1.0F, 0.0F);
		renderer.renderFaceYNeg(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 1.0F, 0.0F);
		renderer.renderFaceYPos(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 0.0F, -1.0F);
		renderer.renderFaceZNeg(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 0.0F, 1.0F);
		renderer.renderFaceZPos(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(-1.0F, 0.0F, 0.0F);
		renderer.renderFaceXNeg(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(1.0F, 0.0F, 0.0F);
		renderer.renderFaceXPos(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		renderer.setRenderBounds(0.25, 0.2, 0.7, 0.3, 0.8, 0.75);

		tess.startDrawingQuads();
		tess.setNormal(0.0F, -1.0F, 0.0F);
		renderer.renderFaceYNeg(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 1.0F, 0.0F);
		renderer.renderFaceYPos(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 0.0F, -1.0F);
		renderer.renderFaceZNeg(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 0.0F, 1.0F);
		renderer.renderFaceZPos(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(-1.0F, 0.0F, 0.0F);
		renderer.renderFaceXNeg(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(1.0F, 0.0F, 0.0F);
		renderer.renderFaceXPos(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		renderer.setRenderBounds(0.7, 0.2, 0.25, 0.75, 0.8, 0.3);

		tess.startDrawingQuads();
		tess.setNormal(0.0F, -1.0F, 0.0F);
		renderer.renderFaceYNeg(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 1.0F, 0.0F);
		renderer.renderFaceYPos(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 0.0F, -1.0F);
		renderer.renderFaceZNeg(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 0.0F, 1.0F);
		renderer.renderFaceZPos(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(-1.0F, 0.0F, 0.0F);
		renderer.renderFaceXNeg(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(1.0F, 0.0F, 0.0F);
		renderer.renderFaceXPos(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		// Bottom
		renderer.setRenderBounds(0.25, 0.15, 0.25, 0.75, 0.2, 0.75);

		tess.startDrawingQuads();
		tess.setNormal(0.0F, -1.0F, 0.0F);
		renderer.renderFaceYNeg(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 1.0F, 0.0F);
		renderer.renderFaceYPos(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 0.0F, -1.0F);
		renderer.renderFaceZNeg(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 0.0F, 1.0F);
		renderer.renderFaceZPos(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(-1.0F, 0.0F, 0.0F);
		renderer.renderFaceXNeg(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(1.0F, 0.0F, 0.0F);
		renderer.renderFaceXPos(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		// Top
		renderer.setRenderBounds(0.25, 0.8, 0.25, 0.75, 0.85, 0.75);

		tess.startDrawingQuads();
		tess.setNormal(0.0F, -1.0F, 0.0F);
		renderer.renderFaceYNeg(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 1.0F, 0.0F);
		renderer.renderFaceYPos(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 0.0F, -1.0F);
		renderer.renderFaceZNeg(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 0.0F, 1.0F);
		renderer.renderFaceZPos(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(-1.0F, 0.0F, 0.0F);
		renderer.renderFaceXNeg(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(1.0F, 0.0F, 0.0F);
		renderer.renderFaceXPos(block, 0.0D, 0.0D, 0.0D, obsidian);
		tess.draw();

		// Glass
		renderer.setRenderBounds(0.26, 0.2, 0.26, 0.74, 0.8, 0.74);

		tess.startDrawingQuads();
		tess.setNormal(0.0F, -1.0F, 0.0F);
		renderer.renderFaceYNeg(block, 0.0D, 0.0D, 0.0D, glass);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 1.0F, 0.0F);
		renderer.renderFaceYPos(block, 0.0D, 0.0D, 0.0D, glass);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 0.0F, -1.0F);
		renderer.renderFaceZNeg(block, 0.0D, 0.0D, 0.0D, glass);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 0.0F, 1.0F);
		renderer.renderFaceZPos(block, 0.0D, 0.0D, 0.0D, glass);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(-1.0F, 0.0F, 0.0F);
		renderer.renderFaceXNeg(block, 0.0D, 0.0D, 0.0D, glass);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(1.0F, 0.0F, 0.0F);
		renderer.renderFaceXPos(block, 0.0D, 0.0D, 0.0D, glass);
		tess.draw();

		// Inner
		renderer.setRenderBounds(0.3, 0.2, 0.3, 0.7, 0.8, 0.7);

		tess.startDrawingQuads();
		tess.setNormal(0.0F, -1.0F, 0.0F);
		renderer.renderFaceYNeg(block, 0.0D, 0.0D, 0.0D, glowstone);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 1.0F, 0.0F);
		renderer.renderFaceYPos(block, 0.0D, 0.0D, 0.0D, glowstone);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 0.0F, -1.0F);
		renderer.renderFaceZNeg(block, 0.0D, 0.0D, 0.0D, glowstone);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(0.0F, 0.0F, 1.0F);
		renderer.renderFaceZPos(block, 0.0D, 0.0D, 0.0D, glowstone);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(-1.0F, 0.0F, 0.0F);
		renderer.renderFaceXNeg(block, 0.0D, 0.0D, 0.0D, glowstone);
		tess.draw();

		tess.startDrawingQuads();
		tess.setNormal(1.0F, 0.0F, 0.0F);
		renderer.renderFaceXPos(block, 0.0D, 0.0D, 0.0D, glowstone);
		tess.draw();
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks rb) {
		rb.renderAllFaces = true;
		
		rb.setOverrideBlockTexture(rb.getBlockIcon(Blocks.obsidian));
		rb.setRenderBounds(0.25, 0.2, 0.25, 0.3, 0.8, 0.3);
		rb.renderStandardBlock(block, x, y, z);
		
		rb.setRenderBounds(0.7, 0.2, 0.7, 0.75, 0.8, 0.75);
		rb.renderStandardBlock(block, x, y, z);
		
		rb.setRenderBounds(0.25, 0.2, 0.7, 0.3, 0.8, 0.75);
		rb.renderStandardBlock(block, x, y, z);
		
		rb.setRenderBounds(0.7, 0.2, 0.25, 0.75, 0.8, 0.3);
		rb.renderStandardBlock(block, x, y, z);
		
		// Bottom
		rb.setRenderBounds(0.25, 0.15, 0.25, 0.75, 0.2, 0.75);
		rb.renderStandardBlock(block, x, y, z);
		
		// Top
		rb.setRenderBounds(0.25, 0.8, 0.25, 0.75, 0.85, 0.75);
		rb.renderStandardBlock(block, x, y, z);
		
		// Glass
		rb.setOverrideBlockTexture(rb.getBlockIcon(Blocks.glass));
		rb.setRenderBounds(0.26, 0.2, 0.26, 0.74, 0.8, 0.74);
		rb.renderStandardBlock(block, x, y, z);
		
		// Inner
		rb.setOverrideBlockTexture(rb.getBlockIcon(Blocks.glowstone));
		rb.setRenderBounds(0.3, 0.2, 0.3, 0.7, 0.8, 0.7);
		rb.renderStandardBlock(block, x, y, z);			
		
		// Supports
		// TOP
		if (world.getBlock(x, y + 1, z).isSideSolid(world, x, y + 1, z, ForgeDirection.DOWN)) {
			rb.setOverrideBlockTexture(rb.getBlockIcon(Blocks.obsidian));
			
			// Base
			rb.setRenderBounds(0.4, 0.85, 0.4, 0.6, 0.9, 0.6);
			rb.renderStandardBlock(block, x, y, z);
			
			// Connection
			rb.setRenderBounds(0.45, 0.9, 0.45, 0.55, 1, 0.55);
			rb.renderStandardBlock(block, x, y, z);
		}
		
		// BOTTOM
		else if (world.getBlock(x, y - 1, z).isSideSolid(world, x, y - 1, z, ForgeDirection.UP)) {
			rb.setOverrideBlockTexture(rb.getBlockIcon(Blocks.obsidian));
			
			// Base
			rb.setRenderBounds(0.4, 0.1, 0.4, 0.6, 0.15, 0.6);
			rb.renderStandardBlock(block, x, y, z);
			
			// Connection
			rb.setRenderBounds(0.45, 0.0, 0.45, 0.55, 0.1, 0.55);
			rb.renderStandardBlock(block, x, y, z);
		}
		
		rb.renderAllFaces = false;
		rb.clearOverrideBlockTexture();
		
		return true;
	}

	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		return true;
	}

	@Override
	public int getRenderId() {
		return Reference.LAMP_RENDER_ID;
	}

}
