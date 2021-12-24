package com.petey.amplify.core;


import com.petey.amplify.entity.starfury.StarfuryStarEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

public class ModEntityTypes {
    public static final RegistryObject<EntityType<StarfuryStarEntity>> STARFURY_STAR = createEntity("starfury_star", EntityType.Builder.of(StarfuryStarEntity::new, EntityClassification.MISC).sized(1f,1f));

    private static <T extends Entity> RegistryObject<EntityType<T>> createEntity(String name, EntityType.Builder<T> builder) {
        return Registry.ENTITY_TYPES.register(name, () -> builder.build(new ResourceLocation(Amplify.MODID, name).toString()));
    }
}
