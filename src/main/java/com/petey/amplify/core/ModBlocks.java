package com.petey.amplify.core;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModBlocks {
    static RegistryObject<Block> createBlockItem(String name, Block block) {
        return Registry.BLOCKS.register(name, () -> block);
    }
    static RegistryObject<Block> createBlock(String name, Block block) {
        RegistryObject<Block> output = createBlockItem(name, block);
        Registry.ITEMS.register(name, () -> new BlockItem(output.get(), ModItems.itemProperties()));
        return output;
    }
    static RegistryObject<Block> createBlock(String name, AbstractBlock.Properties properties) {
        RegistryObject<Block> output = createBlockItem(name, new Block(properties));
        Registry.ITEMS.register(name, () -> new BlockItem(output.get(), ModItems.itemProperties()));
        return output;
    }
    static RegistryObject<Block> createBlock(String name, AbstractBlock.Properties properties, Item.Properties itemProperties) {
        RegistryObject<Block> output = createBlockItem(name, new Block(properties));
        Registry.ITEMS.register(name, () -> new BlockItem(output.get(), itemProperties));
        return output;
    }




    public static void init() {}
}
