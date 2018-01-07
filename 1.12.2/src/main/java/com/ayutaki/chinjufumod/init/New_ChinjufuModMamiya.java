package com.ayutaki.chinjufumod.init;

import java.util.LinkedList;
import java.util.List;

import com.ayutaki.chinjufumod.init.mamiya.BlockCafeTable;
import com.ayutaki.chinjufumod.init.mamiya.BlockCafeTable_a;
import com.ayutaki.chinjufumod.init.mamiya.BlockCafeTable_b;
import com.ayutaki.chinjufumod.init.mamiya.BlockCafeTable_d;
import com.ayutaki.chinjufumod.init.mamiya.BlockCafeTable_j;
import com.ayutaki.chinjufumod.init.mamiya.BlockCafeTable_s;
import com.ayutaki.chinjufumod.init.mamiya.BlockLogChair;
import com.ayutaki.chinjufumod.init.mamiya.BlockMEndai;
import com.ayutaki.chinjufumod.init.mamiya.BlockMEndai_red;
import com.ayutaki.chinjufumod.init.mamiya.BlockMKasa_black;
import com.ayutaki.chinjufumod.init.mamiya.BlockMKasa_blue;
import com.ayutaki.chinjufumod.init.mamiya.BlockMKasa_brown;
import com.ayutaki.chinjufumod.init.mamiya.BlockMKasa_cyan;
import com.ayutaki.chinjufumod.init.mamiya.BlockMKasa_gray;
import com.ayutaki.chinjufumod.init.mamiya.BlockMKasa_green;
import com.ayutaki.chinjufumod.init.mamiya.BlockMKasa_lightb;
import com.ayutaki.chinjufumod.init.mamiya.BlockMKasa_lightg;
import com.ayutaki.chinjufumod.init.mamiya.BlockMKasa_lime;
import com.ayutaki.chinjufumod.init.mamiya.BlockMKasa_magenta;
import com.ayutaki.chinjufumod.init.mamiya.BlockMKasa_orange;
import com.ayutaki.chinjufumod.init.mamiya.BlockMKasa_pink;
import com.ayutaki.chinjufumod.init.mamiya.BlockMKasa_purple;
import com.ayutaki.chinjufumod.init.mamiya.BlockMKasa_red;
import com.ayutaki.chinjufumod.init.mamiya.BlockMKasa_white;
import com.ayutaki.chinjufumod.init.mamiya.BlockMKasa_yellow;
import com.ayutaki.chinjufumod.init.mamiya.BlockWaraZabuton;
import com.ayutaki.chinjufumod.init.mamiya.BlockZabuton_c;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class New_ChinjufuModMamiya {

	public static Block ENDAI, ENDAI_red;

	public static Block ZABUTON_black,ZABUTON_blue,ZABUTON_brown,ZABUTON_cyan,
						ZABUTON_gray,ZABUTON_green,ZABUTON_lightb,ZABUTON_lightg,
						ZABUTON_lime,ZABUTON_magenta,ZABUTON_orange,ZABUTON_pink,
						ZABUTON_purple,ZABUTON_red,ZABUTON_white,ZABUTON_yellow;

	public static Block WARAZABUTON;

	public static Block CAFETABLE, CAFETABLE_a, CAFETABLE_b,
						CAFETABLE_d, CAFETABLE_j, CAFETABLE_s;

	public static Block LOGCHAIR,LOGCHAIR_a,LOGCHAIR_b,
						LOGCHAIR_d,LOGCHAIR_j,LOGCHAIR_s;

	public static Block KASA_black, KASA_blue, KASA_brown, KASA_cyan,
						KASA_gray, KASA_green ,KASA_lightb ,KASA_lightg,
						KASA_lime ,KASA_magenta, KASA_orange, KASA_pink,
						KASA_purple, KASA_red, KASA_white, KASA_yellow;

	public static void init() {
		//ブロックのインスタンス生成
		ENDAI = new BlockMEndai(Material.WOOD).setRegistryName("block_mendai").setUnlocalizedName("block_mendai").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ENDAI_red = new BlockMEndai_red(Material.WOOD).setRegistryName("block_mendai_red").setUnlocalizedName("block_mendai_red").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);

		ZABUTON_black = new BlockZabuton_c(Material.CLOTH).setRegistryName("block_mzabuton_black").setUnlocalizedName("block_mzabuton_black").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZABUTON_blue = new BlockZabuton_c(Material.CLOTH).setRegistryName("block_mzabuton_blue").setUnlocalizedName("block_mzabuton_blue").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZABUTON_brown = new BlockZabuton_c(Material.CLOTH).setRegistryName("block_mzabuton_brown").setUnlocalizedName("block_mzabuton_brown").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZABUTON_cyan = new BlockZabuton_c(Material.CLOTH).setRegistryName("block_mzabuton_cyan").setUnlocalizedName("block_mzabuton_cyan").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZABUTON_gray = new BlockZabuton_c(Material.CLOTH).setRegistryName("block_mzabuton_gray").setUnlocalizedName("block_mzabuton_gray").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZABUTON_green = new BlockZabuton_c(Material.CLOTH).setRegistryName("block_mzabuton_green").setUnlocalizedName("block_mzabuton_green").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZABUTON_lightb = new BlockZabuton_c(Material.CLOTH).setRegistryName("block_mzabuton_lightb").setUnlocalizedName("block_mzabuton_lightb").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZABUTON_lightg = new BlockZabuton_c(Material.CLOTH).setRegistryName("block_mzabuton_lightg").setUnlocalizedName("block_mzabuton_lightg").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZABUTON_lime = new BlockZabuton_c(Material.CLOTH).setRegistryName("block_mzabuton_lime").setUnlocalizedName("block_mzabuton_lime").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZABUTON_magenta = new BlockZabuton_c(Material.CLOTH).setRegistryName("block_mzabuton_magenta").setUnlocalizedName("block_mzabuton_magenta").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZABUTON_orange = new BlockZabuton_c(Material.CLOTH).setRegistryName("block_mzabuton_orange").setUnlocalizedName("block_mzabuton_orange").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZABUTON_pink = new BlockZabuton_c(Material.CLOTH).setRegistryName("block_mzabuton_pink").setUnlocalizedName("block_mzabuton_pink").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZABUTON_purple = new BlockZabuton_c(Material.CLOTH).setRegistryName("block_mzabuton_purple").setUnlocalizedName("block_mzabuton_purple").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZABUTON_red = new BlockZabuton_c(Material.CLOTH).setRegistryName("block_mzabuton_red").setUnlocalizedName("block_mzabuton_red").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZABUTON_white = new BlockZabuton_c(Material.CLOTH).setRegistryName("block_mzabuton_white").setUnlocalizedName("block_mzabuton_white").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZABUTON_yellow = new BlockZabuton_c(Material.CLOTH).setRegistryName("block_mzabuton_yellow").setUnlocalizedName("block_mzabuton_yellow").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);

		WARAZABUTON = new BlockWaraZabuton(Material.CLOTH).setRegistryName("block_wara_zabuton").setUnlocalizedName("block_wara_zabuton").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);

		CAFETABLE = new BlockCafeTable(Material.WOOD).setRegistryName("block_cafetable").setUnlocalizedName("block_cafetable").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFETABLE_a = new BlockCafeTable_a(Material.WOOD).setRegistryName("block_cafetable_a").setUnlocalizedName("block_cafetable_a").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFETABLE_b = new BlockCafeTable_b(Material.WOOD).setRegistryName("block_cafetable_b").setUnlocalizedName("block_cafetable_b").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFETABLE_d = new BlockCafeTable_d(Material.WOOD).setRegistryName("block_cafetable_d").setUnlocalizedName("block_cafetable_d").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFETABLE_j = new BlockCafeTable_j(Material.WOOD).setRegistryName("block_cafetable_j").setUnlocalizedName("block_cafetable_j").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFETABLE_s = new BlockCafeTable_s(Material.WOOD).setRegistryName("block_cafetable_s").setUnlocalizedName("block_cafetable_s").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		LOGCHAIR = new BlockLogChair(Material.WOOD).setRegistryName("block_logchair").setUnlocalizedName("block_logchair").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LOGCHAIR_a = new BlockLogChair(Material.WOOD).setRegistryName("block_logchair_a").setUnlocalizedName("block_logchair_a").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LOGCHAIR_b = new BlockLogChair(Material.WOOD).setRegistryName("block_logchair_b").setUnlocalizedName("block_logchair_b").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LOGCHAIR_d = new BlockLogChair(Material.WOOD).setRegistryName("block_logchair_d").setUnlocalizedName("block_logchair_d").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LOGCHAIR_j = new BlockLogChair(Material.WOOD).setRegistryName("block_logchair_j").setUnlocalizedName("block_logchair_j").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LOGCHAIR_s = new BlockLogChair(Material.WOOD).setRegistryName("block_logchair_s").setUnlocalizedName("block_logchair_s").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		KASA_black = new BlockMKasa_black(Material.CLOTH).setRegistryName("block_mkasa_black").setUnlocalizedName("block_mkasa_black").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KASA_blue = new BlockMKasa_blue(Material.CLOTH).setRegistryName("block_mkasa_blue").setUnlocalizedName("block_mkasa_blue").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KASA_brown = new BlockMKasa_brown(Material.CLOTH).setRegistryName("block_mkasa_brown").setUnlocalizedName("block_mkasa_brown").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KASA_cyan = new BlockMKasa_cyan(Material.CLOTH).setRegistryName("block_mkasa_cyan").setUnlocalizedName("block_mkasa_cyan").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KASA_gray = new BlockMKasa_gray(Material.CLOTH).setRegistryName("block_mkasa_gray").setUnlocalizedName("block_mkasa_gray").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KASA_green = new BlockMKasa_green(Material.CLOTH).setRegistryName("block_mkasa_green").setUnlocalizedName("block_mkasa_green").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KASA_lightb = new BlockMKasa_lightb(Material.CLOTH).setRegistryName("block_mkasa_lightb").setUnlocalizedName("block_mkasa_lightb").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KASA_lightg = new BlockMKasa_lightg(Material.CLOTH).setRegistryName("block_mkasa_lightg").setUnlocalizedName("block_mkasa_lightg").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KASA_lime = new BlockMKasa_lime(Material.CLOTH).setRegistryName("block_mkasa_lime").setUnlocalizedName("block_mkasa_lime").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KASA_magenta = new BlockMKasa_magenta(Material.CLOTH).setRegistryName("block_mkasa_magenta").setUnlocalizedName("block_mkasa_magenta").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KASA_orange = new BlockMKasa_orange(Material.CLOTH).setRegistryName("block_mkasa_orange").setUnlocalizedName("block_mkasa_orange").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KASA_pink = new BlockMKasa_pink(Material.CLOTH).setRegistryName("block_mkasa_pink").setUnlocalizedName("block_mkasa_pink").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KASA_purple = new BlockMKasa_purple(Material.CLOTH).setRegistryName("block_mkasa_purple").setUnlocalizedName("block_mkasa_purple").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KASA_red = new BlockMKasa_red(Material.CLOTH).setRegistryName("block_mkasa_red").setUnlocalizedName("block_mkasa_red").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KASA_white = new BlockMKasa_white(Material.CLOTH).setRegistryName("block_mkasa_white").setUnlocalizedName("block_mkasa_white").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		KASA_yellow = new BlockMKasa_yellow(Material.CLOTH).setRegistryName("block_mkasa_yellow").setUnlocalizedName("block_mkasa_yellow").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);

	}


	public static void register() {
		//ブロックを登録
		registerBlock(ENDAI);
		registerBlock(ENDAI_red);

		registerBlock(ZABUTON_black);
		registerBlock(ZABUTON_blue);
		registerBlock(ZABUTON_brown);
		registerBlock(ZABUTON_cyan);
		registerBlock(ZABUTON_gray);
		registerBlock(ZABUTON_green);
		registerBlock(ZABUTON_lightb);
		registerBlock(ZABUTON_lightg);
		registerBlock(ZABUTON_lime);
		registerBlock(ZABUTON_magenta);
		registerBlock(ZABUTON_orange);
		registerBlock(ZABUTON_pink);
		registerBlock(ZABUTON_purple);
		registerBlock(ZABUTON_red);
		registerBlock(ZABUTON_white);
		registerBlock(ZABUTON_yellow);

		registerBlock(WARAZABUTON);

		registerBlock(CAFETABLE);
		registerBlock(CAFETABLE_a);
		registerBlock(CAFETABLE_b);
		registerBlock(CAFETABLE_d);
		registerBlock(CAFETABLE_j);
		registerBlock(CAFETABLE_s);

		registerBlock(LOGCHAIR);
		registerBlock(LOGCHAIR_a);
		registerBlock(LOGCHAIR_b);
		registerBlock(LOGCHAIR_d);
		registerBlock(LOGCHAIR_j);
		registerBlock(LOGCHAIR_s);

		registerBlock(KASA_black);
		registerBlock(KASA_blue);
		registerBlock(KASA_brown);
		registerBlock(KASA_cyan);
		registerBlock(KASA_gray);
		registerBlock(KASA_green);
		registerBlock(KASA_lightb);
		registerBlock(KASA_lightg);
		registerBlock(KASA_lime);
		registerBlock(KASA_magenta);
		registerBlock(KASA_orange);
		registerBlock(KASA_pink);
		registerBlock(KASA_purple);
		registerBlock(KASA_red);
		registerBlock(KASA_white);
		registerBlock(KASA_yellow);

	}

	public static void registerBlock(Block block) {
		registerBlock(block, new ItemBlock(block));
	}

	public static void registerBlock(Block block, ItemBlock item) {
		RegistrationHandler.BLOCKS.add(block);
		item.setRegistryName(block.getRegistryName());
		New_ChinjufuModItems.RegistrationHandler.ITEMS.add(item);
	}


	public static void registerRenders() {
		//ブロックのモデルを登録
		registerRender(ENDAI);
		registerRender(ENDAI_red);

		registerRender(ZABUTON_black);
		registerRender(ZABUTON_blue);
		registerRender(ZABUTON_brown);
		registerRender(ZABUTON_cyan);
		registerRender(ZABUTON_lightb);
		registerRender(ZABUTON_lightg);
		registerRender(ZABUTON_gray);
		registerRender(ZABUTON_green);
		registerRender(ZABUTON_lime);
		registerRender(ZABUTON_magenta);
		registerRender(ZABUTON_orange);
		registerRender(ZABUTON_pink);
		registerRender(ZABUTON_purple);
		registerRender(ZABUTON_red);
		registerRender(ZABUTON_white);
		registerRender(ZABUTON_yellow);

		registerRender(WARAZABUTON);

		registerRender(CAFETABLE);
		registerRender(CAFETABLE_a);
		registerRender(CAFETABLE_b);
		registerRender(CAFETABLE_d);
		registerRender(CAFETABLE_j);
		registerRender(CAFETABLE_s);

		registerRender(LOGCHAIR);
		registerRender(LOGCHAIR_a);
		registerRender(LOGCHAIR_b);
		registerRender(LOGCHAIR_d);
		registerRender(LOGCHAIR_j);
		registerRender(LOGCHAIR_s);

		registerRender(KASA_black);
		registerRender(KASA_blue);
		registerRender(KASA_brown);
		registerRender(KASA_cyan);
		registerRender(KASA_lightb);
		registerRender(KASA_lightg);
		registerRender(KASA_gray);
		registerRender(KASA_green);
		registerRender(KASA_lime);
		registerRender(KASA_magenta);
		registerRender(KASA_orange);
		registerRender(KASA_pink);
		registerRender(KASA_purple);
		registerRender(KASA_red);
		registerRender(KASA_white);
		registerRender(KASA_yellow);

	}


	@SideOnly(Side.CLIENT)
	private static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(block.getRegistryName(),"inventory"));
	}

	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	public static class RegistrationHandler {

		public static final List<Block> BLOCKS = new LinkedList<>();

		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Block> event) {

			New_ChinjufuModMamiya.init();
			New_ChinjufuModMamiya.register();
			BLOCKS.stream().forEach(block -> event.getRegistry().register(block));
		}
	}
}
