package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ASDecoModHakkou;
import com.ayutaki.chinjufumod.init.ASDecoModKawara;
import com.ayutaki.chinjufumod.init.ChinjufuModFoodBlocks;
import com.ayutaki.chinjufumod.init.ChinjufuModItemFoods;
import com.ayutaki.chinjufumod.init.New_ASDecoModWallPane;
import com.ayutaki.chinjufumod.init.New_ChinjufuModItems;
import com.ayutaki.chinjufumod.init.TTimeItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingChinjufuMod {

	public SmeltingChinjufuMod() {
		register();
	}

	public static void register() {

		/*湯呑み
		GameRegistry.addSmelting(TTimeItems.CLAY_YUNOMI, new ItemStack(New_ChinjufuModSeasons.YUNOMI, 1), 0.5F);*/

		/*ひび入り安山岩レンガ*/
		GameRegistry.addSmelting(New_ASDecoModWallPane.BRICK_AND, new ItemStack(New_ASDecoModWallPane.BRICK_AND_CR, 1), 0.5F);

		/*ひび入り閃緑岩レンガ*/
		GameRegistry.addSmelting(New_ASDecoModWallPane.BRICK_DIO, new ItemStack(New_ASDecoModWallPane.BRICK_DIO_CR, 1), 0.5F);

		/*ひび入り花崗岩レンガ*/
		GameRegistry.addSmelting(New_ASDecoModWallPane.BRICK_GRA, new ItemStack(New_ASDecoModWallPane.BRICK_GRA_CR, 1), 0.5F);

		/*瓦(黒)*/
		GameRegistry.addSmelting(New_ChinjufuModItems.CLAYKAWARA, new ItemStack(ASDecoModKawara.KAWARA_black, 1), 0.5F);

		/*アルミニウム精錬 素材→精錬結果*/
		GameRegistry.addSmelting(New_ChinjufuModItems.BAUXITE, new ItemStack(TTimeItems.ALUMINUM, 1), 1.0F);

		/*マッチ*/
		GameRegistry.addSmelting(TTimeItems.Item_MATCH, new ItemStack(Items.DYE, 1, 15), 1.0F);

		/*生酒の火入れ*/
		GameRegistry.addSmelting(ASDecoModHakkou.NAMASAKEBOT_full, new ItemStack(ASDecoModHakkou.SHINSAKEBOT_1, 1), 0.5F);

		/*湯呑み*/
		GameRegistry.addSmelting(TTimeItems.CLAY_YUNOMI, new ItemStack(TTimeItems.Item_YUNOMI, 1), 0.5F);

		/*急須*/
		GameRegistry.addSmelting(TTimeItems.CLAY_KYUSU, new ItemStack(ChinjufuModFoodBlocks.KYUSU_kara, 1), 0.5F);

		/*ティーカップ*/
		GameRegistry.addSmelting(TTimeItems.CLAY_TCUP, new ItemStack(TTimeItems.Item_TCUP, 1), 0.5F);

		/*ティーポット*/
		GameRegistry.addSmelting(TTimeItems.CLAY_TPOT, new ItemStack(ChinjufuModFoodBlocks.TEAPOT_kara, 1), 0.5F);

		/*皿*/
		GameRegistry.addSmelting(TTimeItems.CLAY_SARA, new ItemStack(TTimeItems.Item_SARA, 1), 0.5F);

		/*茶碗*/
		GameRegistry.addSmelting(TTimeItems.CLAY_CHAWAN, new ItemStack(TTimeItems.Item_CHAWAN, 1), 0.5F);

		/*鍋*/
		GameRegistry.addSmelting(TTimeItems.CLAY_NABE, new ItemStack(ChinjufuModFoodBlocks.NABE_kara, 1), 0.5F);

		/*呑水*/
		GameRegistry.addSmelting(TTimeItems.CLAY_TONSUI, new ItemStack(TTimeItems.Item_TONSUI, 1), 0.5F);

		/*テーブルロール*/
		GameRegistry.addSmelting(TTimeItems.KIJI_BUN, new ItemStack(ChinjufuModItemFoods.BUN, 1), 0.5F);

		/*スコーン*/
		GameRegistry.addSmelting(TTimeItems.KIJI_SCONE, new ItemStack(ChinjufuModItemFoods.SCONE, 1), 0.5F);

		/*せんべい*/
		GameRegistry.addSmelting(TTimeItems.KIJI_SENBEI, new ItemStack(ChinjufuModItemFoods.SENBEI, 1), 0.5F);

		/*焼きとうもろこし*/
		GameRegistry.addSmelting(ChinjufuModItemFoods.FOOD_CORN, new ItemStack(ChinjufuModItemFoods.FOOD_CORN_B, 1), 0.5F);


	}
}
