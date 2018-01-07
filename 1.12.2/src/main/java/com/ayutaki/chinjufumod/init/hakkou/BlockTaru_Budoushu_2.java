package com.ayutaki.chinjufumod.init.hakkou;

import java.util.ArrayList;
import java.util.List;

import com.ayutaki.chinjufumod.init.ASDecoModHakkou;
import com.ayutaki.chinjufumod.init.ChinjufuModItemFoods;
import com.ayutaki.chinjufumod.init.TTimeItems;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockTaru_Budoushu_2 extends BlockRotatedPillar {

	/*熟成酒*/
 	public BlockTaru_Budoushu_2() {
		super(Material.WOOD);

		this.setSoundType(SoundType.WOOD);
		this.setHardness(1.0F);
		this.setResistance(5.0F);

	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing side,
			float hitX, float hitY, float hitZ) {

        ItemStack itemstack = playerIn.getHeldItem(hand);
        Item item = itemstack.getItem();

		if (item != TTimeItems.Item_SAKEBOTTLE) {

			return worldIn.setBlockState(pos,ASDecoModHakkou.BUDOUSHUTARU_2
					.getDefaultState().withProperty(AXIS, state.getValue(AXIS)));

    	}

    	else if (item == TTimeItems.Item_SAKEBOTTLE) {

            itemstack.shrink(1);

			if (itemstack.isEmpty()) {
				playerIn.setHeldItem(hand, new ItemStack(Item.getItemFromBlock(ASDecoModHakkou.JUKUWINEBOT_1)));
			}
			else if (!playerIn.inventory.addItemStackToInventory(new ItemStack(Item.getItemFromBlock(ASDecoModHakkou.JUKUWINEBOT_1)))) {
				playerIn.dropItem(new ItemStack(Item.getItemFromBlock(ASDecoModHakkou.JUKUWINEBOT_1)), false);
			}

	    	return worldIn.setBlockState(pos, ASDecoModHakkou.HAKKOUTARU.getDefaultState());
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

	        stack.add(new ItemStack(ChinjufuModItemFoods.FOOD_GRAPE, 7, this.damageDropped(state)));
	        stack.add(new ItemStack(ASDecoModHakkou.HAKKOUTARU, 1, this.damageDropped(state)));

	        return stack;
	}
}
