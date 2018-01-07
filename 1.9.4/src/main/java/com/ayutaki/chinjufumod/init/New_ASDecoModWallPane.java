package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.wallpane.BlockBAC_new_SlabDouble;
import com.ayutaki.chinjufumod.init.wallpane.BlockBAC_new_SlabHalf;
import com.ayutaki.chinjufumod.init.wallpane.BlockBDC_new_SlabDouble;
import com.ayutaki.chinjufumod.init.wallpane.BlockBDC_new_SlabHalf;
import com.ayutaki.chinjufumod.init.wallpane.BlockBGC_new_SlabDouble;
import com.ayutaki.chinjufumod.init.wallpane.BlockBGC_new_SlabHalf;
import com.ayutaki.chinjufumod.init.wallpane.BlockBrickStairs_and_c;
import com.ayutaki.chinjufumod.init.wallpane.BlockBrickStairs_dio_c;
import com.ayutaki.chinjufumod.init.wallpane.BlockBrickStairs_gra_c;
import com.ayutaki.chinjufumod.init.wallpane.BlockBrick_stone_PIL_c;
import com.ayutaki.chinjufumod.init.wallpane.BlockPillar_plank_c;
import com.ayutaki.chinjufumod.init.wallpane.BlockStone_c;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_brick;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_clay;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_clay_color;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_endtone;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_endtone_b;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_glass;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_glass_stained;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_log;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_netherb;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_netherrack;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_obsidian;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_plank;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_prisma;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_purpur;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_purpur_pil;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_quartz;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_quartz_pil;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_redsand_stone;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_sand_stone;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_stone_C;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_stone_brick;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_stone_maru;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_stone_pillar;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_yakiishi;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class New_ASDecoModWallPane {

	public static Block PILLAR_aca,PILLAR_bir,PILLAR_doak,
						PILLAR_jun,PILLAR_oak,PILLAR_spru;

	public static Block BRICK_AND,BRICK_DIO,BRICK_GRA;

	public static Block BRICK_AND_CH,BRICK_DIO_CH,BRICK_GRA_CH;

	public static Block BRICK_AND_CR,BRICK_DIO_CR,BRICK_GRA_CR;

	public static Block BRICK_AND_MOS,BRICK_DIO_MOS,BRICK_GRA_MOS;

	public static Block BRICKSTAIRS_AND;
	public static Block BRICKSTAIRS_DIO;
	public static Block BRICKSTAIRS_GRA;

	public static BlockBAC_new_SlabHalf BAC_SlabHalf;
	public static BlockBAC_new_SlabDouble BAC_SlabDouble;
	public static BlockBDC_new_SlabHalf BDC_SlabHalf;
	public static BlockBDC_new_SlabDouble BDC_SlabDouble;
	public static BlockBGC_new_SlabHalf BGC_SlabHalf;
	public static BlockBGC_new_SlabDouble BGC_SlabDouble;

	public static Block BRICK_STONE_PIL,BRICK_AND_PIL,BRICK_DIO_PIL,BRICK_GRA_PIL;

	public static Block WP_LOG_aca,WP_LOG_bir,WP_LOG_doak,
						WP_LOG_jun,WP_LOG_oak,WP_LOG_spru;

	public static Block WP_PLANK_aca,WP_PLANK_bir,WP_PLANK_doak,
						WP_PLANK_jun,WP_PLANK_oak,WP_PLANK_spru;

	public static Block WP_STONE;
	public static Block WP_STONE_M;

	public static Block WP_STONE_and,WP_STONE_dio,WP_STONE_gra;

	public static Block WP_STONE_B,WP_STONE_andB,WP_STONE_dioB,WP_STONE_graB;

	public static Block WP_STONE_P,WP_STONE_andP,WP_STONE_dioP,WP_STONE_graP;

	public static Block WP_BRICK;

	public static Block WP_SANDSTONE;
	public static Block WP_REDSANDSTONE;

	public static Block WP_PRISMA;
	public static Block WP_OBSIDIAN;

	public static Block WP_CLAY;
	public static Block WP_CLAY_black,WP_CLAY_blue,WP_CLAY_brown,WP_CLAY_cyan,
						WP_CLAY_gray,WP_CLAY_green,WP_CLAY_lightb,WP_CLAY_lightg,
						WP_CLAY_lime,WP_CLAY_mage,WP_CLAY_ora,WP_CLAY_pink,
						WP_CLAY_pur,WP_CLAY_red,WP_CLAY_white,WP_CLAY_yellow;

	public static Block WP_GLASS;
	public static Block WP_GLASS_black,WP_GLASS_blue,WP_GLASS_brown,WP_GLASS_cyan,
						WP_GLASS_gray,WP_GLASS_green,WP_GLASS_lightb,WP_GLASS_lightg,
						WP_GLASS_lime,WP_GLASS_mage,WP_GLASS_ora,WP_GLASS_pink,
						WP_GLASS_pur,WP_GLASS_red,WP_GLASS_white,WP_GLASS_yellow;

	public static Block WP_NETHE_rack;
	public static Block WP_NETHE_b;
	public static Block WP_QUARTZ;
	public static Block WP_QUARTZ_PIL;

	public static Block WP_ENDSTONE;
	public static Block WP_ENDBRICKS;

	public static Block WP_PURPUR;
	public static Block WP_PURPUR_PIL;

	public static void init() {

		PILLAR_aca = new BlockPillar_plank_c().setRegistryName("block_pillar_aca_c").setUnlocalizedName("block_pillar_aca_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		PILLAR_bir = new BlockPillar_plank_c().setRegistryName("block_pillar_bir_c").setUnlocalizedName("block_pillar_bir_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		PILLAR_doak = new BlockPillar_plank_c().setRegistryName("block_pillar_doak_c").setUnlocalizedName("block_pillar_doak_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		PILLAR_jun = new BlockPillar_plank_c().setRegistryName("block_pillar_jun_c").setUnlocalizedName("block_pillar_jun_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		PILLAR_oak = new BlockPillar_plank_c().setRegistryName("block_pillar_oak_c").setUnlocalizedName("block_pillar_oak_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		PILLAR_spru = new BlockPillar_plank_c().setRegistryName("block_pillar_spru_c").setUnlocalizedName("block_pillar_spru_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		BRICK_AND = new BlockStone_c().setRegistryName("block_brick_and_c").setUnlocalizedName("block_bricks_and_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		BRICK_DIO = new BlockStone_c().setRegistryName("block_brick_dio_c").setUnlocalizedName("block_bricks_dio_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		BRICK_GRA = new BlockStone_c().setRegistryName("block_brick_gra_c").setUnlocalizedName("block_bricks_gra_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		BRICK_AND_CH = new BlockStone_c().setRegistryName("block_brick_and_ch_c").setUnlocalizedName("block_bricks_and_ch_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		BRICK_DIO_CH = new BlockStone_c().setRegistryName("block_brick_dio_ch_c").setUnlocalizedName("block_bricks_dio_ch_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		BRICK_GRA_CH = new BlockStone_c().setRegistryName("block_brick_gra_ch_c").setUnlocalizedName("block_bricks_gra_ch_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		BRICK_AND_CR = new BlockStone_c().setRegistryName("block_brick_and_cr_c").setUnlocalizedName("block_bricks_and_cr_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		BRICK_DIO_CR = new BlockStone_c().setRegistryName("block_brick_dio_cr_c").setUnlocalizedName("block_bricks_dio_cr_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		BRICK_GRA_CR = new BlockStone_c().setRegistryName("block_brick_gra_cr_c").setUnlocalizedName("block_bricks_gra_cr_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		BRICK_AND_MOS = new BlockStone_c().setRegistryName("block_brick_and_mos_c").setUnlocalizedName("block_bricks_and_mos_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		BRICK_DIO_MOS = new BlockStone_c().setRegistryName("block_brick_dio_mos_c").setUnlocalizedName("block_bricks_dio_mos_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		BRICK_GRA_MOS = new BlockStone_c().setRegistryName("block_brick_gra_mos_c").setUnlocalizedName("block_bricks_gra_mos_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		BRICKSTAIRS_AND = new BlockBrickStairs_and_c("block_brickstairs_and_c", BRICK_AND.getDefaultState()).setRegistryName("block_brickstairs_and_c").setUnlocalizedName("block_brickstairs_and_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		BRICKSTAIRS_DIO = new BlockBrickStairs_dio_c("block_brickstairs_dio_c", BRICK_DIO.getDefaultState()).setRegistryName("block_brickstairs_dio_c").setUnlocalizedName("block_brickstairs_dio_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		BRICKSTAIRS_GRA = new BlockBrickStairs_gra_c("block_brickstairs_gra_c", BRICK_GRA.getDefaultState()).setRegistryName("block_brickstairs_gra_c").setUnlocalizedName("block_brickstairs_gra_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		BAC_SlabHalf = new BlockBAC_new_SlabHalf("block_bac_slabhalf");
		BAC_SlabDouble = new BlockBAC_new_SlabDouble("block_bac_slabdouble");
		BDC_SlabHalf = new BlockBDC_new_SlabHalf("block_bdc_slabhalf");
		BDC_SlabDouble = new BlockBDC_new_SlabDouble("block_bdc_slabdouble");
		BGC_SlabHalf = new BlockBGC_new_SlabHalf("block_bgc_slabhalf");
		BGC_SlabDouble = new BlockBGC_new_SlabDouble("block_bgc_slabdouble");

		BRICK_STONE_PIL = new BlockBrick_stone_PIL_c().setRegistryName("block_brick_stone_pil_c").setUnlocalizedName("block_brick_stone_pil_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		BRICK_AND_PIL = new BlockBrick_stone_PIL_c().setRegistryName("block_brick_and_pil_c").setUnlocalizedName("block_brick_and_pil_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		BRICK_DIO_PIL = new BlockBrick_stone_PIL_c().setRegistryName("block_brick_dio_pil_c").setUnlocalizedName("block_brick_dio_pil_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		BRICK_GRA_PIL = new BlockBrick_stone_PIL_c().setRegistryName("block_brick_gra_pil_c").setUnlocalizedName("block_brick_gra_pil_c").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		WP_LOG_aca = new BlockWP_log(Material.WOOD).setRegistryName("block_wp_log_aca").setUnlocalizedName("block_wp_log_aca").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_LOG_bir = new BlockWP_log(Material.WOOD).setRegistryName("block_wp_log_bir").setUnlocalizedName("block_wp_log_bir").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_LOG_doak = new BlockWP_log(Material.WOOD).setRegistryName("block_wp_log_doak").setUnlocalizedName("block_wp_log_doak").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_LOG_jun = new BlockWP_log(Material.WOOD).setRegistryName("block_wp_log_jun").setUnlocalizedName("block_wp_log_jun").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_LOG_oak = new BlockWP_log(Material.WOOD).setRegistryName("block_wp_log_oak").setUnlocalizedName("block_wp_log_oak").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_LOG_spru = new BlockWP_log(Material.WOOD).setRegistryName("block_wp_log_spru").setUnlocalizedName("block_wp_log_spru").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		WP_PLANK_aca = new BlockWP_plank(Material.WOOD).setRegistryName("block_wp_plank_aca").setUnlocalizedName("block_wp_plank_aca").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PLANK_bir = new BlockWP_plank(Material.WOOD).setRegistryName("block_wp_plank_bir").setUnlocalizedName("block_wp_plank_bir").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PLANK_doak = new BlockWP_plank(Material.WOOD).setRegistryName("block_wp_plank_doak").setUnlocalizedName("block_wp_plank_doak").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PLANK_jun = new BlockWP_plank(Material.WOOD).setRegistryName("block_wp_plank_jun").setUnlocalizedName("block_wp_plank_jun").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PLANK_oak = new BlockWP_plank(Material.WOOD).setRegistryName("block_wp_plank_oak").setUnlocalizedName("block_wp_plank_oak").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PLANK_spru = new BlockWP_plank(Material.WOOD).setRegistryName("block_wp_plank_spru").setUnlocalizedName("block_wp_plank_spru").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		WP_STONE = new BlockWP_yakiishi(Material.WOOD).setRegistryName("block_wp_stone").setUnlocalizedName("block_wp_stone").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_STONE_M = new BlockWP_stone_maru(Material.WOOD).setRegistryName("block_wp_stone_m").setUnlocalizedName("block_wp_stone_m").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		WP_STONE_and = new BlockWP_stone_C(Material.WOOD).setRegistryName("block_wp_stone_and").setUnlocalizedName("block_wp_stone_and").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_STONE_dio = new BlockWP_stone_C(Material.WOOD).setRegistryName("block_wp_stone_dio").setUnlocalizedName("block_wp_stone_dio").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_STONE_gra = new BlockWP_stone_C(Material.WOOD).setRegistryName("block_wp_stone_gra").setUnlocalizedName("block_wp_stone_gra").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		WP_STONE_B = new BlockWP_stone_brick(Material.WOOD).setRegistryName("block_wp_stone_b").setUnlocalizedName("block_wp_stone_b").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_STONE_andB = new BlockWP_stone_brick(Material.WOOD).setRegistryName("block_wp_stone_andb").setUnlocalizedName("block_wp_stone_andb").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_STONE_dioB = new BlockWP_stone_brick(Material.WOOD).setRegistryName("block_wp_stone_diob").setUnlocalizedName("block_wp_stone_diob").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_STONE_graB = new BlockWP_stone_brick(Material.WOOD).setRegistryName("block_wp_stone_grab").setUnlocalizedName("block_wp_stone_grab").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		WP_STONE_P = new BlockWP_stone_pillar(Material.WOOD).setRegistryName("block_wp_stone_p").setUnlocalizedName("block_wp_stone_p").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_STONE_andP = new BlockWP_stone_pillar(Material.WOOD).setRegistryName("block_wp_stone_andp").setUnlocalizedName("block_wp_stone_andp").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_STONE_dioP = new BlockWP_stone_pillar(Material.WOOD).setRegistryName("block_wp_stone_diop").setUnlocalizedName("block_wp_stone_diop").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_STONE_graP = new BlockWP_stone_pillar(Material.WOOD).setRegistryName("block_wp_stone_grap").setUnlocalizedName("block_wp_stone_grap").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		WP_BRICK = new BlockWP_brick().setRegistryName("block_wp_brick").setUnlocalizedName("block_wp_brick").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		WP_SANDSTONE = new BlockWP_sand_stone(Material.WOOD).setRegistryName("block_wp_sand_stone").setUnlocalizedName("block_wp_sand_stone").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_REDSANDSTONE = new BlockWP_redsand_stone(Material.WOOD).setRegistryName("block_wp_redsand_stone").setUnlocalizedName("block_wp_redsand_stone").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		WP_PRISMA = new BlockWP_prisma(Material.WOOD).setRegistryName("block_wp_prisma").setUnlocalizedName("block_wp_prisma").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_OBSIDIAN = new BlockWP_obsidian().setRegistryName("block_wp_obsidian").setUnlocalizedName("block_wp_obsidian").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		WP_CLAY = new BlockWP_clay().setRegistryName("block_wp_clay").setUnlocalizedName("block_wp_clay").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_CLAY_black = new BlockWP_clay_color().setRegistryName("block_wp_clay_black").setUnlocalizedName("block_wp_clay_black").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_CLAY_blue = new BlockWP_clay_color().setRegistryName("block_wp_clay_blue").setUnlocalizedName("block_wp_clay_blue").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_CLAY_brown = new BlockWP_clay_color().setRegistryName("block_wp_clay_brown").setUnlocalizedName("block_wp_clay_brown").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_CLAY_cyan = new BlockWP_clay_color().setRegistryName("block_wp_clay_cyan").setUnlocalizedName("block_wp_clay_cyan").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_CLAY_gray = new BlockWP_clay_color().setRegistryName("block_wp_clay_gray").setUnlocalizedName("block_wp_clay_gray").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_CLAY_green = new BlockWP_clay_color().setRegistryName("block_wp_clay_green").setUnlocalizedName("block_wp_clay_green").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_CLAY_lightb = new BlockWP_clay_color().setRegistryName("block_wp_clay_lightb").setUnlocalizedName("block_wp_clay_lightb").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_CLAY_lightg = new BlockWP_clay_color().setRegistryName("block_wp_clay_lightg").setUnlocalizedName("block_wp_clay_lightg").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_CLAY_lime = new BlockWP_clay_color().setRegistryName("block_wp_clay_lime").setUnlocalizedName("block_wp_clay_lime").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_CLAY_mage = new BlockWP_clay_color().setRegistryName("block_wp_clay_magenta").setUnlocalizedName("block_wp_clay_magenta").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_CLAY_ora = new BlockWP_clay_color().setRegistryName("block_wp_clay_orange").setUnlocalizedName("block_wp_clay_orange").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_CLAY_pink = new BlockWP_clay_color().setRegistryName("block_wp_clay_pink").setUnlocalizedName("block_wp_clay_pink").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_CLAY_pur = new BlockWP_clay_color().setRegistryName("block_wp_clay_purple").setUnlocalizedName("block_wp_clay_purple").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_CLAY_red = new BlockWP_clay_color().setRegistryName("block_wp_clay_red").setUnlocalizedName("block_wp_clay_red").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_CLAY_white = new BlockWP_clay_color().setRegistryName("block_wp_clay_white").setUnlocalizedName("block_wp_clay_white").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_CLAY_yellow = new BlockWP_clay_color().setRegistryName("block_wp_clay_yellow").setUnlocalizedName("block_wp_clay_yellow").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		WP_GLASS = new BlockWP_glass().setRegistryName("block_wp_glass").setUnlocalizedName("block_wp_glass").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_GLASS_black = new BlockWP_glass_stained().setRegistryName("block_wp_glass_black").setUnlocalizedName("block_wp_glass_black").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_GLASS_blue = new BlockWP_glass_stained().setRegistryName("block_wp_glass_blue").setUnlocalizedName("block_wp_glass_blue").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_GLASS_brown = new BlockWP_glass_stained().setRegistryName("block_wp_glass_brown").setUnlocalizedName("block_wp_glass_brown").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_GLASS_cyan = new BlockWP_glass_stained().setRegistryName("block_wp_glass_cyan").setUnlocalizedName("block_wp_glass_cyan").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_GLASS_gray = new BlockWP_glass_stained().setRegistryName("block_wp_glass_gray").setUnlocalizedName("block_wp_glass_gray").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_GLASS_green = new BlockWP_glass_stained().setRegistryName("block_wp_glass_green").setUnlocalizedName("block_wp_glass_green").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_GLASS_lightb = new BlockWP_glass_stained().setRegistryName("block_wp_glass_lightb").setUnlocalizedName("block_wp_glass_lightb").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_GLASS_lightg = new BlockWP_glass_stained().setRegistryName("block_wp_glass_lightg").setUnlocalizedName("block_wp_glass_lightg").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_GLASS_lime = new BlockWP_glass_stained().setRegistryName("block_wp_glass_lime").setUnlocalizedName("block_wp_glass_lime").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_GLASS_mage = new BlockWP_glass_stained().setRegistryName("block_wp_glass_magenta").setUnlocalizedName("block_wp_glass_magenta").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_GLASS_ora = new BlockWP_glass_stained().setRegistryName("block_wp_glass_orange").setUnlocalizedName("block_wp_glass_orange").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_GLASS_pink = new BlockWP_glass_stained().setRegistryName("block_wp_glass_pink").setUnlocalizedName("block_wp_glass_pink").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_GLASS_pur = new BlockWP_glass_stained().setRegistryName("block_wp_glass_purple").setUnlocalizedName("block_wp_glass_purple").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_GLASS_red = new BlockWP_glass_stained().setRegistryName("block_wp_glass_red").setUnlocalizedName("block_wp_glass_red").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_GLASS_white = new BlockWP_glass_stained().setRegistryName("block_wp_glass_white").setUnlocalizedName("block_wp_glass_white").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_GLASS_yellow = new BlockWP_glass_stained().setRegistryName("block_wp_glass_yellow").setUnlocalizedName("block_wp_glass_yellow").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		WP_NETHE_rack = new BlockWP_netherrack().setRegistryName("block_wp_netherrack").setUnlocalizedName("block_wp_netherrack").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_NETHE_b = new BlockWP_netherb(Material.WOOD).setRegistryName("block_wp_netherb").setUnlocalizedName("block_wp_netherb").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_QUARTZ = new BlockWP_quartz(Material.WOOD).setRegistryName("block_wp_quartz").setUnlocalizedName("block_wp_quartz").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_QUARTZ_PIL = new BlockWP_quartz_pil(Material.WOOD).setRegistryName("block_wp_quartz_pil").setUnlocalizedName("block_wp_quartz_pil").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		WP_ENDSTONE = new BlockWP_endtone().setRegistryName("block_wp_endtone").setUnlocalizedName("block_wp_endston").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_ENDBRICKS = new BlockWP_endtone_b().setRegistryName("block_wp_endtone_b").setUnlocalizedName("block_wp_endston_b").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

		WP_PURPUR = new BlockWP_purpur().setRegistryName("block_wp_purpur").setUnlocalizedName("block_wp_purpur").setCreativeTab(ChinjufuModTabs.tab_wallpanel);
		WP_PURPUR_PIL = new BlockWP_purpur_pil(Material.WOOD).setRegistryName("block_wp_purpur_pil").setUnlocalizedName("block_wp_purpur_pil").setCreativeTab(ChinjufuModTabs.tab_wallpanel);

	}


	public static void register() {

		registerBlock(PILLAR_aca);
		registerBlock(PILLAR_bir);
		registerBlock(PILLAR_doak);
		registerBlock(PILLAR_jun);
		registerBlock(PILLAR_oak);
		registerBlock(PILLAR_spru);

		registerBlock(BRICK_AND);
		registerBlock(BRICK_DIO);
		registerBlock(BRICK_GRA);

		registerBlock(BRICK_AND_CH);
		registerBlock(BRICK_DIO_CH);
		registerBlock(BRICK_GRA_CH);

		registerBlock(BRICK_AND_CR);
		registerBlock(BRICK_DIO_CR);
		registerBlock(BRICK_GRA_CR);

		registerBlock(BRICK_AND_MOS);
		registerBlock(BRICK_DIO_MOS);
		registerBlock(BRICK_GRA_MOS);

		registerBlock(BRICKSTAIRS_AND);
		registerBlock(BRICKSTAIRS_DIO);
		registerBlock(BRICKSTAIRS_GRA);

		registerBlock(BAC_SlabHalf, new ItemSlab(BAC_SlabHalf, BAC_SlabHalf, BAC_SlabDouble));
		GameRegistry.register(BAC_SlabDouble);
		registerBlock(BDC_SlabHalf, new ItemSlab(BDC_SlabHalf, BDC_SlabHalf, BDC_SlabDouble));
		GameRegistry.register(BDC_SlabDouble);
		registerBlock(BGC_SlabHalf, new ItemSlab(BGC_SlabHalf, BGC_SlabHalf, BGC_SlabDouble));
		GameRegistry.register(BGC_SlabDouble);

		registerBlock(BRICK_STONE_PIL);
		registerBlock(BRICK_AND_PIL);
		registerBlock(BRICK_DIO_PIL);
		registerBlock(BRICK_GRA_PIL);

		registerBlock(WP_LOG_aca);
		registerBlock(WP_LOG_bir);
		registerBlock(WP_LOG_doak);
		registerBlock(WP_LOG_jun);
		registerBlock(WP_LOG_oak);
		registerBlock(WP_LOG_spru);

		registerBlock(WP_PLANK_aca);
		registerBlock(WP_PLANK_bir);
		registerBlock(WP_PLANK_doak);
		registerBlock(WP_PLANK_jun);
		registerBlock(WP_PLANK_oak);
		registerBlock(WP_PLANK_spru);

		registerBlock(WP_STONE);
		registerBlock(WP_STONE_M);
		registerBlock(WP_STONE_and);
		registerBlock(WP_STONE_dio);
		registerBlock(WP_STONE_gra);

		registerBlock(WP_STONE_B);
		registerBlock(WP_STONE_andB);
		registerBlock(WP_STONE_dioB);
		registerBlock(WP_STONE_graB);

		registerBlock(WP_STONE_P);
		registerBlock(WP_STONE_andP);
		registerBlock(WP_STONE_dioP);
		registerBlock(WP_STONE_graP);

		registerBlock(WP_BRICK);

		registerBlock(WP_SANDSTONE);
		registerBlock(WP_REDSANDSTONE);
		registerBlock(WP_PRISMA);
		registerBlock(WP_OBSIDIAN);

		registerBlock(WP_CLAY);
		registerBlock(WP_CLAY_black);
		registerBlock(WP_CLAY_blue);
		registerBlock(WP_CLAY_brown);
		registerBlock(WP_CLAY_cyan);
		registerBlock(WP_CLAY_gray);
		registerBlock(WP_CLAY_green);
		registerBlock(WP_CLAY_lightb);
		registerBlock(WP_CLAY_lightg);
		registerBlock(WP_CLAY_lime);
		registerBlock(WP_CLAY_mage);
		registerBlock(WP_CLAY_ora);
		registerBlock(WP_CLAY_pink);
		registerBlock(WP_CLAY_pur);
		registerBlock(WP_CLAY_red);
		registerBlock(WP_CLAY_white);
		registerBlock(WP_CLAY_yellow);

		registerBlock(WP_GLASS);
		registerBlock(WP_GLASS_black);
		registerBlock(WP_GLASS_blue);
		registerBlock(WP_GLASS_brown);
		registerBlock(WP_GLASS_cyan);
		registerBlock(WP_GLASS_gray);
		registerBlock(WP_GLASS_green);
		registerBlock(WP_GLASS_lightb);
		registerBlock(WP_GLASS_lightg);
		registerBlock(WP_GLASS_lime);
		registerBlock(WP_GLASS_mage);
		registerBlock(WP_GLASS_ora);
		registerBlock(WP_GLASS_pink);
		registerBlock(WP_GLASS_pur);
		registerBlock(WP_GLASS_red);
		registerBlock(WP_GLASS_white);
		registerBlock(WP_GLASS_yellow);

		registerBlock(WP_NETHE_rack);
		registerBlock(WP_NETHE_b);
		registerBlock(WP_QUARTZ);
		registerBlock(WP_QUARTZ_PIL);

		registerBlock(WP_ENDSTONE);
		registerBlock(WP_ENDBRICKS);

		registerBlock(WP_PURPUR);
		registerBlock(WP_PURPUR_PIL);

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

		registerRender(PILLAR_aca);
		registerRender(PILLAR_bir);
		registerRender(PILLAR_doak);
		registerRender(PILLAR_jun);
		registerRender(PILLAR_oak);
		registerRender(PILLAR_spru);

		registerRender(BRICK_AND);
		registerRender(BRICK_DIO);
		registerRender(BRICK_GRA);

		registerRender(BRICK_AND_CH);
		registerRender(BRICK_DIO_CH);
		registerRender(BRICK_GRA_CH);

		registerRender(BRICK_AND_CR);
		registerRender(BRICK_DIO_CR);
		registerRender(BRICK_GRA_CR);

		registerRender(BRICK_AND_MOS);
		registerRender(BRICK_DIO_MOS);
		registerRender(BRICK_GRA_MOS);

		registerRender(BRICKSTAIRS_AND);
		registerRender(BRICKSTAIRS_DIO);
		registerRender(BRICKSTAIRS_GRA);

		registerRender(BAC_SlabHalf);
		registerRender(BDC_SlabHalf);
		registerRender(BGC_SlabHalf);

		registerRender(BRICK_STONE_PIL);
		registerRender(BRICK_AND_PIL);
		registerRender(BRICK_DIO_PIL);
		registerRender(BRICK_GRA_PIL);

		registerRender(WP_LOG_aca);
		registerRender(WP_LOG_bir);
		registerRender(WP_LOG_doak);
		registerRender(WP_LOG_jun);
		registerRender(WP_LOG_oak);
		registerRender(WP_LOG_spru);

		registerRender(WP_PLANK_aca);
		registerRender(WP_PLANK_bir);
		registerRender(WP_PLANK_doak);
		registerRender(WP_PLANK_jun);
		registerRender(WP_PLANK_oak);
		registerRender(WP_PLANK_spru);

		registerRender(WP_STONE);
		registerRender(WP_STONE_M);
		registerRender(WP_STONE_and);
		registerRender(WP_STONE_dio);
		registerRender(WP_STONE_gra);

		registerRender(WP_STONE_B);
		registerRender(WP_STONE_andB);
		registerRender(WP_STONE_dioB);
		registerRender(WP_STONE_graB);

		registerRender(WP_STONE_P);
		registerRender(WP_STONE_andP);
		registerRender(WP_STONE_dioP);
		registerRender(WP_STONE_graP);

		registerRender(WP_BRICK);

		registerRender(WP_SANDSTONE);
		registerRender(WP_REDSANDSTONE);
		registerRender(WP_PRISMA);
		registerRender(WP_OBSIDIAN);

		registerRender(WP_CLAY);
		registerRender(WP_CLAY_black);
		registerRender(WP_CLAY_blue);
		registerRender(WP_CLAY_brown);
		registerRender(WP_CLAY_cyan);
		registerRender(WP_CLAY_gray);
		registerRender(WP_CLAY_green);
		registerRender(WP_CLAY_lightb);
		registerRender(WP_CLAY_lightg);
		registerRender(WP_CLAY_lime);
		registerRender(WP_CLAY_mage);
		registerRender(WP_CLAY_ora);
		registerRender(WP_CLAY_pink);
		registerRender(WP_CLAY_pur);
		registerRender(WP_CLAY_red);
		registerRender(WP_CLAY_white);
		registerRender(WP_CLAY_yellow);

		registerRender(WP_GLASS);
		registerRender(WP_GLASS_black);
		registerRender(WP_GLASS_blue);
		registerRender(WP_GLASS_brown);
		registerRender(WP_GLASS_cyan);
		registerRender(WP_GLASS_gray);
		registerRender(WP_GLASS_green);
		registerRender(WP_GLASS_lightb);
		registerRender(WP_GLASS_lightg);
		registerRender(WP_GLASS_lime);
		registerRender(WP_GLASS_mage);
		registerRender(WP_GLASS_ora);
		registerRender(WP_GLASS_pink);
		registerRender(WP_GLASS_pur);
		registerRender(WP_GLASS_red);
		registerRender(WP_GLASS_white);
		registerRender(WP_GLASS_yellow);

		registerRender(WP_NETHE_rack);
		registerRender(WP_NETHE_b);
		registerRender(WP_QUARTZ);
		registerRender(WP_QUARTZ_PIL);

		registerRender(WP_ENDSTONE);
		registerRender(WP_ENDBRICKS);

		registerRender(WP_PURPUR);
		registerRender(WP_PURPUR_PIL);

	}

    public static void registerRender(Block block) {
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
    			new ModelResourceLocation(block.getRegistryName(),"inventory"));
    }
}
