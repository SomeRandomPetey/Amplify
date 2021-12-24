package com.petey.amplify.client.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.petey.amplify.client.entity.model.StarfuryStarModel;
import com.petey.amplify.entity.starfury.StarfuryStarEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.ShulkerBulletModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;

public class StarfuryStarRenderer extends EntityRenderer<StarfuryStarEntity> {

    private static final ResourceLocation TEXTURE_LOCATION = new ResourceLocation("textures/entity/starfury_star.png");
    private final StarfuryStarModel<StarfuryStarEntity> model = new StarfuryStarModel<>();


    public StarfuryStarRenderer(EntityRendererManager erm) {
        super(erm);
    }

    @Override
    public void render(StarfuryStarEntity entity, float entityYaw, float partialTicks, MatrixStack matrix, IRenderTypeBuffer buffer, int packedLight) {
        matrix.pushPose();
        //Do something
        matrix.popPose();
        super.render(entity, entityYaw, partialTicks, matrix, buffer, packedLight);
    }

    public int getBlockLightLevel(StarfuryStarEntity pEntity, BlockPos pPos) {
        return 15;
    }


    @Override
    public ResourceLocation getTextureLocation(StarfuryStarEntity pEntity) {
        return TEXTURE_LOCATION;
    }
}
