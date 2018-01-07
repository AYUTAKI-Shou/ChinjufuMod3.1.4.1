package com.ayutaki.chinjufumod.init.kitchen;

import java.util.ArrayList;
import java.util.List;

import com.ayutaki.chinjufumod.init.ASDecoModKitchen;
import com.ayutaki.chinjufumod.init.ChinjufuModFoodBlocks;
import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockKit_donabe1 extends BlockFacingSapo {

	public BlockKit_donabe1() {
		super(Material.WOOD);

		this.setSoundType(SoundType.WOOD);
		this.setHardness(1.0F);
		this.setResistance(10.0F);
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing side,
			float hitX, float hitY, float hitZ) {

		ItemStack itemstack = playerIn.getHeldItem(hand);
		Item item = itemstack.getItem();

		if (itemstack.isEmpty()) {

			if (playerIn instanceof EntityPlayer) {
				((EntityPlayer) playerIn).inventory.addItemStackToInventory(new ItemStack(ChinjufuModFoodBlocks.NABE_kara));
			}
			worldIn.setBlockState(pos, ASDecoModKitchen.KITCHEN.getDefaultState()
					.withProperty(FACING, state.getValue(FACING)));

		}

		else if (item == Item.getItemFromBlock(ChinjufuModFoodBlocks.NABE_kara)) {

        	itemstack.shrink(1);
			worldIn.setBlockState(pos, ASDecoModKitchen.KIT_DONABE2
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}
		return true;
	}

	public boolean canSilkHarvest(World world, EntityPlayer player, int x, int y, int z, int metadata) {

	    return false;
	}

	@Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		List<ItemStack> stack = new ArrayList<ItemStack>();

	        stack.add(new ItemStack(ASDecoModKitchen.KITCHEN, 1, this.damageDropped(state)));
	        stack.add(new ItemStack(ChinjufuModFoodBlocks.NABE_kara, 1, this.damageDropped(state)));

	        return stack;
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {

		return new ItemStack(ASDecoModKitchen.KITCHEN);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
	    return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
	    return false;
	}
}
