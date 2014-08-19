package duke605.ms.glow.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import duke605.ms.glow.lib.LibItems;
import duke605.ms.glow.lib.Reference;

public class ItemMisc extends Item {

	@SideOnly(Side.CLIENT)
	public IIcon[] icons;
	public final String[] textureNames = {"glowLens"};

	public ItemMisc() {
		setHasSubtypes(true);
	}

	public String getUnlocalizedName(ItemStack stack) {
		return getUnlocalizedName() + "." + textureNames[MathHelper.clamp_int(stack.getItemDamage(), 0, textureNames.length - 1)];
	}

	public void registerIcons(IIconRegister reg) {
		icons = new IIcon[textureNames.length];

		for (int i = 0;i < textureNames.length;i++)
			icons[i] = reg.registerIcon(Reference.DOMAIN + textureNames[i]);
	}

	public IIcon getIconFromDamage(int meta) {
		return icons[MathHelper.clamp_int(meta, 0, textureNames.length - 1)];
	}

	public void getSubItems(Item item, CreativeTabs tab, List l) {
		for (int i = 0;i < textureNames.length;i++)
			l.add(new ItemStack(item, 1, i));
	}

	// Item Stacks
	public static final int GLOW_LENS = 0;
}
