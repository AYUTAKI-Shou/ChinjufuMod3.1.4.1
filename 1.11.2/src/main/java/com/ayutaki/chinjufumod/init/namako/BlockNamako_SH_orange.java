package com.ayutaki.chinjufumod.init.namako;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

public class BlockNamako_SH_orange extends BlockNamako_Slab_orange {

	public BlockNamako_SH_orange(String unlocalizedName) {
		super(unlocalizedName);
		this.setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

	}

	@Override
	public boolean isDouble() {
		return false;
	}

}