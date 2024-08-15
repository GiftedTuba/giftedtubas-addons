package net.giftedtuba.giftedtubasaddons.entity.client;

import net.giftedtuba.giftedtubasaddons.GiftedTubasAddons;
import net.giftedtuba.giftedtubasaddons.entity.custom.ElephantEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class ElephantModel extends GeoModel<ElephantEntity> {
    @Override
    public Identifier getModelResource(ElephantEntity animatable) {
        return new Identifier(GiftedTubasAddons.MOD_ID, "geo/elephant.geo.json");
    }

    @Override
    public Identifier getTextureResource(ElephantEntity animatable) {
        return new Identifier(GiftedTubasAddons.MOD_ID, "textures/entity/elephant.png");
    }

    @Override
    public Identifier getAnimationResource(ElephantEntity animatable) {
        return new Identifier(GiftedTubasAddons.MOD_ID, "animations/elephant.animation.json");
    }


}
