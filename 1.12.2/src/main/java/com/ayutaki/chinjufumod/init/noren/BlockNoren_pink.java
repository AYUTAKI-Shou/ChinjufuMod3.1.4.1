package com.ayutaki.chinjufumod.init.noren;

import java.util.List;

import javax.annotation.Nullable;

import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;
import com.ayutaki.chinjufumod.util.CollisionHelper;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockNoren_pink extends BlockFacingSapo {

	public static final PropertyEnum<Type> TYPE = PropertyEnum.create("type", Type.class);

	private static final AxisAlignedBB BOUNDING_BOX_NORTH = CollisionHelper.getBlockBounds(EnumFacing.NORTH, 0.0, 0.875, 0.0, 0.125, 1.0, 1.0);
	private static final AxisAlignedBB BOUNDING_BOX_EAST = CollisionHelper.getBlockBounds(EnumFacing.EAST, 0.0, 0.875, 0.0, 0.125, 1.0, 1.0);
	private static final AxisAlignedBB BOUNDING_BOX_SOUTH = CollisionHelper.getBlockBounds(EnumFacing.SOUTH, 0.0, 0.875, 0.0, 0.125, 1.0, 1.0);
	private static final AxisAlignedBB BOUNDING_BOX_WEST = CollisionHelper.getBlockBounds(EnumFacing.WEST, 0.0, 0.875, 0.0, 0.125, 1.0, 1.0);
	private static final AxisAlignedBB[] BOUNDING_BOX = { BOUNDING_BOX_SOUTH, BOUNDING_BOX_WEST, BOUNDING_BOX_NORTH, BOUNDING_BOX_EAST };

	public BlockNoren_pink(Material material, String unlocalizedName) {
		super(material);

		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);

		this.setHardness(0.5F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.WOOD);

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
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {

			EnumFacing facing = (EnumFacing) state.getValue(FACING);
			IBlockState left_block = worldIn.getBlockState(pos.offset(facing.rotateYCCW()));
			IBlockState right_block = worldIn.getBlockState(pos.offset(facing.rotateY()));
			boolean left = left_block.getBlock() instanceof BlockNoren_pink && left_block.getValue(FACING).equals(facing);
			boolean right = right_block.getBlock() instanceof BlockNoren_pink && right_block.getValue(FACING).equals(facing);

			 if(right)
			{
				if(left)
				{
					return state.withProperty(TYPE, Type.BOTH);
				}
				else
				{
					return state.withProperty(TYPE, Type.RIGHT);
				}
			}
			else if(left)
			{
				if(right)
				{
					return state.withProperty(TYPE, Type.BOTH);
				}
				else
				{
					return state.withProperty(TYPE, Type.LEFT);
				}
			}
			return state.withProperty(TYPE, Type.DEFAULT);

	}

	@Override
	protected BlockStateContainer createBlockState() {

		return new BlockStateContainer(this, new IProperty[] { FACING, TYPE}) ;
	}


	public static enum Type implements IStringSerializable {

		DEFAULT, LEFT, RIGHT, BOTH ;

		@Override
		public String getName() {

			return this.toString().toLowerCase();
		}
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
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.tile.block_noren.name", meta));
	}

}
