package com.ayutaki.chinjufumod.init.fusuma;

import java.util.Random;

import com.ayutaki.chinjufumod.init.ASDecoModFusuma;
import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public abstract class BlockShoujiA_Left_spru extends BlockFacingSapo {

	public abstract boolean isOpen();

	public BlockShoujiA_Left_spru(Material material) {
		super(material);

		this.setHardness(0.5F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.WOOD);

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
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing,
			float hitX, float hitY, float hitZ) {

		if(isOpen()) {

			return worldIn.setBlockState(pos, ASDecoModFusuma.SHOUJIA_CL_spru.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		if (playerIn.isSneaking()) {

			return worldIn.setBlockState(pos, ASDecoModFusuma.SHOUJIA_CR_spru.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		else {

			return worldIn.setBlockState(pos, ASDecoModFusuma.SHOUJIA_OL_spru.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}
	}


	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {

		return new ItemStack(ASDecoModFusuma.SHOUJIA_CL_spru).getItem();
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {

		return new ItemStack(ASDecoModFusuma.SHOUJIA_CL_spru);
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
