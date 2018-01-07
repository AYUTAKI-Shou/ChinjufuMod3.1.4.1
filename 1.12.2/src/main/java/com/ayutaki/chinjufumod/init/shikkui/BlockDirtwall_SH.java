package com.ayutaki.chinjufumod.init.shikkui;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

public class BlockDirtwall_SH extends BlockDirtwall_Slab {

	public BlockDirtwall_SH(String unlocalizedName) {
		super(unlocalizedName);
		this.setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

	}

	@Override
	public boolean isDouble() {
		return false;
	}

}