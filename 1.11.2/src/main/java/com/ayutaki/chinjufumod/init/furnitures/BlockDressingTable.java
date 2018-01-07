package com.ayutaki.chinjufumod.init.furnitures;

import java.util.List;

import com.ayutaki.chinjufumod.entity.EntitySittableBlock;
import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;
import com.ayutaki.chinjufumod.util.CollisionHelper;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockDressingTable extends BlockFacingSapo {

	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.0, 0.0, 0.0, 1.0, 0.75, 1.0);

	private static final AxisAlignedBB TABLE_BASE = new AxisAlignedBB(0.0, 0.0, 0.0, 1.0, 0.75, 1.0);
	private static final AxisAlignedBB TABLE_MIRROR_NORTH = CollisionHelper.getBlockBounds(EnumFacing.NORTH, 0.125, 0.75, 0.125, 0.1875, 2.0, 0.875);
	private static final AxisAlignedBB TABLE_MIRROR_EAST = CollisionHelper.getBlockBounds(EnumFacing.EAST, 0.125, 0.75, 0.125, 0.1875, 2.0, 0.875);
	private static final AxisAlignedBB TABLE_MIRROR_SOUTH = CollisionHelper.getBlockBounds(EnumFacing.SOUTH, 0.125, 0.75, 0.125, 0.1875, 2.0, 0.875);
	private static final AxisAlignedBB TABLE_MIRROR_WEST = CollisionHelper.getBlockBounds(EnumFacing.WEST, 0.125, 0.75, 0.125, 0.1875, 2.0, 0.875);

	public BlockDressingTable() {
		super(Material.WOOD);

		this.setSoundType(SoundType.WOOD);
		this.setHardness(1.0F);
		this.setResistance(5.0F);

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
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BOUNDING_BOX;
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean p_185477_7_) {

		if (!(entityIn instanceof EntitySittableBlock))
		{
			EnumFacing facing = state.getValue(FACING);
			switch(facing)
			{
			case NORTH:
				super.addCollisionBoxToList(pos, entityBox, collidingBoxes, TABLE_MIRROR_NORTH);
				break;
			case SOUTH:
				super.addCollisionBoxToList(pos, entityBox, collidingBoxes, TABLE_MIRROR_SOUTH);
				break;
			case WEST:
				super.addCollisionBoxToList(pos, entityBox, collidingBoxes, TABLE_MIRROR_WEST);
				break;
			default:
				super.addCollisionBoxToList(pos, entityBox, collidingBoxes, TABLE_MIRROR_EAST);
				break;
			}
			super.addCollisionBoxToList(pos, entityBox, collidingBoxes, TABLE_BASE);
		}
	}
}
