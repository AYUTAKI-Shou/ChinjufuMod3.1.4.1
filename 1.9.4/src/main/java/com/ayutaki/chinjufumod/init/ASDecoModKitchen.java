package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.furnace.BlockIrori;
import com.ayutaki.chinjufumod.init.furnace.BlockKitchen_stove;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_board;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_chawan1;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_chawan2;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_chawan3;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_chawan4;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_chawanA;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_chawanB;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_donabe1;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_donabe2;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_drinkglass1;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_drinkglass2;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_drinkglass3;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_drinkglass4;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_drinkglassA;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_drinkglassB;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_drinkglassC;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_drinkglassD;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_drinkglassE;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_duct;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_ductend;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_ductend2;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_ductend3;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_frypan1;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_frypan2;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_kanki;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_kanki2;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_kanki3;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_kettle;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_sara1;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_sara2;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_sara3;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_sara4;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_saraA;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_saraB;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_shikki1;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_shikki2;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_shikki3;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_shikki4;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_shikkiA;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_shikkiB;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_sink1;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_sink2;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_tana;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_tcup1;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_tcup2;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_tcup3;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_tcup4;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_tcupA;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_tcupB;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_tcupC;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_tonsui1;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_tonsui2;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_tonsui3;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_tonsui4;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_tonsuiA;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_tonsuiB;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_yunomi1;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_yunomi2;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_yunomi3;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_yunomi4;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_yunomiA;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_yunomiB;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_yunomiC;
import com.ayutaki.chinjufumod.init.kitchen.BlockKit_zundou;
import com.ayutaki.chinjufumod.init.kitchen.BlockKitchen;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ASDecoModKitchen {

	public static Block KITCHEN, KIT_DONABE1, KIT_DONABE2,
							KIT_FRYPAN1, KIT_FRYPAN2, KIT_ZUNDOU, KIT_YAKAN;

	public static Block KIT_BOARD, KIT_SINK1, KIT_SINK2;
	public static Block KIT_STOVE, LIT_KITSTOVE, IRORI, LIT_IRORI;

	public static Block KIT_KANKI_1, KIT_KANKI_2, KIT_KANKI_3, KIT_HAIKIDUCT,
						KIT_DUCTEND_1, KIT_DUCTEND_2, KIT_DUCTEND_3;

	public static Block KIT_TANA,
						KIT_CHAWAN1, KIT_CHAWAN2, KIT_CHAWAN3, KIT_CHAWAN4, KIT_CHAWANA, KIT_CHAWANB,
						KIT_SHIKKI1, KIT_SHIKKI2, KIT_SHIKKI3, KIT_SHIKKI4, KIT_SHIKKIA, KIT_SHIKKIB,
						KIT_YUNOMI1, KIT_YUNOMI2, KIT_YUNOMI3, KIT_YUNOMI4, KIT_YUNOMIA, KIT_YUNOMIB, KIT_YUNOMIC,
						KIT_SARA1, KIT_SARA2, KIT_SARA3, KIT_SARA4, KIT_SARAA, KIT_SARAB,
						KIT_TCUP1, KIT_TCUP2, KIT_TCUP3, KIT_TCUP4, KIT_TCUPA, KIT_TCUPB, KIT_TCUPC,
						KIT_TONSUI1, KIT_TONSUI2, KIT_TONSUI3, KIT_TONSUI4, KIT_TONSUIA, KIT_TONSUIB,
						KIT_DRIGLASS1, KIT_DRIGLASS2, KIT_DRIGLASS3, KIT_DRIGLASS4, KIT_DRIGLASSA,
						KIT_DRIGLASSB, KIT_DRIGLASSC, KIT_DRIGLASSD, KIT_DRIGLASSE;

	public static void init() {

		KITCHEN = new BlockKitchen().setRegistryName("block_kitchen").setUnlocalizedName("block_kitchen").setCreativeTab(ChinjufuModTabs.tab_teatime);
		KIT_DONABE1 = new BlockKit_donabe1().setRegistryName("block_kit_donabe1").setUnlocalizedName("block_kit_donabe1");
		KIT_DONABE2 = new BlockKit_donabe2().setRegistryName("block_kit_donabe2").setUnlocalizedName("block_kit_donabe2");
		KIT_FRYPAN1 = new BlockKit_frypan1().setRegistryName("block_kit_frypan1").setUnlocalizedName("block_kit_frypan1");
		KIT_FRYPAN2 = new BlockKit_frypan2().setRegistryName("block_kit_frypan2").setUnlocalizedName("block_kit_frypan2");
		KIT_ZUNDOU = new BlockKit_zundou().setRegistryName("block_kit_zundou").setUnlocalizedName("block_kit_zundou");
		KIT_YAKAN = new BlockKit_kettle().setRegistryName("block_kit_kettle").setUnlocalizedName("block_kit_kettle");

		KIT_BOARD = new BlockKit_board().setRegistryName("block_kit_board").setUnlocalizedName("block_kit_board").setCreativeTab(ChinjufuModTabs.tab_teatime);
		KIT_SINK1 = new BlockKit_sink1().setRegistryName("block_kit_sink1").setUnlocalizedName("block_kit_sink1").setCreativeTab(ChinjufuModTabs.tab_teatime);
		KIT_SINK2 = new BlockKit_sink2().setRegistryName("block_kit_sink2").setUnlocalizedName("block_kit_sink2");

		KIT_KANKI_1 = new BlockKit_kanki().setRegistryName("block_kit_kanki").setUnlocalizedName("block_kit_kanki").setCreativeTab(ChinjufuModTabs.tab_teatime);
		KIT_KANKI_2 = new BlockKit_kanki2().setRegistryName("block_kit_kanki_2").setUnlocalizedName("block_kit_kanki_2");
		KIT_KANKI_3 = new BlockKit_kanki3().setRegistryName("block_kit_kanki_3").setUnlocalizedName("block_kit_kanki_3");

		KIT_HAIKIDUCT = new BlockKit_duct().setRegistryName("block_kit_duct").setUnlocalizedName("block_kit_duct").setCreativeTab(ChinjufuModTabs.tab_teatime);
		KIT_DUCTEND_1 = new BlockKit_ductend().setRegistryName("block_kit_ductend").setUnlocalizedName("block_kit_ductend").setCreativeTab(ChinjufuModTabs.tab_teatime);
		KIT_DUCTEND_2 = new BlockKit_ductend2().setRegistryName("block_kit_ductend_2").setUnlocalizedName("block_kit_ductend_2");
		KIT_DUCTEND_3 = new BlockKit_ductend3().setRegistryName("block_kit_ductend_3").setUnlocalizedName("block_kit_ductend_3");

		KIT_STOVE = new BlockKitchen_stove(false, "block_kit_stove").setCreativeTab(ChinjufuModTabs.tab_teatime);
		LIT_KITSTOVE = new BlockKitchen_stove(true, "lit_block_kit_stove").setHardness(1.0F).setResistance(10.0F);
		IRORI = new BlockIrori(false, "block_irori").setCreativeTab(ChinjufuModTabs.tab_teatime);
		LIT_IRORI = new BlockIrori(true, "lit_block_irori").setHardness(1.0F).setResistance(10.0F);

		KIT_TANA = new BlockKit_tana().setRegistryName("block_kit_tana").setUnlocalizedName("block_kit_tana").setCreativeTab(ChinjufuModTabs.tab_teatime);

		KIT_CHAWAN1 = new BlockKit_chawan1().setRegistryName("block_kit_chawan1").setUnlocalizedName("block_kit_chawan1");
		KIT_CHAWAN2 = new BlockKit_chawan2().setRegistryName("block_kit_chawan2").setUnlocalizedName("block_kit_chawan2");
		KIT_CHAWAN3 = new BlockKit_chawan3().setRegistryName("block_kit_chawan3").setUnlocalizedName("block_kit_chawan3");
		KIT_CHAWAN4 = new BlockKit_chawan4().setRegistryName("block_kit_chawan4").setUnlocalizedName("block_kit_chawan4");
		KIT_CHAWANA = new BlockKit_chawanA().setRegistryName("block_kit_chawana").setUnlocalizedName("block_kit_chawana");
		KIT_CHAWANB = new BlockKit_chawanB().setRegistryName("block_kit_chawanb").setUnlocalizedName("block_kit_chawanb");
		KIT_SHIKKI1 = new BlockKit_shikki1().setRegistryName("block_kit_shikki1").setUnlocalizedName("block_kit_shikki1");
		KIT_SHIKKI2 = new BlockKit_shikki2().setRegistryName("block_kit_shikki2").setUnlocalizedName("block_kit_shikki2");
		KIT_SHIKKI3 = new BlockKit_shikki3().setRegistryName("block_kit_shikki3").setUnlocalizedName("block_kit_shikki3");
		KIT_SHIKKI4 = new BlockKit_shikki4().setRegistryName("block_kit_shikki4").setUnlocalizedName("block_kit_shikki4");
		KIT_SHIKKIA = new BlockKit_shikkiA().setRegistryName("block_kit_shikkia").setUnlocalizedName("block_kit_shikkia");
		KIT_SHIKKIB = new BlockKit_shikkiB().setRegistryName("block_kit_shikkib").setUnlocalizedName("block_kit_shikkib");
		KIT_YUNOMI1 = new BlockKit_yunomi1().setRegistryName("block_kit_yunomi1").setUnlocalizedName("block_kit_yunomi1");
		KIT_YUNOMI2 = new BlockKit_yunomi2().setRegistryName("block_kit_yunomi2").setUnlocalizedName("block_kit_yunomi2");
		KIT_YUNOMI3 = new BlockKit_yunomi3().setRegistryName("block_kit_yunomi3").setUnlocalizedName("block_kit_yunomi3");
		KIT_YUNOMI4 = new BlockKit_yunomi4().setRegistryName("block_kit_yunomi4").setUnlocalizedName("block_kit_yunomi4");
		KIT_YUNOMIA = new BlockKit_yunomiA().setRegistryName("block_kit_yunomia").setUnlocalizedName("block_kit_yunomia");
		KIT_YUNOMIB = new BlockKit_yunomiB().setRegistryName("block_kit_yunomib").setUnlocalizedName("block_kit_yunomib");
		KIT_YUNOMIC = new BlockKit_yunomiC().setRegistryName("block_kit_yunomic").setUnlocalizedName("block_kit_yunomic");
		KIT_SARA1 = new BlockKit_sara1().setRegistryName("block_kit_sara1").setUnlocalizedName("block_kit_sara1");
		KIT_SARA2 = new BlockKit_sara2().setRegistryName("block_kit_sara2").setUnlocalizedName("block_kit_sara2");
		KIT_SARA3 = new BlockKit_sara3().setRegistryName("block_kit_sara3").setUnlocalizedName("block_kit_sara3");
		KIT_SARA4 = new BlockKit_sara4().setRegistryName("block_kit_sara4").setUnlocalizedName("block_kit_sara4");
		KIT_SARAA = new BlockKit_saraA().setRegistryName("block_kit_saraa").setUnlocalizedName("block_kit_saraa");
		KIT_SARAB = new BlockKit_saraB().setRegistryName("block_kit_sarab").setUnlocalizedName("block_kit_sarab");
		KIT_TCUP1 = new BlockKit_tcup1().setRegistryName("block_kit_tcup1").setUnlocalizedName("block_kit_tcup1");
		KIT_TCUP2 = new BlockKit_tcup2().setRegistryName("block_kit_tcup2").setUnlocalizedName("block_kit_tcup2");
		KIT_TCUP3 = new BlockKit_tcup3().setRegistryName("block_kit_tcup3").setUnlocalizedName("block_kit_tcup3");
		KIT_TCUP4 = new BlockKit_tcup4().setRegistryName("block_kit_tcup4").setUnlocalizedName("block_kit_tcup4");
		KIT_TCUPA = new BlockKit_tcupA().setRegistryName("block_kit_tcupa").setUnlocalizedName("block_kit_tcupa");
		KIT_TCUPB = new BlockKit_tcupB().setRegistryName("block_kit_tcupb").setUnlocalizedName("block_kit_tcupb");
		KIT_TCUPC = new BlockKit_tcupC().setRegistryName("block_kit_tcupc").setUnlocalizedName("block_kit_tcupc");
		KIT_TONSUI1 = new BlockKit_tonsui1().setRegistryName("block_kit_tonsui1").setUnlocalizedName("block_kit_tonsui1");
		KIT_TONSUI2 = new BlockKit_tonsui2().setRegistryName("block_kit_tonsui2").setUnlocalizedName("block_kit_tonsui2");
		KIT_TONSUI3 = new BlockKit_tonsui3().setRegistryName("block_kit_tonsui3").setUnlocalizedName("block_kit_tonsui3");
		KIT_TONSUI4 = new BlockKit_tonsui4().setRegistryName("block_kit_tonsui4").setUnlocalizedName("block_kit_tonsui4");
		KIT_TONSUIA = new BlockKit_tonsuiA().setRegistryName("block_kit_tonsuia").setUnlocalizedName("block_kit_tonsuia");
		KIT_TONSUIB = new BlockKit_tonsuiB().setRegistryName("block_kit_tonsuib").setUnlocalizedName("block_kit_tonsuib");
		KIT_DRIGLASS1 = new BlockKit_drinkglass1().setRegistryName("block_kit_driglass1").setUnlocalizedName("block_kit_driglass1");
		KIT_DRIGLASS2 = new BlockKit_drinkglass2().setRegistryName("block_kit_driglass2").setUnlocalizedName("block_kit_driglass2");
		KIT_DRIGLASS3 = new BlockKit_drinkglass3().setRegistryName("block_kit_driglass3").setUnlocalizedName("block_kit_driglass3");
		KIT_DRIGLASS4 = new BlockKit_drinkglass4().setRegistryName("block_kit_driglass4").setUnlocalizedName("block_kit_driglass4");
		KIT_DRIGLASSA = new BlockKit_drinkglassA().setRegistryName("block_kit_driglassa").setUnlocalizedName("block_kit_driglassa");
		KIT_DRIGLASSB = new BlockKit_drinkglassB().setRegistryName("block_kit_driglassb").setUnlocalizedName("block_kit_driglassb");
		KIT_DRIGLASSC = new BlockKit_drinkglassC().setRegistryName("block_kit_driglassc").setUnlocalizedName("block_kit_driglassc");
		KIT_DRIGLASSD = new BlockKit_drinkglassD().setRegistryName("block_kit_driglassd").setUnlocalizedName("block_kit_driglassd");
		KIT_DRIGLASSE = new BlockKit_drinkglassE().setRegistryName("block_kit_driglasse").setUnlocalizedName("block_kit_driglasse");

	}


	public static void register() {

		registerBlock(KITCHEN);
		registerBlock(KIT_DONABE1);
		registerBlock(KIT_DONABE2);
		registerBlock(KIT_FRYPAN1);
		registerBlock(KIT_FRYPAN2);
		registerBlock(KIT_ZUNDOU);
		registerBlock(KIT_YAKAN);

		registerBlock(KIT_BOARD);
		registerBlock(KIT_SINK1);
		registerBlock(KIT_SINK2);

		registerBlock(KIT_KANKI_1);
		registerBlock(KIT_KANKI_2);
		registerBlock(KIT_KANKI_3);
		registerBlock(KIT_HAIKIDUCT);
		registerBlock(KIT_DUCTEND_1);
		registerBlock(KIT_DUCTEND_2);
		registerBlock(KIT_DUCTEND_3);

		registerBlock(KIT_STOVE);
		registerBlock(LIT_KITSTOVE);
		registerBlock(IRORI);
		registerBlock(LIT_IRORI);

		registerBlock(KIT_TANA);
		registerBlock(KIT_CHAWAN1);
		registerBlock(KIT_CHAWAN2);
		registerBlock(KIT_CHAWAN3);
		registerBlock(KIT_CHAWAN4);
		registerBlock(KIT_CHAWANA);
		registerBlock(KIT_CHAWANB);
		registerBlock(KIT_SHIKKI1);
		registerBlock(KIT_SHIKKI2);
		registerBlock(KIT_SHIKKI3);
		registerBlock(KIT_SHIKKI4);
		registerBlock(KIT_SHIKKIA);
		registerBlock(KIT_SHIKKIB);
		registerBlock(KIT_YUNOMI1);
		registerBlock(KIT_YUNOMI2);
		registerBlock(KIT_YUNOMI3);
		registerBlock(KIT_YUNOMI4);
		registerBlock(KIT_YUNOMIA);
		registerBlock(KIT_YUNOMIB);
		registerBlock(KIT_YUNOMIC);
		registerBlock(KIT_SARA1);
		registerBlock(KIT_SARA2);
		registerBlock(KIT_SARA3);
		registerBlock(KIT_SARA4);
		registerBlock(KIT_SARAA);
		registerBlock(KIT_SARAB);
		registerBlock(KIT_TCUP1);
		registerBlock(KIT_TCUP2);
		registerBlock(KIT_TCUP3);
		registerBlock(KIT_TCUP4);
		registerBlock(KIT_TCUPA);
		registerBlock(KIT_TCUPB);
		registerBlock(KIT_TCUPC);
		registerBlock(KIT_TONSUI1);
		registerBlock(KIT_TONSUI2);
		registerBlock(KIT_TONSUI3);
		registerBlock(KIT_TONSUI4);
		registerBlock(KIT_TONSUIA);
		registerBlock(KIT_TONSUIB);
		registerBlock(KIT_DRIGLASS1);
		registerBlock(KIT_DRIGLASS2);
		registerBlock(KIT_DRIGLASS3);
		registerBlock(KIT_DRIGLASS4);
		registerBlock(KIT_DRIGLASSA);
		registerBlock(KIT_DRIGLASSB);
		registerBlock(KIT_DRIGLASSC);
		registerBlock(KIT_DRIGLASSD);
		registerBlock(KIT_DRIGLASSE);
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

		registerRender(KITCHEN);

		registerRender(KIT_BOARD);
		registerRender(KIT_SINK1);
		registerRender(KIT_SINK2);
		registerRender(KIT_KANKI_1);
		registerRender(KIT_HAIKIDUCT);
		registerRender(KIT_DUCTEND_1);

		registerRender(KIT_STOVE);
		registerRender(LIT_KITSTOVE);
		registerRender(IRORI);
		registerRender(LIT_IRORI);

		registerRender(KIT_TANA);

	}

    public static void registerRender(Block block) {
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
    			new ModelResourceLocation(block.getRegistryName(),"inventory"));
    }
}
