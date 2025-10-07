/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pruebatfg.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.pruebatfg.PruebatfgMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class PruebatfgModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PruebatfgMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MOD_CIELO = REGISTRY.register("mod_cielo",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.pruebatfg.mod_cielo")).icon(() -> new ItemStack(PruebatfgModBlocks.PIEDRA_LUMINOSA_BENDITA.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PruebatfgModBlocks.NUBES.get().asItem());
				tabData.accept(PruebatfgModItems.CIELO.get());
				tabData.accept(PruebatfgModBlocks.PIEDRA_LUMINOSA_BENDITA.get().asItem());
				tabData.accept(PruebatfgModItems.POLVO_DE_PIEDRA_LUMINOSA_BENDITA.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(PruebatfgModItems.RARE_INGOT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(PruebatfgModBlocks.RARE_ORE.get().asItem());
			tabData.accept(PruebatfgModBlocks.RARE_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(PruebatfgModItems.RARE_PICKAXE.get());
			tabData.accept(PruebatfgModItems.RARE_AXE.get());
			tabData.accept(PruebatfgModItems.RARE_SHOVEL.get());
			tabData.accept(PruebatfgModItems.RARE_HOE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(PruebatfgModItems.RARE_SWORD.get());
			tabData.accept(PruebatfgModItems.RARE_ARMOR_HELMET.get());
			tabData.accept(PruebatfgModItems.RARE_ARMOR_CHESTPLATE.get());
			tabData.accept(PruebatfgModItems.RARE_ARMOR_LEGGINGS.get());
			tabData.accept(PruebatfgModItems.RARE_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(PruebatfgModItems.EVOCADOR_OSCURO_SPAWN_EGG.get());
		}
	}
}