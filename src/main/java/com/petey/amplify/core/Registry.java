package com.petey.amplify.core;

import com.petey.amplify.entity.starfury.StarfuryStarEntity;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Amplify.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Amplify.MODID);
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Amplify.MODID);

    public static final RegistryObject<EntityType<StarfuryStarEntity>> STARFURY_STAR =
            Registry.ENTITY_TYPES.register("starfury_star",
                    () -> EntityType.Builder.<StarfuryStarEntity>of(StarfuryStarEntity::new, EntityClassification.MISC)
                            .sized(1.0f,1.0f)
                            .build(new ResourceLocation(Amplify.MODID, "starfury_star").toString()));

//    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Amplify.MODID);
//    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Amplify.MODID);

    public static void register() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        ENTITY_TYPES.register(eventBus);
//        FLUIDS.register(eventBus);
//        TILE_ENTITES.register(eventBus);
        ModItems.init();
        ModBlocks.init();
    }
}

