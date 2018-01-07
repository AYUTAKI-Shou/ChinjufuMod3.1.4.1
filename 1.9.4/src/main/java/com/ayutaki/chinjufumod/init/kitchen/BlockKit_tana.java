package com.ayutaki.chinjufumod.init.kitchen;

import java.util.List;

import com.ayutaki.chinjufumod.init.ASDecoModKitchen;
import com.ayutaki.chinjufumod.init.TTimeItems;
import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;
import com.ayutaki.chinjufumod.util.CollisionHelper;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
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

public class BlockKit_tana extends BlockFacingSapo {

	private static final AxisAlignedBB BOUNDING_BOX_NORTH = CollisionHelper.getBlockBounds(EnumFacing.NORTH, 0.0, 0.0, 0.0, 0.625, 1.0, 1.0);
	private static final AxisAlignedBB BOUNDING_BOX_EAST = CollisionHelper.getBlockBounds(EnumFacing.EAST, 0.0, 0.0, 0.0, 0.625, 1.0, 1.0);
	private static final AxisAlignedBB BOUNDING_BOX_SOUTH = CollisionHelper.getBlockBounds(EnumFacing.SOUTH, 0.0, 0.0, 0.0, 0.625, 1.0, 1.0);
	private static final AxisAlignedBB BOUNDING_BOX_WEST = CollisionHelper.getBlockBounds(EnumFacing.WEST, 0.0, 0.0, 0.0, 0.625, 1.0, 1.0);
	private static final AxisAlignedBB[] BOUNDING_BOX = { BOUNDING_BOX_SOUTH, BOUNDING_BOX_WEST, BOUNDING_BOX_NORTH, BOUNDING_BOX_EAST };

	public BlockKit_tana() {
		super(Material.WOOD);

		this.setSoundType(SoundType.WOOD);
		this.setHardness(1.0F);
		this.setResistance(10.0F);
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

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {


		if (!playerIn.capabilities.allowEdit) {

			return false;
		}

		else if (heldItem == null) {

			worldIn.setBlockState(pos, ASDecoModKitchen.KIT_TANA.getDefaultState().withProperty(FACING, state.getValue(FACING)));

		}

		else if (heldItem.getItem() == TTimeItems.Item_SARA) {

			if (playerIn instanceof EntityPlayer)
	    		((EntityPlayer) playerIn).inventory.clearMatchingItems(TTimeItems.Item_SARA, -1, 1, null);
			worldIn.setBlockState(pos, ASDecoModKitchen.KIT_SARA1
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		else if (heldItem.getItem() == TTimeItems.Item_TONSUI) {

			if (playerIn instanceof EntityPlayer)
	    		((EntityPlayer) playerIn).inventory.clearMatchingItems(TTimeItems.Item_TONSUI, -1, 1, null);
			worldIn.setBlockState(pos, ASDecoModKitchen.KIT_TONSUI1
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		else if (heldItem.getItem() == TTimeItems.Item_YUNOMI) {

			if (playerIn instanceof EntityPlayer)
	    		((EntityPlayer) playerIn).inventory.clearMatchingItems(TTimeItems.Item_YUNOMI, -1, 1, null);
			worldIn.setBlockState(pos, ASDecoModKitchen.KIT_YUNOMI1
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		else if (heldItem.getItem() == TTimeItems.Item_TCUP) {

			if (playerIn instanceof EntityPlayer)
	    		((EntityPlayer) playerIn).inventory.clearMatchingItems(TTimeItems.Item_TCUP, -1, 1, null);
			worldIn.setBlockState(pos, ASDecoModKitchen.KIT_TCUP1
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		else if (heldItem.getItem() == TTimeItems.Item_CHAWAN) {

			if (playerIn instanceof EntityPlayer)
	    		((EntityPlayer) playerIn).inventory.clearMatchingItems(TTimeItems.Item_CHAWAN, -1, 1, null);
			worldIn.setBlockState(pos, ASDecoModKitchen.KIT_CHAWAN1
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		else if (heldItem.getItem() == TTimeItems.Item_SHIKKI) {

			if (playerIn instanceof EntityPlayer)
	    		((EntityPlayer) playerIn).inventory.clearMatchingItems(TTimeItems.Item_SHIKKI, -1, 1, null);
			worldIn.setBlockState(pos, ASDecoModKitchen.KIT_SHIKKI1
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		else if (heldItem.getItem() == TTimeItems.Item_DRINKGLASS) {

			if (playerIn instanceof EntityPlayer)
	    		((EntityPlayer) playerIn).inventory.clearMatchingItems(TTimeItems.Item_DRINKGLASS, -1, 1, null);
			worldIn.setBlockState(pos, ASDecoModKitchen.KIT_DRIGLASS1
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.tile.block_kit_tana.name", meta));
	}
}
