package com.ayutaki.chinjufumod.init.wallpane;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockStone_c extends Block {

	public BlockStone_c() {
		super(Material.ROCK);

		this.setSoundType(SoundType.STONE);
		this.setHardness(2.0F);
		this.setResistance(10.0F);

	}

}
