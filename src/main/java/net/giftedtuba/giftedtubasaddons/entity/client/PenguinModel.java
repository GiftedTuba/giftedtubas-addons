package net.giftedtuba.giftedtubasaddons.entity.client;

import net.giftedtuba.giftedtubasaddons.GiftedTubasAddons;
import net.giftedtuba.giftedtubasaddons.entity.custom.PenguinEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class PenguinModel extends GeoModel<PenguinEntity> {
    @Override
    public Identifier getModelResource(PenguinEntity animatable) {
        return Identifier.of(GiftedTubasAddons.MOD_ID, "geo/penguin.geo.json");
    }

    @Override
    public Identifier getTextureResource(PenguinEntity animatable) {
        return Identifier.of(GiftedTubasAddons.MOD_ID, "textures/entity/penguin.png");
    }

    @Override
    public Identifier getAnimationResource(PenguinEntity animatable) {
        return Identifier.of(GiftedTubasAddons.MOD_ID, "animations/penguin.animation.json");
    }


}
