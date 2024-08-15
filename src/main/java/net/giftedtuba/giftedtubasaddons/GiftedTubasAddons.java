package net.giftedtuba.giftedtubasaddons;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.giftedtuba.giftedtubasaddons.block.ModBlocks;
import net.giftedtuba.giftedtubasaddons.entity.ModEntities;
import net.giftedtuba.giftedtubasaddons.entity.custom.CrabEntity;
import net.giftedtuba.giftedtubasaddons.entity.custom.PenguinEntity;
import net.giftedtuba.giftedtubasaddons.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class GiftedTubasAddons implements ModInitializer {
	public static final String MOD_ID = "giftedtubas-addons";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		FabricDefaultAttributeRegistry.register(ModEntities.CRAB, CrabEntity.setAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.PENGUIN, PenguinEntity.setAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.ELEPHANT, PenguinEntity.setAttributes());

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		GeckoLib.initialize();


	}
}