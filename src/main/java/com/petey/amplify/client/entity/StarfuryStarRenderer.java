package com.petey.amplify.client.entity;

import com.petey.amplify.entity.starfury.StarfuryStarEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.ShulkerBulletModel;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;

public class StarfuryStarRenderer extends EntityRenderer<StarfuryStarEntity> {

    private static final ResourceLocation TEXTURE_LOCATION = new ResourceLocation("textures/entity/starfury_star.png");
    private final ShulkerBulletModel<StarfuryStarEntity> MODEL = new ShulkerBulletModel<>();


    public StarfuryStarRenderer(EntityRendererManager erm) {
        super(erm);
    }

    public int getBlockLightLevel(StarfuryStarEntity pEntity, BlockPos pPos) {
        return 15;
    }


    @Override
    public ResourceLocation getTextureLocation(StarfuryStarEntity pEntity) {
        return TEXTURE_LOCATION;
    }
}
