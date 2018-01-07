package com.ayutaki.chinjufumod.init.plants;

import java.util.List;
import java.util.Random;

import com.ayutaki.chinjufumod.init.TTimeItems;
import com.ayutaki.chinjufumod.init.TTimePlants;
import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;
import com.ayutaki.chinjufumod.util.CollisionHelper;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockSeedsBox extends BlockFacingSapo {

	private static final AxisAlignedBB BOUNDING_BOX_NORTH = CollisionHelper.getBlockBounds(EnumFacing.NORTH, 0.375, 0.0, 0.25, 0.625, 0.5, 0.75);
	private static final AxisAlignedBB BOUNDING_BOX_EAST = CollisionHelper.getBlockBounds(EnumFacing.EAST, 0.375, 0.0, 0.25, 0.625, 0.5, 0.75);
	private static final AxisAlignedBB BOUNDING_BOX_SOUTH = CollisionHelper.getBlockBounds(EnumFacing.SOUTH, 0.375, 0.0, 0.25, 0.625, 0.5, 0.75);
	private static final AxisAlignedBB BOUNDING_BOX_WEST = CollisionHelper.getBlockBounds(EnumFacing.WEST, 0.375, 0.0, 0.25, 0.625, 0.5, 0.75);
	private static final AxisAlignedBB[] BOUNDING_BOX = { BOUNDING_BOX_SOUTH, BOUNDING_BOX_WEST, BOUNDING_BOX_NORTH, BOUNDING_BOX_EAST };

	public BlockSeedsBox() {
		super(Material.GRASS);

		this.setSoundType(SoundType.PLANT);
		this.setHardness(0.5F);
		this.setResistance(1.0F);

	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {

		EnumFacing facing = state.getValue(FACING);
		return BOUNDING_BOX[facing.getHorizontalIndex()];
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB axisAligned, List<AxisAlignedBB> axisAlignedList, Entity collidingEntity) {

		EnumFacing facing = state.getValue(FACING);
		super.addCollisionBoxToList(pos, axisAligned, axisAlignedList, BOUNDING_BOX[facing.getHorizontalIndex()]);
	}

    protected int getSaplingDropChance(IBlockState state) {

        return 10;
    }

    @Override
    public java.util.List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {

        java.util.List<ItemStack> stack = new java.util.ArrayList<ItemStack>();
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        int chance = this.getSaplingDropChance(state);

        if (fortune > 0) {

            chance -= 10 << fortune;
            if (chance < 10) chance = 10;
        }

        if (rand.nextInt(chance) == 0)
        	stack.add(new ItemStack(TTimeItems.SEEDS_CABE, 1, damageDropped(state)));

        if (rand.nextInt(chance) == 0)
        	stack.add(new ItemStack(TTimeItems.SEEDS_HAKUSAI, 1, damageDropped(state)));

        if (rand.nextInt(chance) == 0)
        	stack.add(new ItemStack(TTimeItems.SEEDS_SOY, 1, damageDropped(state)));

        if (rand.nextInt(chance) == 0)
        	stack.add(new ItemStack(TTimeItems.SEEDS_SPINACH, 1, damageDropped(state)));

        if (rand.nextInt(chance) == 0)
        	stack.add(new ItemStack(TTimeItems.SEEDS_TOMATO, 1, damageDropped(state)));

        if (rand.nextInt(chance) == 0)
        	stack.add(new ItemStack(TTimeItems.SEEDS_CORN, 1, damageDropped(state)));

        if (rand.nextInt(chance) == 0)
        	stack.add(new ItemStack(TTimeItems.SEEDS_ONION, 1, damageDropped(state)));

        if (rand.nextInt(chance) == 0)
        	stack.add(new ItemStack(TTimeItems.SEEDS_RICE, 1, damageDropped(state)));

        if (rand.nextInt(chance) == 0)
        	stack.add(new ItemStack(TTimePlants.CHANOKI_nae, 1, damageDropped(state)));

        if (rand.nextInt(chance) == 0)
        	stack.add(new ItemStack(TTimePlants.BUDOUNOKI_nae, 1, damageDropped(state)));

        return stack;
    }

	@Override
	public boolean isOpaqueCube(IBlockState state) {
	    return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
	    return false;
	}

}