package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.namako.BlockWP_namako;
import com.ayutaki.chinjufumod.init.shikkui.BlockWP_plaster;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class New_ASDecoModWallPane2 {

	public static Block WP_DIRTWALL;
	public static Block WP_PLASTER_black,WP_PLASTER_blue,WP_PLASTER_brown,WP_PLASTER_cyan,
						WP_PLASTER_gray,WP_PLASTER_green,WP_PLASTER_lightb,WP_PLASTER_lightg,
						WP_PLASTER_lime,WP_PLASTER_magenta,WP_PLASTER_orange,WP_PLASTER_pink,
						WP_PLASTER_purple,WP_PLASTER_red,WP_PLASTER_white,WP_PLASTER_yellow;

	public static Block WP_NAMAKO_black,WP_NAMAKO_blue,WP_NAMAKO_brown,WP_NAMAKO_cyan,
						WP_NAMAKO_gray,WP_NAMAKO_green,WP_NAMAKO_lightb,WP_NAMAKO_lightg,
						WP_NAMAKO_lime,WP_NAMAKO_magenta,WP_NAMAKO_orange,WP_NAMAKO_pink,
						WP_NAMAKO_purple,WP_NAMAKO_red,WP_NAMAKO_white,WP_NAMAKO_yellow;

	public static Block WP_NAMAKOB_black,WP_NAMAKOB_blue,WP_NAMAKOB_brown,WP_NAMAKOB_cyan,
						WP_NAMAKOB_gray,WP_NAMAKOB_green,WP_NAMAKOB_lightb,WP_NAMAKOB_lightg,
						WP_NAMAKOB_lime,WP_NAMAKOB_magenta,WP_NAMAKOB_orange,WP_NAMAKOB_pink,
						WP_NAMAKOB_purple,WP_NAMAKOB_red,WP_NAMAKOB_white,WP_NAMAKOB_yellow;

	public static void init() {

		WP_DIRTWALL = new BlockWP_plaster("block_wp_dirtwall").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PLASTER_black = new BlockWP_plaster("block_wp_plaster_black").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PLASTER_blue = new BlockWP_plaster("block_wp_plaster_blue").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PLASTER_brown = new BlockWP_plaster("block_wp_plaster_brown").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PLASTER_cyan = new BlockWP_plaster("block_wp_plaster_cyan").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PLASTER_gray = new BlockWP_plaster("block_wp_plaster_gray").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PLASTER_green = new BlockWP_plaster("block_wp_plaster_green").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PLASTER_lightb = new BlockWP_plaster("block_wp_plaster_lightb").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PLASTER_lightg = new BlockWP_plaster("block_wp_plaster_lightg").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PLASTER_lime = new BlockWP_plaster("block_wp_plaster_lime").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PLASTER_magenta = new BlockWP_plaster("block_wp_plaster_magenta").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PLASTER_orange = new BlockWP_plaster("block_wp_plaster_orange").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PLASTER_pink = new BlockWP_plaster("block_wp_plaster_pink").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PLASTER_purple = new BlockWP_plaster("block_wp_plaster_purple").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PLASTER_red = new BlockWP_plaster("block_wp_plaster_red").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PLASTER_white = new BlockWP_plaster("block_wp_plaster_white").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PLASTER_yellow = new BlockWP_plaster("block_wp_plaster_yellow").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		WP_NAMAKO_black = new BlockWP_namako("block_wp_namako_black").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKO_blue = new BlockWP_namako("block_wp_namako_blue").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKO_brown = new BlockWP_namako("block_wp_namako_brown").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKO_cyan = new BlockWP_namako("block_wp_namako_cyan").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKO_gray = new BlockWP_namako("block_wp_namako_gray").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKO_green = new BlockWP_namako("block_wp_namako_green").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKO_lightb = new BlockWP_namako("block_wp_namako_lightb").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKO_lightg = new BlockWP_namako("block_wp_namako_lightg").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKO_lime = new BlockWP_namako("block_wp_namako_lime").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKO_magenta = new BlockWP_namako("block_wp_namako_magenta").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKO_orange = new BlockWP_namako("block_wp_namako_orange").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKO_pink = new BlockWP_namako("block_wp_namako_pink").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKO_purple = new BlockWP_namako("block_wp_namako_purple").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKO_red = new BlockWP_namako("block_wp_namako_red").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKO_white = new BlockWP_namako("block_wp_namako_white").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKO_yellow = new BlockWP_namako("block_wp_namako_yellow").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		WP_NAMAKOB_black = new BlockWP_namako("block_wp_namako_b_black").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKOB_blue = new BlockWP_namako("block_wp_namako_b_blue").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKOB_brown = new BlockWP_namako("block_wp_namako_b_brown").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKOB_cyan = new BlockWP_namako("block_wp_namako_b_cyan").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKOB_gray = new BlockWP_namako("block_wp_namako_b_gray").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKOB_green = new BlockWP_namako("block_wp_namako_b_green").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKOB_lightb = new BlockWP_namako("block_wp_namako_b_lightb").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKOB_lightg = new BlockWP_namako("block_wp_namako_b_lightg").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKOB_lime = new BlockWP_namako("block_wp_namako_b_lime").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKOB_magenta = new BlockWP_namako("block_wp_namako_b_magenta").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKOB_orange = new BlockWP_namako("block_wp_namako_b_orange").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKOB_pink = new BlockWP_namako("block_wp_namako_b_pink").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKOB_purple = new BlockWP_namako("block_wp_namako_b_purple").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKOB_red = new BlockWP_namako("block_wp_namako_b_red").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKOB_white = new BlockWP_namako("block_wp_namako_b_white").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NAMAKOB_yellow = new BlockWP_namako("block_wp_namako_b_yellow").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
	}


	public static void register() {

		registerBlock(WP_DIRTWALL);
		registerBlock(WP_PLASTER_black);
		registerBlock(WP_PLASTER_blue);
		registerBlock(WP_PLASTER_brown);
		registerBlock(WP_PLASTER_cyan);
		registerBlock(WP_PLASTER_gray);
		registerBlock(WP_PLASTER_green);
		registerBlock(WP_PLASTER_lightb);
		registerBlock(WP_PLASTER_lightg);
		registerBlock(WP_PLASTER_lime);
		registerBlock(WP_PLASTER_magenta);
		registerBlock(WP_PLASTER_orange);
		registerBlock(WP_PLASTER_pink);
		registerBlock(WP_PLASTER_purple);
		registerBlock(WP_PLASTER_red);
		registerBlock(WP_PLASTER_white);
		registerBlock(WP_PLASTER_yellow);

		registerBlock(WP_NAMAKO_black);
		registerBlock(WP_NAMAKO_blue);
		registerBlock(WP_NAMAKO_brown);
		registerBlock(WP_NAMAKO_cyan);
		registerBlock(WP_NAMAKO_gray);
		registerBlock(WP_NAMAKO_green);
		registerBlock(WP_NAMAKO_lightb);
		registerBlock(WP_NAMAKO_lightg);
		registerBlock(WP_NAMAKO_lime);
		registerBlock(WP_NAMAKO_magenta);
		registerBlock(WP_NAMAKO_orange);
		registerBlock(WP_NAMAKO_pink);
		registerBlock(WP_NAMAKO_purple);
		registerBlock(WP_NAMAKO_red);
		registerBlock(WP_NAMAKO_white);
		registerBlock(WP_NAMAKO_yellow);

		registerBlock(WP_NAMAKOB_black);
		registerBlock(WP_NAMAKOB_blue);
		registerBlock(WP_NAMAKOB_brown);
		registerBlock(WP_NAMAKOB_cyan);
		registerBlock(WP_NAMAKOB_gray);
		registerBlock(WP_NAMAKOB_green);
		registerBlock(WP_NAMAKOB_lightb);
		registerBlock(WP_NAMAKOB_lightg);
		registerBlock(WP_NAMAKOB_lime);
		registerBlock(WP_NAMAKOB_magenta);
		registerBlock(WP_NAMAKOB_orange);
		registerBlock(WP_NAMAKOB_pink);
		registerBlock(WP_NAMAKOB_purple);
		registerBlock(WP_NAMAKOB_red);
		registerBlock(WP_NAMAKOB_white);
		registerBlock(WP_NAMAKOB_yellow);
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

		registerRender(WP_DIRTWALL);
		registerRender(WP_PLASTER_black);
		registerRender(WP_PLASTER_blue);
		registerRender(WP_PLASTER_brown);
		registerRender(WP_PLASTER_cyan);
		registerRender(WP_PLASTER_gray);
		registerRender(WP_PLASTER_green);
		registerRender(WP_PLASTER_lightb);
		registerRender(WP_PLASTER_lightg);
		registerRender(WP_PLASTER_lime);
		registerRender(WP_PLASTER_magenta);
		registerRender(WP_PLASTER_orange);
		registerRender(WP_PLASTER_pink);
		registerRender(WP_PLASTER_purple);
		registerRender(WP_PLASTER_red);
		registerRender(WP_PLASTER_white);
		registerRender(WP_PLASTER_yellow);

		registerRender(WP_NAMAKO_black);
		registerRender(WP_NAMAKO_blue);
		registerRender(WP_NAMAKO_brown);
		registerRender(WP_NAMAKO_cyan);
		registerRender(WP_NAMAKO_gray);
		registerRender(WP_NAMAKO_green);
		registerRender(WP_NAMAKO_lightb);
		registerRender(WP_NAMAKO_lightg);
		registerRender(WP_NAMAKO_lime);
		registerRender(WP_NAMAKO_magenta);
		registerRender(WP_NAMAKO_orange);
		registerRender(WP_NAMAKO_pink);
		registerRender(WP_NAMAKO_purple);
		registerRender(WP_NAMAKO_red);
		registerRender(WP_NAMAKO_white);
		registerRender(WP_NAMAKO_yellow);

		registerRender(WP_NAMAKOB_black);
		registerRender(WP_NAMAKOB_blue);
		registerRender(WP_NAMAKOB_brown);
		registerRender(WP_NAMAKOB_cyan);
		registerRender(WP_NAMAKOB_gray);
		registerRender(WP_NAMAKOB_green);
		registerRender(WP_NAMAKOB_lightb);
		registerRender(WP_NAMAKOB_lightg);
		registerRender(WP_NAMAKOB_lime);
		registerRender(WP_NAMAKOB_magenta);
		registerRender(WP_NAMAKOB_orange);
		registerRender(WP_NAMAKOB_pink);
		registerRender(WP_NAMAKOB_purple);
		registerRender(WP_NAMAKOB_red);
		registerRender(WP_NAMAKOB_white);
		registerRender(WP_NAMAKOB_yellow);

	}

    public static void registerRender(Block block) {
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
    			new ModelResourceLocation(block.getRegistryName(),"inventory"));
    }
}
