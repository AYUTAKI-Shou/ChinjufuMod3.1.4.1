package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.New_ChinjufuModItems;
import com.ayutaki.chinjufumod.init.New_LetterTrays;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingLetterTrays {

	public CraftingLetterTrays() {
		register();
	}

	public static void register() {

		/*羽ペンセット*/
		GameRegistry.addShapelessRecipe(new ItemStack(New_LetterTrays.LETTER_TRAY, 1), New_ChinjufuModItems.SUMI, Items.FEATHER, Items.PAPER, Blocks.WOODEN_SLAB);

		/*手紙台(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(New_LetterTrays.LETTER_DESK_a, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(New_LetterTrays.LETTER_TRAY),
				'y', new ItemStack(New_LetterTrays.LOWDESK_a)
		});

		/*手紙台(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(New_LetterTrays.LETTER_DESK_b, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(New_LetterTrays.LETTER_TRAY),
				'y', new ItemStack(New_LetterTrays.LOWDESK_b)
		});

		/*手紙台(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(New_LetterTrays.LETTER_DESK_d, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(New_LetterTrays.LETTER_TRAY),
				'y', new ItemStack(New_LetterTrays.LOWDESK_d)
		});

		/*手紙台(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(New_LetterTrays.LETTER_DESK_j, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(New_LetterTrays.LETTER_TRAY),
				'y', new ItemStack(New_LetterTrays.LOWDESK_j)
		});

		/*手紙台(オーク)*/
		GameRegistry.addRecipe(new ItemStack(New_LetterTrays.LETTER_DESK_o, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(New_LetterTrays.LETTER_TRAY),
				'y', new ItemStack(New_LetterTrays.LOWDESK)
		});

		/*手紙台(マツ)*/
		GameRegistry.addRecipe(new ItemStack(New_LetterTrays.LETTER_DESK_s, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(New_LetterTrays.LETTER_TRAY),
				'y', new ItemStack(New_LetterTrays.LOWDESK_s)
		});

		/*硯箱*/
		GameRegistry.addShapelessRecipe(new ItemStack(New_LetterTrays.FUDE_TRAY, 1), New_ChinjufuModItems.SUMI, Items.STICK, Items.PAPER, Blocks.WOODEN_SLAB);

		/*文机(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(New_LetterTrays.FUDE_DESK_a, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(New_LetterTrays.FUDE_TRAY),
				'y', new ItemStack(New_LetterTrays.LOWDESK_a)
		});

		/*文机(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(New_LetterTrays.FUDE_DESK_b, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(New_LetterTrays.FUDE_TRAY),
				'y', new ItemStack(New_LetterTrays.LOWDESK_b)
		});

		/*文机(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(New_LetterTrays.FUDE_DESK_d, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(New_LetterTrays.FUDE_TRAY),
				'y', new ItemStack(New_LetterTrays.LOWDESK_d)
		});

		/*文机(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(New_LetterTrays.FUDE_DESK_j, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(New_LetterTrays.FUDE_TRAY),
				'y', new ItemStack(New_LetterTrays.LOWDESK_j)
		});

		/*文机(オーク)*/
		GameRegistry.addRecipe(new ItemStack(New_LetterTrays.FUDE_DESK_o, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(New_LetterTrays.FUDE_TRAY),
				'y', new ItemStack(New_LetterTrays.LOWDESK)
		});

		/*文机(マツ)*/
		GameRegistry.addRecipe(new ItemStack(New_LetterTrays.FUDE_DESK_s, 1), new Object [] {
				"x",
				"y",
				'x', new ItemStack(New_LetterTrays.FUDE_TRAY),
				'y', new ItemStack(New_LetterTrays.LOWDESK_s)
		});

		/*座卓(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(New_LetterTrays.LOWDESK_a, 1), new Object [] {
				"xxx",
				"y#y",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 4),
				'y', new ItemStack(Items.STICK)
		});

		/*座卓(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(New_LetterTrays.LOWDESK_b, 1), new Object [] {
				"xxx",
				"y#y",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 2),
				'y', new ItemStack(Items.STICK)
		});

		/*座卓(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(New_LetterTrays.LOWDESK_d, 1), new Object [] {
				"xxx",
				"y#y",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 5),
				'y', new ItemStack(Items.STICK)
		});

		/*座卓(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(New_LetterTrays.LOWDESK_j, 1), new Object [] {
				"xxx",
				"y#y",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 3),
				'y', new ItemStack(Items.STICK)
		});

		/*座卓(オーク)*/
		GameRegistry.addRecipe(new ItemStack(New_LetterTrays.LOWDESK, 1), new Object [] {
				"xxx",
				"y#y",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 0),
				'y', new ItemStack(Items.STICK)
		});

		/*座卓(マツ)*/
		GameRegistry.addRecipe(new ItemStack(New_LetterTrays.LOWDESK_s, 1), new Object [] {
				"xxx",
				"y#y",
				'x', new ItemStack(Blocks.WOODEN_SLAB, 1, 1),
				'y', new ItemStack(Items.STICK)
		});

	}

}
