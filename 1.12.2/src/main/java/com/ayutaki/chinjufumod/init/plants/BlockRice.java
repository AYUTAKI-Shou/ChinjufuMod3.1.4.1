package com.ayutaki.chinjufumod.init.plants;

import java.util.Random;

import com.ayutaki.chinjufumod.init.TTimeItems;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockRice extends BlockCrops {

    private static final AxisAlignedBB[] CROPS_AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.125D, 0.75D),
    																			new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.3125D, 0.75D),
    																			new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.4375D, 0.75D),
    																			new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.625D, 0.75D),
    																			new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.75D, 0.75D),
    																			new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.9375D, 0.75D),
    																			new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.9375D, 0.75D),
    																			new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.9375D, 0.75D)};

	public BlockRice(String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));

	}

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {

        return CROPS_AABB[((Integer)state.getValue(this.getAgeProperty())).intValue()];
    }

	@Override
	protected Item getSeed() {
		return TTimeItems.SEEDS_RICE;

	}

	@Override
	protected Item getCrop() {
		return TTimeItems.INE;

	}

	/*キャベツ1, とうもろこし1. 白菜1. たまねぎ4. 米1. 大豆2. ほうれん草1. トマト4*/
	@Override
	public int quantityDropped(Random random) {
        return 1;
    }
}
