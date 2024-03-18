package mod.arcalitegames.odyssey.entity.states.common;

import net.minecraft.client.renderer.model.ModelRenderer;

public class PensiveState extends AbstractState
{

    public PensiveState(ModelRenderer upperBody, ModelRenderer head, ModelRenderer rightArm, ModelRenderer rightForeArm, ModelRenderer leftArm, ModelRenderer leftForeArm, ModelRenderer lowerBody, ModelRenderer rightLeg, ModelRenderer rightCalf, ModelRenderer leftLeg, ModelRenderer leftCalf) {
        super(upperBody, head, rightArm, rightForeArm, leftArm, leftForeArm, lowerBody, rightLeg, rightCalf, leftLeg, leftCalf);
    }

    @Override
    public void renderState()
    {
        RightArm.rotateAngleX = degToRad(50);
        RightArm.rotateAngleY = degToRad(40);
        RightArm.rotateAngleZ = degToRad(-40);
        RightForeArm.rotateAngleX = degToRad(90);
        LeftArm.rotateAngleX = degToRad(180);
        LeftArm.rotateAngleY = degToRad(-90);
        LeftArm.rotateAngleZ = degToRad(-180);
        LeftForeArm.rotateAngleX = degToRad(90);
    }
}
