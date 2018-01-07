package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.ranma.BlockKanki_aca;
import com.ayutaki.chinjufumod.init.ranma.BlockKanki_aca_1;
import com.ayutaki.chinjufumod.init.ranma.BlockKanki_bir;
import com.ayutaki.chinjufumod.init.ranma.BlockKanki_bir_1;
import com.ayutaki.chinjufumod.init.ranma.BlockKanki_doak;
import com.ayutaki.chinjufumod.init.ranma.BlockKanki_doak_1;
import com.ayutaki.chinjufumod.init.ranma.BlockKanki_jun;
import com.ayutaki.chinjufumod.init.ranma.BlockKanki_jun_1;
import com.ayutaki.chinjufumod.init.ranma.BlockKanki_oak;
import com.ayutaki.chinjufumod.init.ranma.BlockKanki_oak_1;
import com.ayutaki.chinjufumod.init.ranma.BlockKanki_spru;
import com.ayutaki.chinjufumod.init.ranma.BlockKanki_spru_1;
import com.ayutaki.chinjufumod.init.ranma.BlockKoushi_aca;
import com.ayutaki.chinjufumod.init.ranma.BlockKoushi_aca_1;
import com.ayutaki.chinjufumod.init.ranma.BlockKoushi_bir;
import com.ayutaki.chinjufumod.init.ranma.BlockKoushi_bir_1;
import com.ayutaki.chinjufumod.init.ranma.BlockKoushi_doak;
import com.ayutaki.chinjufumod.init.ranma.BlockKoushi_doak_1;
import com.ayutaki.chinjufumod.init.ranma.BlockKoushi_jun;
import com.ayutaki.chinjufumod.init.ranma.BlockKoushi_jun_1;
import com.ayutaki.chinjufumod.init.ranma.BlockKoushi_oak;
import com.ayutaki.chinjufumod.init.ranma.BlockKoushi_oak_1;
import com.ayutaki.chinjufumod.init.ranma.BlockKoushi_spru;
import com.ayutaki.chinjufumod.init.ranma.BlockKoushi_spru_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaB_aca;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaB_aca_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaB_bir;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaB_bir_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaB_doak;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaB_doak_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaB_jun;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaB_jun_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaB_oak;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaB_oak_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaB_spru;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaB_spru_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaC_aca;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaC_aca_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaC_bir;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaC_bir_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaC_doak;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaC_doak_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaC_jun;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaC_jun_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaC_oak;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaC_oak_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaC_spru;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaC_spru_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanma_aca;
import com.ayutaki.chinjufumod.init.ranma.BlockRanma_aca_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanma_bir;
import com.ayutaki.chinjufumod.init.ranma.BlockRanma_bir_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanma_doak;
import com.ayutaki.chinjufumod.init.ranma.BlockRanma_doak_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanma_jun;
import com.ayutaki.chinjufumod.init.ranma.BlockRanma_jun_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanma_oak;
import com.ayutaki.chinjufumod.init.ranma.BlockRanma_oak_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanma_spru;
import com.ayutaki.chinjufumod.init.ranma.BlockRanma_spru_1;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ASDecoModRanma {

	public static Block RANMA_aca, RANMA_bir, RANMA_doak,
						RANMA_jun, RANMA_oak, RANMA_spru;
	public static Block RANMA_aca_1, RANMA_bir_1, RANMA_doak_1,
						RANMA_jun_1, RANMA_oak_1, RANMA_spru_1;

	public static Block RANMAB_aca, RANMAB_bir, RANMAB_doak,
						RANMAB_jun, RANMAB_oak, RANMAB_spru;
	public static Block RANMAB_aca_1, RANMAB_bir_1, RANMAB_doak_1,
						RANMAB_jun_1, RANMAB_oak_1, RANMAB_spru_1;

	public static Block RANMAC_aca, RANMAC_bir, RANMAC_doak,
						RANMAC_jun, RANMAC_oak, RANMAC_spru;
	public static Block RANMAC_aca_1, RANMAC_bir_1, RANMAC_doak_1,
						RANMAC_jun_1, RANMAC_oak_1, RANMAC_spru_1;

	public static Block KANKI_aca, KANKI_bir, KANKI_doak,
						KANKI_jun, KANKI_oak, KANKI_spru;
	public static Block KANKI_aca_1, KANKI_bir_1, KANKI_doak_1,
						KANKI_jun_1, KANKI_oak_1, KANKI_spru_1;

	public static Block KOUSHI_oak, KOUSHI_aca, KOUSHI_bir,
						KOUSHI_doak, KOUSHI_jun, KOUSHI_spru;
	public static Block KOUSHI_oak_1, KOUSHI_aca_1, KOUSHI_bir_1,
						KOUSHI_doak_1, KOUSHI_jun_1, KOUSHI_spru_1;

	public static void init() {

		RANMA_aca = new BlockRanma_aca(Material.WOOD, "block_ranma_aca").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		RANMA_bir = new BlockRanma_bir(Material.WOOD, "block_ranma_bir").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		RANMA_doak = new BlockRanma_doak(Material.WOOD, "block_ranma_doak").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		RANMA_jun = new BlockRanma_jun(Material.WOOD, "block_ranma_jun").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		RANMA_oak = new BlockRanma_oak(Material.WOOD, "block_ranma_oak").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		RANMA_spru = new BlockRanma_spru(Material.WOOD, "block_ranma_spru").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		RANMA_aca_1 = new BlockRanma_aca_1(Material.WOOD, "block_ranma_aca_1");
		RANMA_bir_1 = new BlockRanma_bir_1(Material.WOOD, "block_ranma_bir_1");
		RANMA_doak_1 = new BlockRanma_doak_1(Material.WOOD, "block_ranma_doak_1");
		RANMA_jun_1 = new BlockRanma_jun_1(Material.WOOD, "block_ranma_jun_1");
		RANMA_oak_1 = new BlockRanma_oak_1(Material.WOOD, "block_ranma_oak_1");
		RANMA_spru_1 = new BlockRanma_spru_1(Material.WOOD, "block_ranma_spru_1");

		RANMAB_aca = new BlockRanmaB_aca(Material.WOOD, "block_ranmab_aca").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		RANMAB_bir = new BlockRanmaB_bir(Material.WOOD, "block_ranmab_bir").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		RANMAB_doak = new BlockRanmaB_doak(Material.WOOD, "block_ranmab_doak").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		RANMAB_jun = new BlockRanmaB_jun(Material.WOOD, "block_ranmab_jun").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		RANMAB_oak = new BlockRanmaB_oak(Material.WOOD, "block_ranmab_oak").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		RANMAB_spru = new BlockRanmaB_spru(Material.WOOD, "block_ranmab_spru").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		RANMAB_aca_1 = new BlockRanmaB_aca_1(Material.WOOD, "block_ranmab_aca_1");
		RANMAB_bir_1 = new BlockRanmaB_bir_1(Material.WOOD, "block_ranmab_bir_1");
		RANMAB_doak_1 = new BlockRanmaB_doak_1(Material.WOOD, "block_ranmab_doak_1");
		RANMAB_jun_1 = new BlockRanmaB_jun_1(Material.WOOD, "block_ranmab_jun_1");
		RANMAB_oak_1 = new BlockRanmaB_oak_1(Material.WOOD, "block_ranmab_oak_1");
		RANMAB_spru_1 = new BlockRanmaB_spru_1(Material.WOOD, "block_ranmab_spru_1");

		RANMAC_aca = new BlockRanmaC_aca(Material.WOOD, "block_ranmac_aca").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		RANMAC_bir = new BlockRanmaC_bir(Material.WOOD, "block_ranmac_bir").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		RANMAC_doak = new BlockRanmaC_doak(Material.WOOD, "block_ranmac_doak").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		RANMAC_jun = new BlockRanmaC_jun(Material.WOOD, "block_ranmac_jun").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		RANMAC_oak = new BlockRanmaC_oak(Material.WOOD, "block_ranmac_oak").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		RANMAC_spru = new BlockRanmaC_spru(Material.WOOD, "block_ranmac_spru").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		RANMAC_aca_1 = new BlockRanmaC_aca_1(Material.WOOD, "block_ranmac_aca_1");
		RANMAC_bir_1 = new BlockRanmaC_bir_1(Material.WOOD, "block_ranmac_bir_1");
		RANMAC_doak_1 = new BlockRanmaC_doak_1(Material.WOOD, "block_ranmac_doak_1");
		RANMAC_jun_1 = new BlockRanmaC_jun_1(Material.WOOD, "block_ranmac_jun_1");
		RANMAC_oak_1 = new BlockRanmaC_oak_1(Material.WOOD, "block_ranmac_oak_1");
		RANMAC_spru_1 = new BlockRanmaC_spru_1(Material.WOOD, "block_ranmac_spru_1");

		KANKI_aca = new BlockKanki_aca(Material.WOOD, "block_kanki_aca").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KANKI_bir = new BlockKanki_bir(Material.WOOD, "block_kanki_bir").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KANKI_doak = new BlockKanki_doak(Material.WOOD, "block_kanki_doak").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KANKI_jun = new BlockKanki_jun(Material.WOOD, "block_kanki_jun").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KANKI_oak = new BlockKanki_oak(Material.WOOD, "block_kanki_oak").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KANKI_spru = new BlockKanki_spru(Material.WOOD, "block_kanki_spru").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KANKI_aca_1 = new BlockKanki_aca_1(Material.WOOD, "block_kanki_aca_1");
		KANKI_bir_1 = new BlockKanki_bir_1(Material.WOOD, "block_kanki_bir_1");
		KANKI_doak_1 = new BlockKanki_doak_1(Material.WOOD, "block_kanki_doak_1");
		KANKI_jun_1 = new BlockKanki_jun_1(Material.WOOD, "block_kanki_jun_1");
		KANKI_oak_1 = new BlockKanki_oak_1(Material.WOOD, "block_kanki_oak_1");
		KANKI_spru_1 = new BlockKanki_spru_1(Material.WOOD, "block_kanki_spru_1");

		KOUSHI_oak = new BlockKoushi_oak(Material.WOOD, "block_koushi_oak").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KOUSHI_aca = new BlockKoushi_aca(Material.WOOD, "block_koushi_aca").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KOUSHI_bir = new BlockKoushi_bir(Material.WOOD, "block_koushi_bir").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KOUSHI_doak = new BlockKoushi_doak(Material.WOOD, "block_koushi_doak").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KOUSHI_jun = new BlockKoushi_jun(Material.WOOD, "block_koushi_jun").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KOUSHI_spru = new BlockKoushi_spru(Material.WOOD, "block_koushi_spru").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KOUSHI_oak_1 = new BlockKoushi_oak_1(Material.WOOD, "block_koushi_oak_1");
		KOUSHI_aca_1 = new BlockKoushi_aca_1(Material.WOOD, "block_koushi_aca_1");
		KOUSHI_bir_1 = new BlockKoushi_bir_1(Material.WOOD, "block_koushi_bir_1");
		KOUSHI_doak_1 = new BlockKoushi_doak_1(Material.WOOD, "block_koushi_doak_1");
		KOUSHI_jun_1 = new BlockKoushi_jun_1(Material.WOOD, "block_koushi_jun_1");
		KOUSHI_spru_1 = new BlockKoushi_spru_1(Material.WOOD, "block_koushi_spru_1");

	}


	public static void register() {

		registerBlock(RANMA_aca);
		registerBlock(RANMA_bir);
		registerBlock(RANMA_doak);
		registerBlock(RANMA_jun);
		registerBlock(RANMA_oak);
		registerBlock(RANMA_spru);
		registerBlock(RANMA_aca_1);
		registerBlock(RANMA_bir_1);
		registerBlock(RANMA_doak_1);
		registerBlock(RANMA_jun_1);
		registerBlock(RANMA_oak_1);
		registerBlock(RANMA_spru_1);

		registerBlock(RANMAB_aca);
		registerBlock(RANMAB_bir);
		registerBlock(RANMAB_doak);
		registerBlock(RANMAB_jun);
		registerBlock(RANMAB_oak);
		registerBlock(RANMAB_spru);
		registerBlock(RANMAB_aca_1);
		registerBlock(RANMAB_bir_1);
		registerBlock(RANMAB_doak_1);
		registerBlock(RANMAB_jun_1);
		registerBlock(RANMAB_oak_1);
		registerBlock(RANMAB_spru_1);

		registerBlock(RANMAC_aca);
		registerBlock(RANMAC_bir);
		registerBlock(RANMAC_doak);
		registerBlock(RANMAC_jun);
		registerBlock(RANMAC_oak);
		registerBlock(RANMAC_spru);
		registerBlock(RANMAC_aca_1);
		registerBlock(RANMAC_bir_1);
		registerBlock(RANMAC_doak_1);
		registerBlock(RANMAC_jun_1);
		registerBlock(RANMAC_oak_1);
		registerBlock(RANMAC_spru_1);

		registerBlock(KANKI_aca);
		registerBlock(KANKI_bir);
		registerBlock(KANKI_doak);
		registerBlock(KANKI_jun);
		registerBlock(KANKI_oak);
		registerBlock(KANKI_spru);
		registerBlock(KANKI_aca_1);
		registerBlock(KANKI_bir_1);
		registerBlock(KANKI_doak_1);
		registerBlock(KANKI_jun_1);
		registerBlock(KANKI_oak_1);
		registerBlock(KANKI_spru_1);

		registerBlock(KOUSHI_oak);
		registerBlock(KOUSHI_aca);
		registerBlock(KOUSHI_bir);
		registerBlock(KOUSHI_doak);
		registerBlock(KOUSHI_jun);
		registerBlock(KOUSHI_spru);
		registerBlock(KOUSHI_oak_1);
		registerBlock(KOUSHI_aca_1);
		registerBlock(KOUSHI_bir_1);
		registerBlock(KOUSHI_doak_1);
		registerBlock(KOUSHI_jun_1);
		registerBlock(KOUSHI_spru_1);
	}

	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}


	public static void registerRenders() {

		registerRender(RANMA_aca);
		registerRender(RANMA_bir);
		registerRender(RANMA_doak);
		registerRender(RANMA_jun);
		registerRender(RANMA_oak);
		registerRender(RANMA_spru);

		registerRender(RANMAB_aca);
		registerRender(RANMAB_bir);
		registerRender(RANMAB_doak);
		registerRender(RANMAB_jun);
		registerRender(RANMAB_oak);
		registerRender(RANMAB_spru);

		registerRender(RANMAC_aca);
		registerRender(RANMAC_bir);
		registerRender(RANMAC_doak);
		registerRender(RANMAC_jun);
		registerRender(RANMAC_oak);
		registerRender(RANMAC_spru);

		registerRender(KANKI_aca);
		registerRender(KANKI_bir);
		registerRender(KANKI_doak);
		registerRender(KANKI_jun);
		registerRender(KANKI_oak);
		registerRender(KANKI_spru);

		registerRender(KOUSHI_oak);
		registerRender(KOUSHI_aca);
		registerRender(KOUSHI_bir);
		registerRender(KOUSHI_doak);
		registerRender(KOUSHI_jun);
		registerRender(KOUSHI_spru);

	}

    public static void registerRender(Block block) {
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
    			new ModelResourceLocation(block.getRegistryName(),"inventory"));
    }
}
