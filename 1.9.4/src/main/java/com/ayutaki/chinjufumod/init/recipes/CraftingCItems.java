package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.New_ChinjufuModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class CraftingCItems {

	public CraftingCItems() {
		register();
	}

	public static void register() {
		/*定形レシピ*/
		/*提督ノ決裁印*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModItems.ADMIRAL_STAMP, 1), new Object [] {
			"#x#",
			"xxx",
			"yyy",
			'x', new ItemStack(Blocks.PLANKS),
			'y', new ItemStack(Items.DYE, 1, 1)
		});

		/*墨*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModItems.SUMI, 9), new Object [] {
				"x",
				'x', new ItemStack(Items.COAL, 1, 1)
		});

		GameRegistry.addRecipe(new ItemStack(Items.COAL, 1, 1), new Object [] {
				"xxx",
				"xxx",
				"xxx",
				'x', new ItemStack(New_ChinjufuModItems.SUMI)
		});

		/*耐久値を消費するレシピ*/
		/*指示書の発行*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModItems.WORK_ORDER, 8), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(Items.PAPER),
				'y', new ItemStack(New_ChinjufuModItems.ADMIRAL_STAMP, 1, OreDictionary.WILDCARD_VALUE)
		});

	}

}
