package com.ayutaki.chinjufumod.init.garden;

import java.util.List;

import com.ayutaki.chinjufumod.init.ASDecoModGarden;
import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLongtourou_dio extends BlockFacingSapo {

	public BlockLongtourou_dio() {
		super(Material.WOOD);

		this.setSoundType(SoundType.STONE);
		this.setHardness(1.0F);
		this.setResistance(5.0F);
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side,
			float hitX, float hitY, float hitZ) {

    	if (heldItem == null) {

			return worldIn.setBlockState(pos,ASDecoModGarden.LONGTOUROU_dio
					.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}

		else {
			Item item = heldItem.getItem();
			if (item == Item.getItemFromBlock(Blocks.TORCH)) {

				if (playerIn instanceof EntityPlayer)
	    			((EntityPlayer) playerIn).inventory
	    			.clearMatchingItems(Item.getItemFromBlock(Blocks.TORCH), -1, 1, null);

				worldIn.setBlockState(pos, ASDecoModGarden.LIT_LONGTOUROU_dio
						.getDefaultState().withProperty(FACING, state.getValue(FACING)));
        	}
		}
		return true;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return new AxisAlignedBB(0.125D, 0.0D, 0.125D, 0.875D, 1.875D, 0.875D);
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
		tooltip.add(I18n.format("tips.tile.block_ishitourou.name", meta));
	}
}
