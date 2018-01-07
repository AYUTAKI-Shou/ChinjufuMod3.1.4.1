package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ASDecoModGarden;
import com.ayutaki.chinjufumod.init.New_ChinjufuModSeasons;
import com.ayutaki.chinjufumod.init.New_LetterTrays;
import com.ayutaki.chinjufumod.init.TTimeItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingSeasons {

	public CraftingSeasons() {
		register();
	}

	public static void register() {
		/*鏡餅*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.KAGAMIMOCHI, 1), new Object [] {
			"xxx",
			"aaa",
			"cbc",
			'x', new ItemStack(Items.WHEAT),
			'a', new ItemStack(Items.PAPER),
			'b', new ItemStack(Blocks.PLANKS, 1, 2),
			'c', new ItemStack(Blocks.TALLGRASS, 1, 2)
		});

		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.KAGAMIMOCHI, 1), new Object [] {
			"xxx",
			"aaa",
			"cbc",
			'x', new ItemStack(TTimeItems.KOME),
			'a', new ItemStack(Items.PAPER),
			'b', new ItemStack(Blocks.PLANKS, 1, 2),
			'c', new ItemStack(Blocks.TALLGRASS, 1, 2)
		});

		/*しめ縄*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.SHIMENAWA, 1), new Object [] {
			"xxx",
			"xyx",
			"xzx",
			'x', new ItemStack(Items.WHEAT),
			'y', new ItemStack(Blocks.DOUBLE_PLANT, 1, 5),
			'z', new ItemStack(Items.PAPER)
		});

		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.SHIMENAWA, 1), new Object [] {
				"xxx",
				"xyx",
				"xzx",
				'x', new ItemStack(TTimeItems.INE),
				'y', new ItemStack(Blocks.DOUBLE_PLANT, 1, 5),
				'z', new ItemStack(Items.PAPER)
			});

		/*門松*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.KADOMATSU, 1), new Object [] {
			"bbb",
			"aca",
			"xyx",
			'x', new ItemStack(Items.WHEAT),
			'y', new ItemStack(Blocks.DIRT),
			'a', new ItemStack(Blocks.SAPLING, 1, 1),
			'b', new ItemStack(Items.REEDS),
			'c', new ItemStack(Blocks.DOUBLE_PLANT, 1, 4)
		});

		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.KADOMATSU, 1), new Object [] {
				"bbb",
				"aca",
				"xyx",
				'x', new ItemStack(TTimeItems.INE),
				'y', new ItemStack(Blocks.DIRT),
				'a', new ItemStack(Blocks.SAPLING, 1, 1),
				'b', new ItemStack(Items.REEDS),
				'c', new ItemStack(Blocks.DOUBLE_PLANT, 1, 4)
			});

		/*ひな壇*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.HINADAN, 6), new Object [] {
			"x",
			"y",
			'x', new ItemStack(Blocks.WOOL, 1, 14),
			'y', new ItemStack(Blocks.PLANKS, 1, 2)
		});

		/*ひな飾り*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.HINAKAZARI, 4), new Object [] {
			"abc",
			"xxd",
			"xxe",
			'x', new ItemStack(New_ChinjufuModSeasons.HINADAN),
			'a', new ItemStack(Blocks.WOOL, 1, 9),
			'b', new ItemStack(Blocks.WOOL, 1, 2),
			'c', new ItemStack(Blocks.WOOL, 1, 4),
			'd', new ItemStack(Blocks.WOOL, 1, 0),
			'e', new ItemStack(Blocks.WOOL, 1, 15)
		});

		/*成形した粘土(湯呑み)
		GameRegistry.addRecipe(new ItemStack(TTimeItems.CRAY_YUNOMI, 1), new Object [] {
			"x",
			'x', new ItemStack(Items.CLAY_BALL)
		});

		/*ちゃぶ台*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.CHABUDAI, 1), new Object [] {
			"a",
			"x",
			'x', new ItemStack(New_LetterTrays.LOWDESK),
			'a', new ItemStack(New_ChinjufuModSeasons.YUNOMI)
		});

		/*ちゃぶ台(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.CHABUDAI_aca, 1), new Object [] {
				"a",
				"x",
				'x', new ItemStack(New_LetterTrays.LOWDESK_a),
				'a', new ItemStack(New_ChinjufuModSeasons.YUNOMI)
		});

		/*ちゃぶ台(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.CHABUDAI_bir, 1), new Object [] {
				"a",
				"x",
				'x', new ItemStack(New_LetterTrays.LOWDESK_b),
				'a', new ItemStack(New_ChinjufuModSeasons.YUNOMI)
		});

		/*ちゃぶ台(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.CHABUDAI_doak, 1), new Object [] {
				"a",
				"x",
				'x', new ItemStack(New_LetterTrays.LOWDESK_d),
				'a', new ItemStack(New_ChinjufuModSeasons.YUNOMI)
		});

		/*ちゃぶ台(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.CHABUDAI_jun, 1), new Object [] {
				"a",
				"x",
				'x', new ItemStack(New_LetterTrays.LOWDESK_j),
				'a', new ItemStack(New_ChinjufuModSeasons.YUNOMI)
		});

		/*ちゃぶ台(マツ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.CHABUDAI_spru, 1), new Object [] {
				"a",
				"x",
				'x', new ItemStack(New_LetterTrays.LOWDESK_s),
				'a', new ItemStack(New_ChinjufuModSeasons.YUNOMI)
		});

		/*こたつ*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.KOTATSU, 1), new Object [] {
			"x",
			"b",
			'x', new ItemStack(New_ChinjufuModSeasons.CHABUDAI),
			'b', new ItemStack(Blocks.WOOL, 1, 0)
		});

		/*こたつ(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.KOTATSU_aca, 1), new Object [] {
				"x",
				"b",
				'x', new ItemStack(New_ChinjufuModSeasons.CHABUDAI_aca),
				'b', new ItemStack(Blocks.WOOL, 1, 0)
		});

		/*こたつ(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.KOTATSU_bir, 1), new Object [] {
				"x",
				"b",
				'x', new ItemStack(New_ChinjufuModSeasons.CHABUDAI_bir),
				'b', new ItemStack(Blocks.WOOL, 1, 0)
		});

		/*こたつ(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.KOTATSU_doak, 1), new Object [] {
				"x",
				"b",
				'x', new ItemStack(New_ChinjufuModSeasons.CHABUDAI_doak),
				'b', new ItemStack(Blocks.WOOL, 1, 0)
		});

		/*こたつ(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.KOTATSU_jun, 1), new Object [] {
				"x",
				"b",
				'x', new ItemStack(New_ChinjufuModSeasons.CHABUDAI_jun),
				'b', new ItemStack(Blocks.WOOL, 1, 0)
		});

		/*こたつ(マツ)*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.KOTATSU_spru, 1), new Object [] {
				"x",
				"b",
				'x', new ItemStack(New_ChinjufuModSeasons.CHABUDAI_spru),
				'b', new ItemStack(Blocks.WOOL, 1, 0)
		});

		/*プレゼント→りんご*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.PRESENT_Apple, 1), new Object[]{
				"#Y#",
				"YXY",
				"#Y#",
				'X', new ItemStack(Items.APPLE),
				'Y', new ItemStack(Items.PAPER)
		});

		GameRegistry.addRecipe(new ItemStack(Items.APPLE, 1), new Object[]{
						"X",
						'X', new ItemStack(New_ChinjufuModSeasons.PRESENT_Apple)
		});

		/*プレゼント→本*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.PRESENT_Book, 1), new Object[]{
				"#Y#",
				"YXY",
				"#Y#",
				'X', new ItemStack(Items.BOOK),
				'Y', new ItemStack(Items.PAPER)
		});

		GameRegistry.addRecipe(new ItemStack(Items.BOOK, 1), new Object[]{
						"X",
						'X', new ItemStack(New_ChinjufuModSeasons.PRESENT_Book)
		});

		/*プレゼント→ダイヤモンド*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.PRESENT_Diamond, 1), new Object[]{
				"#Y#",
				"YXY",
				"#Y#",
				'X', new ItemStack(Items.DIAMOND),
				'Y', new ItemStack(Items.PAPER)
		});

		GameRegistry.addRecipe(new ItemStack(Items.DIAMOND, 1), new Object[]{
						"X",
						'X', new ItemStack(New_ChinjufuModSeasons.PRESENT_Diamond)
		});

		/*プレゼント→ラピスラズリ*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.PRESENT_Lapis, 1), new Object[]{
				"#Y#",
				"YXY",
				"#Y#",
				'X', new ItemStack(Items.DYE, 1, 4),
				'Y', new ItemStack(Items.PAPER)
		});

		GameRegistry.addRecipe(new ItemStack(Items.DYE, 1, 4), new Object[]{
						"X",
						'X', new ItemStack(New_ChinjufuModSeasons.PRESENT_Lapis)
		});

		/*プレゼント→ブレイズロッド*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModSeasons.PRESENT_Blaze, 1), new Object[]{
				"#Y#",
				"YXY",
				"#Y#",
				'X', new ItemStack(Items.BLAZE_ROD),
				'Y', new ItemStack(Items.PAPER)
		});

		GameRegistry.addRecipe(new ItemStack(Items.BLAZE_ROD, 1), new Object[]{
						"X",
						'X', new ItemStack(New_ChinjufuModSeasons.PRESENT_Blaze)
		});

		/*クリスマスツリー*/
		GameRegistry.addShapelessRecipe(new ItemStack(New_ChinjufuModSeasons.XMASTREE, 1),
				new ItemStack(ASDecoModGarden.SPRUCE_bot),
				new ItemStack(Blocks.CARPET, 1, 0),
				new ItemStack(Blocks.CARPET, 1, 4),
				new ItemStack(Blocks.CARPET, 1, 14));


		/*クリスマスツリー_白*/
		GameRegistry.addShapelessRecipe(new ItemStack(New_ChinjufuModSeasons.XMASTREE_W, 1),
				new ItemStack(ASDecoModGarden.SPRUCE_bot),
				new ItemStack(Blocks.CARPET, 1, 0),
				new ItemStack(Blocks.CARPET, 1, 3),
				new ItemStack(Blocks.CARPET, 1, 9));
	}

}
