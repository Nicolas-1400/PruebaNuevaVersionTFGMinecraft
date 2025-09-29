/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pruebatfg.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.pruebatfg.block.RareOreBlock;
import net.mcreator.pruebatfg.block.RareBlockBlock;
import net.mcreator.pruebatfg.PruebatfgMod;

import java.util.function.Function;

public class PruebatfgModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(PruebatfgMod.MODID);
	public static final DeferredBlock<Block> RARE_ORE = register("rare_ore", RareOreBlock::new);
	public static final DeferredBlock<Block> RARE_BLOCK = register("rare_block", RareBlockBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}