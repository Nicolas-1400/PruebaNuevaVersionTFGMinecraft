/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pruebatfg.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.pruebatfg.block.RareTroncoBlock;
import net.mcreator.pruebatfg.block.RareOreBlock;
import net.mcreator.pruebatfg.block.RareHojasBlock;
import net.mcreator.pruebatfg.block.RareBlockBlock;
import net.mcreator.pruebatfg.PruebatfgMod;

import java.util.function.Function;

public class PruebatfgModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(PruebatfgMod.MODID);
	public static final DeferredBlock<Block> RARE_ORE = register("rare_ore", RareOreBlock::new);
	public static final DeferredBlock<Block> RARE_BLOCK = register("rare_block", RareBlockBlock::new);
	public static final DeferredBlock<Block> RARE_TRONCO = register("rare_tronco", RareTroncoBlock::new);
	public static final DeferredBlock<Block> RARE_HOJAS = register("rare_hojas", RareHojasBlock::new);
	public static final DeferredBlock<Block> RARA_TABLONES = register("rara_tablones", RaraTablonesBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}