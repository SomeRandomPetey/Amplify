package com.petey.amplify.entity.starfury;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.ShulkerBulletModel;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;

public class StarfuryStarRenderer extends EntityRenderer<StarfuryStarEntity> {

    private static final ResourceLocation TEXTURE_LOCATION = new ResourceLocation("textures/entity/starfury_star.png");
    private static final RenderType RENDER_TYPE = RenderType.entityTranslucent(TEXTURE_LOCATION);
    private final ShulkerBulletModel<StarfuryStarEntity> model = new ShulkerBulletModel<>();


    public StarfuryStarRenderer(EntityRendererManager p_i46179_1_) {
        super(p_i46179_1_);
    }

    public int getBlockLightLevel(StarfuryStarEntity pEntity, BlockPos pPos) {
        return 15;
    }


    @Override
    public ResourceLocation getTextureLocation(StarfuryStarEntity pEntity) {
        return TEXTURE_LOCATION;
    }
}
