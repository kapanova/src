package com.kapanova.novaproject.init;

import java.util.ArrayList;
import java.util.List;

import com.kapanova.novaproject.Items.ItemBase;
import com.kapanova.novaproject.Items.armor.ArmorBase;
import com.kapanova.novaproject.Items.food.FoodBase;
import com.kapanova.novaproject.Items.food.FoodEffectBase;
import com.kapanova.novaproject.Items.tools.ToolAxe;
import com.kapanova.novaproject.Items.tools.ToolPickaxe;
import com.kapanova.novaproject.Items.tools.ToolSpade;
import com.kapanova.novaproject.Items.tools.ToolSword;
import com.kapanova.novaproject.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List <Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_TUTORIUM = EnumHelper.addToolMaterial("material_tutorium", 2, 1561, 10F, 3.0F, 14);
	public static final ArmorMaterial ARMOR_MATERIAL_TUTORIUM = EnumHelper.addArmorMaterial("armor_material_tutorium", Reference.MOD_ID + ":tutorium", 14, new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	//Items
	public static final Item TUTORIUM_INGOT = new ItemBase("tutorium_ingot");
	public static final Item TUTORIUM_NUGGET = new ItemBase("tutorium_nugget");
	
	//Tools
	public static final ItemSword TUTORIUM_SWORD = new ToolSword("tutorium_sword", MATERIAL_TUTORIUM);
	public static final ItemSpade TUTORIUM_SHOVEL = new ToolSpade("tutorium_shovel", MATERIAL_TUTORIUM);
	public static final ItemPickaxe TUTORIUM_PICKAXE = new ToolPickaxe("tutorium_pickaxe", MATERIAL_TUTORIUM);
	public static final ItemAxe TUTORIUM_AXE = new ToolAxe("tutorium_axe", MATERIAL_TUTORIUM);
	
	//Armor
	public static final Item TUTORIUM_HELMET = new ArmorBase("tutorium_helmet", ARMOR_MATERIAL_TUTORIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item TUTORIUM_CHESTPLATE = new ArmorBase("tutorium_chestplate", ARMOR_MATERIAL_TUTORIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item TUTORIUM_LEGGINGS = new ArmorBase("tutorium_leggings", ARMOR_MATERIAL_TUTORIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item TUTORIUM_BOOTS = new ArmorBase("tutorium_boots", ARMOR_MATERIAL_TUTORIUM, 1, EntityEquipmentSlot.FEET);
	
	//Food w/ Effects
	//public static final Item TUTORIUM_APPLE = new FoodBase("tutorium_apple", 6, 9.6f, false);
	public static final Item TUTORIUM_APPLE = new FoodEffectBase("tutorium_apple", 6, 9.6f, false);
}
