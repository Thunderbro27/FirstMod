package net.Thunderbro27.firstmod.datagen;

import net.Thunderbro27.firstmod.MyFirstMod;
import net.Thunderbro27.firstmod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MyFirstMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.RUBY_DEEPSLATE_ORE.get())
                .add(ModBlocks.CONVERTER.get());

    tag(BlockTags.NEEDS_DIAMOND_TOOL)
            .add(ModBlocks.RUBY_ORE.get())
            .add(ModBlocks.RUBY_DEEPSLATE_ORE.get());
    }
}
