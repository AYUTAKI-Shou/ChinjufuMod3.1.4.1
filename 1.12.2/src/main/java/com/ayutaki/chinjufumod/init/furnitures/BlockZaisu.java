package com.ayutaki.chinjufumod.init.furnitures;

import java.util.List;

import javax.annotation.Nullable;

import com.ayutaki.chinjufumod.entity.EntitySittableBlock;
import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;
import com.ayutaki.chinjufumod.util.CollisionHelper;
import com.ayutaki.chinjufumod.util.SittableUtil;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockZaisu extends BlockFacingSapo {

	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.0625, 0.0, 0.0625, 0.9375, 0.125, 0.9375);

	private static final AxisAlignedBB CHAIR_BASE = new AxisAlignedBB(0.125, 0.0, 0.125, 0.875, 0.125, 0.875);
	private static final AxisAlignedBB CHAIR_BACKREST_NORTH = CollisionHelper.getBlockBounds(EnumFacing.NORTH, 0.125, 0.125, 0.125, 0.1875, 0.875, 0.875);
	private static final AxisAlignedBB CHAIR_BACKREST_EAST = CollisionHelper.getBlockBounds(EnumFacing.EAST, 0.125, 0.125, 0.125, 0.1875, 0.875, 0.875);
	private static final AxisAlignedBB CHAIR_BACKREST_SOUTH = CollisionHelper.getBlockBounds(EnumFacing.SOUTH, 0.125, 0.125, 0.125, 0.1875, 0.875, 0.875);
	private static final AxisAlignedBB CHAIR_BACKREST_WEST = CollisionHelper.getBlockBounds(EnumFacing.WEST, 0.125, 0.125, 0.125, 0.1875, 0.875, 0.875);

	public BlockZaisu(Material material) {
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
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing,
			float hitX, float hitY, float hitZ) {

		if(SittableUtil.sitOnBlock(worldIn, pos.getX(), pos.getY(), pos.getZ(), playerIn, -2 * 0.0625)) {
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
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean p_185477_7_) {

		if (!(entityIn instanceof EntitySittableBlock))
		{
			EnumFacing facing = state.getValue(FACING);
			switch(facing)
			{
			case NORTH:
				super.addCollisionBoxToList(pos, entityBox, collidingBoxes, CHAIR_BACKREST_NORTH);
				break;
			case SOUTH:
				super.addCollisionBoxToList(pos, entityBox, collidingBoxes, CHAIR_BACKREST_SOUTH);
				break;
			case WEST:
				super.addCollisionBoxToList(pos, entityBox, collidingBoxes, CHAIR_BACKREST_WEST);
				break;
			default:
				super.addCollisionBoxToList(pos, entityBox, collidingBoxes, CHAIR_BACKREST_EAST);
				break;
			}
			super.addCollisionBoxToList(pos, entityBox, collidingBoxes, CHAIR_BASE);
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

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.tile.block_zaisu.name", meta));
	}
}
