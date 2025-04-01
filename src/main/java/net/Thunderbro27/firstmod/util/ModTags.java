package net.Thunderbro27.firstmod.util;

import net.Thunderbro27.firstmod.MyFirstMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {


    public static class Blocks{
        public static final TagKey<Block> NEEDS_RUBY_TOOL = createTag("needs_ruby_tool");
        public static final TagKey<Block> INCORRECT_FOR_RUBY_TOOL = createTag("incorrect_for_ruby_tool");
        public static final TagKey<Block> NEEDS_GLOOBRITE_TOOL = createTag("needs_gloobrite_tool");
        public static final TagKey<Block> INCORRECT_FOR_GLOOBRITE_TOOL = createTag("incorrect_for_gloobrite_tool");
        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(MyFirstMod.MOD_ID, name));
        }
    }

    /*private static TagKey<Block> createTag(String name){
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath(MyFirstMod.MOD_ID, name));
    }*/
    public static class Items{
        public static final TagKey<Item> TRANS_ITEMS = createTag("trans_items");
        public static final TagKey<Item> RUBY_TOOL = createTag("heart_of_the_forge");

        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(MyFirstMod.MOD_ID, name));
        }
    }
}
