package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.items.weapons.ItemAmmunition_KC;
import com.ayutaki.chinjufumod.init.items.weapons.ItemKoukakuHou100;
import com.ayutaki.chinjufumod.init.items.weapons.ItemRensouHou127;
import com.ayutaki.chinjufumod.init.items.weapons.ItemShigureHou;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class New_ChinjufuModWeapons {

	public static Item AMMUNITION_KC;
	public static Item CARTRIDGE_KC;

	public static Item RENSOUHOU_127;
	public static Item SHIGUREHOU;
	public static Item KOUKAKUHOU_100;

	public static void init() {

		AMMUNITION_KC = new ItemAmmunition_KC().setRegistryName("item_ammunition_kc").setUnlocalizedName("item_ammunition_kc").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CARTRIDGE_KC = new Item().setRegistryName("item_cartridge_kc").setUnlocalizedName("item_cartridge_kc");

		RENSOUHOU_127 = new ItemRensouHou127().setRegistryName("item_rensouhou127").setUnlocalizedName("item_rensouhou127").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SHIGUREHOU = new ItemShigureHou().setRegistryName("item_shigurehou").setUnlocalizedName("item_shigurehou").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		KOUKAKUHOU_100 = new ItemKoukakuHou100().setRegistryName("item_koukakuhou100").setUnlocalizedName("item_koukakuhou100").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
	}

	public static void register() {
		registerItem(AMMUNITION_KC);
		registerItem(CARTRIDGE_KC);

		registerItem(RENSOUHOU_127);
		registerItem(SHIGUREHOU);
		registerItem(KOUKAKUHOU_100);
	}

	public static void registerItem(Item item) {
		GameRegistry.register(item);
	}

	public static void registerRenders() {

		registerRender(AMMUNITION_KC);
		registerRender(CARTRIDGE_KC);

		registerRender(RENSOUHOU_127);
		registerRender(SHIGUREHOU);
		registerRender(KOUKAKUHOU_100);

	}

	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
