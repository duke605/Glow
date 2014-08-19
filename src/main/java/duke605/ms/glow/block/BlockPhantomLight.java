package duke605.ms.glow.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import duke605.ms.glow.lib.Reference;

public class BlockPhantomLight extends Block {

	public BlockPhantomLight() {
		super(Material.glass);
		this.setTickRandomly(true);
		this.setBlockTextureName(Reference.DOMAIN + "blank");
		this.setBlockBounds(0.3F, 0.3F, 0.3F, 0.7F, 0.7F, 0.7F);
	}
	
	public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
		int runAmount = rand.nextInt(20) + 3;
		
		if (!isCollidable())
			return;
		
		// Spawning particles
		for (int i = 0;i < runAmount;i++) {
			world.spawnParticle("reddust", x + MathHelper.getRandomDoubleInRange(rand, (double) minX, (double) maxX), 
					y + MathHelper.getRandomDoubleInRange(rand, (double) minY, (double) maxY), 
					z + MathHelper.getRandomDoubleInRange(rand, (double) minZ, (double) maxZ), 1, 1, 0);
		}
	}
	
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z) {
        return AxisAlignedBB.getBoundingBox(x + this.minX, y + this.minY, z + this.minZ, x + this.maxX, y + this.maxY, z + this.maxZ);
    }

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
		return null;
	}
	
	public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) {
		return this.blockIcon;
    }
	
	public IIcon getIcon(int side, int meta) {
		return Blocks.glowstone.getIcon(side, 0);
    }

	public boolean isCollidable() {
		try {
			if (Minecraft.getMinecraft().thePlayer.getCurrentArmor(3) != null)
				return true;
		} catch (Exception e) {}
		
        return false;
    }
	
	public boolean isReplaceable(IBlockAccess world, int x, int y, int z) {
		return true;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	public boolean isOpaqueCube() {
		return false;
	}
}
