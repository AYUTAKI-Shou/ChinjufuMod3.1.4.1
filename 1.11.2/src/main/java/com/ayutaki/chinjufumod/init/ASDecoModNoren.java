package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.noren.BlockNoren_black;
import com.ayutaki.chinjufumod.init.noren.BlockNoren_blue;
import com.ayutaki.chinjufumod.init.noren.BlockNoren_brown;
import com.ayutaki.chinjufumod.init.noren.BlockNoren_cyan;
import com.ayutaki.chinjufumod.init.noren.BlockNoren_gray;
import com.ayutaki.chinjufumod.init.noren.BlockNoren_green;
import com.ayutaki.chinjufumod.init.noren.BlockNoren_lightb;
import com.ayutaki.chinjufumod.init.noren.BlockNoren_lightg;
import com.ayutaki.chinjufumod.init.noren.BlockNoren_lime;
import com.ayutaki.chinjufumod.init.noren.BlockNoren_magenta;
import com.ayutaki.chinjufumod.init.noren.BlockNoren_orange;
import com.ayutaki.chinjufumod.init.noren.BlockNoren_pink;
import com.ayutaki.chinjufumod.init.noren.BlockNoren_purple;
import com.ayutaki.chinjufumod.init.noren.BlockNoren_red;
import com.ayutaki.chinjufumod.init.noren.BlockNoren_white;
import com.ayutaki.chinjufumod.init.noren.BlockNoren_yellow;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ASDecoModNoren {

	public static Block NOREN_black, NOREN_blue, NOREN_brown, NOREN_cyan,
						NOREN_gray, NOREN_green, NOREN_lightb, NOREN_lightg,
						NOREN_lime, NOREN_magenta, NOREN_orange, NOREN_pink,
						NOREN_purple, NOREN_red, NOREN_white, NOREN_yellow;


	public static void init() {

		NOREN_black = new BlockNoren_black(Material.WOOD, "block_noren_black").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		NOREN_blue = new BlockNoren_blue(Material.WOOD, "block_noren_blue").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		NOREN_brown = new BlockNoren_brown(Material.WOOD, "block_noren_brown").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		NOREN_cyan = new BlockNoren_cyan(Material.WOOD, "block_noren_cyan").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		NOREN_gray = new BlockNoren_gray(Material.WOOD, "block_noren_gray").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		NOREN_green = new BlockNoren_green(Material.WOOD, "block_noren_green").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		NOREN_lightb = new BlockNoren_lightb(Material.WOOD, "block_noren_lightb").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		NOREN_lightg = new BlockNoren_lightg(Material.WOOD, "block_noren_lightg").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		NOREN_lime = new BlockNoren_lime(Material.WOOD, "block_noren_lime").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		NOREN_magenta = new BlockNoren_magenta(Material.WOOD, "block_noren_magenta").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		NOREN_orange = new BlockNoren_orange(Material.WOOD, "block_noren_orange").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		NOREN_pink = new BlockNoren_pink(Material.WOOD, "block_noren_pink").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		NOREN_purple = new BlockNoren_purple(Material.WOOD, "block_noren_purple").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		NOREN_red = new BlockNoren_red(Material.WOOD, "block_noren_red").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		NOREN_white = new BlockNoren_white(Material.WOOD, "block_noren_white").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		NOREN_yellow = new BlockNoren_yellow(Material.WOOD, "block_noren_yellow").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);

	}


	public static void register() {

		registerBlock(NOREN_black);
		registerBlock(NOREN_blue);
		registerBlock(NOREN_brown);
		registerBlock(NOREN_cyan);
		registerBlock(NOREN_gray);
		registerBlock(NOREN_green);
		registerBlock(NOREN_lightb);
		registerBlock(NOREN_lightg);
		registerBlock(NOREN_lime);
		registerBlock(NOREN_magenta);
		registerBlock(NOREN_orange);
		registerBlock(NOREN_pink);
		registerBlock(NOREN_purple);
		registerBlock(NOREN_red);
		registerBlock(NOREN_white);
		registerBlock(NOREN_yellow);

	}

	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}


	public static void registerRenders() {

		registerRender(NOREN_black);
		registerRender(NOREN_blue);
		registerRender(NOREN_brown);
		registerRender(NOREN_cyan);
		registerRender(NOREN_gray);
		registerRender(NOREN_green);
		registerRender(NOREN_lightb);
		registerRender(NOREN_lightg);
		registerRender(NOREN_lime);
		registerRender(NOREN_magenta);
		registerRender(NOREN_orange);
		registerRender(NOREN_pink);
		registerRender(NOREN_purple);
		registerRender(NOREN_red);
		registerRender(NOREN_white);
		registerRender(NOREN_yellow);

	}

    public static void registerRender(Block block) {
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
    			new ModelResourceLocation(block.getRegistryName(),"inventory"));
    }
}
