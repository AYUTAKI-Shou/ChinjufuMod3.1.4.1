package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ASDecoModKawara;
import com.ayutaki.chinjufumod.init.ASDecoModNamako;
import com.ayutaki.chinjufumod.init.ASDecoModPlaster;
import com.ayutaki.chinjufumod.init.New_ASDecoModWallPane2;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingWallPanel2 {

	public CraftingWallPanel2() {
		register();
	}

	public static void register() {
		/*パネル(土壁)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_DIRTWALL, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModKawara.DIRTWALL)
		});

		/*パネル(漆喰_黒)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_PLASTER_black, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModPlaster.SHIKKUI_black)
		});

		/*パネル(漆喰_青)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_PLASTER_blue, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModPlaster.SHIKKUI_blue)
		});

		/*パネル(漆喰_茶)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_PLASTER_brown, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModPlaster.SHIKKUI_brown)
		});

		/*パネル(漆喰_水)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_PLASTER_cyan, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModPlaster.SHIKKUI_cyan)
		});

		/*パネル(漆喰_灰)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_PLASTER_gray, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModPlaster.SHIKKUI_gray)
		});

		/*パネル(漆喰_緑)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_PLASTER_green, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModPlaster.SHIKKUI_green)
		});

		/*パネル(漆喰_空)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_PLASTER_lightb, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModPlaster.SHIKKUI_lightb)
		});

		/*パネル(漆喰_銀)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_PLASTER_lightg, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModPlaster.SHIKKUI_lightg)
		});

		/*パネル(漆喰_黄緑)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_PLASTER_lime, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModPlaster.SHIKKUI_lime)
		});

		/*パネル(漆喰_赤紫)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_PLASTER_magenta, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModPlaster.SHIKKUI_magenta)
		});

		/*パネル(漆喰_橙)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_PLASTER_orange, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModPlaster.SHIKKUI_orange)
		});

		/*パネル(漆喰_桃)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_PLASTER_pink, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModPlaster.SHIKKUI_pink)
		});

		/*パネル(漆喰_紫)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_PLASTER_purple, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModPlaster.SHIKKUI_purple)
		});

		/*パネル(漆喰_赤)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_PLASTER_red, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModPlaster.SHIKKUI_red)
		});

		/*パネル(漆喰_白)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_PLASTER_white, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModPlaster.SHIKKUI_white)
		});

		/*パネル(漆喰_黄)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_PLASTER_yellow, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModPlaster.SHIKKUI_yellow)
		});

		/*パネル(なまこ壁_黒)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKO_black, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKO_black)
		});

		/*パネル(なまこ壁_青)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKO_blue, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKO_blue)
		});

		/*パネル(なまこ壁_茶)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKO_brown, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKO_brown)
		});

		/*パネル(なまこ壁_水)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKO_cyan, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKO_cyan)
		});

		/*パネル(なまこ壁_灰)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKO_gray, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKO_gray)
		});

		/*パネル(なまこ壁_緑)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKO_green, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKO_green)
		});

		/*パネル(なまこ壁_空)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKO_lightb, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKO_lightb)
		});

		/*パネル(なまこ壁_銀)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKO_lightg, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKO_lightg)
		});

		/*パネル(なまこ壁_黄緑)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKO_lime, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKO_lime)
		});

		/*パネル(なまこ壁_赤紫)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKO_magenta, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKO_magenta)
		});

		/*パネル(なまこ壁_橙)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKO_orange, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKO_orange)
		});

		/*パネル(なまこ壁_桃)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKO_pink, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKO_pink)
		});

		/*パネル(なまこ壁_紫)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKO_purple, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKO_purple)
		});

		/*パネル(なまこ壁_赤)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKO_red, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKO_red)
		});

		/*パネル(なまこ壁_白)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKO_white, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKO_white)
		});

		/*パネル(なまこ壁_黄)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKO_yellow, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKO_yellow)
		});

		/*パネル(なまこ壁 甲_黒)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKOB_black, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKOB_black)
		});

		/*パネル(なまこ壁 甲_青)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKOB_blue, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKOB_blue)
		});

		/*パネル(なまこ壁 甲_茶)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKOB_brown, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKOB_brown)
		});

		/*パネル(なまこ壁 甲_水)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKOB_cyan, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKOB_cyan)
		});

		/*パネル(なまこ壁 甲_灰)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKOB_gray, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKOB_gray)
		});

		/*パネル(なまこ壁 甲_緑)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKOB_green, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKOB_green)
		});

		/*パネル(なまこ壁 甲_空)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKOB_lightb, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKOB_lightb)
		});

		/*パネル(なまこ壁 甲_銀)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKOB_lightg, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKOB_lightg)
		});

		/*パネル(なまこ壁 甲_黄緑)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKOB_lime, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKOB_lime)
		});

		/*パネル(なまこ壁 甲_赤紫)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKOB_magenta, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKOB_magenta)
		});

		/*パネル(なまこ壁 甲_橙)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKOB_orange, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKOB_orange)
		});

		/*パネル(なまこ壁 甲_桃)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKOB_pink, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKOB_pink)
		});

		/*パネル(なまこ壁 甲_紫)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKOB_purple, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKOB_purple)
		});

		/*パネル(なまこ壁 甲_赤)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKOB_red, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKOB_red)
		});

		/*パネル(なまこ壁 甲_白)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKOB_white, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKOB_white)
		});

		/*パネル(なまこ壁 甲_黄)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane2.WP_NAMAKOB_yellow, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(ASDecoModNamako.NAMAKOB_yellow)
		});

	}



}
