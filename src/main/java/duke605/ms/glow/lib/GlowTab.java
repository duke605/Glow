package duke605.ms.glow.lib;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class GlowTab extends CreativeTabs {

	public GlowTab() {
		super("glow");
	}

	@Override
	public Item getTabIconItem() {
		return LibItems.glowstoneGoggles;
	}

}
