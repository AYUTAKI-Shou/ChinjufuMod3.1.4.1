package com.ayutaki.chinjufumod.init.futon;

import java.util.Random;

import com.ayutaki.chinjufumod.init.ASDecoModTatami;
import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public abstract class BlockFuton_green extends BlockFacingSapo {

	public abstract boolean isOpen();

	public BlockFuton_green(Material material) {
		super(material);

		this.setHardness(0.5F);
		this.setResistance(0.5F);
		this.setSoundType(SoundType.CLOTH);

		if(!isOpen()) {

		}
		else {

		}
	}

	@Override
	public boolean isTranslucent(IBlockState state) {

		return true;
	}


	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {

		return new ItemStack(ASDecoModTatami.FUTON_C_green).getItem();
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {

		return new ItemStack(ASDecoModTatami.FUTON_C_green);
	}

	@Override
	protected BlockStateContainer createBlockState() {

		return isOpen() ? new BlockStateContainer(this, new IProperty[] { FACING }) : super.createBlockState();
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
