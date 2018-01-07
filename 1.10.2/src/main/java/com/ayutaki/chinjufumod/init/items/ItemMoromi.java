package com.ayutaki.chinjufumod.init.items;

import java.util.List;

import com.ayutaki.chinjufumod.init.TTimeItems;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMoromi extends Item {

	public ItemMoromi() {
		super();

		/*返ってくるアイテムの登録順に注意*/
        this.setMaxStackSize(1);
        this.setContainerItem(TTimeItems.SAKEKASU);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.item.item_moromi.name", meta));
	}
}
