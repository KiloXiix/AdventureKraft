package com.devmaster.dangerzone.util;

import com.devmaster.dangerzone.blocks.ABlock;
import com.devmaster.dangerzone.configs.DZConfig;
import com.devmaster.dangerzone.entities.*;
import com.devmaster.dangerzone.client.model.*;
import com.devmaster.dangerzone.client.renderer.*;
import com.devmaster.dangerzone.items.*;
import com.devmaster.dangerzone.misc.DangerZone;
import net.minecraft.core.registries.Registries;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;
import java.util.List;

@Mod.EventBusSubscriber(modid = DangerZone.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {

    // === Deferred Registers ===
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DangerZone.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DangerZone.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DangerZone.MOD_ID);
    public static final DeferredRegister<EntityType<?>> MOBS = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DangerZone.MOD_ID);


    // === Mobs ===
    public static final RegistryObject<EntityType<KrakenEntity>> KRAKEN = MOBS.register("kraken",
            () -> EntityType.Builder.<KrakenEntity>of(KrakenEntity::new, MobCategory.MONSTER)
                    .setShouldReceiveVelocityUpdates(true)
                    .setTrackingRange(64)
                    .setUpdateInterval(3)
                    .sized(3f, 15f)
                    .build("kraken"));


    // === Mob Inits Used When Defining Spawn Placements ===
    @SubscribeEvent
    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            KrakenEntity.init();
        });
    }


    // === Mob Attribute Creation ===
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(KRAKEN.get(), KrakenEntity.createAttributes().build());
    }


    // === Mob Renderers ===
    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {

        event.registerEntityRenderer(RegistryHandler.KRAKEN.get(),
                KrakenRenderer::new);
    }


    // === Mob Layer Definitions ===
    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(KrakenModel.LAYER_LOCATION, KrakenModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(RegistryHandler.KRAKEN.get(), KrakenRenderer::new);
    }


    // === Spawn Egg Items
    public static final RegistryObject<Item> KRAKEN_SPAWN_EGG = ITEMS.register("kraken_spawn_egg", () -> new ForgeSpawnEggItem(RegistryHandler.KRAKEN, -1, -1, new Item.Properties()));



    // === Blocks ===
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () -> new ABlock("ruby_block", Block.Properties.of().strength(3.0F, 3.0F).sound(SoundType.METAL).requiresCorrectToolForDrops(), 0).addInfo("§cTemp Tooltip For Now§c"));



    // === Regular Items ===
    public static final RegistryObject<Item> BIORAPTOR_SCALE = ITEMS.register("bioraptor_scale", () -> new AItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)) {{addInfo("Temp Tooltip For Now");}});
    public static final RegistryObject<Item> BASILISK_SCALE = ITEMS.register("basilisk_scale", () -> new AItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)) {{addInfo("\u00A72This is your badge of honor.\u00A72");}});
    public static final RegistryObject<Item> WATER_DRAGON_SCALE = ITEMS.register("water_dragon_scale", () -> new AItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)) {{addInfo("§bDropped by the Water Dragon.§b");}});
    public static final RegistryObject<Item> COARSE_AMETHYST = ITEMS.register("coarse_amethyst", () -> new AItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)) {{addInfo("§5 They make some pretty cool Coarse Amethyst Tools & a Coarse Amethyst Sword, you can also make Coarse Amethyst Armor §5");}});
    public static final RegistryObject<Item> LAVA_CRYSTAL = ITEMS.register("lava_crystal", () -> new AItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)) {{addInfo("Temp Tooltip For Now");}});
    public static final RegistryObject<Item> EMPEROR_SCORPION_SCALE = ITEMS.register("emperor_scorpion_scale", () -> new AItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)) {{addInfo("Temp Tooltip For Now.");}});
    public static final RegistryObject<Item> GIANT_MOLE_NOSE = ITEMS.register("giant_mole_nose", () -> new AItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)) {{addInfo("Temp Tooltip For Now.");}});
    public static final RegistryObject<Item> GREEN_GOO = ITEMS.register("green_goo", () -> new AItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)) {{addInfo("Temp Tooltip For Now.");}});
    public static final RegistryObject<Item> KATTERKILLER_JAW = ITEMS.register("katterkiller_jaw", () -> new AItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)) {{addInfo("Temp Tooltip For Now.");}});
    public static final RegistryObject<Item> KRAKEN_TOOTH = ITEMS.register("kraken_tooth", () -> new AItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)) {{addInfo("Temp Tooltip For Now.");}});
    public static final RegistryObject<Item> BLANK_DISC = ITEMS.register("blank_disc", () -> new AItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)) {{addInfo("Temp Tooltip For Now.");}});
    public static final RegistryObject<Item> NESSIE_SCALE = ITEMS.register("nessie_scale", () -> new AItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)) {{addInfo("Temp Tooltip For Now.");}});
    public static final RegistryObject<Item> MOTHRA_SCALE = ITEMS.register("mothra_scale", () -> new AItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)) {{addInfo("Temp Tooltip For Now.");}});
    public static final RegistryObject<Item> PINK_CRYSTAL = ITEMS.register("pink_crystal", () -> new AItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)) {{addInfo("Temp Tooltip For Now.");}});
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new AItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)) {{addInfo("Temp Tooltip For Now.");}});
    public static final RegistryObject<Item> RED_HEEL = ITEMS.register("red_heel", () -> new AItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)) {{addInfo("Temp Tooltip For Now.");}});
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItem(RUBY_BLOCK.get(), new Item.Properties()));

    // === Special Items ===
    public static final RegistryObject<Item> MINERS_DREAM = ITEMS.register("miners_dream", MinersDreamItem::new);


    // === Weapon Items ===
    public static final RegistryObject<Item> MANTIS_CLAW = ITEMS.register("mantis_claw", () -> new Sword(new Item.Properties().durability(1)) {{this.addInfo("§2You killed a Mantis. This is your reward! Not only does it do a respectable amount of damage,", "§2but with every hit it sucks half a heart out of its victim... and gives it to you!");}@Override protected ConfigValues getConfigValues() {return new ConfigValues(DZConfig.getMantisClawDurability(), DZConfig.getMantisClawDamage(), DZConfig.getMantisClawEfficiency(), DZConfig.getMantisClawAttackSpeed(), DZConfig.getMantisClawHarvestLevel(), DZConfig.getMantisClawEnchantability(), DZConfig.getMantisClawHitCost());}@Override public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {stack.hurtAndBreak(getConfigValues().hitCost, attacker, entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));if (!attacker.level().isClientSide()) {target.heal(-2.0F);attacker.heal(2.0F);}return true;}@Override public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {return false;}});
    public static final RegistryObject<Item> LAPIS_SWORD = ITEMS.register("lapis_sword", () -> new Sword(new Item.Properties().durability(1)) {@Override protected ConfigValues getConfigValues() {return new ConfigValues(DZConfig.getLapisSwordDurability(), DZConfig.getLapisSwordDamage(), DZConfig.getLapisSwordEfficiency(), DZConfig.getLapisSwordAttackSpeed(), DZConfig.getLapisSwordHarvestLevel(), DZConfig.getLapisSwordEnchantability(), DZConfig.getLapisSwordHitCost());}@Override public int getMaxDamage(ItemStack stack) {return getConfigValues().durability;}@Override public int getEnchantmentValue() {return getConfigValues().enchantability;}@Override public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {stack.hurtAndBreak(getConfigValues().hitCost, attacker, entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));return true;}@Override public void appendHoverText(@Nonnull ItemStack stack, @Nonnull Level world, @Nonnull List<Component> tooltip, @Nonnull TooltipFlag flag) {super.appendHoverText(stack, world, tooltip, flag);}@Override public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {return false;}});
    public static final RegistryObject<Item> KYANITE_SWORD = ITEMS.register("kyanite_sword", () -> new Sword(new Item.Properties().durability(1)) {@Override protected ConfigValues getConfigValues() {return new ConfigValues(DZConfig.getKyaniteSwordDurability(), DZConfig.getKyaniteSwordDamage(), DZConfig.getKyaniteSwordEfficiency(), DZConfig.getKyaniteSwordAttackSpeed(), DZConfig.getKyaniteSwordHarvestLevel(), DZConfig.getKyaniteSwordEnchantability(), DZConfig.getKyaniteSwordHitCost());}@Override public int getMaxDamage(ItemStack stack) {return getConfigValues().durability;}@Override public int getEnchantmentValue() {return getConfigValues().enchantability;}@Override public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {stack.hurtAndBreak(getConfigValues().hitCost, attacker, entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));return true;}@Override public void appendHoverText(@Nonnull ItemStack stack, @Nonnull Level world, @Nonnull List<Component> tooltip, @Nonnull TooltipFlag flag) {super.appendHoverText(stack, world, tooltip, flag);}@Override public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {return false;}});private static ModdedTier createTempTier() {return new ModdedTier(1, 1, 1, 1).withEmptyRepair();}

    // === Tool Items ===
    public static final RegistryObject<Item> KYANITE_AXE = ITEMS.register("kyanite_axe", () -> new Axe(createTempTier(), 0, 0f, new Item.Properties()) {@Override protected ConfigValues getConfigValues() {return new ConfigValues(DZConfig.getKyaniteAxeDurability(), DZConfig.getKyaniteAxeDamage(), DZConfig.getKyaniteAxeEfficiency(), DZConfig.getKyaniteAxeAttackSpeed(), DZConfig.getKyaniteAxeHarvestLevel(), DZConfig.getKyaniteAxeEnchantability(), DZConfig.getKyaniteAxeHitCost());}@Override public int getMaxDamage(ItemStack stack) {return getConfigValues().durability;}@Override public int getEnchantmentValue() {return getConfigValues().enchantability;}@Override public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {stack.hurtAndBreak(getConfigValues().hitCost, attacker, entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));return true;}@Override public void appendHoverText(@Nonnull ItemStack stack, @Nonnull Level world, @Nonnull List<Component> tooltip, @Nonnull TooltipFlag flag) {super.appendHoverText(stack, world, tooltip, flag);}@Override public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {return false;}});
    public static final RegistryObject<Item> KYANITE_HOE = ITEMS.register("kyanite_hoe", () -> new Hoe(createTempTier(), 0, 0f, new Item.Properties()) {@Override protected ConfigValues getConfigValues() {return new ConfigValues(DZConfig.getKyaniteHoeDurability(), DZConfig.getKyaniteHoeDamage(), DZConfig.getKyaniteHoeEfficiency(), DZConfig.getKyaniteHoeAttackSpeed(), DZConfig.getKyaniteHoeHarvestLevel(), DZConfig.getKyaniteHoeEnchantability(), DZConfig.getKyaniteHoeHitCost());}@Override public int getMaxDamage(ItemStack stack) {return getConfigValues().durability;}@Override public int getEnchantmentValue() {return getConfigValues().enchantability;}@Override public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {stack.hurtAndBreak(getConfigValues().hitCost, attacker, entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));return true;}@Override public void appendHoverText(@Nonnull ItemStack stack, @Nonnull Level world, @Nonnull List<Component> tooltip, @Nonnull TooltipFlag flag) {super.appendHoverText(stack, world, tooltip, flag);}@Override public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {return false;}});
    public static final RegistryObject<Item> KYANITE_PICKAXE = ITEMS.register("kyanite_pickaxe", () -> new Pickaxe(createTempTier(), 0, 0f, new Item.Properties()) {@Override protected ConfigValues getConfigValues() {return new ConfigValues(DZConfig.getKyanitePickaxeDurability(), DZConfig.getKyanitePickaxeDamage(), DZConfig.getKyanitePickaxeEfficiency(), DZConfig.getKyanitePickaxeAttackSpeed(), DZConfig.getKyanitePickaxeHarvestLevel(), DZConfig.getKyanitePickaxeEnchantability(), DZConfig.getKyanitePickaxeHitCost());}@Override public int getMaxDamage(ItemStack stack) {return getConfigValues().durability;}@Override public int getEnchantmentValue() {return getConfigValues().enchantability;}@Override public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {stack.hurtAndBreak(getConfigValues().hitCost, attacker, entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));return true;}@Override public void appendHoverText(@Nonnull ItemStack stack, @Nonnull Level world, @Nonnull List<Component> tooltip, @Nonnull TooltipFlag flag) {super.appendHoverText(stack, world, tooltip, flag);}@Override public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {return false;}});
    public static final RegistryObject<Item> KYANITE_SHOVEL = ITEMS.register("kyanite_shovel", () -> new Shovel(createTempTier(), 0, 0f, new Item.Properties()) {@Override protected ConfigValues getConfigValues() {return new ConfigValues(DZConfig.getKyaniteShovelDurability(), DZConfig.getKyaniteShovelDamage(), DZConfig.getKyaniteShovelEfficiency(), DZConfig.getKyaniteShovelAttackSpeed(), DZConfig.getKyaniteShovelHarvestLevel(), DZConfig.getKyaniteShovelEnchantability(), DZConfig.getKyaniteShovelHitCost());}@Override public int getMaxDamage(ItemStack stack) {return getConfigValues().durability;}@Override public int getEnchantmentValue() {return getConfigValues().enchantability;}@Override public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {stack.hurtAndBreak(getConfigValues().hitCost, attacker, entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));return true;}@Override public void appendHoverText(@Nonnull ItemStack stack, @Nonnull Level world, @Nonnull List<Component> tooltip, @Nonnull TooltipFlag flag) {super.appendHoverText(stack, world, tooltip, flag);}@Override public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {return false;}});
    public static final RegistryObject<Item> LAPIS_AXE = ITEMS.register("lapis_axe", () -> new Axe(createTempTier(), 0, 0f, new Item.Properties()) {@Override protected ConfigValues getConfigValues() {return new ConfigValues(DZConfig.getLapisAxeDurability(), DZConfig.getLapisAxeDamage(), DZConfig.getLapisAxeEfficiency(), DZConfig.getLapisAxeAttackSpeed(), DZConfig.getLapisAxeHarvestLevel(), DZConfig.getLapisAxeEnchantability(), DZConfig.getLapisAxeHitCost());}@Override public int getMaxDamage(ItemStack stack) {return getConfigValues().durability;}@Override public int getEnchantmentValue() {return getConfigValues().enchantability;}@Override public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {stack.hurtAndBreak(getConfigValues().hitCost, attacker, entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));return true;}@Override public void appendHoverText(@Nonnull ItemStack stack, @Nonnull Level world, @Nonnull List<Component> tooltip, @Nonnull TooltipFlag flag) {super.appendHoverText(stack, world, tooltip, flag);}@Override public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {return false;}});
    public static final RegistryObject<Item> LAPIS_HOE = ITEMS.register("lapis_hoe", () -> new Hoe(createTempTier(), 0, 0f, new Item.Properties()) {@Override protected ConfigValues getConfigValues() {return new ConfigValues(DZConfig.getLapisHoeDurability(), DZConfig.getLapisHoeDamage(), DZConfig.getLapisHoeEfficiency(), DZConfig.getLapisHoeAttackSpeed(), DZConfig.getLapisHoeHarvestLevel(), DZConfig.getLapisHoeEnchantability(), DZConfig.getLapisHoeHitCost());}@Override public int getMaxDamage(ItemStack stack) {return getConfigValues().durability;}@Override public int getEnchantmentValue() {return getConfigValues().enchantability;}@Override public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {stack.hurtAndBreak(getConfigValues().hitCost, attacker, entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));return true;}@Override public void appendHoverText(@Nonnull ItemStack stack, @Nonnull Level world, @Nonnull List<Component> tooltip, @Nonnull TooltipFlag flag) {super.appendHoverText(stack, world, tooltip, flag);}@Override public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {return false;}});
    public static final RegistryObject<Item> LAPIS_PICKAXE = ITEMS.register("lapis_pickaxe", () -> new Pickaxe(createTempTier(), 0, 0f, new Item.Properties()) {@Override protected ConfigValues getConfigValues() {return new ConfigValues(DZConfig.getLapisPickaxeDurability(), DZConfig.getLapisPickaxeDamage(), DZConfig.getLapisPickaxeEfficiency(), DZConfig.getLapisPickaxeAttackSpeed(), DZConfig.getLapisPickaxeHarvestLevel(), DZConfig.getLapisPickaxeEnchantability(), DZConfig.getLapisPickaxeHitCost());}@Override public int getMaxDamage(ItemStack stack) {return getConfigValues().durability;}@Override public int getEnchantmentValue() {return getConfigValues().enchantability;}@Override public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {stack.hurtAndBreak(getConfigValues().hitCost, attacker, entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));return true;}@Override public void appendHoverText(@Nonnull ItemStack stack, @Nonnull Level world, @Nonnull List<Component> tooltip, @Nonnull TooltipFlag flag) {super.appendHoverText(stack, world, tooltip, flag);}@Override public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {return false;}});
    public static final RegistryObject<Item> LAPIS_SHOVEL = ITEMS.register("lapis_shovel", () -> new Shovel(createTempTier(), 0, 0f, new Item.Properties()) {@Override protected ConfigValues getConfigValues() {return new ConfigValues(DZConfig.getLapisShovelDurability(), DZConfig.getLapisShovelDamage(), DZConfig.getLapisShovelEfficiency(), DZConfig.getLapisShovelAttackSpeed(), DZConfig.getLapisShovelHarvestLevel(), DZConfig.getLapisShovelEnchantability(), DZConfig.getLapisShovelHitCost());}@Override public int getMaxDamage(ItemStack stack) {return getConfigValues().durability;}@Override public int getEnchantmentValue() {return getConfigValues().enchantability;}@Override public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {stack.hurtAndBreak(getConfigValues().hitCost, attacker, entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));return true;}@Override public void appendHoverText(@Nonnull ItemStack stack, @Nonnull Level world, @Nonnull List<Component> tooltip, @Nonnull TooltipFlag flag) {super.appendHoverText(stack, world, tooltip, flag);}@Override public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {return false;}});



    // === Armor Items ===
    public static final RegistryObject<ArmorItem> COARSE_AMETHYST_HELMET = ITEMS.register("coarse_amethyst_helmet", () -> new Armour(() -> createCoarseAmethystArmorTier(ArmorItem.Type.HELMET), ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.COMMON), () -> DZConfig.getCoarseAmethystHelmetHitCost(), "\u00A75Glittering\u00A75"));
    public static final RegistryObject<ArmorItem> COARSE_AMETHYST_CHESTPLATE = ITEMS.register("coarse_amethyst_chestplate", () -> new Armour(() -> createCoarseAmethystArmorTier(ArmorItem.Type.CHESTPLATE), ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.COMMON), () -> DZConfig.getCoarseAmethystChestplateHitCost(), "\u00A75DAZZLING\u00A75"));
    public static final RegistryObject<ArmorItem> COARSE_AMETHYST_LEGGINGS = ITEMS.register("coarse_amethyst_leggings", () -> new Armour(() -> createCoarseAmethystArmorTier(ArmorItem.Type.LEGGINGS), ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.COMMON), () -> DZConfig.getCoarseAmethystLeggingsHitCost(), "\u00A75Shining\u00A75"));
    public static final RegistryObject<ArmorItem> COARSE_AMETHYST_BOOTS = ITEMS.register("coarse_amethyst_boots", () -> new Armour(() -> createCoarseAmethystArmorTier(ArmorItem.Type.BOOTS), ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.COMMON), () -> DZConfig.getCoarseAmethystBootsHitCost(), "\u00A75Sparkling\u00A75"));
    private static ArmourTier createCoarseAmethystArmorTier(ArmorItem.Type type) {return new ArmourTier("coarse_amethyst", () -> getCoarseAmethystDurabilityForType(type), () -> getCoarseAmethystArmorForType(type), () -> getCoarseAmethystEnchantabilityForType(type), () -> getCoarseAmethystToughnessForType(type), () -> getCoarseAmethystKnockbackResistanceForType(type), true, () -> Ingredient.of(RegistryHandler.COARSE_AMETHYST.get()));}private static int getCoarseAmethystDurabilityForType(ArmorItem.Type type) {return switch (type) {case HELMET -> DZConfig.getCoarseAmethystHelmetDurability();case CHESTPLATE -> DZConfig.getCoarseAmethystChestplateDurability();case LEGGINGS -> DZConfig.getCoarseAmethystLeggingsDurability();case BOOTS -> DZConfig.getCoarseAmethystBootsDurability();};}private static int getCoarseAmethystArmorForType(ArmorItem.Type type) {return switch (type) {case HELMET -> DZConfig.getCoarseAmethystHelmetArmor();case CHESTPLATE -> DZConfig.getCoarseAmethystChestplateArmor();case LEGGINGS -> DZConfig.getCoarseAmethystLeggingsArmor();case BOOTS -> DZConfig.getCoarseAmethystBootsArmor();};}private static int getCoarseAmethystEnchantabilityForType(ArmorItem.Type type) {return switch (type) {case HELMET -> DZConfig.getCoarseAmethystHelmetEnchantability();case CHESTPLATE -> DZConfig.getCoarseAmethystChestplateEnchantability();case LEGGINGS -> DZConfig.getCoarseAmethystLeggingsEnchantability();case BOOTS -> DZConfig.getCoarseAmethystBootsEnchantability();};}private static float getCoarseAmethystToughnessForType(ArmorItem.Type type) {return (float) switch (type) {case HELMET -> DZConfig.getCoarseAmethystHelmetToughness();case CHESTPLATE -> DZConfig.getCoarseAmethystChestplateToughness();case LEGGINGS -> DZConfig.getCoarseAmethystLeggingsToughness();case BOOTS -> DZConfig.getCoarseAmethystBootsToughness();};}private static float getCoarseAmethystKnockbackResistanceForType(ArmorItem.Type type) {return (float) switch (type) {case HELMET -> DZConfig.getCoarseAmethystHelmetKnockBackResistance();case CHESTPLATE -> DZConfig.getCoarseAmethystChestplateKnockBackResistance();case LEGGINGS -> DZConfig.getCoarseAmethystLeggingsKnockBackResistance();case BOOTS -> DZConfig.getCoarseAmethystBootsKnockBackResistance();};}


    public static final RegistryObject<ArmorItem> LAPIS_HELMET = ITEMS.register("lapis_helmet", () -> new Armour(() -> createLapisArmorTier(ArmorItem.Type.HELMET), ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.COMMON), () -> DZConfig.getLapisHelmetHitCost(), "\u00A79This helmet was built for general awesomeness\u00A79"));
    public static final RegistryObject<ArmorItem> LAPIS_CHESTPLATE = ITEMS.register("lapis_chestplate", () -> new Armour(() -> createLapisArmorTier(ArmorItem.Type.CHESTPLATE), ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.COMMON), () -> DZConfig.getLapisChestplateHitCost(), "\u00A79It's right at home on the battlefield, the rugby field or the boardroom.\u00A79"));
    public static final RegistryObject<ArmorItem> LAPIS_LEGGINGS = ITEMS.register("lapis_leggings", () -> new Armour(() -> createLapisArmorTier(ArmorItem.Type.LEGGINGS), ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.COMMON), () -> DZConfig.getLapisLeggingsHitCost(), "\u00A79These leggings are for those that want to look seriously spiffy.\u00A79"));
    public static final RegistryObject<ArmorItem> LAPIS_BOOTS = ITEMS.register("lapis_boots", () -> new Armour(() -> createLapisArmorTier(ArmorItem.Type.BOOTS), ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.COMMON), () -> DZConfig.getLapisBootsHitCost(), "\u00A79Great for dancing in.\u00A79"));
    private static ArmourTier createLapisArmorTier(ArmorItem.Type type) {return new ArmourTier("lapis", () -> getLapisDurabilityForType(type), () -> getLapisArmorForType(type), () -> getLapisEnchantabilityForType(type), () -> getLapisToughnessForType(type), () -> getLapisKnockbackResistanceForType(type), true, () -> Ingredient.of(Items.LAPIS_LAZULI));}private static int getLapisDurabilityForType(ArmorItem.Type type) {return switch (type) {case HELMET -> DZConfig.getLapisHelmetDurability();case CHESTPLATE -> DZConfig.getLapisChestplateDurability();case LEGGINGS -> DZConfig.getLapisLeggingsDurability();case BOOTS -> DZConfig.getLapisBootsDurability();};}private static int getLapisArmorForType(ArmorItem.Type type) {return switch (type) {case HELMET -> DZConfig.getLapisHelmetArmor();case CHESTPLATE -> DZConfig.getLapisChestplateArmor();case LEGGINGS -> DZConfig.getLapisLeggingsArmor();case BOOTS -> DZConfig.getLapisBootsArmor();};}private static int getLapisEnchantabilityForType(ArmorItem.Type type) {return switch (type) {case HELMET -> DZConfig.getLapisHelmetEnchantability();case CHESTPLATE -> DZConfig.getLapisChestplateEnchantability();case LEGGINGS -> DZConfig.getLapisLeggingsEnchantability();case BOOTS -> DZConfig.getLapisBootsEnchantability();};}private static float getLapisToughnessForType(ArmorItem.Type type) {return (float) switch (type) {case HELMET -> DZConfig.getLapisHelmetToughness();case CHESTPLATE -> DZConfig.getLapisChestplateToughness();case LEGGINGS -> DZConfig.getLapisLeggingsToughness();case BOOTS -> DZConfig.getLapisBootsToughness();};}private static float getLapisKnockbackResistanceForType(ArmorItem.Type type) {return (float) switch (type) {case HELMET -> DZConfig.getLapisHelmetKnockBackResistance();case CHESTPLATE -> DZConfig.getLapisChestplateKnockBackResistance();case LEGGINGS -> DZConfig.getLapisLeggingsKnockBackResistance();case BOOTS -> DZConfig.getLapisBootsKnockBackResistance();};}


    public static final RegistryObject<ArmorItem> LAVA_CRYSTAL_HELMET = ITEMS.register("lava_crystal_helmet", () -> new Armour(() -> createLavaCrystalArmorTier(ArmorItem.Type.HELMET), ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.COMMON), () -> DZConfig.getLavaCrystalHelmetHitCost(), ""));
    public static final RegistryObject<ArmorItem> LAVA_CRYSTAL_CHESTPLATE = ITEMS.register("lava_crystal_chestplate", () -> new Armour(() -> createLavaCrystalArmorTier(ArmorItem.Type.CHESTPLATE), ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.COMMON), () -> DZConfig.getLavaCrystalChestplateHitCost(), ""));
    public static final RegistryObject<ArmorItem> LAVA_CRYSTAL_LEGGINGS = ITEMS.register("lava_crystal_leggings", () -> new Armour(() -> createLavaCrystalArmorTier(ArmorItem.Type.LEGGINGS), ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.COMMON), () -> DZConfig.getLavaCrystalLeggingsHitCost(), ""));
    public static final RegistryObject<ArmorItem> LAVA_CRYSTAL_BOOTS = ITEMS.register("lava_crystal_boots", () -> new Armour(() -> createLavaCrystalArmorTier(ArmorItem.Type.BOOTS), ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.COMMON), () -> DZConfig.getLavaCrystalBootsHitCost(), ""));
    private static ArmourTier createLavaCrystalArmorTier(ArmorItem.Type type) {return new ArmourTier("lava_crystal", () -> getLavaCrystalDurabilityForType(type), () -> getLavaCrystalArmorForType(type), () -> getLavaCrystalEnchantabilityForType(type), () -> getLavaCrystalToughnessForType(type), () -> getLavaCrystalKnockbackResistanceForType(type), true, () -> Ingredient.of(LAVA_CRYSTAL.get()));}private static int getLavaCrystalDurabilityForType(ArmorItem.Type type) {return switch (type) {case HELMET -> DZConfig.getLavaCrystalHelmetDurability();case CHESTPLATE -> DZConfig.getLavaCrystalChestplateDurability();case LEGGINGS -> DZConfig.getLavaCrystalLeggingsDurability();case BOOTS -> DZConfig.getLavaCrystalBootsDurability();};}private static int getLavaCrystalArmorForType(ArmorItem.Type type) {return switch (type) {case HELMET -> DZConfig.getLavaCrystalHelmetArmor();case CHESTPLATE -> DZConfig.getLavaCrystalChestplateArmor();case LEGGINGS -> DZConfig.getLavaCrystalLeggingsArmor();case BOOTS -> DZConfig.getLavaCrystalBootsArmor();};}private static int getLavaCrystalEnchantabilityForType(ArmorItem.Type type) {return switch (type) {case HELMET -> DZConfig.getLavaCrystalHelmetEnchantability();case CHESTPLATE -> DZConfig.getLavaCrystalChestplateEnchantability();case LEGGINGS -> DZConfig.getLavaCrystalLeggingsEnchantability();case BOOTS -> DZConfig.getLavaCrystalBootsEnchantability();};}private static float getLavaCrystalToughnessForType(ArmorItem.Type type) {return (float) switch (type) {case HELMET -> DZConfig.getLavaCrystalHelmetToughness();case CHESTPLATE -> DZConfig.getLavaCrystalChestplateToughness();case LEGGINGS -> DZConfig.getLavaCrystalLeggingsToughness();case BOOTS -> DZConfig.getLavaCrystalBootsToughness();};}private static float getLavaCrystalKnockbackResistanceForType(ArmorItem.Type type) {return (float) switch (type) {case HELMET -> DZConfig.getLavaCrystalHelmetKnockBackResistance();case CHESTPLATE -> DZConfig.getLavaCrystalChestplateKnockBackResistance();case LEGGINGS -> DZConfig.getLavaCrystalLeggingsKnockBackResistance();case BOOTS -> DZConfig.getLavaCrystalBootsKnockBackResistance();};}


    public static final RegistryObject<ArmorItem> PINK_HELMET = ITEMS.register("pink_helmet", () -> new Armour(() -> createPinkArmorTier(ArmorItem.Type.HELMET), ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.COMMON), () -> DZConfig.getPinkHelmetHitCost(), ""));
    public static final RegistryObject<ArmorItem> PINK_CHESTPLATE = ITEMS.register("pink_chestplate", () -> new Armour(() -> createPinkArmorTier(ArmorItem.Type.CHESTPLATE), ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.COMMON), () -> DZConfig.getPinkChestplateHitCost(), ""));
    public static final RegistryObject<ArmorItem> PINK_LEGGINGS = ITEMS.register("pink_leggings", () -> new Armour(() -> createPinkArmorTier(ArmorItem.Type.LEGGINGS), ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.COMMON), () -> DZConfig.getPinkLeggingsHitCost(), ""));
    public static final RegistryObject<ArmorItem> PINK_BOOTS = ITEMS.register("pink_boots", () -> new Armour(() -> createPinkArmorTier(ArmorItem.Type.BOOTS), ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.COMMON), () -> DZConfig.getPinkBootsHitCost(), ""));
    private static ArmourTier createPinkArmorTier(ArmorItem.Type type) {return new ArmourTier("pink", () -> getPinkDurabilityForType(type), () -> getPinkArmorForType(type), () -> getPinkEnchantabilityForType(type), () -> getPinkToughnessForType(type), () -> getPinkKnockbackResistanceForType(type), true, () -> Ingredient.of(PINK_CRYSTAL.get()));}private static int getPinkDurabilityForType(ArmorItem.Type type) {return switch (type) {case HELMET -> DZConfig.getPinkHelmetDurability();case CHESTPLATE -> DZConfig.getPinkChestplateDurability();case LEGGINGS -> DZConfig.getPinkLeggingsDurability();case BOOTS -> DZConfig.getPinkBootsDurability();};}private static int getPinkArmorForType(ArmorItem.Type type) {return switch (type) {case HELMET -> DZConfig.getPinkHelmetArmor();case CHESTPLATE -> DZConfig.getPinkChestplateArmor();case LEGGINGS -> DZConfig.getPinkLeggingsArmor();case BOOTS -> DZConfig.getPinkBootsArmor();};}private static int getPinkEnchantabilityForType(ArmorItem.Type type) {return switch (type) {case HELMET -> DZConfig.getPinkHelmetEnchantability();case CHESTPLATE -> DZConfig.getPinkChestplateEnchantability();case LEGGINGS -> DZConfig.getPinkLeggingsEnchantability();case BOOTS -> DZConfig.getPinkBootsEnchantability();};}private static float getPinkToughnessForType(ArmorItem.Type type) {return (float) switch (type) {case HELMET -> DZConfig.getPinkHelmetToughness();case CHESTPLATE -> DZConfig.getPinkChestplateToughness();case LEGGINGS -> DZConfig.getPinkLeggingsToughness();case BOOTS -> DZConfig.getPinkBootsToughness();};}private static float getPinkKnockbackResistanceForType(ArmorItem.Type type) {return (float) switch (type) {case HELMET -> DZConfig.getPinkHelmetKnockBackResistance();case CHESTPLATE -> DZConfig.getPinkChestplateKnockBackResistance();case LEGGINGS -> DZConfig.getPinkLeggingsKnockBackResistance();case BOOTS -> DZConfig.getPinkBootsKnockBackResistance();};}






    // === Creative Tabs ===
    public static final RegistryObject<CreativeModeTab> A_ADVENTUREKRAFT_A_ITEMS_TAB = CREATIVE_MODE_TABS.register(
            "aadventurekraftaitems",
            RegistryHandler::createItemsTab);
    public static final RegistryObject<CreativeModeTab> B_ADVENTUREKRAFT_B_ARMORY_TAB = CREATIVE_MODE_TABS.register(
            "badventurekraftbarmory",
            RegistryHandler::createArmorTab);
    public static final RegistryObject<CreativeModeTab> C_ADVENTUREKRAFT_C_WEAPONRY_TAB = CREATIVE_MODE_TABS.register(
            "cadventurekraftcweaponry",
            RegistryHandler::createWeaponsTab);
    public static final RegistryObject<CreativeModeTab> D_ADVENTUREKRAFT_D_TOOLS_TAB = CREATIVE_MODE_TABS.register(
            "dadventurekraftdtools",
            RegistryHandler::createToolsTab);
    public static final RegistryObject<CreativeModeTab> E_ADVENTUREKRAFT_E_BLOCKS_TAB = CREATIVE_MODE_TABS.register(
            "eadventurekrafteblocks",
            RegistryHandler::createBlocksTab);
    public static final RegistryObject<CreativeModeTab> F_ADVENTUREKRAFT_F_PORES_TAB = CREATIVE_MODE_TABS.register(
            "fadventurekraftfpores",
            RegistryHandler::createPoresTab);
    public static final RegistryObject<CreativeModeTab> G_ADVENTUREKRAFT_G_FOOD_TAB = CREATIVE_MODE_TABS.register(
            "gadventurekraftgfood",
            RegistryHandler::createFoodTab);
    public static final RegistryObject<CreativeModeTab> H_ADVENTUREKRAFT_H_WIP_TAB = CREATIVE_MODE_TABS.register(
            "hadventurekrafthwip",
            RegistryHandler::createWIPTab);


    public static void init(IEventBus modEventBus) {
        // Register all deferred registers with the mod event bus
        ITEMS.register(modEventBus);
        BLOCKS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
        MOBS.register(modEventBus);
    }



    // === AdventureKraft Items Creative Tab ===
    private static CreativeModeTab createItemsTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.aadventurekraftaitemstab"))
                .icon(() -> new ItemStack(COARSE_AMETHYST.get()))
                .displayItems((params, output) -> {
                    output.accept(BASILISK_SCALE.get());
                    output.accept(BIORAPTOR_SCALE.get());
                    output.accept(BLANK_DISC.get());
                    output.accept(COARSE_AMETHYST.get());
                    output.accept(EMPEROR_SCORPION_SCALE.get());
                    output.accept(GIANT_MOLE_NOSE.get());
                    output.accept(GREEN_GOO.get());
                    output.accept(KATTERKILLER_JAW.get());
                    output.accept(KRAKEN_TOOTH.get());
                    output.accept(KRAKEN_SPAWN_EGG.get());
                    output.accept(LAVA_CRYSTAL.get());
                    output.accept(MINERS_DREAM.get());
                    output.accept(MOTHRA_SCALE.get());
                    output.accept(NESSIE_SCALE.get());
                    output.accept(PINK_CRYSTAL.get());
                    output.accept(RED_HEEL.get());
                    output.accept(RUBY.get());
                    output.accept(WATER_DRAGON_SCALE.get());
                })
                .withBackgroundLocation(new ResourceLocation("dangerzone", "textures/gui/inventory_tab.png"))
                .withTabsImage(new ResourceLocation("dangerzone", "textures/gui/tab_icons.png"))
                .build();
    }


    // === AdventureKraft Armory Creative Tab ===
    private static CreativeModeTab createArmorTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.badventurekraftbarmorytab"))
                .icon(() -> new ItemStack(COARSE_AMETHYST_CHESTPLATE.get()))
                .displayItems((params, output) -> {
                    output.accept(COARSE_AMETHYST_HELMET.get());
                    output.accept(COARSE_AMETHYST_CHESTPLATE.get());
                    output.accept(COARSE_AMETHYST_LEGGINGS.get());
                    output.accept(COARSE_AMETHYST_BOOTS.get());

                    output.accept(LAPIS_HELMET.get());
                    output.accept(LAPIS_CHESTPLATE.get());
                    output.accept(LAPIS_LEGGINGS.get());
                    output.accept(LAPIS_BOOTS.get());

                    output.accept(LAVA_CRYSTAL_HELMET.get());
                    output.accept(LAVA_CRYSTAL_CHESTPLATE.get());
                    output.accept(LAVA_CRYSTAL_LEGGINGS.get());
                    output.accept(LAVA_CRYSTAL_BOOTS.get());

                    output.accept(PINK_HELMET.get());
                    output.accept(PINK_CHESTPLATE.get());
                    output.accept(PINK_LEGGINGS.get());
                    output.accept(PINK_BOOTS.get());

                })
                .withBackgroundLocation(new ResourceLocation("dangerzone", "textures/gui/inventory_tab.png"))
                .withTabsImage(new ResourceLocation("dangerzone", "textures/gui/tab_icons.png"))
                .build();
    }



    // === AdventureKraft Weapons Creative Tab ===
    private static CreativeModeTab createWeaponsTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.cadventurekraftcweaponrytab"))
                 .icon(() -> new ItemStack(KYANITE_SWORD.get()))
                .displayItems((params, output) -> {
                    //Weapons Go Here
                    output.accept(KYANITE_SWORD.get());
                    output.accept(LAPIS_SWORD.get());
                    output.accept(MANTIS_CLAW.get()); // Temp item to prevent empty tab
                })
                .withBackgroundLocation(new ResourceLocation("dangerzone", "textures/gui/inventory_tab.png"))
                .withTabsImage(new ResourceLocation("dangerzone", "textures/gui/tab_icons.png"))
                .build();
    }



    // === AdventureKraft Tools Creative Tab ===
    private static CreativeModeTab createToolsTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.dadventurekraftdtoolstab"))
                 .icon(() -> new ItemStack(KYANITE_PICKAXE.get()))

                .displayItems((params, output) -> {
                    //Tools Can Go Here
                    output.accept(KYANITE_PICKAXE.get()); // Temp item to prevent empty tab
                    output.accept(KYANITE_AXE.get());
                    output.accept(KYANITE_SHOVEL.get());
                    output.accept(KYANITE_HOE.get());

                    output.accept(LAPIS_PICKAXE.get());
                    output.accept(LAPIS_AXE.get());
                    output.accept(LAPIS_SHOVEL.get());
                    output.accept(LAPIS_HOE.get());
                })
                .withBackgroundLocation(new ResourceLocation("dangerzone", "textures/gui/inventory_tab.png"))
                .withTabsImage(new ResourceLocation("dangerzone", "textures/gui/tab_icons.png"))
                .build();
    }

    // === AdventureKraft Blocks Creative Tab ===
    private static CreativeModeTab createBlocksTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.eadventurekrafteblockstab"))
                // .icon(() -> new ItemStack(COARSE_AMETHYST_CHESTPLATE.get()))
                .icon(() -> new ItemStack(RUBY_BLOCK_ITEM.get()))
                .displayItems((params, output) -> {
                    //Blocks Go Here
                    output.accept(RUBY_BLOCK_ITEM.get());
                })
                .withBackgroundLocation(new ResourceLocation("dangerzone", "textures/gui/inventory_tab.png"))
                .withTabsImage(new ResourceLocation("dangerzone", "textures/gui/tab_icons.png"))
                .build();
    }

    // === AdventureKraft Petrified Ores Creative Tab
    private static CreativeModeTab createPoresTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.fadventurekraftfporestab"))
                // .icon(() -> new ItemStack(COARSE_AMETHYST_CHESTPLATE.get()))
                .icon(() -> new ItemStack(Items.COAL_ORE)) // Temp icon for petrified ores tab
                .displayItems((params, output) -> {
                    //Petrified Ore Blocks Go Here
                    output.accept(Items.COBBLESTONE); // Temp item to prevent empty tab
                })
                .withBackgroundLocation(new ResourceLocation("dangerzone", "textures/gui/inventory_tab.png"))
                .withTabsImage(new ResourceLocation("dangerzone", "textures/gui/tab_icons.png"))
                .build();
    }


    // === AdventureKraft Food Creative Tab ===
    private static CreativeModeTab createFoodTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.gadventurekraftgfoodtab"))
                // .icon(() -> new ItemStack(COARSE_AMETHYST.get()))
                .icon(() -> new ItemStack(Items.APPLE)) // Temp icon for food tab
                .displayItems((params, output) -> {
                    //Food Goes here
                    output.accept(Items.COBBLESTONE); // Temp item to prevent empty tab
                })
                .withBackgroundLocation(new ResourceLocation("dangerzone", "textures/gui/inventory_tab.png"))
                .withTabsImage(new ResourceLocation("dangerzone", "textures/gui/tab_icons.png"))
                .build();
    }



    // === AdventureKraft WIP Creative Tab ===
    private static CreativeModeTab createWIPTab() {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.hadventurekrafthwiptab"))
                // .icon(() -> new ItemStack(COARSE_AMETHYST_CHESTPLATE.get()))
                .icon(() -> new ItemStack(Items.BARRIER)) // Temp icon for WIP tab
                .displayItems((params, output) -> {
                    //WIP Stuff Goes Here
                    output.accept(Items.COBBLESTONE); // Temp item to prevent empty tab
                })
                .withBackgroundLocation(new ResourceLocation("dangerzone", "textures/gui/inventory_tab.png"))
                .withTabsImage(new ResourceLocation("dangerzone", "textures/gui/tab_icons.png"))
                .build();
    }

}