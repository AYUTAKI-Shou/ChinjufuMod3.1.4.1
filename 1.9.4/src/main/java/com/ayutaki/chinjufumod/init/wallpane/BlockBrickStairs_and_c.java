package com.ayutaki.chinjufumod.init.wallpane;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockBrickStairs_and_c extends BlockStairs {

	public BlockBrickStairs_and_c(String unlocalizedName, IBlockState state) {
		super(state);

		this.setHardness(2.0F);
		this.setResistance(10.0F);

		this.useNeighborBrightness = true;
	}

}
