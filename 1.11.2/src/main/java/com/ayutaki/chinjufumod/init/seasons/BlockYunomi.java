package com.ayutaki.chinjufumod.init.seasons;

import java.util.List;
import java.util.Random;

import com.ayutaki.chinjufumod.init.TTimeItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
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
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockYunomi extends Block {

    public static final PropertyInteger TEA = PropertyInteger.create("tea", 1, 4);

	public BlockYunomi(Material material) {
		super(material);

		this.setHardness(1.0F);
		this.setResistance(1.0F);
		this.setSoundType(SoundType.STONE);

		this.setDefaultState(this.blockState.getBaseState().withProperty(TEA, Integer.valueOf(1)));
	}

	//meta値
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing,
			float hitX, float hitY, float hitZ) {

		if (playerIn.isSneaking()) {

			if (!playerIn.capabilities.allowEdit) {
				return false;
			}

			else {
				worldIn.setBlockState(pos, state.cycleProperty(TEA), 3);
				return true;
			}

		}
		return true;
    }

    protected int getTea(IBlockState state) {
        return ((Integer)state.getValue(TEA)).intValue() * 2;
    }

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(TEA, Integer.valueOf(1 + (meta >> 2)));
	}

	@Override
    public int getMetaFromState(IBlockState state) {
        int i = 0;
         i = i | ((Integer)state.getValue(TEA)).intValue() - 1 << 2;
        return i;
    }

	@Override
	public boolean isSideSolid(IBlockState baseState, IBlockAccess world, BlockPos pos, EnumFacing side) {

		if (side == EnumFacing.UP)
		{
			return true;
		}
		return false;
	}

	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess world, BlockPos pos) {

        Integer integer = (Integer)state.getValue(TEA);
		return state.withProperty(TEA, integer);
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { TEA });
	}

	//描画
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
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 0.5625D, 0.15625D, 0.5625D);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.tile.block_yunomi.name", meta));
	}

	/*ドロップ指定、ピックアップ指定 TeaTimeで追加*/
	public boolean canSilkHarvest(World world, EntityPlayer player, int x, int y, int z, int metadata) {

	    return false;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {

		return new ItemStack(TTimeItems.Item_YUNOMI).getItem();
	}

	@Override
	public int quantityDropped(Random random) {
        return 1;
    }

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {

		return new ItemStack(TTimeItems.Item_YUNOMI);
	}
}
