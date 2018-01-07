package com.ayutaki.chinjufumod.init.foodblock;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.ayutaki.chinjufumod.init.ChinjufuModFoodBlocks;
import com.ayutaki.chinjufumod.init.TTimeItems;
import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;
import com.ayutaki.chinjufumod.util.CollisionHelper;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockTeaPot_2 extends BlockFacingSapo {

	private static final AxisAlignedBB BOUNDING_BOX_NORTH = CollisionHelper.getBlockBounds(EnumFacing.NORTH, 0.375, 0.0, 0.375, 0.625, 0.25, 0.75);
	private static final AxisAlignedBB BOUNDING_BOX_EAST = CollisionHelper.getBlockBounds(EnumFacing.EAST, 0.375, 0.0, 0.375, 0.625, 0.25, 0.75);
	private static final AxisAlignedBB BOUNDING_BOX_SOUTH = CollisionHelper.getBlockBounds(EnumFacing.SOUTH, 0.375, 0.0, 0.375, 0.625, 0.25, 0.75);
	private static final AxisAlignedBB BOUNDING_BOX_WEST = CollisionHelper.getBlockBounds(EnumFacing.WEST, 0.375, 0.0, 0.375, 0.625, 0.25, 0.75);
	private static final AxisAlignedBB[] BOUNDING_BOX = { BOUNDING_BOX_SOUTH, BOUNDING_BOX_WEST, BOUNDING_BOX_NORTH, BOUNDING_BOX_EAST };

	public BlockTeaPot_2()  {
		super(Material.WOOD);

		/*鍋・皿*/
		this.setSoundType(SoundType.STONE);
		this.setHardness(1.0F);
		this.setResistance(5.0F);
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing side,
			float hitX, float hitY, float hitZ) {

        ItemStack itemstack = playerIn.getHeldItem(hand);
        Item item = itemstack.getItem();

		if (item != TTimeItems.Item_TCUP) {

			return worldIn.setBlockState(pos,ChinjufuModFoodBlocks.TEAPOT_2
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
    	}

    	else if (item == TTimeItems.Item_TCUP) {

    		/*特定のアイテムを1個消費*/
            itemstack.shrink(1);

			if (itemstack.isEmpty()) {
				playerIn.setHeldItem(hand, new ItemStack(Item.getItemFromBlock(ChinjufuModFoodBlocks.TEACUP_1)));
			}
			else if (!playerIn.inventory.addItemStackToInventory(new ItemStack(Item.getItemFromBlock(ChinjufuModFoodBlocks.TEACUP_1)))) {
				playerIn.dropItem(new ItemStack(Item.getItemFromBlock(ChinjufuModFoodBlocks.TEACUP_1)), false);
			}

	    	return  worldIn.setBlockState(pos, ChinjufuModFoodBlocks.TEAPOT_3
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
        }
    	return true;
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
	public boolean isOpaqueCube(IBlockState state) {
	    return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
	    return false;
	}

	/*ドロップ指定、ピックアップ指定*/
	public boolean canSilkHarvest(World world, EntityPlayer player, int x, int y, int z, int metadata) {

	    return false;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {

		return new ItemStack(ChinjufuModFoodBlocks.TEAPOT_kara).getItem();
	}

	@Override
	public int quantityDropped(Random random) {
        return 1;
    }

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {

		return new ItemStack(ChinjufuModFoodBlocks.TEAPOT_kara);
	}

}
