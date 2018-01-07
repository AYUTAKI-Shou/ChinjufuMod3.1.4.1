package com.ayutaki.chinjufumod.config;

import java.io.File;

import com.ayutaki.chinjufumod.main.Reference;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CMConfigCore {

	public static Configuration config = null;

	public static final String GENERAL = "General";
	public static boolean isGeneratorEnabled = true;

	public static void preInit() {

		File configFile = new File(Loader.instance().getConfigDir(), "ChinjufuMod.cfg");
		config = new Configuration(configFile);
		syncFromFiles();

	}

	public static Configuration getConfig() {
		return config;
	}

	public static void clientPreInit() {
		MinecraftForge.EVENT_BUS.register(new ConfigEventHandler());

	}

	public static void syncFromFiles() {
		syncConfig(true, true);

	}

	public static void syncFromGui() {
		syncConfig(false, true);

	}

	public static void syncFromFields() {
		syncConfig(false, false);

	}

	public static void syncConfig(boolean loadFromConfigFile, boolean readFieldsFromConfig) {

		if(loadFromConfigFile)
			config.load();

		/* General*/
		isGeneratorEnabled = config.getBoolean("enabledGenerator", GENERAL,
				isGeneratorEnabled, "BauxiteOre will be generated when this setting is true.", "config.bauxiteore.prop.enabledGenerator");

		/* 設定内容をコンフィグファイルに保存する*/
		if(config.hasChanged())
		config.save();

	}

	public static class ConfigEventHandler {

		@SubscribeEvent(priority = EventPriority.LOWEST)
		public void onEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
			if(event.getModID().equals(Reference.MOD_ID)) {
				syncFromGui();
			}
		}

	}
}
