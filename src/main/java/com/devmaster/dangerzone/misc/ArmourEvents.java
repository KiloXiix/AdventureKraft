// === DIRECT PORT OF ARMOR EVENTS FROM 1.16.5 Chaos-Update ===

package com.devmaster.dangerzone.misc;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.damagesource.DamageSource;

import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingTickEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.Event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class ArmourEvents {
    private EventType type;
    private float eventmodifier;
    private QuadConsumer<Player, Entity, DamageSource, ItemStack> action;
    private QuadPredicate<Player, Entity, DamageSource, ItemStack> condition;

    public static HashMap<EventType, ArrayList<ArmourEvents>> eventlist = new HashMap<>();

    public ArmourEvents(EventType type, QuadPredicate<Player, Entity, DamageSource, ItemStack> condition, QuadConsumer<Player, Entity, DamageSource, ItemStack> action) {
        this.type = type;
        this.condition = condition != null ? condition : (player, enemy, source, helditem) -> true;
        this.action = action;
        this.eventmodifier = 1.0f;
    }

    public static void addEvent(ArmourEvents event) {
        eventlist.computeIfAbsent(event.getEventType(), k -> new ArrayList<>()).add(event);
    }

    public EventType getEventType() {
        return type;
    }

    public float getModifier() {
        return eventmodifier;
    }

    public QuadPredicate<Player, Entity, DamageSource, ItemStack> getCondition() {
        return condition;
    }

    public QuadConsumer<Player, Entity, DamageSource, ItemStack> getAction() {
        return action;
    }

    public void doEvents(EventType type, Event event, Player player, LivingEntity target) {
        if (eventlist.containsKey(type)) {
            ItemStack stack = player.getMainHandItem();
            for (ArmourEvents e : eventlist.get(type)) {
                if (event instanceof LivingHurtEvent ev) {
                    if (e.getCondition().test(player, target, ev.getSource(), stack)) {
                        ev.setAmount(ev.getAmount() * e.getModifier());
                        e.getAction().accept(player, target, ev.getSource(), stack);
                    }
                } else if (event instanceof LivingDamageEvent ev) {
                    if (e.getCondition().test(player, target, ev.getSource(), stack)) {
                        ev.setAmount(ev.getAmount() * e.getModifier());
                        e.getAction().accept(player, target, ev.getSource(), stack);
                    }
                } else if (event instanceof LivingFallEvent ev) {
                    if (e.getCondition().test(player, null, null, stack)) {
                        ev.setDistance(ev.getDistance() * e.getModifier());
                        e.getAction().accept(player, null, null, stack);
                    }
                } else if (event instanceof LivingJumpEvent) {
                    if (e.getCondition().test(player, null, null, stack)) {
                        player.setDeltaMovement(
                                player.getDeltaMovement().x(),
                                player.getDeltaMovement().y() * e.getModifier(),
                                player.getDeltaMovement().z()
                        );
                        e.getAction().accept(player, null, null, stack);
                    }
                } else if (event instanceof LivingTickEvent) {
                    if (e.getCondition().test(player, null, null, stack)) {
                        e.getAction().accept(player, null, null, stack);
                    }
                }
            }
        }
    }

    public static enum EventType {
        Auto
//        ,PlayerFell,
//        PlayerJumped,
//        PlayerHurtByProjectile,
//        PlayerHurtByMelee,
//        PlayerHurtByMagic,
//        PlayerCausedProjectileDamage,
//        PlayerCausedMeleeDamage,
//        PlayerCausedMagicDamage,
//        CritChance;
    }

    @FunctionalInterface
    public interface QuadConsumer<K, V, S, T> {
        void accept(K k, V v, S s, T t);
    }

    @FunctionalInterface
    public interface QuadPredicate<T, U, V, W> {
        boolean test(T t, U u, V v, W w);

        default QuadPredicate<T, U, V, W> and(QuadPredicate<? super T, ? super U, ? super V, ? super W> other) {
            Objects.requireNonNull(other);
            return (t, u, v, w) -> test(t, u, v, w) && other.test(t, u, v, w);
        }

        default QuadPredicate<T, U, V, W> negate() {
            return (t, u, v, w) -> !test(t, u, v, w);
        }

        default QuadPredicate<T, U, V, W> or(QuadPredicate<? super T, ? super U, ? super V, ? super W> other) {
            Objects.requireNonNull(other);
            return (t, u, v, w) -> test(t, u, v, w) || other.test(t, u, v, w);
        }
    }
}
