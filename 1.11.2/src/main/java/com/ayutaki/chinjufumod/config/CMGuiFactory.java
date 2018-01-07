package com.ayutaki.chinjufumod.config;

import java.util.Set;

import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.GuiConfig;

public class CMGuiFactory implements IModGuiFactory {

	@Override
	public void initialize(Minecraft minecraftInstance) {
	}

	@Override
	public Class<? extends GuiScreen> mainConfigGuiClass() {
		return ChinjufuModConfigGui.class;
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) {
		return null;
	}

	public static class ChinjufuModConfigGui extends GuiConfig {

		public ChinjufuModConfigGui(GuiScreen parent) {

			super(parent, (new ConfigElement(CMConfigCore.config.getCategory(CMConfigCore.GENERAL))).getChildElements(),
					Reference.MOD_ID, false, false, Reference.MOD_NAME);
		}
	}

	@Override
	public boolean hasConfigGui() {
		return true;
	}

	@Override
	public GuiScreen createConfigGui(GuiScreen parentScreen) {
		return new ChinjufuModConfigGui(parentScreen);
	}
}