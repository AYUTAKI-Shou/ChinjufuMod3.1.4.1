package com.ayutaki.chinjufumod.init.hakkou;

import java.util.Random;

import com.ayutaki.chinjufumod.init.ASDecoModHakkou;
import com.ayutaki.chinjufumod.init.TTimeItems;
import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCider_Bot_2 extends BlockFacingSapo {

	public BlockCider_Bot_2() {
		super(Material.WOOD);

		/*瓶・グラス*/
		this.setSoundType(SoundType.GLASS);
		this.setHardness(1.0F);
		this.setResistance(1.0F);

		setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing side,
			float hitX, float hitY, float hitZ) {

        ItemStack itemstack = playerIn.getHeldItem(hand);
        Item item = itemstack.getItem();

		if (item != TTimeItems.Item_DRINKGLASS) {

			return worldIn.setBlockState(pos,ASDecoModHakkou.CIDERBOT_2
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));

    	}

    	else if (item == TTimeItems.Item_DRINKGLASS) {

            itemstack.shrink(1);

			if (itemstack.isEmpty()) {
				playerIn.setHeldItem(hand, new ItemStack(Item.getItemFromBlock(ASDecoModHakkou.CIDERGLA_1)));
			}
			else if (!playerIn.inventory.addItemStackToInventory(new ItemStack(Item.getItemFromBlock(ASDecoModHakkou.CIDERGLA_1)))) {
				playerIn.dropItem(new ItemStack(Item.getItemFromBlock(ASDecoModHakkou.CIDERGLA_1)), false);
			}

	    	return worldIn.setBlockState(pos, ASDecoModHakkou.CIDERBOT_3
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
        }
    	return true;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return new AxisAlignedBB(0.3125D, 0.0D, 0.3125D, 0.6875D, 1.0D, 0.6875D);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
	    return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
	    return false;
	}

	@Override
	public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
	}

	/*ドロップ指定、ピックアップ指定*/
	public boolean canSilkHarvest(World world, EntityPlayer player, int x, int y, int z, int metadata) {

	    return false;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {

		return new ItemStack(TTimeItems.Item_SAKEBOTTLE).getItem();
	}

	@Override
	public int quantityDropped(Random random) {
        return 1;
    }

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {

		return new ItemStack(TTimeItems.Item_SAKEBOTTLE);
	}
}
