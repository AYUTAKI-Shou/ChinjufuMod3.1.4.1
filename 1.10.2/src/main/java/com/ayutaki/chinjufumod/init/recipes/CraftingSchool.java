package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.New_ChinjufuModBlocks;
import com.ayutaki.chinjufumod.init.New_ChinjufuModItems;
import com.ayutaki.chinjufumod.init.New_ChinjufuModSchool;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingSchool {

	public CraftingSchool() {
		register();
	}

	public static void register() {

		/*黒板*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.BLACKBOARD, 8), new Object [] {
				"x",
				"y",
				'x', new ItemStack(New_ChinjufuModItems.SUMI),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*ストーブ→CraftingKit_Panへ
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.CSTOVE, 1), new Object [] {
				"x",
				"y",
				"x",
				'x', new ItemStack(New_ChinjufuModBlocks.STEEL_BLOCK),
				'y', new ItemStack(Items.COAL, 1, 1)
		});*/

		/*やかん→CraftingFoodBlockへ
		GameRegistry.addRecipe(new ItemStack(ChinjufuModFoodBlocks.KETTLE, 1), new Object [] {
				"xxx",
				"#xx",
				'x', new ItemStack(New_ChinjufuModItems.BAUXITE)
		});*/

		/*煙突ストーブ結合*/
		GameRegistry.addShapelessRecipe(new ItemStack(New_ChinjufuModSchool.STOVECHIMNEY_joint, 1), New_ChinjufuModSchool.STOVECHIMNEY);

		/*煙突*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.STOVECHIMNEY, 8), new Object [] {
				"x",
				"x",
				'x', new ItemStack(New_ChinjufuModBlocks.STEEL_BLOCK)
		});

		/*煙突トップ傘*/
		GameRegistry.addShapelessRecipe(new ItemStack(New_ChinjufuModSchool.STOVECHIMNEY_topk, 1), New_ChinjufuModSchool.STOVECHIMNEY_joint);

		/*煙突トップからの戻り*/
		GameRegistry.addShapelessRecipe(new ItemStack(New_ChinjufuModSchool.STOVECHIMNEY, 1), New_ChinjufuModSchool.STOVECHIMNEY_topk);

		/*学校の椅子*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.SCHOOLCHAIR, 1), new Object [] {
				"y##",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*学校の椅子(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.SCHOOLCHAIR_a, 1), new Object [] {
				"y##",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*学校の椅子(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.SCHOOLCHAIR_b, 1), new Object [] {
				"y##",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*学校の椅子(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.SCHOOLCHAIR_d, 1), new Object [] {
				"y##",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*学校の椅子(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.SCHOOLCHAIR_j, 1), new Object [] {
				"y##",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*学校の椅子(マツ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.SCHOOLCHAIR_s, 1), new Object [] {
				"y##",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*学校の机*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.SCHOOLDESK, 1), new Object [] {
				"yyy",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*学校の机(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.SCHOOLDESK_a, 1), new Object [] {
				"yyy",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*学校の机(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.SCHOOLDESK_b, 1), new Object [] {
				"yyy",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*学校の机(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.SCHOOLDESK_d, 1), new Object [] {
				"yyy",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*学校の机(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.SCHOOLDESK_j, 1), new Object [] {
				"yyy",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*学校の机(マツ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.SCHOOLDESK_s, 1), new Object [] {
				"yyy",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*教卓*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.TEACHERDESK, 1), new Object [] {
				"xxx",
				"xyx",
				"x#x",
				'x', new ItemStack(Blocks.PLANKS, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*教卓(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.TEACHERDESK_a, 1), new Object [] {
				"xxx",
				"xyx",
				"x#x",
				'x', new ItemStack(Blocks.PLANKS, 1, 4),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*教卓(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.TEACHERDESK_b, 1), new Object [] {
				"xxx",
				"xyx",
				"x#x",
				'x', new ItemStack(Blocks.PLANKS, 1, 2),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*教卓(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.TEACHERDESK_d, 1), new Object [] {
				"xxx",
				"xyx",
				"x#x",
				'x', new ItemStack(Blocks.PLANKS, 1, 5),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*教卓(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.TEACHERDESK_j, 1), new Object [] {
				"xxx",
				"xyx",
				"x#x",
				'x', new ItemStack(Blocks.PLANKS, 1, 3),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*教卓(マツ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.TEACHERDESK_s, 1), new Object [] {
				"xxx",
				"xyx",
				"x#x",
				'x', new ItemStack(Blocks.PLANKS, 1, 1),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});


		/*窓*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.WINDOW, 8), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.GLASS, 1, 0),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*窓(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.WINDOW_a, 8), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.GLASS, 1, 0),
				'y', new ItemStack(Blocks.PLANKS, 1, 4)
		});

		/*窓(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.WINDOW_b, 8), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.GLASS, 1, 0),
				'y', new ItemStack(Blocks.PLANKS, 1, 2)
		});

		/*窓(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.WINDOW_d, 8), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.GLASS, 1, 0),
				'y', new ItemStack(Blocks.PLANKS, 1, 5)
		});

		/*窓(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.WINDOW_j, 8), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.GLASS, 1, 0),
				'y', new ItemStack(Blocks.PLANKS, 1, 3)
		});

		/*窓(マツ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSchool.WINDOW_s, 8), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.GLASS, 1, 0),
				'y', new ItemStack(Blocks.PLANKS, 1, 1)
		});

	}

}

