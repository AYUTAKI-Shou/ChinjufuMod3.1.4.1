package com.ayutaki.chinjufumod.handlers;

import com.ayutaki.chinjufumod.init.recipes.CraftingChinjufuMod;
import com.ayutaki.chinjufumod.init.recipes.SmeltingChinjufuMod;

public class RecipeHandler {

	public static void registerCraftingRecipes() {

		/* 直書きの方が良さそうだが、参照でも通るためこの形で */
		CraftingChinjufuMod.register();
	}



	public static void registerSmeltingRecipes() {

		SmeltingChinjufuMod.register();
	}

}
