package com.ayutaki.chinjufumod.init;

import java.util.LinkedList;
import java.util.List;

import com.ayutaki.chinjufumod.init.foodblock.*;
import com.ayutaki.chinjufumod.init.school.BlockKettle;
import com.ayutaki.chinjufumod.init.school.BlockKettle_boil;
import com.ayutaki.chinjufumod.init.school.BlockKettle_full;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ChinjufuModFoodBlocks {

	public static Block KETTLE, KETTLE_full, KETTLE_boil;

	public static Block NABE_kara;

	public static Block NABESHIO_nama, NABESHIO_boil, NABETOUFU_nama, NABETOUFU_boil;

	public static Block NABE_nama, NABE_boil, NABE_1, NABE_2, NABE_3, NABE_4;
	public static Block TONSUI_1, TONSUI_2, TONSUI_kara;

	public static Block NABEGOHAN_nama, NABEGOHAN_boil, NABEGOHAN_1, NABEGOHAN_2, NABEGOHAN_3, NABEGOHAN_4;
	public static Block GOHAN_1, GOHAN_2, GOHAN_kara;
	public static Block RICE_1, RICE_2, RICE_kara;

	public static Block NABEMISO_nama, NABEMISO_boil, NABEMISO_1, NABEMISO_2, NABEMISO_3, NABEMISO_4;
	public static Block MISOSOUP_1, MISOSOUP_2, MISOSOUP_kara;
	public static Block NABECORNS_nama, NABECORNS_boil, NABECORNS_1, NABECORNS_2, NABECORNS_3, NABECORNS_4;
	public static Block CORNSOUP_1, CORNSOUP_2, CORNSOUP_kara;

	public static Block FRYPAN;

	public static Block TAMAGOYAKI_nama, TAMAGOYAKI_bake, TAMAGOYAKI_1, TAMAGOYAKI_2, TAMAGOYAKI_kara;
	public static Block TAMAGOYAKITEI_1, TAMAGOYAKITEI_2, TAMAGOYAKITEI_3, TAMAGOYAKITEI_4, TAMAGOYAKITEI_kara;
	public static Block YAKIZAKANATEI_1, YAKIZAKANATEI_2, YAKIZAKANATEI_3, YAKIZAKANATEI_4, YAKIZAKANATEI_kara;
	public static Block EGGBURG_nama, EGGBURG_bake, EGGBURG_1, EGGBURG_2, EGGBURG_kara;
	public static Block EGGBURGSET_1, EGGBURGSET_2, EGGBURGSET_3, EGGBURGSET_4, EGGBURGSET_kara;

	public static Block ZUNDOU;

	public static Block CURRYNABE_nama, CURRYNABE_1, CURRYNABE_2, CURRYNABE_3, CURRYNABE_4;
	public static Block CURRY_1, CURRY_2, CURRY_3, CURRY_kara;
	public static Block CURRYSET_1, CURRYSET_2, CURRYSET_3, CURRYSET_4, CURRYSET_kara;

	public static Block ZUNDOU_MIZU, ZUNDOU_OYU, PASTANABE_full, PASTANABE_fust, PASTANABE_boil, PASTANABE_bost;
	public static Block TOMATOSAU_nama, TOMATOSAU_bake;
	public static Block PASTATOMA_1, PASTATOMA_2, PASTATOMA_3, PASTATOMA_kara;

	public static Block CHICKEN_1,CHICKEN_2,CHICKEN_3, CHICKEN_4, CHICKEN_kara;
	public static Block CHICKENB_1,CHICKENB_2,  CHICKENB_kara;

	public static Block SCONESET_1, SCONESET_2, SCONESET_3, SCONESET_4,
						  SCONESET_a, SCONESET_b, SCONESET_c, SCONESET_d, SCONESET_k;

	public static Block TEACUP_1, TEACUP_2, TEACUP_kara;
	public static Block TEAPOT_1, TEAPOT_2, TEAPOT_3, TEAPOT_4, TEAPOT_kara;
	public static Block TEASET_1, TEASET_2, TEASET_3, TEASET_kara;

	public static Block JPTEACUP_1, JPTEACUP_2, JPTEACUP_kara;
	public static Block KYUSU_1, KYUSU_2, KYUSU_3, KYUSU_4, KYUSU_kara;
	public static Block JPTEASET_1, JPTEASET_2, JPTEASET_3, JPTEASET_kara;

	public static Block ICECREAM_1, ICECREAM_2, ICECREAM_3, ICECREAM_kara;

	public static void init() {

		KETTLE = new BlockKettle().setRegistryName("block_kettle").setUnlocalizedName("block_kettle");
		KETTLE_full = new BlockKettle_full().setRegistryName("block_kettle_full").setUnlocalizedName("block_kettle_full").setCreativeTab(ChinjufuModTabs.tab_teatime);
		KETTLE_boil = new BlockKettle_boil().setRegistryName("block_kettle_boil").setUnlocalizedName("block_kettle_boil");

		NABE_kara = new BlockNabe_kara().setRegistryName("block_food_karanabe").setUnlocalizedName("block_food_karanabe").setCreativeTab(ChinjufuModTabs.tab_teatime);

		NABESHIO_nama = new BlockNabeShio_nama().setRegistryName("block_food_nabeshio_n").setUnlocalizedName("block_food_nabeshio_n").setCreativeTab(ChinjufuModTabs.tab_teatime);
		NABESHIO_boil = new BlockNabeShio_boil().setRegistryName("block_food_nabeshio_b").setUnlocalizedName("block_food_nabeshio_b").setCreativeTab(ChinjufuModTabs.tab_teatime);
		NABETOUFU_nama = new BlockNabeToufu_nama().setRegistryName("block_food_nabetoufu_n").setUnlocalizedName("block_food_nabetoufu_n").setCreativeTab(ChinjufuModTabs.tab_teatime);
		NABETOUFU_boil = new BlockNabeToufu_boil().setRegistryName("block_food_nabetoufu_b").setUnlocalizedName("block_food_nabetoufu_b").setCreativeTab(ChinjufuModTabs.tab_teatime);

		NABE_nama = new BlockNabe_nama().setRegistryName("block_food_nabe_n").setUnlocalizedName("block_food_nabe_n").setCreativeTab(ChinjufuModTabs.tab_teatime);
		NABE_boil = new BlockNabe_boil().setRegistryName("block_food_nabe_b").setUnlocalizedName("block_food_nabe_b");
		NABE_1 = new BlockNabe_1().setRegistryName("block_food_nabe_1").setUnlocalizedName("block_food_nabe_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		NABE_2 = new BlockNabe_2().setRegistryName("block_food_nabe_2").setUnlocalizedName("block_food_nabe_2");
		NABE_3 = new BlockNabe_3().setRegistryName("block_food_nabe_3").setUnlocalizedName("block_food_nabe_3");
		NABE_4 = new BlockNabe_4().setRegistryName("block_food_nabe_4").setUnlocalizedName("block_food_nabe_4");
		TONSUI_1 = new BlockTonsui_1().setRegistryName("block_food_tonsui_1").setUnlocalizedName("block_food_tonsui_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		TONSUI_2 = new BlockTonsui_2().setRegistryName("block_food_tonsui_2").setUnlocalizedName("block_food_tonsui_2");
		TONSUI_kara = new BlockTonsui_kara().setRegistryName("block_food_tonsui_k").setUnlocalizedName("block_food_tonsui_k");

		NABEGOHAN_nama = new BlockNabeGohan_nama().setRegistryName("block_food_nabegohan_n").setUnlocalizedName("block_food_nabegohan_n").setCreativeTab(ChinjufuModTabs.tab_teatime);
		NABEGOHAN_boil = new BlockNabeGohan_boil().setRegistryName("block_food_nabegohan_b").setUnlocalizedName("block_food_nabegohan_b");
		NABEGOHAN_1 = new BlockNabeGohan_1().setRegistryName("block_food_nabegohan_1").setUnlocalizedName("block_food_nabegohan_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		NABEGOHAN_2 = new BlockNabeGohan_2().setRegistryName("block_food_nabegohan_2").setUnlocalizedName("block_food_nabegohan_2");
		NABEGOHAN_3 = new BlockNabeGohan_3().setRegistryName("block_food_nabegohan_3").setUnlocalizedName("block_food_nabegohan_3");
		NABEGOHAN_4 = new BlockNabeGohan_4().setRegistryName("block_food_nabegohan_4").setUnlocalizedName("block_food_nabegohan_4");
		GOHAN_1 = new BlockGohan_1().setRegistryName("block_food_gohan_1").setUnlocalizedName("block_food_gohan_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		GOHAN_2 = new BlockGohan_2().setRegistryName("block_food_gohan_2").setUnlocalizedName("block_food_gohan_2");
		GOHAN_kara = new BlockGohan_kara().setRegistryName("block_food_gohan_k").setUnlocalizedName("block_food_gohan_k");
		RICE_1 = new BlockRice_1().setRegistryName("block_food_rice_1").setUnlocalizedName("block_food_rice_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		RICE_2 = new BlockRice_2().setRegistryName("block_food_rice_2").setUnlocalizedName("block_food_rice_2");
		RICE_kara = new BlockRice_kara().setRegistryName("block_food_rice_k").setUnlocalizedName("block_food_rice_k");

		NABEMISO_nama = new BlockNabeMiso_nama().setRegistryName("block_food_nabemiso_n").setUnlocalizedName("block_food_nabemiso_n").setCreativeTab(ChinjufuModTabs.tab_teatime);
		NABEMISO_boil = new BlockNabeMiso_boil().setRegistryName("block_food_nabemiso_b").setUnlocalizedName("block_food_nabemiso_b");
		NABEMISO_1 = new BlockNabeMiso_1().setRegistryName("block_food_nabemiso_1").setUnlocalizedName("block_food_nabemiso_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		NABEMISO_2 = new BlockNabeMiso_2().setRegistryName("block_food_nabemiso_2").setUnlocalizedName("block_food_nabemiso_2");
		NABEMISO_3 = new BlockNabeMiso_3().setRegistryName("block_food_nabemiso_3").setUnlocalizedName("block_food_nabemiso_3");
		NABEMISO_4 = new BlockNabeMiso_4().setRegistryName("block_food_nabemiso_4").setUnlocalizedName("block_food_nabemiso_4");
		MISOSOUP_1 = new BlockMisoSP_1().setRegistryName("block_food_misosp_1").setUnlocalizedName("block_food_misosp_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		MISOSOUP_2 = new BlockMisoSP_2().setRegistryName("block_food_misosp_2").setUnlocalizedName("block_food_misosp_2");
		MISOSOUP_kara = new BlockMisoSP_kara().setRegistryName("block_food_misosp_kara").setUnlocalizedName("block_food_misosp_kara");

		NABECORNS_nama = new BlockNabeCS_nama().setRegistryName("block_food_nabecorns_n").setUnlocalizedName("block_food_nabecorns_n").setCreativeTab(ChinjufuModTabs.tab_teatime);
		NABECORNS_boil = new BlockNabeCS_boil().setRegistryName("block_food_nabecorns_b").setUnlocalizedName("block_food_nabecorns_b");
		NABECORNS_1 = new BlockNabeCS_1().setRegistryName("block_food_nabecorns_1").setUnlocalizedName("block_food_nabecorns_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		NABECORNS_2 = new BlockNabeCS_2().setRegistryName("block_food_nabecorns_2").setUnlocalizedName("block_food_nabecorns_2");
		NABECORNS_3 = new BlockNabeCS_3().setRegistryName("block_food_nabecorns_3").setUnlocalizedName("block_food_nabecorns_3");
		NABECORNS_4 = new BlockNabeCS_4().setRegistryName("block_food_nabecorns_4").setUnlocalizedName("block_food_nabecorns_4");
		CORNSOUP_1 = new BlockCornS_1().setRegistryName("block_food_cornsp_1").setUnlocalizedName("block_food_cornsp_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		CORNSOUP_2 = new BlockCornS_2().setRegistryName("block_food_cornsp_2").setUnlocalizedName("block_food_cornsp_2");
		CORNSOUP_kara = new BlockCornS_kara().setRegistryName("block_food_cornsp_kara").setUnlocalizedName("block_food_cornsp_kara");

		FRYPAN = new BlockFrypan().setRegistryName("block_food_frypan").setUnlocalizedName("block_food_frypan").setCreativeTab(ChinjufuModTabs.tab_teatime);

		TAMAGOYAKI_nama = new BlockTamagoyaki_nama().setRegistryName("block_food_tgy_nama").setUnlocalizedName("block_food_tgy_nama").setCreativeTab(ChinjufuModTabs.tab_teatime);
		TAMAGOYAKI_bake = new BlockTamagoyaki_bake().setRegistryName("block_food_tgy_bake").setUnlocalizedName("block_food_tgy_bake").setCreativeTab(ChinjufuModTabs.tab_teatime);
		TAMAGOYAKI_1 = new BlockTamagoyaki_1().setRegistryName("block_food_tgy_1").setUnlocalizedName("block_food_tgy_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		TAMAGOYAKI_2 = new BlockTamagoyaki_2().setRegistryName("block_food_tgy_2").setUnlocalizedName("block_food_tgy_2");
		TAMAGOYAKI_kara = new BlockTamagoyaki_kara().setRegistryName("block_food_tgy_kara").setUnlocalizedName("block_food_tgy_kara");
		TAMAGOYAKITEI_1 = new BlockTgyTei_1().setRegistryName("block_food_tgytei_1").setUnlocalizedName("block_food_tgytei_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		TAMAGOYAKITEI_2 = new BlockTgyTei_2().setRegistryName("block_food_tgytei_2").setUnlocalizedName("block_food_tgytei_2");
		TAMAGOYAKITEI_3 = new BlockTgyTei_3().setRegistryName("block_food_tgytei_3").setUnlocalizedName("block_food_tgytei_3");
		TAMAGOYAKITEI_4 = new BlockTgyTei_4().setRegistryName("block_food_tgytei_4").setUnlocalizedName("block_food_tgytei_4");
		TAMAGOYAKITEI_kara = new BlockTgyTei_kara().setRegistryName("block_food_tgytei_kara").setUnlocalizedName("block_food_tgytei_kara");
		YAKIZAKANATEI_1 = new BlockYakizakanatei_1().setRegistryName("block_food_yakizakanatei_1").setUnlocalizedName("block_food_yakizakanatei_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		YAKIZAKANATEI_2 = new BlockYakizakanatei_2().setRegistryName("block_food_yakizakanatei_2").setUnlocalizedName("block_food_yakizakanatei_2");
		YAKIZAKANATEI_3 = new BlockYakizakanatei_3().setRegistryName("block_food_yakizakanatei_3").setUnlocalizedName("block_food_yakizakanatei_3");
		YAKIZAKANATEI_4 = new BlockYakizakanatei_4().setRegistryName("block_food_yakizakanatei_4").setUnlocalizedName("block_food_yakizakanatei_4");
		YAKIZAKANATEI_kara = new BlockYakizakanatei_kara().setRegistryName("block_food_yakizakanatei_kara").setUnlocalizedName("block_food_yakizakanatei_kara");

		EGGBURG_nama = new BlockEggburg_nama().setRegistryName("block_food_egb_nama").setUnlocalizedName("block_food_egb_nama").setCreativeTab(ChinjufuModTabs.tab_teatime);
		EGGBURG_bake = new BlockEggburg_bake().setRegistryName("block_food_egb_bake").setUnlocalizedName("block_food_egb_bake").setCreativeTab(ChinjufuModTabs.tab_teatime);
		EGGBURG_1 = new BlockEggburg_1().setRegistryName("block_food_egb_1").setUnlocalizedName("block_food_egb_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		EGGBURG_2 = new BlockEggburg_2().setRegistryName("block_food_egb_2").setUnlocalizedName("block_food_egb_2");
		EGGBURG_kara = new BlockEggburg_kara().setRegistryName("block_food_egb_kara").setUnlocalizedName("block_food_egb_kara");
		EGGBURGSET_1 = new BlockEggburgTei_1().setRegistryName("block_food_egbset_1").setUnlocalizedName("block_food_egbset_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		EGGBURGSET_2 = new BlockEggburgTei_2().setRegistryName("block_food_egbset_2").setUnlocalizedName("block_food_egbset_2");
		EGGBURGSET_3 = new BlockEggburgTei_3().setRegistryName("block_food_egbset_3").setUnlocalizedName("block_food_egbset_3");
		EGGBURGSET_4 = new BlockEggburgTei_4().setRegistryName("block_food_egbset_4").setUnlocalizedName("block_food_egbset_4");
		EGGBURGSET_kara = new BlockEggburgTei_kara().setRegistryName("block_food_egbset_kara").setUnlocalizedName("block_food_egbset_kara");

		ZUNDOU = new BlockZundou().setRegistryName("block_food_zundou").setUnlocalizedName("block_food_zundou").setCreativeTab(ChinjufuModTabs.tab_teatime);

		CURRYNABE_nama = new BlockCurryNabe_nama().setRegistryName("block_food_cunabe_n").setUnlocalizedName("block_food_cunabe_n").setCreativeTab(ChinjufuModTabs.tab_teatime);
		CURRYNABE_1 = new BlockCurryNabe_1().setRegistryName("block_food_cunabe_1").setUnlocalizedName("block_food_cunabe_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		CURRYNABE_2 = new BlockCurryNabe_2().setRegistryName("block_food_cunabe_2").setUnlocalizedName("block_food_cunabe_2");
		CURRYNABE_3 = new BlockCurryNabe_3().setRegistryName("block_food_cunabe_3").setUnlocalizedName("block_food_cunabe_3");
		CURRYNABE_4 = new BlockCurryNabe_4().setRegistryName("block_food_cunabe_4").setUnlocalizedName("block_food_cunabe_4");
		CURRY_1 = new BlockCurry_1().setRegistryName("block_food_curry_1").setUnlocalizedName("block_food_curry_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		CURRY_2 = new BlockCurry_2().setRegistryName("block_food_curry_2").setUnlocalizedName("block_food_curry_2");
		CURRY_3 = new BlockCurry_3().setRegistryName("block_food_curry_3").setUnlocalizedName("block_food_curry_3");
		CURRY_kara = new BlockCurrySet_kara().setRegistryName("block_food_curry_k").setUnlocalizedName("block_food_curry_k");
		CURRYSET_1 = new BlockCurrySet_1().setRegistryName("block_food_curryset_1").setUnlocalizedName("block_food_curryset_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		CURRYSET_2 = new BlockCurrySet_2().setRegistryName("block_food_curryset_2").setUnlocalizedName("block_food_curryset_2");
		CURRYSET_3 = new BlockCurrySet_3().setRegistryName("block_food_curryset_3").setUnlocalizedName("block_food_curryset_3");
		CURRYSET_4 = new BlockCurrySet_4().setRegistryName("block_food_curryset_4").setUnlocalizedName("block_food_curryset_4");
		CURRYSET_kara = new BlockCurrySet_kara().setRegistryName("block_food_curryset_k").setUnlocalizedName("block_food_curryset_k");

		ZUNDOU_MIZU = new BlockZundou_mizu().setRegistryName("block_food_zundou_m").setUnlocalizedName("block_food_zundou_m").setCreativeTab(ChinjufuModTabs.tab_teatime);
		ZUNDOU_OYU = new BlockZundou_oyu().setRegistryName("block_food_zundou_o").setUnlocalizedName("block_food_zundou_o");

		PASTANABE_full = new BlockPastaNabe_full().setRegistryName("block_food_pastanabe_f").setUnlocalizedName("block_food_pastanabe_f");
		PASTANABE_fust = new BlockPastaNabe_fust().setRegistryName("block_food_pastanabe_fs").setUnlocalizedName("block_food_pastanabe_fs");
		PASTANABE_boil = new BlockPastaNabe_boil().setRegistryName("block_food_pastanabe_b").setUnlocalizedName("block_food_pastanabe_b");
 		PASTANABE_bost = new BlockPastaNabe_bost().setRegistryName("block_food_pastanabe_bs").setUnlocalizedName("block_food_pastanabe_bs");
 		TOMATOSAU_nama = new BlockSouToma_nama().setRegistryName("block_food_sautoma_n").setUnlocalizedName("block_food_sautoma_n").setCreativeTab(ChinjufuModTabs.tab_teatime);
		TOMATOSAU_bake = new BlockSouToma_bake().setRegistryName("block_food_sautoma_b").setUnlocalizedName("block_food_sautoma_b").setCreativeTab(ChinjufuModTabs.tab_teatime);
		PASTATOMA_1 = new BlockPastaToma_1().setRegistryName("block_food_pastatoma_1").setUnlocalizedName("block_food_pastatoma_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		PASTATOMA_2 = new BlockPastaToma_2().setRegistryName("block_food_pastatoma_2").setUnlocalizedName("block_food_pastatoma_2");
		PASTATOMA_3 = new BlockPastaToma_3().setRegistryName("block_food_pastatoma_3").setUnlocalizedName("block_food_pastatoma_3");
		PASTATOMA_kara = new BlockPastaToma_kara().setRegistryName("block_food_pastatoma_k").setUnlocalizedName("block_food_pastatoma_k");

		CHICKEN_1 = new BlockChicken_1().setRegistryName("block_food_roastchicken_1").setUnlocalizedName("block_food_roastchicken_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		CHICKEN_2 = new BlockChicken_2().setRegistryName("block_food_roastchicken_2").setUnlocalizedName("block_food_roastchicken_2");
		CHICKEN_3 = new BlockChicken_3().setRegistryName("block_food_roastchicken_3").setUnlocalizedName("block_food_roastchicken_3");
		CHICKEN_4 = new BlockChicken_4().setRegistryName("block_food_roastchicken_4").setUnlocalizedName("block_food_roastchicken_4");
		CHICKEN_kara = new BlockChicken_kara().setRegistryName("block_food_roastchicken_k").setUnlocalizedName("block_food_roastchicken_k");
		CHICKENB_1 = new BlockChickenB_1().setRegistryName("block_food_chickenb_1").setUnlocalizedName("block_food_chickenb_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		CHICKENB_2 = new BlockChickenB_2().setRegistryName("block_food_chickenb_2").setUnlocalizedName("block_food_chickenb_2");
		CHICKENB_kara = new BlockChickenB_kara().setRegistryName("block_food_chickenb_k").setUnlocalizedName("block_food_chickenb_k");

		SCONESET_1 = new BlockSconeSet_1().setRegistryName("block_food_sconeset_1").setUnlocalizedName("block_food_sconeset_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		SCONESET_2 = new BlockSconeSet_2().setRegistryName("block_food_sconeset_2").setUnlocalizedName("block_food_sconeset_2");
		SCONESET_3 = new BlockSconeSet_3().setRegistryName("block_food_sconeset_3").setUnlocalizedName("block_food_sconeset_3");
		SCONESET_4 = new BlockSconeSet_4().setRegistryName("block_food_sconeset_4").setUnlocalizedName("block_food_sconeset_4");
		SCONESET_a = new BlockSconeSet_a().setRegistryName("block_food_sconeset_a").setUnlocalizedName("block_food_sconeset_a");
		SCONESET_b = new BlockSconeSet_b().setRegistryName("block_food_sconeset_b").setUnlocalizedName("block_food_sconeset_b");
		SCONESET_c = new BlockSconeSet_c().setRegistryName("block_food_sconeset_c").setUnlocalizedName("block_food_sconeset_c");
		SCONESET_d = new BlockSconeSet_d().setRegistryName("block_food_sconeset_d").setUnlocalizedName("block_food_sconeset_d");
		SCONESET_k = new BlockSconeSet_k().setRegistryName("block_food_teastand").setUnlocalizedName("block_food_teastand").setCreativeTab(ChinjufuModTabs.tab_teatime);

		TEACUP_1 = new BlockTeaCup_1().setRegistryName("block_food_teacup_1").setUnlocalizedName("block_food_teacup_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		TEACUP_2 = new BlockTeaCup_2().setRegistryName("block_food_teacup_2").setUnlocalizedName("block_food_teacup_2");
		TEACUP_kara = new BlockTeaCup_kara().setRegistryName("block_food_teacup_k").setUnlocalizedName("block_food_teacup_k");
		TEAPOT_1 = new BlockTeaPot_1().setRegistryName("block_food_teapot_1").setUnlocalizedName("block_food_teapot_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		TEAPOT_2 = new BlockTeaPot_2().setRegistryName("block_food_teapot_2").setUnlocalizedName("block_food_teapot_2");
		TEAPOT_3 = new BlockTeaPot_3().setRegistryName("block_food_teapot_3").setUnlocalizedName("block_food_teapot_3");
		TEAPOT_4 = new BlockTeaPot_4().setRegistryName("block_food_teapot_4").setUnlocalizedName("block_food_teapot_4");
		TEAPOT_kara = new BlockTeaPot_kara().setRegistryName("block_food_teapot_k").setUnlocalizedName("block_food_teapot_k").setCreativeTab(ChinjufuModTabs.tab_teatime);
		TEASET_1 = new BlockTeaSet_1().setRegistryName("block_food_teaset_1").setUnlocalizedName("block_food_teaset_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		TEASET_2 = new BlockTeaSet_2().setRegistryName("block_food_teaset_2").setUnlocalizedName("block_food_teaset_2");
		TEASET_3 = new BlockTeaSet_3().setRegistryName("block_food_teaset_3").setUnlocalizedName("block_food_teaset_3");
		TEASET_kara = new BlockTeaSet_kara().setRegistryName("block_food_teaset_k").setUnlocalizedName("block_food_teaset_k");

		JPTEACUP_1 = new BlockJPTeaCup_1().setRegistryName("block_food_jpteacup_1").setUnlocalizedName("block_food_jpteacup_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		JPTEACUP_2 = new BlockJPTeaCup_2().setRegistryName("block_food_jpteacup_2").setUnlocalizedName("block_food_jpteacup_2");
		JPTEACUP_kara = new BlockJPTeaCup_kara().setRegistryName("block_food_jpteacup_k").setUnlocalizedName("block_food_jpteacup_k");
		KYUSU_1 = new BlockKyusu_1().setRegistryName("block_food_kyusu_1").setUnlocalizedName("block_food_kyusu_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		KYUSU_2 = new BlockKyusu_2().setRegistryName("block_food_kyusu_2").setUnlocalizedName("block_food_kyusu_2");
		KYUSU_3 = new BlockKyusu_3().setRegistryName("block_food_kyusu_3").setUnlocalizedName("block_food_kyusu_3");
		KYUSU_4 = new BlockKyusu_4().setRegistryName("block_food_kyusu_4").setUnlocalizedName("block_food_kyusu_4");
		KYUSU_kara = new BlockKyusu_kara().setRegistryName("block_food_kyusu_k").setUnlocalizedName("block_food_kyusu_k").setCreativeTab(ChinjufuModTabs.tab_teatime);
		JPTEASET_1 = new BlockJPTeaSet_1().setRegistryName("block_food_jpteaset_1").setUnlocalizedName("block_food_jpteaset_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		JPTEASET_2 = new BlockJPTeaSet_2().setRegistryName("block_food_jpteaset_2").setUnlocalizedName("block_food_jpteaset_2");
		JPTEASET_3 = new BlockJPTeaSet_3().setRegistryName("block_food_jpteaset_3").setUnlocalizedName("block_food_jpteaset_3");
		JPTEASET_kara = new BlockJPTeaSet_kara().setRegistryName("block_food_jpteaset_k").setUnlocalizedName("block_food_jpteaset_k");

		ICECREAM_1 = new BlockIcecream_1().setRegistryName("block_food_icecream_1").setUnlocalizedName("block_food_icecream_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		ICECREAM_2 = new BlockIcecream_2().setRegistryName("block_food_icecream_2").setUnlocalizedName("block_food_icecream_2");
		ICECREAM_3 = new BlockIcecream_3().setRegistryName("block_food_icecream_3").setUnlocalizedName("block_food_icecream_3");
		ICECREAM_kara = new BlockIcecream_kara().setRegistryName("block_food_icecream_k").setUnlocalizedName("block_food_icecream_k");

	}


	public static void register() {

		registerBlock(KETTLE);
		registerBlock(KETTLE_full);
		registerBlock(KETTLE_boil);

		registerBlock(NABE_kara);
		registerBlock(NABESHIO_nama);
		registerBlock(NABESHIO_boil);
		registerBlock(NABETOUFU_nama);
		registerBlock(NABETOUFU_boil);
		registerBlock(NABE_nama);
		registerBlock(NABE_boil);
		registerBlock(NABE_1);
		registerBlock(NABE_2);
		registerBlock(NABE_3);
		registerBlock(NABE_4);
		registerBlock(TONSUI_1);
		registerBlock(TONSUI_2);
		registerBlock(TONSUI_kara);

		registerBlock(NABEGOHAN_nama);
		registerBlock(NABEGOHAN_boil);
		registerBlock(NABEGOHAN_1);
		registerBlock(NABEGOHAN_2);
		registerBlock(NABEGOHAN_3);
		registerBlock(NABEGOHAN_4);
		registerBlock(GOHAN_1);
		registerBlock(GOHAN_2);
		registerBlock(GOHAN_kara);
		registerBlock(RICE_1);
		registerBlock(RICE_2);
		registerBlock(RICE_kara);

		registerBlock(NABEMISO_nama);
		registerBlock(NABEMISO_boil);
		registerBlock(NABEMISO_1);
		registerBlock(NABEMISO_2);
		registerBlock(NABEMISO_3);
		registerBlock(NABEMISO_4);
		registerBlock(MISOSOUP_1);
		registerBlock(MISOSOUP_2);
		registerBlock(MISOSOUP_kara);

		registerBlock(NABECORNS_nama);
		registerBlock(NABECORNS_boil);
		registerBlock(NABECORNS_1);
		registerBlock(NABECORNS_2);
		registerBlock(NABECORNS_3);
		registerBlock(NABECORNS_4);
		registerBlock(CORNSOUP_1);
		registerBlock(CORNSOUP_2);
		registerBlock(CORNSOUP_kara);

		registerBlock(FRYPAN);

		registerBlock(TAMAGOYAKI_nama);
		registerBlock(TAMAGOYAKI_bake);
		registerBlock(TAMAGOYAKI_1);
		registerBlock(TAMAGOYAKI_2);
		registerBlock(TAMAGOYAKI_kara);
		registerBlock(TAMAGOYAKITEI_1);
		registerBlock(TAMAGOYAKITEI_2);
		registerBlock(TAMAGOYAKITEI_3);
		registerBlock(TAMAGOYAKITEI_4);
		registerBlock(TAMAGOYAKITEI_kara);

		registerBlock(YAKIZAKANATEI_1);
		registerBlock(YAKIZAKANATEI_2);
		registerBlock(YAKIZAKANATEI_3);
		registerBlock(YAKIZAKANATEI_4);
		registerBlock(YAKIZAKANATEI_kara);
		registerBlock(EGGBURG_nama);
		registerBlock(EGGBURG_bake);
		registerBlock(EGGBURG_1);
		registerBlock(EGGBURG_2);
		registerBlock(EGGBURG_kara);
		registerBlock(EGGBURGSET_1);
		registerBlock(EGGBURGSET_2);
		registerBlock(EGGBURGSET_3);
		registerBlock(EGGBURGSET_4);
		registerBlock(EGGBURGSET_kara);

		registerBlock(CURRYNABE_nama);
		registerBlock(CURRYNABE_1);
		registerBlock(CURRYNABE_2);
		registerBlock(CURRYNABE_3);
		registerBlock(CURRYNABE_4);
		registerBlock(ZUNDOU);
		registerBlock(CURRY_1);
		registerBlock(CURRY_2);
		registerBlock(CURRY_3);
		registerBlock(CURRY_kara);
		registerBlock(CURRYSET_1);
		registerBlock(CURRYSET_2);
		registerBlock(CURRYSET_3);
		registerBlock(CURRYSET_4);
		registerBlock(CURRYSET_kara);

		registerBlock(ZUNDOU_MIZU);
		registerBlock(ZUNDOU_OYU);

		registerBlock(PASTANABE_full);
		registerBlock(PASTANABE_fust);
		registerBlock(PASTANABE_boil);
		registerBlock(PASTANABE_bost);
		registerBlock(TOMATOSAU_nama);
		registerBlock(TOMATOSAU_bake);
		registerBlock(PASTATOMA_1);
		registerBlock(PASTATOMA_2);
		registerBlock(PASTATOMA_3);
		registerBlock(PASTATOMA_kara);

		registerBlock(CHICKEN_1);
		registerBlock(CHICKEN_2);
		registerBlock(CHICKEN_3);
		registerBlock(CHICKEN_4);
		registerBlock(CHICKEN_kara);
		registerBlock(CHICKENB_1);
		registerBlock(CHICKENB_2);
		registerBlock(CHICKENB_kara);

		registerBlock(SCONESET_1);
		registerBlock(SCONESET_2);
		registerBlock(SCONESET_3);
		registerBlock(SCONESET_4);
		registerBlock(SCONESET_a);
		registerBlock(SCONESET_b);
		registerBlock(SCONESET_c);
		registerBlock(SCONESET_d);
		registerBlock(SCONESET_k);

		registerBlock(TEACUP_1);
		registerBlock(TEACUP_2);
		registerBlock(TEACUP_kara);
		registerBlock(TEAPOT_1);
		registerBlock(TEAPOT_2);
		registerBlock(TEAPOT_3);
		registerBlock(TEAPOT_4);
		registerBlock(TEAPOT_kara);
		registerBlock(TEASET_1);
		registerBlock(TEASET_2);
		registerBlock(TEASET_3);
		registerBlock(TEASET_kara);

		registerBlock(JPTEACUP_1);
		registerBlock(JPTEACUP_2);
		registerBlock(JPTEACUP_kara);
		registerBlock(KYUSU_1);
		registerBlock(KYUSU_2);
		registerBlock(KYUSU_3);
		registerBlock(KYUSU_4);
		registerBlock(KYUSU_kara);
		registerBlock(JPTEASET_1);
		registerBlock(JPTEASET_2);
		registerBlock(JPTEASET_3);
		registerBlock(JPTEASET_kara);

		registerBlock(ICECREAM_1);
		registerBlock(ICECREAM_2);
		registerBlock(ICECREAM_3);
		registerBlock(ICECREAM_kara);

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

		registerRender(KETTLE);
		registerRender(KETTLE_full);
		registerRender(KETTLE_boil);

		registerRender(NABE_kara);
		registerRender(NABESHIO_nama);
		registerRender(NABESHIO_boil);
		registerRender(NABETOUFU_nama);
		registerRender(NABETOUFU_boil);
		registerRender(NABE_nama);
		registerRender(NABE_boil);
		registerRender(NABE_1);
		registerRender(TONSUI_1);
		registerRender(TONSUI_kara);

		registerRender(NABEGOHAN_nama);
		registerRender(NABEGOHAN_1);
		registerRender(GOHAN_1);
		registerRender(GOHAN_kara);
		registerRender(RICE_1);
		registerRender(RICE_kara);

		registerRender(NABEMISO_nama);
		registerRender(NABEMISO_1);
		registerRender(MISOSOUP_1);
		registerRender(MISOSOUP_kara);

		registerRender(NABECORNS_nama);
		registerRender(NABECORNS_1);
		registerRender(CORNSOUP_1);
		registerRender(CORNSOUP_kara);

		registerRender(FRYPAN);

		registerRender(TAMAGOYAKI_nama);
		registerRender(TAMAGOYAKI_bake);
		registerRender(TAMAGOYAKI_1);
		registerRender(TAMAGOYAKI_kara);
		registerRender(TAMAGOYAKITEI_1);
		registerRender(TAMAGOYAKITEI_kara);

		registerRender(YAKIZAKANATEI_1);
		registerRender(YAKIZAKANATEI_kara);
		registerRender(EGGBURG_nama);
		registerRender(EGGBURG_bake);
		registerRender(EGGBURG_1);
		registerRender(EGGBURG_kara);
		registerRender(EGGBURGSET_1);
		registerRender(EGGBURGSET_kara);

		registerRender(CURRYNABE_nama);
		registerRender(CURRYNABE_1);
		registerRender(ZUNDOU);
		registerRender(CURRY_1);
		registerRender(CURRY_kara);
		registerRender(CURRYSET_1);
		registerRender(CURRYSET_kara);

		registerRender(ZUNDOU_MIZU);
		registerRender(TOMATOSAU_nama);
		registerRender(TOMATOSAU_bake);
		registerRender(PASTATOMA_1);

		registerRender(CHICKEN_1);
		registerRender(CHICKEN_kara);
		registerRender(CHICKENB_1);
		registerRender(CHICKENB_kara);

		registerRender(SCONESET_1);
		registerRender(SCONESET_k);

		registerRender(TEACUP_1);
		registerRender(TEACUP_kara);
		registerRender(TEAPOT_1);
		registerRender(TEAPOT_kara);
		registerRender(TEASET_1);
		registerRender(TEASET_kara);

		registerRender(JPTEACUP_1);
		registerRender(JPTEACUP_kara);
		registerRender(KYUSU_1);
		registerRender(KYUSU_kara);
		registerRender(JPTEASET_1);
		registerRender(JPTEASET_kara);

		registerRender(ICECREAM_1);
		registerRender(ICECREAM_kara);

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

			ChinjufuModFoodBlocks.init();
			ChinjufuModFoodBlocks.register();
			BLOCKS.stream().forEach(block -> event.getRegistry().register(block));
		}
	}
}
