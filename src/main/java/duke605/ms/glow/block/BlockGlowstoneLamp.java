package duke605.ms.glow.block;

import cpw.mods.fml.client.registry.RenderingRegistry;
import duke605.ms.glow.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class BlockGlowstoneLamp extends Block {

	public BlockGlowstoneLamp() {
		super(Material.glass);
		setBlockTextureName("glowstone");
		setBlockBounds(0.25F, 0.15F, 0.25F, 0.75F, 0.85F, 0.75F);
	}
	
	public int getRenderType() {
        return Reference.LAMP_RENDER_ID;
    }
	
	public boolean renderAsNormalBlock() {
		return false;
	}

	public boolean isOpaqueCube() {
		return false;
	}
}
