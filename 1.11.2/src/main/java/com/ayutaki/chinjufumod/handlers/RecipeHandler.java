package com.ayutaki.chinjufumod.handlers;

import com.ayutaki.chinjufumod.init.recipes.CraftingCArmor;
import com.ayutaki.chinjufumod.init.recipes.CraftingCBlocks;
import com.ayutaki.chinjufumod.init.recipes.CraftingCItems;
import com.ayutaki.chinjufumod.init.recipes.CraftingCWeapons;
import com.ayutaki.chinjufumod.init.recipes.CraftingFoodBlock;
import com.ayutaki.chinjufumod.init.recipes.CraftingFurnitures;
import com.ayutaki.chinjufumod.init.recipes.CraftingFusuma;
import com.ayutaki.chinjufumod.init.recipes.CraftingGarden;
import com.ayutaki.chinjufumod.init.recipes.CraftingHakkou;
import com.ayutaki.chinjufumod.init.recipes.CraftingHarbor;
import com.ayutaki.chinjufumod.init.recipes.CraftingKawara;
import com.ayutaki.chinjufumod.init.recipes.CraftingKit_Pan;
import com.ayutaki.chinjufumod.init.recipes.CraftingLetterTrays;
import com.ayutaki.chinjufumod.init.recipes.CraftingMamiya;
import com.ayutaki.chinjufumod.init.recipes.CraftingNamako;
import com.ayutaki.chinjufumod.init.recipes.CraftingNoren;
import com.ayutaki.chinjufumod.init.recipes.CraftingPlaster;
import com.ayutaki.chinjufumod.init.recipes.CraftingRanma;
import com.ayutaki.chinjufumod.init.recipes.CraftingSchool;
import com.ayutaki.chinjufumod.init.recipes.CraftingSeasons;
import com.ayutaki.chinjufumod.init.recipes.CraftingTTimeItems;
import com.ayutaki.chinjufumod.init.recipes.CraftingTatami;
import com.ayutaki.chinjufumod.init.recipes.CraftingWallPanel;
import com.ayutaki.chinjufumod.init.recipes.CraftingWallPanel2;
import com.ayutaki.chinjufumod.init.recipes.SmeltingChinjufuMod;

public class RecipeHandler {

	public static void registerCraftingRecipes() {

		/* 直書きの方が良さそうだが、参照でも通るためこの形で */
		CraftingCArmor.register();
		CraftingCBlocks.register();
		CraftingCItems.register();
		CraftingCWeapons.register();
		CraftingFurnitures.register();
		CraftingLetterTrays.register();
		CraftingMamiya.register();
		CraftingSchool.register();
		CraftingSeasons.register();
		CraftingWallPanel.register();
		CraftingHarbor.register();


		CraftingFusuma.register();
		CraftingKawara.register();
		CraftingNamako.register();
		CraftingPlaster.register();
		CraftingRanma.register();
		CraftingTatami.register();
		CraftingWallPanel2.register();
		CraftingNoren.register();

		CraftingGarden.register();
		CraftingHakkou.register();
		CraftingKit_Pan.register();
		CraftingFoodBlock.register();
		CraftingTTimeItems.register();

	}



	public static void registerSmeltingRecipes() {

		SmeltingChinjufuMod.register();
	}

}
