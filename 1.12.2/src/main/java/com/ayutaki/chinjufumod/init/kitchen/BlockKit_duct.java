package com.ayutaki.chinjufumod.init.kitchen;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockKit_duct extends Block {

    public static final PropertyBool DOWN = PropertyBool.create("down");
    public static final PropertyBool UP = PropertyBool.create("up");
    public static final PropertyBool NORTH = PropertyBool.create("north");
    public static final PropertyBool EAST = PropertyBool.create("east");
    public static final PropertyBool SOUTH = PropertyBool.create("south");
    public static final PropertyBool WEST = PropertyBool.create("west");


    public BlockKit_duct() {
		super(Material.WOOD);

		/* 金属 */
		this.setSoundType(SoundType.METAL);
		this.setHardness(1.0F);
		this.setResistance(10.0F);

        this.setDefaultState(this.blockState.getBaseState()
        		.withProperty(DOWN, Boolean.valueOf(false))
        		.withProperty(UP, Boolean.valueOf(false))
        		.withProperty(NORTH, Boolean.valueOf(false))
        		.withProperty(EAST, Boolean.valueOf(false))
        		.withProperty(SOUTH, Boolean.valueOf(false))
        		.withProperty(WEST, Boolean.valueOf(false)));

    }

    public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
        return false;
    }

    public boolean canConnectTo(IBlockAccess worldIn, BlockPos pos) {
        return worldIn.getBlockState(pos).getBlock() instanceof BlockKit_duct;
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
        return true;
    }

    public int getMetaFromState(IBlockState state) {
        return 0;
    }

    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        return state.withProperty(DOWN, Boolean.valueOf(this.canConnectTo(worldIn, pos.down())))
        		.withProperty(UP, Boolean.valueOf(this.canConnectTo(worldIn, pos.up())))
        		.withProperty(NORTH, Boolean.valueOf(this.canConnectTo(worldIn, pos.north())))
        		.withProperty(EAST, Boolean.valueOf(this.canConnectTo(worldIn, pos.east())))
        		.withProperty(SOUTH, Boolean.valueOf(this.canConnectTo(worldIn, pos.south())))
        		.withProperty(WEST, Boolean.valueOf(this.canConnectTo(worldIn, pos.west())));
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] { DOWN, UP, NORTH, EAST, SOUTH, WEST });
    }

    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    public boolean isFullCube(IBlockState state) {
        return false;
    }
}
