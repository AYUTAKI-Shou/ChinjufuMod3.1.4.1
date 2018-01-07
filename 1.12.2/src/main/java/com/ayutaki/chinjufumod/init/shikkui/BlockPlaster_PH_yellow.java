package com.ayutaki.chinjufumod.init.shikkui;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

public class BlockPlaster_PH_yellow extends BlockPlaster_Slab_yellow {

	public BlockPlaster_PH_yellow(String unlocalizedName) {
		super(unlocalizedName);
		this.setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

	}

	@Override
	public boolean isDouble() {
		return false;
	}

}