package com.ayutaki.chinjufumod.init.wallpane;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBrick_stone_PIL_c extends BlockRotatedPillar {

    public BlockBrick_stone_PIL_c() {
        super(Material.ROCK);

        this.setHardness(2.0F);
        this.setResistance(10.0F);

        this.setSoundType(SoundType.STONE);
    }

}
