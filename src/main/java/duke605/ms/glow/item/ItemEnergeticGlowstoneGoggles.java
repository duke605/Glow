package duke605.ms.glow.item;

import duke605.ms.glow.lib.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class ItemEnergeticGlowstoneGoggles extends ItemArmor {
	
	public ItemEnergeticGlowstoneGoggles() {
		super(ArmorMaterial.CHAIN, 4, 0);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return Reference.DOMAIN + "textures/models/armor/energeticGlowstoneGoggles.png";
	}
}
