package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ASDecoModHakkou;
import com.ayutaki.chinjufumod.init.ChinjufuModItemFoods;
import com.ayutaki.chinjufumod.init.New_ChinjufuModSeasons;
import com.ayutaki.chinjufumod.init.New_LetterTrays;
import com.ayutaki.chinjufumod.init.TTimeItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingTTimeItems {

	public CraftingTTimeItems() {
		register();
	}

	public static void register() {

		/*茶*/
		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.CHABA_GREEN, 1),
				new ItemStack(TTimeItems.TUMICHABA, 1), new ItemStack(TTimeItems.TUMICHABA, 1),
				new ItemStack(TTimeItems.TUMICHABA, 1), new ItemStack(TTimeItems.TUMICHABA, 1));

		/*紅茶*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModHakkou.KOUCHASAN_full, 1), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(TTimeItems.CHABA_GREEN),
				'y', new ItemStack(ASDecoModHakkou.HAKKOUTARU)
		});

		/*マッチ*/
		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.Item_MATCH, 12),
				new ItemStack(Items.GUNPOWDER, 1), new ItemStack(Items.STICK, 1));

		/*米*/
		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.KOME, 1),
				new ItemStack(TTimeItems.INE, 1));

		/*大豆*/
		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.SOY, 1),
				new ItemStack(TTimeItems.SAYA, 1));

		/*小麦粉*/
		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.KOMUGI, 1),
				new ItemStack(Items.WHEAT, 1));

		/*バター*/
		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.BUTTER, 3),
				new ItemStack(Items.MILK_BUCKET, 1));

		/*漆器*/
		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.Item_SHIKKI, 1),
				new ItemStack(Items.BOWL, 1), new ItemStack(Items.DYE, 1, 1));

		/*ドリンクグラス*/
		GameRegistry.addRecipe(new ItemStack(TTimeItems.Item_DRINKGLASS, 3), new Object [] {
				"#x",
				"xx",
				'x', new ItemStack(Blocks.GLASS)
		});

		/*酒瓶*/
		GameRegistry.addRecipe(new ItemStack(TTimeItems.Item_SAKEBOTTLE, 3), new Object [] {
				"x",
				"x",
				"x",
				'x', new ItemStack(Blocks.GLASS)
		});

		/*テーブルロール生地*/
		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.KIJI_BUN, 1),
				new ItemStack(TTimeItems.KOMUGI, 1), new ItemStack(TTimeItems.KOMUGI, 1),
				new ItemStack(TTimeItems.KOMUGI, 1),
				new ItemStack(TTimeItems.KOUBO, 1), new ItemStack(Items.MILK_BUCKET, 1),
				new ItemStack(TTimeItems.SHIO, 1), new ItemStack(TTimeItems.BUTTER, 1),
				new ItemStack(Items.SUGAR, 1));

		/*パスタ生地 3.0.2で修正*/
		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.PASTA_nama, 1),
				new ItemStack(TTimeItems.KOMUGI, 1), new ItemStack(TTimeItems.KOMUGI, 1),
				new ItemStack(TTimeItems.KOMUGI, 1),
				new ItemStack(TTimeItems.SHIO, 1), new ItemStack(Items.EGG, 1), new ItemStack(Items.EGG, 1));

		/*ひき肉生地*/
		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.KIJI_BURG, 1),
				new ItemStack(ChinjufuModItemFoods.FOOD_ONION, 1), new ItemStack(ChinjufuModItemFoods.BUN, 1),
				new ItemStack(Items.EGG, 1), new ItemStack(Items.BEEF, 1), new ItemStack(TTimeItems.SHIO, 1));

		/*スコーン生地*/
		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.KIJI_SCONE, 4),
				new ItemStack(TTimeItems.KOMUGI, 1), new ItemStack(TTimeItems.KOMUGI, 1),
				new ItemStack(TTimeItems.KOMUGI, 1), new ItemStack(TTimeItems.KOMUGI, 1),
				new ItemStack(TTimeItems.KOUBO, 1),
				new ItemStack(Items.MILK_BUCKET, 1), new ItemStack(TTimeItems.SHIO, 1),
				new ItemStack(TTimeItems.BUTTER, 1), new ItemStack(Items.SUGAR, 1));

		/*煎餅生地*/
		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.KIJI_SENBEI, 6),
				new ItemStack(TTimeItems.MUSHIGOME, 1));

		/*成形した粘土(湯呑み)*/
		GameRegistry.addRecipe(new ItemStack(TTimeItems.CLAY_YUNOMI, 1), new Object [] {
			"x",
			'x', new ItemStack(Items.CLAY_BALL)
		});


		/*成形した粘土(急須)*/
		GameRegistry.addRecipe(new ItemStack(TTimeItems.CLAY_KYUSU, 1), new Object [] {
			"#x#",
			"xxx",
			"#xx",
			'x', new ItemStack(Items.CLAY_BALL)
		});

		/*成形した粘土(皿)*/
		GameRegistry.addRecipe(new ItemStack(TTimeItems.CLAY_SARA, 3), new Object [] {
			"xxx",
			'x', new ItemStack(Items.CLAY_BALL)
		});

		/*成形した粘土(茶碗)*/
		GameRegistry.addRecipe(new ItemStack(TTimeItems.CLAY_CHAWAN, 3), new Object [] {
			"x#x",
			"#x#",
			'x', new ItemStack(Items.CLAY_BALL)
		});

		/*成形した粘土(ティーカップ)*/
		GameRegistry.addRecipe(new ItemStack(TTimeItems.CLAY_TCUP, 2), new Object [] {
			"x",
			"x",
			'x', new ItemStack(Items.CLAY_BALL)
		});

		/*成形した粘土(ティーポット)*/
		GameRegistry.addRecipe(new ItemStack(TTimeItems.CLAY_TPOT, 1), new Object [] {
			"xxx",
			"#xx",
			'x', new ItemStack(Items.CLAY_BALL)
		});

		/*成形した粘土(鍋)*/
		GameRegistry.addRecipe(new ItemStack(TTimeItems.CLAY_NABE, 1), new Object [] {
			"#x#",
			"x#x",
			"xxx",
			'x', new ItemStack(Items.CLAY_BALL)
		});

		/*成形した粘土(呑水)*/
		GameRegistry.addRecipe(new ItemStack(TTimeItems.CLAY_TONSUI, 3), new Object [] {
			"#x#",
			"x#x",
			'x', new ItemStack(Items.CLAY_BALL)
		});


		/*ちゃぶ台*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.CHABUDAI, 1), new Object [] {
			"a",
			"x",
			'x', new ItemStack(New_LetterTrays.LOWDESK),
			'a', new ItemStack(TTimeItems.Item_YUNOMI)
		});

		/*ちゃぶ台(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.CHABUDAI_aca, 1), new Object [] {
				"a",
				"x",
				'x', new ItemStack(New_LetterTrays.LOWDESK_a),
				'a', new ItemStack(TTimeItems.Item_YUNOMI)
		});

		/*ちゃぶ台(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.CHABUDAI_bir, 1), new Object [] {
				"a",
				"x",
				'x', new ItemStack(New_LetterTrays.LOWDESK_b),
				'a', new ItemStack(TTimeItems.Item_YUNOMI)
		});

		/*ちゃぶ台(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.CHABUDAI_doak, 1), new Object [] {
				"a",
				"x",
				'x', new ItemStack(New_LetterTrays.LOWDESK_d),
				'a', new ItemStack(TTimeItems.Item_YUNOMI)
		});

		/*ちゃぶ台(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.CHABUDAI_jun, 1), new Object [] {
				"a",
				"x",
				'x', new ItemStack(New_LetterTrays.LOWDESK_j),
				'a', new ItemStack(TTimeItems.Item_YUNOMI)
		});

		/*ちゃぶ台(マツ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.CHABUDAI_spru, 1), new Object [] {
				"a",
				"x",
				'x', new ItemStack(New_LetterTrays.LOWDESK_s),
				'a', new ItemStack(TTimeItems.Item_YUNOMI)
		});

		/*キャベツ種*/
		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.SEEDS_CABE, 1),
				new ItemStack(ChinjufuModItemFoods.FOOD_CABBAGE, 1));

		/*大豆*/
		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.SEEDS_SOY, 1),
				new ItemStack(TTimeItems.SOY, 1));

		/*ほうれん草*/
		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.SEEDS_SPINACH, 1),
				new ItemStack(ChinjufuModItemFoods.FOOD_SPINACH, 1));

		/*トマト*/
		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.SEEDS_TOMATO, 1),
				new ItemStack(ChinjufuModItemFoods.FOOD_TOMATO, 1));

		/*とうもろこし*/
		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.SEEDS_CORN, 1),
				new ItemStack(ChinjufuModItemFoods.FOOD_CORN, 1));

		/*たまねぎ*/
		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.SEEDS_ONION, 1),
				new ItemStack(ChinjufuModItemFoods.FOOD_ONION, 1));

		/*米*/
		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.SEEDS_RICE, 1),
				new ItemStack(TTimeItems.KOME, 1));

		/*白菜*/
		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.SEEDS_HAKUSAI, 1),
				new ItemStack(ChinjufuModItemFoods.FOOD_HAKUSAI, 1));

	}
}
