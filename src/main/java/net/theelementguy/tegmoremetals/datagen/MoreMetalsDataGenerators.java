package net.theelementguy.tegmoremetals.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
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
import java.util.concurrent.CompletableFuture;

import static net.theelementguy.tegmoremetals.MoreMetalsMod.MATERIAL_PROVIDER;

@EventBusSubscriber(modid = MoreMetalsMod.MOD_ID)
public class MoreMetalsDataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {

        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> provider = event.getWorldLookupProvider();

		TEGMatLibDatapackHelper.run(event, MATERIAL_PROVIDER);

        generator.addProvider(true, new TEGMatLibModelProvider(event, MATERIAL_PROVIDER));

        generator.addProvider(true, new TEGMatLibEquipmentAssetProvider(event, MATERIAL_PROVIDER));

        generator.addProvider(true, new TEGMatLibLanguageProvider(event, MATERIAL_PROVIDER));

        BlockTagsProvider blockTagsProvider = new TEGMatLibBlockTagProvider(event, MATERIAL_PROVIDER);
        generator.addProvider(true, blockTagsProvider);
        generator.addProvider(true, new TEGMatLibItemTagProvider(event, MATERIAL_PROVIDER));
        generator.addProvider(true, new MoreMetalsBiomeTagsProvider(output, provider));

		generator.addProvider(true, new TEGMatLibGlobalLootModifierProvider(event, MATERIAL_PROVIDER));
    }

}
