package com.ayutaki.chinjufumod.init.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.AchievementList;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemKoshu extends ItemFood {

	public ItemKoshu(int amount, float saturation, boolean isWolfFood) {

        super(amount, saturation, isWolfFood);
        this.setMaxStackSize(1);
    }

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack) {
        return stack.getMetadata() > 0;
    }

    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {

        if (!worldIn.isRemote) {

            if (stack.getMetadata() > 0) {

                player.addStat(AchievementList.OVERPOWERED);
                player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 400, 1));
                player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 6000, 0));
                player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 6000, 0));
                player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 2400, 3));
            }

            else {
                player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 100, 1));
                player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 2400, 0));
            }
        }
    }
}
