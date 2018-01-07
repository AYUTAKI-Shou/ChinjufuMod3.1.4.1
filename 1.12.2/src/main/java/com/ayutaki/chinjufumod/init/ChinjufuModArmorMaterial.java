package com.ayutaki.chinjufumod.init;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ChinjufuModArmorMaterial {

	public static ArmorMaterial FUBUKI = EnumHelper
			.addArmorMaterial("FUBUKI", "chinjufumod:fubuki", 17, new int[] { 2, 6, 7, 2 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
	/* .addArmorMaterial(name, textureName, durability, reductionAmounts, enchantability, soundOnEquip, toughness)
	 * name "Material名"
	 * textureName テクスチャの名前 "Modid:pngファイル名の_layer前まで"
	 * durability 防具の耐久度 革5 鉄15 金7 ダイヤモンド33
	 * reductionAmounts 各部の防御ポイント 革{ 1, 2, 3, 1 }、鉄{ 2, 5, 6, 2 }、金{ 1, 3, 5, 2 }、ダイヤモンド{ 3, 6, 8, 3 }
	 * enchantability 数値が大きいほど良いエンチャントが付き易い 革15、鉄9、金25、ダイヤモンド10
	 * soundOnEquip 効果音
	 * toughness タフネス、ダメージカット率をより上げる デフォルト0 ダイヤモンドのみ2 */

	public static ArmorMaterial KASUMI = EnumHelper
			.addArmorMaterial("KASUMI", "chinjufumod:kasumi", 17, new int[] { 2, 6, 7, 2 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);

	public static ArmorMaterial SHIGURE = EnumHelper
			.addArmorMaterial("SHIGURE", "chinjufumod:shigure", 17, new int[] { 2, 6, 7, 2 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);

	public static ArmorMaterial SHIRATSUYU = EnumHelper
			.addArmorMaterial("SHIRATSUYU", "chinjufumod:shiratsuyu", 17, new int[] { 2, 6, 7, 2 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);

	public static ArmorMaterial AKASHISANTA = EnumHelper
			.addArmorMaterial("AKASHISANTA", "chinjufumod:santaakashi", 6, new int[] { 1, 2, 2, 1 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);

	public static ArmorMaterial KUMANOSANTA = EnumHelper
			.addArmorMaterial("KUMANOSANTA", "chinjufumod:santakumano", 6, new int[] { 1, 2, 2, 1 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);

	public static ArmorMaterial SUZUYASANTA = EnumHelper
			.addArmorMaterial("SUZUYASANTA", "chinjufumod:santasuzuya", 6, new int[] { 1, 2, 2, 1 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);

	public static ArmorMaterial RYUJOUSANTA = EnumHelper
			.addArmorMaterial("RYUJOUSANTA", "chinjufumod:santaryujou", 6, new int[] { 1, 2, 2, 1 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);

	public static ArmorMaterial TEITOKUSANTA = EnumHelper
			.addArmorMaterial("TEITOKUSANTA", "chinjufumod:santattk", 6, new int[] { 1, 2, 2, 1 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);

}
