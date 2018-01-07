package com.ayutaki.chinjufumod.init.school;

import java.util.Random;

import com.ayutaki.chinjufumod.init.New_ChinjufuModSchool;
import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public abstract class BlockWindow_Left_d extends BlockFacingSapo {

	public abstract boolean isOpen();

	public BlockWindow_Left_d(Material material) {
		super(material);

		this.setHardness(1.0F);
		this.setResistance(0.5F);
		this.setSoundType(SoundType.GLASS);

		if(!isOpen()) {

		}
		else {

		}
	}

	@Override
	public boolean isTranslucent(IBlockState state) {

		return true;
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing,
			float hitX, float hitY, float hitZ) {

		if(isOpen()) {

			return worldIn.setBlockState(pos, New_ChinjufuModSchool.WINDOW_d.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		if (playerIn.isSneaking()) {

			return worldIn.setBlockState(pos, New_ChinjufuModSchool.WINDOW_OR_d.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		else {

			return worldIn.setBlockState(pos, New_ChinjufuModSchool.WINDOW_OL_d.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}
	}


	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {

		return new ItemStack(New_ChinjufuModSchool.WINDOW_d).getItem();
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {

		return new ItemStack(New_ChinjufuModSchool.WINDOW_d);
	}

	@Override
	protected BlockStateContainer createBlockState() {

		return isOpen() ? new BlockStateContainer(this, new IProperty[] { FACING }) : super.createBlockState();
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
	    return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
	    return false;
	}

	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}
}
