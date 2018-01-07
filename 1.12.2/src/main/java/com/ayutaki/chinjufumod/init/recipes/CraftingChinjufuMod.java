package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ASDecoModPantry;
import com.ayutaki.chinjufumod.init.New_ChinjufuModBlocks;
import com.ayutaki.chinjufumod.init.New_ChinjufuModItems;
import com.ayutaki.chinjufumod.init.New_ChinjufuModSchool;
import com.ayutaki.chinjufumod.init.New_ChinjufuModSeasons;
import com.ayutaki.chinjufumod.init.New_ChinjufuModWeapons;
import com.ayutaki.chinjufumod.init.TTimeItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingChinjufuMod {

	public CraftingChinjufuMod() {
		register();
	}

	public static void register() {

		/* GameRegistry.addShapedRecipe(name, group, output, params); */
		/*墨→木炭*/
		GameRegistry.addShapedRecipe(new ResourceLocation("sumi_to_coal"), new ResourceLocation("chinjufumod"),
				new ItemStack(Items.COAL, 1, 1), new Object[]{
						"XXX",
						"XXX",
						"XXX",
						'X', New_ChinjufuModItems.SUMI
		});

		/*草ブロックから粘土*/
		GameRegistry.addShapedRecipe(new ResourceLocation("kusa_to_clay"), new ResourceLocation("chinjufumod"),
				new ItemStack(Items.CLAY_BALL, 32), new Object[]{
						"XXX",
						"XYX",
						"XXX",
						'X', Blocks.GRASS,
						'Y', Items.WATER_BUCKET
		});

		/*薬莢→鉄インゴット*/
		GameRegistry.addShapedRecipe(new ResourceLocation("yakkyou_to_ingot"), new ResourceLocation("chinjufumod"),
				new ItemStack(Items.IRON_INGOT, 1), new Object[]{
						"XXX",
						"XXX",
						"XXX",
						'X', New_ChinjufuModWeapons.CARTRIDGE_KC
		});

		/*鋼材ブロック→鉄インゴット*/
		GameRegistry.addShapedRecipe(new ResourceLocation("kouzai_to_ingot"), new ResourceLocation("chinjufumod"),
				new ItemStack(Items.IRON_INGOT, 4), new Object[]{
						"X",
						'X', New_ChinjufuModBlocks.STEEL_BLOCK
		});

		/*燃料缶→石炭*/
		GameRegistry.addShapedRecipe(new ResourceLocation("drum_to_coal"), new ResourceLocation("chinjufumod"),
				new ItemStack(Items.COAL, 4, 0), new Object[]{
						"X",
						'X', New_ChinjufuModBlocks.OIL_DRUM
		});

		/*アルミブロック→アルミニウム*/
		GameRegistry.addShapedRecipe(new ResourceLocation("block_to_alumi"), new ResourceLocation("chinjufumod"),
				new ItemStack(TTimeItems.ALUMINUM, 4), new Object[]{
						"X",
						'X', New_ChinjufuModBlocks.ALUMI_BLOCK
		});

		/*煙突トップ→煙突*/
		GameRegistry.addShapedRecipe(new ResourceLocation("top_to_chimney"), new ResourceLocation("chinjufumod"),
				new ItemStack(New_ChinjufuModSchool.STOVECHIMNEY, 1), new Object[]{
						"X",
						'X', New_ChinjufuModSchool.STOVECHIMNEY_topk
		});

		/*酒粕→骨粉*/
		GameRegistry.addShapedRecipe(new ResourceLocation("sakekasu_to_dye"), new ResourceLocation("chinjufumod"),
				new ItemStack(Items.DYE, 1, 15), new Object[]{
						"X",
						'X', TTimeItems.SAKEKASU
		});

		/*俵*/
		GameRegistry.addShapedRecipe(new ResourceLocation("tawara_to_komefukuro"), new ResourceLocation("chinjufumod"),
				new ItemStack(ASDecoModPantry.BOX_H_RICE, 8), new Object[]{
						"X",
						'X', ASDecoModPantry.TAWARA
		});

		/*プレゼント→りんご*/
		GameRegistry.addShapedRecipe(new ResourceLocation("present_to_apple"), new ResourceLocation("chinjufumod"),
				new ItemStack(Items.APPLE, 1), new Object[]{
						"X",
						'X', New_ChinjufuModSeasons.PRESENT_Apple
		});

		/*プレゼント→本*/
		GameRegistry.addShapedRecipe(new ResourceLocation("present_to_book"), new ResourceLocation("chinjufumod"),
				new ItemStack(Items.BOOK, 1), new Object[]{
						"X",
						'X', New_ChinjufuModSeasons.PRESENT_Book
		});

		/*プレゼント→ダイヤモンド*/
		GameRegistry.addShapedRecipe(new ResourceLocation("present_to_daiamond"), new ResourceLocation("chinjufumod"),
				new ItemStack(Items.DIAMOND, 1), new Object[]{
						"X",
						'X', New_ChinjufuModSeasons.PRESENT_Diamond
		});

		/*プレゼント→ラピスラズリ*/
		GameRegistry.addShapedRecipe(new ResourceLocation("present_to_lapis"), new ResourceLocation("chinjufumod"),
				new ItemStack(Items.DYE, 1, 4), new Object[]{
						"X",
						'X', New_ChinjufuModSeasons.PRESENT_Lapis
		});

		/*プレゼント→ブレイズロッド*/
		GameRegistry.addShapedRecipe(new ResourceLocation("present_to_blaze"), new ResourceLocation("chinjufumod"),
				new ItemStack(Items.BLAZE_ROD, 1), new Object[]{
						"X",
						'X', New_ChinjufuModSeasons.PRESENT_Blaze
		});

	}
}
