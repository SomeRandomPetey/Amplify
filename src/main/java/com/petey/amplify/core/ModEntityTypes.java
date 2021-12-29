package com.petey.amplify.core;


import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Amplify.MODID);
//    public static final RegistryObject<EntityType<StarfuryStarEntity>> STARFURY_STAR =
//            Registry.ENTITY_TYPES.register("starfury_star",
//                    () -> EntityType.Builder.<StarfuryStarEntity>of(StarfuryStarEntity::new, EntityClassification.MISC)
//                            .sized(1.0f,1.0f)
//                            .build(new ResourceLocation(Amplify.MODID, "starfury_star").toString()));


    public static void register() {
        ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
