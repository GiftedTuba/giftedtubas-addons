package net.giftedtuba.giftedtubasaddons.entity.client;

import net.giftedtuba.giftedtubasaddons.GiftedTubasAddons;
import net.giftedtuba.giftedtubasaddons.entity.custom.ElephantEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class ElephantModel extends GeoModel<ElephantEntity> {
    public Identifier getModelResource(ElephantEntity animatable) {
        return Identifier.of(GiftedTubasAddons.MOD_ID, "geo/elephant.geo.json");
    }

    @Override
    public Identifier getTextureResource(ElephantEntity animatable) {
        return Identifier.of(GiftedTubasAddons.MOD_ID, "textures/entity/elephant.png");
    }

    @Override
    public Identifier getAnimationResource(ElephantEntity animatable) {
        return Identifier.of(GiftedTubasAddons.MOD_ID, "animations/elephant.animation.json");
    }


}
