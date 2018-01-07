package com.ayutaki.chinjufumod.init.kawara;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

public class BlockKawara_SH_gray extends BlockKawara_Slab_gray {

	public BlockKawara_SH_gray(String unlocalizedName) {
		super(unlocalizedName);
		this.setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

	}

	@Override
	public boolean isDouble() {
		return false;
	}

}