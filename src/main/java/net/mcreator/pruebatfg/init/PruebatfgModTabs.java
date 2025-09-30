/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pruebatfg.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.pruebatfg.PruebatfgMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class PruebatfgModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PruebatfgMod.MODID);

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
			tabData.accept(PruebatfgModItems.BOOSTER_BOOTS_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(PruebatfgModItems.RARE_SWORD.get());
			tabData.accept(PruebatfgModItems.RARE_ARMOR_HELMET.get());
			tabData.accept(PruebatfgModItems.RARE_ARMOR_CHESTPLATE.get());
			tabData.accept(PruebatfgModItems.RARE_ARMOR_LEGGINGS.get());
			tabData.accept(PruebatfgModItems.RARE_ARMOR_BOOTS.get());
			tabData.accept(PruebatfgModItems.BOOSTER_BOOTS_BOOTS.get());
		}
	}
}