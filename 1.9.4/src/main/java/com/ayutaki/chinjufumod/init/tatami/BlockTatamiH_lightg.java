package com.ayutaki.chinjufumod.init.tatami;

import java.util.List;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockTatamiH_lightg extends BlockTatami_lightg {

	public BlockTatamiH_lightg(String unlocalizedName) {
		super(unlocalizedName);
		this.setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);

	}

	@Override
	public boolean isDouble() {
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.tile.block_tatami.name", meta));
	}
}
