package com.ayutaki.chinjufumod.init;

import java.util.LinkedList;
import java.util.List;

import com.ayutaki.chinjufumod.init.fusuma.*;
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

public class ASDecoModFusuma {

	public static Block SHOUJI_CL, SHOUJI_CL_aca, SHOUJI_CL_bir,
						SHOUJI_CL_doak,SHOUJI_CL_jun, SHOUJI_CL_spru;
	public static Block SHOUJI_OL, SHOUJI_OL_aca, SHOUJI_OL_bir,
						SHOUJI_OL_doak,SHOUJI_OL_jun, SHOUJI_OL_spru;
	public static Block SHOUJI_CR, SHOUJI_CR_aca, SHOUJI_CR_bir,
						SHOUJI_CR_doak,SHOUJI_CR_jun, SHOUJI_CR_spru;
	public static Block SHOUJI_OR, SHOUJI_OR_aca, SHOUJI_OR_bir,
						SHOUJI_OR_doak,SHOUJI_OR_jun, SHOUJI_OR_spru;

	public static Block SHOUJIA_CL, SHOUJIA_CL_aca, SHOUJIA_CL_bir,
						SHOUJIA_CL_doak,SHOUJIA_CL_jun, SHOUJIA_CL_spru;
	public static Block SHOUJIA_OL, SHOUJIA_OL_aca, SHOUJIA_OL_bir,
						SHOUJIA_OL_doak,SHOUJIA_OL_jun, SHOUJIA_OL_spru;
	public static Block SHOUJIA_CR, SHOUJIA_CR_aca, SHOUJIA_CR_bir,
						SHOUJIA_CR_doak,SHOUJIA_CR_jun, SHOUJIA_CR_spru;
	public static Block SHOUJIA_OR, SHOUJIA_OR_aca, SHOUJIA_OR_bir,
						SHOUJIA_OR_doak,SHOUJIA_OR_jun, SHOUJIA_OR_spru;

	public static Block SHOUJIH_CL, SHOUJIH_CL_aca, SHOUJIH_CL_bir,
						SHOUJIH_CL_doak,SHOUJIH_CL_jun, SHOUJIH_CL_spru;
	public static Block SHOUJIH_OL, SHOUJIH_OL_aca, SHOUJIH_OL_bir,
						SHOUJIH_OL_doak,SHOUJIH_OL_jun, SHOUJIH_OL_spru;
	public static Block SHOUJIH_CR, SHOUJIH_CR_aca, SHOUJIH_CR_bir,
						SHOUJIH_CR_doak,SHOUJIH_CR_jun, SHOUJIH_CR_spru;
	public static Block SHOUJIH_OR, SHOUJIH_OR_aca, SHOUJIH_OR_bir,
						SHOUJIH_OR_doak,SHOUJIH_OR_jun, SHOUJIH_OR_spru;

	public static Block GARASUDO_CL, GARASUDO_CL_aca, GARASUDO_CL_bir,
						GARASUDO_CL_doak,GARASUDO_CL_jun, GARASUDO_CL_spru;
	public static Block GARASUDO_OL, GARASUDO_OL_aca, GARASUDO_OL_bir,
						GARASUDO_OL_doak,GARASUDO_OL_jun, GARASUDO_OL_spru;
	public static Block GARASUDO_CR, GARASUDO_CR_aca, GARASUDO_CR_bir,
						GARASUDO_CR_doak,GARASUDO_CR_jun, GARASUDO_CR_spru;
	public static Block GARASUDO_OR, GARASUDO_OR_aca, GARASUDO_OR_bir,
						GARASUDO_OR_doak,GARASUDO_OR_jun, GARASUDO_OR_spru;

	public static Block GARASUDOB_CL, GARASUDOB_CL_aca, GARASUDOB_CL_bir,
						GARASUDOB_CL_doak,GARASUDOB_CL_jun, GARASUDOB_CL_spru;
	public static Block GARASUDOB_OL, GARASUDOB_OL_aca, GARASUDOB_OL_bir,
						GARASUDOB_OL_doak,GARASUDOB_OL_jun, GARASUDOB_OL_spru;
	public static Block GARASUDOB_CR, GARASUDOB_CR_aca, GARASUDOB_CR_bir,
						GARASUDOB_CR_doak,GARASUDOB_CR_jun, GARASUDOB_CR_spru;
	public static Block GARASUDOB_OR, GARASUDOB_OR_aca, GARASUDOB_OR_bir,
						GARASUDOB_OR_doak,GARASUDOB_OR_jun, GARASUDOB_OR_spru;

	public static Block FUSUMA_CL, FUSUMA_CL_black, FUSUMA_CL_blue, FUSUMA_CL_brown,
						FUSUMA_CL_cyan, FUSUMA_CL_gray, FUSUMA_CL_green, FUSUMA_CL_lightb,
						FUSUMA_CL_lightg, FUSUMA_CL_lime, FUSUMA_CL_magenta, FUSUMA_CL_orange,
						FUSUMA_CL_pink, FUSUMA_CL_purple, FUSUMA_CL_red, FUSUMA_CL_yellow;
	public static Block FUSUMA_OL, FUSUMA_OL_black, FUSUMA_OL_blue, FUSUMA_OL_brown,
						FUSUMA_OL_cyan, FUSUMA_OL_gray, FUSUMA_OL_green, FUSUMA_OL_lightb,
						FUSUMA_OL_lightg, FUSUMA_OL_lime, FUSUMA_OL_magenta, FUSUMA_OL_orange,
						FUSUMA_OL_pink, FUSUMA_OL_purple, FUSUMA_OL_red, FUSUMA_OL_yellow;

	public static Block FUSUMA_CR, FUSUMA_CR_black, FUSUMA_CR_blue, FUSUMA_CR_brown,
						FUSUMA_CR_cyan, FUSUMA_CR_gray, FUSUMA_CR_green, FUSUMA_CR_lightb,
						FUSUMA_CR_lightg, FUSUMA_CR_lime, FUSUMA_CR_magenta, FUSUMA_CR_orange,
						FUSUMA_CR_pink, FUSUMA_CR_purple, FUSUMA_CR_red, FUSUMA_CR_yellow;
	public static Block FUSUMA_OR, FUSUMA_OR_black, FUSUMA_OR_blue, FUSUMA_OR_brown,
						FUSUMA_OR_cyan, FUSUMA_OR_gray, FUSUMA_OR_green, FUSUMA_OR_lightb,
						FUSUMA_OR_lightg, FUSUMA_OR_lime, FUSUMA_OR_magenta, FUSUMA_OR_orange,
						FUSUMA_OR_pink, FUSUMA_OR_purple, FUSUMA_OR_red, FUSUMA_OR_yellow;

