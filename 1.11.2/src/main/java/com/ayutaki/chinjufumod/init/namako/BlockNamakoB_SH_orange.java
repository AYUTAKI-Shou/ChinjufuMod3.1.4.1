package com.ayutaki.chinjufumod.init.namako;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

public class BlockNamakoB_SH_orange extends BlockNamakoB_Slab_orange {

	public BlockNamakoB_SH_orange(String unlocalizedName) {
		super(unlocalizedName);
		this.setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

	}

	@Override
	public boolean isDouble() {
		return false;
	}

}