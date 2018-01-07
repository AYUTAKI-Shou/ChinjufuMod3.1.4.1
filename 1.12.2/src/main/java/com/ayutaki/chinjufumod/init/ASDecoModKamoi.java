package com.ayutaki.chinjufumod.init;

import java.util.LinkedList;
import java.util.List;

import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_black;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_blue;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_brown;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_cyan;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_gray;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_green;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_lightb;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_lightg;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_lime;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_magenta;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_orange;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_pink;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_purple;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_red;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_white;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_yellow;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ASDecoModKamoi {

	public static Block KAMOI_black_a, KAMOI_black_b, KAMOI_black_d, KAMOI_black_j, KAMOI_black_o, KAMOI_black_s;
	public static Block KAMOI_blue_a, KAMOI_blue_b, KAMOI_blue_d, KAMOI_blue_j, KAMOI_blue_o, KAMOI_blue_s;
	public static Block KAMOI_brown_a, KAMOI_brown_b, KAMOI_brown_d, KAMOI_brown_j, KAMOI_brown_o, KAMOI_brown_s;
	public static Block KAMOI_cyan_a, KAMOI_cyan_b, KAMOI_cyan_d, KAMOI_cyan_j, KAMOI_cyan_o, KAMOI_cyan_s;
	public static Block KAMOI_gray_a, KAMOI_gray_b, KAMOI_gray_d, KAMOI_gray_j, KAMOI_gray_o, KAMOI_gray_s;
	public static Block KAMOI_green_a, KAMOI_green_b, KAMOI_green_d, KAMOI_green_j, KAMOI_green_o, KAMOI_green_s;
	public static Block KAMOI_lightb_a, KAMOI_lightb_b, KAMOI_lightb_d, KAMOI_lightb_j, KAMOI_lightb_o, KAMOI_lightb_s;
	public static Block KAMOI_lightg_a, KAMOI_lightg_b, KAMOI_lightg_d, KAMOI_lightg_j, KAMOI_lightg_o, KAMOI_lightg_s;
	public static Block KAMOI_lime_a, KAMOI_lime_b, KAMOI_lime_d, KAMOI_lime_j, KAMOI_lime_o, KAMOI_lime_s;
	public static Block KAMOI_magenta_a, KAMOI_magenta_b, KAMOI_magenta_d, KAMOI_magenta_j, KAMOI_magenta_o, KAMOI_magenta_s;
	public static Block KAMOI_orange_a, KAMOI_orange_b, KAMOI_orange_d, KAMOI_orange_j, KAMOI_orange_o, KAMOI_orange_s;
	public static Block KAMOI_pink_a, KAMOI_pink_b, KAMOI_pink_d, KAMOI_pink_j, KAMOI_pink_o, KAMOI_pink_s;
	public static Block KAMOI_purple_a, KAMOI_purple_b, KAMOI_purple_d, KAMOI_purple_j, KAMOI_purple_o, KAMOI_purple_s;
	public static Block KAMOI_red_a, KAMOI_red_b, KAMOI_red_d, KAMOI_red_j, KAMOI_red_o, KAMOI_red_s;
	public static Block KAMOI_white_a, KAMOI_white_b, KAMOI_white_d, KAMOI_white_j, KAMOI_white_o, KAMOI_white_s;
	public static Block KAMOI_yellow_a, KAMOI_yellow_b, KAMOI_yellow_d, KAMOI_yellow_j, KAMOI_yellow_o, KAMOI_yellow_s;

	public static void init() {

		KAMOI_black_a = new BlockKamoi_black(Material.WOOD, "block_ka_black_a").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_black_b = new BlockKamoi_black(Material.WOOD, "block_ka_black_b").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_black_d = new BlockKamoi_black(Material.WOOD, "block_ka_black_d").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_black_j = new BlockKamoi_black(Material.WOOD, "block_ka_black_j").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_black_o = new BlockKamoi_black(Material.WOOD, "block_ka_black_o").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_black_s = new BlockKamoi_black(Material.WOOD, "block_ka_black_s").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

		KAMOI_blue_a = new BlockKamoi_blue(Material.WOOD, "block_ka_blue_a").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_blue_b = new BlockKamoi_blue(Material.WOOD, "block_ka_blue_b").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_blue_d = new BlockKamoi_blue(Material.WOOD, "block_ka_blue_d").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_blue_j = new BlockKamoi_blue(Material.WOOD, "block_ka_blue_j").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_blue_o = new BlockKamoi_blue(Material.WOOD, "block_ka_blue_o").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_blue_s = new BlockKamoi_blue(Material.WOOD, "block_ka_blue_s").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

		KAMOI_brown_a = new BlockKamoi_brown(Material.WOOD, "block_ka_brown_a").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_brown_b = new BlockKamoi_brown(Material.WOOD, "block_ka_brown_b").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_brown_d = new BlockKamoi_brown(Material.WOOD, "block_ka_brown_d").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_brown_j = new BlockKamoi_brown(Material.WOOD, "block_ka_brown_j").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_brown_o = new BlockKamoi_brown(Material.WOOD, "block_ka_brown_o").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_brown_s = new BlockKamoi_brown(Material.WOOD, "block_ka_brown_s").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

		KAMOI_cyan_a = new BlockKamoi_cyan(Material.WOOD, "block_ka_cyan_a").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_cyan_b = new BlockKamoi_cyan(Material.WOOD, "block_ka_cyan_b").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_cyan_d = new BlockKamoi_cyan(Material.WOOD, "block_ka_cyan_d").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_cyan_j = new BlockKamoi_cyan(Material.WOOD, "block_ka_cyan_j").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_cyan_o = new BlockKamoi_cyan(Material.WOOD, "block_ka_cyan_o").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_cyan_s = new BlockKamoi_cyan(Material.WOOD, "block_ka_cyan_s").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

		KAMOI_gray_a = new BlockKamoi_gray(Material.WOOD, "block_ka_gray_a").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_gray_b = new BlockKamoi_gray(Material.WOOD, "block_ka_gray_b").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_gray_d = new BlockKamoi_gray(Material.WOOD, "block_ka_gray_d").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_gray_j = new BlockKamoi_gray(Material.WOOD, "block_ka_gray_j").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_gray_o = new BlockKamoi_gray(Material.WOOD, "block_ka_gray_o").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_gray_s = new BlockKamoi_gray(Material.WOOD, "block_ka_gray_s").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

		KAMOI_green_a = new BlockKamoi_green(Material.WOOD, "block_ka_green_a").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_green_b = new BlockKamoi_green(Material.WOOD, "block_ka_green_b").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_green_d = new BlockKamoi_green(Material.WOOD, "block_ka_green_d").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_green_j = new BlockKamoi_green(Material.WOOD, "block_ka_green_j").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_green_o = new BlockKamoi_green(Material.WOOD, "block_ka_green_o").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_green_s = new BlockKamoi_green(Material.WOOD, "block_ka_green_s").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

		KAMOI_lightb_a = new BlockKamoi_lightb(Material.WOOD, "block_ka_lightb_a").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_lightb_b = new BlockKamoi_lightb(Material.WOOD, "block_ka_lightb_b").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_lightb_d = new BlockKamoi_lightb(Material.WOOD, "block_ka_lightb_d").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_lightb_j = new BlockKamoi_lightb(Material.WOOD, "block_ka_lightb_j").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_lightb_o = new BlockKamoi_lightb(Material.WOOD, "block_ka_lightb_o").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_lightb_s = new BlockKamoi_lightb(Material.WOOD, "block_ka_lightb_s").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

		KAMOI_lightg_a = new BlockKamoi_lightg(Material.WOOD, "block_ka_lightg_a").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_lightg_b = new BlockKamoi_lightg(Material.WOOD, "block_ka_lightg_b").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_lightg_d = new BlockKamoi_lightg(Material.WOOD, "block_ka_lightg_d").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_lightg_j = new BlockKamoi_lightg(Material.WOOD, "block_ka_lightg_j").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_lightg_o = new BlockKamoi_lightg(Material.WOOD, "block_ka_lightg_o").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_lightg_s = new BlockKamoi_lightg(Material.WOOD, "block_ka_lightg_s").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

		KAMOI_lime_a = new BlockKamoi_lime(Material.WOOD, "block_ka_lime_a").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_lime_b = new BlockKamoi_lime(Material.WOOD, "block_ka_lime_b").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_lime_d = new BlockKamoi_lime(Material.WOOD, "block_ka_lime_d").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_lime_j = new BlockKamoi_lime(Material.WOOD, "block_ka_lime_j").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_lime_o = new BlockKamoi_lime(Material.WOOD, "block_ka_lime_o").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_lime_s = new BlockKamoi_lime(Material.WOOD, "block_ka_lime_s").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

		KAMOI_magenta_a = new BlockKamoi_magenta(Material.WOOD, "block_ka_magenta_a").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_magenta_b = new BlockKamoi_magenta(Material.WOOD, "block_ka_magenta_b").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_magenta_d = new BlockKamoi_magenta(Material.WOOD, "block_ka_magenta_d").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_magenta_j = new BlockKamoi_magenta(Material.WOOD, "block_ka_magenta_j").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_magenta_o = new BlockKamoi_magenta(Material.WOOD, "block_ka_magenta_o").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_magenta_s = new BlockKamoi_magenta(Material.WOOD, "block_ka_magenta_s").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

		KAMOI_orange_a = new BlockKamoi_orange(Material.WOOD, "block_ka_orange_a").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_orange_b = new BlockKamoi_orange(Material.WOOD, "block_ka_orange_b").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_orange_d = new BlockKamoi_orange(Material.WOOD, "block_ka_orange_d").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_orange_j = new BlockKamoi_orange(Material.WOOD, "block_ka_orange_j").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_orange_o = new BlockKamoi_orange(Material.WOOD, "block_ka_orange_o").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_orange_s = new BlockKamoi_orange(Material.WOOD, "block_ka_orange_s").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

		KAMOI_pink_a = new BlockKamoi_pink(Material.WOOD, "block_ka_pink_a").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_pink_b = new BlockKamoi_pink(Material.WOOD, "block_ka_pink_b").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_pink_d = new BlockKamoi_pink(Material.WOOD, "block_ka_pink_d").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_pink_j = new BlockKamoi_pink(Material.WOOD, "block_ka_pink_j").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_pink_o = new BlockKamoi_pink(Material.WOOD, "block_ka_pink_o").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_pink_s = new BlockKamoi_pink(Material.WOOD, "block_ka_pink_s").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

		KAMOI_purple_a = new BlockKamoi_purple(Material.WOOD, "block_ka_purple_a").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_purple_b = new BlockKamoi_purple(Material.WOOD, "block_ka_purple_b").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_purple_d = new BlockKamoi_purple(Material.WOOD, "block_ka_purple_d").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_purple_j = new BlockKamoi_purple(Material.WOOD, "block_ka_purple_j").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_purple_o = new BlockKamoi_purple(Material.WOOD, "block_ka_purple_o").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_purple_s = new BlockKamoi_purple(Material.WOOD, "block_ka_purple_s").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

		KAMOI_red_a = new BlockKamoi_red(Material.WOOD, "block_ka_red_a").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_red_b = new BlockKamoi_red(Material.WOOD, "block_ka_red_b").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_red_d = new BlockKamoi_red(Material.WOOD, "block_ka_red_d").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_red_j = new BlockKamoi_red(Material.WOOD, "block_ka_red_j").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_red_o = new BlockKamoi_red(Material.WOOD, "block_ka_red_o").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_red_s = new BlockKamoi_red(Material.WOOD, "block_ka_red_s").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

		KAMOI_white_a = new BlockKamoi_white(Material.WOOD, "block_ka_white_a").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_white_b = new BlockKamoi_white(Material.WOOD, "block_ka_white_b").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_white_d = new BlockKamoi_white(Material.WOOD, "block_ka_white_d").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_white_j = new BlockKamoi_white(Material.WOOD, "block_ka_white_j").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_white_o = new BlockKamoi_white(Material.WOOD, "block_ka_white_o").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_white_s = new BlockKamoi_white(Material.WOOD, "block_ka_white_s").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

		KAMOI_yellow_a = new BlockKamoi_yellow(Material.WOOD, "block_ka_yellow_a").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_yellow_b = new BlockKamoi_yellow(Material.WOOD, "block_ka_yellow_b").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_yellow_d = new BlockKamoi_yellow(Material.WOOD, "block_ka_yellow_d").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_yellow_j = new BlockKamoi_yellow(Material.WOOD, "block_ka_yellow_j").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_yellow_o = new BlockKamoi_yellow(Material.WOOD, "block_ka_yellow_o").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		KAMOI_yellow_s = new BlockKamoi_yellow(Material.WOOD, "block_ka_yellow_s").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

	}


	public static void register() {

		registerBlock(KAMOI_black_a);
		registerBlock(KAMOI_black_b);
		registerBlock(KAMOI_black_d);
		registerBlock(KAMOI_black_j);
		registerBlock(KAMOI_black_o);
		registerBlock(KAMOI_black_s);

		registerBlock(KAMOI_blue_a);
		registerBlock(KAMOI_blue_b);
		registerBlock(KAMOI_blue_d);
		registerBlock(KAMOI_blue_j);
		registerBlock(KAMOI_blue_o);
		registerBlock(KAMOI_blue_s);

		registerBlock(KAMOI_brown_a);
		registerBlock(KAMOI_brown_b);
		registerBlock(KAMOI_brown_d);
		registerBlock(KAMOI_brown_j);
		registerBlock(KAMOI_brown_o);
		registerBlock(KAMOI_brown_s);

		registerBlock(KAMOI_cyan_a);
		registerBlock(KAMOI_cyan_b);
		registerBlock(KAMOI_cyan_d);
		registerBlock(KAMOI_cyan_j);
		registerBlock(KAMOI_cyan_o);
		registerBlock(KAMOI_cyan_s);

		registerBlock(KAMOI_gray_a);
		registerBlock(KAMOI_gray_b);
		registerBlock(KAMOI_gray_d);
		registerBlock(KAMOI_gray_j);
		registerBlock(KAMOI_gray_o);
		registerBlock(KAMOI_gray_s);

		registerBlock(KAMOI_green_a);
		registerBlock(KAMOI_green_b);
		registerBlock(KAMOI_green_d);
		registerBlock(KAMOI_green_j);
		registerBlock(KAMOI_green_o);
		registerBlock(KAMOI_green_s);

		registerBlock(KAMOI_lightb_a);
		registerBlock(KAMOI_lightb_b);
		registerBlock(KAMOI_lightb_d);
		registerBlock(KAMOI_lightb_j);
		registerBlock(KAMOI_lightb_o);
		registerBlock(KAMOI_lightb_s);

		registerBlock(KAMOI_lightg_a);
		registerBlock(KAMOI_lightg_b);
		registerBlock(KAMOI_lightg_d);
		registerBlock(KAMOI_lightg_j);
		registerBlock(KAMOI_lightg_o);
		registerBlock(KAMOI_lightg_s);

		registerBlock(KAMOI_lime_a);
		registerBlock(KAMOI_lime_b);
		registerBlock(KAMOI_lime_d);
		registerBlock(KAMOI_lime_j);
		registerBlock(KAMOI_lime_o);
		registerBlock(KAMOI_lime_s);

		registerBlock(KAMOI_magenta_a);
		registerBlock(KAMOI_magenta_b);
		registerBlock(KAMOI_magenta_d);
		registerBlock(KAMOI_magenta_j);
		registerBlock(KAMOI_magenta_o);
		registerBlock(KAMOI_magenta_s);

		registerBlock(KAMOI_orange_a);
		registerBlock(KAMOI_orange_b);
		registerBlock(KAMOI_orange_d);
		registerBlock(KAMOI_orange_j);
		registerBlock(KAMOI_orange_o);
		registerBlock(KAMOI_orange_s);

		registerBlock(KAMOI_pink_a);
		registerBlock(KAMOI_pink_b);
		registerBlock(KAMOI_pink_d);
		registerBlock(KAMOI_pink_j);
		registerBlock(KAMOI_pink_o);
		registerBlock(KAMOI_pink_s);

		registerBlock(KAMOI_purple_a);
		registerBlock(KAMOI_purple_b);
		registerBlock(KAMOI_purple_d);
		registerBlock(KAMOI_purple_j);
		registerBlock(KAMOI_purple_o);
		registerBlock(KAMOI_purple_s);

		registerBlock(KAMOI_red_a);
		registerBlock(KAMOI_red_b);
		registerBlock(KAMOI_red_d);
		registerBlock(KAMOI_red_j);
		registerBlock(KAMOI_red_o);
		registerBlock(KAMOI_red_s);

		registerBlock(KAMOI_white_a);
		registerBlock(KAMOI_white_b);
		registerBlock(KAMOI_white_d);
		registerBlock(KAMOI_white_j);
		registerBlock(KAMOI_white_o);
		registerBlock(KAMOI_white_s);

		registerBlock(KAMOI_yellow_a);
		registerBlock(KAMOI_yellow_b);
		registerBlock(KAMOI_yellow_d);
		registerBlock(KAMOI_yellow_j);
		registerBlock(KAMOI_yellow_o);
		registerBlock(KAMOI_yellow_s);

	}

	public static void registerBlock(Block block) {
		registerBlock(block, new ItemBlock(block));
	}

	public static void registerBlock(Block block, ItemBlock item) {
		RegistrationHandler.BLOCKS.add(block);
		item.setRegistryName(block.getRegistryName());
		New_ChinjufuModItems.RegistrationHandler.ITEMS.add(item);
	}


	public static void registerRenders() {

		registerRender(KAMOI_black_a);
		registerRender(KAMOI_black_b);
		registerRender(KAMOI_black_d);
		registerRender(KAMOI_black_j);
		registerRender(KAMOI_black_o);
		registerRender(KAMOI_black_s);

		registerRender(KAMOI_blue_a);
		registerRender(KAMOI_blue_b);
		registerRender(KAMOI_blue_d);
		registerRender(KAMOI_blue_j);
		registerRender(KAMOI_blue_o);
		registerRender(KAMOI_blue_s);

		registerRender(KAMOI_brown_a);
		registerRender(KAMOI_brown_b);
		registerRender(KAMOI_brown_d);
		registerRender(KAMOI_brown_j);
		registerRender(KAMOI_brown_o);
		registerRender(KAMOI_brown_s);

		registerRender(KAMOI_cyan_a);
		registerRender(KAMOI_cyan_b);
		registerRender(KAMOI_cyan_d);
		registerRender(KAMOI_cyan_j);
		registerRender(KAMOI_cyan_o);
		registerRender(KAMOI_cyan_s);

		registerRender(KAMOI_gray_a);
		registerRender(KAMOI_gray_b);
		registerRender(KAMOI_gray_d);
		registerRender(KAMOI_gray_j);
		registerRender(KAMOI_gray_o);
		registerRender(KAMOI_gray_s);

		registerRender(KAMOI_green_a);
		registerRender(KAMOI_green_b);
		registerRender(KAMOI_green_d);
		registerRender(KAMOI_green_j);
		registerRender(KAMOI_green_o);
		registerRender(KAMOI_green_s);

		registerRender(KAMOI_lightb_a);
		registerRender(KAMOI_lightb_b);
		registerRender(KAMOI_lightb_d);
		registerRender(KAMOI_lightb_j);
		registerRender(KAMOI_lightb_o);
		registerRender(KAMOI_lightb_s);

		registerRender(KAMOI_lightg_a);
		registerRender(KAMOI_lightg_b);
		registerRender(KAMOI_lightg_d);
		registerRender(KAMOI_lightg_j);
		registerRender(KAMOI_lightg_o);
		registerRender(KAMOI_lightg_s);

		registerRender(KAMOI_lime_a);
		registerRender(KAMOI_lime_b);
		registerRender(KAMOI_lime_d);
		registerRender(KAMOI_lime_j);
		registerRender(KAMOI_lime_o);
		registerRender(KAMOI_lime_s);

		registerRender(KAMOI_magenta_a);
		registerRender(KAMOI_magenta_b);
		registerRender(KAMOI_magenta_d);
		registerRender(KAMOI_magenta_j);
		registerRender(KAMOI_magenta_o);
		registerRender(KAMOI_magenta_s);

		registerRender(KAMOI_orange_a);
		registerRender(KAMOI_orange_b);
		registerRender(KAMOI_orange_d);
		registerRender(KAMOI_orange_j);
		registerRender(KAMOI_orange_o);
		registerRender(KAMOI_orange_s);

		registerRender(KAMOI_pink_a);
		registerRender(KAMOI_pink_b);
		registerRender(KAMOI_pink_d);
		registerRender(KAMOI_pink_j);
		registerRender(KAMOI_pink_o);
		registerRender(KAMOI_pink_s);

		registerRender(KAMOI_purple_a);
		registerRender(KAMOI_purple_b);
		registerRender(KAMOI_purple_d);
		registerRender(KAMOI_purple_j);
		registerRender(KAMOI_purple_o);
		registerRender(KAMOI_purple_s);

		registerRender(KAMOI_red_a);
		registerRender(KAMOI_red_b);
		registerRender(KAMOI_red_d);
		registerRender(KAMOI_red_j);
		registerRender(KAMOI_red_o);
		registerRender(KAMOI_red_s);

		registerRender(KAMOI_white_a);
		registerRender(KAMOI_white_b);
		registerRender(KAMOI_white_d);
		registerRender(KAMOI_white_j);
		registerRender(KAMOI_white_o);
		registerRender(KAMOI_white_s);

		registerRender(KAMOI_yellow_a);
		registerRender(KAMOI_yellow_b);
		registerRender(KAMOI_yellow_d);
		registerRender(KAMOI_yellow_j);
		registerRender(KAMOI_yellow_o);
		registerRender(KAMOI_yellow_s);

	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(block.getRegistryName(),"inventory"));
	}

	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	public static class RegistrationHandler {

		public static final List<Block> BLOCKS = new LinkedList<>();

		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Block> event) {

			ASDecoModKamoi.init();
			ASDecoModKamoi.register();
			BLOCKS.stream().forEach(block -> event.getRegistry().register(block));
		}
	}
}
