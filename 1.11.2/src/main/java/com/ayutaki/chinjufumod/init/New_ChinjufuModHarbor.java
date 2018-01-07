package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.harbor.BlockCTruss;
import com.ayutaki.chinjufumod.init.harbor.BlockKeikai;
import com.ayutaki.chinjufumod.init.harbor.BlockKeiryukui;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class New_ChinjufuModHarbor {

	public static Block KEIKAIBLOCK;

	public static Block KEIRYUKUI,KEIRYUKUI_b;

	public static Block TRUSS_black,TRUSS_blue,TRUSS_brown,TRUSS_cyan,
						TRUSS_gray,TRUSS_green,TRUSS_lightb,TRUSS_lime,
						TRUSS_magenta,TRUSS_orange,TRUSS_pink,TRUSS_purple,
						TRUSS_red,TRUSS_white,TRUSS_yellow,TRUSS;


	public static void init() {
		KEIKAIBLOCK = new BlockKeikai().setRegistryName("block_keikai").setUnlocalizedName("block_keikaiblock").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		KEIRYUKUI = new BlockKeiryukui().setRegistryName("block_keiryukui").setUnlocalizedName("block_keiryukui").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		KEIRYUKUI_b = new BlockKeiryukui().setRegistryName("block_keiryukui_b").setUnlocalizedName("block_keiryukui_b").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		TRUSS_black = new BlockCTruss().setRegistryName("block_ctruss_black").setUnlocalizedName("block_ctruss_black").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TRUSS_blue = new BlockCTruss().setRegistryName("block_ctruss_blue").setUnlocalizedName("block_ctruss_blue").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TRUSS_brown = new BlockCTruss().setRegistryName("block_ctruss_brown").setUnlocalizedName("block_ctruss_brown").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TRUSS_cyan = new BlockCTruss().setRegistryName("block_ctruss_cyan").setUnlocalizedName("block_ctruss_cyan").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TRUSS_gray = new BlockCTruss().setRegistryName("block_ctruss_gray").setUnlocalizedName("block_ctruss_gray").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TRUSS_green = new BlockCTruss().setRegistryName("block_ctruss_green").setUnlocalizedName("block_ctruss_green").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TRUSS_lightb = new BlockCTruss().setRegistryName("block_ctruss_lightb").setUnlocalizedName("block_ctruss_lightb").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TRUSS_lime = new BlockCTruss().setRegistryName("block_ctruss_lime").setUnlocalizedName("block_ctruss_lime").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TRUSS_magenta = new BlockCTruss().setRegistryName("block_ctruss_magenta").setUnlocalizedName("block_ctruss_magenta").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TRUSS_orange = new BlockCTruss().setRegistryName("block_ctruss_orange").setUnlocalizedName("block_ctruss_orange").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TRUSS_pink = new BlockCTruss().setRegistryName("block_ctruss_pink").setUnlocalizedName("block_ctruss_pink").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TRUSS_purple = new BlockCTruss().setRegistryName("block_ctruss_purple").setUnlocalizedName("block_ctruss_purple").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TRUSS_red = new BlockCTruss().setRegistryName("block_ctruss_red").setUnlocalizedName("block_ctruss_red").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TRUSS_white = new BlockCTruss().setRegistryName("block_ctruss_white").setUnlocalizedName("block_ctruss_white").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TRUSS_yellow = new BlockCTruss().setRegistryName("block_ctruss_yellow").setUnlocalizedName("block_ctruss_yellow").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TRUSS = new BlockCTruss().setRegistryName("block_ctruss").setUnlocalizedName("block_ctruss").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

	}


	public static void register() {
		registerBlock(KEIKAIBLOCK);
		registerBlock(KEIRYUKUI);
		registerBlock(KEIRYUKUI_b);

		registerBlock(TRUSS_black);
		registerBlock(TRUSS_blue);
		registerBlock(TRUSS_brown);
		registerBlock(TRUSS_cyan);
		registerBlock(TRUSS_gray);
		registerBlock(TRUSS_green);
		registerBlock(TRUSS_lightb);
		registerBlock(TRUSS_lime);
		registerBlock(TRUSS_magenta);
		registerBlock(TRUSS_orange);
		registerBlock(TRUSS_pink);
		registerBlock(TRUSS_purple);
		registerBlock(TRUSS_red);
		registerBlock(TRUSS_white);
		registerBlock(TRUSS_yellow);
		registerBlock(TRUSS);

	}

	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}


	public static void registerRenders() {
		registerRender(KEIKAIBLOCK);
		registerRender(KEIRYUKUI);
		registerRender(KEIRYUKUI_b);

		registerRender(TRUSS_black);
		registerRender(TRUSS_blue);
		registerRender(TRUSS_brown);
		registerRender(TRUSS_cyan);
		registerRender(TRUSS_gray);
		registerRender(TRUSS_green);
		registerRender(TRUSS_lightb);
		registerRender(TRUSS_lime);
		registerRender(TRUSS_magenta);
		registerRender(TRUSS_orange);
		registerRender(TRUSS_pink);
		registerRender(TRUSS_purple);
		registerRender(TRUSS_red);
		registerRender(TRUSS_white);
		registerRender(TRUSS_yellow);
		registerRender(TRUSS);

	}

    public static void registerRender(Block block) {
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
    			new ModelResourceLocation(block.getRegistryName(),"inventory"));
    }
}
