package com.ayutaki.chinjufumod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ChinjufuModTabs {

	public static final CreativeTabs tab_chinjufumod = new CreativeTabs("tab_chinjufumod") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(New_ChinjufuModItems.EMBLEM_C);
		}

	};

	public static final CreativeTabs tab_teatime = new CreativeTabs("tab_teatime") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Item.getItemFromBlock(ChinjufuModFoodBlocks.TEACUP_1));
		}

	};

	public static final CreativeTabs tab_cmodwadeco = new CreativeTabs("tab_cmodwadeco") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Item.getItemFromBlock(ASDecoModFusuma.FUSUMAB_CL_cyan));
		}

	};

	public static final CreativeTabs tab_cmodwablock = new CreativeTabs("tab_cmodwablock") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Item.getItemFromBlock(ASDecoModKawara.KAWARA_gray));
		}

	};

	public static final CreativeTabs tab_wallpanel = new CreativeTabs("tab_wallpanel") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Item.getItemFromBlock(New_ASDecoModWallPane.WP_STONE_graB));
		}

	};

	public static final CreativeTabs tab_seasonal = new CreativeTabs("tab_seasonal") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Item.getItemFromBlock(New_ChinjufuModSeasons.XMASTREE));
		}

	};

}
