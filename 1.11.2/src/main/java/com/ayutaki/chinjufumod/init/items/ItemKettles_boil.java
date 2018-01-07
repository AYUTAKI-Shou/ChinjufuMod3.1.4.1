package com.ayutaki.chinjufumod.init.items;

import com.ayutaki.chinjufumod.init.TTimeItems;

import net.minecraft.item.Item;

public class ItemKettles_boil extends Item {

	public ItemKettles_boil() {
		super();

		/*クラフトで使うと、空のやかんが返ってくる*/
        this.setMaxStackSize(1);
        this.setContainerItem(TTimeItems.Item_YAKAN_kara);
	}

}
