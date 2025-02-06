package net.Thunderbro27.firstmod.datagen;

import net.Thunderbro27.firstmod.MyFirstMod;
import net.Thunderbro27.firstmod.block.ModBlocks;
import net.Thunderbro27.firstmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MinecartItem;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void m_245200_(RecipeOutput p_297267_) {

        List<ItemLike> RUBY_SMELTABLES = List.of(ModBlocks.RUBY_ORE.get(),
                ModBlocks.RUBY_DEEPSLATE_ORE.get());

        oreSmelting(p_297267_, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY.get(),
                0.25f,  200, "ruby");
        oreBlasting(p_297267_, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY.get(),
                0.25f,  100, "ruby");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RUBY.get())
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(p_297267_);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBY.get(), 9)
                .requires(ModBlocks.RUBY_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RUBY_BLOCK.get()), has(ModBlocks.RUBY_BLOCK.get()))
                .save(p_297267_);


        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RUBY_CHISEL.get())
                .pattern("  A")
                .pattern(" / ")
                .define('A', ModItems.RUBY.get())
                .define('/', Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY_CHISEL.get()))
                .save(p_297267_);


        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RUBY_PICK.get())
                .pattern("AAA")
                .pattern(" / ")
                .pattern(" / ")
                .define('A', ModItems.RUBY.get())
                .define('/', Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY_PICK.get()))
                .save(p_297267_);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RUBY_SWORD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" / ")
                .define('A', ModItems.RUBY.get())
                .define('/', Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY_SWORD.get()))
                .save(p_297267_);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RUBY_AXE.get())
                .pattern("AA ")
                .pattern("A/ ")
                .pattern(" / ")
                .define('A', ModItems.RUBY.get())
                .define('/', Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY_AXE.get()))
                .save(p_297267_);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RUBY_SHOVEL.get())
                .pattern(" A ")
                .pattern(" / ")
                .pattern(" / ")
                .define('A', ModItems.RUBY.get())
                .define('/', Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY_SHOVEL.get()))
                .save(p_297267_);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RUBY_HOE.get())
                .pattern("AA ")
                .pattern(" / ")
                .pattern(" / ")
                .define('A', ModItems.RUBY.get())
                .define('/', Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY_HOE.get()))
                .save(p_297267_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CONVERTER.get())
                .pattern("AAA")
                .pattern("AEA")
                .pattern("AAA")
                .define('A', ModItems.RUBY.get())
                .define('E', Items.ENDER_EYE)
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModBlocks.CONVERTER.get()))
                .save(p_297267_);



        stairBuilder(ModBlocks.RUBY_STAIRS.get(), Ingredient.of(ModItems.RUBY.get())).group("ruby")
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(p_297267_);

        slab(p_297267_, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_SLABS.get(), ModItems.RUBY.get());

        fenceBuilder(ModBlocks.RUBY_FENCE.get(),Ingredient.of(ModItems.RUBY.get())).group("ruby")
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(p_297267_);

        fenceGateBuilder(ModBlocks.RUBY_FENCE_GATE.get(),Ingredient.of(ModItems.RUBY.get())).group("ruby")
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(p_297267_);

        wallBuilder( RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_WALLS.get(), Ingredient.of(ModItems.RUBY.get()));

    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingItem, String pGroup){
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients,pCategory,
                pResult, pExperience, pCookingItem, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingItem, String pGroup){
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory,
                pResult, pExperience, pCookingItem, pGroup, "_from_blasting");
    }


    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer,AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                                                       float pExperience, int pCookingTime, String pGroup, String pRecipeName){
            for(ItemLike itemLike: pIngredients ){
                SimpleCookingRecipeBuilder.generic(Ingredient.of(itemLike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer,factory).group(pGroup)
                        .unlockedBy(getHasName(itemLike), has(itemLike))
                        .save(recipeOutput, MyFirstMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemLike));
            }

    }

}
