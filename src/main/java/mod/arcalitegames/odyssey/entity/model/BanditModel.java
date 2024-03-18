package mod.arcalitegames.odyssey.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import mod.arcalitegames.odyssey.entity.hostile.BanditEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;


public class BanditModel<T extends BanditEntity> extends EntityModel<T>
{
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer Sword;
	private final ModelRenderer cube_r1;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public BanditModel()
	{
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

		Sword = new ModelRenderer(this);
		Sword.setRotationPoint(-1.0F, 10.0F, -5.0F);
		RightArm.addChild(Sword);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -1.0F, 1.0F);
		Sword.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(40, 35).addBox(-1.0F, 7.0F, -12.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(35, 35).addBox(-1.0F, 6.0F, -11.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(30, 35).addBox(-1.0F, 5.0F, -10.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(25, 35).addBox(-1.0F, 4.0F, -9.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(20, 35).addBox(-1.0F, 3.0F, -8.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(15, 35).addBox(-1.0F, 2.0F, -7.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(10, 35).addBox(-1.0F, 1.0F, -6.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(5, 35).addBox(-1.0F, 0.0F, -5.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(1, 35).addBox(-1.0F, -1.0F, -4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(58, 42).addBox(-1.0F, -2.0F, -3.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(53, 43).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(35, 44).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(42, 44).addBox(-1.0F, -4.0F, -3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(7, 44).addBox(-1.0F, -6.0F, 2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(14, 44).addBox(-1.0F, -5.0F, 1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(21, 44).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(28, 44).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 44).addBox(-1.0F, -7.0F, 3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(48, 45).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

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
		  float f = 1.0F;

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

	      this.RightArm.rotateAngleY = 0.0F;
	      this.LeftArm.rotateAngleY = 0.0F;
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha)
	{
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z)
	{
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}