package com.ayutaki.chinjufumod.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockDummyPlaster extends Block {

	public BlockDummyPlaster() {
		super(Material.WOOD);

		this.setSoundType(SoundType.STONE);
		this.setHardness(1.0F);
		this.setResistance(10.0F);

	}

}
