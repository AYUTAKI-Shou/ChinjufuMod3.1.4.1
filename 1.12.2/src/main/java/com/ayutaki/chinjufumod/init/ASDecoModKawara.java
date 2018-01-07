package com.ayutaki.chinjufumod.init;

import java.util.LinkedList;
import java.util.List;

import com.ayutaki.chinjufumod.init.blocks.BlockDummyKawara;
import com.ayutaki.chinjufumod.init.kawara.BlockKawaraStairs_c;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SD_black;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SD_blue;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SD_brown;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SD_cyan;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SD_gray;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SD_green;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SD_lightb;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SD_lightg;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SD_lime;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SD_magenta;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SD_orange;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SD_pink;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SD_purple;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SD_red;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SD_white;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SD_yellow;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SH_black;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SH_blue;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SH_brown;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SH_cyan;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SH_gray;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SH_green;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SH_lightb;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SH_lightg;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SH_lime;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SH_magenta;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SH_orange;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SH_pink;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SH_purple;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SH_red;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SH_white;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_SH_yellow;
import com.ayutaki.chinjufumod.init.kawara.BlockKawara_c;
import com.ayutaki.chinjufumod.init.shikkui.BlockDirtwall;
import com.ayutaki.chinjufumod.init.shikkui.BlockDirtwallStairs;
import com.ayutaki.chinjufumod.init.shikkui.BlockDirtwall_SD;
import com.ayutaki.chinjufumod.init.shikkui.BlockDirtwall_SH;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ASDecoModKawara {

	public static Block KAWARA_black, KAWARA_blue, KAWARA_brown, KAWARA_cyan,
						KAWARA_gray, KAWARA_green, KAWARA_lightb, KAWARA_lightg,
						KAWARA_lime, KAWARA_magenta, KAWARA_orange, KAWARA_pink,
						KAWARA_purple, KAWARA_red, KAWARA_yellow, KAWARA_white;

	public static Block KAWARA_ST_black, KAWARA_ST_blue, KAWARA_ST_brown, KAWARA_ST_cyan,
						KAWARA_ST_gray, KAWARA_ST_green, KAWARA_ST_lightb, KAWARA_ST_lightg,
						KAWARA_ST_lime, KAWARA_ST_magenta, KAWARA_ST_orange, KAWARA_ST_pink,
						KAWARA_ST_purple, KAWARA_ST_red, KAWARA_ST_yellow, KAWARA_ST_white;

	public static BlockKawara_SH_black KAWARA_SH_black;
	public static BlockKawara_SH_blue KAWARA_SH_blue;
	public static BlockKawara_SH_brown KAWARA_SH_brown;
	public static BlockKawara_SH_cyan KAWARA_SH_cyan;
	public static BlockKawara_SH_gray KAWARA_SH_gray;
	public static BlockKawara_SH_green KAWARA_SH_green;
	public static BlockKawara_SH_lightb KAWARA_SH_lightb;
	public static BlockKawara_SH_lightg KAWARA_SH_lightg;
	public static BlockKawara_SH_lime KAWARA_SH_lime;
	public static BlockKawara_SH_magenta KAWARA_SH_magenta;
	public static BlockKawara_SH_orange KAWARA_SH_orange;
	public static BlockKawara_SH_pink KAWARA_SH_pink;
	public static BlockKawara_SH_purple KAWARA_SH_purple;
	public static BlockKawara_SH_red KAWARA_SH_red;
	public static BlockKawara_SH_yellow KAWARA_SH_yellow;
	public static BlockKawara_SH_white KAWARA_SH_white;

	public static BlockKawara_SD_black KAWARA_SD_black;
	public static BlockKawara_SD_blue KAWARA_SD_blue;
	public static BlockKawara_SD_brown KAWARA_SD_brown;
	public static BlockKawara_SD_cyan KAWARA_SD_cyan;
	public static BlockKawara_SD_gray KAWARA_SD_gray;
	public static BlockKawara_SD_green KAWARA_SD_green;
	public static BlockKawara_SD_lightb KAWARA_SD_lightb;
	public static BlockKawara_SD_lightg KAWARA_SD_lightg;
	public static BlockKawara_SD_lime KAWARA_SD_lime;
	public static BlockKawara_SD_magenta KAWARA_SD_magenta;
	public static BlockKawara_SD_orange KAWARA_SD_orange;
	public static BlockKawara_SD_pink KAWARA_SD_pink;
	public static BlockKawara_SD_purple KAWARA_SD_purple;
	public static BlockKawara_SD_red KAWARA_SD_red;
	public static BlockKawara_SD_yellow KAWARA_SD_yellow;
	public static BlockKawara_SD_white KAWARA_SD_white;

	public static Block DIRTWALL;
	public static Block DIRTWALL_stairs;
	public static BlockDirtwall_SH DIRTWALL_SH;
	public static BlockDirtwall_SD DIRTWALL_SD;

	public static Block DUMMYKAWARA;

	public static void init() {

		DUMMYKAWARA = new BlockDummyKawara().setRegistryName("dummy_kawara").setUnlocalizedName("dummy_kawara");

		KAWARA_black = new BlockKawara_c(Material.WOOD, "block_kawara_black");
		KAWARA_blue = new BlockKawara_c(Material.WOOD, "block_kawara_blue");
		KAWARA_brown = new BlockKawara_c(Material.WOOD, "block_kawara_brown");
		KAWARA_cyan = new BlockKawara_c(Material.WOOD, "block_kawara_cyan");
		KAWARA_gray = new BlockKawara_c(Material.WOOD, "block_kawara_gray");
		KAWARA_green = new BlockKawara_c(Material.WOOD, "block_kawara_green");
		KAWARA_lightb = new BlockKawara_c(Material.WOOD, "block_kawara_lightb");
		KAWARA_lightg = new BlockKawara_c(Material.WOOD, "block_kawara_lightg");
		KAWARA_lime = new BlockKawara_c(Material.WOOD, "block_kawara_lime");
		KAWARA_magenta = new BlockKawara_c(Material.WOOD, "block_kawara_magenta");
		KAWARA_orange = new BlockKawara_c(Material.WOOD, "block_kawara_orange");
		KAWARA_pink = new BlockKawara_c(Material.WOOD, "block_kawara_pink");
		KAWARA_purple = new BlockKawara_c(Material.WOOD, "block_kawara_purple");
		KAWARA_red = new BlockKawara_c(Material.WOOD, "block_kawara_red");
		KAWARA_yellow = new BlockKawara_c(Material.WOOD, "block_kawara_yellow");
		KAWARA_white = new BlockKawara_c(Material.WOOD, "block_kawara_white");

		KAWARA_ST_black = new BlockKawaraStairs_c("block_kst_black", DUMMYKAWARA.getDefaultState());
		KAWARA_ST_blue = new BlockKawaraStairs_c("block_kst_blue", DUMMYKAWARA.getDefaultState());
		KAWARA_ST_brown = new BlockKawaraStairs_c("block_kst_brown", DUMMYKAWARA.getDefaultState());
		KAWARA_ST_cyan = new BlockKawaraStairs_c("block_kst_cyan", DUMMYKAWARA.getDefaultState());
		KAWARA_ST_gray = new BlockKawaraStairs_c("block_kst_gray", DUMMYKAWARA.getDefaultState());
		KAWARA_ST_green = new BlockKawaraStairs_c("block_kst_green", DUMMYKAWARA.getDefaultState());
		KAWARA_ST_lightb = new BlockKawaraStairs_c("block_kst_lightb", DUMMYKAWARA.getDefaultState());
		KAWARA_ST_lightg = new BlockKawaraStairs_c("block_kst_lightg", DUMMYKAWARA.getDefaultState());
		KAWARA_ST_lime = new BlockKawaraStairs_c("block_kst_lime", DUMMYKAWARA.getDefaultState());
		KAWARA_ST_magenta = new BlockKawaraStairs_c("block_kst_magenta", DUMMYKAWARA.getDefaultState());
		KAWARA_ST_orange = new BlockKawaraStairs_c("block_kst_orange", DUMMYKAWARA.getDefaultState());
		KAWARA_ST_pink = new BlockKawaraStairs_c("block_kst_pink", DUMMYKAWARA.getDefaultState());
		KAWARA_ST_purple = new BlockKawaraStairs_c("block_kst_purple", DUMMYKAWARA.getDefaultState());
		KAWARA_ST_red = new BlockKawaraStairs_c("block_kst_red", DUMMYKAWARA.getDefaultState());
		KAWARA_ST_yellow = new BlockKawaraStairs_c("block_kst_yellow", DUMMYKAWARA.getDefaultState());
		KAWARA_ST_white = new BlockKawaraStairs_c("block_kst_white", DUMMYKAWARA.getDefaultState());

		KAWARA_SH_black = new BlockKawara_SH_black("block_ksh_black");
		KAWARA_SH_blue = new BlockKawara_SH_blue("block_ksh_blue");
		KAWARA_SH_brown = new BlockKawara_SH_brown("block_ksh_brown");
		KAWARA_SH_cyan = new BlockKawara_SH_cyan("block_ksh_cyan");
		KAWARA_SH_gray = new BlockKawara_SH_gray("block_ksh_gray");
		KAWARA_SH_green = new BlockKawara_SH_green("block_ksh_green");
		KAWARA_SH_lightb = new BlockKawara_SH_lightb("block_ksh_lightb");
		KAWARA_SH_lightg = new BlockKawara_SH_lightg("block_ksh_lightg");
		KAWARA_SH_lime = new BlockKawara_SH_lime("block_ksh_lime");
		KAWARA_SH_magenta = new BlockKawara_SH_magenta("block_ksh_magenta");
		KAWARA_SH_orange = new BlockKawara_SH_orange("block_ksh_orange");
		KAWARA_SH_pink = new BlockKawara_SH_pink("block_ksh_pink");
		KAWARA_SH_purple = new BlockKawara_SH_purple("block_ksh_purple");
		KAWARA_SH_red = new BlockKawara_SH_red("block_ksh_red");
		KAWARA_SH_yellow = new BlockKawara_SH_yellow("block_ksh_yellow");
		KAWARA_SH_white = new BlockKawara_SH_white("block_ksh_white");

		KAWARA_SD_black = new BlockKawara_SD_black("block_ksd_black");
		KAWARA_SD_blue = new BlockKawara_SD_blue("block_ksd_blue");
		KAWARA_SD_brown = new BlockKawara_SD_brown("block_ksd_brown");
		KAWARA_SD_cyan = new BlockKawara_SD_cyan("block_ksd_cyan");
		KAWARA_SD_gray = new BlockKawara_SD_gray("block_ksd_gray");
		KAWARA_SD_green = new BlockKawara_SD_green("block_ksd_green");
		KAWARA_SD_lightb = new BlockKawara_SD_lightb("block_ksd_lightb");
		KAWARA_SD_lightg = new BlockKawara_SD_lightg("block_ksd_lightg");
		KAWARA_SD_lime = new BlockKawara_SD_lime("block_ksd_lime");
		KAWARA_SD_magenta = new BlockKawara_SD_magenta("block_ksd_magenta");
		KAWARA_SD_orange = new BlockKawara_SD_orange("block_ksd_orange");
		KAWARA_SD_pink = new BlockKawara_SD_pink("block_ksd_pink");
		KAWARA_SD_purple = new BlockKawara_SD_purple("block_ksd_purple");
		KAWARA_SD_red = new BlockKawara_SD_red("block_ksd_red");
		KAWARA_SD_yellow = new BlockKawara_SD_yellow("block_ksd_yellow");
		KAWARA_SD_white = new BlockKawara_SD_white("block_ksd_white");

		DIRTWALL = new BlockDirtwall(Material.WOOD, "block_dirtwall");
		DIRTWALL_stairs = new BlockDirtwallStairs("block_dirtwall_st", DUMMYKAWARA.getDefaultState());
		DIRTWALL_SH = new BlockDirtwall_SH("block_dirtwall_sh");
		DIRTWALL_SD = new BlockDirtwall_SD("block_dirtwall_sd");
	}


	public static void register() {

		registerBlock(KAWARA_black);
		registerBlock(KAWARA_blue);
		registerBlock(KAWARA_brown);
		registerBlock(KAWARA_cyan);
		registerBlock(KAWARA_gray);
		registerBlock(KAWARA_green);
		registerBlock(KAWARA_lightb);
		registerBlock(KAWARA_lightg);
		registerBlock(KAWARA_lime);
		registerBlock(KAWARA_magenta);
		registerBlock(KAWARA_orange);
		registerBlock(KAWARA_pink);
		registerBlock(KAWARA_purple);
		registerBlock(KAWARA_red);
		registerBlock(KAWARA_yellow);
		registerBlock(KAWARA_white);

		registerBlock(KAWARA_ST_black);
		registerBlock(KAWARA_ST_blue);
		registerBlock(KAWARA_ST_brown);
		registerBlock(KAWARA_ST_cyan);
		registerBlock(KAWARA_ST_gray);
		registerBlock(KAWARA_ST_green);
		registerBlock(KAWARA_ST_lightb);
		registerBlock(KAWARA_ST_lightg);
		registerBlock(KAWARA_ST_lime);
		registerBlock(KAWARA_ST_magenta);
		registerBlock(KAWARA_ST_orange);
		registerBlock(KAWARA_ST_pink);
		registerBlock(KAWARA_ST_purple);
		registerBlock(KAWARA_ST_red);
		registerBlock(KAWARA_ST_yellow);
		registerBlock(KAWARA_ST_white);

		registerBlock(KAWARA_SH_black, new ItemSlab(KAWARA_SH_black, KAWARA_SH_black, KAWARA_SD_black));
		registerBlock(KAWARA_SD_black);
		registerBlock(KAWARA_SH_blue, new ItemSlab(KAWARA_SH_blue, KAWARA_SH_blue, KAWARA_SD_blue));
		registerBlock(KAWARA_SD_blue);
		registerBlock(KAWARA_SH_brown, new ItemSlab(KAWARA_SH_brown, KAWARA_SH_brown, KAWARA_SD_brown));
		registerBlock(KAWARA_SD_brown);
		registerBlock(KAWARA_SH_cyan, new ItemSlab(KAWARA_SH_cyan, KAWARA_SH_cyan, KAWARA_SD_cyan));
		registerBlock(KAWARA_SD_cyan);
		registerBlock(KAWARA_SH_gray, new ItemSlab(KAWARA_SH_gray, KAWARA_SH_gray, KAWARA_SD_gray));
		registerBlock(KAWARA_SD_gray);
		registerBlock(KAWARA_SH_green, new ItemSlab(KAWARA_SH_green, KAWARA_SH_green, KAWARA_SD_green));
		registerBlock(KAWARA_SD_green);
		registerBlock(KAWARA_SH_lightb, new ItemSlab(KAWARA_SH_lightb, KAWARA_SH_lightb, KAWARA_SD_lightb));
		registerBlock(KAWARA_SD_lightb);
		registerBlock(KAWARA_SH_lightg, new ItemSlab(KAWARA_SH_lightg, KAWARA_SH_lightg, KAWARA_SD_lightg));
		registerBlock(KAWARA_SD_lightg);
		registerBlock(KAWARA_SH_lime, new ItemSlab(KAWARA_SH_lime, KAWARA_SH_lime, KAWARA_SD_lime));
		registerBlock(KAWARA_SD_lime);
		registerBlock(KAWARA_SH_magenta, new ItemSlab(KAWARA_SH_magenta, KAWARA_SH_magenta, KAWARA_SD_magenta));
		registerBlock(KAWARA_SD_magenta);
		registerBlock(KAWARA_SH_orange, new ItemSlab(KAWARA_SH_orange, KAWARA_SH_orange, KAWARA_SD_orange));
		registerBlock(KAWARA_SD_orange);
		registerBlock(KAWARA_SH_pink, new ItemSlab(KAWARA_SH_pink, KAWARA_SH_pink, KAWARA_SD_pink));
		registerBlock(KAWARA_SD_pink);
		registerBlock(KAWARA_SH_purple, new ItemSlab(KAWARA_SH_purple, KAWARA_SH_purple, KAWARA_SD_purple));
		registerBlock(KAWARA_SD_purple);
		registerBlock(KAWARA_SH_red, new ItemSlab(KAWARA_SH_red, KAWARA_SH_red, KAWARA_SD_red));
		registerBlock(KAWARA_SD_red);
		registerBlock(KAWARA_SH_yellow, new ItemSlab(KAWARA_SH_yellow, KAWARA_SH_yellow, KAWARA_SD_yellow));
		registerBlock(KAWARA_SD_yellow);
		registerBlock(KAWARA_SH_white, new ItemSlab(KAWARA_SH_white, KAWARA_SH_white, KAWARA_SD_white));
		registerBlock(KAWARA_SD_white);

		registerBlock(DIRTWALL);
		registerBlock(DIRTWALL_stairs);
		registerBlock(DIRTWALL_SH, new ItemSlab(DIRTWALL_SH, DIRTWALL_SH, DIRTWALL_SD));
		registerBlock(DIRTWALL_SD);

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

		registerRender(KAWARA_black);
		registerRender(KAWARA_blue);
		registerRender(KAWARA_brown);
		registerRender(KAWARA_cyan);
		registerRender(KAWARA_gray);
		registerRender(KAWARA_green);
		registerRender(KAWARA_lightb);
		registerRender(KAWARA_lightg);
		registerRender(KAWARA_lime);
		registerRender(KAWARA_magenta);
		registerRender(KAWARA_orange);
		registerRender(KAWARA_pink);
		registerRender(KAWARA_purple);
		registerRender(KAWARA_red);
		registerRender(KAWARA_yellow);
		registerRender(KAWARA_white);

		registerRender(KAWARA_ST_black);
		registerRender(KAWARA_ST_blue);
		registerRender(KAWARA_ST_brown);
		registerRender(KAWARA_ST_cyan);
		registerRender(KAWARA_ST_gray);
		registerRender(KAWARA_ST_green);
		registerRender(KAWARA_ST_lightb);
		registerRender(KAWARA_ST_lightg);
		registerRender(KAWARA_ST_lime);
		registerRender(KAWARA_ST_magenta);
		registerRender(KAWARA_ST_orange);
		registerRender(KAWARA_ST_pink);
		registerRender(KAWARA_ST_purple);
		registerRender(KAWARA_ST_red);
		registerRender(KAWARA_ST_yellow);
		registerRender(KAWARA_ST_white);

		registerRender(KAWARA_SH_black);
		registerRender(KAWARA_SH_blue);
		registerRender(KAWARA_SH_brown);
		registerRender(KAWARA_SH_cyan);
		registerRender(KAWARA_SH_gray);
		registerRender(KAWARA_SH_green);
		registerRender(KAWARA_SH_lightb);
		registerRender(KAWARA_SH_lightg);
		registerRender(KAWARA_SH_lime);
		registerRender(KAWARA_SH_magenta);
		registerRender(KAWARA_SH_orange);
		registerRender(KAWARA_SH_pink);
		registerRender(KAWARA_SH_purple);
		registerRender(KAWARA_SH_red);
		registerRender(KAWARA_SH_yellow);
		registerRender(KAWARA_SH_white);

		registerRender(DIRTWALL);
		registerRender(DIRTWALL_stairs);
		registerRender(DIRTWALL_SH);

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

			ASDecoModKawara.init();
			ASDecoModKawara.register();
			BLOCKS.stream().forEach(block -> event.getRegistry().register(block));
		}
	}
}
