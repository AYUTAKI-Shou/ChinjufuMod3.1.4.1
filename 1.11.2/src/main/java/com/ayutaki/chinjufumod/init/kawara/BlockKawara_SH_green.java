package com.ayutaki.chinjufumod.init.kawara;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

public class BlockKawara_SH_green extends BlockKawara_Slab_green {

	public BlockKawara_SH_green(String unlocalizedName) {
		super(unlocalizedName);
		this.setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

	}

	@Override
	public boolean isDouble() {
		return false;
	}

}