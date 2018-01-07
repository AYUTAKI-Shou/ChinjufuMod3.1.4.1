package com.ayutaki.chinjufumod.init.namako;

import java.util.Random;

import javax.annotation.Nullable;

import com.ayutaki.chinjufumod.init.ASDecoModNamako;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class BlockNamakoB_Slab_red extends BlockSlab {

	public static final PropertyInteger CRA = PropertyInteger.create("cra", 1, 2);

	public BlockNamakoB_Slab_red(String unlocalizedName) {
		super(Material.WOOD);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setSoundType(SoundType.STONE);

		IBlockState state = this.blockState.getBaseState();
		if (!this.isDouble()) {
			state = state.withProperty(HALF, EnumBlockHalf.BOTTOM).withProperty(CRA, Integer.valueOf(1));
		}
		setDefaultState(state);
		this.useNeighborBrightness = true;
	}

	@Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {

		if (playerIn.isSneaking()) {

			if (!playerIn.capabilities.allowEdit) {
				return false;
			}

			else {
				worldIn.setBlockState(pos, state.cycleProperty(CRA), 2);
				return true;
			}

		}
		return false;
    }

    protected int getLog(IBlockState state) {
        return ((Integer)state.getValue(CRA)).intValue() * 2;
    }

	@Override
	public String getUnlocalizedName(int meta) {
		return this.getUnlocalizedName();
	}

	@Override
	public IProperty<?> getVariantProperty() {
		return HALF;
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return EnumBlockHalf.BOTTOM;
	}

	@Override
	public int damageDropped(IBlockState state) {
		return 0;
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		if (!this.isDouble())
			return this.getDefaultState()
					.withProperty(HALF, EnumBlockHalf.values()[meta % EnumBlockHalf.values().length])
					.withProperty(CRA, Integer.valueOf(1 + (meta >> 2)));

		return this.getDefaultState().withProperty(CRA, Integer.valueOf(1 + (meta >> 2)));
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		if (this.isDouble())
			return ((Integer)state.getValue(CRA)).intValue() - 1 << 2;

		int i = 0;
        i = i | ((EnumBlockHalf) state.getValue(HALF)).ordinal() + 1;
        i = i | ((Integer)state.getValue(CRA)).intValue() - 1 << 2;
        return i;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(ASDecoModNamako.NAMAKOB_SH_red);
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { HALF, CRA  });
	}

}
