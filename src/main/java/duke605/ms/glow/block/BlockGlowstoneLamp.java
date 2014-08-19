package duke605.ms.glow.block;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import duke605.ms.glow.lib.Reference;
import duke605.ms.glow.tileentity.TileEntityGlowstoneLamp;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockGlowstoneLamp extends BlockContainer {

	public BlockGlowstoneLamp() {
		super(Material.glass);
		setBlockTextureName("glowstone");
		setBlockBounds(0.25F, 0.15F, 0.25F, 0.75F, 0.85F, 0.75F);
		GameRegistry.registerTileEntity(TileEntityGlowstoneLamp.class, "glowstoneLamp");
	}
	
	public int getRenderType() {
        return Reference.LAMP_RENDER_ID;
    }
	
	public boolean renderAsNormalBlock() {
		return false;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int noIdea) {
		return new TileEntityGlowstoneLamp();
	}
}
