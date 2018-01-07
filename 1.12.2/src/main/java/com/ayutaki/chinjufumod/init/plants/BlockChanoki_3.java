package com.ayutaki.chinjufumod.init.plants;

import java.util.Random;

import com.ayutaki.chinjufumod.init.TTimeItems;
import com.ayutaki.chinjufumod.init.TTimePlants;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockChanoki_3 extends Block {

	/*木完成*/
	public BlockChanoki_3() {
		super(Material.WOOD);

		this.setSoundType(SoundType.WOOD);
		this.setHardness(1.0F);
		this.setResistance(5.0F);
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing,
			float hitX, float hitY, float hitZ) {

		ItemStack itemstack = playerIn.getHeldItem(hand);

		if (!playerIn.capabilities.allowEdit) {
			return false;
		}

		else if (itemstack.isEmpty()) {
			((EntityPlayer) playerIn).inventory.addItemStackToInventory(new ItemStack(TTimeItems.TUMICHABA, 4));
			return worldIn.setBlockState(pos, TTimePlants.CHANOKI_2.getDefaultState());
		}

		return true;
	}

	@Override
	public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();

		if (world.getBlockState(new BlockPos(i, j - 1, k)).getBlock() != Blocks.DIRT) {

			TTimePlants.CHANOKI_nae.dropBlockAsItem(world, pos, state, 0);
            world.setBlockToAir(pos);
		}
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {

		return new ItemStack(TTimePlants.CHANOKI_nae).getItem();
	}

	@Override
	public int quantityDropped(Random random) {
        return 2;
    }

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {

		return new ItemStack(TTimePlants.CHANOKI_nae);
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
}
