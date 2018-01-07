package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.seasons.BlockChabudai;
import com.ayutaki.chinjufumod.init.seasons.BlockChabudai_aca;
import com.ayutaki.chinjufumod.init.seasons.BlockChabudai_bir;
import com.ayutaki.chinjufumod.init.seasons.BlockChabudai_doak;
import com.ayutaki.chinjufumod.init.seasons.BlockChabudai_jun;
import com.ayutaki.chinjufumod.init.seasons.BlockChabudai_spru;
import com.ayutaki.chinjufumod.init.seasons.BlockHinadan;
import com.ayutaki.chinjufumod.init.seasons.BlockHinakazari;
import com.ayutaki.chinjufumod.init.seasons.BlockKadomatsu;
import com.ayutaki.chinjufumod.init.seasons.BlockKagamiMochi;
import com.ayutaki.chinjufumod.init.seasons.BlockKotatsu;
import com.ayutaki.chinjufumod.init.seasons.BlockKotatsu_aca;
import com.ayutaki.chinjufumod.init.seasons.BlockKotatsu_bir;
import com.ayutaki.chinjufumod.init.seasons.BlockKotatsu_doak;
import com.ayutaki.chinjufumod.init.seasons.BlockKotatsu_jun;
import com.ayutaki.chinjufumod.init.seasons.BlockKotatsu_spru;
import com.ayutaki.chinjufumod.init.seasons.BlockPresent;
import com.ayutaki.chinjufumod.init.seasons.BlockShimenawa;
import com.ayutaki.chinjufumod.init.seasons.BlockXmasTree;
import com.ayutaki.chinjufumod.init.seasons.BlockYunomi;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class New_ChinjufuModSeasons {

	public static Block KAGAMIMOCHI;
	public static Block SHIMENAWA;
	public static Block KADOMATSU;

	public static Block HINAKAZARI;
	public static Block HINADAN;

	public static Block YUNOMI;

	public static Block CHABUDAI, CHABUDAI_aca, CHABUDAI_bir,
						CHABUDAI_doak, CHABUDAI_jun, CHABUDAI_spru;

	public static Block KOTATSU, KOTATSU_aca, KOTATSU_bir,
						KOTATSU_doak, KOTATSU_jun, KOTATSU_spru;

	public static Block XMASTREE, XMASTREE_W;

	public static Block PRESENT_Apple, PRESENT_Book, PRESENT_Diamond, PRESENT_Lapis, PRESENT_Blaze;

	public static void init() {

		KAGAMIMOCHI = new BlockKagamiMochi().setRegistryName("block_kagamimochi").setUnlocalizedName("block_kagamimochi").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		SHIMENAWA = new BlockShimenawa(Material.WOOD).setRegistryName("block_shimenawa").setUnlocalizedName("block_shimenawa").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KADOMATSU = new BlockKadomatsu().setRegistryName("block_kadomatsu").setUnlocalizedName("block_kadomatsu").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		HINAKAZARI = new BlockHinakazari(Material.WOOD).setRegistryName("block_hinakazari").setUnlocalizedName("block_hinakazari").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		HINADAN = new BlockHinadan(Material.WOOD).setRegistryName("block_hinadan").setUnlocalizedName("block_hinadan").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		YUNOMI = new BlockYunomi(Material.WOOD).setRegistryName("block_yunomi").setUnlocalizedName("block_yunomi");

		CHABUDAI = new BlockChabudai(Material.WOOD).setRegistryName("block_chabudai").setUnlocalizedName("block_chabudai").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		CHABUDAI_aca = new BlockChabudai_aca(Material.WOOD).setRegistryName("block_chabudai_aca").setUnlocalizedName("block_chabudai_aca").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		CHABUDAI_bir = new BlockChabudai_bir(Material.WOOD).setRegistryName("block_chabudai_bir").setUnlocalizedName("block_chabudai_bir").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		CHABUDAI_doak = new BlockChabudai_doak(Material.WOOD).setRegistryName("block_chabudai_doak").setUnlocalizedName("block_chabudai_doak").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		CHABUDAI_jun = new BlockChabudai_jun(Material.WOOD).setRegistryName("block_chabudai_jun").setUnlocalizedName("block_chabudai_jun").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		CHABUDAI_spru = new BlockChabudai_spru(Material.WOOD).setRegistryName("block_chabudai_spru").setUnlocalizedName("block_chabudai_spru").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		KOTATSU = new BlockKotatsu(Material.WOOD).setRegistryName("block_kotatsu").setUnlocalizedName("block_kotatsu").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KOTATSU_aca = new BlockKotatsu_aca(Material.WOOD).setRegistryName("block_kotatsu_aca").setUnlocalizedName("block_kotatsu_aca").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KOTATSU_bir = new BlockKotatsu_bir(Material.WOOD).setRegistryName("block_kotatsu_bir").setUnlocalizedName("block_kotatsu_bir").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KOTATSU_doak = new BlockKotatsu_doak(Material.WOOD).setRegistryName("block_kotatsu_doak").setUnlocalizedName("block_kotatsu_doak").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KOTATSU_jun = new BlockKotatsu_jun(Material.WOOD).setRegistryName("block_kotatsu_jun").setUnlocalizedName("block_kotatsu_jun").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KOTATSU_spru = new BlockKotatsu_spru(Material.WOOD).setRegistryName("block_kotatsu_spru").setUnlocalizedName("block_kotatsu_spru").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		XMASTREE = new BlockXmasTree().setRegistryName("block_xmastree").setUnlocalizedName("block_xmastree").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		XMASTREE_W = new BlockXmasTree().setRegistryName("block_xmastree_w").setUnlocalizedName("block_xmastree_w").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		PRESENT_Apple = new BlockPresent().setRegistryName("block_present_app").setUnlocalizedName("block_present_app").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		PRESENT_Book = new BlockPresent().setRegistryName("block_present_bok").setUnlocalizedName("block_present_bok").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		PRESENT_Diamond = new BlockPresent().setRegistryName("block_present_dia").setUnlocalizedName("block_present_dia").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		PRESENT_Lapis = new BlockPresent().setRegistryName("block_present_lap").setUnlocalizedName("block_present_lap").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		PRESENT_Blaze = new BlockPresent().setRegistryName("block_present_bla").setUnlocalizedName("block_present_bla").setCreativeTab(ChinjufuModTabs.tab_seasonal);
	}


	public static void register() {

		registerBlock(KAGAMIMOCHI);
		registerBlock(SHIMENAWA);
		registerBlock(KADOMATSU);

		registerBlock(HINAKAZARI);
		registerBlock(HINADAN);

		registerBlock(YUNOMI);

		registerBlock(CHABUDAI);
		registerBlock(CHABUDAI_aca);
		registerBlock(CHABUDAI_bir);
		registerBlock(CHABUDAI_doak);
		registerBlock(CHABUDAI_jun);
		registerBlock(CHABUDAI_spru);

		registerBlock(KOTATSU);
		registerBlock(KOTATSU_aca);
		registerBlock(KOTATSU_bir);
		registerBlock(KOTATSU_doak);
		registerBlock(KOTATSU_jun);
		registerBlock(KOTATSU_spru);

		registerBlock(XMASTREE);
		registerBlock(XMASTREE_W);

		registerBlock(PRESENT_Apple);
		registerBlock(PRESENT_Book);
		registerBlock(PRESENT_Diamond);
		registerBlock(PRESENT_Lapis);
		registerBlock(PRESENT_Blaze);
	}

	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}


	public static void registerRenders() {

		registerRender(KAGAMIMOCHI);
		registerRender(SHIMENAWA);
		registerRender(KADOMATSU);

		registerRender(HINAKAZARI);
		registerRender(HINADAN);

		registerRender(YUNOMI);

		registerRender(CHABUDAI);
		registerRender(CHABUDAI_aca);
		registerRender(CHABUDAI_bir);
		registerRender(CHABUDAI_doak);
		registerRender(CHABUDAI_jun);
		registerRender(CHABUDAI_spru);

		registerRender(KOTATSU);
		registerRender(KOTATSU_aca);
		registerRender(KOTATSU_bir);
		registerRender(KOTATSU_doak);
		registerRender(KOTATSU_jun);
		registerRender(KOTATSU_spru);

		registerRender(XMASTREE);
		registerRender(XMASTREE_W);

		registerRender(PRESENT_Apple);
		registerRender(PRESENT_Book);
		registerRender(PRESENT_Diamond);
		registerRender(PRESENT_Lapis);
		registerRender(PRESENT_Blaze);
	}


    public static void registerRender(Block block) {
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
    			new ModelResourceLocation(block.getRegistryName(),"inventory"));
    }
}
