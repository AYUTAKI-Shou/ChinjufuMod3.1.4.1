package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.New_ChinjufuModItems;
import com.ayutaki.chinjufumod.init.New_ChinjufuModWeapons;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class CraftingCWeapons {

	public CraftingCWeapons() {
		register();
	}

	public static void register() {

		/*弾薬*/
		GameRegistry.addShapelessRecipe(new ItemStack(New_ChinjufuModWeapons.AMMUNITION_KC, 9), Items.IRON_INGOT, Items.GUNPOWDER, New_ChinjufuModItems.WORK_ORDER);

		/*薬莢リサイクル*/
		GameRegistry.addRecipe(new ItemStack(Items.IRON_INGOT, 1), new Object [] {
			"xxx",
			"xxx",
			"xxx",
			'x', new ItemStack(New_ChinjufuModWeapons.CARTRIDGE_KC)
		});

		/*12.7cm連装砲
		GameRegistry.addShapelessRecipe(new ItemStack(New_ChinjufuModWeapons.RENSOUHOU_127, 1),
				Items.IRON_INGOT, Items.COAL, New_ChinjufuModItems.BAUXITE, New_ChinjufuModWeapons.AMMUNITION_KC, New_ChinjufuModItems.WORK_ORDER);*/

		/*12.7cm連装砲*/
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(New_ChinjufuModWeapons.RENSOUHOU_127, 1),
				Items.IRON_INGOT, Items.COAL, "ingotAluminium", New_ChinjufuModWeapons.AMMUNITION_KC, New_ChinjufuModItems.WORK_ORDER));

		/*時雨砲*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModWeapons.SHIGUREHOU, 1), new Object [] {
				"xy",
				'x', new ItemStack(New_ChinjufuModWeapons.RENSOUHOU_127),
				'y', new ItemStack(Items.DYE, 1, 0)
		});

		/*10.0cm連装高角砲*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModWeapons.KOUKAKUHOU_100, 1), new Object [] {
				"xy",
				'x', new ItemStack(New_ChinjufuModWeapons.RENSOUHOU_127),
				'y', new ItemStack(Items.DYE, 1, 1)
		});

	}

}
