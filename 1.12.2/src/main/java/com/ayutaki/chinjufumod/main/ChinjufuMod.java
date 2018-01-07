package com.ayutaki.chinjufumod.main;

import org.apache.logging.log4j.Logger;

import com.ayutaki.chinjufumod.config.CMConfigCore;
import com.ayutaki.chinjufumod.entity.EntityAmmunition_KC;
import com.ayutaki.chinjufumod.entity.EntitySittableBlock;
import com.ayutaki.chinjufumod.handlers.OreDictionaryHandler;
import com.ayutaki.chinjufumod.handlers.RecipeHandler;
import com.ayutaki.chinjufumod.proxy.CommonProxy;
import com.ayutaki.chinjufumod.tileentity.TileEntityCStove;
import com.ayutaki.chinjufumod.tileentity.TileEntityIrori;
import com.ayutaki.chinjufumod.tileentity.TileEntityKitStove;
import com.ayutaki.chinjufumod.worldgen.WorldGenCM;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.Metadata;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME,
	version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY)
public class ChinjufuMod {

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@Instance
	public static ChinjufuMod instance;

	public static Logger logger;

	@Metadata(Reference.MOD_ID)
	private static ModMetadata meta;


	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		/* init アイテム・ブロックの登録、コンフィグ読込など事前の初期化作業を行う */
		logger = event.getModLog();
		proxy.preInit();
		proxy.registerEntityRender();

		/* コンフィグ */
		CMConfigCore.preInit();

		EntityRegistry.registerModEntity(new ResourceLocation("chinjufumod:mountable_block"),
				EntitySittableBlock.class, "MountableBlock", 0, this, 80, 1, false);

		EntityRegistry.registerModEntity(new ResourceLocation("chinjufumod:ammunition_kc"),
				EntityAmmunition_KC.class, "ammunition_kc", 1, this, 64, 1, true);

		/*ClientProxyへ移動で「java.lang.NoClassDefFoundError: net/minecraft/client/renderer/entity/Render」回避
		RenderingRegistry.registerEntityRenderingHandler(EntityAmmunition_KC.class, new IRenderFactory() {
            @Override
            public Render createRenderFor(RenderManager manager) {
                return new RenderAmmunition_KC(manager);
            }
        });*/

		GameRegistry.registerTileEntity(TileEntityCStove.class, "QF");
		GameRegistry.registerTileEntity(TileEntityKitStove.class, "QF2");
		GameRegistry.registerTileEntity(TileEntityIrori.class, "QF3");


	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		/* RegisterRender レシピ追加、レンダー登録など */
		proxy.init();

		/* 鉱石の追加 マルチでの生成ができてるかは不明*/
		GameRegistry.registerWorldGenerator(new WorldGenCM(), 0);
		OreDictionaryHandler.registerOreDictionary();

		/* レシピはHandlerを噛ませてmainへ */
		RecipeHandler.registerCraftingRecipes();
		RecipeHandler.registerSmeltingRecipes();

    }

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		/* 他Modとの連携 */
		proxy.postInit();

	}

	@EventHandler
	public void processIMC(FMLInterModComms.IMCEvent event) {

	}

	public void register(String method, String modid) {

	}
}
