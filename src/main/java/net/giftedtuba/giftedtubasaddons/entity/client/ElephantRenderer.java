package net.giftedtuba.giftedtubasaddons.entity.client;

import net.giftedtuba.giftedtubasaddons.GiftedTubasAddons;
import net.giftedtuba.giftedtubasaddons.entity.custom.ElephantEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class ElephantRenderer extends GeoEntityRenderer<ElephantEntity> {
    public ElephantRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new ElephantModel());
    }

    @Override
    public Identifier getTextureLocation(ElephantEntity animatable) {
        return Identifier.of(GiftedTubasAddons.MOD_ID, "textures/entity/elephant.png");
    }

    @Override
    public void render(ElephantEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }


}