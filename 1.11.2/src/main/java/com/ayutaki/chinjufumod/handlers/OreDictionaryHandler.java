package com.ayutaki.chinjufumod.handlers;

import com.ayutaki.chinjufumod.init.ChinjufuModBlocks;
import com.ayutaki.chinjufumod.init.TTimeItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {

	public static void registerOreDictionary() {

		OreDictionary.registerOre("oreBauxite", ChinjufuModBlocks.BAUXITE_ORE);
		OreDictionary.registerOre("ingotAluminium", TTimeItems.ALUMINUM);
	}

}
