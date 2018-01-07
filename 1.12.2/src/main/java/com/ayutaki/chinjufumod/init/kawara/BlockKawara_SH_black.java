package com.ayutaki.chinjufumod.init.kawara;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

public class BlockKawara_SH_black extends BlockKawara_Slab_black {

	public BlockKawara_SH_black(String unlocalizedName) {
		super(unlocalizedName);
		this.setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

	}

	@Override
	public boolean isDouble() {
		return false;
	}

}