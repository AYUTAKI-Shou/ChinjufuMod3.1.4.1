package com.ayutaki.chinjufumod.init.plants;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.ayutaki.chinjufumod.init.TTimePlants;
import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;
import com.ayutaki.chinjufumod.util.CollisionHelper;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGrape_nae extends BlockFacingSapo {

	private static final AxisAlignedBB BOUNDING_BOX_NORTH = CollisionHelper.getBlockBounds(EnumFacing.NORTH, 0.1875, 0.0, 0.0, 0.8125, 1.0, 1.0);
	private static final AxisAlignedBB BOUNDING_BOX_EAST = CollisionHelper.getBlockBounds(EnumFacing.EAST, 0.1875, 0.0, 0.0, 0.8125, 1.0, 1.0);
	private static final AxisAlignedBB BOUNDING_BOX_SOUTH = CollisionHelper.getBlockBounds(EnumFacing.SOUTH, 0.1875, 0.0, 0.0, 0.8125, 1.0, 1.0);
	private static final AxisAlignedBB BOUNDING_BOX_WEST = CollisionHelper.getBlockBounds(EnumFacing.WEST, 0.1875, 0.0, 0.0, 0.8125, 1.0, 1.0);
	private static final AxisAlignedBB[] BOUNDING_BOX = { BOUNDING_BOX_SOUTH, BOUNDING_BOX_WEST, BOUNDING_BOX_NORTH, BOUNDING_BOX_EAST };

	/*苗木*/
	public BlockGrape_nae() {
		super(Material.WOOD);

		this.setSoundType(SoundType.WOOD);
		this.setHardness(1.0F);
		this.setResistance(5.0F);

	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing,
			float hitX, float hitY, float hitZ) {

        ItemStack itemstack = playerIn.getHeldItem(hand);
        Item item = itemstack.getItem();
        int k;
        k = itemstack.getMetadata();

		if (item != Items.DYE) { return true; }

    	else if (item == Items.DYE) {

    		if(k == 15) {

    		/*特定のアイテムを1個消費*/
            itemstack.shrink(1);
            return  worldIn.setBlockState(pos,TTimePlants.BUDOUNOKI_3.getDefaultState()
					.withProperty(FACING, state.getValue(FACING))); }

    		if(k != 15) { return true; }

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

		if (world.getBlockState(new BlockPos(i, j - 1, k)).getBlock() == Blocks.DIRT) {

    		if (world.getLightFromNeighbors(pos.up()) >= 9) {

    			world.setBlockState(new BlockPos(i, j, k), TTimePlants.BUDOUNOKI_1.getDefaultState()
    					.withProperty(FACING, state.getValue(FACING)));
    		}
    		world.scheduleUpdate(new BlockPos(i, j, k), this, this.tickRate(world));
    	}
	}

	/*24000*2/7=6800 24000/7=3400*/
	@Override
	public int tickRate(World world) {
		return 5000;
	}

	@Override
	public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();

		if (world.getBlockState(new BlockPos(i, j - 1, k)).getBlock() != Blocks.DIRT) {

			TTimePlants.BUDOUNOKI_nae.dropBlockAsItem(world, pos, state, 0);
            world.setBlockToAir(pos);
		}
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.tile.block_wood_grape_nae.name", meta));
	}
}