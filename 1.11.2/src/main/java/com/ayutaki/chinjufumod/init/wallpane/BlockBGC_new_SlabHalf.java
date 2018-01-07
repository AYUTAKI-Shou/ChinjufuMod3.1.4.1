package com.ayutaki.chinjufumod.init.wallpane;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

public class BlockBGC_new_SlabHalf extends BlockBGC_new_Slab {

	public BlockBGC_new_SlabHalf(String unlocalizedName) {
		super(unlocalizedName);
		this.setCreativeTab(ChinjufuModTabs.tab_wallpanel);
	}

	@Override
	public boolean isDouble() {
		return false;
	}

}
