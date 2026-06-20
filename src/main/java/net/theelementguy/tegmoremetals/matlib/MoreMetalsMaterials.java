package net.theelementguy.tegmoremetals.matlib;

import com.github.theelementguy.tegmatlib.loot.LootItemSlot;
import com.github.theelementguy.tegmatlib.loot.LootModifierType;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import com.github.theelementguy.tegmatlib.core.*;
import com.github.theelementguy.tegmatlib.core.tiers.MineabilityTier;
import com.github.theelementguy.tegmatlib.core.tiers.MiningTier;
import com.github.theelementguy.tegmatlib.worldgen.config.*;
import net.theelementguy.tegmoremetals.MoreMetalsMod;

import java.util.List;
import java.util.function.Supplier;

public class MoreMetalsMaterials implements FullyConfiguredMaterialHolder {

	private Supplier<MaterialConfiguration> TENUMBRUM = () -> new IronTypeBuilder().armorMaterial(34, 3, 8, 6, 3, 11, 11, () -> SoundEvents.ARMOR_EQUIP_IRON, 2f, 0f).baseName("tenumbrum").toolMaterial(1641, 8.5f, 3f, 16).smeltingExperience(1f).dropsPerOre(1).inGameName("Tenumbrum").blockProperties(() -> MapColor.TERRACOTTA_PURPLE, () -> SoundType.IRON).oreConfigSimpleWithExtra(OreGenConfig.smallAllBiomes(10, -60, OreDistribution.TRIANGLE, 1, 5, Dimension.OVERWORLD), OreGenConfig.rareLargeAllBiomes(-30, -60, OreDistribution.TRIANGLE, 6, 4, Dimension.OVERWORLD), OreGenConfig.extraWithBiome(36, -60, OreDistribution.TRIANGLE, 3, 4, Biomes.PALE_GARDEN)).modId("tegmoremetals").trimMaterialDescriptionColor("#1f1029").tier(MiningTier.DIAMOND).setBefore("diamond", "diamond", () -> Items.GOLD_INGOT, () -> Blocks.GOLD_BLOCK, "gold", "diamond").spearMaterial(1.05F, 1.075F, 0.5F, 3.0F, 7.5F, 6.5F, 5.1F, 10.0F, 4.6F).usingHorseArmor().animalArmorBefore("diamond").addLoot(LootItemSlot.HORSE_ARMOR, LootModifierType.EXTRA, "chests/simple_dungeon", 0.075f).addLoot(LootItemSlot.HORSE_ARMOR, LootModifierType.EXTRA, "chests/stronghold_library", 0.035f).addLoot(LootItemSlot.SWORD, LootModifierType.EXTRA, "chests/jungle_temple", 0.0987f).usingNautilusArmor().addLoot(LootItemSlot.NAUTILUS_ARMOR, LootModifierType.EXTRA, "chests/shipwreck_treasure", 0.011f).build();

	private Supplier<MaterialConfiguration> BLOODSTONE = () -> new DiamondTypeBuilder().armorMaterial(8, 1, 4, 3, 2, 3, 21, () -> SoundEvents.ARMOR_EQUIP_GENERIC, 0f, 0f).baseName("bloodstone").toolMaterial(99, 4.0f, 4.0f, 19).smeltingExperience(0.9f).dropsPerOre(1).inGameName("Bloodstone").blockProperties(() -> MapColor.COLOR_RED, () -> SoundType.STONE).oreConfigSimple(OreGenConfig.smallAllBiomes(56, -60, OreDistribution.TRIANGLE, 2, 100, Dimension.OVERWORLD), OreGenConfig.rareLargeAllBiomes(48, -48, OreDistribution.TRIANGLE, 6, 2, Dimension.OVERWORLD)).modId("tegmoremetals").trimMaterialDescriptionColor("#590a0a").tier(MiningTier.STONE, MineabilityTier.STONE).setBefore("stone", "chainmail", () -> Items.LAPIS_LAZULI, () -> Blocks.LAPIS_BLOCK, "lapis").spearMaterial(0.75F, 1.15F, 0.7F, 4.5F, 10.0F, 9.0F, 5.1F, 13.75F, 4.6F).usingHorseArmor().animalArmorBefore("leather").addLoot(LootItemSlot.HORSE_ARMOR, LootModifierType.EXTRA, "chests/simple_dungeon", 0.15f).addLoot(LootItemSlot.HORSE_ARMOR, LootModifierType.EXTRA, "chests/bastion_treasure", 0.193f).addLoot(LootItemSlot.NAUTILUS_ARMOR, LootModifierType.EXTRA, "chests/shipwreck_treasure", 0.046f).usingNautilusArmor().build();

