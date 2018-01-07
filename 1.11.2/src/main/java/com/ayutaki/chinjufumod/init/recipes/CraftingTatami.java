package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ASDecoModTatami;
import com.ayutaki.chinjufumod.init.TTimeItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingTatami {

	public CraftingTatami() {
		register();
	}

	public static void register() {
		/*畳(縁無し)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.TATAMI_H, 4), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(Items.WHEAT),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.TATAMI_H, 4), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(TTimeItems.INE),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*畳(白)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.TATAMI_H_white, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModTatami.TATAMI_H),
				'y', new ItemStack(Blocks.WOOL, 1, 0)
		});

		/*畳(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.TATAMI_H_black, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModTatami.TATAMI_H),
				'y', new ItemStack(Blocks.WOOL, 1, 15)
		});

		/*畳(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.TATAMI_H_blue, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModTatami.TATAMI_H),
				'y', new ItemStack(Blocks.WOOL, 1, 11)
		});

		/*畳(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.TATAMI_H_brown, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModTatami.TATAMI_H),
				'y', new ItemStack(Blocks.WOOL, 1, 12)
		});

		/*畳(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.TATAMI_H_cyan, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModTatami.TATAMI_H),
				'y', new ItemStack(Blocks.WOOL, 1, 9)
		});

		/*畳(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.TATAMI_H_gray, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModTatami.TATAMI_H),
				'y', new ItemStack(Blocks.WOOL, 1, 7)
		});

		/*畳(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.TATAMI_H_green, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModTatami.TATAMI_H),
				'y', new ItemStack(Blocks.WOOL, 1, 13)
		});

		/*畳(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.TATAMI_H_lightb, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModTatami.TATAMI_H),
				'y', new ItemStack(Blocks.WOOL, 1, 3)
		});

		/*畳(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.TATAMI_H_lightg, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModTatami.TATAMI_H),
				'y', new ItemStack(Blocks.WOOL, 1, 8)
		});

		/*畳(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.TATAMI_H_lime, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModTatami.TATAMI_H),
				'y', new ItemStack(Blocks.WOOL, 1, 5)
		});

		/*畳(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.TATAMI_H_magenta, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModTatami.TATAMI_H),
				'y', new ItemStack(Blocks.WOOL, 1, 2)
		});

		/*畳(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.TATAMI_H_orange, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModTatami.TATAMI_H),
				'y', new ItemStack(Blocks.WOOL, 1, 1)
		});

		/*畳(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.TATAMI_H_pink, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModTatami.TATAMI_H),
				'y', new ItemStack(Blocks.WOOL, 1, 6)
		});

		/*畳(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.TATAMI_H_purple, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModTatami.TATAMI_H),
				'y', new ItemStack(Blocks.WOOL, 1, 10)
		});

		/*畳(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.TATAMI_H_red, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModTatami.TATAMI_H),
				'y', new ItemStack(Blocks.WOOL, 1, 14)
		});

		/*畳(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.TATAMI_H_yellow, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ASDecoModTatami.TATAMI_H),
				'y', new ItemStack(Blocks.WOOL, 1, 4)
		});

		/*布団*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.FUTON_C_white, 1), new Object [] {
				"xyx",
				'x', new ItemStack(Blocks.WOOL, 1, 0),
				'y', new ItemStack(Blocks.WOOL, 1, 0)
		});

		/*布団(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.FUTON_C_black, 1), new Object [] {
				"xyx",
				'x', new ItemStack(Blocks.WOOL, 1, 0),
				'y', new ItemStack(Blocks.WOOL, 1, 15)
		});

		/*布団(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.FUTON_C_blue, 1), new Object [] {
				"xyx",
				'x', new ItemStack(Blocks.WOOL, 1, 0),
				'y', new ItemStack(Blocks.WOOL, 1, 11)
		});

		/*布団(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.FUTON_C_brown, 1), new Object [] {
				"xyx",
				'x', new ItemStack(Blocks.WOOL, 1, 0),
				'y', new ItemStack(Blocks.WOOL, 1, 12)
		});

		/*布団(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.FUTON_C_cyan, 1), new Object [] {
				"xyx",
				'x', new ItemStack(Blocks.WOOL, 1, 0),
				'y', new ItemStack(Blocks.WOOL, 1, 9)
		});

		/*布団(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.FUTON_C_gray, 1), new Object [] {
				"xyx",
				'x', new ItemStack(Blocks.WOOL, 1, 0),
				'y', new ItemStack(Blocks.WOOL, 1, 7)
		});

		/*布団(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.FUTON_C_green, 1), new Object [] {
				"xyx",
				'x', new ItemStack(Blocks.WOOL, 1, 0),
				'y', new ItemStack(Blocks.WOOL, 1, 13)
		});

		/*布団(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.FUTON_C_lightb, 1), new Object [] {
				"xyx",
				'x', new ItemStack(Blocks.WOOL, 1, 0),
				'y', new ItemStack(Blocks.WOOL, 1, 3)
		});

		/*布団(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.FUTON_C_lightg, 1), new Object [] {
				"xyx",
				'x', new ItemStack(Blocks.WOOL, 1, 0),
				'y', new ItemStack(Blocks.WOOL, 1, 8)
		});

		/*布団(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.FUTON_C_lime, 1), new Object [] {
				"xyx",
				'x', new ItemStack(Blocks.WOOL, 1, 0),
				'y', new ItemStack(Blocks.WOOL, 1, 5)
		});

		/*布団(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.FUTON_C_magenta, 1), new Object [] {
				"xyx",
				'x', new ItemStack(Blocks.WOOL, 1, 0),
				'y', new ItemStack(Blocks.WOOL, 1, 2)
		});

		/*布団(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.FUTON_C_orange, 1), new Object [] {
				"xyx",
				'x', new ItemStack(Blocks.WOOL, 1, 0),
				'y', new ItemStack(Blocks.WOOL, 1, 1)
		});

		/*布団(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.FUTON_C_pink, 1), new Object [] {
				"xyx",
				'x', new ItemStack(Blocks.WOOL, 1, 0),
				'y', new ItemStack(Blocks.WOOL, 1, 6)
		});

		/*布団(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.FUTON_C_purple, 1), new Object [] {
				"xyx",
				'x', new ItemStack(Blocks.WOOL, 1, 0),
				'y', new ItemStack(Blocks.WOOL, 1, 10)
		});

		/*布団(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.FUTON_C_red, 1), new Object [] {
				"xyx",
				'x', new ItemStack(Blocks.WOOL, 1, 0),
				'y', new ItemStack(Blocks.WOOL, 1, 14)
		});

		/*布団(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModTatami.FUTON_C_yellow, 1), new Object [] {
				"xyx",
				'x', new ItemStack(Blocks.WOOL, 1, 0),
				'y', new ItemStack(Blocks.WOOL, 1, 4)
		});

	}

}
