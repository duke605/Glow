package duke605.ms.glow.item;

import java.text.DecimalFormat;
import java.util.List;

import duke605.ms.glow.lib.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class ItemGlowstoneGoggles extends ItemArmor {

	public static final ArmorMaterial MOD_CLOTH = EnumHelper.addArmorMaterial("MOD_CLOTH", 5, new int[]{1, 3, 2, 1}, 15);
	
	public ItemGlowstoneGoggles() {
		super(MOD_CLOTH, 4, 0);
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		int usage;
		
		if (world.isRemote)
			return;
		
		// Setting tag if stack does not have one		
		if (!stack.hasTagCompound())
			stack.setTagCompound(new NBTTagCompound());
		
		// Reducing usage when goggles are worn
		if ((usage = stack.getTagCompound().getInteger("usage")) > 0)
			stack.getTagCompound().setInteger("usage", --usage);
    }
	
	public void addInformation(ItemStack stack, EntityPlayer player, List l, boolean p_77624_4_) {
		if (!stack.hasTagCompound())
			stack.setTagCompound(new NBTTagCompound());
		
		l.add("Remaining: " + (stack.getTagCompound().getInteger("usage") / 20) + "s");
	}
	
	public void getSubItems(Item item, CreativeTabs tab, List l) {
        ItemStack stack = new ItemStack(this);
        stack.setTagCompound(new NBTTagCompound());
        stack.getTagCompound().setInteger("usage", 40);
        
        l.add(stack);
    }
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return Reference.DOMAIN + "textures/models/armor/glowstoneGoggles.png";
	}
}
