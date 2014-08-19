package duke605.ms.glow.item;

import duke605.ms.glow.lib.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class ItemGlowstoneGoggles extends ItemArmor {

	public static final ArmorMaterial MOD_CLOTH = EnumHelper.addArmorMaterial("MOD_CLOTH", 5, new int[]{1, 3, 2, 1}, 15);
	
	public ItemGlowstoneGoggles() {
		super(MOD_CLOTH, 4, 0);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return Reference.DOMAIN + "textures/models/armor/glowstoneGoggles.png";
	}
}
