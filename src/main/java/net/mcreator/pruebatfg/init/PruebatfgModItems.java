/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pruebatfg.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.pruebatfg.item.RestosMagiaOscuraItem;
import net.mcreator.pruebatfg.item.RareSwordItem;
import net.mcreator.pruebatfg.item.RareShovelItem;
import net.mcreator.pruebatfg.item.RarePickaxeItem;
import net.mcreator.pruebatfg.item.RareIngotItem;
import net.mcreator.pruebatfg.item.RareHoeItem;
import net.mcreator.pruebatfg.item.RareAxeItem;
import net.mcreator.pruebatfg.item.RareArmorItem;
import net.mcreator.pruebatfg.item.PepitaItem;
import net.mcreator.pruebatfg.item.CieloItem;
import net.mcreator.pruebatfg.PruebatfgMod;

import java.util.function.Function;

public class PruebatfgModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(PruebatfgMod.MODID);
	public static final DeferredItem<Item> RARE_INGOT = register("rare_ingot", RareIngotItem::new);
	public static final DeferredItem<Item> RARE_ORE = block(PruebatfgModBlocks.RARE_ORE);
	public static final DeferredItem<Item> RARE_BLOCK = block(PruebatfgModBlocks.RARE_BLOCK);
	public static final DeferredItem<Item> RARE_PICKAXE = register("rare_pickaxe", RarePickaxeItem::new);
	public static final DeferredItem<Item> RARE_AXE = register("rare_axe", RareAxeItem::new);
	public static final DeferredItem<Item> RARE_SWORD = register("rare_sword", RareSwordItem::new);
	public static final DeferredItem<Item> RARE_SHOVEL = register("rare_shovel", RareShovelItem::new);
	public static final DeferredItem<Item> RARE_HOE = register("rare_hoe", RareHoeItem::new);
	public static final DeferredItem<Item> RARE_ARMOR_HELMET = register("rare_armor_helmet", RareArmorItem.Helmet::new);
	public static final DeferredItem<Item> RARE_ARMOR_CHESTPLATE = register("rare_armor_chestplate", RareArmorItem.Chestplate::new);
	public static final DeferredItem<Item> RARE_ARMOR_LEGGINGS = register("rare_armor_leggings", RareArmorItem.Leggings::new);
	public static final DeferredItem<Item> RARE_ARMOR_BOOTS = register("rare_armor_boots", RareArmorItem.Boots::new);
	public static final DeferredItem<Item> PEPITA = register("pepita", PepitaItem::new);
	public static final DeferredItem<Item> NUBES = block(PruebatfgModBlocks.NUBES);
	public static final DeferredItem<Item> CIELO = register("cielo", CieloItem::new);
	public static final DeferredItem<Item> PIEDRA_LUMINOSA_BENDITA = block(PruebatfgModBlocks.PIEDRA_LUMINOSA_BENDITA);
	public static final DeferredItem<Item> RESTOS_MAGIA_OSCURA = register("restos_magia_oscura", RestosMagiaOscuraItem::new);
	public static final DeferredItem<Item> EVOCADOR_OSCURO_SPAWN_EGG = register("evocador_oscuro_spawn_egg", properties -> new SpawnEggItem(PruebatfgModEntities.EVOCADOR_OSCURO.get(), properties));

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}