package com.ayutaki.chinjufumod.init.plants;

import java.util.Random;

import com.ayutaki.chinjufumod.init.TTimePlants;

import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCabbage_try extends BlockBush {

	/*苗木*/
	public BlockCabbage_try() {
		super(Material.PLANTS);

		this.setSoundType(SoundType.PLANT);
		this.setHardness(1.0F);
		this.setResistance(5.0F);

	}

	@Override
	public void onBlockAdded(World world, BlockPos pos, IBlockState state) {

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();

		world.scheduleUpdate(new BlockPos(i, j, k), this, this.tickRate(world));

	}

	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();

		if (world.isRemote) {

    		world.setBlockState(new BlockPos(i, j, k), TTimePlants.CABBAGE.getDefaultState());
    	}

    	else if (world.getBlockState(new BlockPos(i, j - 1, k)).getBlock() == Blocks.FARMLAND) {


    		if (world.getLightFromNeighbors(pos.up()) >= 9) {

    			world.setBlockState(new BlockPos(i, j, k), TTimePlants.CABBAGE.getDefaultState());
    		}
    		world.scheduleUpdate(new BlockPos(i, j, k), this, this.tickRate(world));
    	}
	}

	@Override
	public int tickRate(World world) {
		return 1000;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return new AxisAlignedBB(0.1875D, 0.0D, 0.1875D, 0.8125D, 0.75D, 0.8125D);
	}

	/*ドロップ管理*/
	public boolean canSilkHarvest(World world, EntityPlayer player, int x, int y, int z, int metadata) {

	    return false;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {

		return new ItemStack(TTimePlants.CABBAGE).getItem();
	}

	@Override
	public int quantityDropped(Random random) {
        return 1;
    }

	/*抽出管理*/
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {

		return new ItemStack(TTimePlants.CABBAGE);
	}

	/*描画管理*/
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

}
