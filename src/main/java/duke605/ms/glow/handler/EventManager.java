package duke605.ms.glow.handler;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
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
		ItemStack left = event.left;
		ItemStack right = event.right;
		int amountNeeded;
		int remain;

		// Do nothing cause there is nothing to do!!!
		if (left == null || right == null || left.getItem() != LibItems.glowstoneGoggles || right.getItem() != Items.glowstone_dust || !left.hasTagCompound() || left.getTagCompound().getInteger("usage") >= 8192)
			return;

		event.output = left.copy();

		// Figuring out amount needed
		remain = event.output.getTagCompound().getInteger("usage");
		for (amountNeeded = 0;amountNeeded <= right.stackSize && Math.min((amountNeeded * 128) + remain, 8192) != 8192;amountNeeded++);
		event.materialCost = amountNeeded;

		// Increasing time
		event.output.getTagCompound().setInteger("usage", Math.min(remain + (amountNeeded * 128), 8192));
		
		System.out.println(event.name);
		// Setting name
		if (event.name.isEmpty())
			event.cost = 1;
		else {
			event.cost = 6;
			event.output.setStackDisplayName(event.name);
		}
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onTick(ClientTickEvent event) {
		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayer player = mc.thePlayer;

		if (mc == null || player == null)
			return;

		// Stopping night vision
		if (mc.gameSettings.gammaSetting == 1313.0F)
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
	@SideOnly(Side.CLIENT)
	private void tickGlowstoneGoggles(Minecraft mc, EntityPlayer player) {
		ItemStack goggles = player.getCurrentArmor(3);

		if (goggles.hasTagCompound() && goggles.getTagCompound().getInteger("usage") > 0)
			mc.gameSettings.gammaSetting = 1313F;
	}
}
