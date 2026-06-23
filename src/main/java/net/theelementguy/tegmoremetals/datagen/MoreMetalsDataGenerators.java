package net.theelementguy.tegmoremetals.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import com.github.theelementguy.tegmatlib.data.*;
import com.github.theelementguy.tegmatlib.trim.TEGMatLibTrimMaterialProvider;
import com.github.theelementguy.tegmatlib.worldgen.TEGMatLibBiomeModifierProvider;
import com.github.theelementguy.tegmatlib.worldgen.TEGMatLibConfiguredFeatureProvider;
import com.github.theelementguy.tegmatlib.worldgen.TEGMatLibPlacedFeatureProvider;
import net.theelementguy.tegmoremetals.MoreMetalsMod;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.theelementguy.tegmoremetals.MoreMetalsMod.MATERIAL_PROVIDER;

@EventBusSubscriber(modid = MoreMetalsMod.MOD_ID)
public class MoreMetalsDataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {

        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();

        generator.addProvider(true, new TEGMatLibItemModelProvider(event, MATERIAL_PROVIDER));
		generator.addProvider(true, new TEGMatLibBlockStateProvider(event, MATERIAL_PROVIDER));

        generator.addProvider(true, new TEGMatLibLanguageProvider(event, MATERIAL_PROVIDER));

        generator.addProvider(true, TEGMatLibBlockLootTableProvider.create(event, MATERIAL_PROVIDER));
        generator.addProvider(true, new TEGMatLibRecipeProvider(event, MATERIAL_PROVIDER));

        BlockTagsProvider blockTagsProvider = new TEGMatLibBlockTagProvider(event, MATERIAL_PROVIDER);
        generator.addProvider(true, blockTagsProvider);
        generator.addProvider(true, new TEGMatLibItemTagProvider(event, blockTagsProvider, MATERIAL_PROVIDER));
        generator.addProvider(true, new MoreMetalsBiomeTagsProvider(output, provider));

		TEGMatLibConfiguredFeatureProvider configuredFeatures = new TEGMatLibConfiguredFeatureProvider(MATERIAL_PROVIDER);
		TEGMatLibPlacedFeatureProvider placedFeatures = new TEGMatLibPlacedFeatureProvider(MATERIAL_PROVIDER);
		TEGMatLibBiomeModifierProvider biomeModifiers = new TEGMatLibBiomeModifierProvider(MATERIAL_PROVIDER);
		TEGMatLibTrimMaterialProvider trims = new TEGMatLibTrimMaterialProvider(MATERIAL_PROVIDER);

        generator.addProvider(true, new TEGMatLibDatapackProvider(event, MoreMetalsMod.MOD_ID, configuredFeatures, placedFeatures, biomeModifiers, trims));
		generator.addProvider(true, new TEGMatLibGlobalLootModifierProvider(event, MATERIAL_PROVIDER));
    }

}
