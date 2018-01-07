package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.New_ChinjufuModFurnitures;
import com.ayutaki.chinjufumod.init.New_ChinjufuModMamiya;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingFurnitures {

	public CraftingFurnitures() {
		register();
	}

	public static void register() {

		/*提督の椅子*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.ADMIRALCHAIR, 1), new Object [] {
				"y##",
				"xyx",
				"x#x",
				'x', new ItemStack(Blocks.PLANKS, 1, 0),
				'y', new ItemStack(Blocks.WOOL, 1, 11)
		});

		/*提督の椅子(赤)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.ADMIRALCHAIR_red, 1), new Object [] {
				"y##",
				"xyx",
				"x#x",
				'x', new ItemStack(Blocks.PLANKS, 1, 0),
				'y', new ItemStack(Blocks.WOOL, 1, 14)
		});

		/*カフェチェア(黒)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.CAFECHAIR_black, 1), new Object [] {
				"#x#",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.WOOL, 1, 15),
				'y', new ItemStack(Items.STICK)
		});

		/*カフェチェア(青)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.CAFECHAIR_blue, 1), new Object [] {
				"#x#",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.WOOL, 1, 11),
				'y', new ItemStack(Items.STICK)
		});

		/*カフェチェア(茶)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.CAFECHAIR_brown, 1), new Object [] {
				"#x#",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.WOOL, 1, 12),
				'y', new ItemStack(Items.STICK)
		});

		/*カフェチェア(浅葱)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.CAFECHAIR_cyan, 1), new Object [] {
				"#x#",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.WOOL, 1, 9),
				'y', new ItemStack(Items.STICK)
		});

		/*カフェチェア(灰)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.CAFECHAIR_gray, 1), new Object [] {
				"#x#",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.WOOL, 1, 7),
				'y', new ItemStack(Items.STICK)
		});

		/*カフェチェア(緑)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.CAFECHAIR_green, 1), new Object [] {
				"#x#",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.WOOL, 1, 13),
				'y', new ItemStack(Items.STICK)
		});

		/*カフェチェア(空)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.CAFECHAIR_lightb, 1), new Object [] {
				"#x#",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.WOOL, 1, 3),
				'y', new ItemStack(Items.STICK)
		});

		/*カフェチェア(銀)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.CAFECHAIR_lightg, 1), new Object [] {
				"#x#",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.WOOL, 1, 8),
				'y', new ItemStack(Items.STICK)
		});

		/*カフェチェア(萌黄)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.CAFECHAIR_lime, 1), new Object [] {
				"#x#",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.WOOL, 1, 5),
				'y', new ItemStack(Items.STICK)
		});

		/*カフェチェア(牡丹)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.CAFECHAIR_magenta, 1), new Object [] {
				"#x#",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.WOOL, 1, 2),
				'y', new ItemStack(Items.STICK)
		});

		/*カフェチェア(橙)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.CAFECHAIR_orange, 1), new Object [] {
				"#x#",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.WOOL, 1, 1),
				'y', new ItemStack(Items.STICK)
		});

		/*カフェチェア(桃)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.CAFECHAIR_pink, 1), new Object [] {
				"#x#",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.WOOL, 1, 6),
				'y', new ItemStack(Items.STICK)
		});

		/*カフェチェア(紫)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.CAFECHAIR_purple, 1), new Object [] {
				"#x#",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.WOOL, 1, 10),
				'y', new ItemStack(Items.STICK)
		});

		/*カフェチェア(赤)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.CAFECHAIR_red, 1), new Object [] {
				"#x#",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.WOOL, 1, 14),
				'y', new ItemStack(Items.STICK)
		});

		/*カフェチェア(白)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.CAFECHAIR_white, 1), new Object [] {
				"#x#",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.WOOL, 1, 0),
				'y', new ItemStack(Items.STICK)
		});

		/*カフェチェア(黄)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.CAFECHAIR_yellow, 1), new Object [] {
				"#x#",
				"#y#",
				"yyy",
				'x', new ItemStack(Blocks.WOOL, 1, 4),
				'y', new ItemStack(Items.STICK)
		});

		/*食卓椅子*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.DININGCHAIR, 1), new Object [] {
				"x##",
				"xxx",
				"y#y",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 0),
				'y', new ItemStack(Items.STICK),
		});

		/*食卓椅子(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.DININGCHAIR_a, 1), new Object [] {
				"x##",
				"xxx",
				"y#y",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 4),
				'y', new ItemStack(Items.STICK),
		});

		/*食卓椅子(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.DININGCHAIR_b, 1), new Object [] {
				"x##",
				"xxx",
				"y#y",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 2),
				'y', new ItemStack(Items.STICK),
		});

		/*食卓椅子(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.DININGCHAIR_d, 1), new Object [] {
				"x##",
				"xxx",
				"y#y",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 5),
				'y', new ItemStack(Items.STICK),
		});

		/*食卓椅子(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.DININGCHAIR_j, 1), new Object [] {
				"x##",
				"xxx",
				"y#y",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 3),
				'y', new ItemStack(Items.STICK),
		});

		/*食卓椅子(マツ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.DININGCHAIR_s, 1), new Object [] {
				"x##",
				"xxx",
				"y#y",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 1),
				'y', new ItemStack(Items.STICK),
		});

		/*ドレッサー*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.DRESSINGTABLE, 1), new Object [] {
				"x##",
				"y##",
				"xxx",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 0),
				'y', new ItemStack(Blocks.GLASS_PANE),
		});

		/*ドレッサー(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.DRESSINGTABLE_a, 1), new Object [] {
				"x##",
				"y##",
				"xxx",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 4),
				'y', new ItemStack(Blocks.GLASS_PANE),
		});

		/*ドレッサー(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.DRESSINGTABLE_b, 1), new Object [] {
				"x##",
				"y##",
				"xxx",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 2),
				'y', new ItemStack(Blocks.GLASS_PANE),
		});

		/*ドレッサー(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.DRESSINGTABLE_d, 1), new Object [] {
				"x##",
				"y##",
				"xxx",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 5),
				'y', new ItemStack(Blocks.GLASS_PANE),
		});

		/*ドレッサー(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.DRESSINGTABLE_j, 1), new Object [] {
				"x##",
				"y##",
				"xxx",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 3),
				'y', new ItemStack(Blocks.GLASS_PANE),
		});

		/*ドレッサー(マツ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.DRESSINGTABLE_s, 1), new Object [] {
				"x##",
				"y##",
				"xxx",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 1),
				'y', new ItemStack(Blocks.GLASS_PANE),
		});

		/*ユニット机*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.UNITDESK, 1), new Object [] {
				"xxx",
				"x#x",
				"x#x",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*ユニット机(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.UNITDESK_a, 1), new Object [] {
				"xxx",
				"x#x",
				"x#x",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*ユニット机(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.UNITDESK_b, 1), new Object [] {
				"xxx",
				"x#x",
				"x#x",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*ユニット机(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.UNITDESK_d, 1), new Object [] {
				"xxx",
				"x#x",
				"x#x",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*ユニット机(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.UNITDESK_j, 1), new Object [] {
				"xxx",
				"x#x",
				"x#x",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*ユニット机(マツ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.UNITDESK_s, 1), new Object [] {
				"xxx",
				"x#x",
				"x#x",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*座椅子(黒)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.ZAISU_black, 1), new Object [] {
				"yx",
				"yy",
				'x', new ItemStack(New_ChinjufuModMamiya.ZABUTON_black),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*座椅子(青)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.ZAISU_blue, 1), new Object [] {
				"yx",
				"yy",
				'x', new ItemStack(New_ChinjufuModMamiya.ZABUTON_blue),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*座椅子(茶)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.ZAISU_brown, 1), new Object [] {
				"yx",
				"yy",
				'x', new ItemStack(New_ChinjufuModMamiya.ZABUTON_brown),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*座椅子(浅葱)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.ZAISU_cyan, 1), new Object [] {
				"yx",
				"yy",
				'x', new ItemStack(New_ChinjufuModMamiya.ZABUTON_cyan),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*座椅子(灰)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.ZAISU_gray, 1), new Object [] {
				"yx",
				"yy",
				'x', new ItemStack(New_ChinjufuModMamiya.ZABUTON_gray),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*座椅子(緑)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.ZAISU_green, 1), new Object [] {
				"yx",
				"yy",
				'x', new ItemStack(New_ChinjufuModMamiya.ZABUTON_green),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*座椅子(空)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.ZAISU_lightb, 1), new Object [] {
				"yx",
				"yy",
				'x', new ItemStack(New_ChinjufuModMamiya.ZABUTON_lightb),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*座椅子(銀)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.ZAISU_lightg, 1), new Object [] {
				"yx",
				"yy",
				'x', new ItemStack(New_ChinjufuModMamiya.ZABUTON_lightg),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*座椅子(萌黄)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.ZAISU_lime, 1), new Object [] {
				"yx",
				"yy",
				'x', new ItemStack(New_ChinjufuModMamiya.ZABUTON_lime),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*座椅子(牡丹)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.ZAISU_magenta, 1), new Object [] {
				"yx",
				"yy",
				'x', new ItemStack(New_ChinjufuModMamiya.ZABUTON_magenta),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*座椅子(橙)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.ZAISU_orange, 1), new Object [] {
				"yx",
				"yy",
				'x', new ItemStack(New_ChinjufuModMamiya.ZABUTON_orange),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*座椅子(桃)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.ZAISU_pink, 1), new Object [] {
				"yx",
				"yy",
				'x', new ItemStack(New_ChinjufuModMamiya.ZABUTON_pink),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*座椅子(紫)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.ZAISU_purple, 1), new Object [] {
				"yx",
				"yy",
				'x', new ItemStack(New_ChinjufuModMamiya.ZABUTON_purple),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*座椅子(赤)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.ZAISU_red, 1), new Object [] {
				"yx",
				"yy",
				'x', new ItemStack(New_ChinjufuModMamiya.ZABUTON_red),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*座椅子(白)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.ZAISU_white, 1), new Object [] {
				"yx",
				"yy",
				'x', new ItemStack(New_ChinjufuModMamiya.ZABUTON_white),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*座椅子(黄)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModFurnitures.ZAISU_yellow, 1), new Object [] {
				"yx",
				"yy",
				'x', new ItemStack(New_ChinjufuModMamiya.ZABUTON_yellow),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

	}

}
