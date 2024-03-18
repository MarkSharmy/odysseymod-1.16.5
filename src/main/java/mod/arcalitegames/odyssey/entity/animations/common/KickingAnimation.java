package mod.arcalitegames.odyssey.entity.animations.common;

import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.system.exceptions.SequenceInterruptedException;
import net.minecraft.client.renderer.model.ModelRenderer;

public class KickingAnimation extends AbstractAnimation
{

	public KickingAnimation(ModelRenderer upperBody, ModelRenderer head, ModelRenderer rightArm,
			ModelRenderer rightForeArm, ModelRenderer leftArm, ModelRenderer leftForeArm, ModelRenderer lowerBody,
			ModelRenderer rightLeg, ModelRenderer rightCalf, ModelRenderer leftLeg, ModelRenderer leftCalf) {
		super(upperBody, head, rightArm, rightForeArm, leftArm, leftForeArm, lowerBody, rightLeg, rightCalf, leftLeg,
				leftCalf);
	}

	@Override
	public void setTime()
	{
		ticks++;
        if((ticks%15) == 0)
        {
            seconds++;
        }
	}

	@Override
	public void renderAnimations(ModEntity entity) throws SequenceInterruptedException
	{
        if(finishedAnimating) { time = seconds; finishedAnimating = false; }

        int frame = seconds - time;

        if(isSequenceDisrupted(frame)) throw new SequenceInterruptedException();

        if(frame == 1)
        {
            UpperBody.rotateAngleZ = degToRad(1f);
            LowerBody.rotateAngleZ = degToRad(-1f);
            RightArm.rotateAngleY = degToRad(1f);
            LeftArm.rotateAngleY = degToRad(-1f);
            RightLeg.rotateAngleZ = degToRad(1f);
            LeftLeg.rotateAngleZ = degToRad(2.5f);
            LeftCalf.rotateAngleX = degToRad(-5f);
            stage = 2;
        }
        if(frame == 2)
        {
            UpperBody.rotateAngleZ = degToRad(2f);
            LowerBody.rotateAngleZ = degToRad(-2f);
            RightArm.rotateAngleY = degToRad(2f);
            LeftArm.rotateAngleY = degToRad(-2f);
            RightLeg.rotateAngleZ = degToRad(2f);
            LeftCalf.rotateAngleX = degToRad(-10f);
            stage = 3;
        }
        if(frame == 3)
        {
            UpperBody.rotateAngleZ = degToRad(3f);
            LowerBody.rotateAngleZ = degToRad(-3f);
            RightArm.rotateAngleY = degToRad(3f);
            LeftArm.rotateAngleY = degToRad(-3f);
            RightLeg.rotateAngleZ = degToRad(3f);
            LeftCalf.rotateAngleX = degToRad(-15f);
            stage = 4;
        }
        if(frame == 4)
        {
            UpperBody.rotateAngleZ = degToRad(4f);
            LowerBody.rotateAngleZ = degToRad(-4f);
            RightArm.rotateAngleY = degToRad(4f);
            LeftArm.rotateAngleY = degToRad(-4f);
            RightLeg.rotateAngleZ = degToRad(4f);
            LeftCalf.rotateAngleX = degToRad(-20f);
            stage = 5;
        }
        if(frame == 5)
        {
            UpperBody.rotateAngleZ = degToRad(5f);
            LowerBody.rotateAngleZ = degToRad(-5f);
            RightArm.rotateAngleY = degToRad(5f);
            LeftArm.rotateAngleY = degToRad(-5f);
            RightLeg.rotateAngleZ = degToRad(5f);
            LeftCalf.rotateAngleX = degToRad(-25f);
            stage = 6;
        }
        if(frame == 6)
        {
            LeftCalf.rotateAngleX = degToRad(-30f);
            stage = 7;
        }
        if(frame == 7)
        {
            LeftCalf.rotateAngleX = degToRad(-15f);
            stage = 8;
        }
        if(frame == 8)
        {
            UpperBody.rotateAngleZ = degToRad(2f);
            LowerBody.rotateAngleZ = degToRad(-2f);
            RightArm.rotateAngleY = degToRad(2f);
            LeftArm.rotateAngleY = degToRad(-2f);
            RightLeg.rotateAngleZ = degToRad(2f);
            LeftCalf.rotateAngleX = degToRad(-10f);
            stage = 9;
        }
        if(frame == 9)
        {
            UpperBody.rotateAngleZ = degToRad(1f);
            LowerBody.rotateAngleZ = degToRad(-1f);
            RightArm.rotateAngleY = degToRad(1f);
            LeftArm.rotateAngleY = degToRad(-1f);
            RightLeg.rotateAngleZ = degToRad(1f);
            LeftCalf.rotateAngleX = degToRad(-5f);
            stage = 10;
        }
        if(frame == 10)
        {
            UpperBody.rotateAngleZ = degToRad(0f);
            LowerBody.rotateAngleZ = degToRad(0f);
            RightArm.rotateAngleY = degToRad(0f);
            LeftArm.rotateAngleY = degToRad(0f);
            RightLeg.rotateAngleZ = degToRad(0f);
            LeftLeg.rotateAngleZ = degToRad(0f);
            LeftCalf.rotateAngleX = degToRad(0f);
            ModelAnimations.stopAnimation(entity);
            this.endAnimation();
        }
	}

}
