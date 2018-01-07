package com.ayutaki.chinjufumod.init.items;

import java.util.List;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemAdmiralStamp extends Item {

	public ItemAdmiralStamp() {
		super();
		//アイテムのスタック数・耐久値
		this.setMaxStackSize(1);
		this.setMaxDamage(15);
	}

	//getContainerItemStackを呼び出す
	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}

	//クラフト後のアイテムに、ダメージを与えて返す
	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		if (itemStack.getMaxDamage() == itemStack.getItemDamage()) {
			return (ItemStack) null;
		}
		else {
			ItemStack newItemStack = itemStack.copy();
			newItemStack.setItemDamage(itemStack.getItemDamage() + 1);
			return newItemStack;
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.item.item_admiral_stamp.name", meta));
	}
}
