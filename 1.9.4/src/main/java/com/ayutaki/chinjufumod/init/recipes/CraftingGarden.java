package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ASDecoModGarden;
import com.ayutaki.chinjufumod.init.New_ChinjufuModMamiya;
import com.ayutaki.chinjufumod.init.TTimePlants;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingGarden {

	public CraftingGarden() {
		register();
	}

	public static void register() {

		/*種袋*/
		GameRegistry.addShapelessRecipe(new ItemStack(TTimePlants.SEEDSBOX, 1),
				new ItemStack(Items.WHEAT, 1), new ItemStack(Items.POTATO, 1),
				new ItemStack(Items.CARROT, 1), new ItemStack(Blocks.SAPLING, 1, 0));


		/*すだれ*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.SUDARE_1, 1), new Object [] {
			"x",
			"x",
			"x",
			'x', new ItemStack(Items.STICK)
		});

		/*石灯籠*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.ISHITOUROU_stone, 1), new Object [] {
				"y",
				"x",
				'x', new ItemStack(Blocks.STONE, 1, 0),
				'y', new ItemStack(Blocks.TORCH)
		});

		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.ISHITOUROU_and, 1), new Object [] {
				"y",
				"x",
				'x', new ItemStack(Blocks.STONE, 1, 5),
				'y', new ItemStack(Blocks.TORCH)
		});

		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.ISHITOUROU_dio, 1), new Object [] {
				"y",
				"x",
				'x', new ItemStack(Blocks.STONE, 1, 3),
				'y', new ItemStack(Blocks.TORCH)
		});

		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.ISHITOUROU_gra, 1), new Object [] {
				"y",
				"x",
				'x', new ItemStack(Blocks.STONE, 1, 1),
				'y', new ItemStack(Blocks.TORCH)
		});

		/*石灯籠(高)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.LONGTOUROU_stone, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModGarden.ISHITOUROU_stone),
				'y', new ItemStack(Blocks.STONE, 1, 0)
		});

		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.LONGTOUROU_and, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModGarden.ISHITOUROU_and),
				'y', new ItemStack(Blocks.STONE, 1, 5)
		});

		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.LONGTOUROU_dio, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModGarden.ISHITOUROU_dio),
				'y', new ItemStack(Blocks.STONE, 1, 3)
		});

		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.LONGTOUROU_gra, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ASDecoModGarden.ISHITOUROU_gra),
				'y', new ItemStack(Blocks.STONE, 1, 1)
		});

		/*手水鉢*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.CHOUZUBACHI_kara, 1), new Object [] {
				"y",
				"x",
				'x', new ItemStack(Blocks.STONE, 1, 0),
				'y', new ItemStack(Items.BUCKET)
		});

		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.CHOUZU_AND_kara, 1), new Object [] {
				"y",
				"x",
				'x', new ItemStack(Blocks.STONE, 1, 5),
				'y', new ItemStack(Items.BUCKET)
		});

		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.CHOUZU_DIO_kara, 1), new Object [] {
				"y",
				"x",
				'x', new ItemStack(Blocks.STONE, 1, 3),
				'y', new ItemStack(Items.BUCKET)
		});

		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.CHOUZU_GRA_kara, 1), new Object [] {
				"y",
				"x",
				'x', new ItemStack(Blocks.STONE, 1, 1),
				'y', new ItemStack(Items.BUCKET)
		});

		/*観葉植物(低)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.ACACIA_low, 1), new Object [] {
				"x",
				'x', new ItemStack(Blocks.SAPLING, 1, 4)
		});

		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.BIRCH_low, 1), new Object [] {
				"x",
				'x', new ItemStack(Blocks.SAPLING, 1, 2)
		});

		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.DARKOAK_low, 1), new Object [] {
				"x",
				'x', new ItemStack(Blocks.SAPLING, 1, 5)
		});

		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.JUNGLE_low, 1), new Object [] {
				"x",
				'x', new ItemStack(Blocks.SAPLING, 1, 3)
		});

		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.OAK_low, 1), new Object [] {
				"x",
				'x', new ItemStack(Blocks.SAPLING, 1, 0)
		});

		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.SPRUCE_low, 1), new Object [] {
				"x",
				'x', new ItemStack(Blocks.SAPLING, 1, 1)
		});

		/*観葉植物*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.ACACIA_bot, 1), new Object [] {
				"x",
				"x",
				'x', new ItemStack(Blocks.SAPLING, 1, 4)
		});

		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.BIRCH_bot, 1), new Object [] {
				"x",
				"x",
				'x', new ItemStack(Blocks.SAPLING, 1, 2)
		});

		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.DARKOAK_bot, 1), new Object [] {
				"x",
				"x",
				'x', new ItemStack(Blocks.SAPLING, 1, 5)
		});

		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.JUNGLE_bot, 1), new Object [] {
				"x",
				"x",
				'x', new ItemStack(Blocks.SAPLING, 1, 3)
		});

		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.OAK_bot, 1), new Object [] {
				"x",
				"x",
				'x', new ItemStack(Blocks.SAPLING, 1, 0)
		});

		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.SPRUCE_bot, 1), new Object [] {
				"x",
				"x",
				'x', new ItemStack(Blocks.SAPLING, 1, 1)
		});

		/*ティーテーブル*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModGarden.TEATABLE, 1), new Object [] {
				"x",
				"y",
				"z",
				'x', new ItemStack(Blocks.CARPET, 1, 0),
				'y', new ItemStack(Blocks.CARPET, 1, 6),
				'z', new ItemStack(New_ChinjufuModMamiya.CAFETABLE)
		});

	}
}
