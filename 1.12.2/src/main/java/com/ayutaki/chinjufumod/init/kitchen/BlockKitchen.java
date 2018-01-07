package com.ayutaki.chinjufumod.init.kitchen;

import java.util.List;

import javax.annotation.Nullable;

import com.ayutaki.chinjufumod.init.ASDecoModKitchen;
import com.ayutaki.chinjufumod.init.ChinjufuModFoodBlocks;
import com.ayutaki.chinjufumod.init.TTimeItems;
import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockKitchen extends BlockFacingSapo {

	public BlockKitchen() {
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

		if (!playerIn.capabilities.allowEdit) {

			return false;
		}

		else if (item == Item.getItemFromBlock(ChinjufuModFoodBlocks.NABE_kara)) {

        	itemstack.shrink(1);
			worldIn.setBlockState(pos, ASDecoModKitchen.KIT_DONABE1
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		else if (item == Item.getItemFromBlock(ChinjufuModFoodBlocks.FRYPAN)) {

        	itemstack.shrink(1);
			worldIn.setBlockState(pos, ASDecoModKitchen.KIT_FRYPAN1
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		else if (item == Item.getItemFromBlock(ChinjufuModFoodBlocks.ZUNDOU)) {

        	itemstack.shrink(1);
			worldIn.setBlockState(pos, ASDecoModKitchen.KIT_ZUNDOU
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		else if (item == TTimeItems.Item_YAKAN_kara) {

        	itemstack.shrink(1);
			worldIn.setBlockState(pos, ASDecoModKitchen.KIT_YAKAN
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.tile.block_kitchen.name", meta));
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
