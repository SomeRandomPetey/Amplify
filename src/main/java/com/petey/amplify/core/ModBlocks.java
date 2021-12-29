package com.petey.amplify.core;

import com.petey.amplify.common.block.NectarCropBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Amplify.MODID);


    public static final RegistryObject<Block>
            NECTAR = BLOCKS.register("nectar_crop", () -> new NectarCropBlock(AbstractBlock.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Item>
            NECTAR_SEEDS = ModItems.ITEMS.register("nectar_seeds", () -> new BlockItem(ModBlocks.NECTAR.get(), ModItems.itemProperties()));




    static RegistryObject<Block> createBlockItem(String name, Block block) {
        return BLOCKS.register(name, () -> block);
    }
    static RegistryObject<Block> createBlock(String name, Block block) {
        RegistryObject<Block> output = createBlockItem(name, block);
        ModItems.ITEMS.register(name, () -> new BlockItem(output.get(), ModItems.itemProperties()));
        return output;
    }
    static RegistryObject<Block> createBlock(String name, AbstractBlock.Properties properties) {
        RegistryObject<Block> output = createBlockItem(name, new Block(properties));
        ModItems.ITEMS.register(name, () -> new BlockItem(output.get(), ModItems.itemProperties()));
        return output;
    }
    static RegistryObject<Block> createBlock(String name, AbstractBlock.Properties properties, Item.Properties itemProperties) {
        RegistryObject<Block> output = createBlockItem(name, new Block(properties));
        ModItems.ITEMS.register(name, () -> new BlockItem(output.get(), itemProperties));
        return output;
    }




    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
