package net.mcreator.pruebatfg.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class RareShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2380, 16f, 0, 70, TagKey.create(Registries.ITEM, ResourceLocation.parse("pruebatfg:rare_shovel_repair_items")));

	public RareShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 19f, 11f, properties);
	}
}