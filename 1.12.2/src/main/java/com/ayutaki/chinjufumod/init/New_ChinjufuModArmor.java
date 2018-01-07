package com.ayutaki.chinjufumod.init;

import java.util.LinkedList;
import java.util.List;

import com.ayutaki.chinjufumod.init.items.armor.ItemFubukiArmor;
import com.ayutaki.chinjufumod.init.items.armor.ItemKasumiArmor;
import com.ayutaki.chinjufumod.init.items.armor.ItemSantaAkashi;
import com.ayutaki.chinjufumod.init.items.armor.ItemSantaKumano;
import com.ayutaki.chinjufumod.init.items.armor.ItemSantaRyujou;
import com.ayutaki.chinjufumod.init.items.armor.ItemSantaSuzuya;
import com.ayutaki.chinjufumod.init.items.armor.ItemSantaTeitoku;
import com.ayutaki.chinjufumod.init.items.armor.ItemShigureArmor;
import com.ayutaki.chinjufumod.init.items.armor.ItemShiratsuyuArmor;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class New_ChinjufuModArmor {

	public static Item FUBUKI_HELMET, FUBUKI_CHESTPLATE, FUBUKI_LEGGINGS, FUBUKI_BOOTS;
	public static Item KASUMI_HELMET, KASUMI_CHESTPLATE, KASUMI_LEGGINGS, KASUMI_BOOTS;
	public static Item SHIGURE_HELMET, SHIGURE_CHESTPLATE, SHIGURE_LEGGINGS, SHIGURE_BOOTS;
	public static Item SHIRATSUYU_HELMET, SHIRATSUYU_CHESTPLATE, SHIRATSUYU_LEGGINGS, SHIRATSUYU_BOOTS;

	public static Item AKASHISANTA_HELMET, AKASHISANTA_CHESTPLATE, AKASHISANTA_LEGGINGS, AKASHISANTA_BOOTS;
	public static Item KUMANOSANTA_HELMET, KUMANOSANTA_CHESTPLATE, KUMANOSANTA_LEGGINGS, KUMANOSANTA_BOOTS;
	public static Item SUZUYASANTA_HELMET, SUZUYASANTA_CHESTPLATE, SUZUYASANTA_LEGGINGS, SUZUYASANTA_BOOTS;
	public static Item RYUJOUSANTA_HELMET, RYUJOUSANTA_CHESTPLATE, RYUJOUSANTA_LEGGINGS, RYUJOUSANTA_BOOTS;
	public static Item TEITOKUSANTA_HELMET, TEITOKUSANTA_CHESTPLATE, TEITOKUSANTA_LEGGINGS, TEITOKUSANTA_BOOTS;

	public static void init() {
		//アイテムのインスタンス(実体)生成

		FUBUKI_HELMET = new ItemFubukiArmor(1, EntityEquipmentSlot.HEAD).setRegistryName("item_fubuki_helmet").setUnlocalizedName("item_fubuki_helmet").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		FUBUKI_CHESTPLATE = new ItemFubukiArmor(1,EntityEquipmentSlot.CHEST).setRegistryName("item_fubuki_chestplate").setUnlocalizedName("item_fubuki_chestplate").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		FUBUKI_LEGGINGS = new ItemFubukiArmor(2, EntityEquipmentSlot.LEGS).setRegistryName("item_fubuki_leggings").setUnlocalizedName("item_fubuki_leggings").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		FUBUKI_BOOTS = new ItemFubukiArmor(1,EntityEquipmentSlot.FEET).setRegistryName("item_fubuki_boots").setUnlocalizedName("item_fubuki_boots").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		KASUMI_HELMET = new ItemKasumiArmor(1, EntityEquipmentSlot.HEAD).setRegistryName("item_kasumi_helmet").setUnlocalizedName("item_kasumi_helmet").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		KASUMI_CHESTPLATE = new ItemKasumiArmor(1,EntityEquipmentSlot.CHEST).setRegistryName("item_kasumi_chestplate").setUnlocalizedName("item_kasumi_chestplate").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		KASUMI_LEGGINGS = new ItemKasumiArmor(2, EntityEquipmentSlot.LEGS).setRegistryName("item_kasumi_leggings").setUnlocalizedName("item_kasumi_leggings").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		KASUMI_BOOTS = new ItemKasumiArmor(1,EntityEquipmentSlot.FEET).setRegistryName("item_kasumi_boots").setUnlocalizedName("item_kasumi_boots").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		SHIGURE_HELMET = new ItemShigureArmor(1, EntityEquipmentSlot.HEAD).setRegistryName("item_shigure_helmet").setUnlocalizedName("item_shigure_helmet").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SHIGURE_CHESTPLATE = new ItemShigureArmor(1,EntityEquipmentSlot.CHEST).setRegistryName("item_shigure_chestplate").setUnlocalizedName("item_shigure_chestplate").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SHIGURE_LEGGINGS = new ItemShigureArmor(2, EntityEquipmentSlot.LEGS).setRegistryName("item_shigure_leggings").setUnlocalizedName("item_shigure_leggings").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SHIGURE_BOOTS = new ItemShigureArmor(1,EntityEquipmentSlot.FEET).setRegistryName("item_shigure_boots").setUnlocalizedName("item_shigure_boots").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		SHIRATSUYU_HELMET = new ItemShiratsuyuArmor(1, EntityEquipmentSlot.HEAD).setRegistryName("item_shiratsuyu_helmet").setUnlocalizedName("item_shiratsuyu_helmet").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SHIRATSUYU_CHESTPLATE = new ItemShiratsuyuArmor(1,EntityEquipmentSlot.CHEST).setRegistryName("item_shiratsuyu_chestplate").setUnlocalizedName("item_shiratsuyu_chestplate").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SHIRATSUYU_LEGGINGS = new ItemShiratsuyuArmor(2, EntityEquipmentSlot.LEGS).setRegistryName("item_shiratsuyu_leggings").setUnlocalizedName("item_shiratsuyu_leggings").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SHIRATSUYU_BOOTS = new ItemShiratsuyuArmor(1,EntityEquipmentSlot.FEET).setRegistryName("item_shiratsuyu_boots").setUnlocalizedName("item_shiratsuyu_boots").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		AKASHISANTA_HELMET = new ItemSantaAkashi(1, EntityEquipmentSlot.HEAD).setRegistryName("item_santaakashi_helmet").setUnlocalizedName("item_santaakashi_helmet").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		AKASHISANTA_CHESTPLATE = new ItemSantaAkashi(1,EntityEquipmentSlot.CHEST).setRegistryName("item_santaakashi_chestplate").setUnlocalizedName("item_santaakashi_chestplate").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		AKASHISANTA_LEGGINGS = new ItemSantaAkashi(2, EntityEquipmentSlot.LEGS).setRegistryName("item_santaakashi_leggings").setUnlocalizedName("item_santaakashi_leggings").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		AKASHISANTA_BOOTS = new ItemSantaAkashi(1,EntityEquipmentSlot.FEET).setRegistryName("item_santaakashi_boots").setUnlocalizedName("item_santaakashi_boots").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		KUMANOSANTA_HELMET = new ItemSantaKumano(1, EntityEquipmentSlot.HEAD).setRegistryName("item_santakumano_helmet").setUnlocalizedName("item_santakumano_helmet").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KUMANOSANTA_CHESTPLATE = new ItemSantaKumano(1,EntityEquipmentSlot.CHEST).setRegistryName("item_santakumano_chestplate").setUnlocalizedName("item_santakumano_chestplate").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KUMANOSANTA_LEGGINGS = new ItemSantaKumano(2, EntityEquipmentSlot.LEGS).setRegistryName("item_santakumano_leggings").setUnlocalizedName("item_santakumano_leggings").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KUMANOSANTA_BOOTS = new ItemSantaKumano(1,EntityEquipmentSlot.FEET).setRegistryName("item_santakumano_boots").setUnlocalizedName("item_santakumano_boots").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		SUZUYASANTA_HELMET = new ItemSantaSuzuya(1, EntityEquipmentSlot.HEAD).setRegistryName("item_santasuzuya_helmet").setUnlocalizedName("item_santasuzuya_helmet").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		SUZUYASANTA_CHESTPLATE = new ItemSantaSuzuya(1,EntityEquipmentSlot.CHEST).setRegistryName("item_santasuzuya_chestplate").setUnlocalizedName("item_santasuzuya_chestplate").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		SUZUYASANTA_LEGGINGS = new ItemSantaSuzuya(2, EntityEquipmentSlot.LEGS).setRegistryName("item_santasuzuya_leggings").setUnlocalizedName("item_santasuzuya_leggings").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		SUZUYASANTA_BOOTS = new ItemSantaSuzuya(1,EntityEquipmentSlot.FEET).setRegistryName("item_santasuzuya_boots").setUnlocalizedName("item_santasuzuya_boots").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		RYUJOUSANTA_HELMET = new ItemSantaRyujou(1, EntityEquipmentSlot.HEAD).setRegistryName("item_santaryujou_helmet").setUnlocalizedName("item_santaryujou_helmet").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		RYUJOUSANTA_CHESTPLATE = new ItemSantaRyujou(1,EntityEquipmentSlot.CHEST).setRegistryName("item_santaryujou_chestplate").setUnlocalizedName("item_santaryujou_chestplate").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		RYUJOUSANTA_LEGGINGS = new ItemSantaRyujou(2, EntityEquipmentSlot.LEGS).setRegistryName("item_santaryujou_leggings").setUnlocalizedName("item_santaryujou_leggings").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		RYUJOUSANTA_BOOTS = new ItemSantaRyujou(1,EntityEquipmentSlot.FEET).setRegistryName("item_santaryujou_boots").setUnlocalizedName("item_santaryujou_boots").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		TEITOKUSANTA_HELMET = new ItemSantaTeitoku(1, EntityEquipmentSlot.HEAD).setRegistryName("item_santattk_helmet").setUnlocalizedName("item_santattk_helmet").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		TEITOKUSANTA_CHESTPLATE = new ItemSantaTeitoku(1,EntityEquipmentSlot.CHEST).setRegistryName("item_santattk_chestplate").setUnlocalizedName("item_santattk_chestplate").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		TEITOKUSANTA_LEGGINGS = new ItemSantaTeitoku(2, EntityEquipmentSlot.LEGS).setRegistryName("item_santattk_leggings").setUnlocalizedName("item_santattk_leggings").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		TEITOKUSANTA_BOOTS = new ItemSantaTeitoku(1,EntityEquipmentSlot.FEET).setRegistryName("item_santattk_boots").setUnlocalizedName("item_santattk_boots").setCreativeTab(ChinjufuModTabs.tab_seasonal);

	}

	public static void register() {
		registerItem(FUBUKI_HELMET);
		registerItem(FUBUKI_CHESTPLATE);
		registerItem(FUBUKI_LEGGINGS);
		registerItem(FUBUKI_BOOTS);

		registerItem(KASUMI_HELMET);
		registerItem(KASUMI_CHESTPLATE);
		registerItem(KASUMI_LEGGINGS);
		registerItem(KASUMI_BOOTS);

		registerItem(SHIGURE_HELMET);
		registerItem(SHIGURE_CHESTPLATE);
		registerItem(SHIGURE_LEGGINGS);
		registerItem(SHIGURE_BOOTS);

		registerItem(SHIRATSUYU_HELMET);
		registerItem(SHIRATSUYU_CHESTPLATE);
		registerItem(SHIRATSUYU_LEGGINGS);
		registerItem(SHIRATSUYU_BOOTS);

		registerItem(AKASHISANTA_HELMET);
		registerItem(AKASHISANTA_CHESTPLATE);
		registerItem(AKASHISANTA_LEGGINGS);
		registerItem(AKASHISANTA_BOOTS);

		registerItem(KUMANOSANTA_HELMET);
		registerItem(KUMANOSANTA_CHESTPLATE);
		registerItem(KUMANOSANTA_LEGGINGS);
		registerItem(KUMANOSANTA_BOOTS);

		registerItem(SUZUYASANTA_HELMET);
		registerItem(SUZUYASANTA_CHESTPLATE);
		registerItem(SUZUYASANTA_LEGGINGS);
		registerItem(SUZUYASANTA_BOOTS);

		registerItem(RYUJOUSANTA_HELMET);
		registerItem(RYUJOUSANTA_CHESTPLATE);
		registerItem(RYUJOUSANTA_LEGGINGS);
		registerItem(RYUJOUSANTA_BOOTS);

		registerItem(TEITOKUSANTA_HELMET);
		registerItem(TEITOKUSANTA_CHESTPLATE);
		registerItem(TEITOKUSANTA_LEGGINGS);
		registerItem(TEITOKUSANTA_BOOTS);
	}

	public static void registerItem(Item item) {
		RegistrationHandler.ITEMS.add(item);
	}


	public static void registerRenders() {
		//アイテムのモデルを登録
		registerRender(FUBUKI_HELMET);
		registerRender(FUBUKI_CHESTPLATE);
		registerRender(FUBUKI_LEGGINGS);
		registerRender(FUBUKI_BOOTS);

		registerRender(KASUMI_HELMET);
		registerRender(KASUMI_CHESTPLATE);
		registerRender(KASUMI_LEGGINGS);
		registerRender(KASUMI_BOOTS);

		registerRender(SHIGURE_HELMET);
		registerRender(SHIGURE_CHESTPLATE);
		registerRender(SHIGURE_LEGGINGS);
		registerRender(SHIGURE_BOOTS);

		registerRender(SHIRATSUYU_HELMET);
		registerRender(SHIRATSUYU_CHESTPLATE);
		registerRender(SHIRATSUYU_LEGGINGS);
		registerRender(SHIRATSUYU_BOOTS);

		registerRender(AKASHISANTA_HELMET);
		registerRender(AKASHISANTA_CHESTPLATE);
		registerRender(AKASHISANTA_LEGGINGS);
		registerRender(AKASHISANTA_BOOTS);

		registerRender(KUMANOSANTA_HELMET);
		registerRender(KUMANOSANTA_CHESTPLATE);
		registerRender(KUMANOSANTA_LEGGINGS);
		registerRender(KUMANOSANTA_BOOTS);

		registerRender(SUZUYASANTA_HELMET);
		registerRender(SUZUYASANTA_CHESTPLATE);
		registerRender(SUZUYASANTA_LEGGINGS);
		registerRender(SUZUYASANTA_BOOTS);

		registerRender(RYUJOUSANTA_HELMET);
		registerRender(RYUJOUSANTA_CHESTPLATE);
		registerRender(RYUJOUSANTA_LEGGINGS);
		registerRender(RYUJOUSANTA_BOOTS);

		registerRender(TEITOKUSANTA_HELMET);
		registerRender(TEITOKUSANTA_CHESTPLATE);
		registerRender(TEITOKUSANTA_LEGGINGS);
		registerRender(TEITOKUSANTA_BOOTS);

	}

	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}

	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	public static class RegistrationHandler {

		public static final List<Item> ITEMS = new LinkedList<>();

		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {

			New_ChinjufuModArmor.init();
			New_ChinjufuModArmor.register();
			ITEMS.stream().forEach(item -> event.getRegistry().register(item));
		}
	}
}
