/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pruebatfg.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.pruebatfg.block.RareWoodBlock;
import net.mcreator.pruebatfg.block.RareStairsBlock;
import net.mcreator.pruebatfg.block.RareSlabBlock;
import net.mcreator.pruebatfg.block.RarePressurePlateBlock;
import net.mcreator.pruebatfg.block.RarePlanksBlock;
import net.mcreator.pruebatfg.block.RareOreBlock;
import net.mcreator.pruebatfg.block.RareLogBlock;
import net.mcreator.pruebatfg.block.RareLeavesBlock;
import net.mcreator.pruebatfg.block.RareFenceGateBlock;
import net.mcreator.pruebatfg.block.RareFenceBlock;
import net.mcreator.pruebatfg.block.RareButtonBlock;
import net.mcreator.pruebatfg.block.RareBlockBlock;
import net.mcreator.pruebatfg.PruebatfgMod;

import java.util.function.Function;

public class PruebatfgModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(PruebatfgMod.MODID);
	public static final DeferredBlock<Block> RARE_ORE = register("rare_ore", RareOreBlock::new);
	public static final DeferredBlock<Block> RARE_BLOCK = register("rare_block", RareBlockBlock::new);
	public static final DeferredBlock<Block> RARE_LOG = register("rare_log", RareLogBlock::new);
	public static final DeferredBlock<Block> RARE_WOOD = register("rare_wood", RareWoodBlock::new);
	public static final DeferredBlock<Block> RARE_PLANKS = register("rare_planks", RarePlanksBlock::new);
	public static final DeferredBlock<Block> RARE_LEAVES = register("rare_leaves", RareLeavesBlock::new);
	public static final DeferredBlock<Block> RARE_STAIRS = register("rare_stairs", RareStairsBlock::new);
	public static final DeferredBlock<Block> RARE_SLAB = register("rare_slab", RareSlabBlock::new);
	public static final DeferredBlock<Block> RARE_FENCE = register("rare_fence", RareFenceBlock::new);
	public static final DeferredBlock<Block> RARE_FENCE_GATE = register("rare_fence_gate", RareFenceGateBlock::new);
	public static final DeferredBlock<Block> RARE_PRESSURE_PLATE = register("rare_pressure_plate", RarePressurePlateBlock::new);
	public static final DeferredBlock<Block> RARE_BUTTON = register("rare_button", RareButtonBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}