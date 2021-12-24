package com.petey.amplify.core;


import com.petey.amplify.entity.starfury.StarfuryStarEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

public class ModEntityTypes {
    public static final RegistryObject<EntityType<StarfuryStarEntity>> STARFURY_STAR =
            Registry.ENTITY_TYPES.register("starfury_star",
                    () -> EntityType.Builder.<StarfuryStarEntity>of(StarfuryStarEntity::new, EntityClassification.MISC)
                            .sized(1.0f,1.0f)
                            .build(new ResourceLocation(Amplify.MODID, "starfury_star").toString()));
}
