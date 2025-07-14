package com.devmaster.dangerzone.world.gen;

import com.devmaster.dangerzone.util.RegistryHandler;

import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.Difficulty;
import net.minecraft.util.RandomSource;

import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ArmoredMobSpawnEvents {
    public static Enchantment[] helmetEnchant;
    public static Enchantment[] chest_legsEnchant;
    public static Enchantment[] bootEnchant;
    public static Enchantment[] swordEnchant;
    public static Item[] swordList;
    public static Item[][] armorSet;

    public ArmoredMobSpawnEvents() {
    }

    @SubscribeEvent
    public static void spawnMonster(EntityJoinLevelEvent event) {
        // Only run on server side
        if (event.getLevel().isClientSide()) {
            return;
        }
        RandomSource random = event.getLevel().getRandom();
        float chance = random.nextFloat();

        if (event.getLevel().getDifficulty() == Difficulty.HARD) {
            if (chance < 0.05F) {
                zombie(event);
            }
        }

        if (event.getLevel().getDifficulty() == Difficulty.NORMAL) {
            if (chance < 0.05F) {
                zombie(event);
            }
        }

        if (event.getLevel().getDifficulty() == Difficulty.EASY) {
            if (chance < 0.05F) {
                zombie(event);
            }
        }
    }

    public static void zombie(EntityJoinLevelEvent event) {
        if (event.getEntity() instanceof Zombie && !event.getLevel().isClientSide()) {
            Zombie zombie = (Zombie)event.getEntity();
            RandomSource random = event.getLevel().getRandom();

//            ItemStack test = new ItemStack(RegistryHandler.CZ_LOIN_COIN.get());
//            test.enchant(helmetEnchant[1], 1);

            int armorSelect = random.nextInt(armorSet.length);
            int helmetEnchantSelect = random.nextInt(helmetEnchant.length);
            int chest_legsEnchantSelect = random.nextInt(chest_legsEnchant.length);
            int bootEnchantSelect = random.nextInt(bootEnchant.length);
            int swordSelect = random.nextInt(swordList.length);
            boolean addItem = random.nextBoolean();
            boolean addEnchant;
            ItemStack stack;

            if (addItem) {
                addEnchant = random.nextBoolean();
                if (addEnchant) {
                    stack = new ItemStack(armorSet[armorSelect][0]);
                    stack.enchant(helmetEnchant[helmetEnchantSelect], random.nextInt(helmetEnchant[helmetEnchantSelect].getMaxLevel()) + 1);
                    zombie.setItemSlot(EquipmentSlot.HEAD, stack);
                } else {
                    zombie.setItemSlot(EquipmentSlot.HEAD, new ItemStack(armorSet[armorSelect][0]));
                }
            }

            addItem = random.nextBoolean();
            if (addItem) {
                addEnchant = random.nextBoolean();
                if (addEnchant) {
                    stack = new ItemStack(armorSet[armorSelect][1]);
                    stack.enchant(chest_legsEnchant[chest_legsEnchantSelect], random.nextInt(chest_legsEnchant[chest_legsEnchantSelect].getMaxLevel()) + 1);
                    zombie.setItemSlot(EquipmentSlot.CHEST, stack);
                } else {
                    zombie.setItemSlot(EquipmentSlot.CHEST, new ItemStack(armorSet[armorSelect][1]));
                }
            }

            addItem = random.nextBoolean();
            if (addItem) {
                addEnchant = random.nextBoolean();
                if (addEnchant) {
                    stack = new ItemStack(armorSet[armorSelect][2]);
                    stack.enchant(chest_legsEnchant[chest_legsEnchantSelect], random.nextInt(chest_legsEnchant[chest_legsEnchantSelect].getMaxLevel()) + 1);
                    zombie.setItemSlot(EquipmentSlot.LEGS, stack);
                } else {
                    zombie.setItemSlot(EquipmentSlot.LEGS, new ItemStack(armorSet[armorSelect][2]));
                }
            }

            addItem = random.nextBoolean();
            if (addItem) {
                addEnchant = random.nextBoolean();
                if (addEnchant) {
                    stack = new ItemStack(armorSet[armorSelect][3]);
                    stack.enchant(bootEnchant[bootEnchantSelect], random.nextInt(bootEnchant[bootEnchantSelect].getMaxLevel()) + 1);
                    zombie.setItemSlot(EquipmentSlot.FEET, stack);
                } else {
                    zombie.setItemSlot(EquipmentSlot.FEET, new ItemStack(armorSet[armorSelect][3]));
                }
            }

            addItem = random.nextBoolean();
            if (addItem) {
                addEnchant = random.nextBoolean();
                if (addEnchant) {
                    stack = new ItemStack(swordList[swordSelect]);
                    EnchantmentHelper.enchantItem(random, stack, 30, false);
                    zombie.setItemSlot(EquipmentSlot.MAINHAND, stack);
                } else {
                    zombie.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(swordList[swordSelect]));
                }
            }
        }
    }

    static {
        helmetEnchant = new Enchantment[]{
                Enchantments.AQUA_AFFINITY,
                Enchantments.BINDING_CURSE,
                Enchantments.BLAST_PROTECTION,
                Enchantments.VANISHING_CURSE,
                Enchantments.FIRE_PROTECTION,
                Enchantments.MENDING,
                Enchantments.PROJECTILE_PROTECTION,
                Enchantments.ALL_DAMAGE_PROTECTION,
                Enchantments.RESPIRATION,
                Enchantments.THORNS,
                Enchantments.UNBREAKING
        };

        chest_legsEnchant = new Enchantment[]{
                Enchantments.BLAST_PROTECTION,
                Enchantments.ALL_DAMAGE_PROTECTION,
                Enchantments.BINDING_CURSE,
                Enchantments.VANISHING_CURSE,
                Enchantments.FIRE_PROTECTION,
                Enchantments.MENDING,
                Enchantments.PROJECTILE_PROTECTION,
                Enchantments.THORNS,
                Enchantments.UNBREAKING
        };

        bootEnchant = new Enchantment[]{
                Enchantments.BLAST_PROTECTION,
                Enchantments.VANISHING_CURSE,
                Enchantments.BINDING_CURSE,
                Enchantments.DEPTH_STRIDER,
                Enchantments.FROST_WALKER,
                Enchantments.FALL_PROTECTION,
                Enchantments.FIRE_PROTECTION,
                Enchantments.MENDING,
                Enchantments.ALL_DAMAGE_PROTECTION,
                Enchantments.PROJECTILE_PROTECTION,
                Enchantments.SOUL_SPEED,
                Enchantments.THORNS,
                Enchantments.UNBREAKING
        };

        swordEnchant = new Enchantment[]{
                Enchantments.BANE_OF_ARTHROPODS,
                Enchantments.VANISHING_CURSE,
                Enchantments.FIRE_ASPECT,
                Enchantments.KNOCKBACK,
                Enchantments.MOB_LOOTING,
                Enchantments.SMITE,
                Enchantments.MENDING,
                Enchantments.SHARPNESS,
                Enchantments.SWEEPING_EDGE,
                Enchantments.UNBREAKING
        };

        swordList = new Item[]{
//                RegistryHandler.POPPY_SWORD.get(),
//                RegistryHandler.COARSE_AMETHYST_SWORD.get(),
//                RegistryHandler.CAKE_SWORD.get(),
//                RegistryHandler.EMERALD_SWORD.get(),
//                RegistryHandler.SAPPHIRE_SWORD.get(),
//                RegistryHandler.QUEEN_GHIDORAH_SCALE_BATTLE_AXE.get(),
                RegistryHandler.MANTIS_CLAW.get(),
                RegistryHandler.KYANITE_SWORD.get(),
                RegistryHandler.LAPIS_SWORD.get(),
//                RegistryHandler.FIRE_CAKE_SWORD.get(),
//                RegistryHandler.TITANIUM_CAKE_SWORD.get(),
//                RegistryHandler.EXPERIENCE_SCYTHE.get(),
//                RegistryHandler.HAMMY.get()
        };

        armorSet = new Item[][]{
//                {RegistryHandler.CATS_EYE_HELMET.get(), RegistryHandler.CATS_EYE_CHESTPLATE.get(), RegistryHandler.CATS_EYE_LEGGINGS.get(), RegistryHandler.CATS_EYE_BOOTS.get()},
                {RegistryHandler.COARSE_AMETHYST_HELMET.get(), RegistryHandler.COARSE_AMETHYST_CHESTPLATE.get(), RegistryHandler.COARSE_AMETHYST_LEGGINGS.get(), RegistryHandler.COARSE_AMETHYST_BOOTS.get()},
//                {RegistryHandler.COPPER_HELMET.get(), RegistryHandler.COPPER_CHESTPLATE.get(), RegistryHandler.COPPER_LEGGINGS.get(), RegistryHandler.COPPER_BOOTS.get()},
//                {RegistryHandler.EMERALD_HELMET.get(), RegistryHandler.EMERALD_CHESTPLATE.get(), RegistryHandler.EMERALD_LEGGINGS.get(), RegistryHandler.EMERALD_BOOTS.get()},
                {RegistryHandler.LAVA_CRYSTAL_HELMET.get(), RegistryHandler.LAVA_CRYSTAL_CHESTPLATE.get(), RegistryHandler.LAVA_CRYSTAL_LEGGINGS.get(), RegistryHandler.LAVA_CRYSTAL_BOOTS.get()},
                {RegistryHandler.LAPIS_HELMET.get(), RegistryHandler.LAPIS_CHESTPLATE.get(), RegistryHandler.LAPIS_LEGGINGS.get(), RegistryHandler.LAPIS_BOOTS.get()},
//                {RegistryHandler.SAPPHIRE_HELMET.get(), RegistryHandler.SAPPHIRE_CHESTPLATE.get(), RegistryHandler.SAPPHIRE_LEGGINGS.get(), RegistryHandler.SAPPHIRE_BOOTS.get()},
//                {RegistryHandler.QUEEN_GHIDORAH_SCALE_HELMET.get(), RegistryHandler.QUEEN_GHIDORAH_SCALE_CHESTPLATE.get(), RegistryHandler.QUEEN_GHIDORAH_SCALE_LEGGINGS.get(), RegistryHandler.QUEEN_GHIDORAH_SCALE_BOOTS.get()},
//                {RegistryHandler.TITANIUM_HELMET.get(), RegistryHandler.TITANIUM_CHESTPLATE.get(), RegistryHandler.TITANIUM_LEGGINGS.get(), RegistryHandler.TITANIUM_BOOTS.get()}
        };
    }
}