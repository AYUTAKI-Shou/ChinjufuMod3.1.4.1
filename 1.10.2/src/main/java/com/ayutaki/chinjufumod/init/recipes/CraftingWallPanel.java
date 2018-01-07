package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.New_ASDecoModWallPane;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingWallPanel {

	public CraftingWallPanel() {
		register();
	}

	public static void register() {
		/*柱(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.PILLAR_aca, 3), new Object [] {
			"x",
			"x",
			"x",
			'x', new ItemStack(Blocks.PLANKS, 1, 4)
		});

		/*柱(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.PILLAR_bir, 3), new Object [] {
			"x",
			"x",
			"x",
			'x', new ItemStack(Blocks.PLANKS, 1, 2)
		});

		/*柱(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.PILLAR_doak, 3), new Object [] {
			"x",
			"x",
			"x",
			'x', new ItemStack(Blocks.PLANKS, 1, 5)
		});

		/*柱(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.PILLAR_jun, 3), new Object [] {
			"x",
			"x",
			"x",
			'x', new ItemStack(Blocks.PLANKS, 1, 3)
		});

		/*柱(オーク)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.PILLAR_oak, 3), new Object [] {
			"x",
			"x",
			"x",
			'x', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*柱(マツ)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.PILLAR_spru, 3), new Object [] {
			"x",
			"x",
			"x",
			'x', new ItemStack(Blocks.PLANKS, 1, 1)
		});

		/*安山岩レンガ 3.0.2で修正*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.BRICK_AND, 4), new Object [] {
			"xx",
			"xx",
			'x', new ItemStack(Blocks.STONE, 1, 6)
		});

		/*閃緑岩レンガ 3.0.2で修正*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.BRICK_DIO, 4), new Object [] {
			"xx",
			"xx",
			'x', new ItemStack(Blocks.STONE, 1, 4)
		});

		/*花崗岩レンガ 3.0.2で修正*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.BRICK_GRA, 4), new Object [] {
			"xx",
			"xx",
			'x', new ItemStack(Blocks.STONE, 1, 2)
		});

		/*模様入り安山岩レンガ*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.BRICK_AND_CH, 1), new Object [] {
			"x",
			"x",
			'x', new ItemStack(New_ASDecoModWallPane.BAC_SlabHalf)
		});

		/*模様入り閃緑岩レンガ*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.BRICK_DIO_CH, 1), new Object [] {
			"x",
			"x",
			'x', new ItemStack(New_ASDecoModWallPane.BDC_SlabHalf)
		});

		/*模様入り花崗岩レンガ*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.BRICK_GRA_CH, 1), new Object [] {
			"x",
			"x",
			'x', new ItemStack(New_ASDecoModWallPane.BGC_SlabHalf)
		});

		/*苔入り安山岩レンガ*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.BRICK_AND_MOS, 1), new Object [] {
			"xa",
			'x', new ItemStack(New_ASDecoModWallPane.BRICK_AND),
			'a', new ItemStack(Blocks.VINE)
		});

		/*苔入り閃緑岩レンガ*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.BRICK_DIO_MOS, 1), new Object [] {
			"xa",
			'x', new ItemStack(New_ASDecoModWallPane.BRICK_DIO),
			'a', new ItemStack(Blocks.VINE)
		});

		/*苔入り花崗岩レンガ*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.BRICK_GRA_MOS, 1), new Object [] {
			"xa",
			'x', new ItemStack(New_ASDecoModWallPane.BRICK_GRA),
			'a', new ItemStack(Blocks.VINE)
		});

		/*安山岩レンガ階段*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.BRICKSTAIRS_AND, 4), new Object [] {
			"##x",
			"#xx",
			"xxx",
			'x', new ItemStack(New_ASDecoModWallPane.BRICK_AND)
		});

		/*閃緑岩レンガ階段*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.BRICKSTAIRS_DIO, 4), new Object [] {
			"##x",
			"#xx",
			"xxx",
			'x', new ItemStack(New_ASDecoModWallPane.BRICK_DIO)
		});

		/*花崗岩レンガ階段*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.BRICKSTAIRS_GRA, 4), new Object [] {
			"##x",
			"#xx",
			"xxx",
			'x', new ItemStack(New_ASDecoModWallPane.BRICK_GRA)
		});

		/*安山岩レンガハーフ*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.BAC_SlabHalf, 6), new Object [] {
			"xxx",
			'x', new ItemStack(New_ASDecoModWallPane.BRICK_AND)
		});

		/*閃緑岩レンガハーフ*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.BDC_SlabHalf, 6), new Object [] {
			"xxx",
			'x', new ItemStack(New_ASDecoModWallPane.BRICK_DIO)
		});

		/*花崗岩レンガハーフ*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.BGC_SlabHalf, 6), new Object [] {
			"xxx",
			'x', new ItemStack(New_ASDecoModWallPane.BRICK_GRA)
		});

		/*柱(焼き石)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.BRICK_STONE_PIL, 2), new Object [] {
				"x",
				"x",
				'x', new ItemStack(Blocks.STONEBRICK)
		});

		/*柱(安山岩)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.BRICK_AND_PIL, 2), new Object [] {
			"x",
			"x",
			'x', new ItemStack(New_ASDecoModWallPane.BRICK_AND)
		});

		/*柱(閃緑岩)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.BRICK_DIO_PIL, 2), new Object [] {
				"x",
				"x",
			'x', new ItemStack(New_ASDecoModWallPane.BRICK_DIO)
		});

		/*柱(花崗岩)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.BRICK_GRA_PIL, 2), new Object [] {
				"x",
				"x",
			'x', new ItemStack(New_ASDecoModWallPane.BRICK_GRA)
		});

		/*ここからパネル__________________________________________________________________________________________*/
		/*パネル(アカシア原木)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_LOG_aca, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.LOG2, 1, 0)
		});

		/*パネル(シラカバ原木)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_LOG_bir, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.LOG, 1, 2)
		});

		/*パネル(ダークオーク原木)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_LOG_doak, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.LOG2, 1, 1)
		});

		/*パネル(ジャングル原木)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_LOG_jun, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.LOG, 1, 3)
		});

		/*パネル(オーク原木)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_LOG_oak, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.LOG, 1, 0)
		});

		/*パネル(マツ原木)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_LOG_spru, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.LOG, 1, 1)
		});

		/*パネル(アカシア木材)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_PLANK_aca, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.PLANKS, 1, 4)
		});

		/*パネル(シラカバ木材)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_PLANK_bir, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.PLANKS, 1, 2)
		});

		/*パネル(ダークオーク木材)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_PLANK_doak, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.PLANKS, 1, 5)
		});

		/*パネル(ジャングル木材)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_PLANK_jun, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.PLANKS, 1, 3)
		});

		/*パネル(オーク木材)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_PLANK_oak, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*パネル(マツ木材)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_PLANK_spru, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.PLANKS, 1, 1)
		});

		/*パネル(焼き石)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_STONE, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STONE, 1, 0)
		});

		/*パネル(丸石)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_STONE_M, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.COBBLESTONE)
		});

		/*パネル(安山岩)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_STONE_and, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STONE, 1, 5)
		});

		/*パネル(閃緑岩)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_STONE_dio, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STONE, 1, 3)
		});

		/*パネル(花崗岩)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_STONE_gra, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STONE, 1, 1)
		});

		/*パネル(焼き石レンガ)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_STONE_B, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STONEBRICK, 1, 0)
		});

		/*パネル(安山岩レンガ)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_STONE_andB, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(New_ASDecoModWallPane.BRICK_AND)
		});

		/*パネル(閃緑岩レンガ)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_STONE_dioB, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(New_ASDecoModWallPane.BRICK_DIO)
		});

		/*パネル(花崗岩レンガ)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_STONE_graB, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(New_ASDecoModWallPane.BRICK_GRA)
		});

		/*パネル(柱状焼き石レンガ)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_STONE_P, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(New_ASDecoModWallPane.BRICK_STONE_PIL)
		});

		/*パネル(柱状安山岩レンガ)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_STONE_andP, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(New_ASDecoModWallPane.BRICK_AND_PIL)
		});

		/*パネル(柱状閃緑岩レンガ)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_STONE_dioP, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(New_ASDecoModWallPane.BRICK_DIO_PIL)
		});

		/*パネル(柱状花崗岩レンガ)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_STONE_graP, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(New_ASDecoModWallPane.BRICK_GRA_PIL)
		});

		/*パネル(レンガ)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_BRICK, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.BRICK_BLOCK)
		});

		/*パネル(砂岩)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_SANDSTONE, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.SANDSTONE, 1, 0)
		});

		/*パネル(赤砂岩)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_REDSANDSTONE, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.RED_SANDSTONE, 1, 0)
		});

		/*パネル(プリズマリン)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_PRISMA, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.PRISMARINE, 1, 0)
		});

		/*パネル(黒曜石)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_OBSIDIAN, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.OBSIDIAN)
		});


		/*パネル(堅焼き粘土)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_CLAY, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.HARDENED_CLAY)
		});

		/*パネル(堅焼き粘土_黒)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_CLAY_black, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15)
		});

		/*パネル(堅焼き粘土_青)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_CLAY_blue, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 11)
		});

		/*パネル(堅焼き粘土_茶)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_CLAY_brown, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 12)
		});

		/*パネル(堅焼き粘土_水)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_CLAY_cyan, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 9)
		});

		/*パネル(堅焼き粘土_灰)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_CLAY_gray, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 7)
		});

		/*パネル(堅焼き粘土_緑)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_CLAY_green, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 13)
		});

		/*パネル(堅焼き粘土_空)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_CLAY_lightb, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 3)
		});

		/*パネル(堅焼き粘土_銀)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_CLAY_lightg, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 8)
		});

		/*パネル(堅焼き粘土_黄緑)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_CLAY_lime, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 5)
		});

		/*パネル(堅焼き粘土_赤紫)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_CLAY_mage, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 2)
		});

		/*パネル(堅焼き粘土_橙)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_CLAY_ora, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 1)
		});

		/*パネル(堅焼き粘土_桃)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_CLAY_pink, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 6)
		});

		/*パネル(堅焼き粘土_紫)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_CLAY_pur, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 10)
		});

		/*パネル(堅焼き粘土_赤)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_CLAY_red, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 14)
		});

		/*パネル(堅焼き粘土_白)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_CLAY_white, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 0)
		});

		/*パネル(堅焼き粘土_黄)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_CLAY_yellow, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 4)
		});

		/*パネル(ガラス)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_GLASS, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.GLASS)
		});

		/*パネル(ガラス_黒)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_GLASS_black, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_GLASS, 1, 15)
		});

		/*パネル(ガラス_青)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_GLASS_blue, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_GLASS, 1, 11)
		});

		/*パネル(ガラス_茶)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_GLASS_brown, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_GLASS, 1, 12)
		});

		/*パネル(ガラス_水)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_GLASS_cyan, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_GLASS, 1, 9)
		});

		/*パネル(ガラス_灰)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_GLASS_gray, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_GLASS, 1, 7)
		});

		/*パネル(ガラス_緑)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_GLASS_green, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_GLASS, 1, 13)
		});

		/*パネル(ガラス_空)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_GLASS_lightb, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_GLASS, 1, 3)
		});

		/*パネル(ガラス_銀)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_GLASS_lightg, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_GLASS, 1, 8)
		});

		/*パネル(ガラス_黄緑)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_GLASS_lime, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_GLASS, 1, 5)
		});

		/*パネル(ガラス_赤紫)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_GLASS_mage, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_GLASS, 1, 2)
		});

		/*パネル(ガラス_橙)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_GLASS_ora, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_GLASS, 1, 1)
		});

		/*パネル(ガラス_桃)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_GLASS_pink, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_GLASS, 1, 6)
		});

		/*パネル(ガラス_紫)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_GLASS_pur, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_GLASS, 1, 10)
		});

		/*パネル(ガラス_赤)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_GLASS_red, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_GLASS, 1, 14)
		});

		/*パネル(ガラス_白)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_GLASS_white, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_GLASS, 1, 0)
		});

		/*パネル(ガラス_黄)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_GLASS_yellow, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.STAINED_GLASS, 1, 4)
		});

		/*パネル(ネザーラック)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_NETHE_rack, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.NETHERRACK)
		});

		/*パネル(ネザーレンガ)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_NETHE_b, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.NETHER_BRICK)
		});

		/*パネル(ネザー水晶)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_QUARTZ, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.QUARTZ_BLOCK, 1, 0)
		});

		/*パネル(柱状ネザー水晶)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_QUARTZ_PIL, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.QUARTZ_BLOCK, 1, 2)
		});

		/*パネル(エンドストーン)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_ENDSTONE, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.END_STONE)
		});

		/*パネル(エンドストーンレンガ)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_ENDBRICKS, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.END_BRICKS)
		});

		/*パネル(プルパーブロック)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_PURPUR, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.PURPUR_BLOCK)
		});

		/*パネル(柱状プルパーブロック)*/
		GameRegistry.addRecipe(new ItemStack(New_ASDecoModWallPane.WP_PURPUR_PIL, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Items.PAPER),
			'y', new ItemStack(Blocks.PURPUR_PILLAR)
		});

	}

}