	public static Block FUSUMAB_CL, FUSUMAB_CL_black, FUSUMAB_CL_blue, FUSUMAB_CL_brown,
						FUSUMAB_CL_cyan, FUSUMAB_CL_gray, FUSUMAB_CL_green, FUSUMAB_CL_lightb,
						FUSUMAB_CL_lightg, FUSUMAB_CL_lime, FUSUMAB_CL_magenta, FUSUMAB_CL_orange,
						FUSUMAB_CL_pink, FUSUMAB_CL_purple, FUSUMAB_CL_red, FUSUMAB_CL_yellow;
	public static Block FUSUMAB_OL, FUSUMAB_OL_black, FUSUMAB_OL_blue, FUSUMAB_OL_brown,
						FUSUMAB_OL_cyan, FUSUMAB_OL_gray, FUSUMAB_OL_green, FUSUMAB_OL_lightb,
						FUSUMAB_OL_lightg, FUSUMAB_OL_lime, FUSUMAB_OL_magenta, FUSUMAB_OL_orange,
						FUSUMAB_OL_pink, FUSUMAB_OL_purple, FUSUMAB_OL_red, FUSUMAB_OL_yellow;

	public static Block FUSUMAB_CR, FUSUMAB_CR_black, FUSUMAB_CR_blue, FUSUMAB_CR_brown,
						FUSUMAB_CR_cyan, FUSUMAB_CR_gray, FUSUMAB_CR_green, FUSUMAB_CR_lightb,
						FUSUMAB_CR_lightg, FUSUMAB_CR_lime, FUSUMAB_CR_magenta, FUSUMAB_CR_orange,
						FUSUMAB_CR_pink, FUSUMAB_CR_purple, FUSUMAB_CR_red, FUSUMAB_CR_yellow;
	public static Block FUSUMAB_OR, FUSUMAB_OR_black, FUSUMAB_OR_blue, FUSUMAB_OR_brown,
						FUSUMAB_OR_cyan, FUSUMAB_OR_gray, FUSUMAB_OR_green, FUSUMAB_OR_lightb,
						FUSUMAB_OR_lightg, FUSUMAB_OR_lime, FUSUMAB_OR_magenta, FUSUMAB_OR_orange,
						FUSUMAB_OR_pink, FUSUMAB_OR_purple, FUSUMAB_OR_red, FUSUMAB_OR_yellow;

