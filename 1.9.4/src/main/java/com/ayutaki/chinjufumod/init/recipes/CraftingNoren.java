package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ASDecoModNoren;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingNoren {

	public CraftingNoren() {
		register();
	}

	public static void register() {
		/*のれん(白)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNoren.NOREN_white, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});

		/*のれん(黒)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNoren.NOREN_black, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.CARPET, 1, 15)
		});

		/*のれん(青)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNoren.NOREN_blue, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.CARPET, 1, 11)
		});

		/*のれん(茶)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNoren.NOREN_brown, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.CARPET, 1, 12)
		});

		/*のれん(水)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNoren.NOREN_cyan, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.CARPET, 1, 9)
		});

		/*のれん(灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNoren.NOREN_gray, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.CARPET, 1, 7)
		});

		/*のれん(緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNoren.NOREN_green, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.CARPET, 1, 13)
		});

		/*のれん(空)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNoren.NOREN_lightb, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.CARPET, 1, 3)
		});

		/*のれん(薄灰)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNoren.NOREN_lightg, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.CARPET, 1, 8)
		});

		/*のれん(黄緑)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNoren.NOREN_lime, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.CARPET, 1, 5)
		});

		/*のれん(赤紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNoren.NOREN_magenta, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.CARPET, 1, 2)
		});

		/*のれん(橙)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNoren.NOREN_orange, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.CARPET, 1, 1)
		});

		/*のれん(桃)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNoren.NOREN_pink, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.CARPET, 1, 6)
		});

		/*のれん(紫)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNoren.NOREN_purple, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.CARPET, 1, 10)
		});

		/*のれん(赤)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNoren.NOREN_red, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.CARPET, 1, 14)
		});

		/*のれん(黄)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModNoren.NOREN_yellow, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.CARPET, 1, 4)
		});

	}

}
