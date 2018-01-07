package com.ayutaki.chinjufumod.init.items;

import java.util.List;

import javax.annotation.Nullable;

import com.ayutaki.chinjufumod.init.TTimeItems;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
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
	public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.item.item_moromi.name", meta));
	}
}
