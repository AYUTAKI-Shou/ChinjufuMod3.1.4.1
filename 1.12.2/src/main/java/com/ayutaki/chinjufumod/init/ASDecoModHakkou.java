package com.ayutaki.chinjufumod.init;

import java.util.LinkedList;
import java.util.List;

import com.ayutaki.chinjufumod.init.hakkou.BlockAmazake_Gla_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockAmazake_Gla_2;
import com.ayutaki.chinjufumod.init.hakkou.BlockAmazake_Gla_k;
import com.ayutaki.chinjufumod.init.hakkou.BlockBin_Koubo_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockBin_Koubo_full;
import com.ayutaki.chinjufumod.init.hakkou.BlockCiderJuku_Bot_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockCiderJuku_Bot_2;
import com.ayutaki.chinjufumod.init.hakkou.BlockCiderJuku_Bot_3;
import com.ayutaki.chinjufumod.init.hakkou.BlockCiderJuku_Bot_4;
import com.ayutaki.chinjufumod.init.hakkou.BlockCiderJuku_Gla_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockCiderJuku_Gla_2;
import com.ayutaki.chinjufumod.init.hakkou.BlockCider_Bot_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockCider_Bot_2;
import com.ayutaki.chinjufumod.init.hakkou.BlockCider_Bot_3;
import com.ayutaki.chinjufumod.init.hakkou.BlockCider_Bot_4;
import com.ayutaki.chinjufumod.init.hakkou.BlockCider_Gla_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockCider_Gla_2;
import com.ayutaki.chinjufumod.init.hakkou.BlockCider_Gla_k;
import com.ayutaki.chinjufumod.init.hakkou.BlockNabeAmazake_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockNabeAmazake_2;
import com.ayutaki.chinjufumod.init.hakkou.BlockNabeAmazake_3;
import com.ayutaki.chinjufumod.init.hakkou.BlockNabeAmazake_4;
import com.ayutaki.chinjufumod.init.hakkou.BlockNabeAmazake_boil;
import com.ayutaki.chinjufumod.init.hakkou.BlockNabeAmazake_nama;
import com.ayutaki.chinjufumod.init.hakkou.BlockNabeNimame_boil;
import com.ayutaki.chinjufumod.init.hakkou.BlockNabeNimame_nama;
import com.ayutaki.chinjufumod.init.hakkou.BlockSakeJuku_Bot_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockSakeJuku_Bot_2;
import com.ayutaki.chinjufumod.init.hakkou.BlockSakeJuku_Bot_3;
import com.ayutaki.chinjufumod.init.hakkou.BlockSakeJuku_Bot_4;
import com.ayutaki.chinjufumod.init.hakkou.BlockSakeJuku_Gla_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockSakeJuku_Gla_2;
import com.ayutaki.chinjufumod.init.hakkou.BlockSakeNama_Bot_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockSakeNama_Bot_2;
import com.ayutaki.chinjufumod.init.hakkou.BlockSakeNama_Bot_3;
import com.ayutaki.chinjufumod.init.hakkou.BlockSakeNama_Bot_4;
import com.ayutaki.chinjufumod.init.hakkou.BlockSakeNama_Gla_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockSakeNama_Gla_2;
import com.ayutaki.chinjufumod.init.hakkou.BlockSakeShin_Bot_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockSakeShin_Bot_2;
import com.ayutaki.chinjufumod.init.hakkou.BlockSakeShin_Bot_3;
import com.ayutaki.chinjufumod.init.hakkou.BlockSakeShin_Bot_4;
import com.ayutaki.chinjufumod.init.hakkou.BlockSakeShin_Gla_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockSakeShin_Gla_2;
import com.ayutaki.chinjufumod.init.hakkou.BlockSake_Bot_kara;
import com.ayutaki.chinjufumod.init.hakkou.BlockSake_Gla_kara;
import com.ayutaki.chinjufumod.init.hakkou.BlockTaru_Budoushu_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockTaru_Budoushu_2;
import com.ayutaki.chinjufumod.init.hakkou.BlockTaru_Budoushu_full;
import com.ayutaki.chinjufumod.init.hakkou.BlockTaru_Hakkou;
import com.ayutaki.chinjufumod.init.hakkou.BlockTaru_Jukusei_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockTaru_Jukusei_full;
import com.ayutaki.chinjufumod.init.hakkou.BlockTaru_Koucha_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockTaru_Koucha_full;
import com.ayutaki.chinjufumod.init.hakkou.BlockTaru_Kouji_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockTaru_Kouji_full;
import com.ayutaki.chinjufumod.init.hakkou.BlockTaru_Miso_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockTaru_Miso_full;
import com.ayutaki.chinjufumod.init.hakkou.BlockTaru_Moromi_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockTaru_Moromi_full;
import com.ayutaki.chinjufumod.init.hakkou.BlockTaru_Ringoshu_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockTaru_Ringoshu_2;
import com.ayutaki.chinjufumod.init.hakkou.BlockTaru_Ringoshu_full;
import com.ayutaki.chinjufumod.init.hakkou.BlockTaru_Shubo_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockTaru_Shubo_full;
import com.ayutaki.chinjufumod.init.hakkou.BlockWineJuku_Bot_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockWineJuku_Bot_2;
import com.ayutaki.chinjufumod.init.hakkou.BlockWineJuku_Bot_3;
import com.ayutaki.chinjufumod.init.hakkou.BlockWineJuku_Bot_4;
import com.ayutaki.chinjufumod.init.hakkou.BlockWineJuku_Gla_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockWineJuku_Gla_2;
import com.ayutaki.chinjufumod.init.hakkou.BlockWine_Bot_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockWine_Bot_2;
import com.ayutaki.chinjufumod.init.hakkou.BlockWine_Bot_3;
import com.ayutaki.chinjufumod.init.hakkou.BlockWine_Bot_4;
import com.ayutaki.chinjufumod.init.hakkou.BlockWine_Gla_1;
import com.ayutaki.chinjufumod.init.hakkou.BlockWine_Gla_2;
import com.ayutaki.chinjufumod.init.hakkou.BlockWine_Gla_kara;
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

