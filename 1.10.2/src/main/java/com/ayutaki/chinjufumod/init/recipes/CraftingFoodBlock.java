package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ChinjufuModFoodBlocks;
import com.ayutaki.chinjufumod.init.ChinjufuModItemFoods;
import com.ayutaki.chinjufumod.init.TTimeItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class CraftingFoodBlock {

	public CraftingFoodBlock() {
		register();
	}

	public static void register() {

		/*アイテムのやかん*/
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TTimeItems.Item_YAKAN_kara, 1),
				"xxx",
				"#xx",
				'x', "ingotAluminium"));

		/*水入りやかん*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.KETTLE_full, 1),
				new ItemStack(TTimeItems.Item_YAKAN_kara, 1),new ItemStack(Items.WATER_BUCKET, 1));

		/*塩作り→海水を想定してシンクからは不可*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.NABESHIO_nama, 1),
				new ItemStack(ChinjufuModFoodBlocks.NABE_kara, 1),new ItemStack(Items.WATER_BUCKET, 1));

		/*豆腐鍋*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.NABETOUFU_nama, 1),
				new ItemStack(ChinjufuModFoodBlocks.NABE_kara, 1),new ItemStack(Items.WATER_BUCKET, 1),
				new ItemStack(TTimeItems.NIMAME, 1), new ItemStack(TTimeItems.NIGARI, 1));

		/*とり鍋*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.NABE_nama, 1),
				new ItemStack(ChinjufuModFoodBlocks.NABE_kara, 1),new ItemStack(Items.WATER_BUCKET, 1),
				new ItemStack(Items.CHICKEN, 1), new ItemStack(Items.CARROT, 1),
				new ItemStack(Blocks.BROWN_MUSHROOM, 1), new ItemStack(Blocks.BROWN_MUSHROOM, 1),
				new ItemStack(ChinjufuModItemFoods.FOOD_HAKUSAI, 1), new ItemStack(TTimeItems.MISO, 1));

		/*ごはん鍋*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.NABEGOHAN_nama, 1),
				new ItemStack(ChinjufuModFoodBlocks.NABE_kara, 1),new ItemStack(Items.WATER_BUCKET, 1),
				new ItemStack(TTimeItems.KOME, 1), new ItemStack(TTimeItems.KOME, 1),
				new ItemStack(TTimeItems.KOME, 1), new ItemStack(TTimeItems.KOME, 1));

		/*味噌汁*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.NABEMISO_nama, 1),
				new ItemStack(ChinjufuModFoodBlocks.NABE_kara, 1),new ItemStack(Items.WATER_BUCKET, 1),
				new ItemStack(TTimeItems.MISO, 1),
				new ItemStack(ChinjufuModItemFoods.TOUFU, 1), new ItemStack(ChinjufuModItemFoods.TOUFU, 1));

		/*コーンポタージュ*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.NABECORNS_nama, 1),
				new ItemStack(ChinjufuModFoodBlocks.NABE_kara, 1), new ItemStack(Items.MILK_BUCKET, 1),
				new ItemStack(TTimeItems.BUTTER, 1),
				new ItemStack(ChinjufuModItemFoods.FOOD_CORN, 1), new ItemStack(TTimeItems.SHIO, 1));

		/*フライパン*/
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ChinjufuModFoodBlocks.FRYPAN, 1),
				"xx#",
				"xx#",
				"##y",
				'x', "ingotAluminium",
				'y', new ItemStack(Items.STICK)));

		/*玉子焼きフライパン*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.TAMAGOYAKI_nama, 1),
				new ItemStack(ChinjufuModFoodBlocks.FRYPAN, 1),
				new ItemStack(Items.EGG, 1), new ItemStack(Items.EGG, 1), new ItemStack(Items.EGG, 1));

		/*玉子焼き定食*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.TAMAGOYAKITEI_1, 1),
				new ItemStack(ChinjufuModFoodBlocks.GOHAN_1, 1), new ItemStack(ChinjufuModFoodBlocks.MISOSOUP_1, 1),
				new ItemStack(ChinjufuModFoodBlocks.TAMAGOYAKI_1, 1), new ItemStack(ChinjufuModFoodBlocks.JPTEACUP_1, 1));

		/*焼き魚定食*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.YAKIZAKANATEI_1, 1),
				new ItemStack(ChinjufuModFoodBlocks.GOHAN_1, 1), new ItemStack(ChinjufuModFoodBlocks.MISOSOUP_1, 1),
				new ItemStack(TTimeItems.Item_SARA, 1), new ItemStack(Items.COOKED_FISH, 1),
				new ItemStack(ChinjufuModFoodBlocks.JPTEACUP_1, 1));

		/*エッグバーグフライパン*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.EGGBURG_nama, 1),
				new ItemStack(ChinjufuModFoodBlocks.FRYPAN, 1),
				new ItemStack(TTimeItems.KIJI_BURG, 1), new ItemStack(Items.EGG, 1), new ItemStack(Items.EGG, 1));

		/*エッグバーグセット*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.EGGBURGSET_1, 1),
				new ItemStack(ChinjufuModFoodBlocks.EGGBURG_1, 1), new ItemStack(ChinjufuModItemFoods.BUN, 1),
				new ItemStack(ChinjufuModFoodBlocks.CORNSOUP_1, 1), new ItemStack(TTimeItems.Item_SARA, 1),
				new ItemStack(Items.CARROT, 1), new ItemStack(ChinjufuModItemFoods.FOOD_SPINACH, 1),
				new ItemStack(ChinjufuModItemFoods.FOOD_CABBAGE, 1), new ItemStack(ChinjufuModItemFoods.FOOD_TOMATO, 1),
				new ItemStack(TTimeItems.Item_SARA, 1));

		/*寸胴*/
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ChinjufuModFoodBlocks.ZUNDOU, 1),
				"x#x",
				"x#x",
				"xxx",
				'x', "ingotAluminium"));

		/*カレー鍋*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.CURRYNABE_nama, 1),
				new ItemStack(ChinjufuModFoodBlocks.ZUNDOU, 1), new ItemStack(Items.WATER_BUCKET, 1),
				new ItemStack(Items.BEEF, 1), new ItemStack(Items.CARROT, 1),
				new ItemStack(Items.POTATO, 1), new ItemStack(ChinjufuModItemFoods.FOOD_ONION, 1));

		/*カレーセット*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.CURRYSET_1, 1),
				new ItemStack(ChinjufuModFoodBlocks.CURRY_1, 1),
				new ItemStack(Items.CARROT, 1), new ItemStack(ChinjufuModItemFoods.FOOD_CABBAGE, 1),
				new ItemStack(ChinjufuModItemFoods.FOOD_TOMATO, 1), new ItemStack(TTimeItems.Item_SARA, 1));

		/*丸焼きチキン*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.CHICKEN_1, 1),
				new ItemStack(Items.COOKED_CHICKEN, 1), new ItemStack(ChinjufuModItemFoods.FOOD_CABBAGE, 1),
				new ItemStack(ChinjufuModItemFoods.FOOD_TOMATO, 1), new ItemStack(ChinjufuModItemFoods.FOOD_SPINACH, 1),
				new ItemStack(Items.CARROT, 1), new ItemStack(TTimeItems.Item_SARA, 1));

		/*ティースタンド*/
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ChinjufuModFoodBlocks.SCONESET_k, 1),
				"yx#",
				"xxx",
				"yx#",
				'x', "ingotAluminium",
				'y', new ItemStack(TTimeItems.Item_SARA)));

		/*ケーキ2*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModItemFoods.CAKE, 4),
				new ItemStack(ChinjufuModItemFoods.SCONE, 1), new ItemStack(ChinjufuModItemFoods.SCONE, 1),
				new ItemStack(ChinjufuModItemFoods.SCONE, 1), new ItemStack(ChinjufuModItemFoods.SCONE, 1),
				new ItemStack(Items.MILK_BUCKET, 1), new ItemStack(Items.SUGAR, 1));

		/*チキンサンド*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModItemFoods.CHICKENSAND, 4),
				new ItemStack(ChinjufuModItemFoods.BUN, 1), new ItemStack(ChinjufuModItemFoods.BUN, 1),
				new ItemStack(ChinjufuModItemFoods.FOOD_CABBAGE, 1),
				new ItemStack(Items.COOKED_CHICKEN, 1));

		/*エッグサンド*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModItemFoods.EGGSAND, 4),
				new ItemStack(ChinjufuModItemFoods.BUN, 1), new ItemStack(ChinjufuModItemFoods.BUN, 1),
				new ItemStack(Items.EGG, 1), new ItemStack(Items.EGG, 1));

		/*スコーンセット*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.SCONESET_1, 1),
				new ItemStack(ChinjufuModFoodBlocks.SCONESET_k, 1),
				new ItemStack(ChinjufuModItemFoods.CHICKENSAND, 1), new ItemStack(ChinjufuModItemFoods.CHICKENSAND, 1),
				new ItemStack(ChinjufuModItemFoods.EGGSAND, 1), new ItemStack(ChinjufuModItemFoods.EGGSAND, 1),
				new ItemStack(ChinjufuModItemFoods.SCONE, 1), new ItemStack(ChinjufuModItemFoods.SCONE, 1),
				new ItemStack(ChinjufuModItemFoods.CAKE, 1), new ItemStack(ChinjufuModItemFoods.CAKE, 1));

		/*紅茶入りティーポット*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.TEAPOT_1, 1),
				new ItemStack(ChinjufuModFoodBlocks.TEAPOT_kara, 1), new ItemStack(TTimeItems.Item_YAKAN_boil, 1),
				new ItemStack(TTimeItems.CHABA_RED, 1),new ItemStack(TTimeItems.CHABA_RED, 1));

		/*ティーセット*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.TEASET_1, 1),
				new ItemStack(ChinjufuModFoodBlocks.TEACUP_1, 1), new ItemStack(TTimeItems.Item_SARA, 1),
				new ItemStack(ChinjufuModItemFoods.SCONE, 1),new ItemStack(ChinjufuModItemFoods.SCONE, 1),
				new ItemStack(ChinjufuModItemFoods.SCONE, 1));

		/*緑茶入り急須*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.KYUSU_1, 1),
				new ItemStack(ChinjufuModFoodBlocks.KYUSU_kara, 1), new ItemStack(TTimeItems.Item_YAKAN_boil, 1),
				new ItemStack(TTimeItems.CHABA_GREEN, 1),new ItemStack(TTimeItems.CHABA_GREEN, 1));

		/*緑茶セット*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.JPTEASET_1, 1),
				new ItemStack(ChinjufuModFoodBlocks.JPTEACUP_1, 1), new ItemStack(TTimeItems.Item_SARA, 1),
				new ItemStack(ChinjufuModItemFoods.SENBEI, 1),new ItemStack(ChinjufuModItemFoods.SENBEI, 1),
				new ItemStack(ChinjufuModItemFoods.SENBEI, 1));

		/*アイスクリーム*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.ICECREAM_1, 1),
				new ItemStack(TTimeItems.Item_DRINKGLASS, 1),
				new ItemStack(Items.MILK_BUCKET, 1), new ItemStack(Items.SNOWBALL, 1),
				new ItemStack(Items.EGG, 1), new ItemStack(Items.SUGAR, 1));

		/*水入り寸胴*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.ZUNDOU_MIZU, 1),
				new ItemStack(ChinjufuModFoodBlocks.ZUNDOU, 1), new ItemStack(Items.WATER_BUCKET, 1));

		/*トマトs－スフライパン*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModFoodBlocks.TOMATOSAU_nama, 1),
				new ItemStack(ChinjufuModFoodBlocks.FRYPAN, 1),
				new ItemStack(ChinjufuModItemFoods.FOOD_TOMATO, 1), new ItemStack(ChinjufuModItemFoods.FOOD_TOMATO, 1),
				new ItemStack(ChinjufuModItemFoods.FOOD_TOMATO, 1), new ItemStack(ChinjufuModItemFoods.FOOD_ONION, 1),
				new ItemStack(TTimeItems.SHIO, 1));

	}
}
