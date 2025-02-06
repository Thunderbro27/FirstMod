package net.Thunderbro27.firstmod.item;

import net.Thunderbro27.firstmod.MyFirstMod;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;



public class ModArmorMaterials {


    public static final Holder<ArmorMaterial> RUBY_ARMOR_MATERIAL = register("ruby", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 15, 4f, 0.1f, () -> ModItems.RUBY.get(), SoundEvents.ARMOR_EQUIP_DIAMOND);

    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection,
                                                  int enchantability, float toughness, float knockbackResistance,
                                                  Supplier<Item> ingredientItem, Holder<SoundEvent> equipSound){
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(MyFirstMod.MOD_ID, name);
        Supplier<Ingredient> ingredint = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for(ArmorItem.Type type : ArmorItem.Type.values()){
            typeMap.put(type, typeProtection.get(type));
        }


        return Registry.registerForHolder(BuiltInRegistries.f_315942_, location,
                new ArmorMaterial(typeProtection, enchantability, equipSound, ingredint, layers, toughness, knockbackResistance));
    }
}

//f_315942_ is ARMOR_MATERIAL



