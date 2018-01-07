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

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	public static boolean rendering = false;
	public static Entity renderEntity = null;
	public static Entity backupEntity = null;

	@Override
	public void preInit() {
		super.preInit();
		/*init アイテム・ブロックの登録、コンフィグ読込など事前の初期化作業を行う*/

		/*コンフィグ*/
		CMConfigCore.clientPreInit();

	}


	@Override
	public void init() {
		super.init();
		/*RegisterRender レシピ追加、レンダー登録など*/

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void registerEntityRender() {

		/* エンティティのレンダリングはここへ */
		RenderingRegistry.registerEntityRenderingHandler(EntityAmmunition_KC.class, new IRenderFactory() {
            @Override
            public Render createRenderFor(RenderManager manager) {
                return new RenderAmmunition_KC(manager);
            }
        });
	}

	@Override
	public void registerRenders() {

		/* ここから main の preInitへ */
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

		TTimePlants.registerRenders();
		TTimeItems.registerRenders();

		ChinjufuModItemFoods.registerRenders();
		ChinjufuModFoodBlocks.registerRenders();

		ASDecoModPantry.registerRenders();
		ASDecoModKitchen.registerRenders();
		ASDecoModHakkou.registerRenders();

		ASDecoModGarden.registerRenders();
	}

	@Override
	public void postInit() {
		super.postInit();
		/*他Modとの連携*/
	}

}
