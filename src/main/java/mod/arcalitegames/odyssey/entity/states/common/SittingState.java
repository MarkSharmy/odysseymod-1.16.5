package mod.arcalitegames.odyssey.entity.states.common;

import net.minecraft.client.renderer.model.ModelRenderer;

public class SittingState extends AbstractState {

	public SittingState(ModelRenderer upperBody, ModelRenderer head, ModelRenderer rightArm,
			ModelRenderer rightForeArm, ModelRenderer leftArm, ModelRenderer leftForeArm, ModelRenderer lowerBody,
			ModelRenderer rightLeg, ModelRenderer rightCalf, ModelRenderer leftLeg, ModelRenderer leftCalf) {
		super(upperBody, head, rightArm, rightForeArm, leftArm, leftForeArm, lowerBody, rightLeg, rightCalf, leftLeg,
				leftCalf);
	}

	@Override
	public void renderState()
	{
		this.RightLeg.rotateAngleX = this.degToRad(90.0f);
		this.RightCalf.rotateAngleX = this.degToRad(-50.0f);
		this.LeftLeg.rotateAngleX = this.degToRad(90.0f);
		this.LeftCalf.rotateAngleX = this.degToRad(-50.0f);
	}

}
