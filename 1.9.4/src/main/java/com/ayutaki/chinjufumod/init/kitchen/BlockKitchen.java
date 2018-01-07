package com.ayutaki.chinjufumod.init.kitchen;

import java.util.List;

import com.ayutaki.chinjufumod.init.ASDecoModKitchen;
import com.ayutaki.chinjufumod.init.ChinjufuModFoodBlocks;
import com.ayutaki.chinjufumod.init.TTimeItems;
import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
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
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {


		if (!playerIn.capabilities.allowEdit) {

			return false;
		}

		else if (heldItem == null) {

			worldIn.setBlockState(pos, ASDecoModKitchen.KITCHEN.getDefaultState().withProperty(FACING, state.getValue(FACING)));

		}

		else if (heldItem.getItem() == Item.getItemFromBlock(ChinjufuModFoodBlocks.NABE_kara)) {

			if (playerIn instanceof EntityPlayer)
	    		((EntityPlayer) playerIn).inventory
	    			.clearMatchingItems(Item.getItemFromBlock(ChinjufuModFoodBlocks.NABE_kara), -1, 1, null);
			worldIn.setBlockState(pos, ASDecoModKitchen.KIT_DONABE1
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		else if (heldItem.getItem() == Item.getItemFromBlock(ChinjufuModFoodBlocks.FRYPAN)) {

			if (playerIn instanceof EntityPlayer)
	    		((EntityPlayer) playerIn).inventory
	    			.clearMatchingItems(Item.getItemFromBlock(ChinjufuModFoodBlocks.FRYPAN), -1, 1, null);
			worldIn.setBlockState(pos, ASDecoModKitchen.KIT_FRYPAN1
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		else if (heldItem.getItem() == Item.getItemFromBlock(ChinjufuModFoodBlocks.ZUNDOU)) {

			if (playerIn instanceof EntityPlayer)
	    		((EntityPlayer) playerIn).inventory
	    			.clearMatchingItems(Item.getItemFromBlock(ChinjufuModFoodBlocks.ZUNDOU), -1, 1, null);
			worldIn.setBlockState(pos, ASDecoModKitchen.KIT_ZUNDOU
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		else if (heldItem.getItem() == TTimeItems.Item_YAKAN_kara) {

			if (playerIn instanceof EntityPlayer)
	    		((EntityPlayer) playerIn).inventory
	    			.clearMatchingItems(TTimeItems.Item_YAKAN_kara, -1, 1, null);
			worldIn.setBlockState(pos, ASDecoModKitchen.KIT_YAKAN
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.tile.block_kitchen.name", meta));
	}
}