	private Supplier<MaterialConfiguration> CUBIC_ZIRCONIA = () -> new CubicZirconiaTypeBuilder().armorMaterial(39, 2, 6, 5, 2, 5, 14, () -> SoundEvents.ARMOR_EQUIP_DIAMOND).blockProperties(() -> MapColor.COLOR_PINK, () -> SoundType.METAL).toolMaterial(2501, 7f, 2f, 14).baseName("cubic_zirconia").defaultProperties(() -> new Item.Properties().fireResistant()).modId("tegmoremetals").trimMaterialDescriptionColor("#ebcacb").dropsPerOre(1).inGameName("Cubic Zirconia").setBefore("iron", "iron", () -> Items.NETHERITE_INGOT, () -> Blocks.EMERALD_BLOCK, "tenumbrum", "iron").tier(MiningTier.IRON).smeltingExperience(1f).oreConfigNoExtra(OreGenConfig.smallAllBiomes(48, -32, OreDistribution.TRIANGLE, 2, 8, Dimension.OVERWORLD, 0.5f), OreGenConfig.mediumAllBiomes(-48, 16, OreDistribution.TRIANGLE, 9, 2, Dimension.OVERWORLD, 0.5f), OreGenConfig.rareLargeAllBiomes(0, -48, OreDistribution.TRIANGLE, 16, 8, Dimension.OVERWORLD, 0.7f)).spearMaterial(0.95F, 0.95F, 0.6F, 2.5F, 8.0F, 6.75F, 5.1F, 11.25F, 4.6F).usingHorseArmor().animalArmorBefore("iron").addLoot(LootItemSlot.HORSE_ARMOR, LootModifierType.EXTRA, "chests/simple_dungeon", 0.115f).addLoot(LootItemSlot.HORSE_ARMOR, LootModifierType.EXTRA, "chests/simple_dungeon", 0.075f).addLoot(LootItemSlot.BASE, LootModifierType.EXTRA, "chests/ruined_portal", 0.175f).usingNautilusArmor().addLoot(LootItemSlot.NAUTILUS_ARMOR, LootModifierType.EXTRA, "chests/shipwreck_treasure", 0.033f).build();

	private Supplier<MaterialConfiguration> RUBIDIUM = () -> new NetherDiamondTypeBuilder().armorMaterial(35, 3, 8, 6, 3, 10, 15, () -> SoundEvents.ARMOR_EQUIP_DIAMOND, 1f, 0f).baseName("rubidium").toolMaterial(1831, 12.0f, 3.0f, 17).smeltingExperience(1.1f).dropsPerOre(1).inGameName("Rubidium").blockProperties(() -> MapColor.COLOR_RED, () -> SoundType.METAL).oreConfigSimple(OreGenConfig.smallAllBiomes(56, 20, OreDistribution.UNIFORM, 1, 4, Dimension.NETHER), OreGenConfig.rareLargeAllBiomes(46, 30, OreDistribution.UNIFORM, 4, 1, Dimension.NETHER)).modId("tegmoremetals").trimMaterialDescriptionColor("#fa89a2").tier(MiningTier.NETHERITE).setBefore("netherite", "netherite", () -> Items.EMERALD, () -> Blocks.EMERALD_BLOCK, "quartz").spearMaterial(1.1F, 1.15F, 0.3F, 2.5F, 7.0F, 5.5F, 5.1F, 8.75F, 4.6F).usingHorseArmor().animalArmorBefore("netherite").addLoot(LootItemSlot.HORSE_ARMOR, LootModifierType.EXTRA, "chests/nether_bridge", 0.075f).addLoot(LootItemSlot.HELMET, LootModifierType.EXTRA, "chests/ruined_portal", 0.0555f).usingNautilusArmor().addLoot(LootItemSlot.NAUTILUS_ARMOR, LootModifierType.EXTRA, "chests/buried_treasure", 0.005f).build();

