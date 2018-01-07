package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.New_ChinjufuModBlocks;
import com.ayutaki.chinjufumod.init.New_ChinjufuModHarbor;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingHarbor {

	public CraftingHarbor() {
		register();
	}

	public static void register() {
		/*警戒ブロック*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModHarbor.KEIKAIBLOCK, 12), new Object [] {
				"ab#",
				"xxx",
				'x', new ItemStack(Blocks.STONE, 1, 0),
				'a', new ItemStack(Items.DYE, 1, 11),
				'b', new ItemStack(Items.DYE, 1, 0)
			});

		/*係留杭*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModHarbor.KEIRYUKUI, 3), new Object [] {
			"xx",
			"x#",
			'x', new ItemStack(Items.IRON_INGOT)
		});

		/*係留杭(黒)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModHarbor.KEIRYUKUI_b, 3), new Object [] {
			"#a#",
			"xxx",
			'x', new ItemStack(New_ChinjufuModHarbor.KEIRYUKUI),
			'a', new ItemStack(Items.DYE, 1, 0)
		});

		/*トラス(銀)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModHarbor.TRUSS, 12), new Object [] {
			"x",
			"x",
			"x",
			'x', new ItemStack(New_ChinjufuModBlocks.STEEL_BLOCK)
		});

		/*トラス(黒)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModHarbor.TRUSS_black, 8), new Object [] {
			"xxx",
			"xax",
			"xxx",
			'x', new ItemStack(New_ChinjufuModHarbor.TRUSS),
			'a', new ItemStack(Items.DYE, 1, 0)
		});

		/*トラス(青)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModHarbor.TRUSS_blue, 8), new Object [] {
			"xxx",
			"xax",
			"xxx",
			'x', new ItemStack(New_ChinjufuModHarbor.TRUSS),
			'a', new ItemStack(Items.DYE, 1, 4)
		});

		/*トラス(茶)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModHarbor.TRUSS_brown, 8), new Object [] {
			"xxx",
			"xax",
			"xxx",
			'x', new ItemStack(New_ChinjufuModHarbor.TRUSS),
			'a', new ItemStack(Items.DYE, 1, 3)
		});

		/*トラス(水)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModHarbor.TRUSS_cyan, 8), new Object [] {
			"xxx",
			"xax",
			"xxx",
			'x', new ItemStack(New_ChinjufuModHarbor.TRUSS),
			'a', new ItemStack(Items.DYE, 1, 6)
		});

		/*トラス(灰)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModHarbor.TRUSS_gray, 8), new Object [] {
			"xxx",
			"xax",
			"xxx",
			'x', new ItemStack(New_ChinjufuModHarbor.TRUSS),
			'a', new ItemStack(Items.DYE, 1, 8)
		});

		/*トラス(緑)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModHarbor.TRUSS_green, 8), new Object [] {
			"xxx",
			"xax",
			"xxx",
			'x', new ItemStack(New_ChinjufuModHarbor.TRUSS),
			'a', new ItemStack(Items.DYE, 1, 2)
		});

		/*トラス(空)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModHarbor.TRUSS_lightb, 8), new Object [] {
			"xxx",
			"xax",
			"xxx",
			'x', new ItemStack(New_ChinjufuModHarbor.TRUSS),
			'a', new ItemStack(Items.DYE, 1, 12)
		});

		/*トラス(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModHarbor.TRUSS_lime, 8), new Object [] {
			"xxx",
			"xax",
			"xxx",
			'x', new ItemStack(New_ChinjufuModHarbor.TRUSS),
			'a', new ItemStack(Items.DYE, 1, 10)
		});

		/*トラス(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModHarbor.TRUSS_magenta, 8), new Object [] {
			"xxx",
			"xax",
			"xxx",
			'x', new ItemStack(New_ChinjufuModHarbor.TRUSS),
			'a', new ItemStack(Items.DYE, 1, 13)
		});

		/*トラス(橙)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModHarbor.TRUSS_orange, 8), new Object [] {
			"xxx",
			"xax",
			"xxx",
			'x', new ItemStack(New_ChinjufuModHarbor.TRUSS),
			'a', new ItemStack(Items.DYE, 1, 14)
		});

		/*トラス(桃)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModHarbor.TRUSS_pink, 8), new Object [] {
			"xxx",
			"xax",
			"xxx",
			'x', new ItemStack(New_ChinjufuModHarbor.TRUSS),
			'a', new ItemStack(Items.DYE, 1, 9)
		});

		/*トラス(紫)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModHarbor.TRUSS_purple, 8), new Object [] {
			"xxx",
			"xax",
			"xxx",
			'x', new ItemStack(New_ChinjufuModHarbor.TRUSS),
			'a', new ItemStack(Items.DYE, 1, 5)
		});

		/*トラス(赤)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModHarbor.TRUSS_red, 8), new Object [] {
			"xxx",
			"xax",
			"xxx",
			'x', new ItemStack(New_ChinjufuModHarbor.TRUSS),
			'a', new ItemStack(Items.DYE, 1, 1)
		});

		/*トラス(白)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModHarbor.TRUSS_white, 8), new Object [] {
			"xxx",
			"xax",
			"xxx",
			'x', new ItemStack(New_ChinjufuModHarbor.TRUSS),
			'a', new ItemStack(Items.DYE, 1, 15)
		});

		/*トラス(黄)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModHarbor.TRUSS_yellow, 8), new Object [] {
			"xxx",
			"xax",
			"xxx",
			'x', new ItemStack(New_ChinjufuModHarbor.TRUSS),
			'a', new ItemStack(Items.DYE, 1, 11)
		});


	}

}
