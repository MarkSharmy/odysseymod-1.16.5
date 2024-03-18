package mod.arcalitegames.odyssey.entity.animations.common;

import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.system.exceptions.SequenceInterruptedException;
import net.minecraft.client.renderer.model.ModelRenderer;

public class DrinkingAnimation extends AbstractAnimation {

	public DrinkingAnimation(ModelRenderer upperBody, ModelRenderer head, ModelRenderer rightArm,
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
            RightArm.rotateAngleX = degToRad(10f);
            RightArm.rotateAngleY = degToRad(7f);
            RightArm.rotateAngleZ = degToRad(-10f);
            RightForeArm.rotateAngleX = degToRad(10f);
            stage = 2;
        }
        if(frame == 2)
        {
            RightArm.rotateAngleX = degToRad(20f);
            RightArm.rotateAngleY = degToRad(14f);
            RightArm.rotateAngleZ = degToRad(-20f);
            RightForeArm.rotateAngleX = degToRad(20f);
            stage = 3;
        }
        if(frame == 3)
        {
            RightArm.rotateAngleX = degToRad(30f);
            RightArm.rotateAngleY = degToRad(21f);
            RightArm.rotateAngleZ = degToRad(-30f);
            RightForeArm.rotateAngleX = degToRad(30f);
            stage = 4;
        }
        if(frame == 4)
        {
            RightArm.rotateAngleX = degToRad(40f);
            RightArm.rotateAngleY = degToRad(28f);
            RightArm.rotateAngleZ = degToRad(-40f);
            RightForeArm.rotateAngleX = degToRad(40f);
            stage = 5;
        }
        if(frame == 5)
        {
            RightArm.rotateAngleX = degToRad(50f);
            RightArm.rotateAngleY = degToRad(35f);
            RightArm.rotateAngleZ = degToRad(-50f);
            RightForeArm.rotateAngleX = degToRad(50f);
            stage = 6;
        }
        if(frame == 6)
        {
            UpperBody.rotateAngleX = degToRad(2.5f);
            Head.rotateAngleX = degToRad(2.5f);
            RightForeArm.rotateAngleX = degToRad(60f);
            stage = 7;
        }
        if(frame == 7)
        {
            UpperBody.rotateAngleX = degToRad(5.0f);
            Head.rotateAngleX = degToRad(5.0f);
            RightForeArm.rotateAngleX = degToRad(75f);
            stage = 8;
        }
        if(frame == 8)
        {
            UpperBody.rotateAngleX = degToRad(7.5f);
            Head.rotateAngleX = degToRad(7.5f);
            RightForeArm.rotateAngleX = degToRad(90f);
            stage = 9;
        }
        if(frame == 9)
        {
            Head.rotateAngleX = degToRad(7.5f);
            stage = 10;
        }
        if(frame == 10)
        {
            Head.rotateAngleX = degToRad(7.5f);
            stage = 11;
        }
        if(frame == 11)
        {
            Head.rotateAngleX = degToRad(7.5f);
            stage = 12;
        }
        if(frame == 12)
        {
            Head.rotateAngleX = degToRad(7.5f);
            stage = 13;
        }
        if(frame == 13)
        {
            Head.rotateAngleX = degToRad(7.5f);
            stage = 14;
        }
        if(frame == 14)
        {
            UpperBody.rotateAngleX = degToRad(5.0f);
            Head.rotateAngleX = degToRad(5.0f);
            RightForeArm.rotateAngleX = degToRad(75f);
            stage = 15;
        }
        if(frame == 15)
        {
            UpperBody.rotateAngleX = degToRad(0f);
            Head.rotateAngleX = degToRad(0f);
            RightForeArm.rotateAngleX = degToRad(60f);
            stage = 16;
        }
        if(frame == 16)
        {
            RightArm.rotateAngleX = degToRad(50f);
            RightArm.rotateAngleY = degToRad(35f);
            RightArm.rotateAngleZ = degToRad(-50f);
            RightForeArm.rotateAngleX = degToRad(50f);
            stage = 17;
        }
        if(frame == 17)
        {
            RightArm.rotateAngleX = degToRad(40f);
            RightArm.rotateAngleY = degToRad(28f);
            RightArm.rotateAngleZ = degToRad(-40f);
            RightForeArm.rotateAngleX = degToRad(40f);
            stage = 18;
        }
        if(frame == 18)
        {
            RightArm.rotateAngleX = degToRad(30f);
            RightArm.rotateAngleY = degToRad(21f);
            RightArm.rotateAngleZ = degToRad(-30f);
            RightForeArm.rotateAngleX = degToRad(30f);
            stage = 19;
        }
        if(frame == 19)
        {
            RightArm.rotateAngleX = degToRad(20f);
            RightArm.rotateAngleY = degToRad(14f);
            RightArm.rotateAngleZ = degToRad(-20f);
            RightForeArm.rotateAngleX = degToRad(20f);
            stage = 20;
        }
        if(frame == 20)
        {
            RightArm.rotateAngleX = degToRad(0f);
            RightArm.rotateAngleY = degToRad(0f);
            RightArm.rotateAngleZ = degToRad(0f);
            RightForeArm.rotateAngleX = degToRad(0f);
            ModelAnimations.stopAnimation(entity);
            this.endAnimation();
        }
	}

}
