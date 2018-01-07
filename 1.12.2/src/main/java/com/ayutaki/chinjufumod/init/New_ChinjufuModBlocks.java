package com.ayutaki.chinjufumod.init;

import java.util.LinkedList;
import java.util.List;

import com.ayutaki.chinjufumod.init.blocks.BlockAlumiBlock;
import com.ayutaki.chinjufumod.init.blocks.BlockAmmunitionBox;
import com.ayutaki.chinjufumod.init.blocks.BlockBauxiteBox;
import com.ayutaki.chinjufumod.init.blocks.BlockOilDrum;
import com.ayutaki.chinjufumod.init.blocks.BlockSteelBlock;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class New_ChinjufuModBlocks {

	public static Block OIL_DRUM;
	public static Block AMMUNITION_BOX;
	public static Block STEEL_BLOCK;
	public static Block BAUXITE_BOX;

	public static Block ALUMI_BLOCK;

	public static void init() {
		//ブロックのインスタンス生成
		OIL_DRUM = new BlockOilDrum().setRegistryName("block_fuel_can").setUnlocalizedName("block_fuel_can").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		AMMUNITION_BOX = new BlockAmmunitionBox().setRegistryName("block_ammunition_box").setUnlocalizedName("block_ammunition_box").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		STEEL_BLOCK = new BlockSteelBlock().setRegistryName("block_steel_block").setUnlocalizedName("block_steel_block").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		BAUXITE_BOX = new BlockBauxiteBox().setRegistryName("block_bauxite_box").setUnlocalizedName("block_bauxite_box").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		ALUMI_BLOCK = new BlockAlumiBlock().setRegistryName("block_alumi_block").setUnlocalizedName("block_alumi_block").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

	}


	public static void register() {
		//ブロックを登録

		registerBlock(OIL_DRUM);
		registerBlock(AMMUNITION_BOX);
		registerBlock(STEEL_BLOCK);
		registerBlock(BAUXITE_BOX);

		registerBlock(ALUMI_BLOCK);
	}

	public static void registerBlock(Block block) {
		registerBlock(block, new ItemBlock(block));
	}

	public static void registerBlock(Block block, ItemBlock item) {
		RegistrationHandler.BLOCKS.add(block);
		item.setRegistryName(block.getRegistryName());
		New_ChinjufuModItems.RegistrationHandler.ITEMS.add(item);
	}


	public static void registerRenders() {
		//ブロックのモデルを登録

		registerRender(OIL_DRUM);
		registerRender(AMMUNITION_BOX);
		registerRender(STEEL_BLOCK);
		registerRender(BAUXITE_BOX);

		registerRender(ALUMI_BLOCK);
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(block.getRegistryName(),"inventory"));
	}

	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	public static class RegistrationHandler {

		public static final List<Block> BLOCKS = new LinkedList<>();

		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Block> event) {

			New_ChinjufuModBlocks.init();
			New_ChinjufuModBlocks.register();
			BLOCKS.stream().forEach(block -> event.getRegistry().register(block));
		}
	}
}