	public static void init() {

		SHOUJI_CL = new BlockShouji_CL(Material.WOOD, "block_shouji_cl").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		SHOUJI_OL = new BlockShouji_OL(Material.WOOD, "block_shouji_ol");
		SHOUJI_CR = new BlockShouji_CR(Material.WOOD, "block_shouji_cr");
		SHOUJI_OR = new BlockShouji_OR(Material.WOOD, "block_shouji_or");
		SHOUJI_CL_aca = new BlockShouji_CL_aca(Material.WOOD, "block_shouji_cl_aca").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		SHOUJI_OL_aca = new BlockShouji_OL_aca(Material.WOOD, "block_shouji_ol_aca");
		SHOUJI_CR_aca = new BlockShouji_CR_aca(Material.WOOD, "block_shouji_cr_aca");
		SHOUJI_OR_aca = new BlockShouji_OR_aca(Material.WOOD, "block_shouji_or_aca");
		SHOUJI_CL_bir = new BlockShouji_CL_bir(Material.WOOD, "block_shouji_cl_bir").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		SHOUJI_OL_bir = new BlockShouji_OL_bir(Material.WOOD, "block_shouji_ol_bir");
		SHOUJI_CR_bir = new BlockShouji_CR_bir(Material.WOOD, "block_shouji_cr_bir");
		SHOUJI_OR_bir = new BlockShouji_OR_bir(Material.WOOD, "block_shouji_or_bir");
		SHOUJI_CL_doak = new BlockShouji_CL_doak(Material.WOOD, "block_shouji_cl_doak").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		SHOUJI_OL_doak = new BlockShouji_OL_doak(Material.WOOD, "block_shouji_ol_doak");
		SHOUJI_CR_doak = new BlockShouji_CR_doak(Material.WOOD, "block_shouji_cr_doak");
		SHOUJI_OR_doak = new BlockShouji_OR_doak(Material.WOOD, "block_shouji_or_doak");
		SHOUJI_CL_jun = new BlockShouji_CL_jun(Material.WOOD, "block_shouji_cl_jun").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		SHOUJI_OL_jun = new BlockShouji_OL_jun(Material.WOOD, "block_shouji_ol_jun");
		SHOUJI_CR_jun = new BlockShouji_CR_jun(Material.WOOD, "block_shouji_cr_jun");
		SHOUJI_OR_jun = new BlockShouji_OR_jun(Material.WOOD, "block_shouji_or_jun");
		SHOUJI_CL_spru = new BlockShouji_CL_spru(Material.WOOD, "block_shouji_cl_spru").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		SHOUJI_OL_spru = new BlockShouji_OL_spru(Material.WOOD, "block_shouji_ol_spru");
		SHOUJI_CR_spru = new BlockShouji_CR_spru(Material.WOOD, "block_shouji_cr_spru");
		SHOUJI_OR_spru = new BlockShouji_OR_spru(Material.WOOD, "block_shouji_or_spru");

		SHOUJIA_CL = new BlockShoujiA_CL(Material.WOOD, "block_shoujia_cl").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		SHOUJIA_OL = new BlockShoujiA_OL(Material.WOOD, "block_shoujia_ol");
		SHOUJIA_CR = new BlockShoujiA_CR(Material.WOOD, "block_shoujia_cr");
		SHOUJIA_OR = new BlockShoujiA_OR(Material.WOOD, "block_shoujia_or");
		SHOUJIA_CL_aca = new BlockShoujiA_CL_aca(Material.WOOD, "block_shoujia_cl_aca").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		SHOUJIA_OL_aca = new BlockShoujiA_OL_aca(Material.WOOD, "block_shoujia_ol_aca");
		SHOUJIA_CR_aca = new BlockShoujiA_CR_aca(Material.WOOD, "block_shoujia_cr_aca");
		SHOUJIA_OR_aca = new BlockShoujiA_OR_aca(Material.WOOD, "block_shoujia_or_aca");
		SHOUJIA_CL_bir = new BlockShoujiA_CL_bir(Material.WOOD, "block_shoujia_cl_bir").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		SHOUJIA_OL_bir = new BlockShoujiA_OL_bir(Material.WOOD, "block_shoujia_ol_bir");
		SHOUJIA_CR_bir = new BlockShoujiA_CR_bir(Material.WOOD, "block_shoujia_cr_bir");
		SHOUJIA_OR_bir = new BlockShoujiA_OR_bir(Material.WOOD, "block_shoujia_or_bir");
		SHOUJIA_CL_doak = new BlockShoujiA_CL_doak(Material.WOOD, "block_shoujia_cl_doak").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		SHOUJIA_OL_doak = new BlockShoujiA_OL_doak(Material.WOOD, "block_shoujia_ol_doak");
		SHOUJIA_CR_doak = new BlockShoujiA_CR_doak(Material.WOOD, "block_shoujia_cr_doak");
		SHOUJIA_OR_doak = new BlockShoujiA_OR_doak(Material.WOOD, "block_shoujia_or_doak");
		SHOUJIA_CL_jun = new BlockShoujiA_CL_jun(Material.WOOD, "block_shoujia_cl_jun").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		SHOUJIA_OL_jun = new BlockShoujiA_OL_jun(Material.WOOD, "block_shoujia_ol_jun");
		SHOUJIA_CR_jun = new BlockShoujiA_CR_jun(Material.WOOD, "block_shoujia_cr_jun");
		SHOUJIA_OR_jun = new BlockShoujiA_OR_jun(Material.WOOD, "block_shoujia_or_jun");
		SHOUJIA_CL_spru = new BlockShoujiA_CL_spru(Material.WOOD, "block_shoujia_cl_spru").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		SHOUJIA_OL_spru = new BlockShoujiA_OL_spru(Material.WOOD, "block_shoujia_ol_spru");
		SHOUJIA_CR_spru = new BlockShoujiA_CR_spru(Material.WOOD, "block_shoujia_cr_spru");
		SHOUJIA_OR_spru = new BlockShoujiA_OR_spru(Material.WOOD, "block_shoujia_or_spru");

		SHOUJIH_CL = new BlockShoujiH_CL(Material.WOOD, "block_shoujih_cl").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		SHOUJIH_OL = new BlockShoujiH_OL(Material.WOOD, "block_shoujih_ol");
		SHOUJIH_OR = new BlockShoujiH_OR(Material.WOOD, "block_shoujih_or");
		SHOUJIH_CL_aca = new BlockShoujiH_CL_aca(Material.WOOD, "block_shoujih_cl_aca").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		SHOUJIH_OL_aca = new BlockShoujiH_OL_aca(Material.WOOD, "block_shoujih_ol_aca");
		SHOUJIH_OR_aca = new BlockShoujiH_OR_aca(Material.WOOD, "block_shoujih_or_aca");
		SHOUJIH_CL_bir = new BlockShoujiH_CL_bir(Material.WOOD, "block_shoujih_cl_bir").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		SHOUJIH_OL_bir = new BlockShoujiH_OL_bir(Material.WOOD, "block_shoujih_ol_bir");
		SHOUJIH_OR_bir = new BlockShoujiH_OR_bir(Material.WOOD, "block_shoujih_or_bir");
		SHOUJIH_CL_doak = new BlockShoujiH_CL_doak(Material.WOOD, "block_shoujih_cl_doak").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		SHOUJIH_OL_doak = new BlockShoujiH_OL_doak(Material.WOOD, "block_shoujih_ol_doak");
		SHOUJIH_OR_doak = new BlockShoujiH_OR_doak(Material.WOOD, "block_shoujih_or_doak");
		SHOUJIH_CL_jun = new BlockShoujiH_CL_jun(Material.WOOD, "block_shoujih_cl_jun").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		SHOUJIH_OL_jun = new BlockShoujiH_OL_jun(Material.WOOD, "block_shoujih_ol_jun");
		SHOUJIH_OR_jun = new BlockShoujiH_OR_jun(Material.WOOD, "block_shoujih_or_jun");
		SHOUJIH_CL_spru = new BlockShoujiH_CL_spru(Material.WOOD, "block_shoujih_cl_spru").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		SHOUJIH_OL_spru = new BlockShoujiH_OL_spru(Material.WOOD, "block_shoujih_ol_spru");
		SHOUJIH_OR_spru = new BlockShoujiH_OR_spru(Material.WOOD, "block_shoujih_or_spru");

		GARASUDO_CL = new BlockGarasudo_CL(Material.WOOD, "block_garasudo_cl").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		GARASUDO_OL = new BlockGarasudo_OL(Material.WOOD, "block_garasudo_ol");
		GARASUDO_CR = new BlockGarasudo_CR(Material.WOOD, "block_garasudo_cr");
		GARASUDO_OR = new BlockGarasudo_OR(Material.WOOD, "block_garasudo_or");
		GARASUDO_CL_aca = new BlockGarasudo_CL_aca(Material.WOOD, "block_garasudo_cl_aca").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		GARASUDO_OL_aca = new BlockGarasudo_OL_aca(Material.WOOD, "block_garasudo_ol_aca");
		GARASUDO_CR_aca = new BlockGarasudo_CR_aca(Material.WOOD, "block_garasudo_cr_aca");
		GARASUDO_OR_aca = new BlockGarasudo_OR_aca(Material.WOOD, "block_garasudo_or_aca");
		GARASUDO_CL_bir = new BlockGarasudo_CL_bir(Material.WOOD, "block_garasudo_cl_bir").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		GARASUDO_OL_bir = new BlockGarasudo_OL_bir(Material.WOOD, "block_garasudo_ol_bir");
		GARASUDO_CR_bir = new BlockGarasudo_CR_bir(Material.WOOD, "block_garasudo_cr_bir");
		GARASUDO_OR_bir = new BlockGarasudo_OR_bir(Material.WOOD, "block_garasudo_or_bir");
		GARASUDO_CL_doak = new BlockGarasudo_CL_doak(Material.WOOD, "block_garasudo_cl_doak").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		GARASUDO_OL_doak = new BlockGarasudo_OL_doak(Material.WOOD, "block_garasudo_ol_doak");
		GARASUDO_CR_doak = new BlockGarasudo_CR_doak(Material.WOOD, "block_garasudo_cr_doak");
		GARASUDO_OR_doak = new BlockGarasudo_OR_doak(Material.WOOD, "block_garasudo_or_doak");
		GARASUDO_CL_jun = new BlockGarasudo_CL_jun(Material.WOOD, "block_garasudo_cl_jun").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		GARASUDO_OL_jun = new BlockGarasudo_OL_jun(Material.WOOD, "block_garasudo_ol_jun");
		GARASUDO_CR_jun = new BlockGarasudo_CR_jun(Material.WOOD, "block_garasudo_cr_jun");
		GARASUDO_OR_jun = new BlockGarasudo_OR_jun(Material.WOOD, "block_garasudo_or_jun");
		GARASUDO_CL_spru = new BlockGarasudo_CL_spru(Material.WOOD, "block_garasudo_cl_spru").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		GARASUDO_OL_spru = new BlockGarasudo_OL_spru(Material.WOOD, "block_garasudo_ol_spru");
		GARASUDO_CR_spru = new BlockGarasudo_CR_spru(Material.WOOD, "block_garasudo_cr_spru");
		GARASUDO_OR_spru = new BlockGarasudo_OR_spru(Material.WOOD, "block_garasudo_or_spru");

		GARASUDOB_CL = new BlockGarasudoB_CL(Material.WOOD, "block_garasudob_cl").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		GARASUDOB_OL = new BlockGarasudoB_OL(Material.WOOD, "block_garasudob_ol");
		GARASUDOB_CR = new BlockGarasudoB_CR(Material.WOOD, "block_garasudob_cr");
		GARASUDOB_OR = new BlockGarasudoB_OR(Material.WOOD, "block_garasudob_or");
		GARASUDOB_CL_aca = new BlockGarasudoB_CL_aca(Material.WOOD, "block_garasudob_cl_aca").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		GARASUDOB_OL_aca = new BlockGarasudoB_OL_aca(Material.WOOD, "block_garasudob_ol_aca");
		GARASUDOB_CR_aca = new BlockGarasudoB_CR_aca(Material.WOOD, "block_garasudob_cr_aca");
		GARASUDOB_OR_aca = new BlockGarasudoB_OR_aca(Material.WOOD, "block_garasudob_or_aca");
		GARASUDOB_CL_bir = new BlockGarasudoB_CL_bir(Material.WOOD, "block_garasudob_cl_bir").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		GARASUDOB_OL_bir = new BlockGarasudoB_OL_bir(Material.WOOD, "block_garasudob_ol_bir");
		GARASUDOB_CR_bir = new BlockGarasudoB_CR_bir(Material.WOOD, "block_garasudob_cr_bir");
		GARASUDOB_OR_bir = new BlockGarasudoB_OR_bir(Material.WOOD, "block_garasudob_or_bir");
		GARASUDOB_CL_doak = new BlockGarasudoB_CL_doak(Material.WOOD, "block_garasudob_cl_doak").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		GARASUDOB_OL_doak = new BlockGarasudoB_OL_doak(Material.WOOD, "block_garasudob_ol_doak");
		GARASUDOB_CR_doak = new BlockGarasudoB_CR_doak(Material.WOOD, "block_garasudob_cr_doak");
		GARASUDOB_OR_doak = new BlockGarasudoB_OR_doak(Material.WOOD, "block_garasudob_or_doak");
		GARASUDOB_CL_jun = new BlockGarasudoB_CL_jun(Material.WOOD, "block_garasudob_cl_jun").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		GARASUDOB_OL_jun = new BlockGarasudoB_OL_jun(Material.WOOD, "block_garasudob_ol_jun");
		GARASUDOB_CR_jun = new BlockGarasudoB_CR_jun(Material.WOOD, "block_garasudob_cr_jun");
		GARASUDOB_OR_jun = new BlockGarasudoB_OR_jun(Material.WOOD, "block_garasudob_or_jun");
		GARASUDOB_CL_spru = new BlockGarasudoB_CL_spru(Material.WOOD, "block_garasudob_cl_spru").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		GARASUDOB_OL_spru = new BlockGarasudoB_OL_spru(Material.WOOD, "block_garasudob_ol_spru");
		GARASUDOB_CR_spru = new BlockGarasudoB_CR_spru(Material.WOOD, "block_garasudob_cr_spru");
		GARASUDOB_OR_spru = new BlockGarasudoB_OR_spru(Material.WOOD, "block_garasudob_or_spru");

		FUSUMA_CL = new BlockFusuma_CL(Material.WOOD, "block_fusuma_cl").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMA_OL = new BlockFusuma_OL(Material.WOOD, "block_fusuma_ol");
		FUSUMA_CR = new BlockFusuma_CR(Material.WOOD, "block_fusuma_cr");
		FUSUMA_OR = new BlockFusuma_OR(Material.WOOD, "block_fusuma_or");
		FUSUMA_CL_black = new BlockFusuma_CL_black(Material.WOOD, "block_fusuma_cl_black").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMA_OL_black = new BlockFusuma_OL_black(Material.WOOD, "block_fusuma_ol_black");
		FUSUMA_CR_black = new BlockFusuma_CR_black(Material.WOOD, "block_fusuma_cr_black");
		FUSUMA_OR_black = new BlockFusuma_OR_black(Material.WOOD, "block_fusuma_or_black");
		FUSUMA_CL_blue = new BlockFusuma_CL_blue(Material.WOOD, "block_fusuma_cl_blue").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMA_OL_blue = new BlockFusuma_OL_blue(Material.WOOD, "block_fusuma_ol_blue");
		FUSUMA_CR_blue = new BlockFusuma_CR_blue(Material.WOOD, "block_fusuma_cr_blue");
		FUSUMA_OR_blue = new BlockFusuma_OR_blue(Material.WOOD, "block_fusuma_or_blue");
		FUSUMA_CL_brown = new BlockFusuma_CL_brown(Material.WOOD, "block_fusuma_cl_brown").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMA_OL_brown = new BlockFusuma_OL_brown(Material.WOOD, "block_fusuma_ol_brown");
		FUSUMA_CR_brown = new BlockFusuma_CR_brown(Material.WOOD, "block_fusuma_cr_brown");
		FUSUMA_OR_brown = new BlockFusuma_OR_brown(Material.WOOD, "block_fusuma_or_brown");
		FUSUMA_CL_cyan = new BlockFusuma_CL_cyan(Material.WOOD, "block_fusuma_cl_cyan").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMA_OL_cyan = new BlockFusuma_OL_cyan(Material.WOOD, "block_fusuma_ol_cyan");
		FUSUMA_CR_cyan = new BlockFusuma_CR_cyan(Material.WOOD, "block_fusuma_cr_cyan");
		FUSUMA_OR_cyan = new BlockFusuma_OR_cyan(Material.WOOD, "block_fusuma_or_cyan");
		FUSUMA_CL_gray = new BlockFusuma_CL_gray(Material.WOOD, "block_fusuma_cl_gray").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMA_OL_gray = new BlockFusuma_OL_gray(Material.WOOD, "block_fusuma_ol_gray");
		FUSUMA_CR_gray = new BlockFusuma_CR_gray(Material.WOOD, "block_fusuma_cr_gray");
		FUSUMA_OR_gray = new BlockFusuma_OR_gray(Material.WOOD, "block_fusuma_or_gray");
		FUSUMA_CL_green = new BlockFusuma_CL_green(Material.WOOD, "block_fusuma_cl_green").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMA_OL_green = new BlockFusuma_OL_green(Material.WOOD, "block_fusuma_ol_green");
		FUSUMA_CR_green = new BlockFusuma_CR_green(Material.WOOD, "block_fusuma_cr_green");
		FUSUMA_OR_green = new BlockFusuma_OR_green(Material.WOOD, "block_fusuma_or_green");
		FUSUMA_CL_lightb = new BlockFusuma_CL_lightb(Material.WOOD, "block_fusuma_cl_lightb").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMA_OL_lightb = new BlockFusuma_OL_lightb(Material.WOOD, "block_fusuma_ol_lightb");
		FUSUMA_CR_lightb = new BlockFusuma_CR_lightb(Material.WOOD, "block_fusuma_cr_lightb");
		FUSUMA_OR_lightb = new BlockFusuma_OR_lightb(Material.WOOD, "block_fusuma_or_lightb");
		FUSUMA_CL_lightg = new BlockFusuma_CL_lightg(Material.WOOD, "block_fusuma_cl_lightg").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMA_OL_lightg = new BlockFusuma_OL_lightg(Material.WOOD, "block_fusuma_ol_lightg");
		FUSUMA_CR_lightg = new BlockFusuma_CR_lightg(Material.WOOD, "block_fusuma_cr_lightg");
		FUSUMA_OR_lightg = new BlockFusuma_OR_lightg(Material.WOOD, "block_fusuma_or_lightg");
		FUSUMA_CL_lime = new BlockFusuma_CL_lime(Material.WOOD, "block_fusuma_cl_lime").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMA_OL_lime = new BlockFusuma_OL_lime(Material.WOOD, "block_fusuma_ol_lime");
		FUSUMA_CR_lime = new BlockFusuma_CR_lime(Material.WOOD, "block_fusuma_cr_lime");
		FUSUMA_OR_lime = new BlockFusuma_OR_lime(Material.WOOD, "block_fusuma_or_lime");
		FUSUMA_CL_magenta = new BlockFusuma_CL_magenta(Material.WOOD, "block_fusuma_cl_magenta").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMA_OL_magenta = new BlockFusuma_OL_magenta(Material.WOOD, "block_fusuma_ol_magenta");
		FUSUMA_CR_magenta = new BlockFusuma_CR_magenta(Material.WOOD, "block_fusuma_cr_magenta");
		FUSUMA_OR_magenta = new BlockFusuma_OR_magenta(Material.WOOD, "block_fusuma_or_magenta");
		FUSUMA_CL_orange = new BlockFusuma_CL_orange(Material.WOOD, "block_fusuma_cl_orange").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMA_OL_orange = new BlockFusuma_OL_orange(Material.WOOD, "block_fusuma_ol_orange");
		FUSUMA_CR_orange = new BlockFusuma_CR_orange(Material.WOOD, "block_fusuma_cr_orange");
		FUSUMA_OR_orange = new BlockFusuma_OR_orange(Material.WOOD, "block_fusuma_or_orange");
		FUSUMA_CL_pink = new BlockFusuma_CL_pink(Material.WOOD, "block_fusuma_cl_pink").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMA_OL_pink = new BlockFusuma_OL_pink(Material.WOOD, "block_fusuma_ol_pink");
		FUSUMA_CR_pink = new BlockFusuma_CR_pink(Material.WOOD, "block_fusuma_cr_pink");
		FUSUMA_OR_pink = new BlockFusuma_OR_pink(Material.WOOD, "block_fusuma_or_pink");
		FUSUMA_CL_purple = new BlockFusuma_CL_purple(Material.WOOD, "block_fusuma_cl_purple").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMA_OL_purple = new BlockFusuma_OL_purple(Material.WOOD, "block_fusuma_ol_purple");
		FUSUMA_CR_purple = new BlockFusuma_CR_purple(Material.WOOD, "block_fusuma_cr_purple");
		FUSUMA_OR_purple = new BlockFusuma_OR_purple(Material.WOOD, "block_fusuma_or_purple");
		FUSUMA_CL_red = new BlockFusuma_CL_red(Material.WOOD, "block_fusuma_cl_red").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMA_OL_red = new BlockFusuma_OL_red(Material.WOOD, "block_fusuma_ol_red");
		FUSUMA_CR_red = new BlockFusuma_CR_red(Material.WOOD, "block_fusuma_cr_red");
		FUSUMA_OR_red = new BlockFusuma_OR_red(Material.WOOD, "block_fusuma_or_red");
		FUSUMA_CL_yellow = new BlockFusuma_CL_yellow(Material.WOOD, "block_fusuma_cl_yellow").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMA_OL_yellow = new BlockFusuma_OL_yellow(Material.WOOD, "block_fusuma_ol_yellow");
		FUSUMA_CR_yellow = new BlockFusuma_CR_yellow(Material.WOOD, "block_fusuma_cr_yellow");
		FUSUMA_OR_yellow = new BlockFusuma_OR_yellow(Material.WOOD, "block_fusuma_or_yellow");

		FUSUMAB_CL = new BlockFusumaB_CL(Material.WOOD, "block_fusumab_cl").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMAB_OL = new BlockFusumaB_OL(Material.WOOD, "block_fusumab_ol");
		FUSUMAB_CR = new BlockFusumaB_CR(Material.WOOD, "block_fusumab_cr");
		FUSUMAB_OR = new BlockFusumaB_OR(Material.WOOD, "block_fusumab_or");
		FUSUMAB_CL_black = new BlockFusumaB_CL_black(Material.WOOD, "block_fusumab_cl_black").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMAB_OL_black = new BlockFusumaB_OL_black(Material.WOOD, "block_fusumab_ol_black");
		FUSUMAB_CR_black = new BlockFusumaB_CR_black(Material.WOOD, "block_fusumab_cr_black");
		FUSUMAB_OR_black = new BlockFusumaB_OR_black(Material.WOOD, "block_fusumab_or_black");
		FUSUMAB_CL_blue = new BlockFusumaB_CL_blue(Material.WOOD, "block_fusumab_cl_blue").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMAB_OL_blue = new BlockFusumaB_OL_blue(Material.WOOD, "block_fusumab_ol_blue");
		FUSUMAB_CR_blue = new BlockFusumaB_CR_blue(Material.WOOD, "block_fusumab_cr_blue");
		FUSUMAB_OR_blue = new BlockFusumaB_OR_blue(Material.WOOD, "block_fusumab_or_blue");
		FUSUMAB_CL_brown = new BlockFusumaB_CL_brown(Material.WOOD, "block_fusumab_cl_brown").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMAB_OL_brown = new BlockFusumaB_OL_brown(Material.WOOD, "block_fusumab_ol_brown");
		FUSUMAB_CR_brown = new BlockFusumaB_CR_brown(Material.WOOD, "block_fusumab_cr_brown");
		FUSUMAB_OR_brown = new BlockFusumaB_OR_brown(Material.WOOD, "block_fusumab_or_brown");
		FUSUMAB_CL_cyan = new BlockFusumaB_CL_cyan(Material.WOOD, "block_fusumab_cl_cyan").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMAB_OL_cyan = new BlockFusumaB_OL_cyan(Material.WOOD, "block_fusumab_ol_cyan");
		FUSUMAB_CR_cyan = new BlockFusumaB_CR_cyan(Material.WOOD, "block_fusumab_cr_cyan");
		FUSUMAB_OR_cyan = new BlockFusumaB_OR_cyan(Material.WOOD, "block_fusumab_or_cyan");
		FUSUMAB_CL_gray = new BlockFusumaB_CL_gray(Material.WOOD, "block_fusumab_cl_gray").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMAB_OL_gray = new BlockFusumaB_OL_gray(Material.WOOD, "block_fusumab_ol_gray");
		FUSUMAB_CR_gray = new BlockFusumaB_CR_gray(Material.WOOD, "block_fusumab_cr_gray");
		FUSUMAB_OR_gray = new BlockFusumaB_OR_gray(Material.WOOD, "block_fusumab_or_gray");
		FUSUMAB_CL_green = new BlockFusumaB_CL_green(Material.WOOD, "block_fusumab_cl_green").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMAB_OL_green = new BlockFusumaB_OL_green(Material.WOOD, "block_fusumab_ol_green");
		FUSUMAB_CR_green = new BlockFusumaB_CR_green(Material.WOOD, "block_fusumab_cr_green");
		FUSUMAB_OR_green = new BlockFusumaB_OR_green(Material.WOOD, "block_fusumab_or_green");
		FUSUMAB_CL_lightb = new BlockFusumaB_CL_lightb(Material.WOOD, "block_fusumab_cl_lightb").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMAB_OL_lightb = new BlockFusumaB_OL_lightb(Material.WOOD, "block_fusumab_ol_lightb");
		FUSUMAB_CR_lightb = new BlockFusumaB_CR_lightb(Material.WOOD, "block_fusumab_cr_lightb");
		FUSUMAB_OR_lightb = new BlockFusumaB_OR_lightb(Material.WOOD, "block_fusumab_or_lightb");
		FUSUMAB_CL_lightg = new BlockFusumaB_CL_lightg(Material.WOOD, "block_fusumab_cl_lightg").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMAB_OL_lightg = new BlockFusumaB_OL_lightg(Material.WOOD, "block_fusumab_ol_lightg");
		FUSUMAB_CR_lightg = new BlockFusumaB_CR_lightg(Material.WOOD, "block_fusumab_cr_lightg");
		FUSUMAB_OR_lightg = new BlockFusumaB_OR_lightg(Material.WOOD, "block_fusumab_or_lightg");
		FUSUMAB_CL_lime = new BlockFusumaB_CL_lime(Material.WOOD, "block_fusumab_cl_lime").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMAB_OL_lime = new BlockFusumaB_OL_lime(Material.WOOD, "block_fusumab_ol_lime");
		FUSUMAB_CR_lime = new BlockFusumaB_CR_lime(Material.WOOD, "block_fusumab_cr_lime");
		FUSUMAB_OR_lime = new BlockFusumaB_OR_lime(Material.WOOD, "block_fusumab_or_lime");
		FUSUMAB_CL_magenta = new BlockFusumaB_CL_magenta(Material.WOOD, "block_fusumab_cl_magenta").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMAB_OL_magenta = new BlockFusumaB_OL_magenta(Material.WOOD, "block_fusumab_ol_magenta");
		FUSUMAB_CR_magenta = new BlockFusumaB_CR_magenta(Material.WOOD, "block_fusumab_cr_magenta");
		FUSUMAB_OR_magenta = new BlockFusumaB_OR_magenta(Material.WOOD, "block_fusumab_or_magenta");
		FUSUMAB_CL_orange = new BlockFusumaB_CL_orange(Material.WOOD, "block_fusumab_cl_orange").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMAB_OL_orange = new BlockFusumaB_OL_orange(Material.WOOD, "block_fusumab_ol_orange");
		FUSUMAB_CR_orange = new BlockFusumaB_CR_orange(Material.WOOD, "block_fusumab_cr_orange");
		FUSUMAB_OR_orange = new BlockFusumaB_OR_orange(Material.WOOD, "block_fusumab_or_orange");
		FUSUMAB_CL_pink = new BlockFusumaB_CL_pink(Material.WOOD, "block_fusumab_cl_pink").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMAB_OL_pink = new BlockFusumaB_OL_pink(Material.WOOD, "block_fusumab_ol_pink");
		FUSUMAB_CR_pink = new BlockFusumaB_CR_pink(Material.WOOD, "block_fusumab_cr_pink");
		FUSUMAB_OR_pink = new BlockFusumaB_OR_pink(Material.WOOD, "block_fusumab_or_pink");
		FUSUMAB_CL_purple = new BlockFusumaB_CL_purple(Material.WOOD, "block_fusumab_cl_purple").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMAB_OL_purple = new BlockFusumaB_OL_purple(Material.WOOD, "block_fusumab_ol_purple");
		FUSUMAB_CR_purple = new BlockFusumaB_CR_purple(Material.WOOD, "block_fusumab_cr_purple");
		FUSUMAB_OR_purple = new BlockFusumaB_OR_purple(Material.WOOD, "block_fusumab_or_purple");
		FUSUMAB_CL_red = new BlockFusumaB_CL_red(Material.WOOD, "block_fusumab_cl_red").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMAB_OL_red = new BlockFusumaB_OL_red(Material.WOOD, "block_fusumab_ol_red");
		FUSUMAB_CR_red = new BlockFusumaB_CR_red(Material.WOOD, "block_fusumab_cr_red");
		FUSUMAB_OR_red = new BlockFusumaB_OR_red(Material.WOOD, "block_fusumab_or_red");
		FUSUMAB_CL_yellow = new BlockFusumaB_CL_yellow(Material.WOOD, "block_fusumab_cl_yellow").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		FUSUMAB_OL_yellow = new BlockFusumaB_OL_yellow(Material.WOOD, "block_fusumab_ol_yellow");
		FUSUMAB_CR_yellow = new BlockFusumaB_CR_yellow(Material.WOOD, "block_fusumab_cr_yellow");
		FUSUMAB_OR_yellow = new BlockFusumaB_OR_yellow(Material.WOOD, "block_fusumab_or_yellow");

	}


