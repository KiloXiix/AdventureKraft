package com.devmaster.dangerzone.client.renderer;



import com.devmaster.dangerzone.client.model.KrakenModel;
import com.devmaster.dangerzone.entities.KrakenEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;



public class KrakenRenderer extends MobRenderer<KrakenEntity, KrakenModel<KrakenEntity>> {
    public KrakenRenderer(EntityRendererProvider.Context context) {
        super(context, new KrakenModel<KrakenEntity>(context.bakeLayer(KrakenModel.LAYER_LOCATION)), 1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(KrakenEntity entity) {
        return new ResourceLocation("dangerzone:textures/entities/kraken.png");
    }

    @Override
    protected void scale(KrakenEntity entity, PoseStack poseStack, float partialTickTime) {
        poseStack.translate(0, -8.0, 0); // Shift hitbox down by 8 blocks
    }
}
