package com.ayutaki.chinjufumod.init.kawara;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;

public class BlockKawaraStairs_c extends BlockStairs {

	public BlockKawaraStairs_c(String unlocalizedName, IBlockState state) {

		super(state);

		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);

		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		this.setSoundType(SoundType.STONE);

		this.useNeighborBrightness = true;
	}

}
