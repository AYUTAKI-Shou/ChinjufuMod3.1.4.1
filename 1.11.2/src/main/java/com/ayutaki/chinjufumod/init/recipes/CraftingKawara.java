package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ASDecoModKawara;
import com.ayutaki.chinjufumod.init.New_ChinjufuModItems;
import com.ayutaki.chinjufumod.init.TTimeItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingKawara {

	public CraftingKawara() {
		register();
	}

	public static void register() {
		/*粘土*/
		GameRegistry.addRecipe(new ItemStack(Items.CLAY_BALL, 32), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Blocks.GRASS),
			'y', new ItemStack(Items.WATER_BUCKET)
		});

		/*粘土瓦*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModItems.CLAYKAWARA, 2), new Object [] {
			"xxx",
			"x#x",
			"xxx",
			'x', new ItemStack(Items.CLAY_BALL)
		});

		/*瓦(白)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_white, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(Items.DYE, 1, 15)
		});

		/*瓦(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_blue, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(Items.DYE, 1, 4)
		});

		/*瓦(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_brown, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(Items.DYE, 1, 3)
		});

		/*瓦(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_cyan, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(Items.DYE, 1, 6)
		});

		/*瓦(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_gray, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(Items.DYE, 1, 8)
		});

		/*瓦(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_green, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(Items.DYE, 1, 2)
		});

		/*瓦(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_lightb, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(Items.DYE, 1, 12)
		});

		/*瓦(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_lightg, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(Items.DYE, 1, 7)
		});

		/*瓦(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_lime, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(Items.DYE, 1, 10)
		});

		/*瓦(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_magenta, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(Items.DYE, 1, 13)
		});

		/*瓦(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_orange, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(Items.DYE, 1, 14)
		});

		/*瓦(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_pink, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(Items.DYE, 1, 9)
		});

		/*瓦(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_purple, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(Items.DYE, 1, 5)
		});

		/*瓦(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_red, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(Items.DYE, 1, 1)
		});

		/*瓦(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_yellow, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(Items.DYE, 1, 11)
		});

		/*瓦階段(白)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_ST_white, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_white)
		});

		/*瓦階段(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_ST_black, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black)
		});

		/*瓦階段(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_ST_blue, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_blue)
		});

		/*瓦階段(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_ST_brown, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_brown)
		});

		/*瓦階段(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_ST_cyan, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_cyan)
		});

		/*瓦階段(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_ST_gray, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_gray)
		});

		/*瓦階段(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_ST_green, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_green)
		});

		/*瓦階段(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_ST_lightb, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_lightb)
		});

		/*瓦階段(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_ST_lightg, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_lightg)
		});

		/*瓦階段(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_ST_lime, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_lime)
		});

		/*瓦階段(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_ST_magenta, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_magenta)
		});

		/*瓦階段(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_ST_orange, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_orange)
		});

		/*瓦階段(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_ST_pink, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_pink)
		});

		/*瓦階段(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_ST_purple, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_purple)
		});

		/*瓦階段(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_ST_red, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_red)
		});

		/*瓦階段(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_ST_yellow, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_yellow)
		});

		/*瓦ハーフ(白)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_SH_white, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_white)
		});

		/*瓦ハーフ(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_SH_black, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black)
		});

		/*瓦ハーフ(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_SH_blue, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_blue)
		});

		/*瓦ハーフ(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_SH_brown, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_brown)
		});

		/*瓦ハーフ(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_SH_cyan, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_cyan)
		});

		/*瓦ハーフ(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_SH_gray, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_gray)
		});

		/*瓦ハーフ(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_SH_green, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_green)
		});

		/*瓦ハーフ(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_SH_lightb, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_lightb)
		});

		/*瓦ハーフ(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_SH_lightg, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_lightg)
		});

		/*瓦ハーフ(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_SH_lime, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_lime)
		});

		/*瓦ハーフ(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_SH_magenta, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_magenta)
		});

		/*瓦ハーフ(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_SH_orange, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_orange)
		});

		/*瓦ハーフ(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_SH_pink, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_pink)
		});

		/*瓦ハーフ(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_SH_purple, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_purple)
		});

		/*瓦ハーフ(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_SH_red, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_red)
		});

		/*瓦ハーフ(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.KAWARA_SH_yellow, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_yellow)
		});

		/*土壁*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.DIRTWALL, 6), new Object [] {
				"xxx",
				"zyz",
				"xxx",
				'x', new ItemStack(Blocks.DIRT),
				'y', new ItemStack(Items.WATER_BUCKET),
				'z', new ItemStack(Items.WHEAT)
		});

		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.DIRTWALL, 6), new Object [] {
				"xxx",
				"zyz",
				"xxx",
				'x', new ItemStack(Blocks.DIRT),
				'y', new ItemStack(Items.WATER_BUCKET),
				'z', new ItemStack(TTimeItems.INE)
		});

		/*土壁階段*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.DIRTWALL_stairs, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModKawara.DIRTWALL)
		});

		/*土壁ハーフ*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKawara.DIRTWALL_SH, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModKawara.DIRTWALL)
		});
	}

}
