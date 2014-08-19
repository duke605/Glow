package duke605.ms.glow.block;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import duke605.ms.glow.lib.Reference;
import duke605.ms.glow.tileentity.TileEntityGhostLight;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockGhostLight extends BlockContainer {

	public BlockGhostLight() {
		super(Material.air);
		GameRegistry.registerTileEntity(TileEntityGhostLight.class, "ghostLight");
		setBlockTextureName(Reference.DOMAIN + "blank");
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
		return null;
	}

	public boolean isCollidable() {
        return false;
    }
	
	public boolean renderAsNormalBlock() {
		return false;
	}

	public boolean isOpaqueCube() {
		return false;
	}
	
	public int quantityDropped(Random rand) {
		return 0;
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return null;
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityGhostLight();
	}

}
