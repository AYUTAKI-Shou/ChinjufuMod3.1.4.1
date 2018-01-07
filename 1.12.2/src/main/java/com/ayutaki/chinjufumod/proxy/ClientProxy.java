package com.ayutaki.chinjufumod.proxy;

import com.ayutaki.chinjufumod.config.CMConfigCore;
import com.ayutaki.chinjufumod.entity.EntityAmmunition_KC;
import com.ayutaki.chinjufumod.entity.render.RenderAmmunition_KC;
import com.ayutaki.chinjufumod.init.ASDecoModFusuma;
import com.ayutaki.chinjufumod.init.ASDecoModGarden;
import com.ayutaki.chinjufumod.init.ASDecoModHakkou;
import com.ayutaki.chinjufumod.init.ASDecoModKamoi;
import com.ayutaki.chinjufumod.init.ASDecoModKawara;
import com.ayutaki.chinjufumod.init.ASDecoModKitchen;
import com.ayutaki.chinjufumod.init.ASDecoModNamako;
import com.ayutaki.chinjufumod.init.ASDecoModNoren;
import com.ayutaki.chinjufumod.init.ASDecoModPantry;
import com.ayutaki.chinjufumod.init.ASDecoModPlaster;
import com.ayutaki.chinjufumod.init.ASDecoModRanma;
import com.ayutaki.chinjufumod.init.ASDecoModTatami;
import com.ayutaki.chinjufumod.init.ChinjufuModBlocks;
import com.ayutaki.chinjufumod.init.ChinjufuModFoodBlocks;
import com.ayutaki.chinjufumod.init.ChinjufuModItemFoods;
import com.ayutaki.chinjufumod.init.New_ASDecoModWallPane;
import com.ayutaki.chinjufumod.init.New_ASDecoModWallPane2;
import com.ayutaki.chinjufumod.init.New_ChinjufuModArmor;
import com.ayutaki.chinjufumod.init.New_ChinjufuModBlocks;
import com.ayutaki.chinjufumod.init.New_ChinjufuModFurnitures;
import com.ayutaki.chinjufumod.init.New_ChinjufuModHarbor;
import com.ayutaki.chinjufumod.init.New_ChinjufuModItems;
import com.ayutaki.chinjufumod.init.New_ChinjufuModMamiya;
import com.ayutaki.chinjufumod.init.New_ChinjufuModSchool;
import com.ayutaki.chinjufumod.init.New_ChinjufuModSeasons;
import com.ayutaki.chinjufumod.init.New_ChinjufuModWeapons;
import com.ayutaki.chinjufumod.init.New_LetterTrays;
import com.ayutaki.chinjufumod.init.TTimeItems;
import com.ayutaki.chinjufumod.init.TTimePlants;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

public class ClientProxy  extends CommonProxy {

	public static boolean rendering = false;
	public static Entity renderEntity = null;
	public static Entity backupEntity = null;

	@Override
	public void preInit() {
		MinecraftForge.EVENT_BUS.register(this);
		CMConfigCore.clientPreInit();
	}

	@Override
	public void init() {

	}

	@Override
	public void postInit() {

	}

	@Override
	public EntityPlayer getClientPlayer() {
		return Minecraft.getMinecraft().player;
	}

	@Override
	public boolean isSinglePlayer() {
		return Minecraft.getMinecraft().isSingleplayer();
	}

	@Override
	public boolean isDedicatedServer() {
		return false;
	}

	@SuppressWarnings("static-access")
	@SubscribeEvent
	public void onPrePlayerRender(RenderPlayerEvent.Pre event) {

		if(!rendering)
			return;

		if(event.getEntityPlayer() == renderEntity)
		{
			this.backupEntity = Minecraft.getMinecraft().getRenderManager().renderViewEntity;
			Minecraft.getMinecraft().getRenderManager().renderViewEntity = renderEntity;
		}
	}

	@SubscribeEvent
	public void onPostPlayerRender(RenderPlayerEvent.Post event) {

		if(!rendering)
			return;

		if (event.getEntityPlayer() == renderEntity) {
			Minecraft.getMinecraft().getRenderManager().renderViewEntity = backupEntity;
			renderEntity = null;
		}
	}

	@Mod.EventBusSubscriber(modid = Reference.MOD_ID, value = Side.CLIENT)
	public static class RegistrationHandler {

		@SubscribeEvent
		public static void registerModels(ModelRegistryEvent event) {
			ChinjufuModBlocks.registerRenders();
			New_ChinjufuModBlocks.registerRenders();

			New_ChinjufuModItems.registerRenders();
			New_ChinjufuModWeapons.registerRenders();
			New_ChinjufuModArmor.registerRenders();

			New_ChinjufuModFurnitures.registerRenders();
			New_ChinjufuModMamiya.registerRenders();
			New_ChinjufuModSchool.registerRenders();
			New_ChinjufuModSeasons.registerRenders();
			New_ChinjufuModHarbor.registerRenders();
			New_LetterTrays.registerRenders();
			New_ASDecoModWallPane.registerRenders();
			New_ASDecoModWallPane2.registerRenders();

			ASDecoModFusuma.registerRenders();
			ASDecoModKawara.registerRenders();
			ASDecoModNamako.registerRenders();
			ASDecoModPlaster.registerRenders();
			ASDecoModTatami.registerRenders();
			ASDecoModRanma.registerRenders();
			ASDecoModKamoi.registerRenders();
			ASDecoModNoren.registerRenders();

			/*作物を先読み、種を後読みにしないとクラッシュ*/
			TTimePlants.registerRenders();
			TTimeItems.registerRenders();

			ChinjufuModItemFoods.registerRenders();
			ChinjufuModFoodBlocks.registerRenders();

			ASDecoModPantry.registerRenders();
			ASDecoModKitchen.registerRenders();
			ASDecoModHakkou.registerRenders();

			ASDecoModGarden.registerRenders();
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void registerEntityRender() {

		/*エンティティのレンダリングはここへ*/
		RenderingRegistry.registerEntityRenderingHandler(EntityAmmunition_KC.class, new IRenderFactory() {
            @Override
            public Render createRenderFor(RenderManager manager) {
                return new RenderAmmunition_KC(manager);
            }
        });
	}
}
