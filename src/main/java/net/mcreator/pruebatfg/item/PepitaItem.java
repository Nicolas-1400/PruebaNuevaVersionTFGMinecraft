package net.mcreator.pruebatfg.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PepitaItem extends Item {
	public PepitaItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}