package duke605.ms.glow.handler;

import org.lwjgl.opengl.GL11;

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
	public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks rb) {
		Tessellator t = Tessellator.instance;
		IIcon obby = rb.getBlockIcon(Blocks.obsidian);
		IIcon glass = rb.getBlockIcon(Blocks.glass);
		IIcon glow = rb.getBlockIcon(Blocks.glowstone);

		// Section 1 - Obby pole
		rb.setRenderBounds(0.25, 0.2, 0.25, 0.3, 0.8, 0.3);
		GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
		GL11.glScalef(1.4F, 1.4F, 1.4F);
		
		t.startDrawingQuads();
		t.setNormal(1.0F, 0.0F, 0.0F);
		rb.renderFaceXPos(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(-1.0F, 0.0F, 0.0F);
		rb.renderFaceXNeg(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(0.0F, 0.0F, 1.0F);
		rb.renderFaceZPos(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(0.0F, 0.0F, -1.0F);
		rb.renderFaceZNeg(block, 0, 0, 0, obby);
		t.draw();

		// Setion 2 - Obby pole
		rb.setRenderBounds(0.7, 0.2, 0.7, 0.75, 0.8, 0.75);

		t.startDrawingQuads();
		t.setNormal(1.0F, 0.0F, 0.0F);
		rb.renderFaceXPos(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(-1.0F, 0.0F, 0.0F);
		rb.renderFaceXNeg(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(0.0F, 0.0F, 1.0F);
		rb.renderFaceZPos(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(0.0F, 0.0F, -1.0F);
		rb.renderFaceZNeg(block, 0, 0, 0, obby);
		t.draw();

		// Setion 3 - Obby pole
		rb.setRenderBounds(0.25, 0.2, 0.7, 0.3, 0.8, 0.75);

		t.startDrawingQuads();
		t.setNormal(1.0F, 0.0F, 0.0F);
		rb.renderFaceXPos(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(-1.0F, 0.0F, 0.0F);
		rb.renderFaceXNeg(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(0.0F, 0.0F, 1.0F);
		rb.renderFaceZPos(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(0.0F, 0.0F, -1.0F);
		rb.renderFaceZNeg(block, 0, 0, 0, obby);
		t.draw();

		// Section 4 - Obby pole
		rb.setRenderBounds(0.7, 0.2, 0.25, 0.75, 0.8, 0.3);

		t.startDrawingQuads();
		t.setNormal(1.0F, 0.0F, 0.0F);
		rb.renderFaceXPos(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(-1.0F, 0.0F, 0.0F);
		rb.renderFaceXNeg(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(0.0F, 0.0F, 1.0F);
		rb.renderFaceZPos(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(0.0F, 0.0F, -1.0F);
		rb.renderFaceZNeg(block, 0, 0, 0, obby);
		t.draw();



		// Section 5 - Obby Bottom
		rb.setRenderBounds(0.25, 0.15, 0.25, 0.75, 0.2, 0.75);

		t.startDrawingQuads();
		t.setNormal(1.0F, 0.0F, 0.0F);
		rb.renderFaceXPos(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(-1.0F, 0.0F, 0.0F);
		rb.renderFaceXNeg(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(0.0F, 0.0F, 1.0F);
		rb.renderFaceZPos(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(0.0F, 0.0F, -1.0F);
		rb.renderFaceZNeg(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(0.0F, 1.0F, 0.0F);
		rb.renderFaceYPos(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(0.0F, -1.0F, 0.0F);
		rb.renderFaceYNeg(block, 0, 0, 0, obby);
		t.draw();

		// Section 6 - Obby Top
		rb.setRenderBounds(0.25, 0.8, 0.25, 0.75, 0.85, 0.75);

		t.startDrawingQuads();
		t.setNormal(1.0F, 0.0F, 0.0F);
		rb.renderFaceXPos(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(-1.0F, 0.0F, 0.0F);
		rb.renderFaceXNeg(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(0.0F, 0.0F, 1.0F);
		rb.renderFaceZPos(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(0.0F, 0.0F, -1.0F);
		rb.renderFaceZNeg(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(0.0F, 1.0F, 0.0F);
		rb.renderFaceYPos(block, 0, 0, 0, obby);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(0.0F, -1.0F, 0.0F);
		rb.renderFaceYNeg(block, 0, 0, 0, obby);
		t.draw();

		// Section 7 - Glass
		rb.setRenderBounds(0.26, 0.2, 0.26, 0.74, 0.8, 0.74);

		t.startDrawingQuads();
		t.setNormal(1.0F, 0.0F, 0.0F);
		rb.renderFaceXPos(block, 0, 0, 0, glass);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(-1.0F, 0.0F, 0.0F);
		rb.renderFaceXNeg(block, 0, 0, 0, glass);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(0.0F, 0.0F, 1.0F);
		rb.renderFaceZPos(block, 0, 0, 0, glass);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(0.0F, 0.0F, -1.0F);
		rb.renderFaceZNeg(block, 0, 0, 0, glass);
		t.draw();

		// Section 8 - Glowstone
		rb.setRenderBounds(0.3, 0.2, 0.3, 0.7, 0.8, 0.7);

		t.startDrawingQuads();
		t.setNormal(1.0F, 0.0F, 0.0F);
		rb.renderFaceXPos(block, 0, 0, 0, glow);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(-1.0F, 0.0F, 0.0F);
		rb.renderFaceXNeg(block, 0, 0, 0, glow);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(0.0F, 0.0F, 1.0F);
		rb.renderFaceZPos(block, 0, 0, 0, glow);
		t.draw();

		t.startDrawingQuads();
		t.setNormal(0.0F, 0.0F, -1.0F);
		rb.renderFaceZNeg(block, 0, 0, 0, glow);
		t.draw();

		GL11.glTranslatef(0.0F, 0.0F, 0.0F);
		GL11.glScalef(1.0F, 1.0F, 1.0F);
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
