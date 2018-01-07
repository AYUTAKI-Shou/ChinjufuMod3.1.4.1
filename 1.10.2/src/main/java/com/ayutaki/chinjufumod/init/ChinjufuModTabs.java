package com.ayutaki.chinjufumod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ChinjufuModTabs {

	public static final CreativeTabs tab_chinjufumod = new CreativeTabs("tab_chinjufumod") {

		@Override
		public Item getTabIconItem() {
			return New_ChinjufuModItems.EMBLEM_C;
		}

	};

	public static final CreativeTabs tab_teatime = new CreativeTabs("tab_teatime") {

		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ChinjufuModFoodBlocks.TEACUP_1);
		}

	};

	public static final CreativeTabs tab_cmodwadeco = new CreativeTabs("tab_cmodwadeco") {

		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ASDecoModFusuma.FUSUMAB_CL_cyan);
		}

	};

	public static final CreativeTabs tab_cmodwablock = new CreativeTabs("tab_cmodwablock") {

		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ASDecoModKawara.KAWARA_gray);
		}

	};

	public static final CreativeTabs tab_wallpanel = new CreativeTabs("tab_wallpanel") {

		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(New_ASDecoModWallPane.WP_STONE_graB);
		}

	};

	public static final CreativeTabs tab_seasonal = new CreativeTabs("tab_seasonal") {

		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(New_ChinjufuModSeasons.XMASTREE);
		}

	};

}
