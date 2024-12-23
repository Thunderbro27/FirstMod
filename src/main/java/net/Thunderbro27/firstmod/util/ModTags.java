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
        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(MyFirstMod.MOD_ID, name));
        }
    }


    public static class Items{
        public static final TagKey<Item> TRANS_ITEMS = createTag("trans_items");

        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(MyFirstMod.MOD_ID, name));
        }
    }
}
