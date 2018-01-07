package com.ayutaki.chinjufumod.entity;

import com.ayutaki.chinjufumod.init.New_ChinjufuModWeapons;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class EntityAmmunition_KC extends EntityArrow implements IProjectile {


	public EntityAmmunition_KC(World worldIn) {
		super(worldIn);
	}

	public EntityAmmunition_KC(World worldIn, EntityLivingBase shooter) {
		super(worldIn, shooter);
	}

	public EntityAmmunition_KC(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}

	//worldObj を world へ書き換え
	@Override
	public void onUpdate() {
		super.onUpdate();

		if (this.world.isRemote && !this.inGround) {
			this.world.spawnParticle(EnumParticleTypes.CRIT, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D, new int[0]);
		}
	}

	@Override
	public ItemStack getArrowStack() {
		return new ItemStack(New_ChinjufuModWeapons.CARTRIDGE_KC);
	}

	/* 要検討・戦艦用ならアリ
	@Override
	public void arrowHit(EntityLivingBase living) {
		super.arrowHit(living);
		World world = living.getEntityWorld();
		if (living != shootingEntity) {
			world.createExplosion(shootingEntity, living.posX, living.posY, living.posZ, 0.1F, true);
		}
	}*/

}
