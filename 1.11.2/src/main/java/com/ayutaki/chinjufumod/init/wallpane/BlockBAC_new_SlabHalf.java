package com.ayutaki.chinjufumod.init.wallpane;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

public class BlockBAC_new_SlabHalf extends BlockBAC_new_Slab {

	public BlockBAC_new_SlabHalf(String unlocalizedName) {
		super(unlocalizedName);
		this.setCreativeTab(ChinjufuModTabs.tab_wallpanel);
	}

	@Override
	public boolean isDouble() {
		return false;
	}

}