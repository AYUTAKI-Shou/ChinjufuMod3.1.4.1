package com.ayutaki.chinjufumod.init;

import java.util.LinkedList;
import java.util.List;

import com.ayutaki.chinjufumod.init.items.ItemChawan;
import com.ayutaki.chinjufumod.init.items.ItemClay_Chawan;
import com.ayutaki.chinjufumod.init.items.ItemClay_Kyusu;
import com.ayutaki.chinjufumod.init.items.ItemClay_Nabe;
import com.ayutaki.chinjufumod.init.items.ItemClay_Sara;
import com.ayutaki.chinjufumod.init.items.ItemClay_TCup;
import com.ayutaki.chinjufumod.init.items.ItemClay_TPot;
import com.ayutaki.chinjufumod.init.items.ItemClay_Tonsui;
import com.ayutaki.chinjufumod.init.items.ItemKettles_boil;
import com.ayutaki.chinjufumod.init.items.ItemKettles_kara;
import com.ayutaki.chinjufumod.init.items.ItemKiji_Bun;
import com.ayutaki.chinjufumod.init.items.ItemKiji_Burg;
import com.ayutaki.chinjufumod.init.items.ItemKiji_Scone;
import com.ayutaki.chinjufumod.init.items.ItemKiji_Senbei;
import com.ayutaki.chinjufumod.init.items.ItemKomekouji;
import com.ayutaki.chinjufumod.init.items.ItemKoubo;
import com.ayutaki.chinjufumod.init.items.ItemMatch;
import com.ayutaki.chinjufumod.init.items.ItemMoromi;
import com.ayutaki.chinjufumod.init.items.ItemMushigome;
import com.ayutaki.chinjufumod.init.items.ItemNigari;
import com.ayutaki.chinjufumod.init.items.ItemNimame;
import com.ayutaki.chinjufumod.init.items.ItemSakekasu;
import com.ayutaki.chinjufumod.init.items.ItemSeikeiYunomi;
import com.ayutaki.chinjufumod.init.items.ItemShikki;
import com.ayutaki.chinjufumod.init.items.ItemShubo;
import com.ayutaki.chinjufumod.init.items.ItemTonsui;
import com.ayutaki.chinjufumod.init.items.ItemYunomi;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class TTimeItems {

	public static Item CHABA_GREEN, CHABA_RED;
	public static Item TUMICHABA;

	public static Item SHIO, NIGARI, SAKEKASU;
	public static Item KOUBO, MUSHIGOME, KOMEKOUJI, SHUBO, MORO;

	public static Item NIMAME, MISO;

	public static Item INE, KOME, SAYA, SOY, KOMUGI, BUTTER;

	public static Item KIJI_BUN, KIJI_BURG, KIJI_SCONE, KIJI_SENBEI, PASTA_nama, PASTA_sara;

	public static Item Item_MATCH;

	public static Item Item_YAKAN_kara, Item_YAKAN_boil;
	public static Item Item_SARA, Item_CHAWAN, Item_SHIKKI, Item_TONSUI;
	public static Item Item_YUNOMI, Item_TCUP, Item_DRINKGLASS, Item_SAKEBOTTLE;

	public static Item CLAY_YUNOMI, CLAY_KYUSU, CLAY_SARA, CLAY_CHAWAN,
						 CLAY_TCUP, CLAY_TPOT, CLAY_NABE, CLAY_TONSUI;

	public static Item SEEDS_CABE, SEEDS_HAKUSAI, SEEDS_CORN, SEEDS_ONION, SEEDS_RICE,
						SEEDS_SOY, SEEDS_SPINACH, SEEDS_TOMATO;

	public static Item ALUMINUM;

	public static void init() {

		/*茶葉*/
		CHABA_GREEN = new Item().setRegistryName("item_chaba_green").setUnlocalizedName("item_chaba_green").setCreativeTab(ChinjufuModTabs.tab_teatime);
		CHABA_RED = new Item().setRegistryName("item_chaba_red").setUnlocalizedName("item_chaba_red").setCreativeTab(ChinjufuModTabs.tab_teatime);
		TUMICHABA = new Item().setRegistryName("item_chaba").setUnlocalizedName("item_chaba").setCreativeTab(ChinjufuModTabs.tab_teatime);

		/*発酵*/
		SHIO = new Item().setRegistryName("item_salt").setUnlocalizedName("item_salt").setCreativeTab(ChinjufuModTabs.tab_teatime);
		NIGARI = new ItemNigari().setRegistryName("item_nigari").setUnlocalizedName("item_nigari").setCreativeTab(ChinjufuModTabs.tab_teatime);
		SAKEKASU = new ItemSakekasu().setRegistryName("item_sakekasu").setUnlocalizedName("item_sakekasu").setCreativeTab(ChinjufuModTabs.tab_teatime);

		KOUBO = new ItemKoubo().setRegistryName("item_koubo").setUnlocalizedName("item_koubo").setCreativeTab(ChinjufuModTabs.tab_teatime);
		MUSHIGOME = new ItemMushigome().setRegistryName("item_mushigome").setUnlocalizedName("item_mushigome").setCreativeTab(ChinjufuModTabs.tab_teatime);
		KOMEKOUJI = new ItemKomekouji().setRegistryName("item_komekouji").setUnlocalizedName("item_komekouji").setCreativeTab(ChinjufuModTabs.tab_teatime);
		SHUBO = new ItemShubo().setRegistryName("item_shubo").setUnlocalizedName("item_shubo").setCreativeTab(ChinjufuModTabs.tab_teatime);
		MORO = new ItemMoromi().setRegistryName("item_moromi").setUnlocalizedName("item_moromi").setCreativeTab(ChinjufuModTabs.tab_teatime);

		NIMAME = new ItemNimame().setRegistryName("item_nimame").setUnlocalizedName("item_nimame").setCreativeTab(ChinjufuModTabs.tab_teatime);
		MISO = new Item().setRegistryName("item_miso").setUnlocalizedName("item_miso").setCreativeTab(ChinjufuModTabs.tab_teatime);

		INE = new Item().setRegistryName("item_ine").setUnlocalizedName("item_ine").setCreativeTab(ChinjufuModTabs.tab_teatime);
		KOME = new Item().setRegistryName("item_kome").setUnlocalizedName("item_kome").setCreativeTab(ChinjufuModTabs.tab_teatime);
		SAYA = new Item().setRegistryName("item_saya").setUnlocalizedName("item_saya").setCreativeTab(ChinjufuModTabs.tab_teatime);
		SOY = new Item().setRegistryName("item_soy").setUnlocalizedName("item_soy").setCreativeTab(ChinjufuModTabs.tab_teatime);
		KOMUGI = new Item().setRegistryName("item_flour").setUnlocalizedName("item_flour").setCreativeTab(ChinjufuModTabs.tab_teatime);
		BUTTER = new Item().setRegistryName("item_butter").setUnlocalizedName("item_butter").setCreativeTab(ChinjufuModTabs.tab_teatime);

		KIJI_BUN = new ItemKiji_Bun().setRegistryName("item_kiji_bun").setUnlocalizedName("item_kiji_bun").setCreativeTab(ChinjufuModTabs.tab_teatime);
		KIJI_BURG = new ItemKiji_Burg().setRegistryName("item_kiji_burg").setUnlocalizedName("item_kiji_burg").setCreativeTab(ChinjufuModTabs.tab_teatime);
		KIJI_SCONE = new ItemKiji_Scone().setRegistryName("item_kiji_scone").setUnlocalizedName("item_kiji_scone").setCreativeTab(ChinjufuModTabs.tab_teatime);
		KIJI_SENBEI = new ItemKiji_Senbei().setRegistryName("item_kiji_senbei").setUnlocalizedName("item_kiji_senbei").setCreativeTab(ChinjufuModTabs.tab_teatime);
		PASTA_nama = new Item().setRegistryName("item_food_pasta_n").setUnlocalizedName("item_food_pasta_n").setCreativeTab(ChinjufuModTabs.tab_teatime);
		PASTA_sara = new Item().setRegistryName("item_food_pasta_s").setUnlocalizedName("item_food_pasta_s").setCreativeTab(ChinjufuModTabs.tab_teatime);

		Item_MATCH = new ItemMatch().setRegistryName("item_match_cm").setUnlocalizedName("item_match_cm").setCreativeTab(ChinjufuModTabs.tab_teatime);

		Item_YAKAN_kara = new ItemKettles_kara().setRegistryName("item_kettles_kara").setUnlocalizedName("item_kettles_kara").setCreativeTab(ChinjufuModTabs.tab_teatime);
		Item_YAKAN_boil = new ItemKettles_boil().setRegistryName("item_kettles_boil").setUnlocalizedName("item_kettles_boil").setCreativeTab(ChinjufuModTabs.tab_teatime);

		Item_SARA = new Item().setRegistryName("item_food_sara").setUnlocalizedName("item_food_sara").setCreativeTab(ChinjufuModTabs.tab_teatime);
		Item_CHAWAN = new ItemChawan().setRegistryName("item_food_chawan").setUnlocalizedName("item_food_chawan").setCreativeTab(ChinjufuModTabs.tab_teatime);
		Item_SHIKKI = new ItemShikki().setRegistryName("item_food_shikki").setUnlocalizedName("item_food_shikki").setCreativeTab(ChinjufuModTabs.tab_teatime);
		Item_TONSUI = new ItemTonsui().setRegistryName("item_food_tonsui").setUnlocalizedName("item_food_tonsui").setCreativeTab(ChinjufuModTabs.tab_teatime);
		Item_YUNOMI = new ItemYunomi().setRegistryName("item_food_yunomi").setUnlocalizedName("item_food_yunomi").setCreativeTab(ChinjufuModTabs.tab_teatime);
		Item_TCUP = new Item().setRegistryName("item_food_teacup").setUnlocalizedName("item_food_teacup").setCreativeTab(ChinjufuModTabs.tab_teatime);
		Item_DRINKGLASS = new Item().setRegistryName("item_food_driglass").setUnlocalizedName("item_food_driglass").setCreativeTab(ChinjufuModTabs.tab_teatime);
		Item_SAKEBOTTLE = new Item().setRegistryName("item_food_sakebot").setUnlocalizedName("item_food_sakebot").setCreativeTab(ChinjufuModTabs.tab_teatime);

		CLAY_YUNOMI = new ItemSeikeiYunomi().setRegistryName("item_seikeiyunomi").setUnlocalizedName("item_seikeiyunomi").setCreativeTab(ChinjufuModTabs.tab_teatime);
		CLAY_KYUSU = new ItemClay_Kyusu().setRegistryName("item_clay_kyusu").setUnlocalizedName("item_clay_kyusu").setCreativeTab(ChinjufuModTabs.tab_teatime);
		CLAY_TCUP = new ItemClay_TCup().setRegistryName("item_clay_teacup").setUnlocalizedName("item_clay_teacup").setCreativeTab(ChinjufuModTabs.tab_teatime);
		CLAY_TPOT = new ItemClay_TPot().setRegistryName("item_clay_teapot").setUnlocalizedName("item_clay_teapot").setCreativeTab(ChinjufuModTabs.tab_teatime);
		CLAY_SARA = new ItemClay_Sara().setRegistryName("item_clay_sara").setUnlocalizedName("item_clay_sara").setCreativeTab(ChinjufuModTabs.tab_teatime);
		CLAY_CHAWAN = new ItemClay_Chawan().setRegistryName("item_clay_chawan").setUnlocalizedName("item_clay_chawan").setCreativeTab(ChinjufuModTabs.tab_teatime);
		CLAY_NABE = new ItemClay_Nabe().setRegistryName("item_clay_nabe").setUnlocalizedName("item_clay_nabe").setCreativeTab(ChinjufuModTabs.tab_teatime);
		CLAY_TONSUI = new ItemClay_Tonsui().setRegistryName("item_clay_tonsui").setUnlocalizedName("item_clay_tonsui").setCreativeTab(ChinjufuModTabs.tab_teatime);

		SEEDS_CABE = new ItemSeeds(TTimePlants.CABBAGE, Blocks.FARMLAND).setRegistryName("item_seeds_cabbage").setUnlocalizedName("item_seeds_cabbage").setCreativeTab(ChinjufuModTabs.tab_teatime);
		SEEDS_HAKUSAI = new ItemSeeds(TTimePlants.HAKUSAI, Blocks.FARMLAND).setRegistryName("item_seeds_hakusai").setUnlocalizedName("item_seeds_hakusai").setCreativeTab(ChinjufuModTabs.tab_teatime);
		SEEDS_CORN = new ItemSeeds(TTimePlants.CORN, Blocks.FARMLAND).setRegistryName("item_seeds_corn").setUnlocalizedName("item_seeds_corn").setCreativeTab(ChinjufuModTabs.tab_teatime);
		SEEDS_ONION = new ItemSeeds(TTimePlants.ONION, Blocks.FARMLAND).setRegistryName("item_seeds_onion").setUnlocalizedName("item_seeds_onion").setCreativeTab(ChinjufuModTabs.tab_teatime);
		SEEDS_RICE = new ItemSeeds(TTimePlants.RICE, Blocks.FARMLAND).setRegistryName("item_seeds_rice").setUnlocalizedName("item_seeds_rice").setCreativeTab(ChinjufuModTabs.tab_teatime);
		SEEDS_SOY = new ItemSeeds(TTimePlants.SOY, Blocks.FARMLAND).setRegistryName("item_seeds_soy").setUnlocalizedName("item_seeds_soy").setCreativeTab(ChinjufuModTabs.tab_teatime);
		SEEDS_SPINACH = new ItemSeeds(TTimePlants.SPINACH, Blocks.FARMLAND).setRegistryName("item_seeds_spinach").setUnlocalizedName("item_seeds_spinach").setCreativeTab(ChinjufuModTabs.tab_teatime);
		SEEDS_TOMATO = new ItemSeeds(TTimePlants.TOMATO, Blocks.FARMLAND).setRegistryName("item_seeds_tomato").setUnlocalizedName("item_seeds_tomato").setCreativeTab(ChinjufuModTabs.tab_teatime);

		ALUMINUM = new Item().setRegistryName("item_ingot_alumi").setUnlocalizedName("item_ingot_alumi").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

	}

	public static void register() {
		registerItem(CHABA_GREEN);
		registerItem(CHABA_RED);
		registerItem(TUMICHABA);

		registerItem(SHIO);
		registerItem(NIGARI);
		registerItem(SAKEKASU);

		registerItem(KOUBO);
		registerItem(MUSHIGOME);
		registerItem(KOMEKOUJI);
		registerItem(SHUBO);
		registerItem(MORO);

		registerItem(NIMAME);
		registerItem(MISO);

		registerItem(INE);
		registerItem(KOME);
		registerItem(SAYA);
		registerItem(SOY);
		registerItem(KOMUGI);
		registerItem(BUTTER);

		registerItem(KIJI_BUN);
		registerItem(KIJI_BURG);
		registerItem(KIJI_SCONE);
		registerItem(KIJI_SENBEI);
		registerItem(PASTA_nama);
		registerItem(PASTA_sara);

		registerItem(Item_MATCH);

		registerItem(Item_YAKAN_kara);
		registerItem(Item_YAKAN_boil);

		registerItem(Item_SARA);
		registerItem(Item_CHAWAN);
		registerItem(Item_SHIKKI);
		registerItem(Item_TONSUI);
		registerItem(Item_YUNOMI);
		registerItem(Item_TCUP);
		registerItem(Item_DRINKGLASS);
		registerItem(Item_SAKEBOTTLE);

		registerItem(CLAY_YUNOMI);
		registerItem(CLAY_KYUSU);
		registerItem(CLAY_TCUP);
		registerItem(CLAY_TPOT);
		registerItem(CLAY_SARA);
		registerItem(CLAY_CHAWAN);
		registerItem(CLAY_NABE);
		registerItem(CLAY_TONSUI);

		registerItem(SEEDS_CABE);
		registerItem(SEEDS_HAKUSAI);
		registerItem(SEEDS_CORN);
		registerItem(SEEDS_ONION);
		registerItem(SEEDS_RICE);
		registerItem(SEEDS_SOY);
		registerItem(SEEDS_SPINACH);
		registerItem(SEEDS_TOMATO);

		registerItem(ALUMINUM);

	}


	public static void registerItem(Item item) {
		RegistrationHandler.ITEMS.add(item);
	}

	public static void registerRenders() {

		registerRender(CHABA_GREEN);
		registerRender(CHABA_RED);
		registerRender(TUMICHABA);

		registerRender(SHIO);
		registerRender(NIGARI);
		registerRender(SAKEKASU);

		registerRender(KOUBO);
		registerRender(MUSHIGOME);
		registerRender(KOMEKOUJI);
		registerRender(SHUBO);
		registerRender(MORO);

		registerRender(NIMAME);
		registerRender(MISO);

		registerRender(INE);
		registerRender(KOME);
		registerRender(SAYA);
		registerRender(SOY);
		registerRender(KOMUGI);
		registerRender(BUTTER);

		registerRender(KIJI_BUN);
		registerRender(KIJI_BURG);
		registerRender(KIJI_SCONE);
		registerRender(KIJI_SENBEI);
		registerRender(PASTA_nama);
		registerRender(PASTA_sara);

		registerRender(Item_MATCH);

		registerRender(Item_YAKAN_kara);
		registerRender(Item_YAKAN_boil);

		registerRender(Item_SARA);
		registerRender(Item_CHAWAN);
		registerRender(Item_SHIKKI);
		registerRender(Item_TONSUI);
		registerRender(Item_YUNOMI);
		registerRender(Item_TCUP);
		registerRender(Item_DRINKGLASS);
		registerRender(Item_SAKEBOTTLE);

		registerRender(CLAY_YUNOMI);
		registerRender(CLAY_KYUSU);
		registerRender(CLAY_TCUP);
		registerRender(CLAY_TPOT);
		registerRender(CLAY_SARA);
		registerRender(CLAY_CHAWAN);
		registerRender(CLAY_NABE);
		registerRender(CLAY_TONSUI);

		registerRender(SEEDS_CABE);
		registerRender(SEEDS_HAKUSAI);
		registerRender(SEEDS_CORN);
		registerRender(SEEDS_ONION);
		registerRender(SEEDS_RICE);
		registerRender(SEEDS_SOY);
		registerRender(SEEDS_SPINACH);
		registerRender(SEEDS_TOMATO);

		registerRender(ALUMINUM);

	}

	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}

	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	public static class RegistrationHandler {

		public static final List<Item> ITEMS = new LinkedList<>();

		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {

			TTimeItems.init();
			TTimeItems.register();
			ITEMS.stream().forEach(item -> event.getRegistry().register(item));
		}
	}
}
