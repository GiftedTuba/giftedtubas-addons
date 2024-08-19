package net.giftedtuba.giftedtubasaddons.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.giftedtuba.giftedtubasaddons.block.ModBlocks;
import net.giftedtuba.giftedtubasaddons.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENDERITE_BLOCK, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.ENDERITE)
                .criterion(hasItem(ModItems.ENDERITE), conditionsFromItem(ModItems.ENDERITE))
                .criterion(hasItem(ModBlocks.ENDERITE_BLOCK), conditionsFromItem(ModBlocks.ENDERITE_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.ENDERITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDERITE)
                .input(ModBlocks.ENDERITE_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.ENDERITE),
                FabricRecipeProvider.conditionsFromItem(ModItems.ENDERITE)).criterion(FabricRecipeProvider.hasItem(ModBlocks.ENDERITE_BLOCK),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.ENDERITE_BLOCK)).offerTo(exporter);

    }
}
