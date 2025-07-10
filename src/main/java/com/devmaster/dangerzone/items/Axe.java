// === Base Item Class for Axe Items to be used for reference later ===

package com.devmaster.dangerzone.items;

import com.devmaster.dangerzone.misc.DangerZone;
import com.devmaster.dangerzone.util.ModdedTier;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.collect.Multimap;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeMod;

import java.util.List;
import java.util.UUID;

public class Axe extends AxeItem
{
    protected static final UUID MOVESPEED = UUID.fromString("35f5b798-7778-4017-98f9-ff557dc28f03");
    protected static final UUID REACH = UUID.fromString("168fad76-3979-4638-91c9-a366c0933551");
    protected String name;
    private String[] info = new String[0];
    protected float reach = 0, movespeed = 0, attackspeed = 0;
    protected Multimap<Attribute, AttributeModifier> modifiers;
    protected ItemStack repairitem;
    public int durabilityMultiplier;

    public Axe(ModdedTier tier, int durabilityMultiplier)
    {
        super(tier, -1, -2.4F, new Properties());
        this.repairitem = tier.getRepairItem();
        this.durabilityMultiplier = durabilityMultiplier;  // Set multiplier when registering
    }

    public Axe build(float reach, float movespeed)
    {
        this.reach = reach;
        this.movespeed = movespeed;
        Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Axe modifier", (double) getAttackDamage(), Operation.ADDITION));
        builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Axe modifier", (double) (-2.4f), Operation.ADDITION));
        modifiers = builder.build();
        return this;
    }

    public Axe rebuild()
    {
        Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        if (movespeed != 0)
        {
            builder.put(Attributes.MOVEMENT_SPEED, new AttributeModifier(MOVESPEED, "Axe modifier", (double) movespeed, Operation.MULTIPLY_TOTAL));
        }
        if (reach != 0)
        {
            builder.put(ForgeMod.BLOCK_REACH.get(), new AttributeModifier(REACH, "Axe modifier", (double) reach, Operation.MULTIPLY_TOTAL));
        }
        modifiers = builder.build();

        return this;
    }

    public Axe rebuildWith(Attribute attribute, UUID id, String modifiername, double value, Operation valuetype)
    {
        Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        builder.put(attribute, new AttributeModifier(id, modifiername, value, valuetype));
        modifiers = builder.build();
        return this;
    }

    public Axe addInfo(String... newInfo) {
        if (newInfo != null && newInfo.length > 0) {
            String[] combinedInfo = new String[this.info.length + newInfo.length];
            System.arraycopy(this.info, 0, combinedInfo, 0, this.info.length);
            System.arraycopy(newInfo, 0, combinedInfo, this.info.length, newInfo.length);
            this.info = combinedInfo;
        }
        return this;
    }

    @Override
    public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
        for (String s : info) {
            tooltip.add(Component.literal(s));
        }
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot slot, ItemStack stack)
    {
        if (slot == EquipmentSlot.MAINHAND)
        {
            return modifiers;
        }

        return super.getAttributeModifiers(slot, stack);
    }
}