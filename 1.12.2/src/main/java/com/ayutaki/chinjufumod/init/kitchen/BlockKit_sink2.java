package com.ayutaki.chinjufumod.init.kitchen;

import java.util.Random;

import com.ayutaki.chinjufumod.init.ASDecoModKitchen;
import com.ayutaki.chinjufumod.init.ChinjufuModFoodBlocks;
import com.ayutaki.chinjufumod.init.TTimeItems;
import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockKit_sink2 extends BlockFacingSapo {

	public BlockKit_sink2()  {
		super(Material.WOOD);

		/*木製*/
		this.setSoundType(SoundType.WOOD);
		this.setHardness(1.0F);
		this.setResistance(10.0F);

	}

	/*水道の操作*/
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing side,
			float hitX, float hitY, float hitZ) {

        ItemStack itemstack = playerIn.getHeldItem(hand);
        Item item = itemstack.getItem();

		/*水を汲む*/
		if (item == Items.BUCKET) {

				/*指定のアイテムを1個消費*/
                itemstack.shrink(1);

                if (itemstack.isEmpty()) {
					playerIn.setHeldItem(hand, new ItemStack(Items.WATER_BUCKET));
				}
				else if (!playerIn.inventory.addItemStackToInventory(new ItemStack(Items.WATER_BUCKET))) {
					playerIn.dropItem(new ItemStack(Items.WATER_BUCKET), false);
				}
			return true;
		}

		/*大釜(Cauldron)から引用*/
		else if (item == Items.GLASS_BOTTLE) {

			ItemStack itemstack3 = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.WATER);
			itemstack.shrink(1);

			if (!playerIn.inventory.addItemStackToInventory(itemstack3)) {
				playerIn.dropItem(itemstack3, false);
			}
			else if (playerIn instanceof EntityPlayerMP) {
				((EntityPlayerMP)playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
			}
			return true;
		}

		else if (item == TTimeItems.Item_YAKAN_kara) {

            itemstack.shrink(1);

			if (itemstack.isEmpty()) {
				playerIn.setHeldItem(hand, new ItemStack(Item.getItemFromBlock(ChinjufuModFoodBlocks.KETTLE_full)));
			}
			else if (!playerIn.inventory.addItemStackToInventory(new ItemStack(Item.getItemFromBlock(ChinjufuModFoodBlocks.KETTLE_full)))) {
				playerIn.dropItem(new ItemStack(Item.getItemFromBlock(ChinjufuModFoodBlocks.KETTLE_full)), false);
			}
			return true;
		}

		/*水を止める*/
		else if (itemstack.isEmpty()) {

			worldIn.setBlockState(pos, ASDecoModKitchen.KIT_SINK1.getDefaultState().withProperty(FACING, state.getValue(FACING)));

		}
		return true;
	}

	/*2ブロック下が水ブロックではなくなると、水が止まる*/
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
		/*「!=」がノットイコール*/
		if (world.getBlockState(new BlockPos(i, j - 2, k)).getBlock() != Blocks.WATER) {

    		world.setBlockState(pos, ASDecoModKitchen.KIT_SINK1.getDefaultState().withProperty(FACING, state.getValue(FACING)));

    	}
    		world.scheduleUpdate(new BlockPos(i, j, k), this, this.tickRate(world));
    }

	@Override
	public int tickRate(World world) {
		return 20;
	}

	/*描画*/
	@Override
	public boolean isOpaqueCube(IBlockState state) {
	    return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
	    return false;
	}

	/*ドロップ管理*/
	public boolean canSilkHarvest(World world, EntityPlayer player, int x, int y, int z, int metadata) {

	    return false;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {

		return new ItemStack(ASDecoModKitchen.KIT_SINK1).getItem();
	}

	@Override
	public int quantityDropped(Random random) {
        return 1;
    }

}
