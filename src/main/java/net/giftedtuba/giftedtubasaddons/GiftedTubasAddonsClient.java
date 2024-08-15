package net.giftedtuba.giftedtubasaddons;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.giftedtuba.giftedtubasaddons.entity.ModEntities;
import net.giftedtuba.giftedtubasaddons.entity.client.CrabRenderer;
import net.giftedtuba.giftedtubasaddons.entity.client.ElephantRenderer;
import net.giftedtuba.giftedtubasaddons.entity.client.PenguinRenderer;

public class GiftedTubasAddonsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.CRAB, CrabRenderer::new);
        EntityRendererRegistry.register(ModEntities.PENGUIN, PenguinRenderer::new);
        EntityRendererRegistry.register(ModEntities.ELEPHANT, ElephantRenderer::new);
    }
}