	public static void register() {

		registerBlock(SHOUJI_CL);
		registerBlock(SHOUJI_OL);
		registerBlock(SHOUJI_CR);
		registerBlock(SHOUJI_OR);
		registerBlock(SHOUJI_CL_aca);
		registerBlock(SHOUJI_OL_aca);
		registerBlock(SHOUJI_CR_aca);
		registerBlock(SHOUJI_OR_aca);
		registerBlock(SHOUJI_CL_bir);
		registerBlock(SHOUJI_OL_bir);
		registerBlock(SHOUJI_CR_bir);
		registerBlock(SHOUJI_OR_bir);
		registerBlock(SHOUJI_CL_doak);
		registerBlock(SHOUJI_OL_doak);
		registerBlock(SHOUJI_CR_doak);
		registerBlock(SHOUJI_OR_doak);
		registerBlock(SHOUJI_CL_jun);
		registerBlock(SHOUJI_OL_jun);
		registerBlock(SHOUJI_CR_jun);
		registerBlock(SHOUJI_OR_jun);
		registerBlock(SHOUJI_CL_spru);
		registerBlock(SHOUJI_OL_spru);
		registerBlock(SHOUJI_CR_spru);
		registerBlock(SHOUJI_OR_spru);

		registerBlock(SHOUJIA_CL);
		registerBlock(SHOUJIA_OL);
		registerBlock(SHOUJIA_CR);
		registerBlock(SHOUJIA_OR);
		registerBlock(SHOUJIA_CL_aca);
		registerBlock(SHOUJIA_OL_aca);
		registerBlock(SHOUJIA_CR_aca);
		registerBlock(SHOUJIA_OR_aca);
		registerBlock(SHOUJIA_CL_bir);
		registerBlock(SHOUJIA_OL_bir);
		registerBlock(SHOUJIA_CR_bir);
		registerBlock(SHOUJIA_OR_bir);
		registerBlock(SHOUJIA_CL_doak);
		registerBlock(SHOUJIA_OL_doak);
		registerBlock(SHOUJIA_CR_doak);
		registerBlock(SHOUJIA_OR_doak);
		registerBlock(SHOUJIA_CL_jun);
		registerBlock(SHOUJIA_OL_jun);
		registerBlock(SHOUJIA_CR_jun);
		registerBlock(SHOUJIA_OR_jun);
		registerBlock(SHOUJIA_CL_spru);
		registerBlock(SHOUJIA_OL_spru);
		registerBlock(SHOUJIA_CR_spru);
		registerBlock(SHOUJIA_OR_spru);

		registerBlock(SHOUJIH_CL);
		registerBlock(SHOUJIH_OL);
		registerBlock(SHOUJIH_OR);
		registerBlock(SHOUJIH_CL_aca);
		registerBlock(SHOUJIH_OL_aca);
		registerBlock(SHOUJIH_OR_aca);
		registerBlock(SHOUJIH_CL_bir);
		registerBlock(SHOUJIH_OL_bir);
		registerBlock(SHOUJIH_OR_bir);
		registerBlock(SHOUJIH_CL_doak);
		registerBlock(SHOUJIH_OL_doak);
		registerBlock(SHOUJIH_OR_doak);
		registerBlock(SHOUJIH_CL_jun);
		registerBlock(SHOUJIH_OL_jun);
		registerBlock(SHOUJIH_OR_jun);
		registerBlock(SHOUJIH_CL_spru);
		registerBlock(SHOUJIH_OL_spru);
		registerBlock(SHOUJIH_OR_spru);

		registerBlock(GARASUDO_CL);
		registerBlock(GARASUDO_OL);
		registerBlock(GARASUDO_CR);
		registerBlock(GARASUDO_OR);
		registerBlock(GARASUDO_CL_aca);
		registerBlock(GARASUDO_OL_aca);
		registerBlock(GARASUDO_CR_aca);
		registerBlock(GARASUDO_OR_aca);
		registerBlock(GARASUDO_CL_bir);
		registerBlock(GARASUDO_OL_bir);
		registerBlock(GARASUDO_CR_bir);
		registerBlock(GARASUDO_OR_bir);
		registerBlock(GARASUDO_CL_doak);
		registerBlock(GARASUDO_OL_doak);
		registerBlock(GARASUDO_CR_doak);
		registerBlock(GARASUDO_OR_doak);
		registerBlock(GARASUDO_CL_jun);
		registerBlock(GARASUDO_OL_jun);
		registerBlock(GARASUDO_CR_jun);
		registerBlock(GARASUDO_OR_jun);
		registerBlock(GARASUDO_CL_spru);
		registerBlock(GARASUDO_OL_spru);
		registerBlock(GARASUDO_CR_spru);
		registerBlock(GARASUDO_OR_spru);

		registerBlock(GARASUDOB_CL);
		registerBlock(GARASUDOB_OL);
		registerBlock(GARASUDOB_CR);
		registerBlock(GARASUDOB_OR);
		registerBlock(GARASUDOB_CL_aca);
		registerBlock(GARASUDOB_OL_aca);
		registerBlock(GARASUDOB_CR_aca);
		registerBlock(GARASUDOB_OR_aca);
		registerBlock(GARASUDOB_CL_bir);
		registerBlock(GARASUDOB_OL_bir);
		registerBlock(GARASUDOB_CR_bir);
		registerBlock(GARASUDOB_OR_bir);
		registerBlock(GARASUDOB_CL_doak);
		registerBlock(GARASUDOB_OL_doak);
		registerBlock(GARASUDOB_CR_doak);
		registerBlock(GARASUDOB_OR_doak);
		registerBlock(GARASUDOB_CL_jun);
		registerBlock(GARASUDOB_OL_jun);
		registerBlock(GARASUDOB_CR_jun);
		registerBlock(GARASUDOB_OR_jun);
		registerBlock(GARASUDOB_CL_spru);
		registerBlock(GARASUDOB_OL_spru);
		registerBlock(GARASUDOB_CR_spru);
		registerBlock(GARASUDOB_OR_spru);

		registerBlock(FUSUMA_CL);
		registerBlock(FUSUMA_OL);
		registerBlock(FUSUMA_CR);
		registerBlock(FUSUMA_OR);
		registerBlock(FUSUMA_CL_black);
		registerBlock(FUSUMA_OL_black);
		registerBlock(FUSUMA_CR_black);
		registerBlock(FUSUMA_OR_black);
		registerBlock(FUSUMA_CL_blue);
		registerBlock(FUSUMA_OL_blue);
		registerBlock(FUSUMA_CR_blue);
		registerBlock(FUSUMA_OR_blue);
		registerBlock(FUSUMA_CL_brown);
		registerBlock(FUSUMA_OL_brown);
		registerBlock(FUSUMA_CR_brown);
		registerBlock(FUSUMA_OR_brown);
		registerBlock(FUSUMA_CL_cyan);
		registerBlock(FUSUMA_OL_cyan);
		registerBlock(FUSUMA_CR_cyan);
		registerBlock(FUSUMA_OR_cyan);
		registerBlock(FUSUMA_CL_gray);
		registerBlock(FUSUMA_OL_gray);
		registerBlock(FUSUMA_CR_gray);
		registerBlock(FUSUMA_OR_gray);
		registerBlock(FUSUMA_CL_green);
		registerBlock(FUSUMA_OL_green);
		registerBlock(FUSUMA_CR_green);
		registerBlock(FUSUMA_OR_green);
		registerBlock(FUSUMA_CL_lightb);
		registerBlock(FUSUMA_OL_lightb);
		registerBlock(FUSUMA_CR_lightb);
		registerBlock(FUSUMA_OR_lightb);
		registerBlock(FUSUMA_CL_lightg);
		registerBlock(FUSUMA_OL_lightg);
		registerBlock(FUSUMA_CR_lightg);
		registerBlock(FUSUMA_OR_lightg);
		registerBlock(FUSUMA_CL_lime);
		registerBlock(FUSUMA_OL_lime);
		registerBlock(FUSUMA_CR_lime);
		registerBlock(FUSUMA_OR_lime);
		registerBlock(FUSUMA_CL_magenta);
		registerBlock(FUSUMA_OL_magenta);
		registerBlock(FUSUMA_CR_magenta);
		registerBlock(FUSUMA_OR_magenta);
		registerBlock(FUSUMA_CL_orange);
		registerBlock(FUSUMA_OL_orange);
		registerBlock(FUSUMA_CR_orange);
		registerBlock(FUSUMA_OR_orange);
		registerBlock(FUSUMA_CL_pink);
		registerBlock(FUSUMA_OL_pink);
		registerBlock(FUSUMA_CR_pink);
		registerBlock(FUSUMA_OR_pink);
		registerBlock(FUSUMA_CL_purple);
		registerBlock(FUSUMA_OL_purple);
		registerBlock(FUSUMA_CR_purple);
		registerBlock(FUSUMA_OR_purple);
		registerBlock(FUSUMA_CL_red);
		registerBlock(FUSUMA_OL_red);
		registerBlock(FUSUMA_CR_red);
		registerBlock(FUSUMA_OR_red);
		registerBlock(FUSUMA_CL_yellow);
		registerBlock(FUSUMA_OL_yellow);
		registerBlock(FUSUMA_CR_yellow);
		registerBlock(FUSUMA_OR_yellow);

		registerBlock(FUSUMAB_CL);
		registerBlock(FUSUMAB_OL);
		registerBlock(FUSUMAB_CR);
		registerBlock(FUSUMAB_OR);
		registerBlock(FUSUMAB_CL_black);
		registerBlock(FUSUMAB_OL_black);
		registerBlock(FUSUMAB_CR_black);
		registerBlock(FUSUMAB_OR_black);
		registerBlock(FUSUMAB_CL_blue);
		registerBlock(FUSUMAB_OL_blue);
		registerBlock(FUSUMAB_CR_blue);
		registerBlock(FUSUMAB_OR_blue);
		registerBlock(FUSUMAB_CL_brown);
		registerBlock(FUSUMAB_OL_brown);
		registerBlock(FUSUMAB_CR_brown);
		registerBlock(FUSUMAB_OR_brown);
		registerBlock(FUSUMAB_CL_cyan);
		registerBlock(FUSUMAB_OL_cyan);
		registerBlock(FUSUMAB_CR_cyan);
		registerBlock(FUSUMAB_OR_cyan);
		registerBlock(FUSUMAB_CL_gray);
		registerBlock(FUSUMAB_OL_gray);
		registerBlock(FUSUMAB_CR_gray);
		registerBlock(FUSUMAB_OR_gray);
		registerBlock(FUSUMAB_CL_green);
		registerBlock(FUSUMAB_OL_green);
		registerBlock(FUSUMAB_CR_green);
		registerBlock(FUSUMAB_OR_green);
		registerBlock(FUSUMAB_CL_lightb);
		registerBlock(FUSUMAB_OL_lightb);
		registerBlock(FUSUMAB_CR_lightb);
		registerBlock(FUSUMAB_OR_lightb);
		registerBlock(FUSUMAB_CL_lightg);
		registerBlock(FUSUMAB_OL_lightg);
		registerBlock(FUSUMAB_CR_lightg);
		registerBlock(FUSUMAB_OR_lightg);
		registerBlock(FUSUMAB_CL_lime);
		registerBlock(FUSUMAB_OL_lime);
		registerBlock(FUSUMAB_CR_lime);
		registerBlock(FUSUMAB_OR_lime);
		registerBlock(FUSUMAB_CL_magenta);
		registerBlock(FUSUMAB_OL_magenta);
		registerBlock(FUSUMAB_CR_magenta);
		registerBlock(FUSUMAB_OR_magenta);
		registerBlock(FUSUMAB_CL_orange);
		registerBlock(FUSUMAB_OL_orange);
		registerBlock(FUSUMAB_CR_orange);
		registerBlock(FUSUMAB_OR_orange);
		registerBlock(FUSUMAB_CL_pink);
		registerBlock(FUSUMAB_OL_pink);
		registerBlock(FUSUMAB_CR_pink);
		registerBlock(FUSUMAB_OR_pink);
		registerBlock(FUSUMAB_CL_purple);
		registerBlock(FUSUMAB_OL_purple);
		registerBlock(FUSUMAB_CR_purple);
		registerBlock(FUSUMAB_OR_purple);
		registerBlock(FUSUMAB_CL_red);
		registerBlock(FUSUMAB_OL_red);
		registerBlock(FUSUMAB_CR_red);
		registerBlock(FUSUMAB_OR_red);
		registerBlock(FUSUMAB_CL_yellow);
		registerBlock(FUSUMAB_OL_yellow);
		registerBlock(FUSUMAB_CR_yellow);
		registerBlock(FUSUMAB_OR_yellow);

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

		registerRender(SHOUJI_CL);
		registerRender(SHOUJI_CL_aca);
		registerRender(SHOUJI_CL_bir);
		registerRender(SHOUJI_CL_doak);
		registerRender(SHOUJI_CL_jun);
		registerRender(SHOUJI_CL_spru);


		registerRender(SHOUJIA_CL);
		registerRender(SHOUJIA_CL_aca);
		registerRender(SHOUJIA_CL_bir);
		registerRender(SHOUJIA_CL_doak);
		registerRender(SHOUJIA_CL_jun);
		registerRender(SHOUJIA_CL_spru);


		registerRender(SHOUJIH_CL);
		registerRender(SHOUJIH_CL_aca);
		registerRender(SHOUJIH_CL_bir);
		registerRender(SHOUJIH_CL_doak);
		registerRender(SHOUJIH_CL_jun);
		registerRender(SHOUJIH_CL_spru);


		registerRender(GARASUDO_CL);
		registerRender(GARASUDO_CL_aca);
		registerRender(GARASUDO_CL_bir);
		registerRender(GARASUDO_CL_doak);
		registerRender(GARASUDO_CL_jun);
		registerRender(GARASUDO_CL_spru);


		registerRender(GARASUDOB_CL);
		registerRender(GARASUDOB_CL_aca);
		registerRender(GARASUDOB_CL_bir);
		registerRender(GARASUDOB_CL_doak);
		registerRender(GARASUDOB_CL_jun);
		registerRender(GARASUDOB_CL_spru);


		registerRender(FUSUMA_CL);
		registerRender(FUSUMA_CL_black);
		registerRender(FUSUMA_CL_blue);
		registerRender(FUSUMA_CL_brown);
		registerRender(FUSUMA_CL_cyan);
		registerRender(FUSUMA_CL_gray);
		registerRender(FUSUMA_CL_green);
		registerRender(FUSUMA_CL_lightb);
		registerRender(FUSUMA_CL_lightg);
		registerRender(FUSUMA_CL_lime);
		registerRender(FUSUMA_CL_magenta);
		registerRender(FUSUMA_CL_orange);
		registerRender(FUSUMA_CL_pink);
		registerRender(FUSUMA_CL_purple);
		registerRender(FUSUMA_CL_red);
		registerRender(FUSUMA_CL_yellow);


		registerRender(FUSUMAB_CL);
		registerRender(FUSUMAB_CL_black);
		registerRender(FUSUMAB_CL_blue);
		registerRender(FUSUMAB_CL_brown);
		registerRender(FUSUMAB_CL_cyan);
		registerRender(FUSUMAB_CL_gray);
		registerRender(FUSUMAB_CL_green);
		registerRender(FUSUMAB_CL_lightb);
		registerRender(FUSUMAB_CL_lightg);
		registerRender(FUSUMAB_CL_lime);
		registerRender(FUSUMAB_CL_magenta);
		registerRender(FUSUMAB_CL_orange);
		registerRender(FUSUMAB_CL_pink);
		registerRender(FUSUMAB_CL_purple);
		registerRender(FUSUMAB_CL_red);
		registerRender(FUSUMAB_CL_yellow);

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

			ASDecoModFusuma.init();
			ASDecoModFusuma.register();
			BLOCKS.stream().forEach(block -> event.getRegistry().register(block));
		}
	}
}
