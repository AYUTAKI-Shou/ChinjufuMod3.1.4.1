package com.ayutaki.chinjufumod.init.shikkui;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

public class BlockPlaster_PH_green extends BlockPlaster_Slab_green {

	public BlockPlaster_PH_green(String unlocalizedName) {
		super(unlocalizedName);
		this.setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

	}

	@Override
	public boolean isDouble() {
		return false;
	}

}