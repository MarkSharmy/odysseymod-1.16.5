package mod.arcalitegames.odyssey.entity.states.merchant;

import mod.arcalitegames.odyssey.entity.states.common.AbstractState;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ElevationState extends AbstractState
{

    public ElevationState(ModelRenderer upperBody, ModelRenderer head, ModelRenderer rightArm, ModelRenderer rightForeArm, ModelRenderer leftArm, ModelRenderer leftForeArm, ModelRenderer lowerBody, ModelRenderer rightLeg, ModelRenderer rightCalf, ModelRenderer leftLeg, ModelRenderer leftCalf) {
        super(upperBody, head, rightArm, rightForeArm, leftArm, leftForeArm, lowerBody, rightLeg, rightCalf, leftLeg, leftCalf);
    }

    @Override
    public void renderState()
    {
        UpperBody.rotateAngleX = degToRad(-25.0f);
        Head.rotateAngleX = degToRad(15.0f);
        RightArm.rotateAngleX = degToRad(15.0f);
        RightForeArm.rotateAngleX = degToRad(90.f);
        LeftArm.rotateAngleX = degToRad(15.0f);
        LeftForeArm.rotateAngleX = degToRad(90.0f);
    }
}
