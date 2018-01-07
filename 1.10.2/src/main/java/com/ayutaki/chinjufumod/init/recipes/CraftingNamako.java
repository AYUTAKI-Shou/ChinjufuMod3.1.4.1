package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ASDecoModKawara;
import com.ayutaki.chinjufumod.init.ASDecoModNamako;
import com.ayutaki.chinjufumod.init.ASDecoModPlaster;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingNamako {

	public CraftingNamako() {
		register();
	}

	public static void register() {
		/*なまこ壁(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_black, 4), new Object [] {
				"xy",
				"yx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_black)
		});

		/*なまこ壁(白)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_white, 4), new Object [] {
				"xy",
				"yx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_white)
		});

		/*なまこ壁(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_blue, 4), new Object [] {
				"xy",
				"yx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_blue)
		});

		/*なまこ壁(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_brown, 4), new Object [] {
				"xy",
				"yx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_brown)
		});

		/*なまこ壁(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_cyan, 4), new Object [] {
				"xy",
				"yx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_cyan)
		});

		/*なまこ壁(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_gray, 4), new Object [] {
				"xy",
				"yx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_gray)
		});

		/*なまこ壁(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_green, 4), new Object [] {
				"xy",
				"yx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_green)
		});

		/*なまこ壁(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_lightb, 4), new Object [] {
				"xy",
				"yx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_lightb)
		});

		/*なまこ壁(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_lightg, 4), new Object [] {
				"xy",
				"yx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_lightg)
		});

		/*なまこ壁(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_lime, 4), new Object [] {
				"xy",
				"yx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_lime)
		});

		/*なまこ壁(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_magenta, 4), new Object [] {
				"xy",
				"yx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_magenta)
		});

		/*なまこ壁(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_orange, 4), new Object [] {
				"xy",
				"yx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_orange)
		});

		/*なまこ壁(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_pink, 4), new Object [] {
				"xy",
				"yx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_pink)
		});

		/*なまこ壁(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_purple, 4), new Object [] {
				"xy",
				"yx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_purple)
		});

		/*なまこ壁(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_red, 4), new Object [] {
				"xy",
				"yx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_red)
		});

		/*なまこ壁(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_yellow, 4), new Object [] {
				"xy",
				"yx",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_yellow)
		});

		/*なまこ壁階段(白)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_ST_white, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_white)
		});

		/*なまこ壁階段(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_ST_black, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_black)
		});

		/*なまこ壁階段(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_ST_blue, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_blue)
		});

		/*なまこ壁階段(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_ST_brown, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_brown)
		});

		/*なまこ壁階段(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_ST_cyan, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_cyan)
		});

		/*なまこ壁階段(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_ST_gray, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_gray)
		});

		/*なまこ壁階段(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_ST_green, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_green)
		});

		/*なまこ壁階段(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_ST_lightb, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_lightb)
		});

		/*なまこ壁階段(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_ST_lightg, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_lightg)
		});

		/*なまこ壁階段(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_ST_lime, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_lime)
		});

		/*なまこ壁階段(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_ST_magenta, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_magenta)
		});

		/*なまこ壁階段(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_ST_orange, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_orange)
		});

		/*なまこ壁階段(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_ST_pink, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_pink)
		});

		/*なまこ壁階段(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_ST_purple, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_purple)
		});

		/*なまこ壁階段(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_ST_red, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_red)
		});

		/*なまこ壁階段(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_ST_yellow, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_yellow)
		});

		/*なまこ壁ハーフ(白)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_SH_white, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_white)
		});

		/*なまこ壁ハーフ(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_SH_black, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_black)
		});

		/*なまこ壁ハーフ(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_SH_blue, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_blue)
		});

		/*なまこ壁ハーフ(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_SH_brown, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_brown)
		});

		/*なまこ壁ハーフ(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_SH_cyan, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_cyan)
		});

		/*なまこ壁ハーフ(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_SH_gray, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_gray)
		});

		/*なまこ壁ハーフ(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_SH_green, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_green)
		});

		/*なまこ壁ハーフ(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_SH_lightb, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_lightb)
		});

		/*なまこ壁ハーフ(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_SH_lightg, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_lightg)
		});

		/*なまこ壁ハーフ(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_SH_lime, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_lime)
		});

		/*なまこ壁ハーフ(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_SH_magenta, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_magenta)
		});

		/*なまこ壁ハーフ(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_SH_orange, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_orange)
		});

		/*なまこ壁ハーフ(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_SH_pink, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_pink)
		});

		/*なまこ壁ハーフ(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_SH_purple, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_purple)
		});

		/*なまこ壁ハーフ(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_SH_red, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_red)
		});

		/*なまこ壁ハーフ(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKO_SH_yellow, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKO_yellow)
		});

		/*なまこ壁 甲(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_black, 4), new Object [] {
				"xx",
				"yy",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_black)
		});

		/*なまこ壁 甲(白)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_white, 4), new Object [] {
				"xx",
				"yy",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_white)
		});

		/*なまこ壁 甲(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_blue, 4), new Object [] {
				"xx",
				"yy",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_blue)
		});

		/*なまこ壁 甲(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_brown, 4), new Object [] {
				"xx",
				"yy",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_brown)
		});

		/*なまこ壁 甲(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_cyan, 4), new Object [] {
				"xx",
				"yy",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_cyan)
		});

		/*なまこ壁 甲(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_gray, 4), new Object [] {
				"xx",
				"yy",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_gray)
		});

		/*なまこ壁 甲(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_green, 4), new Object [] {
				"xx",
				"yy",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_green)
		});

		/*なまこ壁 甲(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_lightb, 4), new Object [] {
				"xx",
				"yy",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_lightb)
		});

		/*なまこ壁 甲(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_lightg, 4), new Object [] {
				"xx",
				"yy",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_lightg)
		});

		/*なまこ壁 甲(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_lime, 4), new Object [] {
				"xx",
				"yy",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_lime)
		});

		/*なまこ壁 甲(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_magenta, 4), new Object [] {
				"xx",
				"yy",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_magenta)
		});

		/*なまこ壁 甲(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_orange, 4), new Object [] {
				"xx",
				"yy",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_orange)
		});

		/*なまこ壁 甲(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_pink, 4), new Object [] {
				"xx",
				"yy",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_pink)
		});

		/*なまこ壁 甲(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_purple, 4), new Object [] {
				"xx",
				"yy",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_purple)
		});

		/*なまこ壁 甲(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_red, 4), new Object [] {
				"xx",
				"yy",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_red)
		});

		/*なまこ壁 甲(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_yellow, 4), new Object [] {
				"xx",
				"yy",
				'x', new ItemStack(ASDecoModKawara.KAWARA_black),
				'y', new ItemStack(ASDecoModPlaster.SHIKKUI_yellow)
		});

		/*なまこ壁 甲階段(白)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_ST_white, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_white)
		});

		/*なまこ壁 甲階段(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_ST_black, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_black)
		});

		/*なまこ壁 甲階段(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_ST_blue, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_blue)
		});

		/*なまこ壁 甲階段(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_ST_brown, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_brown)
		});

		/*なまこ壁 甲階段(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_ST_cyan, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_cyan)
		});

		/*なまこ壁 甲階段(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_ST_gray, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_gray)
		});

		/*なまこ壁 甲階段(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_ST_green, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_green)
		});

		/*なまこ壁 甲階段(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_ST_lightb, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_lightb)
		});

		/*なまこ壁 甲階段(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_ST_lightg, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_lightg)
		});

		/*なまこ壁 甲階段(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_ST_lime, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_lime)
		});

		/*なまこ壁 甲階段(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_ST_magenta, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_magenta)
		});

		/*なまこ壁 甲階段(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_ST_orange, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_orange)
		});

		/*なまこ壁 甲階段(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_ST_pink, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_pink)
		});

		/*なまこ壁 甲階段(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_ST_purple, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_purple)
		});

		/*なまこ壁 甲階段(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_ST_red, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_red)
		});

		/*なまこ壁 甲階段(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_ST_yellow, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_yellow)
		});

		/*なまこ壁 甲ハーフ(白)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_SH_white, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_white)
		});

		/*なまこ壁 甲ハーフ(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_SH_black, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_black)
		});

		/*なまこ壁 甲ハーフ(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_SH_blue, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_blue)
		});

		/*なまこ壁 甲ハーフ(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_SH_brown, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_brown)
		});

		/*なまこ壁 甲ハーフ(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_SH_cyan, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_cyan)
		});

		/*なまこ壁 甲ハーフ(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_SH_gray, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_gray)
		});

		/*なまこ壁 甲ハーフ(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_SH_green, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_green)
		});

		/*なまこ壁 甲ハーフ(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_SH_lightb, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_lightb)
		});

		/*なまこ壁 甲ハーフ(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_SH_lightg, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_lightg)
		});

		/*なまこ壁 甲ハーフ(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_SH_lime, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_lime)
		});

		/*なまこ壁 甲ハーフ(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_SH_magenta, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_magenta)
		});

		/*なまこ壁 甲ハーフ(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_SH_orange, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_orange)
		});

		/*なまこ壁 甲ハーフ(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_SH_pink, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_pink)
		});

		/*なまこ壁 甲ハーフ(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_SH_purple, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_purple)
		});

		/*なまこ壁 甲ハーフ(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_SH_red, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_red)
		});

		/*なまこ壁 甲ハーフ(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNamako.NAMAKOB_SH_yellow, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModNamako.NAMAKOB_yellow)
		});
	}

}
