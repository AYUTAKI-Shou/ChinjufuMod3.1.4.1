package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.blocks.BlockAdmiralStamp;
import com.ayutaki.chinjufumod.init.blocks.BlockBauxiteOre;
import com.ayutaki.chinjufumod.init.blocks.BlockEmptyBox;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ChinjufuModBlocks {

	public static Block BAUXITE_ORE;
	public static Block EMPTY_BOX;
	public static Block B_ADMIRAL_STAMP;

	public static void init() {

		BAUXITE_ORE = new BlockBauxiteOre().setRegistryName("block_bauxite_ore").setUnlocalizedName("block_bauxite_ore").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		EMPTY_BOX = new BlockEmptyBox().setRegistryName("block_empty_box").setUnlocalizedName("block_empty_box").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		B_ADMIRAL_STAMP = new BlockAdmiralStamp(Material.WOOD).setRegistryName("block_stamp_block").setUnlocalizedName("block_stamp_block").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

	}


	public static void register() {

		registerBlock(BAUXITE_ORE);
		registerBlock(EMPTY_BOX);
		registerBlock(B_ADMIRAL_STAMP);
	}

	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}


	public static void registerRenders() {

		registerRender(BAUXITE_ORE);
		registerRender(EMPTY_BOX);
		registerRender(B_ADMIRAL_STAMP);
	}

    public static void registerRender(Block block) {
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
    			new ModelResourceLocation(block.getRegistryName(),"inventory"));
    }
}
