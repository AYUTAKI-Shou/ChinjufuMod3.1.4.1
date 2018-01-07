package com.ayutaki.chinjufumod.init.wallpane;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockPillar_plank_c extends BlockRotatedPillar {

    public BlockPillar_plank_c() {
        super(Material.WOOD);

        this.setHardness(2.0F);
        this.setResistance(5.0F);

        this.setSoundType(SoundType.WOOD);
    }

}
