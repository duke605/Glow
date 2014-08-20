package duke605.ms.glow.handler;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.AnvilUpdateEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import duke605.ms.glow.lib.LibItems;

public class EventManager {

	public static final EventManager INSTANCE = new EventManager();
	
	@SubscribeEvent
	public void onAnvil(AnvilUpdateEvent event) {
		event.materialCost = 1;
		
		ItemStack left = event.left;
		ItemStack right = event.right;

		// Do nothing cause there is nothing to do!!!
		if (left == null || right == null || left.getItem() != LibItems.glowstoneGoggles || right.getItem() != Items.glowstone_dust || !left.hasTagCompound() || left.getTagCompound().getInteger("usage") >= 8192)
			return;
		
		event.output = left.copy();
		event.output.getTagCompound().setInteger("usage", Math.min(left.getTagCompound().getInteger("usage") + 128, 8192));
		event.cost = 1;
	}
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onTick(ClientTickEvent event) {
		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayer player = mc.thePlayer;
		
		if (mc == null || player == null)
			return;
		
		// Stopping night vision
		if (mc.gameSettings.gammaSetting < 1313.0F)
			mc.gameSettings.gammaSetting = ConfigurationHandler.defaultGamma;
		
		// Normal goggles
		if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem() == LibItems.glowstoneGoggles)
			tickGlowstoneGoggles(mc, player);
		
		// Advanced goggles
		else if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem() == LibItems.energenticGlowstoneGoggles)
			mc.gameSettings.gammaSetting = 1313F;
	}
	
	/**
	 * Called when a player wearing normal googles ticks
	 * 
	 * @param mc
	 * @param player
	 */
	private void tickGlowstoneGoggles(Minecraft mc, EntityPlayer player) {
		ItemStack goggles = player.getCurrentArmor(3);
		
		if (goggles.hasTagCompound() && goggles.getTagCompound().getInteger("usage") > 0)
			mc.gameSettings.gammaSetting = 1313F;
	}
}
