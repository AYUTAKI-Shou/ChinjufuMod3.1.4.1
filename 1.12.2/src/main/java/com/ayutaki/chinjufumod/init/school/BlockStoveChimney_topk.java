package com.ayutaki.chinjufumod.init.school;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockStoveChimney_topk extends Block {

    public BlockStoveChimney_topk(Material material) {
        super(material);

		this.setSoundType(SoundType.METAL);
		this.setHardness(1.0F);
		this.setResistance(10.0F);

    }

    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    public boolean isFullCube(IBlockState state) {
        return false;
    }
}
