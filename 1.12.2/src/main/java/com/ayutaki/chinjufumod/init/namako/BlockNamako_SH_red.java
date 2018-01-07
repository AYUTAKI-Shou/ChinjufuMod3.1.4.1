package com.ayutaki.chinjufumod.init.namako;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

public class BlockNamako_SH_red extends BlockNamako_Slab_red {

	public BlockNamako_SH_red(String unlocalizedName) {
		super(unlocalizedName);
		this.setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

	}

	@Override
	public boolean isDouble() {
		return false;
	}

}