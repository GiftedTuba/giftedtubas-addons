package net.giftedtuba.giftedtubasaddons.item;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.giftedtuba.giftedtubasaddons.GiftedTubasAddons;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ENDERITE = registerItem("enderite", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GiftedTubasAddons.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GiftedTubasAddons.LOGGER.info("Registering Mod Items for " + GiftedTubasAddons.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ENDERITE);
        });
    }
}