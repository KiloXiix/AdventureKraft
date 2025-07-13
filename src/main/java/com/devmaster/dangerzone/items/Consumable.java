// === Base Item Class for Consumable Items to be used for reference later ===

package com.devmaster.dangerzone.items;


import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.Level;
import net.minecraft.world.food.FoodProperties;

import org.apache.logging.log4j.util.TriConsumer;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Consumable extends AItem
{
    private Supplier<SoundEvent> useSoundSupplier;
    protected boolean alwaysEdible = false;
    protected UseAnim useaction = UseAnim.BOW;
    protected List<MobEffectInstance> effects;
    protected TriConsumer<Level, Player, ItemStack> action;
    protected int usetime = 32, foodamount, repairamount, burnTime = 0;
    protected float healamount, saturationamount, repairpercentage;
    protected boolean repaireverything, useinstantly;
    protected boolean isMeat = false;

    public Consumable(int stacksize, Rarity rarity, CreativeModeTab tab) {
        super(new Item.Properties().stacksTo(stacksize).rarity(rarity));
    }


    public Consumable(int stacksize)
    {
        super(new Item.Properties().stacksTo(stacksize));
    }

    public Consumable(int durability, CreativeModeTab tab, Rarity rarity)
    {
        super(new Item.Properties().durability(durability).rarity(rarity));
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return this.burnTime;
    }

    public Consumable setBurnTime(int burnTime) {
        this.burnTime = burnTime;
        return this;
    }

    public Consumable(Item.Properties p)
    {
        super(p);
    }

    public Consumable setUseSound(Supplier<SoundEvent> soundSupplier) {
        this.useSoundSupplier = soundSupplier;
        return this;
    }

    public Consumable useInstantly()
    {
        this.useinstantly = true;
        this.usetime = 0;
        return this;
    }

    public Consumable meat()
    {
        this.isMeat = true;
        return this;
    }

    public Consumable setAlwaysEdible(boolean alwaysEdible) {
        this.alwaysEdible = alwaysEdible;
        return this;
    }

    @Override
    public boolean isEdible()
    {
        return foodamount > 0 || isMeat;
    }

    @Override
    public FoodProperties getFoodProperties()
    {
        if (isEdible()) {
            FoodProperties.Builder builder = new FoodProperties.Builder();
            if (isMeat) {
                builder.meat();
            }
            if (foodamount > 0) {
                builder.nutrition(foodamount).saturationMod(saturationamount);
            }
            if (alwaysEdible) {
                builder.alwaysEat();
            }
            return builder.build();
        }
        return null;
    }

    public Consumable health(float f)
    {
        this.healamount = f;
        return this;
    }

    public Consumable hunger(int amount, float saturation)
    {
        this.foodamount = amount;
        this.saturationamount = saturation;
        return this;
    }

    public Consumable action(UseAnim action)
    {
        this.useaction = action;
        return this;
    }

    public Consumable repair(float amount, boolean percentage)
    {
        if (percentage)
        {
            repairpercentage = amount;
        }
        else
        {
            repairamount = (int) amount;
        }
        return this;
    }

    public Consumable effect(TriConsumer<Level, Player, ItemStack> action)
    {
        this.action = action;
        return this;
    }

    public Consumable effect(MobEffect effect, int amp, int seconds, boolean visible)
    {
        if (effects == null)
        {
            effects = new ArrayList<MobEffectInstance>();
        }
        effects.add(new MobEffectInstance(effect, seconds, amp, !visible, visible));
        return this;
    }

    public void damage(ItemStack stack, LivingEntity e, int i)
    {
        stack.shrink(i);
    }

    public void doEffect(Level level, Player player, ItemStack stack) {
        if (healamount > 0) {
            player.heal(healamount);
        }
        if (foodamount > 0) {
            if (alwaysEdible || (healamount > 0 && player.getHealth() < player.getMaxHealth()) || player.getFoodData().needsFood()) {
                player.getFoodData().eat(foodamount, saturationamount);
            }
        }
        // Apply effects (add positive effects)
        if (effects != null) {
            for (MobEffectInstance i : effects) {
                // Check if duration is 0; if so, remove the effect
                if (i.getDuration() == 0) {
                    player.removeEffect(i.getEffect());
                } else {
                    player.addEffect(i);
                }
            }
        }
        if (action != null) {
            action.accept(level, player, stack);
        }

        int repairtype = repairamount > 0 ? 1 : repairpercentage > 0 ? 2 : 0;
        if (repairtype > 0) {
            player.getInventory().items.forEach((is) -> {
                if (is.isDamageableItem()) {
                    is.setDamageValue((int) (Math.max(0, is.getDamageValue() - (repairtype == 1 ? repairamount : is.getMaxDamage() * repairpercentage))));
                }
            });
        }
    }

    public Consumable removeEffect(MobEffect effect) {
        if (effects == null) {
            effects = new ArrayList<>();
        }
        effects.add(new MobEffectInstance(effect, 0, 0, false, false));  // We don't need duration or amplifier for removal
        return this;
    }


    protected void consumeItem(Level level, Player player, ItemStack stack) {
        if (useSoundSupplier != null && !level.isClientSide) {
            SoundEvent sound = useSoundSupplier.get();
            if (sound != null) {
                level.playSound(null, player.getX(), player.getY(), player.getZ(), sound, SoundSource.PLAYERS, 1.0F, 1.0F);
            }
        }
        doEffect(level, player, stack);
        damage(stack, player, 1);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        // Check if the player is hungry or the item is always edible
        boolean canEat = player.getFoodData().needsFood() || alwaysEdible;
        // Only allow consumption if the player is hungry or the item is marked as always edible
        if (canEat) {
            if (useinstantly) {
                // Play sound and consume item instantly
                if (useSoundSupplier != null && !level.isClientSide) {
                    SoundEvent sound = useSoundSupplier.get();
                    if (sound != null) {
                        level.playSound(null, player.getX(), player.getY(), player.getZ(), sound, SoundSource.PLAYERS, 1.0F, 1.0F);
                    }
                }
                consumeItem(level, player, stack); // Use the renamed method
                return InteractionResultHolder.consume(stack);
            }
            // Start normal consumption (holding the item to eat)
            player.startUsingItem(hand);
            return InteractionResultHolder.consume(stack);
        }
        // If the player can't eat, return fail
        return InteractionResultHolder.fail(stack);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        // Ensure we only apply the effect if the entity is a player and they can eat
        if (entity instanceof Player) {
            Player player = (Player) entity;
            // Check if the player can eat (either because they need food or it's always edible)
            boolean canEat = player.getFoodData().needsFood() || alwaysEdible;
            // Only consume the item if the player can eat
            if (canEat) {
                consumeItem(level, player, stack); // Use the renamed method
            }
        }

        return stack;
    }

    @Override
    public int getUseDuration(ItemStack stack)
    {
        return usetime;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack)
    {
        return useaction;
    }
}