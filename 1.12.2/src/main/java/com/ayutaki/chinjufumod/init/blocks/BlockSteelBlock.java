package com.ayutaki.chinjufumod.init.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockSteelBlock extends Block {

	public BlockSteelBlock() {
		super(Material.WOOD);

		this.setSoundType(SoundType.METAL);
		this.setHardness(1.0F);
		this.setResistance(10.0F);
	}

	/*ドロップ指定、ピックアップ指定*/
	@Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		List<ItemStack> stack = new ArrayList<ItemStack>();

	        stack.add(new ItemStack(Items.IRON_INGOT, 4, this.damageDropped(state)));
	        return stack;
	}
}
