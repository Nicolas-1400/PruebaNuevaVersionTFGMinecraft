package net.mcreator.pruebatfg.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

public class PiedraLuminosaBenditaAdditionalHarvestConditionProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		boolean found = false;
		boolean RotoConToqueDeSeda = false;
		RotoConToqueDeSeda = false;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SILK_TOUCH)) != 0) {
			RotoConToqueDeSeda = true;
		} else {
			RotoConToqueDeSeda = false;
		}
		return RotoConToqueDeSeda;
	}
}