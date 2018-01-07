package com.ayutaki.chinjufumod.init.shikkui;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

public class BlockPlaster_PH_magenta extends BlockPlaster_Slab_magenta {

	public BlockPlaster_PH_magenta(String unlocalizedName) {
		super(unlocalizedName);
		this.setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

	}

	@Override
	public boolean isDouble() {
		return false;
	}

}