package duke605.ms.glow.handler;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import duke605.ms.glow.lib.LibItems;

public class EventManager {

	public static final EventManager INSTANCE = new EventManager();
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onTick(ClientTickEvent event) {
		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayer player = mc.thePlayer;
		
		if (mc == null || player == null)
			return;
		
		// Stopping night vision
		if (mc.gameSettings.gammaSetting > 1.0F)
			mc.gameSettings.gammaSetting = ConfigurationHandler.defaultGamma;
		
		// Activating night vision
		if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem() == LibItems.glowstoneGoggles)
			mc.gameSettings.gammaSetting = 10F;
	}
}
