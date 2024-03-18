package mod.arcalitegames.odyssey.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.odyssey.entity.animations.common.DrinkingAnimation;
import mod.arcalitegames.odyssey.entity.animations.common.EatingAnimation;
import mod.arcalitegames.odyssey.entity.animations.common.KickingAnimation;
import mod.arcalitegames.odyssey.entity.animations.common.WalkingAnimation;
import mod.arcalitegames.odyssey.entity.animations.common.YawningAnimation;
import mod.arcalitegames.odyssey.entity.animations.merchant.DispensingAnimation;
import mod.arcalitegames.odyssey.entity.animations.merchant.LeaningAnimation;
import mod.arcalitegames.odyssey.entity.animations.merchant.WipingAnimation;
import mod.arcalitegames.odyssey.entity.passive.MerchantEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class MerchantModel<T extends MerchantEntity> extends EntityModel<T>
{
	private final ModelRenderer UpperBody;
	private final ModelRenderer Head;
	private final ModelRenderer RightArm;
	private final ModelRenderer RightForeArm;
	private final ModelRenderer Cloth;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftForeArm;
	private final ModelRenderer LowerBody;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightCalf;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer LeftCalf;
	
	private final WalkingAnimation walkingAnimation;
	private final WipingAnimation wipingAnimation;
	private final LeaningAnimation leaningAnimation;
	private final DispensingAnimation dispensingAnimation;
	private final YawningAnimation yawningAnimation;
	private final KickingAnimation kickingAnimation;
	private final DrinkingAnimation drinkingAnimation;
	private final EatingAnimation eatingAnimation;

	public MerchantModel()
	{
		textureWidth = 64;
		textureHeight = 64;

		UpperBody = new ModelRenderer(this);
		UpperBody.setRotationPoint(0.0F, 9.0F, 0.0F);
		UpperBody.setTextureOffset(32, 0).addBox(-4.0F, -9.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -9.0F, 0.0F);
		UpperBody.addChild(Head);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-4.0F, -8.0F, 0.0F);
		UpperBody.addChild(RightArm);
		RightArm.setTextureOffset(32, 32).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		RightForeArm = new ModelRenderer(this);
		RightForeArm.setRotationPoint(-2.0F, 3.0F, 0.0F);
		RightArm.addChild(RightForeArm);
		RightForeArm.setTextureOffset(48, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		Cloth = new ModelRenderer(this);
		Cloth.setRotationPoint(6.0F, 20.0F, 0.0F);
		RightForeArm.addChild(Cloth);
		Cloth.setTextureOffset(52, 14).addBox(-9.0F, -15.0F, 2.0F, 5.0F, 4.0F, 1.0F, 0.0F, false);
		Cloth.showModel = false;
		
		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(4.0F, -8.0F, 0.0F);
		UpperBody.addChild(LeftArm);
		LeftArm.setTextureOffset(32, 48).addBox(0.0F, -1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		LeftForeArm = new ModelRenderer(this);
		LeftForeArm.setRotationPoint(2.0F, 3.0F, 0.0F);
		LeftArm.addChild(LeftForeArm);
		LeftForeArm.setTextureOffset(48, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		LowerBody = new ModelRenderer(this);
		LowerBody.setRotationPoint(0.0F, 8.0F, 0.0F);
		LowerBody.setTextureOffset(20, 24).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 4.0F, 4.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 3.0F, 0.0F);
		LowerBody.addChild(RightLeg);
		RightLeg.setTextureOffset(0, 32).addBox(-1.9651F, -0.0006F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		RightCalf = new ModelRenderer(this);
		RightCalf.setRotationPoint(0.0F, 5.0F, 0.0F);
		RightLeg.addChild(RightCalf);
		RightCalf.setTextureOffset(16, 32).addBox(-2.1396F, -0.9976F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 3.0F, 0.0F);
		LowerBody.addChild(LeftLeg);
		LeftLeg.setTextureOffset(0, 48).addBox(-2.0349F, -0.0006F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);

		LeftCalf = new ModelRenderer(this);
		LeftCalf.setRotationPoint(0.0F, 5.0F, 0.0F);
		LeftLeg.addChild(LeftCalf);
		LeftCalf.setTextureOffset(16, 48).addBox(-1.8604F, -0.9976F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, true);
		
		walkingAnimation = new WalkingAnimation(UpperBody, Head, RightArm, RightForeArm, LeftArm, LeftForeArm, LowerBody, RightLeg, RightCalf, LeftLeg, LeftCalf);
		wipingAnimation = new WipingAnimation(UpperBody, Head, RightArm, RightForeArm, LeftArm, LeftForeArm, LowerBody, RightLeg, RightCalf, LeftLeg, LeftCalf);
		leaningAnimation = new LeaningAnimation(UpperBody, Head, RightArm, RightForeArm, LeftArm, LeftForeArm, LowerBody, RightLeg, RightCalf, LeftLeg, LeftCalf);
		dispensingAnimation = new DispensingAnimation(UpperBody, Head, RightArm, RightForeArm, LeftArm, LeftForeArm, LowerBody, RightLeg, RightCalf, LeftLeg, LeftCalf);
		yawningAnimation = new YawningAnimation(UpperBody, Head, RightArm, RightForeArm, LeftArm, LeftForeArm, LowerBody, RightLeg, RightCalf, LeftLeg, LeftCalf);
		kickingAnimation = new KickingAnimation(UpperBody, Head, RightArm, RightForeArm, LeftArm, LeftForeArm, LowerBody, RightLeg, RightCalf, LeftLeg, LeftCalf);
		eatingAnimation = new EatingAnimation(UpperBody, Head, RightArm, RightForeArm, LeftArm, LeftForeArm, LowerBody, RightLeg, RightCalf, LeftLeg, LeftCalf);
		drinkingAnimation = new DrinkingAnimation(UpperBody, Head, RightArm, RightForeArm, LeftArm, LeftForeArm, LowerBody, RightLeg, RightCalf, LeftLeg, LeftCalf);
	}

	@Override
	public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
	{
		this.Cloth.showModel = entity.getDataManager().get(MerchantEntity.showCloth);
		ModelAnimations.renderWipingAnimation(entity, wipingAnimation);
		ModelAnimations.renderLeaningAnimation(entity, leaningAnimation);
		ModelAnimations.renderDispensingAnimation(entity, dispensingAnimation);
		ModelAnimations.renderYawningAnimation(entity, yawningAnimation);
		ModelAnimations.renderKickingAnimation(entity, kickingAnimation);
		ModelAnimations.renderDrinkingAnimation(entity, drinkingAnimation);
		ModelAnimations.renderEatingAnimation(entity, eatingAnimation);
		ModelAnimations.resetAnimation(entity, walkingAnimation);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		UpperBody.render(matrixStack, buffer, packedLight, packedOverlay);
		LowerBody.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}