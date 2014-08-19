package duke605.ms.glow.tileentity;

import duke605.ms.glow.lib.LibBlocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChunkCoordinates;

public class TileEntityGhostLight extends TileEntity {

	public int[] coords;
	public boolean active;
	public int age;
	
	public TileEntityGhostLight() {
		active = false;
		age = 0;
	}
	
	public void updateEntity() {
		if (worldObj.isRemote)
			return;
		
		// Increasing age
		if (!active)
			age++;
		
		// Deleting block
		if (!active && age >= 60) {
			worldObj.setBlockToAir(xCoord, yCoord, zCoord);
		}
		
		// Lamp has gone
		if (active && (coords == null || coords.length < 3 || worldObj.getBlock(coords[0], coords[1], coords[2]) != LibBlocks.glowstoneLamp))
			worldObj.setBlockToAir(xCoord, yCoord, zCoord);
	}
	
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		
		coords = tag.getIntArray("lamp");
		active = tag.getBoolean("active");
	}

	public void writeToNBT(NBTTagCompound tag) {
		super.writeToNBT(tag);
		
		tag.setIntArray("lamp", coords);
		tag.setBoolean("active", active);
	}
}
