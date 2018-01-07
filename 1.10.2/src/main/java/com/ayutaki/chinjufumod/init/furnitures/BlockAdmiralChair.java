package com.ayutaki.chinjufumod.init.furnitures;

import java.util.List;

import com.ayutaki.chinjufumod.entity.EntitySittableBlock;
import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;
import com.ayutaki.chinjufumod.util.CollisionHelper;
import com.ayutaki.chinjufumod.util.SittableUtil;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockAdmiralChair extends BlockFacingSapo {

	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.0, 0.0, 0.0, 1.0, 0.875, 1.0);

	private static final AxisAlignedBB CHAIR_BASE = new AxisAlignedBB(0.1, 0.0, 0.1, 0.9, 0.5625, 0.9);
	private static final AxisAlignedBB CHAIR_BACKREST_NORTH = CollisionHelper.getBlockBounds(EnumFacing.NORTH, 0.125, 0.5625, 0.125, 0.1875, 2.0, 0.875);
	private static final AxisAlignedBB CHAIR_BACKREST_EAST = CollisionHelper.getBlockBounds(EnumFacing.EAST, 0.125, 0.5625, 0.125, 0.1875, 2.0, 0.875);
	private static final AxisAlignedBB CHAIR_BACKREST_SOUTH = CollisionHelper.getBlockBounds(EnumFacing.SOUTH, 0.125, 0.5625, 0.125, 0.1875, 2.0, 0.875);
	private static final AxisAlignedBB CHAIR_BACKREST_WEST = CollisionHelper.getBlockBounds(EnumFacing.WEST, 0.124, 0.5625, 0.125, 0.1875, 2.0, 0.875);

	public BlockAdmiralChair(Material material) {
		super(material);

		this.setHardness(1.0F);
		this.setResistance(5.0F);

		this.setSoundType(SoundType.WOOD);
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
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {

		if(SittableUtil.sitOnBlock(worldIn, pos.getX(), pos.getY(), pos.getZ(), playerIn, 6 * 0.0625)) {
			worldIn.updateComparatorOutputLevel(pos, this);
			return true;
		}
		return false;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BOUNDING_BOX;
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB axisAligned, List<AxisAlignedBB> axisAlignedList, Entity collidingEntity) {

		if (!(collidingEntity instanceof EntitySittableBlock)) {
			EnumFacing facing = state.getValue(FACING);
			switch(facing)
			{
			case NORTH:
				super.addCollisionBoxToList(pos, axisAligned, axisAlignedList, CHAIR_BACKREST_NORTH);
				break;
			case SOUTH:
				super.addCollisionBoxToList(pos, axisAligned, axisAlignedList, CHAIR_BACKREST_SOUTH);
				break;
			case WEST:
				super.addCollisionBoxToList(pos, axisAligned, axisAlignedList, CHAIR_BACKREST_WEST);
				break;
			default:
				super.addCollisionBoxToList(pos, axisAligned, axisAlignedList, CHAIR_BACKREST_EAST);
				break;
			}
			super.addCollisionBoxToList(pos, axisAligned, axisAlignedList, CHAIR_BASE);
		}
	}

	@Override
	public boolean hasComparatorInputOverride(IBlockState state) {
		return true;
	}

	@Override
	public int getComparatorInputOverride(IBlockState blockState, World worldIn, BlockPos pos) {
		return SittableUtil.isSomeoneSitting(worldIn, pos.getX(), pos.getY(), pos.getZ()) ? 1 : 0;
	}

}

