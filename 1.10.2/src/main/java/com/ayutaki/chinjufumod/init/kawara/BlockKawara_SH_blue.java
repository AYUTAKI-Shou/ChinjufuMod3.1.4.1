package com.ayutaki.chinjufumod.init.kawara;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

public class BlockKawara_SH_blue extends BlockKawara_Slab_blue {

	public BlockKawara_SH_blue(String unlocalizedName) {
		super(unlocalizedName);
		this.setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

	}

	@Override
	public boolean isDouble() {
		return false;
	}

}