/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pruebatfg.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.pruebatfg.item.RareSwordItem;
import net.mcreator.pruebatfg.item.RareShovelItem;
import net.mcreator.pruebatfg.item.RarePickaxeItem;
import net.mcreator.pruebatfg.item.RareIngotItem;
import net.mcreator.pruebatfg.item.RareHoeItem;
import net.mcreator.pruebatfg.item.RareAxeItem;
import net.mcreator.pruebatfg.item.RareArmorItem;
import net.mcreator.pruebatfg.item.PepitaItem;
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
	public static final DeferredItem<Item> RARE_LOG = block(PruebatfgModBlocks.RARE_LOG);
	public static final DeferredItem<Item> RARE_WOOD = block(PruebatfgModBlocks.RARE_WOOD);
	public static final DeferredItem<Item> RARE_PLANKS = block(PruebatfgModBlocks.RARE_PLANKS);
	public static final DeferredItem<Item> RARE_LEAVES = block(PruebatfgModBlocks.RARE_LEAVES);
	public static final DeferredItem<Item> RARE_STAIRS = block(PruebatfgModBlocks.RARE_STAIRS);
	public static final DeferredItem<Item> RARE_SLAB = block(PruebatfgModBlocks.RARE_SLAB);
	public static final DeferredItem<Item> RARE_FENCE = block(PruebatfgModBlocks.RARE_FENCE);
	public static final DeferredItem<Item> RARE_FENCE_GATE = block(PruebatfgModBlocks.RARE_FENCE_GATE);
	public static final DeferredItem<Item> RARE_PRESSURE_PLATE = block(PruebatfgModBlocks.RARE_PRESSURE_PLATE);
	public static final DeferredItem<Item> RARE_BUTTON = block(PruebatfgModBlocks.RARE_BUTTON);
	public static final DeferredItem<Item> RARE_GRASS = block(PruebatfgModBlocks.RARE_GRASS);
	public static final DeferredItem<Item> RARE_DIRT = block(PruebatfgModBlocks.RARE_DIRT);

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