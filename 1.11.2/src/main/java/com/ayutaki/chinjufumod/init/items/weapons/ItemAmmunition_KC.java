package com.ayutaki.chinjufumod.init.items.weapons;

import com.ayutaki.chinjufumod.entity.EntityAmmunition_KC;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAmmunition_KC extends ItemArrow {

	public ItemAmmunition_KC() {
		super();
	}

	public EntityArrow createArrow(World world, ItemStack itemstack, EntityLivingBase shooter) {
		return new EntityAmmunition_KC(world, shooter);
	}

}