public class ASDecoModHakkou {

	public static Block KOUBOBIN_full, KOUBOBIN_1;
	public static Block HAKKOUTARU;
	public static Block KOUJITARU_full, KOUJITARU_1;
	public static Block SHUBOTARU_full, SHUBOTARU_1;
	public static Block MOROMITARU_full, MOROMITARU_1;
	public static Block JYUKUSEITARU_full, JYUKUSEITARU_1;
	public static Block RINGOSHUTARU_full, RINGOSHUTARU_1, RINGOSHUTARU_2;
	public static Block BUDOUSHUTARU_full, BUDOUSHUTARU_1, BUDOUSHUTARU_2;
	public static Block MISOTARU_full, MISOTARU_1;
	public static Block KOUCHASAN_full, KOUCHASAN_1;

	public static Block NAMASAKEBOT_full, NAMASAKEBOT_2, NAMASAKEBOT_3, NAMASAKEBOT_4, NAMASAKEBOT_kara;
	public static Block NAMASAKEGLA_1, NAMASAKEGLA_2, NAMASAKEGLA_kara;
	public static Block SHINSAKEBOT_1, SHINSAKEBOT_2, SHINSAKEBOT_3, SHINSAKEBOT_4, SHINSAKEBOT_kara;
	public static Block SHINSAKEGLA_1, SHINSAKEGLA_2;
	public static Block JUKUSAKEBOT_1, JUKUSAKEBOT_2, JUKUSAKEBOT_3, JUKUSAKEBOT_4, JUKUSAKEBOT_kara;;
	public static Block JUKUSAKEGLA_1, JUKUSAKEGLA_2;

	public static Block WINEBOT_1, WINEBOT_2, WINEBOT_3, WINEBOT_4, WINEBOT_kara;
	public static Block WINEGLA_1, WINEGLA_2, WINEGLA_kara;
	public static Block JUKUWINEBOT_1, JUKUWINEBOT_2, JUKUWINEBOT_3, JUKUWINEBOT_4, JUKUWINEBOT_kara;
	public static Block JUKUWINEGLA_1, JUKUWINEGLA_2;
	public static Block CIDERBOT_1, CIDERBOT_2, CIDERBOT_3, CIDERBOT_4, CIDERBOT_kara;
	public static Block CIDERGLA_1, CIDERGLA_2, CIDERGLA_kara;
	public static Block JUKUCIDERBOT_1, JUKUCIDERBOT_2, JUKUCIDERBOT_3, JUKUCIDERBOT_4, JUKUCIDERBOT_kara;
	public static Block JUKUCIDERGLA_1, JUKUCIDERGLA_2;

