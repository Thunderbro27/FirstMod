package net.Thunderbro27.firstmod.item;

import net.Thunderbro27.firstmod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTier {


    public static final Tier RUBY = new ForgeTier(1400,10F,5F,14,
            ModTags.Blocks.NEEDS_RUBY_TOOL, () -> Ingredient.of(ModItems.RUBY.get()),
            ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL);
    public static final Tier GLOOBRITE = new ForgeTier(1400, 10F, 5F, 14,
            ModTags.Blocks.NEEDS_GLOOBRITE_TOOL, ()-> Ingredient.of(ModItems.GLOOBRITE.get()),
            ModTags.Blocks.INCORRECT_FOR_GLOOBRITE_TOOL);

}
