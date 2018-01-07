package com.ayutaki.chinjufumod.init.wallpane;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

public class BlockBDC_new_SlabHalf extends BlockBDC_new_Slab {

	public BlockBDC_new_SlabHalf(String unlocalizedName) {
		super(unlocalizedName);
		this.setCreativeTab(ChinjufuModTabs.tab_wallpanel);
	}

	@Override
	public boolean isDouble() {
		return false;
	}

}