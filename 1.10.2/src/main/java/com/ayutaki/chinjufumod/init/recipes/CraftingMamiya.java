package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.New_ChinjufuModMamiya;
import com.ayutaki.chinjufumod.init.TTimeItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingMamiya {

	public CraftingMamiya() {
		register();
	}

	public static void register() {

		/*カフェテーブル*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.CAFETABLE, 1), new Object [] {
				"xxx",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.PLANKS, 1, 0),
				'y', new ItemStack(Items.STICK)
		});

		/*カフェテーブル(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.CAFETABLE_a, 1), new Object [] {
				"xxx",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.PLANKS, 1, 4),
				'y', new ItemStack(Items.STICK)
		});

		/*カフェテーブル(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.CAFETABLE_b, 1), new Object [] {
				"xxx",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.PLANKS, 1, 2),
				'y', new ItemStack(Items.STICK)
		});

		/*カフェテーブル(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.CAFETABLE_d, 1), new Object [] {
				"xxx",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.PLANKS, 1, 5),
				'y', new ItemStack(Items.STICK)
		});

		/*カフェテーブル(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.CAFETABLE_j, 1), new Object [] {
				"xxx",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.PLANKS, 1, 3),
				'y', new ItemStack(Items.STICK)
		});

		/*カフェテーブル(マツ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.CAFETABLE_s, 1), new Object [] {
				"xxx",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.PLANKS, 1, 1),
				'y', new ItemStack(Items.STICK)
		});


		/*丸太椅子*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.LOGCHAIR, 4), new Object [] {
				"xx",
				"xx",
				'x', new ItemStack(Blocks.LOG, 1, 0)
		});

		/*丸太椅子(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.LOGCHAIR_a, 4), new Object [] {
				"xx",
				"xx",
				'x', new ItemStack(Blocks.LOG2, 1, 0)
		});

		/*丸太椅子(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.LOGCHAIR_b, 4), new Object [] {
				"xx",
				"xx",
				'x', new ItemStack(Blocks.LOG, 1, 2)
		});

		/*丸太椅子(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.LOGCHAIR_d, 4), new Object [] {
				"xx",
				"xx",
				'x', new ItemStack(Blocks.LOG2, 1, 1)
		});

		/*丸太椅子(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.LOGCHAIR_j, 4), new Object [] {
				"xx",
				"xx",
				'x', new ItemStack(Blocks.LOG, 1, 3)
		});

		/*丸太椅子(マツ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.LOGCHAIR_s, 4), new Object [] {
				"xx",
				"xx",
				'x', new ItemStack(Blocks.LOG, 1, 1)
		});

		/*縁台*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.ENDAI, 1), new Object [] {
				"yyy",
				"x#x",
				"xxx",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*縁台(赤)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.ENDAI_red, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.WOOL, 1, 14),
				'y', new ItemStack(New_ChinjufuModMamiya.ENDAI)
		});

		/*座布団(黒)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.ZABUTON_black, 1), new Object [] {
				"x",
				"y",
				"x",
				'x', new ItemStack(Blocks.CARPET, 1, 15),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});

		/*座布団(青)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.ZABUTON_blue, 1), new Object [] {
				"x",
				"y",
				"x",
				'x', new ItemStack(Blocks.CARPET, 1, 11),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});

		/*座布団(茶)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.ZABUTON_brown, 1), new Object [] {
				"x",
				"y",
				"x",
				'x', new ItemStack(Blocks.CARPET, 1, 12),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});

		/*座布団(浅葱)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.ZABUTON_cyan, 1), new Object [] {
				"x",
				"y",
				"x",
				'x', new ItemStack(Blocks.CARPET, 1, 9),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});

		/*座布団(灰)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.ZABUTON_gray, 1), new Object [] {
				"x",
				"y",
				"x",
				'x', new ItemStack(Blocks.CARPET, 1, 7),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});

		/*座布団(緑)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.ZABUTON_green, 1), new Object [] {
				"x",
				"y",
				"x",
				'x', new ItemStack(Blocks.CARPET, 1, 13),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});

		/*座布団(空)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.ZABUTON_lightb, 1), new Object [] {
				"x",
				"y",
				"x",
				'x', new ItemStack(Blocks.CARPET, 1, 3),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});

		/*座布団(銀)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.ZABUTON_lightg, 1), new Object [] {
				"x",
				"y",
				"x",
				'x', new ItemStack(Blocks.CARPET, 1, 8),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});

		/*座布団(萌黄)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.ZABUTON_lime, 1), new Object [] {
				"x",
				"y",
				"x",
				'x', new ItemStack(Blocks.CARPET, 1, 5),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});

		/*座布団(牡丹)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.ZABUTON_magenta, 1), new Object [] {
				"x",
				"y",
				"x",
				'x', new ItemStack(Blocks.CARPET, 1, 2),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});

		/*座布団(橙)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.ZABUTON_orange, 1), new Object [] {
				"x",
				"y",
				"x",
				'x', new ItemStack(Blocks.CARPET, 1, 1),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});

		/*座布団(桃)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.ZABUTON_pink, 1), new Object [] {
				"x",
				"y",
				"x",
				'x', new ItemStack(Blocks.CARPET, 1, 6),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});

		/*座布団(紫)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.ZABUTON_purple, 1), new Object [] {
				"x",
				"y",
				"x",
				'x', new ItemStack(Blocks.CARPET, 1, 10),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});

		/*座布団(赤)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.ZABUTON_red, 1), new Object [] {
				"x",
				"y",
				"x",
				'x', new ItemStack(Blocks.CARPET, 1, 14),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});

		/*座布団(白)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.ZABUTON_white, 1), new Object [] {
				"x",
				"y",
				"x",
				'x', new ItemStack(Blocks.CARPET, 1, 0),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});

		/*座布団(黄)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.ZABUTON_yellow, 1), new Object [] {
				"x",
				"y",
				"x",
				'x', new ItemStack(Blocks.CARPET, 1, 4),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});


		/*和傘(黒)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.KASA_black, 9), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.WOOL, 1, 15),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*和傘(青)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.KASA_blue, 9), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.WOOL, 1, 11),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*和傘(茶)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.KASA_brown, 9), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.WOOL, 1, 12),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*和傘(浅葱)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.KASA_cyan, 9), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.WOOL, 1, 9),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*和傘(灰)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.KASA_gray, 9), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.WOOL, 1, 7),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*和傘(緑)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.KASA_green, 9), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.WOOL, 1, 13),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*和傘(空)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.KASA_lightb, 9), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.WOOL, 1, 3),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*和傘(銀)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.KASA_lightg, 9), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.WOOL, 1, 8),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*和傘(萌黄)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.KASA_lime, 9), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.WOOL, 1, 5),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*和傘(牡丹)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.KASA_magenta, 9), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.WOOL, 1, 2),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*和傘(橙)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.KASA_orange, 9), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.WOOL, 1, 1),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*和傘(桃)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.KASA_pink, 9), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.WOOL, 1, 6),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*和傘(紫)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.KASA_purple, 9), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.WOOL, 1, 10),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*和傘(赤)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.KASA_red, 9), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.WOOL, 1, 14),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*和傘(白)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.KASA_white, 9), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.WOOL, 1, 0),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*和傘(黄)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.KASA_yellow, 9), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.WOOL, 1, 4),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*わら座布団*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.WARAZABUTON, 1), new Object [] {
				"x",
				"x",
				"x",
				'x', new ItemStack(Items.WHEAT)
		});

		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModMamiya.WARAZABUTON, 1), new Object [] {
				"x",
				"x",
				"x",
				'x', new ItemStack(TTimeItems.INE)
		});
	}
}
