package net.giftedtuba.giftedtubasaddons.block;
import net.giftedtuba.giftedtubasaddons.GiftedTubasAddons;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModBlocks {
    public static final Block ENDERITE_BLOCK = registerBlock("enderite_block",
            new Block(Block.Settings.create().strength(4.0f)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(GiftedTubasAddons.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(GiftedTubasAddons.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        GiftedTubasAddons.LOGGER.info("Registering ModBlocks for " + GiftedTubasAddons.MOD_ID);
    }
}
