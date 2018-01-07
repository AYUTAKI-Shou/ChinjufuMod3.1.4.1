package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.items.ItemAdmiralStamp;
import com.ayutaki.chinjufumod.init.items.ItemClayKawara;
import com.ayutaki.chinjufumod.init.items.ItemSlakedlime;
import com.ayutaki.chinjufumod.init.items.ItemSumi;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class New_ChinjufuModItems {

	public static Item EMBLEM_C;
	public static Item ADMIRAL_STAMP;
	public static Item WORK_ORDER;
	public static Item BAUXITE;
	public static Item SUMI;

	public static Item SHOUSEKKAI;
	public static Item CLAYKAWARA;

	public static void init() {
		//アイテムのインスタンス(実体)生成
		EMBLEM_C = new Item().setRegistryName("item_emblem_c").setUnlocalizedName("item_emblem_c");
		ADMIRAL_STAMP = new ItemAdmiralStamp().setRegistryName("item_admiralstamp").setUnlocalizedName("item_admiral_stamp").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		WORK_ORDER = new Item().setRegistryName("item_workorder").setUnlocalizedName("item_work_order").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		BAUXITE = new Item().setRegistryName("item_bauxite").setUnlocalizedName("item_bauxite").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SUMI = new ItemSumi().setRegistryName("item_sumi_c").setUnlocalizedName("item_sumi_c").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		SHOUSEKKAI = new ItemSlakedlime().setRegistryName("item_shousekkai_c").setUnlocalizedName("item_shousekkai_c").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		CLAYKAWARA = new ItemClayKawara().setRegistryName("item_claykawara").setUnlocalizedName("item_claykawara").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);

	}

	public static void register() {
		registerItem(EMBLEM_C);
		registerItem(ADMIRAL_STAMP);
		registerItem(WORK_ORDER);
		registerItem(BAUXITE);
		registerItem(SUMI);

		registerItem(SHOUSEKKAI);
		registerItem(CLAYKAWARA);
	}

	public static void registerItem(Item item) {
		GameRegistry.register(item);
	}

	public static void registerRenders() {
		//アイテムのモデルを登録
		registerRender(EMBLEM_C);
		registerRender(ADMIRAL_STAMP);
		registerRender(WORK_ORDER);
		registerRender(BAUXITE);
		registerRender(SUMI);

		registerRender(SHOUSEKKAI);
		registerRender(CLAYKAWARA);

	}

	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
