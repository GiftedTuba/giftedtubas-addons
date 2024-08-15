package net.giftedtuba.giftedtubasaddons.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.giftedtuba.giftedtubasaddons.GiftedTubasAddons;
import net.giftedtuba.giftedtubasaddons.entity.custom.CrabEntity;
import net.giftedtuba.giftedtubasaddons.entity.custom.ElephantEntity;
import net.giftedtuba.giftedtubasaddons.entity.custom.PenguinEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<PenguinEntity> PENGUIN = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(GiftedTubasAddons.MOD_ID, "penguin"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, PenguinEntity::new)
                    .dimensions(EntityDimensions.fixed(1.5f, 1.75f)).build());

    public static final EntityType<CrabEntity> CRAB = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(GiftedTubasAddons.MOD_ID, "crab"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CrabEntity::new)
                    .dimensions(EntityDimensions.fixed(1.5f, 1.75f)).build());

    public static final EntityType<ElephantEntity> ELEPHANT = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(GiftedTubasAddons.MOD_ID, "elephant"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ElephantEntity::new)
                    .dimensions(EntityDimensions.fixed(1.5f, 1.75f)).build());


}


