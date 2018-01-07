package com.ayutaki.chinjufumod.init.pantry;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

public class BlockBoxH_Empty extends BlockBox_Empty {

	public BlockBoxH_Empty(String unlocalizedName) {
		super(unlocalizedName);
		this.setCreativeTab(ChinjufuModTabs.tab_teatime);

	}

	@Override
	public boolean isDouble() {
		return false;
	}

}
