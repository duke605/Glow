package duke605.ms.glow.lib;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import duke605.ms.glow.Glow;
import duke605.ms.glow.item.ItemEnergeticGlowstoneGoggles;
import duke605.ms.glow.item.ItemGlowstoneGoggles;
import duke605.ms.glow.item.ItemMisc;

public class LibItems {

	// Items
	public static Item misc;
	public static Item glowstoneGoggles;
	public static Item energenticGlowstoneGoggles;
	
	/**
	 * Starts Items
	 */
	public static void initItems() {
		assignItems();
		registerItems();
		addRecipes();
	}
	
	private static void assignItems() {
		misc = new ItemMisc().setCreativeTab(Glow.tab).setUnlocalizedName("misc");
		glowstoneGoggles = new ItemGlowstoneGoggles().setCreativeTab(Glow.tab).setUnlocalizedName("glowstoneGoggles").setTextureName(Reference.DOMAIN + "glowstoneGoggles");
		energenticGlowstoneGoggles = new ItemEnergeticGlowstoneGoggles().setCreativeTab(Glow.tab).setUnlocalizedName("energeticGlowstoneGoggles").setTextureName(Reference.DOMAIN + "energeticGlowstoneGoggles");
	}
	
	private static void registerItems() {
		GameRegistry.registerItem(misc, "misc");
		GameRegistry.registerItem(glowstoneGoggles, "glowstoneGoggles");
		GameRegistry.registerItem(energenticGlowstoneGoggles, "energeticGlowstoneGoggles");
	}
	
	private static void addRecipes() {
		GameRegistry.addRecipe(new ItemStack(misc), new Object[] {" G ", "GPG", " G ", 'G', Items.glowstone_dust, 'P', Blocks.glass_pane});
		GameRegistry.addRecipe(new ItemStack(misc, 1, ItemMisc.EG_LENS), new Object[] {" G ", "GPG", " G ", 'G', new ItemStack(misc, 1, ItemMisc.EGD), 'P', Blocks.glass_pane});
		GameRegistry.addRecipe(new ItemStack(glowstoneGoggles), new Object[] {"SLS", "S S", "GLG", 'S', Items.string, 'L', Items.leather, 'G', new ItemStack(misc)});
		GameRegistry.addRecipe(new ItemStack(energenticGlowstoneGoggles), new Object[] {"SAS", "S S", "GIG", 'S', Items.string, 'a', Items.gold_ingot, 'G', new ItemStack(misc, 1, ItemMisc.EG_LENS), 'I', Items.iron_ingot});
		
		GameRegistry.addShapelessRecipe(new ItemStack(misc, 1, ItemMisc.EGD), new Object[] {Items.glowstone_dust, Items.blaze_powder, Items.redstone});
	}
}
