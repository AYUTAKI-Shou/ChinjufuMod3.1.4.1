package com.ayutaki.chinjufumod.init.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemSenbei extends ItemFood {

	public ItemSenbei(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.setHasSubtypes(true);

        this.setRegistryName("item_food_senbei");
        this.setUnlocalizedName("item_food_senbei");
    }

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.item.item_food_senbei.name", meta));
	}
}
