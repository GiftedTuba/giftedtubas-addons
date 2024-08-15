package net.giftedtuba.giftedtubasaddons.entity.client;

import net.giftedtuba.giftedtubasaddons.GiftedTubasAddons;
import net.giftedtuba.giftedtubasaddons.entity.custom.CrabEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class CrabModel extends GeoModel<CrabEntity> {
    @Override
    public Identifier getModelResource(CrabEntity animatable) {
        return new Identifier(GiftedTubasAddons.MOD_ID, "geo/crab.geo.json");
    }

    @Override
    public Identifier getTextureResource(CrabEntity animatable) {
        return new Identifier(GiftedTubasAddons.MOD_ID, "textures/entity/crab.png");
    }

    @Override
    public Identifier getAnimationResource(CrabEntity animatable) {
        return new Identifier(GiftedTubasAddons.MOD_ID, "animations/crab.animation.json");
    }


}
