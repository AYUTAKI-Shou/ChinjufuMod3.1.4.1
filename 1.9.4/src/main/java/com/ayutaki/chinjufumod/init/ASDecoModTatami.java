package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.futon.BlockFuton_C_black;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_C_blue;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_C_brown;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_C_cyan;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_C_gray;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_C_green;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_C_lightb;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_C_lightg;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_C_lime;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_C_magenta;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_C_orange;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_C_pink;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_C_purple;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_C_red;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_C_white;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_C_yellow;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_O_black;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_O_blue;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_O_brown;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_O_cyan;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_O_gray;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_O_green;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_O_lightb;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_O_lightg;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_O_lime;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_O_magenta;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_O_orange;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_O_pink;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_O_purple;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_O_red;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_O_white;
import com.ayutaki.chinjufumod.init.futon.BlockFuton_O_yellow;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiD;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiD_black;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiD_blue;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiD_brown;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiD_cyan;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiD_gray;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiD_green;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiD_lightb;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiD_lightg;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiD_lime;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiD_magenta;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiD_orange;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiD_pink;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiD_purple;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiD_red;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiD_white;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiD_yellow;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiH;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiH_black;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiH_blue;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiH_brown;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiH_cyan;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiH_gray;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiH_green;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiH_lightb;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiH_lightg;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiH_lime;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiH_magenta;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiH_orange;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiH_pink;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiH_purple;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiH_red;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiH_white;
import com.ayutaki.chinjufumod.init.tatami.BlockTatamiH_yellow;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ASDecoModTatami {

	public static BlockTatamiH TATAMI_H;
	public static BlockTatamiH_black TATAMI_H_black;
	public static BlockTatamiH_blue TATAMI_H_blue;
	public static BlockTatamiH_brown TATAMI_H_brown;
	public static BlockTatamiH_cyan TATAMI_H_cyan;
	public static BlockTatamiH_gray TATAMI_H_gray;
	public static BlockTatamiH_green TATAMI_H_green;
	public static BlockTatamiH_lightb TATAMI_H_lightb;
	public static BlockTatamiH_lightg TATAMI_H_lightg;
	public static BlockTatamiH_lime TATAMI_H_lime;
	public static BlockTatamiH_magenta TATAMI_H_magenta;
	public static BlockTatamiH_orange TATAMI_H_orange;
	public static BlockTatamiH_pink TATAMI_H_pink;
	public static BlockTatamiH_purple TATAMI_H_purple;
	public static BlockTatamiH_red TATAMI_H_red;
	public static BlockTatamiH_yellow TATAMI_H_yellow;
	public static BlockTatamiH_white TATAMI_H_white;

	public static BlockTatamiD TATAMI_D;
	public static BlockTatamiD_black TATAMI_D_black;
	public static BlockTatamiD_blue TATAMI_D_blue;
	public static BlockTatamiD_brown TATAMI_D_brown;
	public static BlockTatamiD_cyan TATAMI_D_cyan;
	public static BlockTatamiD_gray TATAMI_D_gray;
	public static BlockTatamiD_green TATAMI_D_green;
	public static BlockTatamiD_lightb TATAMI_D_lightb;
	public static BlockTatamiD_lightg TATAMI_D_lightg;
	public static BlockTatamiD_lime TATAMI_D_lime;
	public static BlockTatamiD_magenta TATAMI_D_magenta;
	public static BlockTatamiD_orange TATAMI_D_orange;
	public static BlockTatamiD_pink TATAMI_D_pink;
	public static BlockTatamiD_purple TATAMI_D_purple;
	public static BlockTatamiD_red TATAMI_D_red;
	public static BlockTatamiD_yellow TATAMI_D_yellow;
	public static BlockTatamiD_white TATAMI_D_white;

	public static Block FUTON_C_white, FUTON_C_black, FUTON_C_blue, FUTON_C_brown,
						FUTON_C_cyan, FUTON_C_gray, FUTON_C_green, FUTON_C_lightb,
						FUTON_C_lightg, FUTON_C_lime, FUTON_C_magenta, FUTON_C_orange,
						FUTON_C_pink, FUTON_C_purple, FUTON_C_red, FUTON_C_yellow;
	public static Block FUTON_O_white, FUTON_O_black, FUTON_O_blue, FUTON_O_brown,
						FUTON_O_cyan, FUTON_O_gray, FUTON_O_green, FUTON_O_lightb,
						FUTON_O_lightg, FUTON_O_lime, FUTON_O_magenta, FUTON_O_orange,
						FUTON_O_pink, FUTON_O_purple, FUTON_O_red, FUTON_O_yellow;

	public static void init() {

		TATAMI_H = new BlockTatamiH("block_tatamih");
		TATAMI_H_black = new BlockTatamiH_black("block_tatamih_black");
		TATAMI_H_blue = new BlockTatamiH_blue("block_tatamih_blue");
		TATAMI_H_brown = new BlockTatamiH_brown("block_tatamih_brown");
		TATAMI_H_cyan = new BlockTatamiH_cyan("block_tatamih_cyan");
		TATAMI_H_gray = new BlockTatamiH_gray("block_tatamih_gray");
		TATAMI_H_green = new BlockTatamiH_green("block_tatamih_green");
		TATAMI_H_lightb = new BlockTatamiH_lightb("block_tatamih_lightb");
		TATAMI_H_lightg = new BlockTatamiH_lightg("block_tatamih_lightg");
		TATAMI_H_lime = new BlockTatamiH_lime("block_tatamih_lime");
		TATAMI_H_magenta = new BlockTatamiH_magenta("block_tatamih_magenta");
		TATAMI_H_orange = new BlockTatamiH_orange("block_tatamih_orange");
		TATAMI_H_pink = new BlockTatamiH_pink("block_tatamih_pink");
		TATAMI_H_purple = new BlockTatamiH_purple("block_tatamih_purple");
		TATAMI_H_red = new BlockTatamiH_red("block_tatamih_red");
		TATAMI_H_yellow = new BlockTatamiH_yellow("block_tatamih_yellow");
		TATAMI_H_white = new BlockTatamiH_white("block_tatamih_white");

		TATAMI_D = new BlockTatamiD("block_tatamid");
		TATAMI_D_black = new BlockTatamiD_black("block_tatamid_black");
		TATAMI_D_blue = new BlockTatamiD_blue("block_tatamid_blue");
		TATAMI_D_brown = new BlockTatamiD_brown("block_tatamid_brown");
		TATAMI_D_cyan = new BlockTatamiD_cyan("block_tatamid_cyan");
		TATAMI_D_gray = new BlockTatamiD_gray("block_tatamid_gray");
		TATAMI_D_green = new BlockTatamiD_green("block_tatamid_green");
		TATAMI_D_lightb = new BlockTatamiD_lightb("block_tatamid_lightb");
		TATAMI_D_lightg = new BlockTatamiD_lightg("block_tatamid_lightg");
		TATAMI_D_lime = new BlockTatamiD_lime("block_tatamid_lime");
		TATAMI_D_magenta = new BlockTatamiD_magenta("block_tatamid_magenta");
		TATAMI_D_orange = new BlockTatamiD_orange("block_tatamid_orange");
		TATAMI_D_pink = new BlockTatamiD_pink("block_tatamid_pink");
		TATAMI_D_purple = new BlockTatamiD_purple("block_tatamid_purple");
		TATAMI_D_red = new BlockTatamiD_red("block_tatamid_red");
		TATAMI_D_yellow = new BlockTatamiD_yellow("block_tatamid_yellow");
		TATAMI_D_white = new BlockTatamiD_white("block_tatamid_white");

		FUTON_C_black = new BlockFuton_C_black(Material.WOOD, "block_futon_c_black").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUTON_O_black = new BlockFuton_O_black(Material.WOOD, "block_futon_o_black");
		FUTON_C_blue = new BlockFuton_C_blue(Material.WOOD, "block_futon_c_blue").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUTON_O_blue = new BlockFuton_O_blue(Material.WOOD, "block_futon_o_blue");
		FUTON_C_brown = new BlockFuton_C_brown(Material.WOOD, "block_futon_c_brown").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUTON_O_brown = new BlockFuton_O_brown(Material.WOOD, "block_futon_o_brown");
		FUTON_C_cyan = new BlockFuton_C_cyan(Material.WOOD, "block_futon_c_cyan").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUTON_O_cyan = new BlockFuton_O_cyan(Material.WOOD, "block_futon_o_cyan");
		FUTON_C_gray = new BlockFuton_C_gray(Material.WOOD, "block_futon_c_gray").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUTON_O_gray = new BlockFuton_O_gray(Material.WOOD, "block_futon_o_gray");
		FUTON_C_green = new BlockFuton_C_green(Material.WOOD, "block_futon_c_green").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUTON_O_green = new BlockFuton_O_green(Material.WOOD, "block_futon_o_green");
		FUTON_C_lightb = new BlockFuton_C_lightb(Material.WOOD, "block_futon_c_lightb").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUTON_O_lightb = new BlockFuton_O_lightb(Material.WOOD, "block_futon_o_lightb");
		FUTON_C_lightg = new BlockFuton_C_lightg(Material.WOOD, "block_futon_c_lightg").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUTON_O_lightg = new BlockFuton_O_lightg(Material.WOOD, "block_futon_o_lightg");
		FUTON_C_lime = new BlockFuton_C_lime(Material.WOOD, "block_futon_c_lime").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUTON_O_lime = new BlockFuton_O_lime(Material.WOOD, "block_futon_o_lime");
		FUTON_C_magenta = new BlockFuton_C_magenta(Material.WOOD, "block_futon_c_magenta").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUTON_O_magenta = new BlockFuton_O_magenta(Material.WOOD, "block_futon_o_magenta");
		FUTON_C_orange = new BlockFuton_C_orange(Material.WOOD, "block_futon_c_orange").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUTON_O_orange = new BlockFuton_O_orange(Material.WOOD, "block_futon_o_orange");
		FUTON_C_pink = new BlockFuton_C_pink(Material.WOOD, "block_futon_c_pink").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUTON_O_pink = new BlockFuton_O_pink(Material.WOOD, "block_futon_o_pink");
		FUTON_C_purple = new BlockFuton_C_purple(Material.WOOD, "block_futon_c_purple").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUTON_O_purple = new BlockFuton_O_purple(Material.WOOD, "block_futon_o_purple");
		FUTON_C_red = new BlockFuton_C_red(Material.WOOD, "block_futon_c_red").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUTON_O_red = new BlockFuton_O_red(Material.WOOD, "block_futon_o_red");
		FUTON_C_white = new BlockFuton_C_white(Material.WOOD, "block_futon_c_white").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUTON_O_white = new BlockFuton_O_white(Material.WOOD, "block_futon_o_white");
		FUTON_C_yellow = new BlockFuton_C_yellow(Material.WOOD, "block_futon_c_yellow").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUTON_O_yellow = new BlockFuton_O_yellow(Material.WOOD, "block_futon_o_yellow");

	}


	public static void register() {


		registerBlock(TATAMI_H, new ItemSlab(TATAMI_H, TATAMI_H, TATAMI_D));
		GameRegistry.register(TATAMI_D);
		registerBlock(TATAMI_H_black, new ItemSlab(TATAMI_H_black, TATAMI_H_black, TATAMI_D_black));
		GameRegistry.register(TATAMI_D_black);
		registerBlock(TATAMI_H_blue, new ItemSlab(TATAMI_H_blue, TATAMI_H_blue, TATAMI_D_blue));
		GameRegistry.register(TATAMI_D_blue);
		registerBlock(TATAMI_H_brown, new ItemSlab(TATAMI_H_brown, TATAMI_H_brown, TATAMI_D_brown));
		GameRegistry.register(TATAMI_D_brown);
		registerBlock(TATAMI_H_cyan, new ItemSlab(TATAMI_H_cyan, TATAMI_H_cyan, TATAMI_D_cyan));
		GameRegistry.register(TATAMI_D_cyan);
		registerBlock(TATAMI_H_gray, new ItemSlab(TATAMI_H_gray, TATAMI_H_gray, TATAMI_D_gray));
		GameRegistry.register(TATAMI_D_gray);
		registerBlock(TATAMI_H_green, new ItemSlab(TATAMI_H_green, TATAMI_H_green, TATAMI_D_green));
		GameRegistry.register(TATAMI_D_green);
		registerBlock(TATAMI_H_lightb, new ItemSlab(TATAMI_H_lightb, TATAMI_H_lightb, TATAMI_D_lightb));
		GameRegistry.register(TATAMI_D_lightb);
		registerBlock(TATAMI_H_lightg, new ItemSlab(TATAMI_H_lightg, TATAMI_H_lightg, TATAMI_D_lightg));
		GameRegistry.register(TATAMI_D_lightg);
		registerBlock(TATAMI_H_lime, new ItemSlab(TATAMI_H_lime, TATAMI_H_lime, TATAMI_D_lime));
		GameRegistry.register(TATAMI_D_lime);
		registerBlock(TATAMI_H_magenta, new ItemSlab(TATAMI_H_magenta, TATAMI_H_magenta, TATAMI_D_magenta));
		GameRegistry.register(TATAMI_D_magenta);
		registerBlock(TATAMI_H_orange, new ItemSlab(TATAMI_H_orange, TATAMI_H_orange, TATAMI_D_orange));
		GameRegistry.register(TATAMI_D_orange);
		registerBlock(TATAMI_H_pink, new ItemSlab(TATAMI_H_pink, TATAMI_H_pink, TATAMI_D_pink));
		GameRegistry.register(TATAMI_D_pink);
		registerBlock(TATAMI_H_purple, new ItemSlab(TATAMI_H_purple, TATAMI_H_purple, TATAMI_D_purple));
		GameRegistry.register(TATAMI_D_purple);
		registerBlock(TATAMI_H_red, new ItemSlab(TATAMI_H_red, TATAMI_H_red, TATAMI_D_red));
		GameRegistry.register(TATAMI_D_red);
		registerBlock(TATAMI_H_yellow, new ItemSlab(TATAMI_H_yellow, TATAMI_H_yellow, TATAMI_D_yellow));
		GameRegistry.register(TATAMI_D_yellow);
		registerBlock(TATAMI_H_white, new ItemSlab(TATAMI_H_white, TATAMI_H_white, TATAMI_D_white));
		GameRegistry.register(TATAMI_D_white);

		registerBlock(FUTON_C_black);
		registerBlock(FUTON_O_black);
		registerBlock(FUTON_C_blue);
		registerBlock(FUTON_O_blue);
		registerBlock(FUTON_C_brown);
		registerBlock(FUTON_O_brown);
		registerBlock(FUTON_C_cyan);
		registerBlock(FUTON_O_cyan);
		registerBlock(FUTON_C_gray);
		registerBlock(FUTON_O_gray);
		registerBlock(FUTON_C_green);
		registerBlock(FUTON_O_green);
		registerBlock(FUTON_C_lightb);
		registerBlock(FUTON_O_lightb);
		registerBlock(FUTON_C_lightg);
		registerBlock(FUTON_O_lightg);
		registerBlock(FUTON_C_lime);
		registerBlock(FUTON_O_lime);
		registerBlock(FUTON_C_magenta);
		registerBlock(FUTON_O_magenta);
		registerBlock(FUTON_C_orange);
		registerBlock(FUTON_O_orange);
		registerBlock(FUTON_C_pink);
		registerBlock(FUTON_O_pink);
		registerBlock(FUTON_C_purple);
		registerBlock(FUTON_O_purple);
		registerBlock(FUTON_C_red);
		registerBlock(FUTON_O_red);
		registerBlock(FUTON_C_white);
		registerBlock(FUTON_O_white);
		registerBlock(FUTON_C_yellow);
		registerBlock(FUTON_O_yellow);

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

		registerRender(TATAMI_H);
		registerRender(TATAMI_H_black);
		registerRender(TATAMI_H_blue);
		registerRender(TATAMI_H_brown);
		registerRender(TATAMI_H_cyan);
		registerRender(TATAMI_H_gray);
		registerRender(TATAMI_H_green);
		registerRender(TATAMI_H_lightb);
		registerRender(TATAMI_H_lightg);
		registerRender(TATAMI_H_lime);
		registerRender(TATAMI_H_magenta);
		registerRender(TATAMI_H_orange);
		registerRender(TATAMI_H_pink);
		registerRender(TATAMI_H_purple);
		registerRender(TATAMI_H_red);
		registerRender(TATAMI_H_yellow);
		registerRender(TATAMI_H_white);

		registerRender(FUTON_C_black);
		registerRender(FUTON_C_blue);
		registerRender(FUTON_C_brown);
		registerRender(FUTON_C_cyan);
		registerRender(FUTON_C_gray);
		registerRender(FUTON_C_green);
		registerRender(FUTON_C_lightb);
		registerRender(FUTON_C_lightg);
		registerRender(FUTON_C_lime);
		registerRender(FUTON_C_magenta);
		registerRender(FUTON_C_orange);
		registerRender(FUTON_C_pink);
		registerRender(FUTON_C_purple);
		registerRender(FUTON_C_red);
		registerRender(FUTON_C_white);
		registerRender(FUTON_C_yellow);

	}

    public static void registerRender(Block block) {
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
    			new ModelResourceLocation(block.getRegistryName(),"inventory"));
    }
}
