package com.petey.amplify.core;


import com.petey.amplify.api.material.ModMaterials;
import com.petey.amplify.common.item.StarfuryItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Amplify.MODID);

    public static Item.Properties itemProperties() {
        return new Item.Properties().tab(Amplify.TAB);
    }
    static RegistryObject<Item> createItem(String name) {
        Item item = new Item(itemProperties());
        return ITEMS.register(name, () -> item);
    }
    static RegistryObject<Item> createItem(String name, Item.Properties properties) {
        Item item = new Item(properties);
        return ITEMS.register(name, () -> item);
    }
    static RegistryObject<Item> createItem(String name, Item item) {
        return ITEMS.register(name, () -> item);
    }


    public static final RegistryObject<Item>
        GLASS_SWORD = createItem("glass_sword", new SwordItem(ModMaterials.GLASS_SWORD, 0, -2.4f, itemProperties())),
        STARFURY = createItem("starfury", new StarfuryItem(ModMaterials.STARFURY, 0,-2.4f,itemProperties().rarity(Rarity.RARE))),
        NECTAR = createItem("nectar");


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
