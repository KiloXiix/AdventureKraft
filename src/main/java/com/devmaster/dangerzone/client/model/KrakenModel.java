package com.devmaster.dangerzone.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class KrakenModel<T extends Entity> extends EntityModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in
    // the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dangerzone", "kraken_model"), "main");
    public final ModelPart HeadBody;
    public final ModelPart LeftFins;
    public final ModelPart RightFins;
    public final ModelPart Mouth;
    public final ModelPart BeakLeft;
    public final ModelPart BeakRight;
    public final ModelPart Tentacle1;
    public final ModelPart Tentacle1_1;
    public final ModelPart Tentacle1_2;
    public final ModelPart Tentacle1_3;
    public final ModelPart Tentacle1_4;
    public final ModelPart Tentacle2;
    public final ModelPart Tentacle2_1;
    public final ModelPart Tentacle2_2;
    public final ModelPart Tentacle2_3;
    public final ModelPart Tentacle2_4;
    public final ModelPart Tentacle3;
    public final ModelPart Tentacle3_1;
    public final ModelPart Tentacle3_2;
    public final ModelPart Tentacle3_3;
    public final ModelPart Tentacle4;
    public final ModelPart Tentacle4_1;
    public final ModelPart Tentacle4_2;
    public final ModelPart Tentacle4_3;
    public final ModelPart InnerTentacle1;
    public final ModelPart InnerTentacle1_1;
    public final ModelPart InnerTentacle1_2;
    public final ModelPart InnerTentacle2;
    public final ModelPart InnerTentacle2_1;
    public final ModelPart InnerTentacle2_2;
    public final ModelPart InnerTentacle3;
    public final ModelPart InnerTentacle3_1;
    public final ModelPart InnerTentacle3_2;
    public final ModelPart InnerTentacle4;
    public final ModelPart InnerTentacle4_1;
    public final ModelPart InnerTentacle4_2;
    public final ModelPart InnerTentacle5;
    public final ModelPart InnerTentacle5_1;
    public final ModelPart InnerTentacle6_4;
    public final ModelPart InnerTentacle6;
    public final ModelPart InnerTentacle6_1;
    public final ModelPart InnerTentacle6_2;

    public KrakenModel(ModelPart root) {
        this.HeadBody = root.getChild("HeadBody");
        this.LeftFins = this.HeadBody.getChild("LeftFins");
        this.RightFins = this.HeadBody.getChild("RightFins");
        this.Mouth = root.getChild("Mouth");
        this.BeakLeft = this.Mouth.getChild("BeakLeft");
        this.BeakRight = this.Mouth.getChild("BeakRight");
        this.Tentacle1 = root.getChild("Tentacle1");
        this.Tentacle1_1 = this.Tentacle1.getChild("Tentacle1_1");
        this.Tentacle1_2 = this.Tentacle1_1.getChild("Tentacle1_2");
        this.Tentacle1_3 = this.Tentacle1_2.getChild("Tentacle1_3");
        this.Tentacle1_4 = this.Tentacle1_3.getChild("Tentacle1_4");
        this.Tentacle2 = root.getChild("Tentacle2");
        this.Tentacle2_1 = this.Tentacle2.getChild("Tentacle2_1");
        this.Tentacle2_2 = this.Tentacle2_1.getChild("Tentacle2_2");
        this.Tentacle2_3 = this.Tentacle2_2.getChild("Tentacle2_3");
        this.Tentacle2_4 = this.Tentacle2_3.getChild("Tentacle2_4");
        this.Tentacle3 = root.getChild("Tentacle3");
        this.Tentacle3_1 = this.Tentacle3.getChild("Tentacle3_1");
        this.Tentacle3_2 = this.Tentacle3_1.getChild("Tentacle3_2");
        this.Tentacle3_3 = this.Tentacle3_2.getChild("Tentacle3_3");
        this.Tentacle4 = root.getChild("Tentacle4");
        this.Tentacle4_1 = this.Tentacle4.getChild("Tentacle4_1");
        this.Tentacle4_2 = this.Tentacle4_1.getChild("Tentacle4_2");
        this.Tentacle4_3 = this.Tentacle4_2.getChild("Tentacle4_3");
        this.InnerTentacle1 = root.getChild("InnerTentacle1");
        this.InnerTentacle1_1 = this.InnerTentacle1.getChild("InnerTentacle1_1");
        this.InnerTentacle1_2 = this.InnerTentacle1_1.getChild("InnerTentacle1_2");
        this.InnerTentacle2 = root.getChild("InnerTentacle2");
        this.InnerTentacle2_1 = this.InnerTentacle2.getChild("InnerTentacle2_1");
        this.InnerTentacle2_2 = this.InnerTentacle2_1.getChild("InnerTentacle2_2");
        this.InnerTentacle3 = root.getChild("InnerTentacle3");
        this.InnerTentacle3_1 = this.InnerTentacle3.getChild("InnerTentacle3_1");
        this.InnerTentacle3_2 = this.InnerTentacle3_1.getChild("InnerTentacle3_2");
        this.InnerTentacle4 = root.getChild("InnerTentacle4");
        this.InnerTentacle4_1 = this.InnerTentacle4.getChild("InnerTentacle4_1");
        this.InnerTentacle4_2 = this.InnerTentacle4_1.getChild("InnerTentacle4_2");
        this.InnerTentacle5 = root.getChild("InnerTentacle5");
        this.InnerTentacle5_1 = this.InnerTentacle5.getChild("InnerTentacle5_1");
        this.InnerTentacle6_4 = this.InnerTentacle5_1.getChild("InnerTentacle6_4");
        this.InnerTentacle6 = root.getChild("InnerTentacle6");
        this.InnerTentacle6_1 = this.InnerTentacle6.getChild("InnerTentacle6_1");
        this.InnerTentacle6_2 = this.InnerTentacle6_1.getChild("InnerTentacle6_2");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition HeadBody = partdefinition.addOrReplaceChild("HeadBody",
                CubeListBuilder.create().texOffs(0, 139).addBox(-9.9F, -39.35F, 25.05F, 20.0F, 20.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(0, 211).addBox(-10.9F, -38.35F, 93.05F, 22.0F, 18.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(0, 220)
                        .addBox(-9.9F, -36.35F, 120.05F, 20.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 194).addBox(-11.9F, -41.35F, 55.05F, 24.0F, 24.0F, 38.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.1F, 36.0F, 31.4F, 1.5708F, 0.0F, 0.0F));
        PartDefinition LeftFins = HeadBody.addOrReplaceChild("LeftFins",
                CubeListBuilder.create().texOffs(0, 231).addBox(-0.75F, -1.85F, -7.6F, 16.0F, 3.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 226).addBox(0.25F, -1.85F, -34.6F, 17.0F, 3.0F, 27.0F, new CubeDeformation(0.0F)),
                PartPose.offset(10.85F, -28.5F, 127.65F));
        PartDefinition RightFins = HeadBody.addOrReplaceChild("RightFins",
                CubeListBuilder.create().texOffs(0, 231).addBox(-15.25F, -1.85F, -7.6F, 16.0F, 3.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 226).addBox(-17.25F, -1.85F, -34.6F, 17.0F, 3.0F, 27.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-10.65F, -28.5F, 127.65F));
        PartDefinition Mouth = partdefinition.addOrReplaceChild("Mouth",
                CubeListBuilder.create().texOffs(65, 225).addBox(10.0083F, 15.0042F, -7.95F, 3.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(65, 225).addBox(-12.9917F, 15.0042F, -7.95F, 3.0F, 3.0F, 18.0F, new CubeDeformation(0.0F))
                        .texOffs(65, 225).addBox(10.0083F, -7.9958F, -7.95F, 3.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(65, 225).addBox(-12.9917F, -7.9958F, -7.95F, 3.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 236)
                        .addBox(-9.9917F, -6.9958F, -8.95F, 20.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 218).addBox(-9.9917F, 15.0042F, -8.95F, 20.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 218)
                        .addBox(-11.9917F, -4.9958F, -8.95F, 2.0F, 20.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(236, 246).addBox(8.0083F, -3.9958F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(236, 246)
                        .addBox(6.0083F, -1.9958F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(236, 246).addBox(-6.9917F, -1.9958F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(236, 246)
                        .addBox(-6.9917F, 11.0042F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(236, 246).addBox(6.0083F, 11.0042F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(236, 246)
                        .addBox(8.0083F, 13.0042F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(236, 246).addBox(2.0083F, -3.9958F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(236, 246)
                        .addBox(2.0083F, 13.0042F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(236, 246).addBox(6.0083F, -3.9958F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(236, 246)
                        .addBox(6.0083F, 13.0042F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246).addBox(-0.9917F, -3.9958F, -10.95F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246)
                        .addBox(-0.9917F, 13.0042F, -10.95F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246).addBox(-4.9917F, -3.9958F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246)
                        .addBox(-4.9917F, 13.0042F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246).addBox(4.0083F, -3.9958F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246)
                        .addBox(4.0083F, 13.0042F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246).addBox(-2.9917F, -3.9958F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246)
                        .addBox(-2.9917F, 13.0042F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246).addBox(-6.9917F, -3.9958F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246)
                        .addBox(-6.9917F, 13.0042F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246).addBox(-8.9917F, -3.9958F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246)
                        .addBox(-8.9917F, -1.9958F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246).addBox(8.0083F, -1.9958F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246)
                        .addBox(-8.9917F, 0.0042F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246).addBox(8.0083F, 0.0042F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246)
                        .addBox(-8.9917F, 1.9042F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246).addBox(8.0083F, 1.9042F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246)
                        .addBox(-8.9917F, 13.0042F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246).addBox(-8.9917F, 11.0042F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246)
                        .addBox(8.0083F, 11.0042F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246).addBox(-8.9917F, 9.0042F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246)
                        .addBox(8.0083F, 9.0042F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246).addBox(-8.9917F, 7.0042F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246)
                        .addBox(8.0083F, 7.0042F, -10.95F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246).addBox(-8.9917F, 4.0042F, -10.95F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(234, 246)
                        .addBox(8.0083F, 4.0042F, -10.95F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 218).addBox(10.0083F, -4.9958F, -8.95F, 2.0F, 20.0F, 18.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.0083F, 8.9958F, -2.95F, 1.5708F, 0.0F, 0.0F));
        PartDefinition BeakLeft = Mouth.addOrReplaceChild("BeakLeft",
                CubeListBuilder.create().texOffs(124, 245).addBox(-2.5F, -3.2F, -8.85F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(124, 245).addBox(2.5F, -2.2F, -8.85F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(124, 245)
                        .addBox(-4.5F, -2.2F, -8.85F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(124, 246).addBox(-2.5F, -2.2F, -16.85F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.1917F, 5.2542F, -2.1F, 0.0F, 0.0F, 1.5708F));
        PartDefinition BeakRight = Mouth.addOrReplaceChild("BeakRight",
                CubeListBuilder.create().texOffs(124, 245).addBox(-2.5F, -2.8F, -8.85F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(124, 245).addBox(2.5F, -1.8F, -8.85F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(124, 245)
                        .addBox(-4.5F, -1.8F, -8.85F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(124, 246).addBox(-2.5F, -1.8F, -16.85F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.1917F, 5.2542F, -2.1F, 0.0F, 0.0F, -1.5708F));
        PartDefinition Tentacle1 = partdefinition.addOrReplaceChild("Tentacle1", CubeListBuilder.create().texOffs(54, 229).addBox(-0.5F, -3.6F, -3.8F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(12.5F, 5.1F, -3.4F, 1.5708F, 0.0F, 0.0F));
        PartDefinition Tentacle1_1 = Tentacle1.addOrReplaceChild("Tentacle1_1", CubeListBuilder.create().texOffs(12, 215).addBox(-0.5F, -2.6F, -23.8F, 6.0F, 6.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 0.0F, 0.0F));
        PartDefinition Tentacle1_2 = Tentacle1_1.addOrReplaceChild("Tentacle1_2", CubeListBuilder.create().texOffs(0, 199).addBox(-2.5F, -1.6F, -52.8F, 5.0F, 4.0F, 53.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, -24.0F));
        PartDefinition Tentacle1_3 = Tentacle1_2.addOrReplaceChild("Tentacle1_3", CubeListBuilder.create().texOffs(16, 208).addBox(-1.5F, -0.6F, -46.0F, 3.0F, 2.0F, 46.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -52.8F));
        PartDefinition Tentacle1_4 = Tentacle1_3.addOrReplaceChild("Tentacle1_4", CubeListBuilder.create().texOffs(151, 219).addBox(-1.5F, -2.6F, -25.0F, 5.0F, 6.0F, 25.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -46.0F));
        PartDefinition Tentacle2 = partdefinition.addOrReplaceChild("Tentacle2", CubeListBuilder.create().texOffs(54, 229).addBox(-0.5F, -3.0F, -3.8F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-12.5F, 5.1F, -1.95F, 1.5708F, 3.1416F, 0.0F));
        PartDefinition Tentacle2_1 = Tentacle2.addOrReplaceChild("Tentacle2_1", CubeListBuilder.create().texOffs(12, 215).addBox(-0.5F, -2.0F, -23.8F, 6.0F, 6.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 0.0F, 0.0F));
        PartDefinition Tentacle2_2 = Tentacle2_1.addOrReplaceChild("Tentacle2_2", CubeListBuilder.create().texOffs(0, 199).addBox(-2.5F, -1.0F, -52.8F, 5.0F, 4.0F, 53.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, -24.0F));
        PartDefinition Tentacle2_3 = Tentacle2_2.addOrReplaceChild("Tentacle2_3", CubeListBuilder.create().texOffs(16, 208).addBox(-1.5F, 0.0F, -46.0F, 3.0F, 2.0F, 46.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -52.8F));
        PartDefinition Tentacle2_4 = Tentacle2_3.addOrReplaceChild("Tentacle2_4", CubeListBuilder.create().texOffs(151, 219).addBox(-1.5F, -2.0F, -25.0F, 5.0F, 6.0F, 25.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -46.0F));
        PartDefinition Tentacle3 = partdefinition.addOrReplaceChild("Tentacle3", CubeListBuilder.create().texOffs(54, 229).addBox(0.0F, -5.8F, -2.975F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(12.0F, 5.9F, 8.875F, 1.5708F, 0.0F, 0.0F));
        PartDefinition Tentacle3_1 = Tentacle3.addOrReplaceChild("Tentacle3_1", CubeListBuilder.create().texOffs(12, 215).addBox(0.0F, -3.05F, -27.975F, 6.0F, 6.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -1.75F, 1.0F));
        PartDefinition Tentacle3_2 = Tentacle3_1.addOrReplaceChild("Tentacle3_2", CubeListBuilder.create().texOffs(47, 223).addBox(-2.25F, -2.05F, -28.975F, 5.0F, 4.0F, 29.0F, new CubeDeformation(0.0F)), PartPose.offset(2.25F, 0.0F, -28.0F));
        PartDefinition Tentacle3_3 = Tentacle3_2.addOrReplaceChild("Tentacle3_3", CubeListBuilder.create().texOffs(40, 219).addBox(-1.25F, -1.05F, -28.975F, 3.0F, 2.0F, 29.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -29.0F));
        PartDefinition Tentacle4 = partdefinition.addOrReplaceChild("Tentacle4", CubeListBuilder.create().texOffs(54, 229).addBox(0.0F, -5.4F, -2.975F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-12.0F, 5.9F, 5.675F, 1.5708F, 3.1416F, 0.0F));
        PartDefinition Tentacle4_1 = Tentacle4.addOrReplaceChild("Tentacle4_1", CubeListBuilder.create().texOffs(12, 215).addBox(0.0F, -2.65F, -27.975F, 6.0F, 6.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -1.75F, 1.0F));
        PartDefinition Tentacle4_2 = Tentacle4_1.addOrReplaceChild("Tentacle4_2", CubeListBuilder.create().texOffs(47, 223).addBox(-2.25F, -1.65F, -28.975F, 5.0F, 4.0F, 29.0F, new CubeDeformation(0.0F)), PartPose.offset(2.25F, 0.0F, -28.0F));
        PartDefinition Tentacle4_3 = Tentacle4_2.addOrReplaceChild("Tentacle4_3", CubeListBuilder.create().texOffs(40, 219).addBox(-1.25F, -0.65F, -28.975F, 3.0F, 2.0F, 29.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -29.0F));
        PartDefinition InnerTentacle1 = partdefinition.addOrReplaceChild("InnerTentacle1", CubeListBuilder.create().texOffs(18, 219).addBox(1.0F, -3.85F, -29.8333F, 6.0F, 6.0F, 31.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(12.0F, 13.0F, 2.1333F, 1.5708F, 0.0F, 0.0F));
        PartDefinition InnerTentacle1_1 = InnerTentacle1.addOrReplaceChild("InnerTentacle1_1", CubeListBuilder.create().texOffs(26, 221).addBox(-2.0F, -1.9F, -30.9833F, 4.0F, 4.0F, 31.0F, new CubeDeformation(0.0F)),
                PartPose.offset(4.0F, -0.95F, -29.85F));
        PartDefinition InnerTentacle1_2 = InnerTentacle1_1.addOrReplaceChild("InnerTentacle1_2", CubeListBuilder.create().texOffs(26, 212).addBox(-1.0F, -0.9F, -34.9833F, 2.0F, 2.0F, 35.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, -31.0F));
        PartDefinition InnerTentacle2 = partdefinition.addOrReplaceChild("InnerTentacle2", CubeListBuilder.create().texOffs(18, 219).addBox(1.0F, -3.85F, -29.8333F, 6.0F, 6.0F, 31.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-11.0F, 13.0F, 0.1333F, 1.5708F, 3.1416F, 0.0F));
        PartDefinition InnerTentacle2_1 = InnerTentacle2.addOrReplaceChild("InnerTentacle2_1", CubeListBuilder.create().texOffs(26, 221).addBox(-2.0F, -1.9F, -30.9833F, 4.0F, 4.0F, 31.0F, new CubeDeformation(0.0F)),
                PartPose.offset(4.0F, -0.95F, -29.85F));
        PartDefinition InnerTentacle2_2 = InnerTentacle2_1.addOrReplaceChild("InnerTentacle2_2", CubeListBuilder.create().texOffs(26, 212).addBox(-1.0F, -0.9F, -34.9833F, 2.0F, 2.0F, 35.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, -31.0F));
        PartDefinition InnerTentacle3 = partdefinition.addOrReplaceChild("InnerTentacle3", CubeListBuilder.create().texOffs(18, 219).addBox(-2.825F, -5.1F, -24.8333F, 6.0F, 6.0F, 31.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.2F, 17.1F, -10.8667F, 1.5708F, 0.0F, 0.0F));
        PartDefinition InnerTentacle3_1 = InnerTentacle3.addOrReplaceChild("InnerTentacle3_1", CubeListBuilder.create().texOffs(26, 221).addBox(-1.825F, -2.15F, -30.9833F, 4.0F, 4.0F, 31.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -1.95F, -24.85F));
        PartDefinition InnerTentacle3_2 = InnerTentacle3_1.addOrReplaceChild("InnerTentacle3_2", CubeListBuilder.create().texOffs(26, 212).addBox(-0.825F, -1.15F, -34.9833F, 2.0F, 2.0F, 35.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, -31.0F));
        PartDefinition InnerTentacle4 = partdefinition.addOrReplaceChild("InnerTentacle4", CubeListBuilder.create().texOffs(18, 219).addBox(-3.0F, -7.85F, -24.8333F, 6.0F, 6.0F, 31.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.075F, 17.1F, -8.1167F, 1.5708F, 0.0F, 0.0F));
        PartDefinition InnerTentacle4_1 = InnerTentacle4.addOrReplaceChild("InnerTentacle4_1", CubeListBuilder.create().texOffs(26, 221).addBox(-2.0F, -1.9F, -30.9833F, 4.0F, 4.0F, 31.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -4.95F, -24.85F));
        PartDefinition InnerTentacle4_2 = InnerTentacle4_1.addOrReplaceChild("InnerTentacle4_2", CubeListBuilder.create().texOffs(26, 212).addBox(-1.0F, -0.9F, -34.9833F, 2.0F, 2.0F, 35.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, -31.0F));
        PartDefinition InnerTentacle5 = partdefinition.addOrReplaceChild("InnerTentacle5", CubeListBuilder.create().texOffs(18, 219).addBox(-2.875F, 0.375F, -24.9083F, 6.0F, 6.0F, 31.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.075F, 17.075F, 13.6833F, 1.5708F, 0.0F, 0.0F));
        PartDefinition InnerTentacle5_1 = InnerTentacle5.addOrReplaceChild("InnerTentacle5_1", CubeListBuilder.create().texOffs(26, 221).addBox(-2.05F, -1.7F, -30.5083F, 4.0F, 4.0F, 31.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.175F, 3.075F, -25.4F));
        PartDefinition InnerTentacle6_4 = InnerTentacle5_1.addOrReplaceChild("InnerTentacle6_4", CubeListBuilder.create().texOffs(26, 212).addBox(-1.05F, -1.0F, -34.5083F, 2.0F, 2.0F, 35.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.3F, -31.0F));
        PartDefinition InnerTentacle6 = partdefinition.addOrReplaceChild("InnerTentacle6", CubeListBuilder.create().texOffs(18, 219).addBox(-2.875F, 0.375F, -24.9083F, 6.0F, 6.0F, 31.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.925F, 17.075F, 13.6833F, 1.5708F, 0.0F, 0.0F));
        PartDefinition InnerTentacle6_1 = InnerTentacle6.addOrReplaceChild("InnerTentacle6_1", CubeListBuilder.create().texOffs(26, 221).addBox(-2.05F, -1.7F, -30.5083F, 4.0F, 4.0F, 31.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.175F, 3.075F, -25.4F));
        PartDefinition InnerTentacle6_2 = InnerTentacle6_1.addOrReplaceChild("InnerTentacle6_2", CubeListBuilder.create().texOffs(26, 212).addBox(-1.05F, -0.9F, -34.5083F, 2.0F, 2.0F, 35.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.2F, -31.0F));
        return LayerDefinition.create(meshdefinition, 256, 256);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        HeadBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        Mouth.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        Tentacle1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        Tentacle2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        Tentacle3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        Tentacle4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        InnerTentacle1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        InnerTentacle2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        InnerTentacle3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        InnerTentacle4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        InnerTentacle5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        InnerTentacle6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
