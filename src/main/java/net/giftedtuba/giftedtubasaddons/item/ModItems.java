package net.giftedtuba.giftedtubasaddons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.giftedtuba.giftedtubasaddons.GiftedTubasAddons;
import net.giftedtuba.giftedtubasaddons.entity.ModEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static software.bernie.example.registry.ItemRegistry.registerItem;

public class ModItems {
    public static final Item ENDERITE = registerItem("enderite", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabGroup(FabricItemGroupEntries entries) {
        entries.add(ENDERITE);
    }

    public static final Item CRAB_SPAWN_EGG = registerItem("crab_spawn_egg",
            new SpawnEggItem(ModEntities.CRAB, 0xD57E36, 0x1D0D00,
                    new FabricItemSettings()));

    public static final Item PENGUIN_SPAWN_EGG = registerItem("penguin_spawn_egg",
            new SpawnEggItem(ModEntities.PENGUIN, 0xD57E36, 0x1D0D00,
                    new FabricItemSettings()));

    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier("crab", "crab_spawn_egg"), CRAB_SPAWN_EGG);
        Registry.register(Registries.ITEM, new Identifier("penguin", "penguin_spawn_egg"), PENGUIN_SPAWN_EGG);
        // For versions above 1.19.3, replace ''Registry.ITEM'' with ''Registries.ITEM''.
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GiftedTubasAddons.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GiftedTubasAddons.LOGGER.info("Registering Mod Items for " + GiftedTubasAddons.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabGroup);
    }

}

