package mod.arcalitegames.odyssey.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import mod.arcalitegames.odyssey.entity.passive.StandingGuardEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class StandingGuardModel<T extends StandingGuardEntity> extends EntityModel<T> {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer Spear;
	private final ModelRenderer cube_r1;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public StandingGuardModel() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		Spear = new ModelRenderer(this);
		Spear.setRotationPoint(-1.0F, 7.0F, -8.0F);
		RightArm.addChild(Spear);
		setRotationAngle(Spear, -0.9163F, 0.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -1.0F, 1.0F);
		Spear.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(36, 32).addBox(-1.0F, 7.0F, -12.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(31, 32).addBox(-1.0F, 6.0F, -11.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(26, 32).addBox(-1.0F, 5.0F, -10.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 46).addBox(-1.0F, -10.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(4, 44).addBox(-1.0F, -11.0F, 7.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(10, 44).addBox(-1.0F, -9.0F, 5.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(18, 44).addBox(-1.0F, -8.0F, 4.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(27, 44).addBox(-1.0F, -7.0F, 3.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(36, 44).addBox(-1.0F, -6.0F, 2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(45, 44).addBox(-1.0F, -5.0F, 1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(54, 44).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 40).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(9, 40).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(18, 40).addBox(-1.0F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(27, 40).addBox(-1.0F, 0.0F, -4.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(36, 40).addBox(-1.0F, 1.0F, -5.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(45, 40).addBox(-1.0F, 2.0F, -6.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(54, 40).addBox(-1.0F, 3.0F, -7.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 32).addBox(-1.0F, 4.0F, -8.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(9, 32).addBox(-1.0F, 5.0F, -8.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(16, 32).addBox(-1.0F, 6.0F, -8.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(21, 32).addBox(-1.0F, 5.0F, -9.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
	{
		boolean flag = entity.getTicksElytraFlying() > 4;
	      this.Head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
	      if (flag) {
	         this.Head.rotateAngleX = (-(float)Math.PI / 4F);
	      } else {
	         this.Head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
	      }

	      this.Body.rotateAngleY = 0.0F;
	      this.RightArm.rotationPointZ = 0.0F;
	      this.RightArm.rotationPointX = -5.0F;
	      this.LeftArm.rotationPointZ = 0.0F;
	      this.LeftArm.rotationPointX = 5.0F;
	      float f = 1.0F;
	      if (flag) {
	         f = (float)entity.getMotion().lengthSquared();
	         f = f / 0.2F;
	         f = f * f * f;
	      }

	      if (f < 1.0F) {
	         f = 1.0F;
	      }

	      this.RightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F / f;
	      this.LeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F / f;
	      this.RightArm.rotateAngleZ = 0.0F;
	      this.LeftArm.rotateAngleZ = 0.0F;
	      this.RightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / f;
	      this.LeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount / f;
	      this.RightLeg.rotateAngleY = 0.0F;
	      this.LeftLeg.rotateAngleY = 0.0F;
	      this.RightLeg.rotateAngleZ = 0.0F;
	      this.LeftLeg.rotateAngleZ = 0.0F;
	      if (this.isSitting) {
	         this.RightArm.rotateAngleX += (-(float)Math.PI / 5F);
	         this.LeftArm.rotateAngleX += (-(float)Math.PI / 5F);
	         this.RightLeg.rotateAngleX = -1.4137167F;
	         this.RightLeg.rotateAngleY = ((float)Math.PI / 10F);
	         this.RightLeg.rotateAngleZ = 0.07853982F;
	         this.LeftLeg.rotateAngleX = -1.4137167F;
	         this.LeftLeg.rotateAngleY = (-(float)Math.PI / 10F);
	         this.LeftLeg.rotateAngleZ = -0.07853982F;
	      }

	      this.RightArm.rotateAngleY = 0.0F;
	      this.LeftArm.rotateAngleY = 0.0F;
	      
	      if (entity.isSneaking()) {
	         this.Body.rotateAngleX = 0.5F;
	         this.RightArm.rotateAngleX += 0.4F;
	         this.LeftArm.rotateAngleX += 0.4F;
	         this.RightLeg.rotationPointZ = 4.0F;
	         this.LeftLeg.rotationPointZ = 4.0F;
	         this.RightLeg.rotationPointY = 12.2F;
	         this.LeftLeg.rotationPointY = 12.2F;
	         this.Head.rotationPointY = 4.2F;
	         this.Body.rotationPointY = 3.2F;
	         this.LeftArm.rotationPointY = 5.2F;
	         this.RightArm.rotationPointY = 5.2F;
	      } else {
	         this.Body.rotateAngleX = 0.0F;
	         this.RightLeg.rotationPointZ = 0.1F;
	         this.LeftLeg.rotationPointZ = 0.1F;
	         this.RightLeg.rotationPointY = 12.0F;
	         this.LeftLeg.rotationPointY = 12.0F;
	         this.Head.rotationPointY = 0.0F;
	         this.Body.rotationPointY = 0.0F;
	         this.LeftArm.rotationPointY = 2.0F;
	         this.RightArm.rotationPointY = 2.0F;
	      }
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
