package net.theelementguy.tegmoremetals.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.world.level.biome.Biomes;
import net.theelementguy.tegmoremetals.MoreMetalsMod;
import net.theelementguy.tegmoremetals.util.MoreMetalsTags;

import java.util.concurrent.CompletableFuture;

public class MoreMetalsBiomeTagsProvider extends BiomeTagsProvider {
    public MoreMetalsBiomeTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected void addTags(HolderLookup.Provider p_256485_) {
        tag(MoreMetalsTags.Biomes.IS_END_AND_NOT_MAIN_ISLAND).add(Biomes.END_MIDLANDS).add(Biomes.END_HIGHLANDS).add(Biomes.END_BARRENS).add(Biomes.SMALL_END_ISLANDS);
    }
}
