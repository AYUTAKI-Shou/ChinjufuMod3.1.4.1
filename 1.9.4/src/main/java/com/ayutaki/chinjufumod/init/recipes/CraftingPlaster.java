package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ASDecoModKamoi;
import com.ayutaki.chinjufumod.init.ASDecoModPlaster;
import com.ayutaki.chinjufumod.init.New_ChinjufuModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingPlaster {

	public CraftingPlaster() {
		register();
	}

	public static void register() {
		/*消石灰*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModItems.SHOUSEKKAI, 4), new Object [] {
			"xx",
			"xx",
			'x', new ItemStack(Blocks.COBBLESTONE)
		});

		/*漆喰*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_white, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(New_ChinjufuModItems.SHOUSEKKAI),
				'y', new ItemStack(Items.WATER_BUCKET)
		});

		/*漆喰(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_black, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_white),
				'y', new ItemStack(Items.DYE, 1, 0)
		});

		/*漆喰(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_blue, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_white),
				'y', new ItemStack(Items.DYE, 1, 4)
		});

		/*漆喰(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_brown, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_white),
				'y', new ItemStack(Items.DYE, 1, 3)
		});

		/*漆喰(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_cyan, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_white),
				'y', new ItemStack(Items.DYE, 1, 6)
		});

		/*漆喰(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_gray, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_white),
				'y', new ItemStack(Items.DYE, 1, 8)
		});

		/*漆喰(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_green, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_white),
				'y', new ItemStack(Items.DYE, 1, 2)
		});

		/*漆喰(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_lightb, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_white),
				'y', new ItemStack(Items.DYE, 1, 12)
		});

		/*漆喰(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_lightg, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_white),
				'y', new ItemStack(Items.DYE, 1, 7)
		});

		/*漆喰(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_lime, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_white),
				'y', new ItemStack(Items.DYE, 1, 10)
		});

		/*漆喰(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_magenta, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_white),
				'y', new ItemStack(Items.DYE, 1, 13)
		});

		/*漆喰(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_orange, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_white),
				'y', new ItemStack(Items.DYE, 1, 14)
		});

		/*漆喰(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_pink, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_white),
				'y', new ItemStack(Items.DYE, 1, 9)
		});

		/*漆喰(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_purple, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_white),
				'y', new ItemStack(Items.DYE, 1, 5)
		});

		/*漆喰(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_red, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_white),
				'y', new ItemStack(Items.DYE, 1, 1)
		});

		/*漆喰(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_yellow, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_white),
				'y', new ItemStack(Items.DYE, 1, 11)
		});

		/*漆喰階段*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_ST_white, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_white)
		});

		/*漆喰階段(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_ST_black, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_black)
		});

		/*漆喰階段(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_ST_blue, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_blue)
		});

		/*漆喰階段(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_ST_brown, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_brown)
		});

		/*漆喰階段(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_ST_cyan, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_cyan)
		});

		/*漆喰階段(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_ST_gray, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_gray)
		});

		/*漆喰階段(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_ST_green, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_green)
		});

		/*漆喰階段(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_ST_lightb, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_lightb)
		});

		/*漆喰階段(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_ST_lightg, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_lightg)
		});

		/*漆喰階段(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_ST_lime, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_lime)
		});

		/*漆喰階段(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_ST_magenta, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_magenta)
		});

		/*漆喰階段(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_ST_orange, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_orange)
		});

		/*漆喰階段(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_ST_pink, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_pink)
		});

		/*漆喰階段(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_ST_purple, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_purple)
		});

		/*漆喰階段(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_ST_red, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_red)
		});

		/*漆喰階段(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_ST_yellow, 4), new Object [] {
				"##x",
				"#xx",
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_yellow)
		});

		/*漆喰ハーフ*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_SH_white, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_white)
		});

		/*漆喰ハーフ(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_SH_black, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_black)
		});

		/*漆喰ハーフ(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_SH_blue, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_blue)
		});

		/*漆喰ハーフ(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_SH_brown, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_brown)
		});

		/*漆喰ハーフ(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_SH_cyan, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_cyan)
		});

		/*漆喰ハーフ(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_SH_gray, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_gray)
		});

		/*漆喰ハーフ(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_SH_green, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_green)
		});

		/*漆喰ハーフ(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_SH_lightb, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_lightb)
		});

		/*漆喰ハーフ(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_SH_lightg, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_lightg)
		});

		/*漆喰ハーフ(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_SH_lime, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_lime)
		});

		/*漆喰ハーフ(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_SH_magenta, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_magenta)
		});

		/*漆喰ハーフ(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_SH_orange, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_orange)
		});

		/*漆喰ハーフ(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_SH_pink, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_pink)
		});

		/*漆喰ハーフ(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_SH_purple, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_purple)
		});

		/*漆喰ハーフ(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_SH_red, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_red)
		});

		/*漆喰ハーフ(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModPlaster.SHIKKUI_SH_yellow, 6), new Object [] {
				"xxx",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_yellow)
		});


		/*アカシア漆喰*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_white_a, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_white),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*アカシア漆喰(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_black_a, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_black),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*アカシア漆喰(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_blue_a, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_blue),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*アカシア漆喰(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_brown_a, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_brown),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*アカシア漆喰(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_cyan_a, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_cyan),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*アカシア漆喰(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_gray_a, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_gray),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*アカシア漆喰(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_green_a, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_green),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*アカシア漆喰(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_lightb_a, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_lightb),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*アカシア漆喰(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_lightg_a, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_lightg),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*アカシア漆喰(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_lime_a, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_lime),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*アカシア漆喰(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_magenta_a, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_magenta),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*アカシア漆喰(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_orange_a, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_orange),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*アカシア漆喰(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_pink_a, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_pink),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*アカシア漆喰(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_purple_a, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_purple),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*アカシア漆喰(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_red_a, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_red),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*アカシア漆喰(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_yellow_a, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_yellow),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*シラカバ漆喰*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_white_b, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_white),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*シラカバ漆喰(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_black_b, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_black),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*シラカバ漆喰(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_blue_b, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_blue),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*シラカバ漆喰(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_brown_b, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_brown),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*シラカバ漆喰(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_cyan_b, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_cyan),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*シラカバ漆喰(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_gray_b, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_gray),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*シラカバ漆喰(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_green_b, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_green),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*シラカバ漆喰(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_lightb_b, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_lightb),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*シラカバ漆喰(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_lightg_b, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_lightg),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*シラカバ漆喰(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_lime_b, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_lime),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*シラカバ漆喰(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_magenta_b, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_magenta),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*シラカバ漆喰(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_orange_b, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_orange),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*シラカバ漆喰(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_pink_b, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_pink),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*シラカバ漆喰(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_purple_b, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_purple),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*シラカバ漆喰(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_red_b, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_red),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*シラカバ漆喰(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_yellow_b, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_yellow),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*ダークオーク漆喰*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_white_d, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_white),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*ダークオーク漆喰(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_black_d, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_black),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*ダークオーク漆喰(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_blue_d, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_blue),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*ダークオーク漆喰(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_brown_d, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_brown),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*ダークオーク漆喰(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_cyan_d, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_cyan),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*ダークオーク漆喰(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_gray_d, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_gray),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*ダークオーク漆喰(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_green_d, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_green),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*ダークオーク漆喰(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_lightb_d, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_lightb),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*ダークオーク漆喰(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_lightg_d, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_lightg),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*ダークオーク漆喰(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_lime_d, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_lime),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*ダークオーク漆喰(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_magenta_d, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_magenta),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*ダークオーク漆喰(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_orange_d, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_orange),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*ダークオーク漆喰(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_pink_d, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_pink),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*ダークオーク漆喰(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_purple_d, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_purple),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*ダークオーク漆喰(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_red_d, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_red),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*ダークオーク漆喰(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_yellow_d, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_yellow),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*ジャングル漆喰*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_white_j, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_white),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*ジャングル漆喰(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_black_j, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_black),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*ジャングル漆喰(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_blue_j, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_blue),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*ジャングル漆喰(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_brown_j, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_brown),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*ジャングル漆喰(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_cyan_j, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_cyan),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*ジャングル漆喰(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_gray_j, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_gray),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*ジャングル漆喰(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_green_j, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_green),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*ジャングル漆喰(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_lightb_j, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_lightb),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*ジャングル漆喰(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_lightg_j, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_lightg),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*ジャングル漆喰(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_lime_j, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_lime),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*ジャングル漆喰(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_magenta_j, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_magenta),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*ジャングル漆喰(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_orange_j, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_orange),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*ジャングル漆喰(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_pink_j, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_pink),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*ジャングル漆喰(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_purple_j, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_purple),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*ジャングル漆喰(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_red_j, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_red),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*ジャングル漆喰(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_yellow_j, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_yellow),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*オーク漆喰*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_white_o, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_white),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*オーク漆喰(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_black_o, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_black),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*オーク漆喰(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_blue_o, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_blue),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*オーク漆喰(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_brown_o, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_brown),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*オーク漆喰(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_cyan_o, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_cyan),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*オーク漆喰(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_gray_o, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_gray),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*オーク漆喰(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_green_o, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_green),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*オーク漆喰(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_lightb_o, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_lightb),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*オーク漆喰(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_lightg_o, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_lightg),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*オーク漆喰(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_lime_o, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_lime),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*オーク漆喰(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_magenta_o, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_magenta),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*オーク漆喰(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_orange_o, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_orange),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*オーク漆喰(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_pink_o, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_pink),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*オーク漆喰(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_purple_o, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_purple),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*オーク漆喰(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_red_o, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_red),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*オーク漆喰(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_yellow_o, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_yellow),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*マツ漆喰*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_white_s, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_white),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*マツ漆喰(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_black_s, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_black),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*マツ漆喰(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_blue_s, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_blue),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*マツ漆喰(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_brown_s, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_brown),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*マツ漆喰(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_cyan_s, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_cyan),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*マツ漆喰(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_gray_s, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_gray),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*マツ漆喰(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_green_s, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_green),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*マツ漆喰(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_lightb_s, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_lightb),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*マツ漆喰(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_lightg_s, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_lightg),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*マツ漆喰(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_lime_s, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_lime),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*マツ漆喰(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_magenta_s, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_magenta),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*マツ漆喰(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_orange_s, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_orange),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*マツ漆喰(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_pink_s, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_pink),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*マツ漆喰(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_purple_s, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_purple),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*マツ漆喰(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_red_s, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_red),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*マツ漆喰(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModKamoi.KAMOI_yellow_s, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModPlaster.SHIKKUI_SH_yellow),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

	}

}
