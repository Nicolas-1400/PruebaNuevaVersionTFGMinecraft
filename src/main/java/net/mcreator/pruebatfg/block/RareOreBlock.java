package net.mcreator.pruebatfg.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class RareOreBlock extends Block {
	public RareOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(15f, 18.1194915919f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}