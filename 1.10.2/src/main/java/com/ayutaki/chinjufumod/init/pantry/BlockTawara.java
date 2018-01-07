package com.ayutaki.chinjufumod.init.pantry;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockTawara extends BlockRotatedPillar {

    public BlockTawara() {
        super(Material.WOOD);

        this.setHardness(2.0F);
        this.setResistance(5.0F);

        this.setSoundType(SoundType.PLANT);
    }

}
