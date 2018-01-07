package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.furnitures.BlockAdmiralChair;
import com.ayutaki.chinjufumod.init.furnitures.BlockCafeChair;
import com.ayutaki.chinjufumod.init.furnitures.BlockDiningChair;
import com.ayutaki.chinjufumod.init.furnitures.BlockDressingTable;
import com.ayutaki.chinjufumod.init.furnitures.BlockUnitDesk;
import com.ayutaki.chinjufumod.init.furnitures.BlockUnitDesk_a;
import com.ayutaki.chinjufumod.init.furnitures.BlockUnitDesk_b;
import com.ayutaki.chinjufumod.init.furnitures.BlockUnitDesk_d;
import com.ayutaki.chinjufumod.init.furnitures.BlockUnitDesk_j;
import com.ayutaki.chinjufumod.init.furnitures.BlockUnitDesk_s;
import com.ayutaki.chinjufumod.init.furnitures.BlockZaisu;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class New_ChinjufuModFurnitures {

	public static Block DRESSINGTABLE,DRESSINGTABLE_a,DRESSINGTABLE_b,
						DRESSINGTABLE_d,DRESSINGTABLE_j,DRESSINGTABLE_s;

	public static Block CAFECHAIR_black,CAFECHAIR_blue,CAFECHAIR_brown,CAFECHAIR_cyan,
						CAFECHAIR_gray,CAFECHAIR_green,CAFECHAIR_lightb,CAFECHAIR_lightg,
						CAFECHAIR_lime,CAFECHAIR_magenta,CAFECHAIR_orange,CAFECHAIR_pink,
						CAFECHAIR_purple,CAFECHAIR_red,CAFECHAIR_white,CAFECHAIR_yellow;

	public static Block DININGCHAIR,DININGCHAIR_a,DININGCHAIR_b,
						DININGCHAIR_d,DININGCHAIR_j,DININGCHAIR_s;

	public static Block UNITDESK;
	public static Block UNITDESK_a;
	public static Block UNITDESK_b;
	public static Block UNITDESK_d;
	public static Block UNITDESK_j;
	public static Block UNITDESK_s;

	public static Block ZAISU_black,ZAISU_blue,ZAISU_brown,ZAISU_cyan,
						ZAISU_gray,ZAISU_green,ZAISU_lightb,ZAISU_lightg,
						ZAISU_lime,ZAISU_magenta,ZAISU_orange,ZAISU_pink,
						ZAISU_purple,ZAISU_red,ZAISU_white,ZAISU_yellow;

	public static Block ADMIRALCHAIR;
	public static Block ADMIRALCHAIR_red;


	public static void init() {
		//ブロックのインスタンス生成

		DRESSINGTABLE = new BlockDressingTable().setRegistryName("block_dressingtable").setUnlocalizedName("block_dressingtable").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DRESSINGTABLE_a = new BlockDressingTable().setRegistryName("block_dressingtable_a").setUnlocalizedName("block_dressingtable_a").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DRESSINGTABLE_b = new BlockDressingTable().setRegistryName("block_dressingtable_b").setUnlocalizedName("block_dressingtable_b").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DRESSINGTABLE_d = new BlockDressingTable().setRegistryName("block_dressingtable_d").setUnlocalizedName("block_dressingtable_d").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DRESSINGTABLE_j = new BlockDressingTable().setRegistryName("block_dressingtable_j").setUnlocalizedName("block_dressingtable_j").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DRESSINGTABLE_s = new BlockDressingTable().setRegistryName("block_dressingtable_s").setUnlocalizedName("block_dressingtable_s").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		CAFECHAIR_black = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_black").setUnlocalizedName("block_cafechair_black").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_blue = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_blue").setUnlocalizedName("block_cafechair_blue").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_brown = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_brown").setUnlocalizedName("block_cafechair_brown").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_cyan = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_cyan").setUnlocalizedName("block_cafechair_cyan").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_gray = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_gray").setUnlocalizedName("block_cafechair_gray").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_green = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_green").setUnlocalizedName("block_cafechair_green").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_lightb = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_lightb").setUnlocalizedName("block_cafechair_lightb").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_lightg = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_lightg").setUnlocalizedName("block_cafechair_lightg").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_lime = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_lime").setUnlocalizedName("block_cafechair_lime").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_magenta = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_magenta").setUnlocalizedName("block_cafechair_magenta").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_orange = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_orange").setUnlocalizedName("block_cafechair_orange").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_pink = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_pink").setUnlocalizedName("block_cafechair_pink").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_purple = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_purple").setUnlocalizedName("block_cafechair_purple").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_red = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_red").setUnlocalizedName("block_cafechair_red").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_white = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_white").setUnlocalizedName("block_cafechair_white").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_yellow = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_yellow").setUnlocalizedName("block_cafechair_yellow").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		DININGCHAIR = new BlockDiningChair(Material.WOOD).setRegistryName("block_diningchair").setUnlocalizedName("block_diningchair").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DININGCHAIR_a = new BlockDiningChair(Material.WOOD).setRegistryName("block_diningchair_a").setUnlocalizedName("block_diningchair_a").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DININGCHAIR_b = new BlockDiningChair(Material.WOOD).setRegistryName("block_diningchair_b").setUnlocalizedName("block_diningchair_b").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DININGCHAIR_d = new BlockDiningChair(Material.WOOD).setRegistryName("block_diningchair_d").setUnlocalizedName("block_diningchair_d").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DININGCHAIR_j = new BlockDiningChair(Material.WOOD).setRegistryName("block_diningchair_j").setUnlocalizedName("block_diningchair_j").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DININGCHAIR_s = new BlockDiningChair(Material.WOOD).setRegistryName("block_diningchair_s").setUnlocalizedName("block_diningchair_s").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		UNITDESK = new BlockUnitDesk(Material.WOOD).setRegistryName("block_unitdesk").setUnlocalizedName("block_unitdesk").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		UNITDESK_a = new BlockUnitDesk_a(Material.WOOD).setRegistryName("block_unitdesk_a").setUnlocalizedName("block_unitdesk_a").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		UNITDESK_b = new BlockUnitDesk_b(Material.WOOD).setRegistryName("block_unitdesk_b").setUnlocalizedName("block_unitdesk_b").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		UNITDESK_d = new BlockUnitDesk_d(Material.WOOD).setRegistryName("block_unitdesk_d").setUnlocalizedName("block_unitdesk_d").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		UNITDESK_j = new BlockUnitDesk_j(Material.WOOD).setRegistryName("block_unitdesk_j").setUnlocalizedName("block_unitdesk_j").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		UNITDESK_s = new BlockUnitDesk_s(Material.WOOD).setRegistryName("block_unitdesk_s").setUnlocalizedName("block_unitdesk_s").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		ZAISU_black = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_black").setUnlocalizedName("block_zaisu_black").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_blue = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_blue").setUnlocalizedName("block_zaisu_blue").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_brown = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_brown").setUnlocalizedName("block_zaisu_brown").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_cyan = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_cyan").setUnlocalizedName("block_zaisu_cyan").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_gray = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_gray").setUnlocalizedName("block_zaisu_gray").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_green = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_green").setUnlocalizedName("block_zaisu_green").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_lightb = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_lightb").setUnlocalizedName("block_zaisu_lightb").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_lightg = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_lightg").setUnlocalizedName("block_zaisu_lightg").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_lime = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_lime").setUnlocalizedName("block_zaisu_lime").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_magenta = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_magenta").setUnlocalizedName("block_zaisu_magenta").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_orange = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_orange").setUnlocalizedName("block_zaisu_orange").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_pink = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_pink").setUnlocalizedName("block_zaisu_pink").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_purple = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_purple").setUnlocalizedName("block_zaisu_purple").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_red = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_red").setUnlocalizedName("block_zaisu_red").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_white = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_white").setUnlocalizedName("block_zaisu_white").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_yellow = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_yellow").setUnlocalizedName("block_zaisu_yellow").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);

		ADMIRALCHAIR = new BlockAdmiralChair(Material.WOOD).setRegistryName("block_admiralchair").setUnlocalizedName("block_admiralchair").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		ADMIRALCHAIR_red = new BlockAdmiralChair(Material.WOOD).setRegistryName("block_admiralchair_red").setUnlocalizedName("block_admiralchair_red").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

	}


	public static void register() {
		//ブロックを登録
		registerBlock(DRESSINGTABLE);
		registerBlock(DRESSINGTABLE_a);
		registerBlock(DRESSINGTABLE_b);
		registerBlock(DRESSINGTABLE_d);
		registerBlock(DRESSINGTABLE_j);
		registerBlock(DRESSINGTABLE_s);

		registerBlock(CAFECHAIR_black);
		registerBlock(CAFECHAIR_blue);
		registerBlock(CAFECHAIR_brown);
		registerBlock(CAFECHAIR_cyan);
		registerBlock(CAFECHAIR_gray);
		registerBlock(CAFECHAIR_green);
		registerBlock(CAFECHAIR_lightb);
		registerBlock(CAFECHAIR_lightg);
		registerBlock(CAFECHAIR_lime);
		registerBlock(CAFECHAIR_magenta);
		registerBlock(CAFECHAIR_orange);
		registerBlock(CAFECHAIR_pink);
		registerBlock(CAFECHAIR_purple);
		registerBlock(CAFECHAIR_red);
		registerBlock(CAFECHAIR_white);
		registerBlock(CAFECHAIR_yellow);

		registerBlock(DININGCHAIR);
		registerBlock(DININGCHAIR_a);
		registerBlock(DININGCHAIR_b);
		registerBlock(DININGCHAIR_d);
		registerBlock(DININGCHAIR_j);
		registerBlock(DININGCHAIR_s);

		registerBlock(UNITDESK);
		registerBlock(UNITDESK_a);
		registerBlock(UNITDESK_b);
		registerBlock(UNITDESK_d);
		registerBlock(UNITDESK_j);
		registerBlock(UNITDESK_s);

		registerBlock(ZAISU_black);
		registerBlock(ZAISU_blue);
		registerBlock(ZAISU_brown);
		registerBlock(ZAISU_cyan);
		registerBlock(ZAISU_gray);
		registerBlock(ZAISU_green);
		registerBlock(ZAISU_lightb);
		registerBlock(ZAISU_lightg);
		registerBlock(ZAISU_lime);
		registerBlock(ZAISU_magenta);
		registerBlock(ZAISU_orange);
		registerBlock(ZAISU_pink);
		registerBlock(ZAISU_purple);
		registerBlock(ZAISU_red);
		registerBlock(ZAISU_white);
		registerBlock(ZAISU_yellow);

		registerBlock(ADMIRALCHAIR);
		registerBlock(ADMIRALCHAIR_red);


	}

	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}


	public static void registerRenders() {
		//ブロックのモデルを登録
		registerRender(DRESSINGTABLE);
		registerRender(DRESSINGTABLE_a);
		registerRender(DRESSINGTABLE_b);
		registerRender(DRESSINGTABLE_d);
		registerRender(DRESSINGTABLE_j);
		registerRender(DRESSINGTABLE_s);

		registerRender(CAFECHAIR_black);
		registerRender(CAFECHAIR_blue);
		registerRender(CAFECHAIR_brown);
		registerRender(CAFECHAIR_cyan);
		registerRender(CAFECHAIR_gray);
		registerRender(CAFECHAIR_green);
		registerRender(CAFECHAIR_lightb);
		registerRender(CAFECHAIR_lightg);
		registerRender(CAFECHAIR_lime);
		registerRender(CAFECHAIR_magenta);
		registerRender(CAFECHAIR_orange);
		registerRender(CAFECHAIR_pink);
		registerRender(CAFECHAIR_purple);
		registerRender(CAFECHAIR_red);
		registerRender(CAFECHAIR_white);
		registerRender(CAFECHAIR_yellow);

		registerRender(DININGCHAIR);
		registerRender(DININGCHAIR_a);
		registerRender(DININGCHAIR_b);
		registerRender(DININGCHAIR_d);
		registerRender(DININGCHAIR_j);
		registerRender(DININGCHAIR_s);

		registerRender(UNITDESK);
		registerRender(UNITDESK_a);
		registerRender(UNITDESK_b);
		registerRender(UNITDESK_d);
		registerRender(UNITDESK_j);
		registerRender(UNITDESK_s);

		registerRender(ZAISU_black);
		registerRender(ZAISU_blue);
		registerRender(ZAISU_brown);
		registerRender(ZAISU_cyan);
		registerRender(ZAISU_gray);
		registerRender(ZAISU_green);
		registerRender(ZAISU_lightb);
		registerRender(ZAISU_lightg);
		registerRender(ZAISU_lime);
		registerRender(ZAISU_magenta);
		registerRender(ZAISU_orange);
		registerRender(ZAISU_pink);
		registerRender(ZAISU_purple);
		registerRender(ZAISU_red);
		registerRender(ZAISU_white);
		registerRender(ZAISU_yellow);

		registerRender(ADMIRALCHAIR);
		registerRender(ADMIRALCHAIR_red);

	}


    public static void registerRender(Block block) {
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
    			new ModelResourceLocation(block.getRegistryName(),"inventory"));
    }
}
