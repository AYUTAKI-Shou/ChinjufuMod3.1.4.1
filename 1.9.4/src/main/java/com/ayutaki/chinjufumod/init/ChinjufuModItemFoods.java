package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.items.ItemModFood;
import com.ayutaki.chinjufumod.init.items.ItemSenbei;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ChinjufuModItemFoods {

	public static Item CAKE, BUN, SCONE, SENBEI, TOUFU;
	public static Item CHICKENSAND, EGGSAND;

	public static Item FOOD_CABBAGE, FOOD_HAKUSAI, FOOD_CORN, FOOD_ONION, FOOD_SPINACH,
						FOOD_TOMATO, FOOD_GRAPE, FOOD_CORN_B;


	public static void init() {

		/*バニラの食料
        registerItem(260, "apple", (new ItemFood(4, 0.3F, false)).setUnlocalizedName("apple"));
		registerItem(391, "carrot", (new ItemSeedFood(3, 0.6F, Blocks.CARROTS, Blocks.FARMLAND)).setUnlocalizedName("carrots"));

        registerItem(392, "potato", (new ItemSeedFood(1, 0.3F, Blocks.POTATOES, Blocks.FARMLAND)).setUnlocalizedName("potato"));
        registerItem(393, "baked_potato", (new ItemFood(5, 0.6F, false)).setUnlocalizedName("potatoBaked"));

        registerItem(297, "bread", (new ItemFood(5, 0.6F, false)).setUnlocalizedName("bread"));
		5＝肉メモリ2.5個分
        registerItem(364, "cooked_beef", (new ItemFood(8, 0.8F, true)).setUnlocalizedName("beefCooked"));
        registerItem(366, "cooked_chicken", (new ItemFood(6, 0.6F, true)).setUnlocalizedName("chickenCooked"));*/

		CAKE = new ItemModFood("item_food_cake", 5, 0.6F, false).setCreativeTab(ChinjufuModTabs.tab_teatime);
		BUN = new ItemModFood("item_food_bun", 6, 0.6F, false).setCreativeTab(ChinjufuModTabs.tab_teatime);
		SCONE = new ItemModFood("item_food_scone", 4, 0.6F, false).setCreativeTab(ChinjufuModTabs.tab_teatime);
		SENBEI = new ItemSenbei(4, 0.6F, false).setCreativeTab(ChinjufuModTabs.tab_teatime);
		TOUFU = new ItemModFood("item_food_toufu", 4, 0.6F, false).setCreativeTab(ChinjufuModTabs.tab_teatime);

		CHICKENSAND = new ItemModFood("item_food_chickensand", 6, 0.6F, false).setCreativeTab(ChinjufuModTabs.tab_teatime);
		EGGSAND = new ItemModFood("item_food_eggsand", 6, 0.6F, false).setCreativeTab(ChinjufuModTabs.tab_teatime);

		FOOD_CABBAGE = new ItemModFood("item_food_cabbage", 2, 0.3F, false).setCreativeTab(ChinjufuModTabs.tab_teatime);
		FOOD_HAKUSAI = new ItemModFood("item_food_hakusai", 2, 0.3F, false).setCreativeTab(ChinjufuModTabs.tab_teatime);
		FOOD_CORN = new ItemModFood("item_food_corn", 1, 0.3F, false).setCreativeTab(ChinjufuModTabs.tab_teatime);
		FOOD_GRAPE = new ItemModFood("item_food_grape", 1, 0.3F, false).setCreativeTab(ChinjufuModTabs.tab_teatime);
		FOOD_ONION = new ItemModFood("item_food_onion", 1, 0.3F, false).setCreativeTab(ChinjufuModTabs.tab_teatime);
		FOOD_SPINACH = new ItemModFood("item_food_spinach", 1, 0.3F, false).setCreativeTab(ChinjufuModTabs.tab_teatime);
		FOOD_TOMATO = new ItemModFood("item_food_tomato", 1, 0.3F, false).setCreativeTab(ChinjufuModTabs.tab_teatime);

		FOOD_CORN_B = new ItemModFood("item_food_cornb", 5, 0.6F, false).setCreativeTab(ChinjufuModTabs.tab_teatime);
	}


	public static void register() {

		registerItem(CAKE);
		registerItem(BUN);
		registerItem(SCONE);
		registerItem(SENBEI);
		registerItem(TOUFU);

		registerItem(CHICKENSAND);
		registerItem(EGGSAND);

		registerItem(FOOD_CABBAGE);
		registerItem(FOOD_HAKUSAI);
		registerItem(FOOD_CORN);
		registerItem(FOOD_ONION);
		registerItem(FOOD_SPINACH);
		registerItem(FOOD_TOMATO);
		registerItem(FOOD_GRAPE);

		registerItem(FOOD_CORN_B);


	}

	public static void registerItem(Item item) {
		GameRegistry.register(item);
	}


	public static void registerRenders() {

		registerRender(CAKE);
		registerRender(BUN);
		registerRender(SCONE);
		registerRender(SENBEI);
		registerRender(TOUFU);

		registerRender(CHICKENSAND);
		registerRender(EGGSAND);

		registerRender(FOOD_CABBAGE);
		registerRender(FOOD_HAKUSAI);
		registerRender(FOOD_CORN);
		registerRender(FOOD_ONION);
		registerRender(FOOD_SPINACH);
		registerRender(FOOD_TOMATO);
		registerRender(FOOD_GRAPE);

		registerRender(FOOD_CORN_B);

	}

	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
