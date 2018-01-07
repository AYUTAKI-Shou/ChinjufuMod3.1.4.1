package com.ayutaki.chinjufumod.init.school;

import java.util.List;
import java.util.Random;

import com.ayutaki.chinjufumod.init.ASDecoModKitchen;
import com.ayutaki.chinjufumod.init.ChinjufuModFoodBlocks;
import com.ayutaki.chinjufumod.init.New_ChinjufuModSchool;
import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockKettle_full extends BlockFacingSapo {

	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.1875, 0.0, 0.1875, 0.8125, 0.5, 0.8125);

	public BlockKettle_full() {
		super(Material.WOOD);

		this.setSoundType(SoundType.METAL);
		this.setHardness(1.0F);
		this.setResistance(10.0F);

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

		if (world.getBlockState(new BlockPos(i, j - 1, k)).getBlock() == ASDecoModKitchen.LIT_KITSTOVE) {

			world.setBlockState(new BlockPos(i, j, k), ChinjufuModFoodBlocks.KETTLE_boil
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		else if (world.getBlockState(new BlockPos(i, j - 1, k)).getBlock() == New_ChinjufuModSchool.LIT_CSTOVE_top) {

			world.setBlockState(new BlockPos(i, j, k), ChinjufuModFoodBlocks.KETTLE_boil
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		else if (world.getBlockState(new BlockPos(i, j - 1, k)).getBlock() == Blocks.LIT_FURNACE) {

			world.setBlockState(new BlockPos(i, j, k), ChinjufuModFoodBlocks.KETTLE_boil
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		else if (world.getBlockState(new BlockPos(i, j - 1, k)).getBlock() == ASDecoModKitchen.LIT_IRORI) {

			world.setBlockState(new BlockPos(i, j, k), ChinjufuModFoodBlocks.KETTLE_boil
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		world.scheduleUpdate(new BlockPos(i, j, k), this, this.tickRate(world));

	}

	@Override
	public int tickRate(World world) {
		return 1000;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BOUNDING_BOX;
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
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.tile.block_kettle.name", meta));
	}
}
