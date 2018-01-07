package com.ayutaki.chinjufumod.init.shikkui;

import javax.annotation.Nullable;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockDirtwall extends Block {

	public static final PropertyInteger CRA = PropertyInteger.create("cra", 1, 2);

	public BlockDirtwall(Material material, String unlocalizedName) {

		super(material);

		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);

		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		this.setSoundType(SoundType.STONE);

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
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(CRA, Integer.valueOf(1 + (meta >> 2)));
	}

	@Override
    public int getMetaFromState(IBlockState state) {
        int i = 0;
        i = i | ((Integer)state.getValue(CRA)).intValue() - 1 << 2;
        return i;
    }

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { CRA });
	}

}
