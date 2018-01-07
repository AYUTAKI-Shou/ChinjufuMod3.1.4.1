package com.ayutaki.chinjufumod.proxy;

import com.ayutaki.chinjufumod.config.CMConfigCore;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy implements ProxyInterface {

	@Override
	public void preInit() {

		MinecraftForge.EVENT_BUS.register(this);
		CMConfigCore.preInit();
	}

	public void init() {

	}

	public void postInit() {

	}

	public World getClientWorld() {
		return null;
	}

	public EntityPlayer getClientPlayer() {
		return null;
	}

	@Override
	public boolean isSinglePlayer() {
		return false;
	}

	@Override
	public boolean isDedicatedServer() {
		return true;
	}

	public void registerEntityRender() {

	}


}
