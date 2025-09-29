package net.mcreator.pruebatfg.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class RareSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2380, 16f, 0, 70, TagKey.create(Registries.ITEM, ResourceLocation.parse("pruebatfg:rare_sword_repair_items")));

	public RareSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 19f, 11f, properties);
	}
}