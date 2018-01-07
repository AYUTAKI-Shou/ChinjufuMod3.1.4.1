package com.ayutaki.chinjufumod.init;

import java.util.LinkedList;
import java.util.List;

import com.ayutaki.chinjufumod.init.blocks.BlockAdmiralStamp;
import com.ayutaki.chinjufumod.init.blocks.BlockBauxiteOre;
import com.ayutaki.chinjufumod.init.blocks.BlockEmptyBox;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ChinjufuModBlocks {

	public static Block BAUXITE_ORE;
	public static Block EMPTY_BOX;
	public static Block B_ADMIRAL_STAMP;

	public static void init() {

		BAUXITE_ORE = new BlockBauxiteOre().setRegistryName("block_bauxite_ore").setUnlocalizedName("block_bauxite_ore").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		EMPTY_BOX = new BlockEmptyBox().setRegistryName("block_empty_box").setUnlocalizedName("block_empty_box").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		B_ADMIRAL_STAMP = new BlockAdmiralStamp(Material.WOOD).setRegistryName("block_stamp_block").setUnlocalizedName("block_stamp_block").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

	}


	public static void register() {

		registerBlock(BAUXITE_ORE);
		registerBlock(EMPTY_BOX);
		registerBlock(B_ADMIRAL_STAMP);
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

		registerRender(BAUXITE_ORE);
		registerRender(EMPTY_BOX);
		registerRender(B_ADMIRAL_STAMP);
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

			ChinjufuModBlocks.init();
			ChinjufuModBlocks.register();
			BLOCKS.stream().forEach(block -> event.getRegistry().register(block));
		}
	}
}
