package com.ayutaki.chinjufumod.init.blocks;

import java.util.Random;

import com.ayutaki.chinjufumod.init.New_ChinjufuModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class BlockBauxiteOre extends Block {

	public BlockBauxiteOre() {
		super(Material.ROCK);

		this.setHardness(2.0F);
		this.setResistance(10.0F);

		this.setHarvestLevel("pickaxe", 2);
	}

	//ドロップさせるアイテム
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return New_ChinjufuModItems.BAUXITE;
	}

	//ドロップさせる数
	@Override
	public int quantityDropped(Random random) {
        return 1;
    }

	//幸運のエンチャントによる加算
	@Override
    public int quantityDroppedWithBonus(int fortune, Random random) {

        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune)) {

            int i = random.nextInt(fortune + 2) - 1;

            if (i < 0) {
                i = 0;
            }

            return this.quantityDropped(random) * (i + 1);
        }
        else {
            return this.quantityDropped(random);
        }
    }

	//経験値ドロップ getRandomIntegerInRange→getInt
    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {

        Random rand = world instanceof World ? ((World)world).rand : new Random();
        return MathHelper.getInt(rand, 1, 3);
    }

}
