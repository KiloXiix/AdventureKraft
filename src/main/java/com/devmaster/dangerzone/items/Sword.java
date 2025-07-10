// === Base Item Class for Sword Items to be used for reference later ===

package com.devmaster.dangerzone.items;

import com.devmaster.dangerzone.misc.DangerZone;
import com.devmaster.dangerzone.util.ModdedTier;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.collect.Multimap;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.ForgeMod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Sword extends SwordItem
{
    public int durabilityMultiplier;
    protected static final UUID MOVESPEED = UUID.fromString("35f5b798-7778-4017-98f9-ff557dc28f03");
    protected static final UUID REACH = UUID.fromString("168fad76-3979-4638-91c9-a366c0933551");
    protected String name;
    private String[] info = new String[0];
    protected float reach = 0, movespeed = 0, attackspeed = 0;
    protected Multimap<Attribute, AttributeModifier> modifiers;
    protected ItemStack repairitem;
    protected Map<Enchantment, Integer> defaultEnchantments = new HashMap<>();
    // NBT keys to track if the item has received enchantments
    private static final String HAS_ENCHANTS_TAG = "hasEnchants";

    public Sword(ModdedTier tier, int durabilityMultiplier)
    {
        super(tier, -1, -2.4f, new Properties());
        this.repairitem = tier.getRepairIngredient().getItems()[0];
        this.durabilityMultiplier = durabilityMultiplier;  // Set multiplier when registering
    }

    public Sword build(float reach, float movespeed)
    {
        this.reach = reach;
        this.movespeed = movespeed;
        Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Sword modifier", (double) getDamage(), AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Sword modifier", (double) (-2.4f), AttributeModifier.Operation.ADDITION));
        modifiers = builder.build();
        return this;
    }

    public Sword rebuild()
    {
        Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        if (movespeed != 0)
        {
            builder.put(Attributes.MOVEMENT_SPEED, new AttributeModifier(MOVESPEED, "Sword modifier", (double) movespeed, AttributeModifier.Operation.MULTIPLY_TOTAL));
        }
        if (reach != 0)
        {
            builder.put(ForgeMod.ENTITY_REACH.get(), new AttributeModifier(REACH, "Sword modifier", (double) reach, AttributeModifier.Operation.MULTIPLY_TOTAL));
        }
        modifiers = builder.build();

        return this;
    }

    // Method to add default enchantments when registering the sword
    public Sword addDefaultEnchantment(Enchantment enchantment, int level) {
        this.defaultEnchantments.put(enchantment, level);
        return this;
    }

    // Apply default enchantments when the sword is created or retrieved from the inventory
    @Override
    public void onCraftedBy(ItemStack stack, Level level, Player player) {
        super.onCraftedBy(stack, level, player);
        applyDefaultEnchantments(stack);
    }

    // Adjust inventoryTick to work for any LivingEntity (players, zombies, etc.)
    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, level, entity, slot, selected);

        // Apply enchantments if the entity is a LivingEntity (includes players, zombies, etc.)
        if (entity instanceof LivingEntity) {
            applyDefaultEnchantments(stack);
        }
    }

    // Apply the default enchantments to the item stack if they are not already present
    private void applyDefaultEnchantments(ItemStack stack) {
        // Check if the enchantments have already been applied by checking the custom NBT tag
        if (stack.hasTag() && stack.getTag().getBoolean(HAS_ENCHANTS_TAG)) {
            return;  // Enchantments already applied, so skip
        }

        // Apply default enchantments
        for (Map.Entry<Enchantment, Integer> entry : defaultEnchantments.entrySet()) {
            Enchantment enchantment = entry.getKey();
            int level = entry.getValue();

            // Add the enchantment to the item
            stack.enchant(enchantment, level);
        }

        // Mark the item with the custom NBT tag to indicate that enchantments have been applied
        stack.getOrCreateTag().putBoolean(HAS_ENCHANTS_TAG, true);
    }

    public Sword rebuildWith(Attribute attribute, UUID id, String modifiername, double value, AttributeModifier.Operation valuetype)
    {
        Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        builder.put(attribute, new AttributeModifier(id, modifiername, value, valuetype));
        modifiers = builder.build();
        return this;
    }

    public Sword addInfo(String... newInfo) {
        if (newInfo != null && newInfo.length > 0) {
            String[] combinedInfo = new String[this.info.length + newInfo.length];
            System.arraycopy(this.info, 0, combinedInfo, 0, this.info.length);
            System.arraycopy(newInfo, 0, combinedInfo, this.info.length, newInfo.length);
            this.info = combinedInfo;
        }
        return this;
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag){
        for (String s : info) {
            tooltip.add(Component.literal(s));
        }
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot slot)
    {
        if (slot == EquipmentSlot.MAINHAND)
        {
            return modifiers;
        }
        return super.getDefaultAttributeModifiers(slot);
    }
}