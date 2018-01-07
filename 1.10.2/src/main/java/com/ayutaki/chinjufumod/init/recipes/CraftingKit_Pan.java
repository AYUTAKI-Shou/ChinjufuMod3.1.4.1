package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ASDecoModKitchen;
import com.ayutaki.chinjufumod.init.ASDecoModPantry;
import com.ayutaki.chinjufumod.init.ChinjufuModItemFoods;
import com.ayutaki.chinjufumod.init.New_ChinjufuModBlocks;
import com.ayutaki.chinjufumod.init.New_ChinjufuModSchool;
import com.ayutaki.chinjufumod.init.TTimeItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class CraftingKit_Pan {

	public CraftingKit_Pan() {
		register();
	}

	public static void register() {

		/*キッチン台*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKitchen.KITCHEN, 4), new Object [] {
				"xxx",
				"yzy",
				"yzy",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 1),
				'y', new ItemStack(Blocks.PLANKS, 1, 2),
				'z', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*まな板台*/
		GameRegistry.addShapelessRecipe(new ItemStack(ASDecoModKitchen.KIT_BOARD, 1),
				new ItemStack(ASDecoModKitchen.KITCHEN, 1), new ItemStack(Blocks.CRAFTING_TABLE, 1));

		/*シンク*/
		GameRegistry.addShapelessRecipe(new ItemStack(ASDecoModKitchen.KIT_SINK1, 1),
				new ItemStack(ASDecoModKitchen.KITCHEN, 1), new ItemStack(New_ChinjufuModBlocks.STEEL_BLOCK, 1));

		/*コンロ*/
		GameRegistry.addShapelessRecipe(new ItemStack(ASDecoModKitchen.KIT_STOVE, 1),
				new ItemStack(ASDecoModKitchen.KITCHEN, 1), new ItemStack(Blocks.FURNACE, 1));

		/*囲炉裏*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKitchen.IRORI, 1), new Object [] {
				"zzz",
				"xyx",
				"xxx",
				'x', new ItemStack(Items.IRON_INGOT),
				'y', new ItemStack(Blocks.GRAVEL),
				'z', new ItemStack(Blocks.LOG, 1, 0)
		});

		/*ストーブ*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.CSTOVE_top, 2), new Object [] {
				"x",
				"y",
				"x",
				'x', new ItemStack(New_ChinjufuModBlocks.STEEL_BLOCK),
				'y', new ItemStack(Items.COAL, 1, 1)
		});

		/*ストーブ下部*/
		GameRegistry.addShapelessRecipe(new ItemStack(New_ChinjufuModSchool.CSTOVE_bot, 1),
					new ItemStack(New_ChinjufuModSchool.CSTOVE_top, 1));

		/*旧ストーブ変換*/
		GameRegistry.addShapelessRecipe(new ItemStack(New_ChinjufuModSchool.CSTOVE_top, 2),
				new ItemStack(New_ChinjufuModSchool.CSTOVE, 1));


		/*食器棚*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKitchen.KIT_TANA, 4), new Object [] {
				"xyx",
				"xyx",
				"xyx",
				'x', new ItemStack(Blocks.PLANKS, 1, 2),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*排気ダクト*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKitchen.KIT_HAIKIDUCT, 8), new Object [] {
				"x",
				"x",
				'x', new ItemStack(New_ChinjufuModBlocks.ALUMI_BLOCK)
		});

		/*換気扇*/
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ASDecoModKitchen.KIT_KANKI_1, 1),
				new ItemStack(ASDecoModKitchen.KIT_HAIKIDUCT, 1), "ingotAluminium",
				new ItemStack(Items.FEATHER, 1), new ItemStack(Items.FEATHER, 1), new ItemStack(Items.FEATHER, 1),
				new ItemStack(Items.FEATHER, 1), new ItemStack(Items.FEATHER, 1), new ItemStack(Items.REDSTONE, 1)));

		/*排気口*/
		GameRegistry.addShapelessRecipe(new ItemStack(ASDecoModKitchen.KIT_DUCTEND_1, 1),
				new ItemStack(ASDecoModKitchen.KIT_HAIKIDUCT, 1), new ItemStack(TTimeItems.ALUMINUM, 1));


		/*空箱*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_EMPTY, 1), new Object [] {
				"xxx",
				"x#x",
				"xxx",
				'x', new ItemStack(Items.PAPER)
		});

		/*りんご箱*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_APPLE, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(Items.APPLE)
		});

		/*牛肉箱*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_BEEF, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(Items.BEEF)
		});

		/*ビート*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_BEETROOT, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(Items.BEETROOT)
		});

		/*パン箱*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_BREAD, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(Items.BREAD)
		});

		/*にんじん箱*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_CARROT, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(Items.CARROT)
		});

		/*鶏肉箱*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_CHICKEN, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(Items.CHICKEN)
		});

		/*コーラスフルーツ箱*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_CHORUS, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(Items.CHORUS_FRUIT)
		});

		/*カカオ袋*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_COCO, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(Items.DYE, 1, 3)
		});

		/*たまご箱*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_EGG, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(Items.EGG)
		});

		/*魚箱*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_FISH, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(Items.FISH)
		});

		/*小麦粉袋*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_FLOUR, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(Items.WHEAT)
		});

		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.KOMUGI, 1),
				new ItemStack(Items.WHEAT, 1));

		/*羊肉箱*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_MUTTON, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(Items.MUTTON)
		});

		/*豚肉箱*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_PORK, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(Items.PORKCHOP)
		});

		/*じゃがいも箱*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_POTATO, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(Items.POTATO)
		});

		/*ウサギ肉箱*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_RABBIT, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(Items.RABBIT)
		});

		/*キャベツ箱*/
		GameRegistry.addShapelessRecipe(new ItemStack(ASDecoModPantry.BOX_H_CABBAGE, 1),
				new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				new ItemStack(ChinjufuModItemFoods.FOOD_CABBAGE), new ItemStack(ChinjufuModItemFoods.FOOD_CABBAGE),
				new ItemStack(ChinjufuModItemFoods.FOOD_CABBAGE), new ItemStack(ChinjufuModItemFoods.FOOD_CABBAGE));

		/*白菜箱*/
		GameRegistry.addShapelessRecipe(new ItemStack(ASDecoModPantry.BOX_H_HAKUSAI, 1),
				new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				new ItemStack(ChinjufuModItemFoods.FOOD_HAKUSAI), new ItemStack(ChinjufuModItemFoods.FOOD_HAKUSAI));

		/*とうもろこし箱*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_CORN, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(ChinjufuModItemFoods.FOOD_CORN)
		});

		/*ぶどう箱*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_GRAPE, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(ChinjufuModItemFoods.FOOD_GRAPE)
		});

		/*たまねぎ箱*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_ONION, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(ChinjufuModItemFoods.FOOD_ONION)
		});

		/*米袋*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_RICE, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(TTimeItems.KOME)
		});


		/*大豆袋*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_SOY, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(TTimeItems.SOY)
		});

		/*ほうれん草箱*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_SPINACH, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(ChinjufuModItemFoods.FOOD_SPINACH)
		});

		/*トマト箱*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_TOMATO, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(ChinjufuModItemFoods.FOOD_TOMATO)
		});

		/*緑茶袋*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_TGREEN, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(ASDecoModPantry.CHADUTSU)
		});

		/*紅茶袋*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.BOX_H_TRED, 1), new Object [] {
				"yyy",
				"yxy",
				"yyy",
				'x', new ItemStack(ASDecoModPantry.BOX_H_EMPTY),
				'y', new ItemStack(ASDecoModPantry.CANTEA)
		});

		/*茶筒*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.CHADUTSU, 1), new Object [] {
				"xxx",
				"x#x",
				"xxx",
				'x', new ItemStack(TTimeItems.CHABA_GREEN)
		});

		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.CHABA_GREEN, 8),
				new ItemStack(ASDecoModPantry.CHADUTSU, 1));

		/*紅茶缶*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.CANTEA, 1), new Object [] {
				"xxx",
				"x#x",
				"xxx",
				'x', new ItemStack(TTimeItems.CHABA_RED)
		});

		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.CHABA_RED, 8),
				new ItemStack(ASDecoModPantry.CANTEA, 1));

		/*俵*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPantry.TAWARA, 1), new Object [] {
				"xxx",
				"x#x",
				"xxx",
				'x', new ItemStack(ASDecoModPantry.BOX_H_RICE)
		});

		GameRegistry.addShapelessRecipe(new ItemStack(ASDecoModPantry.BOX_H_RICE, 8),
				new ItemStack(ASDecoModPantry.TAWARA, 1));

	}
}
