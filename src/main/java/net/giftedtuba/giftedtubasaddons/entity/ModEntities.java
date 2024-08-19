package net.giftedtuba.giftedtubasaddons.entity;

import net.giftedtuba.giftedtubasaddons.GiftedTubasAddons;
import net.giftedtuba.giftedtubasaddons.entity.custom.CrabEntity;
import net.giftedtuba.giftedtubasaddons.entity.custom.ElephantEntity;
import net.giftedtuba.giftedtubasaddons.entity.custom.PenguinEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<CrabEntity> CRAB = Registry.register(
            Registries.ENTITY_TYPE, Identifier.of(GiftedTubasAddons.MOD_ID, "crab"),
            EntityType.Builder.<CrabEntity>create((type, world) -> new CrabEntity(type, world), SpawnGroup.MISC)
                    .dimensions(0.3f, 0.3f)
                    .maxTrackingRange(4)
                    .trackingTickInterval(1)
                    .build()
    );
    public static final EntityType<PenguinEntity> PENGUIN = Registry.register(
            Registries.ENTITY_TYPE, Identifier.of(GiftedTubasAddons.MOD_ID, "penguin"),
            EntityType.Builder.<PenguinEntity>create((type, world) -> new PenguinEntity(type, world), SpawnGroup.MISC)
                    .dimensions(0.3f, 0.3f)
                    .maxTrackingRange(4)
                    .trackingTickInterval(1)
                    .build()
    );
    public static final EntityType<ElephantEntity> ELEPHANT = Registry.register(
            Registries.ENTITY_TYPE, Identifier.of(GiftedTubasAddons.MOD_ID, "elephant"),
            EntityType.Builder.<ElephantEntity>create((type, world) -> new ElephantEntity(type, world), SpawnGroup.MISC)
                    .dimensions(0.3f, 0.3f)
                    .maxTrackingRange(4)
                    .trackingTickInterval(10)
                    .build()
    );

    public static void registerModEntities() {
        GiftedTubasAddons.LOGGER.info("Registering Entities for " + GiftedTubasAddons.MOD_ID);
    }
}


