package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.New_ChinjufuModArmor;
import com.ayutaki.chinjufumod.init.New_ChinjufuModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingCArmor {

	public CraftingCArmor() {
		register();
	}

	public static void register() {

		/*吹雪型*/
		/*ヘルメット*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.FUBUKI_HELMET, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_HELMET),
				'y', new ItemStack(Items.SNOWBALL),
				'z', new ItemStack(New_ChinjufuModItems.WORK_ORDER)
		});

		/*チェストプレート*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.FUBUKI_CHESTPLATE, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_CHESTPLATE),
				'y', new ItemStack(Items.SNOWBALL),
				'z', new ItemStack(New_ChinjufuModItems.WORK_ORDER)
		});

		/*レギンス*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.FUBUKI_LEGGINGS, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_LEGGINGS),
				'y', new ItemStack(Items.SNOWBALL),
				'z', new ItemStack(New_ChinjufuModItems.WORK_ORDER)
		});

		/*ブーツ*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.FUBUKI_BOOTS, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_BOOTS),
				'y', new ItemStack(Items.SNOWBALL),
				'z', new ItemStack(New_ChinjufuModItems.WORK_ORDER)
		});

		/*霞型*/
		/*ヘルメット DYE, 個数, メタ値*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.KASUMI_HELMET, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_HELMET),
				'y', new ItemStack(Items.DYE, 1, 10),
				'z', new ItemStack(New_ChinjufuModItems.WORK_ORDER)
		});

		/*チェストプレート*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.KASUMI_CHESTPLATE, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_CHESTPLATE),
				'y', new ItemStack(Items.DYE, 1, 10),
				'z', new ItemStack(New_ChinjufuModItems.WORK_ORDER)
		});

		/*レギンス*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.KASUMI_LEGGINGS, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_LEGGINGS),
				'y', new ItemStack(Items.DYE, 1, 10),
				'z', new ItemStack(New_ChinjufuModItems.WORK_ORDER)
		});

		/*ブーツ*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.KASUMI_BOOTS, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_BOOTS),
				'y', new ItemStack(Items.DYE, 1, 10),
				'z', new ItemStack(New_ChinjufuModItems.WORK_ORDER)
		});

		/*時雨型*/
		/*ヘルメット*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.SHIGURE_HELMET, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_HELMET),
				'y', new ItemStack(Items.DYE, 1, 0),
				'z', new ItemStack(New_ChinjufuModItems.WORK_ORDER)
		});

		/*チェストプレート*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.SHIGURE_CHESTPLATE, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_CHESTPLATE),
				'y', new ItemStack(Items.DYE, 1, 0),
				'z', new ItemStack(New_ChinjufuModItems.WORK_ORDER)
		});

		/*レギンス*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.SHIGURE_LEGGINGS, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_LEGGINGS),
				'y', new ItemStack(Items.DYE, 1, 0),
				'z', new ItemStack(New_ChinjufuModItems.WORK_ORDER)
		});

		/*ブーツ*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.SHIGURE_BOOTS, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_BOOTS),
				'y', new ItemStack(Items.DYE, 1, 0),
				'z', new ItemStack(New_ChinjufuModItems.WORK_ORDER)
		});

		/*白露型*/
		/*ヘルメット*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.SHIRATSUYU_HELMET, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_HELMET),
				'y', new ItemStack(Items.DYE, 1, 8),
				'z', new ItemStack(New_ChinjufuModItems.WORK_ORDER)
		});

		/*チェストプレート*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.SHIRATSUYU_CHESTPLATE, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_CHESTPLATE),
				'y', new ItemStack(Items.DYE, 1, 8),
				'z', new ItemStack(New_ChinjufuModItems.WORK_ORDER)
		});

		/*レギンス*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.SHIRATSUYU_LEGGINGS, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_LEGGINGS),
				'y', new ItemStack(Items.DYE, 1, 8),
				'z', new ItemStack(New_ChinjufuModItems.WORK_ORDER)
		});

		/*ブーツ*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.SHIRATSUYU_BOOTS, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_BOOTS),
				'y', new ItemStack(Items.DYE, 1, 8),
				'z', new ItemStack(New_ChinjufuModItems.WORK_ORDER)
		});

		/*明石サンタ*/
		/*ヘルメット*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.AKASHISANTA_HELMET, 1), new Object [] {
				"xxx",
				"y#z",
				'x', new ItemStack(Blocks.CARPET, 1, 14),
				'y', new ItemStack(Blocks.CARPET, 1, 0),
				'z', new ItemStack(Items.DYE, 1, 9)
		});

		/*チェストプレート*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.AKASHISANTA_CHESTPLATE, 1), new Object [] {
				"y#z",
				"xxx",
				"xxx",
				'x', new ItemStack(Blocks.CARPET, 1, 14),
				'y', new ItemStack(Blocks.CARPET, 1, 0),
				'z', new ItemStack(Items.DYE, 1, 9)
		});

		/*レギンス*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.AKASHISANTA_LEGGINGS, 1), new Object [] {
				"xxx",
				"x#x",
				"y#z",
				'x', new ItemStack(Blocks.CARPET, 1, 14),
				'y', new ItemStack(Blocks.CARPET, 1, 0),
				'z', new ItemStack(Items.DYE, 1, 9)
		});

		/*ブーツ*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.AKASHISANTA_BOOTS, 1), new Object [] {
				"y#z",
				"x#x",
				'x', new ItemStack(Items.LEATHER),
				'y', new ItemStack(Blocks.CARPET, 1, 0),
				'z', new ItemStack(Items.DYE, 1, 9)
		});

		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.AKASHISANTA_BOOTS, 1), new Object [] {
				"y#z",
				"x#x",
				'x', new ItemStack(Blocks.CARPET, 1, 15),
				'y', new ItemStack(Blocks.CARPET, 1, 0),
				'z', new ItemStack(Items.DYE, 1, 9)
		});

		/*熊野サンタ*/
		/*ヘルメット*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.KUMANOSANTA_HELMET, 1), new Object [] {
				"xxx",
				"y#z",
				'x', new ItemStack(Blocks.CARPET, 1, 14),
				'y', new ItemStack(Blocks.CARPET, 1, 0),
				'z', new ItemStack(Items.DYE, 1, 14)
		});

		/*チェストプレート*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.KUMANOSANTA_CHESTPLATE, 1), new Object [] {
				"y#z",
				"xxx",
				"xxx",
				'x', new ItemStack(Blocks.CARPET, 1, 14),
				'y', new ItemStack(Blocks.CARPET, 1, 0),
				'z', new ItemStack(Items.DYE, 1, 14)
		});

		/*レギンス*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.KUMANOSANTA_LEGGINGS, 1), new Object [] {
				"xxx",
				"x#x",
				"y#z",
				'x', new ItemStack(Blocks.CARPET, 1, 14),
				'y', new ItemStack(Blocks.CARPET, 1, 0),
				'z', new ItemStack(Items.DYE, 1, 14)
		});

		/*ブーツ*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.KUMANOSANTA_BOOTS, 1), new Object [] {
				"y#z",
				"x#x",
				'x', new ItemStack(Items.LEATHER),
				'y', new ItemStack(Blocks.CARPET, 1, 0),
				'z', new ItemStack(Items.DYE, 1, 14)
		});

		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.KUMANOSANTA_BOOTS, 1), new Object [] {
				"y#z",
				"x#x",
				'x', new ItemStack(Blocks.CARPET, 1, 15),
				'y', new ItemStack(Blocks.CARPET, 1, 0),
				'z', new ItemStack(Items.DYE, 1, 14)
		});

		/*鈴谷サンタ*/
		/*ヘルメット*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.SUZUYASANTA_HELMET, 1), new Object [] {
				"xxx",
				"y#z",
				'x', new ItemStack(Blocks.CARPET, 1, 14),
				'y', new ItemStack(Blocks.CARPET, 1, 0),
				'z', new ItemStack(Items.DYE, 1, 10)
		});

		/*チェストプレート*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.SUZUYASANTA_CHESTPLATE, 1), new Object [] {
				"y#z",
				"xxx",
				"xxx",
				'x', new ItemStack(Blocks.CARPET, 1, 14),
				'y', new ItemStack(Blocks.CARPET, 1, 0),
				'z', new ItemStack(Items.DYE, 1, 10)
		});

		/*レギンス*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.SUZUYASANTA_LEGGINGS, 1), new Object [] {
				"xxx",
				"x#x",
				"y#z",
				'x', new ItemStack(Blocks.CARPET, 1, 14),
				'y', new ItemStack(Blocks.CARPET, 1, 0),
				'z', new ItemStack(Items.DYE, 1, 10)
		});

		/*ブーツ*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.SUZUYASANTA_BOOTS, 1), new Object [] {
				"y#z",
				"x#x",
				'x', new ItemStack(Items.LEATHER),
				'y', new ItemStack(Blocks.CARPET, 1, 0),
				'z', new ItemStack(Items.DYE, 1, 10)
		});

		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.SUZUYASANTA_BOOTS, 1), new Object [] {
				"y#z",
				"x#x",
				'x', new ItemStack(Blocks.CARPET, 1, 15),
				'y', new ItemStack(Blocks.CARPET, 1, 0),
				'z', new ItemStack(Items.DYE, 1, 10)
		});

		/*龍驤サンタ*/
		/*ヘルメット*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.RYUJOUSANTA_HELMET, 1), new Object [] {
				"xxx",
				"y#z",
				'x', new ItemStack(Blocks.CARPET, 1, 14),
				'y', new ItemStack(Blocks.CARPET, 1, 0),
				'z', new ItemStack(Items.DYE, 1, 3)
		});

		/*チェストプレート*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.RYUJOUSANTA_CHESTPLATE, 1), new Object [] {
				"y#z",
				"xxx",
				"xxx",
				'x', new ItemStack(Blocks.CARPET, 1, 14),
				'y', new ItemStack(Blocks.CARPET, 1, 0),
				'z', new ItemStack(Items.DYE, 1, 3)
		});

		/*レギンス*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.RYUJOUSANTA_LEGGINGS, 1), new Object [] {
				"xxx",
				"x#x",
				"y#z",
				'x', new ItemStack(Blocks.CARPET, 1, 14),
				'y', new ItemStack(Blocks.CARPET, 1, 0),
				'z', new ItemStack(Items.DYE, 1, 3)
		});

		/*ブーツ*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.RYUJOUSANTA_BOOTS, 1), new Object [] {
				"y#z",
				"x#x",
				'x', new ItemStack(Items.LEATHER),
				'y', new ItemStack(Blocks.CARPET, 1, 0),
				'z', new ItemStack(Items.DYE, 1, 3)
		});

		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.RYUJOUSANTA_BOOTS, 1), new Object [] {
				"y#z",
				"x#x",
				'x', new ItemStack(Blocks.CARPET, 1, 15),
				'y', new ItemStack(Blocks.CARPET, 1, 0),
				'z', new ItemStack(Items.DYE, 1, 3)
		});

		/*提督サンタ*/
		/*ヘルメット*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.TEITOKUSANTA_HELMET, 1), new Object [] {
				"xxx",
				"y#y",
				'x', new ItemStack(Blocks.CARPET, 1, 14),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});

		/*チェストプレート*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.TEITOKUSANTA_CHESTPLATE, 1), new Object [] {
				"y#y",
				"xxx",
				"xxx",
				'x', new ItemStack(Blocks.CARPET, 1, 14),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});

		/*レギンス*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.TEITOKUSANTA_LEGGINGS, 1), new Object [] {
				"xxx",
				"x#x",
				"y#y",
				'x', new ItemStack(Blocks.CARPET, 1, 14),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});

		/*ブーツ*/
		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.TEITOKUSANTA_BOOTS, 1), new Object [] {
				"y#y",
				"x#x",
				'x', new ItemStack(Items.LEATHER),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});

		GameRegistry.addRecipe(new ItemStack(New_ChinjufuModArmor.TEITOKUSANTA_BOOTS, 1), new Object [] {
				"y#y",
				"x#x",
				'x', new ItemStack(Blocks.CARPET, 1, 15),
				'y', new ItemStack(Blocks.CARPET, 1, 0)
		});
	}

}
