package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Apple;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Beef;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Beetroot;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Bread;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Cabbage;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Carrot;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Chicken;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Chorus;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Coco;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Corn;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Egg;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Empty;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Fish;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Flour;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Grape;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Hakusai;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Mutton;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Onion;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Pork;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Potato;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Rabbit;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Rice;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Soy;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Spinach;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_TGreen;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_TRed;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxD_Tomato;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Apple;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Beef;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Beetroot;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Bread;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Cabbage;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Carrot;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Chicken;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Chorus;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Coco;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Corn;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Egg;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Empty;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Fish;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Flour;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Grape;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Hakusai;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Mutton;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Onion;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Pork;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Potato;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Rabbit;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Rice;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Soy;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Spinach;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_TGreen;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_TRed;
import com.ayutaki.chinjufumod.init.pantry.BlockBoxH_Tomato;
import com.ayutaki.chinjufumod.init.pantry.BlockCanTea;
import com.ayutaki.chinjufumod.init.pantry.BlockChadutsu;
import com.ayutaki.chinjufumod.init.pantry.BlockTawara;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ASDecoModPantry {

	public static BlockBoxH_Empty BOX_H_EMPTY;
	public static BlockBoxH_Apple BOX_H_APPLE;
	public static BlockBoxH_Beef BOX_H_BEEF;
	public static BlockBoxH_Beetroot BOX_H_BEETROOT;
	public static BlockBoxH_Bread BOX_H_BREAD;
	public static BlockBoxH_Carrot BOX_H_CARROT;
	public static BlockBoxH_Chicken BOX_H_CHICKEN;
	public static BlockBoxH_Chorus BOX_H_CHORUS;
	public static BlockBoxH_Coco BOX_H_COCO;
	public static BlockBoxH_Egg BOX_H_EGG;
	public static BlockBoxH_Fish BOX_H_FISH;
	public static BlockBoxH_Flour BOX_H_FLOUR;
	public static BlockBoxH_Mutton BOX_H_MUTTON;
	public static BlockBoxH_Pork BOX_H_PORK;
	public static BlockBoxH_Potato BOX_H_POTATO;
	public static BlockBoxH_Rabbit BOX_H_RABBIT;

	public static BlockBoxH_Cabbage BOX_H_CABBAGE;
	public static BlockBoxH_Hakusai BOX_H_HAKUSAI;
	public static BlockBoxH_Corn BOX_H_CORN;
	public static BlockBoxH_Grape BOX_H_GRAPE;
	public static BlockBoxH_Onion BOX_H_ONION;
	public static BlockBoxH_Rice BOX_H_RICE;
	public static BlockBoxH_Soy BOX_H_SOY;
	public static BlockBoxH_Spinach BOX_H_SPINACH;
	public static BlockBoxH_Tomato BOX_H_TOMATO;
	public static BlockBoxH_TGreen BOX_H_TGREEN;
	public static BlockBoxH_TRed BOX_H_TRED;

	public static BlockBoxD_Empty BOX_D_EMPTY;
	public static BlockBoxD_Apple BOX_D_APPLE;
	public static BlockBoxD_Beef BOX_D_BEEF;
	public static BlockBoxD_Beetroot BOX_D_BEETROOT;
	public static BlockBoxD_Bread BOX_D_BREAD;
	public static BlockBoxD_Carrot BOX_D_CARROT;
	public static BlockBoxD_Chicken BOX_D_CHICKEN;
	public static BlockBoxD_Chorus BOX_D_CHORUS;
	public static BlockBoxD_Coco BOX_D_COCO;
	public static BlockBoxD_Egg BOX_D_EGG;
	public static BlockBoxD_Fish BOX_D_FISH;
	public static BlockBoxD_Flour BOX_D_FLOUR;
	public static BlockBoxD_Mutton BOX_D_MUTTON;
	public static BlockBoxD_Pork BOX_D_PORK;
	public static BlockBoxD_Potato BOX_D_POTATO;
	public static BlockBoxD_Rabbit BOX_D_RABBIT;

	public static BlockBoxD_Cabbage BOX_D_CABBAGE;
	public static BlockBoxD_Hakusai BOX_D_HAKUSAI;
	public static BlockBoxD_Corn BOX_D_CORN;
	public static BlockBoxD_Grape BOX_D_GRAPE;
	public static BlockBoxD_Onion BOX_D_ONION;
	public static BlockBoxD_Rice BOX_D_RICE;
	public static BlockBoxD_Soy BOX_D_SOY;
	public static BlockBoxD_Spinach BOX_D_SPINACH;
	public static BlockBoxD_Tomato BOX_D_TOMATO;
	public static BlockBoxD_TGreen BOX_D_TGREEN;
	public static BlockBoxD_TRed BOX_D_TRED;

	public static Block CHADUTSU, CANTEA, TAWARA;

	public static void init() {

		BOX_H_EMPTY = new BlockBoxH_Empty("block_boxh_empty");
		BOX_H_APPLE = new BlockBoxH_Apple("block_boxh_apple");
		BOX_H_BEEF = new BlockBoxH_Beef("block_boxh_beef");
		BOX_H_BEETROOT = new BlockBoxH_Beetroot("block_boxh_beetroot");
		BOX_H_BREAD = new BlockBoxH_Bread("block_boxh_bread");
		BOX_H_CARROT = new BlockBoxH_Carrot("block_boxh_carrot");
		BOX_H_CHICKEN = new BlockBoxH_Chicken("block_boxh_chicken");
		BOX_H_CHORUS = new BlockBoxH_Chorus("block_boxh_chorus");
		BOX_H_COCO = new BlockBoxH_Coco("block_boxh_coco");
		BOX_H_EGG = new BlockBoxH_Egg("block_boxh_egg");
		BOX_H_FISH = new BlockBoxH_Fish("block_boxh_fish");
		BOX_H_FLOUR = new BlockBoxH_Flour("block_boxh_flour");
		BOX_H_MUTTON = new BlockBoxH_Mutton("block_boxh_mutton");
		BOX_H_PORK = new BlockBoxH_Pork("block_boxh_pork");
		BOX_H_POTATO = new BlockBoxH_Potato("block_boxh_potato");
		BOX_H_RABBIT = new BlockBoxH_Rabbit("block_boxh_rabbit");

		BOX_H_CABBAGE = new BlockBoxH_Cabbage("block_boxh_cabbage");
		BOX_H_HAKUSAI = new BlockBoxH_Hakusai("block_boxh_hakusai");
		BOX_H_CORN = new BlockBoxH_Corn("block_boxh_corn");
		BOX_H_GRAPE = new BlockBoxH_Grape("block_boxh_grape");
		BOX_H_ONION = new BlockBoxH_Onion("block_boxh_onion");
		BOX_H_RICE = new BlockBoxH_Rice("block_boxh_rice");
		BOX_H_SOY = new BlockBoxH_Soy("block_boxh_soy");
		BOX_H_SPINACH = new BlockBoxH_Spinach("block_boxh_spinach");
		BOX_H_TOMATO = new BlockBoxH_Tomato("block_boxh_tomato");
		BOX_H_TGREEN = new BlockBoxH_TGreen("block_boxh_tgreen");
		BOX_H_TRED = new BlockBoxH_TRed("block_boxh_tred");

		BOX_D_EMPTY = new BlockBoxD_Empty("block_boxd_empty");
		BOX_D_APPLE = new BlockBoxD_Apple("block_boxd_apple");
		BOX_D_BEEF = new BlockBoxD_Beef("block_boxd_beef");
		BOX_D_BEETROOT = new BlockBoxD_Beetroot("block_boxd_beetroot");
		BOX_D_BREAD = new BlockBoxD_Bread("block_boxd_bread");
		BOX_D_CARROT = new BlockBoxD_Carrot("block_boxd_carrot");
		BOX_D_CHICKEN = new BlockBoxD_Chicken("block_boxd_chicken");
		BOX_D_CHORUS = new BlockBoxD_Chorus("block_boxd_chorus");
		BOX_D_COCO = new BlockBoxD_Coco("block_boxd_coco");
		BOX_D_EGG = new BlockBoxD_Egg("block_boxd_egg");
		BOX_D_FISH = new BlockBoxD_Fish("block_boxd_fish");
		BOX_D_FLOUR = new BlockBoxD_Flour("block_boxd_flour");
		BOX_D_MUTTON = new BlockBoxD_Mutton("block_boxd_mutton");
		BOX_D_PORK = new BlockBoxD_Pork("block_boxd_pork");
		BOX_D_POTATO = new BlockBoxD_Potato("block_boxd_potato");
		BOX_D_RABBIT = new BlockBoxD_Rabbit("block_boxd_rabbit");

		BOX_D_CABBAGE = new BlockBoxD_Cabbage("block_boxd_cabbage");
		BOX_D_HAKUSAI = new BlockBoxD_Hakusai("block_boxd_hakusai");
		BOX_D_CORN = new BlockBoxD_Corn("block_boxd_corn");
		BOX_D_GRAPE = new BlockBoxD_Grape("block_boxd_grape");
		BOX_D_ONION = new BlockBoxD_Onion("block_boxd_onion");
		BOX_D_RICE = new BlockBoxD_Rice("block_boxd_rice");
		BOX_D_SOY = new BlockBoxD_Soy("block_boxd_soy");
		BOX_D_SPINACH = new BlockBoxD_Spinach("block_boxd_spinach");
		BOX_D_TOMATO = new BlockBoxD_Tomato("block_boxd_tomato");
		BOX_D_TGREEN = new BlockBoxD_TGreen("block_boxd_tgreen");
		BOX_D_TRED = new BlockBoxD_TRed("block_boxd_tred");

		CHADUTSU = new BlockChadutsu().setRegistryName("block_tea_chadutsu").setUnlocalizedName("block_tea_chadutsu").setCreativeTab(ChinjufuModTabs.tab_teatime);
		CANTEA = new BlockCanTea().setRegistryName("block_tea_can").setUnlocalizedName("block_tea_can").setCreativeTab(ChinjufuModTabs.tab_teatime);
		TAWARA = new BlockTawara().setRegistryName("block_tawara_cm").setUnlocalizedName("block_tawara_cm").setCreativeTab(ChinjufuModTabs.tab_teatime);

	}


	public static void register() {

		registerBlock(BOX_H_EMPTY, new ItemSlab(BOX_H_EMPTY, BOX_H_EMPTY, BOX_D_EMPTY));
		GameRegistry.register(BOX_D_EMPTY);
		registerBlock(BOX_H_APPLE, new ItemSlab(BOX_H_APPLE, BOX_H_APPLE, BOX_D_APPLE));
		GameRegistry.register(BOX_D_APPLE);
		registerBlock(BOX_H_BEEF, new ItemSlab(BOX_H_BEEF, BOX_H_BEEF, BOX_D_BEEF));
		GameRegistry.register(BOX_D_BEEF);
		registerBlock(BOX_H_BEETROOT, new ItemSlab(BOX_H_BEETROOT, BOX_H_BEETROOT, BOX_D_BEETROOT));
		GameRegistry.register(BOX_D_BEETROOT);
		registerBlock(BOX_H_BREAD, new ItemSlab(BOX_H_BREAD, BOX_H_BREAD, BOX_D_BREAD));
		GameRegistry.register(BOX_D_BREAD);
		registerBlock(BOX_H_CARROT, new ItemSlab(BOX_H_CARROT, BOX_H_CARROT, BOX_D_CARROT));
		GameRegistry.register(BOX_D_CARROT);
		registerBlock(BOX_H_CHICKEN, new ItemSlab(BOX_H_CHICKEN, BOX_H_CHICKEN, BOX_D_CHICKEN));
		GameRegistry.register(BOX_D_CHICKEN);
		registerBlock(BOX_H_CHORUS, new ItemSlab(BOX_H_CHORUS, BOX_H_CHORUS, BOX_D_CHORUS));
		GameRegistry.register(BOX_D_CHORUS);
		registerBlock(BOX_H_COCO, new ItemSlab(BOX_H_COCO, BOX_H_COCO, BOX_D_COCO));
		GameRegistry.register(BOX_D_COCO);
		registerBlock(BOX_H_EGG, new ItemSlab(BOX_H_EGG, BOX_H_EGG, BOX_D_EGG));
		GameRegistry.register(BOX_D_EGG);
		registerBlock(BOX_H_FISH, new ItemSlab(BOX_H_FISH, BOX_H_FISH, BOX_D_FISH));
		GameRegistry.register(BOX_D_FISH);
		registerBlock(BOX_H_FLOUR, new ItemSlab(BOX_H_FLOUR, BOX_H_FLOUR, BOX_D_FLOUR));
		GameRegistry.register(BOX_D_FLOUR);
		registerBlock(BOX_H_MUTTON, new ItemSlab(BOX_H_MUTTON, BOX_H_MUTTON, BOX_D_MUTTON));
		GameRegistry.register(BOX_D_MUTTON);
		registerBlock(BOX_H_PORK, new ItemSlab(BOX_H_PORK, BOX_H_PORK, BOX_D_PORK));
		GameRegistry.register(BOX_D_PORK);
		registerBlock(BOX_H_POTATO, new ItemSlab(BOX_H_POTATO, BOX_H_POTATO, BOX_D_POTATO));
		GameRegistry.register(BOX_D_POTATO);
		registerBlock(BOX_H_RABBIT, new ItemSlab(BOX_H_RABBIT, BOX_H_RABBIT, BOX_D_RABBIT));
		GameRegistry.register(BOX_D_RABBIT);

		registerBlock(BOX_H_CABBAGE, new ItemSlab(BOX_H_CABBAGE, BOX_H_CABBAGE, BOX_D_CABBAGE));
		GameRegistry.register(BOX_D_CABBAGE);
		registerBlock(BOX_H_HAKUSAI, new ItemSlab(BOX_H_HAKUSAI, BOX_H_HAKUSAI, BOX_D_HAKUSAI));
		GameRegistry.register(BOX_D_HAKUSAI);
		registerBlock(BOX_H_CORN, new ItemSlab(BOX_H_CORN, BOX_H_CORN, BOX_D_CORN));
		GameRegistry.register(BOX_D_CORN);
		registerBlock(BOX_H_GRAPE, new ItemSlab(BOX_H_GRAPE, BOX_H_GRAPE, BOX_D_GRAPE));
		GameRegistry.register(BOX_D_GRAPE);
		registerBlock(BOX_H_ONION, new ItemSlab(BOX_H_ONION, BOX_H_ONION, BOX_D_ONION));
		GameRegistry.register(BOX_D_ONION);
		registerBlock(BOX_H_RICE, new ItemSlab(BOX_H_RICE, BOX_H_RICE, BOX_D_RICE));
		GameRegistry.register(BOX_D_RICE);
		registerBlock(BOX_H_SOY, new ItemSlab(BOX_H_SOY, BOX_H_SOY, BOX_D_SOY));
		GameRegistry.register(BOX_D_SOY);
		registerBlock(BOX_H_SPINACH, new ItemSlab(BOX_H_SPINACH, BOX_H_SPINACH, BOX_D_SPINACH));
		GameRegistry.register(BOX_D_SPINACH);
		registerBlock(BOX_H_TOMATO, new ItemSlab(BOX_H_TOMATO, BOX_H_TOMATO, BOX_D_TOMATO));
		GameRegistry.register(BOX_D_TOMATO);
		registerBlock(BOX_H_TGREEN, new ItemSlab(BOX_H_TGREEN, BOX_H_TGREEN, BOX_D_TGREEN));
		GameRegistry.register(BOX_D_TGREEN);
		registerBlock(BOX_H_TRED, new ItemSlab(BOX_H_TRED, BOX_H_TRED, BOX_D_TRED));
		GameRegistry.register(BOX_D_TRED);

		registerBlock(CHADUTSU);
		registerBlock(CANTEA);
		registerBlock(TAWARA);

	}

	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	public static void registerBlock(Block block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
	}

	public static void registerRenders() {

		registerRender(BOX_H_EMPTY);
		registerRender(BOX_H_APPLE);
		registerRender(BOX_H_BEEF);
		registerRender(BOX_H_BEETROOT);
		registerRender(BOX_H_BREAD);
		registerRender(BOX_H_CARROT);
		registerRender(BOX_H_CHICKEN);
		registerRender(BOX_H_CHORUS);
		registerRender(BOX_H_COCO);
		registerRender(BOX_H_EGG);
		registerRender(BOX_H_FISH);
		registerRender(BOX_H_FLOUR);
		registerRender(BOX_H_MUTTON);
		registerRender(BOX_H_PORK);
		registerRender(BOX_H_POTATO);
		registerRender(BOX_H_RABBIT);

		registerRender(BOX_H_CABBAGE);
		registerRender(BOX_H_HAKUSAI);
		registerRender(BOX_H_CORN);
		registerRender(BOX_H_GRAPE);
		registerRender(BOX_H_ONION);
		registerRender(BOX_H_RICE);
		registerRender(BOX_H_SOY);
		registerRender(BOX_H_SPINACH);
		registerRender(BOX_H_TOMATO);
		registerRender(BOX_H_TGREEN);
		registerRender(BOX_H_TRED);

		registerRender(CHADUTSU);
		registerRender(CANTEA);
		registerRender(TAWARA);

	}

    public static void registerRender(Block block) {
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
    			new ModelResourceLocation(block.getRegistryName(),"inventory"));
    }
}
