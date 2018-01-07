package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.blocks.BlockDummyPlaster;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlasterStairs_c;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PD_black;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PD_blue;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PD_brown;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PD_cyan;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PD_gray;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PD_green;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PD_lightb;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PD_lightg;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PD_lime;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PD_magenta;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PD_orange;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PD_pink;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PD_purple;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PD_red;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PD_white;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PD_yellow;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PH_black;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PH_blue;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PH_brown;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PH_cyan;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PH_gray;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PH_green;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PH_lightb;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PH_lightg;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PH_lime;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PH_magenta;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PH_orange;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PH_pink;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PH_purple;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PH_red;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PH_white;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_PH_yellow;
import com.ayutaki.chinjufumod.init.shikkui.BlockPlaster_c;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ASDecoModPlaster {

	public static Block SHIKKUI_black, SHIKKUI_blue, SHIKKUI_brown, SHIKKUI_cyan,
						SHIKKUI_gray, SHIKKUI_green, SHIKKUI_lightb, SHIKKUI_lightg,
						SHIKKUI_lime, SHIKKUI_magenta, SHIKKUI_orange, SHIKKUI_pink,
						SHIKKUI_purple, SHIKKUI_red, SHIKKUI_yellow, SHIKKUI_white;

	public static Block SHIKKUI_ST_black, SHIKKUI_ST_blue, SHIKKUI_ST_brown, SHIKKUI_ST_cyan,
						SHIKKUI_ST_gray, SHIKKUI_ST_green, SHIKKUI_ST_lightb, SHIKKUI_ST_lightg,
						SHIKKUI_ST_lime, SHIKKUI_ST_magenta, SHIKKUI_ST_orange, SHIKKUI_ST_pink,
						SHIKKUI_ST_purple, SHIKKUI_ST_red, SHIKKUI_ST_yellow, SHIKKUI_ST_white;

	public static BlockPlaster_PH_black SHIKKUI_SH_black;
	public static BlockPlaster_PH_blue SHIKKUI_SH_blue;
	public static BlockPlaster_PH_brown SHIKKUI_SH_brown;
	public static BlockPlaster_PH_cyan SHIKKUI_SH_cyan;
	public static BlockPlaster_PH_gray SHIKKUI_SH_gray;
	public static BlockPlaster_PH_green SHIKKUI_SH_green;
	public static BlockPlaster_PH_lightb SHIKKUI_SH_lightb;
	public static BlockPlaster_PH_lightg SHIKKUI_SH_lightg;
	public static BlockPlaster_PH_lime SHIKKUI_SH_lime;
	public static BlockPlaster_PH_magenta SHIKKUI_SH_magenta;
	public static BlockPlaster_PH_orange SHIKKUI_SH_orange;
	public static BlockPlaster_PH_pink SHIKKUI_SH_pink;
	public static BlockPlaster_PH_purple SHIKKUI_SH_purple;
	public static BlockPlaster_PH_red SHIKKUI_SH_red;
	public static BlockPlaster_PH_yellow SHIKKUI_SH_yellow;
	public static BlockPlaster_PH_white SHIKKUI_SH_white;

	public static BlockPlaster_PD_black SHIKKUI_SD_black;
	public static BlockPlaster_PD_blue SHIKKUI_SD_blue;
	public static BlockPlaster_PD_brown SHIKKUI_SD_brown;
	public static BlockPlaster_PD_cyan SHIKKUI_SD_cyan;
	public static BlockPlaster_PD_gray SHIKKUI_SD_gray;
	public static BlockPlaster_PD_green SHIKKUI_SD_green;
	public static BlockPlaster_PD_lightb SHIKKUI_SD_lightb;
	public static BlockPlaster_PD_lightg SHIKKUI_SD_lightg;
	public static BlockPlaster_PD_lime SHIKKUI_SD_lime;
	public static BlockPlaster_PD_magenta SHIKKUI_SD_magenta;
	public static BlockPlaster_PD_orange SHIKKUI_SD_orange;
	public static BlockPlaster_PD_pink SHIKKUI_SD_pink;
	public static BlockPlaster_PD_purple SHIKKUI_SD_purple;
	public static BlockPlaster_PD_red SHIKKUI_SD_red;
	public static BlockPlaster_PD_yellow SHIKKUI_SD_yellow;
	public static BlockPlaster_PD_white SHIKKUI_SD_white;

	public static Block DUMMYSHIKKUI;

	public static void init() {

		DUMMYSHIKKUI = new BlockDummyPlaster().setRegistryName("dummy_plaster").setUnlocalizedName("dummy_plaster");

		SHIKKUI_black = new BlockPlaster_c(Material.WOOD, "block_plaster_black");
		SHIKKUI_blue = new BlockPlaster_c(Material.WOOD, "block_plaster_blue");
		SHIKKUI_brown = new BlockPlaster_c(Material.WOOD, "block_plaster_brown");
		SHIKKUI_cyan = new BlockPlaster_c(Material.WOOD, "block_plaster_cyan");
		SHIKKUI_gray = new BlockPlaster_c(Material.WOOD, "block_plaster_gray");
		SHIKKUI_green = new BlockPlaster_c(Material.WOOD, "block_plaster_green");
		SHIKKUI_lightb = new BlockPlaster_c(Material.WOOD, "block_plaster_lightb");
		SHIKKUI_lightg = new BlockPlaster_c(Material.WOOD, "block_plaster_lightg");
		SHIKKUI_lime = new BlockPlaster_c(Material.WOOD, "block_plaster_lime");
		SHIKKUI_magenta = new BlockPlaster_c(Material.WOOD, "block_plaster_magenta");
		SHIKKUI_orange = new BlockPlaster_c(Material.WOOD, "block_plaster_orange");
		SHIKKUI_pink = new BlockPlaster_c(Material.WOOD, "block_plaster_pink");
		SHIKKUI_purple = new BlockPlaster_c(Material.WOOD, "block_plaster_purple");
		SHIKKUI_red = new BlockPlaster_c(Material.WOOD, "block_plaster_red");
		SHIKKUI_yellow = new BlockPlaster_c(Material.WOOD, "block_plaster_yellow");
		SHIKKUI_white = new BlockPlaster_c(Material.WOOD, "block_plaster_white");

		SHIKKUI_ST_black = new BlockPlasterStairs_c("block_pst_black", DUMMYSHIKKUI.getDefaultState());
		SHIKKUI_ST_blue = new BlockPlasterStairs_c("block_pst_blue", DUMMYSHIKKUI.getDefaultState());
		SHIKKUI_ST_brown = new BlockPlasterStairs_c("block_pst_brown", DUMMYSHIKKUI.getDefaultState());
		SHIKKUI_ST_cyan = new BlockPlasterStairs_c("block_pst_cyan", DUMMYSHIKKUI.getDefaultState());
		SHIKKUI_ST_gray = new BlockPlasterStairs_c("block_pst_gray", DUMMYSHIKKUI.getDefaultState());
		SHIKKUI_ST_green = new BlockPlasterStairs_c("block_pst_green", DUMMYSHIKKUI.getDefaultState());
		SHIKKUI_ST_lightb = new BlockPlasterStairs_c("block_pst_lightb", DUMMYSHIKKUI.getDefaultState());
		SHIKKUI_ST_lightg = new BlockPlasterStairs_c("block_pst_lightg", DUMMYSHIKKUI.getDefaultState());
		SHIKKUI_ST_lime = new BlockPlasterStairs_c("block_pst_lime", DUMMYSHIKKUI.getDefaultState());
		SHIKKUI_ST_magenta = new BlockPlasterStairs_c("block_pst_magenta", DUMMYSHIKKUI.getDefaultState());
		SHIKKUI_ST_orange = new BlockPlasterStairs_c("block_pst_orange", DUMMYSHIKKUI.getDefaultState());
		SHIKKUI_ST_pink = new BlockPlasterStairs_c("block_pst_pink", DUMMYSHIKKUI.getDefaultState());
		SHIKKUI_ST_purple = new BlockPlasterStairs_c("block_pst_purple", DUMMYSHIKKUI.getDefaultState());
		SHIKKUI_ST_red = new BlockPlasterStairs_c("block_pst_red", DUMMYSHIKKUI.getDefaultState());
		SHIKKUI_ST_yellow = new BlockPlasterStairs_c("block_pst_yellow", DUMMYSHIKKUI.getDefaultState());
		SHIKKUI_ST_white = new BlockPlasterStairs_c("block_pst_white", DUMMYSHIKKUI.getDefaultState());

		SHIKKUI_SH_black = new BlockPlaster_PH_black("block_psh_black");
		SHIKKUI_SH_blue = new BlockPlaster_PH_blue("block_psh_blue");
		SHIKKUI_SH_brown = new BlockPlaster_PH_brown("block_psh_brown");
		SHIKKUI_SH_cyan = new BlockPlaster_PH_cyan("block_psh_cyan");
		SHIKKUI_SH_gray = new BlockPlaster_PH_gray("block_psh_gray");
		SHIKKUI_SH_green = new BlockPlaster_PH_green("block_psh_green");
		SHIKKUI_SH_lightb = new BlockPlaster_PH_lightb("block_psh_lightb");
		SHIKKUI_SH_lightg = new BlockPlaster_PH_lightg("block_psh_lightg");
		SHIKKUI_SH_lime = new BlockPlaster_PH_lime("block_psh_lime");
		SHIKKUI_SH_magenta = new BlockPlaster_PH_magenta("block_psh_magenta");
		SHIKKUI_SH_orange = new BlockPlaster_PH_orange("block_psh_orange");
		SHIKKUI_SH_pink = new BlockPlaster_PH_pink("block_psh_pink");
		SHIKKUI_SH_purple = new BlockPlaster_PH_purple("block_psh_purple");
		SHIKKUI_SH_red = new BlockPlaster_PH_red("block_psh_red");
		SHIKKUI_SH_yellow = new BlockPlaster_PH_yellow("block_psh_yellow");
		SHIKKUI_SH_white = new BlockPlaster_PH_white("block_psh_white");

		SHIKKUI_SD_black = new BlockPlaster_PD_black("block_psd_black");
		SHIKKUI_SD_blue = new BlockPlaster_PD_blue("block_psd_blue");
		SHIKKUI_SD_brown = new BlockPlaster_PD_brown("block_psd_brown");
		SHIKKUI_SD_cyan = new BlockPlaster_PD_cyan("block_psd_cyan");
		SHIKKUI_SD_gray = new BlockPlaster_PD_gray("block_psd_gray");
		SHIKKUI_SD_green = new BlockPlaster_PD_green("block_psd_green");
		SHIKKUI_SD_lightb = new BlockPlaster_PD_lightb("block_psd_lightb");
		SHIKKUI_SD_lightg = new BlockPlaster_PD_lightg("block_psd_lightg");
		SHIKKUI_SD_lime = new BlockPlaster_PD_lime("block_psd_lime");
		SHIKKUI_SD_magenta = new BlockPlaster_PD_magenta("block_psd_magenta");
		SHIKKUI_SD_orange = new BlockPlaster_PD_orange("block_psd_orange");
		SHIKKUI_SD_pink = new BlockPlaster_PD_pink("block_psd_pink");
		SHIKKUI_SD_purple = new BlockPlaster_PD_purple("block_psd_purple");
		SHIKKUI_SD_red = new BlockPlaster_PD_red("block_psd_red");
		SHIKKUI_SD_yellow = new BlockPlaster_PD_yellow("block_psd_yellow");
		SHIKKUI_SD_white = new BlockPlaster_PD_white("block_psd_white");
	}


	public static void register() {

		registerBlock(SHIKKUI_black);
		registerBlock(SHIKKUI_blue);
		registerBlock(SHIKKUI_brown);
		registerBlock(SHIKKUI_cyan);
		registerBlock(SHIKKUI_gray);
		registerBlock(SHIKKUI_green);
		registerBlock(SHIKKUI_lightb);
		registerBlock(SHIKKUI_lightg);
		registerBlock(SHIKKUI_lime);
		registerBlock(SHIKKUI_magenta);
		registerBlock(SHIKKUI_orange);
		registerBlock(SHIKKUI_pink);
		registerBlock(SHIKKUI_purple);
		registerBlock(SHIKKUI_red);
		registerBlock(SHIKKUI_yellow);
		registerBlock(SHIKKUI_white);

		registerBlock(SHIKKUI_ST_black);
		registerBlock(SHIKKUI_ST_blue);
		registerBlock(SHIKKUI_ST_brown);
		registerBlock(SHIKKUI_ST_cyan);
		registerBlock(SHIKKUI_ST_gray);
		registerBlock(SHIKKUI_ST_green);
		registerBlock(SHIKKUI_ST_lightb);
		registerBlock(SHIKKUI_ST_lightg);
		registerBlock(SHIKKUI_ST_lime);
		registerBlock(SHIKKUI_ST_magenta);
		registerBlock(SHIKKUI_ST_orange);
		registerBlock(SHIKKUI_ST_pink);
		registerBlock(SHIKKUI_ST_purple);
		registerBlock(SHIKKUI_ST_red);
		registerBlock(SHIKKUI_ST_yellow);
		registerBlock(SHIKKUI_ST_white);

		registerBlock(SHIKKUI_SH_black, new ItemSlab(SHIKKUI_SH_black, SHIKKUI_SH_black, SHIKKUI_SD_black));
		GameRegistry.register(SHIKKUI_SD_black);
		registerBlock(SHIKKUI_SH_blue, new ItemSlab(SHIKKUI_SH_blue, SHIKKUI_SH_blue, SHIKKUI_SD_blue));
		GameRegistry.register(SHIKKUI_SD_blue);
		registerBlock(SHIKKUI_SH_brown, new ItemSlab(SHIKKUI_SH_brown, SHIKKUI_SH_brown, SHIKKUI_SD_brown));
		GameRegistry.register(SHIKKUI_SD_brown);
		registerBlock(SHIKKUI_SH_cyan, new ItemSlab(SHIKKUI_SH_cyan, SHIKKUI_SH_cyan, SHIKKUI_SD_cyan));
		GameRegistry.register(SHIKKUI_SD_cyan);
		registerBlock(SHIKKUI_SH_gray, new ItemSlab(SHIKKUI_SH_gray, SHIKKUI_SH_gray, SHIKKUI_SD_gray));
		GameRegistry.register(SHIKKUI_SD_gray);
		registerBlock(SHIKKUI_SH_green, new ItemSlab(SHIKKUI_SH_green, SHIKKUI_SH_green, SHIKKUI_SD_green));
		GameRegistry.register(SHIKKUI_SD_green);
		registerBlock(SHIKKUI_SH_lightb, new ItemSlab(SHIKKUI_SH_lightb, SHIKKUI_SH_lightb, SHIKKUI_SD_lightb));
		GameRegistry.register(SHIKKUI_SD_lightb);
		registerBlock(SHIKKUI_SH_lightg, new ItemSlab(SHIKKUI_SH_lightg, SHIKKUI_SH_lightg, SHIKKUI_SD_lightg));
		GameRegistry.register(SHIKKUI_SD_lightg);
		registerBlock(SHIKKUI_SH_lime, new ItemSlab(SHIKKUI_SH_lime, SHIKKUI_SH_lime, SHIKKUI_SD_lime));
		GameRegistry.register(SHIKKUI_SD_lime);
		registerBlock(SHIKKUI_SH_magenta, new ItemSlab(SHIKKUI_SH_magenta, SHIKKUI_SH_magenta, SHIKKUI_SD_magenta));
		GameRegistry.register(SHIKKUI_SD_magenta);
		registerBlock(SHIKKUI_SH_orange, new ItemSlab(SHIKKUI_SH_orange, SHIKKUI_SH_orange, SHIKKUI_SD_orange));
		GameRegistry.register(SHIKKUI_SD_orange);
		registerBlock(SHIKKUI_SH_pink, new ItemSlab(SHIKKUI_SH_pink, SHIKKUI_SH_pink, SHIKKUI_SD_pink));
		GameRegistry.register(SHIKKUI_SD_pink);
		registerBlock(SHIKKUI_SH_purple, new ItemSlab(SHIKKUI_SH_purple, SHIKKUI_SH_purple, SHIKKUI_SD_purple));
		GameRegistry.register(SHIKKUI_SD_purple);
		registerBlock(SHIKKUI_SH_red, new ItemSlab(SHIKKUI_SH_red, SHIKKUI_SH_red, SHIKKUI_SD_red));
		GameRegistry.register(SHIKKUI_SD_red);
		registerBlock(SHIKKUI_SH_yellow, new ItemSlab(SHIKKUI_SH_yellow, SHIKKUI_SH_yellow, SHIKKUI_SD_yellow));
		GameRegistry.register(SHIKKUI_SD_yellow);
		registerBlock(SHIKKUI_SH_white, new ItemSlab(SHIKKUI_SH_white, SHIKKUI_SH_white, SHIKKUI_SD_white));
		GameRegistry.register(SHIKKUI_SD_white);

	}

	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	public static void registerBlock(Block block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
	}

	public static void registerRenders() {

		registerRender(SHIKKUI_black);
		registerRender(SHIKKUI_blue);
		registerRender(SHIKKUI_brown);
		registerRender(SHIKKUI_cyan);
		registerRender(SHIKKUI_gray);
		registerRender(SHIKKUI_green);
		registerRender(SHIKKUI_lightb);
		registerRender(SHIKKUI_lightg);
		registerRender(SHIKKUI_lime);
		registerRender(SHIKKUI_magenta);
		registerRender(SHIKKUI_orange);
		registerRender(SHIKKUI_pink);
		registerRender(SHIKKUI_purple);
		registerRender(SHIKKUI_red);
		registerRender(SHIKKUI_yellow);
		registerRender(SHIKKUI_white);

		registerRender(SHIKKUI_ST_black);
		registerRender(SHIKKUI_ST_blue);
		registerRender(SHIKKUI_ST_brown);
		registerRender(SHIKKUI_ST_cyan);
		registerRender(SHIKKUI_ST_gray);
		registerRender(SHIKKUI_ST_green);
		registerRender(SHIKKUI_ST_lightb);
		registerRender(SHIKKUI_ST_lightg);
		registerRender(SHIKKUI_ST_lime);
		registerRender(SHIKKUI_ST_magenta);
		registerRender(SHIKKUI_ST_orange);
		registerRender(SHIKKUI_ST_pink);
		registerRender(SHIKKUI_ST_purple);
		registerRender(SHIKKUI_ST_red);
		registerRender(SHIKKUI_ST_yellow);
		registerRender(SHIKKUI_ST_white);

		registerRender(SHIKKUI_SH_black);
		registerRender(SHIKKUI_SH_blue);
		registerRender(SHIKKUI_SH_brown);
		registerRender(SHIKKUI_SH_cyan);
		registerRender(SHIKKUI_SH_gray);
		registerRender(SHIKKUI_SH_green);
		registerRender(SHIKKUI_SH_lightb);
		registerRender(SHIKKUI_SH_lightg);
		registerRender(SHIKKUI_SH_lime);
		registerRender(SHIKKUI_SH_magenta);
		registerRender(SHIKKUI_SH_orange);
		registerRender(SHIKKUI_SH_pink);
		registerRender(SHIKKUI_SH_purple);
		registerRender(SHIKKUI_SH_red);
		registerRender(SHIKKUI_SH_yellow);
		registerRender(SHIKKUI_SH_white);

	}

    public static void registerRender(Block block) {
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
    			new ModelResourceLocation(block.getRegistryName(),"inventory"));
    }
}
