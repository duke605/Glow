package duke605.ms.glow.tileentity;

import duke605.ms.glow.lib.LibBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;

public class TileEntityGlowstoneLamp extends TileEntity {

	public int[] prevBlock;
	
	public void updateEntity() {
		final int RANGE = 8;
		
		if (worldObj.isRemote)
			return;
		
		TileEntity te;
		
		// Updating TE
		if (prevBlock != null && worldObj.getBlock(prevBlock[0], prevBlock[1], prevBlock[2]) == LibBlocks.ghostLight) {
			te = worldObj.getTileEntity(prevBlock[0], prevBlock[1], prevBlock[2]);
			
			((TileEntityGhostLight)te).coords = new int[] {xCoord, yCoord, zCoord};
			((TileEntityGhostLight)te).active = true;
			prevBlock = null;
		}
		
		// Removing prevBlock
		else {
			prevBlock = null;
		}
	
		int xOff = MathHelper.getRandomIntegerInRange(worldObj.rand, -RANGE, RANGE);
		int yOff = MathHelper.getRandomIntegerInRange(worldObj.rand, -RANGE, RANGE);
		int zOff = MathHelper.getRandomIntegerInRange(worldObj.rand, -RANGE, RANGE);
		Block chosenBlock = worldObj.getBlock(xCoord + xOff, yCoord + yOff, zCoord + zOff);
		
		if (worldObj.getBlockLightValue(xCoord + xOff, yCoord + yOff, zCoord + zOff) <= 7 && chosenBlock == Blocks.air) {
			worldObj.setBlock(xCoord + xOff, yCoord + yOff, zCoord + zOff, LibBlocks.ghostLight);
			prevBlock = new int[] {xCoord + xOff, yCoord + yOff, zCoord + zOff};
		}
	}	
}
