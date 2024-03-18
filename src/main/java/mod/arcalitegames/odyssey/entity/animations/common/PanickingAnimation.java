package mod.arcalitegames.odyssey.entity.animations.common;

import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.system.exceptions.SequenceInterruptedException;
import net.minecraft.client.renderer.model.ModelRenderer;

public class PanickingAnimation extends AbstractAnimation {

	public PanickingAnimation(ModelRenderer upperBody, ModelRenderer head, ModelRenderer rightArm,
			ModelRenderer rightForeArm, ModelRenderer leftArm, ModelRenderer leftForeArm, ModelRenderer lowerBody,
			ModelRenderer rightLeg, ModelRenderer rightCalf, ModelRenderer leftLeg, ModelRenderer leftCalf) {
		super(upperBody, head, rightArm, rightForeArm, leftArm, leftForeArm, lowerBody, rightLeg, rightCalf, leftLeg,
				leftCalf);
	}

	@Override
	public void setTime()
	{
		ticks++;
        if((ticks%10) == 0)
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
            RightArm.rotateAngleZ = degToRad(-90f);
            LeftArm.rotateAngleZ = degToRad(90f);
            RightForeArm.rotateAngleZ = degToRad(-90f);
            LeftForeArm.rotateAngleZ = degToRad(90f);
            LeftLeg.rotateAngleX = degToRad(15f);
            LeftCalf.rotateAngleX = degToRad(-60f);
            RightLeg.rotateAngleX = degToRad(-10f);
            stage = 2;
        }
        if(frame == 2)
        {
            LeftLeg.rotateAngleX = degToRad(30f);
            LeftCalf.rotateAngleX = degToRad(-40f);
            RightLeg.rotateAngleX = degToRad(-20f);
            stage = 3;
        }
        if(frame == 3)
        {
            LeftLeg.rotateAngleX = degToRad(45f);
            LeftCalf.rotateAngleX = degToRad(-20f);
            RightLeg.rotateAngleX = degToRad(-30f);
            stage = 4;
        }
        if(frame == 4)
        {
            RightLeg.rotateAngleX = degToRad(-20f);
            RightCalf.rotateAngleX = degToRad(-20f);
            LeftLeg.rotateAngleX = degToRad(30f);
            LeftCalf.rotateAngleX = degToRad(-10f);
            stage = 5;
        }
        if(frame == 5)
        {
            RightLeg.rotateAngleX = degToRad(-10f);
            RightCalf.rotateAngleX = degToRad(-40f);
            LeftLeg.rotateAngleX = degToRad(15f);
            LeftCalf.rotateAngleX = degToRad(0f);
            stage = 6;
        }
        if(frame == 6)
        {
            RightLeg.rotateAngleX = degToRad(0f);
            RightCalf.rotateAngleX = degToRad(-60f);
            LeftLeg.rotateAngleX = degToRad(0f);
            stage = 7;
        }
        if(frame == 7)
        {
            RightArm.rotateAngleZ = degToRad(-90f);
            LeftArm.rotateAngleZ = degToRad(90f);
            RightLeg.rotateAngleX = degToRad(15f);
            RightCalf.rotateAngleX = degToRad(-60f);
            LeftLeg.rotateAngleX = degToRad(-10f);
            stage = 8;
        }
        if(frame == 8)
        {
            RightLeg.rotateAngleX = degToRad(30f);
            RightCalf.rotateAngleX = degToRad(-40f);
            LeftLeg.rotateAngleX = degToRad(-20f);
            stage = 9;
        }
        if(frame == 9)
        {
            RightLeg.rotateAngleX = degToRad(45f);
            RightCalf.rotateAngleX = degToRad(-20f);
            LeftLeg.rotateAngleX = degToRad(-30f);
            stage = 10;
        }
        if(frame == 10)
        {
            LeftLeg.rotateAngleX = degToRad(-20f);
            LeftCalf.rotateAngleX = degToRad(-20f);
            RightLeg.rotateAngleX = degToRad(30f);
            RightCalf.rotateAngleX = degToRad(-10f);
            stage = 11;
        }
        if(frame == 11)
        {
            LeftLeg.rotateAngleX = degToRad(-10f);
            LeftCalf.rotateAngleX = degToRad(-40f);
            RightLeg.rotateAngleX = degToRad(15f);
            RightCalf.rotateAngleX = degToRad(0f);
            stage = 12;
        }
        if(frame == 12)
        {
            RightLeg.rotateAngleX = degToRad(0f);
            LeftLeg.rotateAngleX = degToRad(0f);
            LeftCalf.rotateAngleX = degToRad(-60f);
            ModelAnimations.stopAnimation(entity);
            this.endAnimation();
        }

	}

}
