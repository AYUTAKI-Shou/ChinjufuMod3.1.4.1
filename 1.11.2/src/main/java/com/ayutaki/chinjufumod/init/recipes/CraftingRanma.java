package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ASDecoModRanma;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRanma {

	public CraftingRanma() {
		register();
	}

	public static void register() {
		/*欄間*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.RANMA_oak, 1), new Object [] {
				"#y#",
				"xxx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*欄間(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.RANMA_aca, 1), new Object [] {
				"#y#",
				"xxx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*欄間(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.RANMA_bir, 1), new Object [] {
				"#y#",
				"xxx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*欄間(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.RANMA_doak, 1), new Object [] {
				"#y#",
				"xxx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*欄間(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.RANMA_jun, 1), new Object [] {
				"#y#",
				"xxx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*欄間(マツ)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.RANMA_spru, 1), new Object [] {
				"#y#",
				"xxx",
				'x', new ItemStack(Items.STICK),
				'y',  new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*欄間 甲・・・紙*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.RANMAB_oak, 1), new Object [] {
				"#y#",
				"xzx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0),
				'z', new ItemStack(Items.PAPER)
		});

		/*欄間 甲(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.RANMAB_aca, 1), new Object [] {
				"#y#",
				"xzx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4),
				'z', new ItemStack(Items.PAPER)
		});

		/*欄間 甲(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.RANMAB_bir, 1), new Object [] {
				"#y#",
				"xzx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2),
				'z', new ItemStack(Items.PAPER)
		});

		/*欄間 甲(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.RANMAB_doak, 1), new Object [] {
				"#y#",
				"xzx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5),
				'z', new ItemStack(Items.PAPER)
		});

		/*欄間 甲(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.RANMAB_jun, 1), new Object [] {
				"#y#",
				"xzx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3),
				'z', new ItemStack(Items.PAPER)
		});

		/*欄間 甲(マツ)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.RANMAB_spru, 1), new Object [] {
				"#y#",
				"xzx",
				'x', new ItemStack(Items.STICK),
				'y',  new ItemStack(Blocks.WOODEN_SLAB, 1, 1),
				'z', new ItemStack(Items.PAPER)
		});

		/*欄間 乙・・・ガラス*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.RANMAC_oak, 1), new Object [] {
				"#y#",
				"xzx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0),
				'z', new ItemStack(Blocks.GLASS_PANE)
		});

		/*欄間 乙(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.RANMAC_aca, 1), new Object [] {
				"#y#",
				"xzx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4),
				'z', new ItemStack(Blocks.GLASS_PANE)
		});

		/*欄間 乙(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.RANMAC_bir, 1), new Object [] {
				"#y#",
				"xzx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2),
				'z', new ItemStack(Blocks.GLASS_PANE)
		});

		/*欄間 乙(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.RANMAC_doak, 1), new Object [] {
				"#y#",
				"xzx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5),
				'z', new ItemStack(Blocks.GLASS_PANE)
		});

		/*欄間 乙(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.RANMAC_jun, 1), new Object [] {
				"#y#",
				"xzx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3),
				'z', new ItemStack(Blocks.GLASS_PANE)
		});

		/*欄間 乙(マツ)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.RANMAC_spru, 1), new Object [] {
				"#y#",
				"xzx",
				'x', new ItemStack(Items.STICK),
				'y',  new ItemStack(Blocks.WOODEN_SLAB, 1, 1),
				'z', new ItemStack(Blocks.GLASS_PANE)
		});

		/*換気口*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.KANKI_oak, 3), new Object [] {
				"xyx",
				"xyx",
				"xyx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*換気口(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.KANKI_aca, 3), new Object [] {
				"xyx",
				"xyx",
				"xyx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*換気口(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.KANKI_bir, 3), new Object [] {
				"xyx",
				"xyx",
				"xyx",
				'x', new ItemStack(Items.STICK),
				'y',  new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*換気口(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.KANKI_doak, 3), new Object [] {
				"xyx",
				"xyx",
				"xyx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*換気口(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.KANKI_jun, 3), new Object [] {
				"xyx",
				"xyx",
				"xyx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*換気口(マツ)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.KANKI_spru, 3), new Object [] {
				"xyx",
				"xyx",
				"xyx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*格子窓*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.KOUSHI_oak, 1), new Object [] {
				"#y#",
				"xxx",
				"xxx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*格子窓(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.KOUSHI_aca, 1), new Object [] {
				"#y#",
				"xxx",
				"xxx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*格子窓(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.KOUSHI_bir, 1), new Object [] {
				"#y#",
				"xxx",
				"xxx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*格子窓(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.KOUSHI_doak, 1), new Object [] {
				"#y#",
				"xxx",
				"xxx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*格子窓(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.KOUSHI_jun, 1), new Object [] {
				"#y#",
				"xxx",
				"xxx",
				'x', new ItemStack(Items.STICK),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*格子窓(マツ)*/
		GameRegistry.addRecipe(new ItemStack(ASDecoModRanma.KOUSHI_spru, 1), new Object [] {
				"#y#",
				"xxx",
				"xxx",
				'x', new ItemStack(Items.STICK),
				'y',  new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

	}

}
