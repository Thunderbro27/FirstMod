package net.Thunderbro27.firstmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties COCONUT = new FoodProperties.Builder().nutrition(3).saturationModifier(.25f)
            .m_38762_(new MobEffectInstance(MobEffects.DAMAGE_BOOST,400),0.20f).build();
    public static final FoodProperties STEAK_AND_FRIES = new FoodProperties.Builder().nutrition(13).saturationModifier(0.14f)
            .build();
    public static final FoodProperties COCONUT_WATER = new FoodProperties.Builder().nutrition(2).saturationModifier(0.02f)
            .build();

}
