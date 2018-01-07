package com.ayutaki.chinjufumod.entity.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@SuppressWarnings("rawtypes")
public class RenderingHandlerAmmunition_KC implements IRenderFactory {

	@Override
	public Render createRenderFor(RenderManager manager) {
		return new RenderAmmunition_KC(manager);
	}
}