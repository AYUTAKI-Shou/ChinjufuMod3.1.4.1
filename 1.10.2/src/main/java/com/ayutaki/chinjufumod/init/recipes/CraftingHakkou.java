package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ASDecoModHakkou;
import com.ayutaki.chinjufumod.init.ChinjufuModFoodBlocks;
import com.ayutaki.chinjufumod.init.ChinjufuModItemFoods;
import com.ayutaki.chinjufumod.init.TTimeItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingHakkou {

	public CraftingHakkou() {
		register();
	}

	public static void register() {
		/*酵母瓶*/
		GameRegistry.addShapelessRecipe(new ItemStack(ASDecoModHakkou.KOUBOBIN_full, 1),
				new ItemStack(Items.POTIONITEM, 1),new ItemStack(Items.SUGAR, 1), new ItemStack(Items.APPLE, 1));

		/*発酵樽*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModHakkou.HAKKOUTARU, 1), new Object [] {
				"xyx",
				"x#x",
				"xyx",
				'x', new ItemStack(Blocks.PLANKS, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*麹樽→米4つ分が、米麹4つ*/
		GameRegistry.addShapelessRecipe(new ItemStack(ASDecoModHakkou.KOUJITARU_full, 1),
				new ItemStack(ASDecoModHakkou.HAKKOUTARU, 1),new ItemStack(TTimeItems.MUSHIGOME, 1), new ItemStack(Blocks.BROWN_MUSHROOM, 1));

		/*酒母樽→米3つ分＋米1つ分＝4つ分が、酒母1つ*/
		GameRegistry.addShapelessRecipe(new ItemStack(ASDecoModHakkou.SHUBOTARU_full, 1),
				new ItemStack(ASDecoModHakkou.HAKKOUTARU, 1), new ItemStack(TTimeItems.KOUBO, 1),
				new ItemStack(TTimeItems.MUSHIGOME, 1), new ItemStack(TTimeItems.KOMEKOUJI, 1), new ItemStack(Items.WATER_BUCKET, 1));

		/*もろみ樽→米4つ分＋米3つ分＋米1つ＝8つ分が、もろみ1つ*/
		GameRegistry.addShapelessRecipe(new ItemStack(ASDecoModHakkou.MOROMITARU_full, 1),
				new ItemStack(ASDecoModHakkou.HAKKOUTARU, 1), new ItemStack(TTimeItems.SHUBO, 1),
				new ItemStack(TTimeItems.MUSHIGOME, 1), new ItemStack(TTimeItems.KOMEKOUJI, 1), new ItemStack(Items.WATER_BUCKET, 1));

		/*生酒しぼり*/
		GameRegistry.addShapelessRecipe(new ItemStack(ASDecoModHakkou.NAMASAKEBOT_full, 1),
				new ItemStack(TTimeItems.MORO, 1), new ItemStack(TTimeItems.Item_SAKEBOTTLE, 1));

		/*甘酒鍋*/
		GameRegistry.addShapelessRecipe(new ItemStack(ASDecoModHakkou.NABEAMAZAKE_nama, 1),
				new ItemStack(ChinjufuModFoodBlocks.NABE_kara, 1), new ItemStack(Items.WATER_BUCKET, 1),
				new ItemStack(TTimeItems.SAKEKASU, 1), new ItemStack(Items.SUGAR, 1));

		/*酒粕の肥料*/
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 15), new ItemStack(TTimeItems.SAKEKASU, 1));

		/*熟成酒*/
		GameRegistry.addShapelessRecipe(new ItemStack(ASDecoModHakkou.JYUKUSEITARU_full, 1),
				new ItemStack(ASDecoModHakkou.HAKKOUTARU, 1), new ItemStack(ASDecoModHakkou.SHINSAKEBOT_1, 1));

		/*りんご酒樽*/
		GameRegistry.addShapelessRecipe(new ItemStack(ASDecoModHakkou.RINGOSHUTARU_full, 1),
				new ItemStack(Items.APPLE), new ItemStack(Items.APPLE), new ItemStack(Items.APPLE), new ItemStack(Items.APPLE),
				new ItemStack(Items.APPLE), new ItemStack(Items.APPLE), new ItemStack(Items.APPLE),
				new ItemStack(ASDecoModHakkou.HAKKOUTARU, 1), new ItemStack(TTimeItems.KOUBO, 1));

		/*ワイン酒樽*/
		GameRegistry.addShapelessRecipe(new ItemStack(ASDecoModHakkou.BUDOUSHUTARU_full, 1),
				new ItemStack(ChinjufuModItemFoods.FOOD_GRAPE, 1), new ItemStack(ChinjufuModItemFoods.FOOD_GRAPE, 1), new ItemStack(ChinjufuModItemFoods.FOOD_GRAPE, 1),
				new ItemStack(ChinjufuModItemFoods.FOOD_GRAPE, 1), new ItemStack(ChinjufuModItemFoods.FOOD_GRAPE, 1), new ItemStack(ChinjufuModItemFoods.FOOD_GRAPE, 1),
				new ItemStack(ChinjufuModItemFoods.FOOD_GRAPE, 1),
				new ItemStack(ASDecoModHakkou.HAKKOUTARU, 1), new ItemStack(TTimeItems.KOUBO, 1));

		/*煮豆*/
		GameRegistry.addShapelessRecipe(new ItemStack(ASDecoModHakkou.NABENIMAME_nama, 1),
				new ItemStack(ChinjufuModFoodBlocks.NABE_kara, 1), new ItemStack(Items.WATER_BUCKET, 1),
				new ItemStack(TTimeItems.SOY, 1), new ItemStack(TTimeItems.SOY, 1),
				new ItemStack(TTimeItems.SOY, 1), new ItemStack(TTimeItems.SOY, 1));

		/*味噌樽→煮豆1(大豆4つ分)→味噌4つ*/
		GameRegistry.addShapelessRecipe(new ItemStack(ASDecoModHakkou.MISOTARU_full, 1),
				new ItemStack(ASDecoModHakkou.HAKKOUTARU, 1), new ItemStack(TTimeItems.KOMEKOUJI, 1), new ItemStack(TTimeItems.SHIO, 1),
				new ItemStack(TTimeItems.NIMAME, 1));

	}
}
