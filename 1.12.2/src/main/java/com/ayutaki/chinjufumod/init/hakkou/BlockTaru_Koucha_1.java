package com.ayutaki.chinjufumod.init.hakkou;

import java.util.ArrayList;
import java.util.List;

import com.ayutaki.chinjufumod.init.ASDecoModHakkou;
import com.ayutaki.chinjufumod.init.TTimeItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockTaru_Koucha_1 extends Block {

	public BlockTaru_Koucha_1() {
		super(Material.WOOD);

		this.setSoundType(SoundType.WOOD);
		this.setHardness(1.0F);
		this.setResistance(5.0F);
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing,
			float hitX, float hitY, float hitZ) {

        ItemStack itemstack = playerIn.getHeldItem(hand);

    	if (itemstack.isEmpty()) {

    		if (playerIn instanceof EntityPlayer)
				((EntityPlayer) playerIn).inventory
				.addItemStackToInventory(new ItemStack(TTimeItems.CHABA_RED, 8));

			worldIn.setBlockState(pos, ASDecoModHakkou.HAKKOUTARU.getDefaultState());

        	}

    	return true;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	/*ドロップ指定、ピックアップ指定*/
	public boolean canSilkHarvest(World world, EntityPlayer player, int x, int y, int z, int metadata) {

	    return false;
	}

	@Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		List<ItemStack> stack = new ArrayList<ItemStack>();

	        stack.add(new ItemStack(TTimeItems.CHABA_RED, 8, this.damageDropped(state)));
	        stack.add(new ItemStack(ASDecoModHakkou.HAKKOUTARU, 1, this.damageDropped(state)));

	        return stack;
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {

		return new ItemStack(ASDecoModHakkou.HAKKOUTARU);
	}
}