	public static Block NABEAMAZAKE_nama, NABEAMAZAKE_boil, NABEAMAZAKE_1, NABEAMAZAKE_2, NABEAMAZAKE_3, NABEAMAZAKE_4;
	public static Block AMAZAKEGLA_1, AMAZAKEGLA_2, AMAZAKEGLA_k;

	public static Block NABENIMAME_nama, NABENIMAME_boil;

	public static void init() {

		KOUBOBIN_full = new BlockBin_Koubo_full().setRegistryName("block_bin_koubo_f").setUnlocalizedName("block_bin_koubo_f").setCreativeTab(ChinjufuModTabs.tab_teatime);
		KOUBOBIN_1 = new BlockBin_Koubo_1().setRegistryName("block_bin_koubo_1").setUnlocalizedName("block_bin_koubo_1");

		HAKKOUTARU = new BlockTaru_Hakkou().setRegistryName("block_taru_hakkou").setUnlocalizedName("block_taru_hakkou").setCreativeTab(ChinjufuModTabs.tab_teatime);

		KOUJITARU_full = new BlockTaru_Kouji_full().setRegistryName("block_taru_kouji_f").setUnlocalizedName("block_taru_kouji_f").setCreativeTab(ChinjufuModTabs.tab_teatime);
		KOUJITARU_1 = new BlockTaru_Kouji_1().setRegistryName("block_taru_kouji_1").setUnlocalizedName("block_taru_kouji_1");

		SHUBOTARU_full = new BlockTaru_Shubo_full().setRegistryName("block_taru_shubo_f").setUnlocalizedName("block_taru_shubo_f").setCreativeTab(ChinjufuModTabs.tab_teatime);
		SHUBOTARU_1 = new BlockTaru_Shubo_1().setRegistryName("block_taru_shubo_1").setUnlocalizedName("block_taru_shubo_1");

		MOROMITARU_full = new BlockTaru_Moromi_full().setRegistryName("block_taru_moromi_f").setUnlocalizedName("block_taru_moromi_f").setCreativeTab(ChinjufuModTabs.tab_teatime);
		MOROMITARU_1 = new BlockTaru_Moromi_1().setRegistryName("block_taru_moromi_1").setUnlocalizedName("block_taru_moromi_1");

		JYUKUSEITARU_full = new BlockTaru_Jukusei_full().setRegistryName("block_taru_jukusei_f").setUnlocalizedName("block_taru_jukusei_f").setCreativeTab(ChinjufuModTabs.tab_teatime);
		JYUKUSEITARU_1 = new BlockTaru_Jukusei_1().setRegistryName("block_taru_jukusei_1").setUnlocalizedName("block_taru_jukusei_1");

		RINGOSHUTARU_full = new BlockTaru_Ringoshu_full().setRegistryName("block_taru_ringoshu_f").setUnlocalizedName("block_taru_ringoshu_f").setCreativeTab(ChinjufuModTabs.tab_teatime);
		RINGOSHUTARU_1 = new BlockTaru_Ringoshu_1().setRegistryName("block_taru_ringoshu_1").setUnlocalizedName("block_taru_ringoshu_1");
		RINGOSHUTARU_2 = new BlockTaru_Ringoshu_2().setRegistryName("block_taru_ringoshu_2").setUnlocalizedName("block_taru_ringoshu_2");

		BUDOUSHUTARU_full = new BlockTaru_Budoushu_full().setRegistryName("block_taru_budoushu_f").setUnlocalizedName("block_taru_budoushu_f").setCreativeTab(ChinjufuModTabs.tab_teatime);
		BUDOUSHUTARU_1 = new BlockTaru_Budoushu_1().setRegistryName("block_taru_budoushu_1").setUnlocalizedName("block_taru_budoushu_1");
		BUDOUSHUTARU_2 = new BlockTaru_Budoushu_2().setRegistryName("block_taru_budoushu_2").setUnlocalizedName("block_taru_budoushu_2");

		MISOTARU_full = new BlockTaru_Miso_full().setRegistryName("block_taru_miso_f").setUnlocalizedName("block_taru_miso_f").setCreativeTab(ChinjufuModTabs.tab_teatime);
		MISOTARU_1 = new BlockTaru_Miso_1().setRegistryName("block_taru_miso_1").setUnlocalizedName("block_taru_miso_1");

		KOUCHASAN_full = new BlockTaru_Koucha_full().setRegistryName("block_taru_koucha_f").setUnlocalizedName("block_taru_koucha_f").setCreativeTab(ChinjufuModTabs.tab_teatime);
		KOUCHASAN_1 = new BlockTaru_Koucha_1().setRegistryName("block_taru_koucha_1").setUnlocalizedName("block_taru_koucha_1");

		NAMASAKEBOT_full = new BlockSakeNama_Bot_1().setRegistryName("block_bot_sakenama_1").setUnlocalizedName("block_bot_sakenama_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		NAMASAKEBOT_2 = new BlockSakeNama_Bot_2().setRegistryName("block_bot_sakenama_2").setUnlocalizedName("block_bot_sakenama_2");
		NAMASAKEBOT_3 = new BlockSakeNama_Bot_3().setRegistryName("block_bot_sakenama_3").setUnlocalizedName("block_bot_sakenama_3");
		NAMASAKEBOT_4 = new BlockSakeNama_Bot_4().setRegistryName("block_bot_sakenama_4").setUnlocalizedName("block_bot_sakenama_4");
		NAMASAKEBOT_kara = new BlockSake_Bot_kara().setRegistryName("block_bot_sakenama_k").setUnlocalizedName("block_bot_sakenama_k");
		NAMASAKEGLA_1 = new BlockSakeNama_Gla_1().setRegistryName("block_gla_sakenama_1").setUnlocalizedName("block_gla_sakenama_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		NAMASAKEGLA_2 = new BlockSakeNama_Gla_2().setRegistryName("block_gla_sakenama_2").setUnlocalizedName("block_gla_sakenama_2");
		NAMASAKEGLA_kara = new BlockSake_Gla_kara().setRegistryName("block_gla_sake_k").setUnlocalizedName("block_gla_sake_k");

		SHINSAKEBOT_1 = new BlockSakeShin_Bot_1().setRegistryName("block_bot_sake_1").setUnlocalizedName("block_bot_sake_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		SHINSAKEBOT_2 = new BlockSakeShin_Bot_2().setRegistryName("block_bot_sake_2").setUnlocalizedName("block_bot_sake_2");
		SHINSAKEBOT_3 = new BlockSakeShin_Bot_3().setRegistryName("block_bot_sake_3").setUnlocalizedName("block_bot_sake_3");
		SHINSAKEBOT_4 = new BlockSakeShin_Bot_4().setRegistryName("block_bot_sake_4").setUnlocalizedName("block_bot_sake_4");
		SHINSAKEBOT_kara = new BlockSake_Bot_kara().setRegistryName("block_bot_sake_k").setUnlocalizedName("block_bot_sake_k");
		SHINSAKEGLA_1 = new BlockSakeShin_Gla_1().setRegistryName("block_gla_sake_1").setUnlocalizedName("block_gla_sake_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		SHINSAKEGLA_2 = new BlockSakeShin_Gla_2().setRegistryName("block_gla_sake_2").setUnlocalizedName("block_gla_sake_2");

		JUKUSAKEBOT_1 = new BlockSakeJuku_Bot_1().setRegistryName("block_bot_sakejuku_1").setUnlocalizedName("block_bot_sakejuku_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		JUKUSAKEBOT_2 = new BlockSakeJuku_Bot_2().setRegistryName("block_bot_sakejuku_2").setUnlocalizedName("block_bot_sakejuku_2");
		JUKUSAKEBOT_3 = new BlockSakeJuku_Bot_3().setRegistryName("block_bot_sakejuku_3").setUnlocalizedName("block_bot_sakejuku_3");
		JUKUSAKEBOT_4 = new BlockSakeJuku_Bot_4().setRegistryName("block_bot_sakejuku_4").setUnlocalizedName("block_bot_sakejuku_4");
		JUKUSAKEBOT_kara = new BlockSake_Bot_kara().setRegistryName("block_bot_sakejuku_k").setUnlocalizedName("block_bot_sakejuku_k");
		JUKUSAKEGLA_1 = new BlockSakeJuku_Gla_1().setRegistryName("block_gla_sakejuku_1").setUnlocalizedName("block_gla_sakejuku_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		JUKUSAKEGLA_2 = new BlockSakeJuku_Gla_2().setRegistryName("block_gla_sakejuku_2").setUnlocalizedName("block_gla_sakejuku_2");

		CIDERBOT_1 = new BlockCider_Bot_1().setRegistryName("block_bot_cider_1").setUnlocalizedName("block_bot_cider_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		CIDERBOT_2 = new BlockCider_Bot_2().setRegistryName("block_bot_cider_2").setUnlocalizedName("block_bot_cider_2");
		CIDERBOT_3 = new BlockCider_Bot_3().setRegistryName("block_bot_cider_3").setUnlocalizedName("block_bot_cider_3");
		CIDERBOT_4 = new BlockCider_Bot_4().setRegistryName("block_bot_cider_4").setUnlocalizedName("block_bot_cider_4");
		CIDERBOT_kara = new BlockSake_Bot_kara().setRegistryName("block_bot_cider_k").setUnlocalizedName("block_bot_cider_k");
		CIDERGLA_1 = new BlockCider_Gla_1().setRegistryName("block_gla_cider_1").setUnlocalizedName("block_gla_cider_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		CIDERGLA_2 = new BlockCider_Gla_2().setRegistryName("block_gla_cider_2").setUnlocalizedName("block_gla_cider_2");
		CIDERGLA_kara = new BlockCider_Gla_k().setRegistryName("block_gla_cider_k").setUnlocalizedName("block_gla_cider_k");

		JUKUCIDERBOT_1 = new BlockCiderJuku_Bot_1().setRegistryName("block_bot_ciderjuku_1").setUnlocalizedName("block_bot_ciderjuku_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		JUKUCIDERBOT_2 = new BlockCiderJuku_Bot_2().setRegistryName("block_bot_ciderjuku_2").setUnlocalizedName("block_bot_ciderjuku_2");
		JUKUCIDERBOT_3 = new BlockCiderJuku_Bot_3().setRegistryName("block_bot_ciderjuku_3").setUnlocalizedName("block_bot_ciderjuku_3");
		JUKUCIDERBOT_4 = new BlockCiderJuku_Bot_4().setRegistryName("block_bot_ciderjuku_4").setUnlocalizedName("block_bot_ciderjuku_4");
		JUKUCIDERBOT_kara = new BlockSake_Bot_kara().setRegistryName("block_bot_ciderjuku_k").setUnlocalizedName("block_bot_ciderjuku_k");
		JUKUCIDERGLA_1 = new BlockCiderJuku_Gla_1().setRegistryName("block_gla_ciderjuku_1").setUnlocalizedName("block_gla_ciderjuku_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		JUKUCIDERGLA_2 = new BlockCiderJuku_Gla_2().setRegistryName("block_gla_ciderjuku_2").setUnlocalizedName("block_gla_ciderjuku_2");

		WINEBOT_1 = new BlockWine_Bot_1().setRegistryName("block_bot_wine_1").setUnlocalizedName("block_bot_wine_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		WINEBOT_2 = new BlockWine_Bot_2().setRegistryName("block_bot_wine_2").setUnlocalizedName("block_bot_wine_2");
		WINEBOT_3 = new BlockWine_Bot_3().setRegistryName("block_bot_wine_3").setUnlocalizedName("block_bot_wine_3");
		WINEBOT_4 = new BlockWine_Bot_4().setRegistryName("block_bot_wine_4").setUnlocalizedName("block_bot_wine_4");
		WINEBOT_kara = new BlockSake_Bot_kara().setRegistryName("block_bot_wine_k").setUnlocalizedName("block_bot_wine_k");
		WINEGLA_1 = new BlockWine_Gla_1().setRegistryName("block_gla_wine_1").setUnlocalizedName("block_gla_wine_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		WINEGLA_2 = new BlockWine_Gla_2().setRegistryName("block_gla_wine_2").setUnlocalizedName("block_gla_wine_2");
		WINEGLA_kara = new BlockWine_Gla_kara().setRegistryName("block_gla_wine_k").setUnlocalizedName("block_gla_wine_k");

		JUKUWINEBOT_1 = new BlockWineJuku_Bot_1().setRegistryName("block_bot_winejuku_1").setUnlocalizedName("block_bot_winejuku_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		JUKUWINEBOT_2 = new BlockWineJuku_Bot_2().setRegistryName("block_bot_winejuku_2").setUnlocalizedName("block_bot_winejuku_2");
		JUKUWINEBOT_3 = new BlockWineJuku_Bot_3().setRegistryName("block_bot_winejuku_3").setUnlocalizedName("block_bot_winejuku_3");
		JUKUWINEBOT_4 = new BlockWineJuku_Bot_4().setRegistryName("block_bot_winejuku_4").setUnlocalizedName("block_bot_winejuku_4");
		JUKUWINEBOT_kara = new BlockSake_Bot_kara().setRegistryName("block_bot_winejuku_k").setUnlocalizedName("block_bot_winejuku_k");
		JUKUWINEGLA_1 = new BlockWineJuku_Gla_1().setRegistryName("block_gla_winejuku_1").setUnlocalizedName("block_gla_winejuku_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		JUKUWINEGLA_2 = new BlockWineJuku_Gla_2().setRegistryName("block_gla_winejuku_2").setUnlocalizedName("block_gla_winejuku_2");

		NABEAMAZAKE_nama = new BlockNabeAmazake_nama().setRegistryName("block_food_nabeaz_n").setUnlocalizedName("block_food_nabeaz_n").setCreativeTab(ChinjufuModTabs.tab_teatime);
		NABEAMAZAKE_boil = new BlockNabeAmazake_boil().setRegistryName("block_food_nabeaz_b").setUnlocalizedName("block_food_nabeaz_b");
		NABEAMAZAKE_1 = new BlockNabeAmazake_1().setRegistryName("block_food_nabeaz_1").setUnlocalizedName("block_food_nabeaz_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		NABEAMAZAKE_2 = new BlockNabeAmazake_2().setRegistryName("block_food_nabeaz_2").setUnlocalizedName("block_food_nabeaz_2");
		NABEAMAZAKE_3 = new BlockNabeAmazake_3().setRegistryName("block_food_nabeaz_3").setUnlocalizedName("block_food_nabeaz_3");
		NABEAMAZAKE_4 = new BlockNabeAmazake_4().setRegistryName("block_food_nabeaz_4").setUnlocalizedName("block_food_nabeaz_4");

		AMAZAKEGLA_1 = new BlockAmazake_Gla_1().setRegistryName("block_gla_amazake_1").setUnlocalizedName("block_gla_amazake_1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		AMAZAKEGLA_2 = new BlockAmazake_Gla_2().setRegistryName("block_gla_amazake_2").setUnlocalizedName("block_gla_amazake_2");
		AMAZAKEGLA_k = new BlockAmazake_Gla_k().setRegistryName("block_gla_amazake_k").setUnlocalizedName("block_gla_amazake_k");

		NABENIMAME_nama = new BlockNabeNimame_nama().setRegistryName("block_food_nabenimame_n").setUnlocalizedName("block_food_nabenimame_n").setCreativeTab(ChinjufuModTabs.tab_teatime);
		NABENIMAME_boil = new BlockNabeNimame_boil().setRegistryName("block_food_nabenimame_b").setUnlocalizedName("block_food_nabenimame_b").setCreativeTab(ChinjufuModTabs.tab_teatime);

	}


	public static void register() {

		registerBlock(KOUBOBIN_full);
		registerBlock(KOUBOBIN_1);

		registerBlock(HAKKOUTARU);

		registerBlock(KOUJITARU_full);
		registerBlock(KOUJITARU_1);

		registerBlock(SHUBOTARU_full);
		registerBlock(SHUBOTARU_1);

		registerBlock(MOROMITARU_full);
		registerBlock(MOROMITARU_1);

		registerBlock(JYUKUSEITARU_full);
		registerBlock(JYUKUSEITARU_1);

		registerBlock(RINGOSHUTARU_full);
		registerBlock(RINGOSHUTARU_1);
		registerBlock(RINGOSHUTARU_2);

		registerBlock(BUDOUSHUTARU_full);
		registerBlock(BUDOUSHUTARU_1);
		registerBlock(BUDOUSHUTARU_2);

		registerBlock(MISOTARU_full);
		registerBlock(MISOTARU_1);

		registerBlock(KOUCHASAN_full);
		registerBlock(KOUCHASAN_1);

		registerBlock(NAMASAKEBOT_full);
		registerBlock(NAMASAKEBOT_2);
		registerBlock(NAMASAKEBOT_3);
		registerBlock(NAMASAKEBOT_4);
		registerBlock(NAMASAKEBOT_kara);
		registerBlock(NAMASAKEGLA_1);
		registerBlock(NAMASAKEGLA_2);
		registerBlock(NAMASAKEGLA_kara);

		registerBlock(SHINSAKEBOT_1);
		registerBlock(SHINSAKEBOT_2);
		registerBlock(SHINSAKEBOT_3);
		registerBlock(SHINSAKEBOT_4);
		registerBlock(SHINSAKEBOT_kara);
		registerBlock(SHINSAKEGLA_1);
		registerBlock(SHINSAKEGLA_2);

		registerBlock(JUKUSAKEBOT_1);
		registerBlock(JUKUSAKEBOT_2);
		registerBlock(JUKUSAKEBOT_3);
		registerBlock(JUKUSAKEBOT_4);
		registerBlock(JUKUSAKEBOT_kara);
		registerBlock(JUKUSAKEGLA_1);
		registerBlock(JUKUSAKEGLA_2);

		registerBlock(CIDERBOT_1);
		registerBlock(CIDERBOT_2);
		registerBlock(CIDERBOT_3);
		registerBlock(CIDERBOT_4);
		registerBlock(CIDERBOT_kara);
		registerBlock(CIDERGLA_1);
		registerBlock(CIDERGLA_2);
		registerBlock(CIDERGLA_kara);

		registerBlock(JUKUCIDERBOT_1);
		registerBlock(JUKUCIDERBOT_2);
		registerBlock(JUKUCIDERBOT_3);
		registerBlock(JUKUCIDERBOT_4);
		registerBlock(JUKUCIDERBOT_kara);
		registerBlock(JUKUCIDERGLA_1);
		registerBlock(JUKUCIDERGLA_2);

		registerBlock(WINEBOT_1);
		registerBlock(WINEBOT_2);
		registerBlock(WINEBOT_3);
		registerBlock(WINEBOT_4);
		registerBlock(WINEBOT_kara);
		registerBlock(WINEGLA_1);
		registerBlock(WINEGLA_2);
		registerBlock(WINEGLA_kara);

		registerBlock(JUKUWINEBOT_1);
		registerBlock(JUKUWINEBOT_2);
		registerBlock(JUKUWINEBOT_3);
		registerBlock(JUKUWINEBOT_4);
		registerBlock(JUKUWINEBOT_kara);
		registerBlock(JUKUWINEGLA_1);
		registerBlock(JUKUWINEGLA_2);

		registerBlock(NABEAMAZAKE_nama);
		registerBlock(NABEAMAZAKE_boil);
		registerBlock(NABEAMAZAKE_1);
		registerBlock(NABEAMAZAKE_2);
		registerBlock(NABEAMAZAKE_3);
		registerBlock(NABEAMAZAKE_4);

		registerBlock(AMAZAKEGLA_1);
		registerBlock(AMAZAKEGLA_2);
		registerBlock(AMAZAKEGLA_k);

		registerBlock(NABENIMAME_nama);
		registerBlock(NABENIMAME_boil);

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

		registerRender(KOUBOBIN_full);

		registerRender(HAKKOUTARU);

		registerRender(KOUJITARU_full);

		registerRender(SHUBOTARU_full);

		registerRender(MOROMITARU_full);

		registerRender(JYUKUSEITARU_full);

		registerRender(RINGOSHUTARU_full);

		registerRender(BUDOUSHUTARU_full);

		registerRender(MISOTARU_full);

		registerRender(KOUCHASAN_full);

		registerRender(NAMASAKEBOT_full);
		registerRender(NAMASAKEGLA_1);
		registerRender(NAMASAKEGLA_kara);

		registerRender(SHINSAKEBOT_1);
		registerRender(SHINSAKEGLA_1);

		registerRender(JUKUSAKEBOT_1);
		registerRender(JUKUSAKEGLA_1);

		registerRender(CIDERBOT_1);
		registerRender(CIDERGLA_1);
		registerRender(CIDERGLA_kara);

		registerRender(JUKUCIDERBOT_1);
		registerRender(JUKUCIDERGLA_1);

		registerRender(WINEBOT_1);
		registerRender(WINEGLA_1);
		registerRender(WINEGLA_kara);

		registerRender(JUKUWINEBOT_1);
		registerRender(JUKUWINEGLA_1);

		registerRender(NABEAMAZAKE_nama);
		registerRender(NABEAMAZAKE_1);

		registerRender(AMAZAKEGLA_1);

		registerRender(NABENIMAME_nama);
		registerRender(NABENIMAME_boil);
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

			ASDecoModHakkou.init();
			ASDecoModHakkou.register();
			BLOCKS.stream().forEach(block -> event.getRegistry().register(block));
		}
	}
}
