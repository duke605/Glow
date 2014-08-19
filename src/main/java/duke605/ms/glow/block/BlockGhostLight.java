package duke605.ms.glow.block;

import java.util.Random;

import duke605.ms.glow.handler.ConfigurationHandler;
import duke605.ms.glow.lib.LibBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockGhostLight extends Block {

	public BlockGhostLight() {
		super(Material.air);
		setTickRandomly(true);
		setBlockTextureName("glowstone");
	}

	public void updateTick(World world, int x, int y, int z, Random rand) {
		final int RANGE = ConfigurationHandler.lampRange;

		// Removing blocks
		for (int xCoord = -RANGE;xCoord < RANGE;xCoord++)
			for (int yCoord = -RANGE;yCoord < RANGE;yCoord++)
				for (int zCoord = -RANGE;zCoord < RANGE;zCoord++)
					if (world.getBlock(x + xCoord, y + yCoord, z + zCoord) == LibBlocks.glowstoneLamp)
						return;

		// No lamp found
		world.setBlockToAir(x, y, z);
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
}
