package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ChinjufuModBlocks;
import com.ayutaki.chinjufumod.init.New_ChinjufuModBlocks;
import com.ayutaki.chinjufumod.init.New_ChinjufuModItems;
import com.ayutaki.chinjufumod.init.New_ChinjufuModWeapons;
import com.ayutaki.chinjufumod.init.TTimeItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class CraftingCBlocks {

	public CraftingCBlocks() {
		register();
	}

	public static void register() {
		//定形レシピ
		GameRegistry.addRecipe(new ItemStack(ChinjufuModBlocks.EMPTY_BOX, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Blocks.PLANKS),
			'y', new ItemStack(New_ChinjufuModItems.WORK_ORDER, 1, 0)
		});


		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModBlocks.OIL_DRUM, 1), new Object [] {
				"xx",
				"xx",
				'x', new ItemStack(Items.COAL)
		});

		GameRegistry.addShapelessRecipe(new ItemStack(Items.COAL, 4), New_ChinjufuModBlocks.OIL_DRUM);

		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModBlocks.AMMUNITION_BOX, 1), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(New_ChinjufuModWeapons.AMMUNITION_KC),
				'y', new ItemStack(ChinjufuModBlocks.EMPTY_BOX, 1, 0)
		});

		/*GameRegistry.addShapelessRecipe(new ItemStack(New_ChinjufuModWeapons.AMMUNITION_KC, 8),
				New_ChinjufuModBlocks.AMMUNITION_BOX);*/

		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModBlocks.STEEL_BLOCK, 2), new Object [] {
				"xxx",
				"x#x",
				"xxx",
				'x', new ItemStack(Items.IRON_INGOT)
		});

		GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 4), New_ChinjufuModBlocks.STEEL_BLOCK);

		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModBlocks.BAUXITE_BOX, 1), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(New_ChinjufuModItems.BAUXITE),
				'y', new ItemStack(ChinjufuModBlocks.EMPTY_BOX, 1, 0)
		});

		/*GameRegistry.addShapelessRecipe(new ItemStack(New_ChinjufuModItems.BAUXITE, 8),
				New_ChinjufuModBlocks.BAUXITE_BOX);*/

		/*提督ノ判子(ブロック)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModBlocks.B_ADMIRAL_STAMP, 1), new Object [] {
				"x",
				'x', new ItemStack(New_ChinjufuModItems.ADMIRAL_STAMP, 1, OreDictionary.WILDCARD_VALUE)
		});

		/*アルミブロック*/
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(New_ChinjufuModBlocks.ALUMI_BLOCK, 2),
				"xxx",
				"x#x",
				"xxx",
				'x', "ingotAluminium"));

		GameRegistry.addShapelessRecipe(new ItemStack(TTimeItems.ALUMINUM, 4), New_ChinjufuModBlocks.ALUMI_BLOCK);
	}

}
