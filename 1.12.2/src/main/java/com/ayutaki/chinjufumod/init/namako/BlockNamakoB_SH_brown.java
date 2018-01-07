package com.ayutaki.chinjufumod.init.namako;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

public class BlockNamakoB_SH_brown extends BlockNamakoB_Slab_brown {

	public BlockNamakoB_SH_brown(String unlocalizedName) {
		super(unlocalizedName);
		this.setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

	}

	@Override
	public boolean isDouble() {
		return false;
	}

}