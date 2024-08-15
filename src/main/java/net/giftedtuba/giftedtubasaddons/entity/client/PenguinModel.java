package net.giftedtuba.giftedtubasaddons.entity.client;

import net.giftedtuba.giftedtubasaddons.GiftedTubasAddons;
import net.giftedtuba.giftedtubasaddons.entity.custom.CrabEntity;
import net.giftedtuba.giftedtubasaddons.entity.custom.PenguinEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class PenguinModel extends GeoModel<PenguinEntity> {
    @Override
    public Identifier getModelResource(PenguinEntity animatable) {
        return new Identifier(GiftedTubasAddons.MOD_ID, "geo/penguin.geo.json");
    }

    @Override
    public Identifier getTextureResource(PenguinEntity animatable) {
        return new Identifier(GiftedTubasAddons.MOD_ID, "textures/entity/penguin.png");
    }

    @Override
    public Identifier getAnimationResource(PenguinEntity animatable) {
        return new Identifier(GiftedTubasAddons.MOD_ID, "animations/penguin.animation.json");
    }


}
