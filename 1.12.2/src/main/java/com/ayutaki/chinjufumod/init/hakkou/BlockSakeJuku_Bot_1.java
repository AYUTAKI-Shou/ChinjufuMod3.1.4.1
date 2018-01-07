package com.ayutaki.chinjufumod.init.hakkou;

import java.util.List;

import javax.annotation.Nullable;

import com.ayutaki.chinjufumod.init.ASDecoModHakkou;
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
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockSakeJuku_Bot_1 extends BlockFacingSapo {

	public BlockSakeJuku_Bot_1() {
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

			return worldIn.setBlockState(pos,ASDecoModHakkou.JUKUSAKEBOT_1
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));

    	}

    	else if (item == TTimeItems.Item_DRINKGLASS) {

            itemstack.shrink(1);

			if (itemstack.isEmpty()) {
				playerIn.setHeldItem(hand, new ItemStack(Item.getItemFromBlock(ASDecoModHakkou.JUKUSAKEGLA_1)));
			}
			else if (!playerIn.inventory.addItemStackToInventory(new ItemStack(Item.getItemFromBlock(ASDecoModHakkou.JUKUSAKEGLA_1)))) {
				playerIn.dropItem(new ItemStack(Item.getItemFromBlock(ASDecoModHakkou.JUKUSAKEGLA_1)), false);
			}

	    	return worldIn.setBlockState(pos, ASDecoModHakkou.JUKUSAKEBOT_2
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

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.tile.block_bot_sake.name", meta));
	}
}
