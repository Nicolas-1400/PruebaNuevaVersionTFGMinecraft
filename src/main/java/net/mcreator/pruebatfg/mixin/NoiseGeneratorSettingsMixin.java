package net.mcreator.pruebatfg.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.pruebatfg.init.PruebatfgModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements PruebatfgModBiomes.PruebatfgModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> pruebatfg_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.pruebatfg_dimensionTypeReference != null) {
			retval = PruebatfgModBiomes.adaptSurfaceRule(retval, this.pruebatfg_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setpruebatfgDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.pruebatfg_dimensionTypeReference = dimensionType;
	}
}