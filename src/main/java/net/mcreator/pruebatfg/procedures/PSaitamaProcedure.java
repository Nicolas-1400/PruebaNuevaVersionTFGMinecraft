package net.mcreator.pruebatfg.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PSaitamaProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingDamageEvent.Post event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getSource(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, DamageSource damagesource, Entity entity) {
		execute(null, world, damagesource, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, DamageSource damagesource, Entity entity) {
		if (damagesource == null || entity == null)
			return;
		ItemStack emeralds = ItemStack.EMPTY;
		ItemStack tool = ItemStack.EMPTY;
		double enchant_levels = 0;
		double fromZ = 0;
		double fromX = 0;
		double fromY = 0;
		double energy = 0;
		double speed = 0;
		double Yaw = 0;
		Entity Atacante = null;
		Entity Atacado = null;
		if (damagesource.is(DamageTypes.PLAYER_ATTACK)) {
			Atacante = damagesource.getDirectEntity();
			if ((Atacante instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.WOODEN_SWORD && (Atacante instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
					.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("pruebatfg:saitama")))) > 0) {
				speed = 2;
				Yaw = entity.getYRot();
				entity.setDeltaMovement(new Vec3((speed * Math.cos((Yaw + 90) * (Math.PI / 180))), (entity.getDeltaMovement().y() + speed / 2), (speed * Math.sin((Yaw + 90) * (Math.PI / 180)))));
			}
		}
	}
}