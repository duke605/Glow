package duke605.ms.glow.tileentity;

import duke605.ms.glow.handler.ConfigurationHandler;
import duke605.ms.glow.lib.LibBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;

public class TileEntityGlowstoneLamp extends TileEntity {

	public void updateEntity() {
		final int RANGE = ConfigurationHandler.lampRange;

		if (worldObj.isRemote)
			return;

		// Placing ghost block
		for (int i = 0;i < 3;i++) {
			int xOff = MathHelper.getRandomIntegerInRange(worldObj.rand, -RANGE, RANGE);
			int yOff = MathHelper.getRandomIntegerInRange(worldObj.rand, -RANGE, RANGE);
			int zOff = MathHelper.getRandomIntegerInRange(worldObj.rand, -RANGE, RANGE);
			Block chosenBlock = worldObj.getBlock(xCoord + xOff, yCoord + yOff, zCoord + zOff);

			if (worldObj.getBlockLightValue(xCoord + xOff, yCoord + yOff, zCoord + zOff) <= 10 && chosenBlock == Blocks.air)
				worldObj.setBlock(xCoord + xOff, yCoord + yOff, zCoord + zOff, LibBlocks.ghostLight);
		}
	}
}	
