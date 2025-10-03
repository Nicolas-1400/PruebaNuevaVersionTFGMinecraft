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
import net.mcreator.pruebatfg.block.PiedraLuminosaBenditaBlock;
import net.mcreator.pruebatfg.block.NubesBlock;
import net.mcreator.pruebatfg.block.CieloPortalBlock;
import net.mcreator.pruebatfg.PruebatfgMod;

import java.util.function.Function;

public class PruebatfgModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(PruebatfgMod.MODID);
	public static final DeferredBlock<Block> RARE_ORE = register("rare_ore", RareOreBlock::new);
	public static final DeferredBlock<Block> RARE_BLOCK = register("rare_block", RareBlockBlock::new);
	public static final DeferredBlock<Block> NUBES = register("nubes", NubesBlock::new);
	public static final DeferredBlock<Block> CIELO_PORTAL = register("cielo_portal", CieloPortalBlock::new);
	public static final DeferredBlock<Block> PIEDRA_LUMINOSA_BENDITA = register("piedra_luminosa_bendita", PiedraLuminosaBenditaBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}