	private Supplier<MaterialConfiguration> STARSHARD = () -> new EndDiamondTypeBuilder().armorMaterial(41, 4, 8, 6, 4, 12, 13, () -> SoundEvents.ARMOR_EQUIP_DIAMOND, 1f, 0f).toolMaterial(3001, 15f, 5f, 13).baseName("starshard").inGameName("Starshard").dropsPerOre(1).smeltingExperience(1.3f).modId("tegmoremetals").tier(MiningTier.BEYOND_NETHERITE).blockProperties(() -> MapColor.COLOR_GREEN, () -> SoundType.AMETHYST).setBefore("rubidium", "rubidium", () -> RUBIDIUM.get().getBaseItem(), () -> RUBIDIUM.get().getBaseBlock(), "ancient_debris").oreConfigSimple(OreGenConfig.smallAllBiomes(80, -64, OreDistribution.UNIFORM, 1, 20, Dimension.END), OreGenConfig.largeAllBiomes(80, -64, OreDistribution.UNIFORM, 3, 5, Dimension.END)).spearMaterial(1.25F, 1.3F, 0.3F, 2F, 6.5F, 5F, 5.1F, 8F, 4.6F).trimMaterialDescriptionColor("#7fe9f5").usingHorseArmor().animalArmorBefore("rubidium").addLoot(LootItemSlot.HORSE_ARMOR, LootModifierType.EXTRA, "chests/end_city_treasure", 0.038f).addLoot(LootItemSlot.AXE, LootModifierType.ADD, "chests/trial_chambers/reward_ominous_rare", 0.075f).usingNautilusArmor().addLoot(LootItemSlot.NAUTILUS_ARMOR, LootModifierType.EXTRA, "chests/shipwreck_treasure", 0.0011f).build();

	private Supplier<MaterialConfiguration> AQUAMARINE = () -> new SandDiamondTypeBuilder().armorMaterial(13, 3, 6, 6, 2, 6, 15, () -> SoundEvents.ARMOR_EQUIP_DIAMOND, 0f, 0f).toolMaterial(276, 5.5f, 3f, 15).baseName("aquamarine").inGameName("Aquamarine").dropsPerOre(1).smeltingExperience(0.5f).modId("tegmoremetals").tier(MiningTier.IRON).blockProperties(() -> MapColor.DIAMOND, () -> SoundType.METAL).setBefore("cubic_zirconia", "cubic_zirconia", () -> CUBIC_ZIRCONIA.get().getBaseItem(), () -> CUBIC_ZIRCONIA.get().getBaseBlock(), "deepslate_tenumbrum_ore").oreConfigSimple(OreGenConfig.smallAllBiomes(53, 34, OreDistribution.TRIANGLE, 1, 10, Dimension.OVERWORLD), OreGenConfig.largeAllBiomes(40, 30, OreDistribution.UNIFORM, 5, 2, Dimension.OVERWORLD)).spearMaterial(0.95F, 0.95F, 0.6F, 2.5F, 11.0F, 6.75F, 5.1F, 11.25F, 4.6F).trimMaterialDescriptionColor("#6666ff").usingHorseArmor().animalArmorBefore("cubic_zirconia").usingNautilusArmor().addLoot(LootItemSlot.HORSE_ARMOR, LootModifierType.EXTRA, "chests/underwater_ruin_big", 0.09f).addLoot(LootItemSlot.NAUTILUS_ARMOR, LootModifierType.EXTRA, "chests/shipwreck_treasure", 0.07f).addModelException("aquamarine_block", TexturedModel.COLUMN).build();

	public List<Supplier<MaterialConfiguration>> MATERIALS = List.of(TENUMBRUM, BLOODSTONE, CUBIC_ZIRCONIA, RUBIDIUM, STARSHARD, AQUAMARINE);

	@Override
	public void setMaterialConfiguration(List<Supplier<MaterialConfiguration>> material) {
		MATERIALS = material;
		TENUMBRUM = material.get(0);
		BLOODSTONE = material.get(1);
		CUBIC_ZIRCONIA = material.get(2);
		RUBIDIUM = material.get(3);
		STARSHARD = material.get(4);
		AQUAMARINE = material.get(5);
	}

	public List<MaterialConfiguration> getMaterials() {
		return MATERIALS.stream().map(Supplier::get).toList();
	}

	@Override
	public String getModID() {
		return MoreMetalsMod.MOD_ID;
	}

}