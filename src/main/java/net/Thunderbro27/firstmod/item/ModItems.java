package net.Thunderbro27.firstmod.item;

import net.Thunderbro27.firstmod.MyFirstMod;
import net.Thunderbro27.firstmod.item.custom.ChiselItem;
import net.Thunderbro27.firstmod.item.custom.CoconutWaterItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MyFirstMod.MOD_ID);

    public static final RegistryObject<Item> ROCK = ITEMS.register("rock",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY_PICK = ITEMS.register("ruby_pick",
            () -> new Item(new Item.Properties().durability(40)));

    public static final RegistryObject<Item> RUBY_CHISEL = ITEMS.register("ruby_chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));

    public static final RegistryObject<Item> COCONUT = ITEMS.register("coconut",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COCONUT)));

    public static final RegistryObject<Item> STEAK_AND_FRIES = ITEMS.register("steak_and_fries",
            () -> new Item(new Item.Properties().food(ModFoodProperties.STEAK_AND_FRIES)));

    public static final RegistryObject<Item> COCONUT_WATER = ITEMS.register("coconut_water",
            () -> new CoconutWaterItem(new Item.Properties().food(ModFoodProperties.COCONUT_WATER)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
