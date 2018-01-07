package com.ayutaki.chinjufumod.init.fusuma;

import java.util.List;

import javax.annotation.Nullable;

import com.ayutaki.chinjufumod.util.CollisionHelper;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockFusumaB_CL_lightg extends BlockFusumaB_Left_lightg {

	private static final AxisAlignedBB BOUNDING_BOX_NORTH = CollisionHelper.getBlockBounds(EnumFacing.NORTH, 0.40625, 0.0, 0.0, 0.5, 2.0, 1.0);
	private static final AxisAlignedBB BOUNDING_BOX_EAST = CollisionHelper.getBlockBounds(EnumFacing.EAST, 0.40625, 0.0, 0.0, 0.5, 2.0, 1.0);
	private static final AxisAlignedBB BOUNDING_BOX_SOUTH = CollisionHelper.getBlockBounds(EnumFacing.SOUTH, 0.40625, 0.0, 0.0, 0.5, 2.0, 1.0);
	private static final AxisAlignedBB BOUNDING_BOX_WEST = CollisionHelper.getBlockBounds(EnumFacing.WEST, 0.40625, 0.0, 0.0, 0.5, 2.0, 1.0);
	private static final AxisAlignedBB[] BOUNDING_BOX = { BOUNDING_BOX_SOUTH, BOUNDING_BOX_WEST, BOUNDING_BOX_NORTH, BOUNDING_BOX_EAST };

	public BlockFusumaB_CL_lightg(Material material, String unlocalizedName) {
		super(material);

		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);

		this.setCreativeTab(null);
	}

	@Override
	public boolean isOpen() {

		return false;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {

		EnumFacing facing = state.getValue(FACING);
		return BOUNDING_BOX[facing.getHorizontalIndex()];
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes,
			@Nullable Entity entityIn, boolean p_185477_7_) {

		EnumFacing facing = state.getValue(FACING);
		super.addCollisionBoxToList(pos, entityBox, collidingBoxes, BOUNDING_BOX[facing.getHorizontalIndex()]);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.tile.block_fusuma.name", meta));
	}
}
