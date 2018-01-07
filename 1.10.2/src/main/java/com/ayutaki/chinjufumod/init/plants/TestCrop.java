package com.ayutaki.chinjufumod.init.plants;

import com.ayutaki.chinjufumod.init.ChinjufuModItemFoods;
import com.ayutaki.chinjufumod.init.TTimeItems;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class TestCrop extends BlockCrops {

	public TestCrop(String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));

	}

	@Override
	protected Item getSeed() {
		return TTimeItems.SEEDS_CABE;

	}

	@Override
	protected Item getCrop() {
		return ChinjufuModItemFoods.FOOD_CABBAGE;

	}
}
