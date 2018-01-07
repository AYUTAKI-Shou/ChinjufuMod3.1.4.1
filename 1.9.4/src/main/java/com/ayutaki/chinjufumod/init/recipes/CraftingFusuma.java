package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ASDecoModFusuma;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingFusuma {

	public CraftingFusuma() {
		register();
	}

	public static void register() {
		/*障子*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.SHOUJI_CL, 2), new Object [] {
				"yxy",
				"xzx",
				"yxy",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Items.PAPER),
				'z', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*障子(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.SHOUJI_CL_aca, 2), new Object [] {
				"yxy",
				"xzx",
				"yxy",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Items.PAPER),
				'z', new ItemStack(Blocks.PLANKS, 1, 4)
		});

		/*障子(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.SHOUJI_CL_bir, 2), new Object [] {
				"yxy",
				"xzx",
				"yxy",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Items.PAPER),
				'z', new ItemStack(Blocks.PLANKS, 1, 2)
		});

		/*障子(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.SHOUJI_CL_doak, 2), new Object [] {
				"yxy",
				"xzx",
				"yxy",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Items.PAPER),
				'z', new ItemStack(Blocks.PLANKS, 1, 5)
		});

		/*障子(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.SHOUJI_CL_jun, 2), new Object [] {
				"yxy",
				"xzx",
				"yxy",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Items.PAPER),
				'z', new ItemStack(Blocks.PLANKS, 1, 3)
		});

		/*障子(マツ)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.SHOUJI_CL_spru, 2), new Object [] {
				"yxy",
				"xzx",
				"yxy",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Items.PAPER),
				'z', new ItemStack(Blocks.PLANKS, 1, 1)
		});

		/*障子 甲*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.SHOUJIA_CL, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.SHOUJI_CL)
		});

		/*障子 甲(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.SHOUJIA_CL_aca, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.SHOUJI_CL_aca)
		});

		/*障子 甲(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.SHOUJIA_CL_bir, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.SHOUJI_CL_bir)
		});

		/*障子 甲(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.SHOUJIA_CL_doak, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.SHOUJI_CL_doak)
		});

		/*障子 甲(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.SHOUJIA_CL_jun, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.SHOUJI_CL_jun)
		});

		/*障子 甲(マツ)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.SHOUJIA_CL_spru, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.SHOUJI_CL_spru)
		});

		/*障子ハーフ*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.SHOUJIH_CL, 4), new Object [] {
				"xx",
				'x', new ItemStack(ASDecoModFusuma.SHOUJI_CL)
		});

		/*障子ハーフ(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.SHOUJIH_CL_aca, 4), new Object [] {
				"xx",
				'x', new ItemStack(ASDecoModFusuma.SHOUJI_CL_aca)
		});

		/*障子ハーフ(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.SHOUJIH_CL_bir, 4), new Object [] {
				"xx",
				'x', new ItemStack(ASDecoModFusuma.SHOUJI_CL_bir)
		});

		/*障子ハーフ(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.SHOUJIH_CL_doak, 4), new Object [] {
				"xx",
				'x', new ItemStack(ASDecoModFusuma.SHOUJI_CL_doak)
		});

		/*障子ハーフ(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.SHOUJIH_CL_jun, 4), new Object [] {
				"xx",
				'x', new ItemStack(ASDecoModFusuma.SHOUJI_CL_jun)
		});

		/*障子ハーフ(マツ)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.SHOUJIH_CL_spru, 4), new Object [] {
				"xx",
				'x', new ItemStack(ASDecoModFusuma.SHOUJI_CL_spru)
		});

		/*ガラス戸*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.GARASUDO_CL, 2), new Object [] {
				"yxy",
				"xzx",
				"yxy",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.GLASS_PANE),
				'z', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*ガラス戸(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.GARASUDO_CL_aca, 2), new Object [] {
				"yxy",
				"xzx",
				"yxy",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.GLASS_PANE),
				'z', new ItemStack(Blocks.PLANKS, 1, 4)
		});

		/*ガラス戸(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.GARASUDO_CL_bir, 2), new Object [] {
				"yxy",
				"xzx",
				"yxy",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.GLASS_PANE),
				'z', new ItemStack(Blocks.PLANKS, 1, 2)
		});

		/*ガラス戸(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.GARASUDO_CL_doak, 2), new Object [] {
				"yxy",
				"xzx",
				"yxy",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.GLASS_PANE),
				'z', new ItemStack(Blocks.PLANKS, 1, 5)
		});

		/*ガラス戸(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.GARASUDO_CL_jun, 2), new Object [] {
				"yxy",
				"xzx",
				"yxy",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.GLASS_PANE),
				'z', new ItemStack(Blocks.PLANKS, 1, 3)
		});

		/*ガラス戸(マツ)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.GARASUDO_CL_spru, 2), new Object [] {
				"yxy",
				"xzx",
				"yxy",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.GLASS_PANE),
				'z', new ItemStack(Blocks.PLANKS, 1, 1)
		});

		/*ガラス戸 甲*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.GARASUDOB_CL, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.GARASUDO_CL)
		});

		/*ガラス戸 甲(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.GARASUDOB_CL_aca, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.GARASUDO_CL_aca)
		});

		/*ガラス戸 甲(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.GARASUDOB_CL_bir, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.GARASUDO_CL_bir)
		});

		/*ガラス戸 甲(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.GARASUDOB_CL_doak, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.GARASUDO_CL_doak)
		});

		/*ガラス戸 甲(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.GARASUDOB_CL_jun, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.GARASUDO_CL_jun)
		});

		/*ガラス戸 甲(マツ)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.GARASUDOB_CL_spru, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.GARASUDO_CL_spru)
		});

		/*襖(白)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMA_CL, 2), new Object [] {
				"xxx",
				"yzy",
				"xxx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Items.PAPER),
				'z', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*襖(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMA_CL_black, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL),
				'y', new ItemStack(Items.DYE, 1, 0)
		});

		/*襖(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMA_CL_blue, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL),
				'y', new ItemStack(Items.DYE, 1, 4)
		});

		/*襖(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMA_CL_brown, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL),
				'y', new ItemStack(Items.DYE, 1, 3)
		});

		/*襖(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMA_CL_cyan, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL),
				'y', new ItemStack(Items.DYE, 1, 6)
		});

		/*襖(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMA_CL_gray, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL),
				'y', new ItemStack(Items.DYE, 1, 8)
		});

		/*襖(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMA_CL_green, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL),
				'y', new ItemStack(Items.DYE, 1, 2)
		});

		/*襖(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMA_CL_lightb, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL),
				'y', new ItemStack(Items.DYE, 1, 12)
		});

		/*襖(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMA_CL_lightg, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL),
				'y', new ItemStack(Items.DYE, 1, 7)
		});

		/*襖(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMA_CL_lime, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL),
				'y', new ItemStack(Items.DYE, 1, 10)
		});

		/*襖(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMA_CL_magenta, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL),
				'y', new ItemStack(Items.DYE, 1, 13)
		});

		/*襖(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMA_CL_orange, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL),
				'y', new ItemStack(Items.DYE, 1, 14)
		});

		/*襖(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMA_CL_pink, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL),
				'y', new ItemStack(Items.DYE, 1, 9)
		});

		/*襖(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMA_CL_purple, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL),
				'y', new ItemStack(Items.DYE, 1, 5)
		});

		/*襖(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMA_CL_red, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL),
				'y', new ItemStack(Items.DYE, 1, 1)
		});

		/*襖(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMA_CL_yellow, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL),
				'y', new ItemStack(Items.DYE, 1, 11)
		});

		/*襖 甲(白)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMAB_CL, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL)
		});

		/*襖 甲(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMAB_CL_black, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL_black)
		});

		/*襖 甲(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMAB_CL_blue, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL_blue)
		});

		/*襖 甲(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMAB_CL_brown, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL_brown)
		});

		/*襖 甲(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMAB_CL_cyan, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL_cyan)
		});

		/*襖 甲(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMAB_CL_gray, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL_gray)
		});

		/*襖 甲(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMAB_CL_green, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL_green)
		});

		/*襖 甲(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMAB_CL_lightb, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL_lightb)
		});

		/*襖 甲(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMAB_CL_lightg, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL_lightg)
		});

		/*襖 甲(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMAB_CL_lime, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL_lime)
		});

		/*襖 甲(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMAB_CL_magenta, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL_magenta)
		});

		/*襖 甲(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMAB_CL_orange, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL_orange)
		});

		/*襖 甲(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMAB_CL_pink, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL_pink)
		});

		/*襖 甲(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMAB_CL_purple, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL_purple)
		});

		/*襖 甲(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMAB_CL_red, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL_red)
		});

		/*襖 甲(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModFusuma.FUSUMAB_CL_yellow, 1), new Object [] {
				"x",
				'x', new ItemStack(ASDecoModFusuma.FUSUMA_CL_yellow)
		});
	}

}
