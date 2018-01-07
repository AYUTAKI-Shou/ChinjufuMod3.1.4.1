package com.ayutaki.chinjufumod.init.garden;

import java.util.Random;

import com.ayutaki.chinjufumod.init.ASDecoModGarden;
import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLongSpruce extends BlockFacingSapo {

	private static final AxisAlignedBB BOUNDING_BOX_BOTTOM = new AxisAlignedBB( 0.0, 0.0, 0.0, 1.0, 2.0, 1.0 );
	private static final AxisAlignedBB BOUNDING_BOX_TOP = new AxisAlignedBB( 0.0, -1.0, 0.0, 1.0, 1.0, 1.0 );

	public BlockLongSpruce(Material materialIn, boolean top) {
		super(Material.WOOD);
		if(top) this.setCreativeTab(null);

		this.setSoundType(SoundType.WOOD);
		this.setHardness(1.0F);
		this.setResistance(5.0F);

	}

	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {

		if(this == ASDecoModGarden.SPRUCE_bot)
		{
			if(worldIn.getBlockState(pos.up()).getBlock() == ASDecoModGarden.SPRUCE_top)
			{
				worldIn.destroyBlock(pos.up(), false);
			}
		}
		else
		{
			if(worldIn.getBlockState(pos.down()).getBlock() == ASDecoModGarden.SPRUCE_bot)
			{
				worldIn.destroyBlock(pos.down(), false);
			}
		}
	}

	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
		return worldIn.isAirBlock(pos) && worldIn.isAirBlock(pos.up());
	}

	@Override
	public IBlockState onBlockPlaced(World world, BlockPos pos, EnumFacing facing,
			float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {

		if(this == ASDecoModGarden.SPRUCE_bot)
		{
			world.setBlockState(pos.up(), ASDecoModGarden.SPRUCE_top.getDefaultState()
					.withProperty(FACING, placer.getHorizontalFacing()));
		}
		return super.onBlockPlaced(world, pos, facing, hitX, hitY, hitZ, meta, placer);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {

		if(this == ASDecoModGarden.SPRUCE_bot)
		{
			return BOUNDING_BOX_BOTTOM;
		}
		else
		{
			return BOUNDING_BOX_TOP;
		}
	}


	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return new ItemStack(ASDecoModGarden.SPRUCE_bot).getItem();
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		return new ItemStack(ASDecoModGarden.SPRUCE_bot);
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
	public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
	}

}
