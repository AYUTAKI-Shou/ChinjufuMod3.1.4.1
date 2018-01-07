package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.plants.BlockCabbage;
import com.ayutaki.chinjufumod.init.plants.BlockChanoki_1;
import com.ayutaki.chinjufumod.init.plants.BlockChanoki_2;
import com.ayutaki.chinjufumod.init.plants.BlockChanoki_3;
import com.ayutaki.chinjufumod.init.plants.BlockChanoki_nae;
import com.ayutaki.chinjufumod.init.plants.BlockCorn;
import com.ayutaki.chinjufumod.init.plants.BlockGrape_1;
import com.ayutaki.chinjufumod.init.plants.BlockGrape_2;
import com.ayutaki.chinjufumod.init.plants.BlockGrape_3;
import com.ayutaki.chinjufumod.init.plants.BlockGrape_4;
import com.ayutaki.chinjufumod.init.plants.BlockGrape_a;
import com.ayutaki.chinjufumod.init.plants.BlockGrape_b;
import com.ayutaki.chinjufumod.init.plants.BlockGrape_c;
import com.ayutaki.chinjufumod.init.plants.BlockGrape_d;
import com.ayutaki.chinjufumod.init.plants.BlockGrape_kare;
import com.ayutaki.chinjufumod.init.plants.BlockGrape_nae;
import com.ayutaki.chinjufumod.init.plants.BlockHakusai;
import com.ayutaki.chinjufumod.init.plants.BlockOnion;
import com.ayutaki.chinjufumod.init.plants.BlockRice;
import com.ayutaki.chinjufumod.init.plants.BlockSeedsBox;
import com.ayutaki.chinjufumod.init.plants.BlockSoy;
import com.ayutaki.chinjufumod.init.plants.BlockSpinach;
import com.ayutaki.chinjufumod.init.plants.BlockTomato;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TTimePlants {

	public static Block SEEDSBOX;

	public static Block CHANOKI_nae, CHANOKI_1, CHANOKI_2, CHANOKI_3;
	public static Block BUDOUNOKI_nae, BUDOUNOKI_1, BUDOUNOKI_2, BUDOUNOKI_3, BUDOUNOKI_4,
						BUDOUNOKI_a, BUDOUNOKI_b, BUDOUNOKI_c, BUDOUNOKI_d, BUDOUNOKI_kare;

	public static Block CABBAGE, HAKUSAI, SPINACH, SOY, TOMATO, CORN, ONION, RICE;

	/*テクスチャ確認用*/
	public static Block TEST_0, TEST_1, TEST_2, TEST_3, TEST_4, TEST_5, TEST_6, TEST_7;

	public static void init() {

		SEEDSBOX = new BlockSeedsBox().setRegistryName("block_seedsbox").setUnlocalizedName("block_seedsbox").setCreativeTab(ChinjufuModTabs.tab_teatime);

		CHANOKI_nae = new BlockChanoki_nae().setRegistryName("block_wood_chanoki_nae").setUnlocalizedName("block_wood_chanoki_nae").setCreativeTab(ChinjufuModTabs.tab_teatime);
		CHANOKI_1 = new BlockChanoki_1().setRegistryName("block_wood_chanoki_1").setUnlocalizedName("block_wood_chanoki_1");
		CHANOKI_2 = new BlockChanoki_2().setRegistryName("block_wood_chanoki_2").setUnlocalizedName("block_wood_chanoki_2");
		CHANOKI_3 = new BlockChanoki_3().setRegistryName("block_wood_chanoki_3").setUnlocalizedName("block_wood_chanoki_3");

		BUDOUNOKI_nae = new BlockGrape_nae().setRegistryName("block_wood_grape_nae").setUnlocalizedName("block_wood_grape_nae").setCreativeTab(ChinjufuModTabs.tab_teatime);
		BUDOUNOKI_1 = new BlockGrape_1().setRegistryName("block_wood_grape_1").setUnlocalizedName("block_wood_grape_1");
		BUDOUNOKI_2 = new BlockGrape_2().setRegistryName("block_wood_grape_2").setUnlocalizedName("block_wood_grape_2");
		BUDOUNOKI_3 = new BlockGrape_3().setRegistryName("block_wood_grape_3").setUnlocalizedName("block_wood_grape_3");
		BUDOUNOKI_4 = new BlockGrape_4().setRegistryName("block_wood_grape_4").setUnlocalizedName("block_wood_grape_4");
		BUDOUNOKI_a = new BlockGrape_a().setRegistryName("block_wood_grape_a").setUnlocalizedName("block_wood_grape_a");
		BUDOUNOKI_b = new BlockGrape_b().setRegistryName("block_wood_grape_b").setUnlocalizedName("block_wood_grape_b");
		BUDOUNOKI_c = new BlockGrape_c().setRegistryName("block_wood_grape_c").setUnlocalizedName("block_wood_grape_c");
		BUDOUNOKI_d = new BlockGrape_d().setRegistryName("block_wood_grape_d").setUnlocalizedName("block_wood_grape_d");
		BUDOUNOKI_kare = new BlockGrape_kare().setRegistryName("block_wood_grape_kare").setUnlocalizedName("block_wood_grape_kare");

		CABBAGE = new BlockCabbage("block_vege_cabbage");
		HAKUSAI = new BlockHakusai("block_vege_hakusai");
		SPINACH = new BlockSpinach("block_vege_spinach");
		SOY = new BlockSoy("block_vege_soy");
		TOMATO = new BlockTomato("block_vege_tomato");
		CORN = new BlockCorn("block_vege_corn");
		ONION = new BlockOnion("block_vege_onion");
		RICE = new BlockRice("block_vege_rice");

		/*TEST_0 = new TestCrop("test_crop0").setCreativeTab(ChinjufuModTabs.tab_teatime);
		TEST_1 = new TestCrop("test_crop1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		TEST_2 = new TestCrop("test_crop2").setCreativeTab(ChinjufuModTabs.tab_teatime);
		TEST_3 = new TestCrop("test_crop3").setCreativeTab(ChinjufuModTabs.tab_teatime);
		TEST_4 = new TestCrop("test_crop4").setCreativeTab(ChinjufuModTabs.tab_teatime);
		TEST_5 = new TestCrop("test_crop5").setCreativeTab(ChinjufuModTabs.tab_teatime);
		TEST_6 = new TestCrop("test_crop6").setCreativeTab(ChinjufuModTabs.tab_teatime);
		TEST_7 = new TestCrop("test_crop7").setCreativeTab(ChinjufuModTabs.tab_teatime);*/

	}


	public static void register() {

		registerBlock(SEEDSBOX);

		registerBlock(CHANOKI_nae);
		registerBlock(CHANOKI_1);
		registerBlock(CHANOKI_2);
		registerBlock(CHANOKI_3);

		registerBlock(BUDOUNOKI_nae);
		registerBlock(BUDOUNOKI_1);
		registerBlock(BUDOUNOKI_2);
		registerBlock(BUDOUNOKI_3);
		registerBlock(BUDOUNOKI_4);
		registerBlock(BUDOUNOKI_a);
		registerBlock(BUDOUNOKI_b);
		registerBlock(BUDOUNOKI_c);
		registerBlock(BUDOUNOKI_d);
		registerBlock(BUDOUNOKI_kare);

		GameRegistry.register(CABBAGE);
		GameRegistry.register(HAKUSAI);
		GameRegistry.register(SPINACH);
		GameRegistry.register(SOY);
		GameRegistry.register(TOMATO);
		GameRegistry.register(CORN);
		GameRegistry.register(ONION);
		GameRegistry.register(RICE);

		/*registerBlock(TEST_0);
		registerBlock(TEST_1);
		registerBlock(TEST_2);
		registerBlock(TEST_3);
		registerBlock(TEST_4);
		registerBlock(TEST_5);
		registerBlock(TEST_6);
		registerBlock(TEST_7);*/
	}

	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}


	public static void registerRenders() {

		registerRender(SEEDSBOX);

		registerRender(CHANOKI_nae);

		registerRender(BUDOUNOKI_nae);

		/*registerRender(TEST_0);
		registerRender(TEST_1);
		registerRender(TEST_2);
		registerRender(TEST_3);
		registerRender(TEST_4);
		registerRender(TEST_5);
		registerRender(TEST_6);
		registerRender(TEST_7);*/

	}

    public static void registerRender(Block block) {
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
    			new ModelResourceLocation(block.getRegistryName(),"inventory"));
    }
}
