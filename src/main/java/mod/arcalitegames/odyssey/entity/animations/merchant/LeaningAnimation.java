package mod.arcalitegames.odyssey.entity.animations.merchant;

import java.util.Random;

import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.odyssey.entity.animations.common.AbstractAnimation;
import mod.arcalitegames.system.exceptions.SequenceInterruptedException;
import net.minecraft.client.renderer.model.ModelRenderer;

public class LeaningAnimation extends AbstractAnimation {

	private ModEntity entity;
	private int variation = 0;
	
	public LeaningAnimation(ModelRenderer upperBody, ModelRenderer head, ModelRenderer rightArm,
			ModelRenderer rightForeArm, ModelRenderer leftArm, ModelRenderer leftForeArm, ModelRenderer lowerBody,
			ModelRenderer rightLeg, ModelRenderer rightCalf, ModelRenderer leftLeg, ModelRenderer leftCalf) {
		super(upperBody, head, rightArm, rightForeArm, leftArm, leftForeArm, lowerBody, rightLeg, rightCalf, leftLeg,
				leftCalf);
	}

	@Override
	public void setTime()
	{
		ticks++;
        if((ticks%20) == 0)
        {
            seconds++;
        }
	}

	@Override
	public void renderAnimations(ModEntity entityIn) throws SequenceInterruptedException
	{
        if(finishedAnimating)
        { 
        	time = seconds;
        	finishedAnimating = false;
        	variation = new Random().nextInt(2);
        }

        int frame = seconds - time;

        if(isSequenceDisrupted(frame)) throw new SequenceInterruptedException();

		this.entity = entityIn;
		
		switch(variation)
		{
			case 0: playAnimation1(frame);
			break;
			case 1: playAnimation2(frame);
			break;
		}
	}
	
	private void playAnimation1(int frame)
	{
		for(int i = 1; i <= 24; i++)
		{
			if(frame == i) stage = i + 1;
		}

        if(frame == 25)
        {
            Head.rotateAngleX = degToRad(5f);
            UpperBody.rotateAngleX = degToRad(-6f);
            RightArm.rotateAngleX = degToRad(5f);
            LeftArm.rotateAngleX = degToRad(5f);
            RightForeArm.rotateAngleX = degToRad(15f);
            LeftForeArm.rotateAngleX = degToRad(15f);
            stage = 26;
        }
        if(frame == 26)
        {
            Head.rotateAngleX = degToRad(10f);
            UpperBody.rotateAngleX = degToRad(-12f);
            RightArm.rotateAngleX = degToRad(10f);
            LeftArm.rotateAngleX = degToRad(10f);
            RightForeArm.rotateAngleX = degToRad(30f);
            LeftForeArm.rotateAngleX = degToRad(30f);
            stage = 27;
        }
        if(frame == 27)
        {
            Head.rotateAngleX = degToRad(15f);
            UpperBody.rotateAngleX = degToRad(-18f);
            RightArm.rotateAngleX = degToRad(15f);
            LeftArm.rotateAngleX = degToRad(15f);
            RightForeArm.rotateAngleX = degToRad(45f);
            LeftForeArm.rotateAngleX = degToRad(45f);
            stage = 28;
        }
        if(frame == 28)
        {
            Head.rotateAngleX = degToRad(20f);
            UpperBody.rotateAngleX = degToRad(-24f);
            RightArm.rotateAngleX = degToRad(25f);
            LeftArm.rotateAngleX = degToRad(25f);
            RightForeArm.rotateAngleX = degToRad(60f);
            LeftForeArm.rotateAngleX = degToRad(60f);
            stage = 29;
        }
        if(frame == 29)
        {
            Head.rotateAngleX = degToRad(25f);
            UpperBody.rotateAngleX = degToRad(-30f);
            RightArm.rotateAngleX = degToRad(30f);
            LeftArm.rotateAngleX = degToRad(30f);
            RightForeArm.rotateAngleX = degToRad(75f);
            LeftForeArm.rotateAngleX = degToRad(75f);
            stage = 30;
        }
        if(frame == 30)
        {
            Head.rotateAngleX = degToRad(30f);
            UpperBody.rotateAngleX = degToRad(-37.5f);
            RightArm.rotateAngleX = degToRad(35f);
            LeftArm.rotateAngleX = degToRad(35f);
            RightForeArm.rotateAngleX = degToRad(90f);
            LeftForeArm.rotateAngleX = degToRad(90f);
            stage = 31;
        }
		
		for(int i = 31; i <= 89; i++)
		{
			if(frame == i) stage = i + 1;
		}
		
        if(frame == 90)
        {
            Head.rotateAngleX = degToRad(25f);
            UpperBody.rotateAngleX = degToRad(-30f);
            RightArm.rotateAngleX = degToRad(30f);
            LeftArm.rotateAngleX = degToRad(30f);
            RightForeArm.rotateAngleX = degToRad(75f);
            LeftForeArm.rotateAngleX = degToRad(75f);
            stage = 91;
        }
        if(frame == 91)
        {
            Head.rotateAngleX = degToRad(20f);
            UpperBody.rotateAngleX = degToRad(-24f);
            RightArm.rotateAngleX = degToRad(25f);
            LeftArm.rotateAngleX = degToRad(25f);
            RightForeArm.rotateAngleX = degToRad(60f);
            LeftForeArm.rotateAngleX = degToRad(60f);
            stage = 92;
        }
        if(frame == 92)
        {
            Head.rotateAngleX = degToRad(15f);
            UpperBody.rotateAngleX = degToRad(-18f);
            RightArm.rotateAngleX = degToRad(15f);
            LeftArm.rotateAngleX = degToRad(15f);
            RightForeArm.rotateAngleX = degToRad(45f);
            LeftForeArm.rotateAngleX = degToRad(45f);
            stage = 93;
        }
        if(frame == 93)
        {
            Head.rotateAngleX = degToRad(10f);
            UpperBody.rotateAngleX = degToRad(-12f);
            RightArm.rotateAngleX = degToRad(10f);
            LeftArm.rotateAngleX = degToRad(10f);
            RightForeArm.rotateAngleX = degToRad(30f);
            LeftForeArm.rotateAngleX = degToRad(30f);
            stage = 94;
        }
        if(frame == 94)
        {
            Head.rotateAngleX = degToRad(5f);
            UpperBody.rotateAngleX = degToRad(-6f);
            RightArm.rotateAngleX = degToRad(5f);
            LeftArm.rotateAngleX = degToRad(5f);
            RightForeArm.rotateAngleX = degToRad(15f);
            LeftForeArm.rotateAngleX = degToRad(15f);
            stage = 95;
        }
        if(frame == 95)
        {
            Head.rotateAngleX = degToRad(0f);
            UpperBody.rotateAngleX = degToRad(0f);
            RightArm.rotateAngleX = degToRad(0f);
            LeftArm.rotateAngleX = degToRad(0f);
            RightForeArm.rotateAngleX = degToRad(0f);
            LeftForeArm.rotateAngleX = degToRad(0f);
            ModelAnimations.stopAnimation(entity);
            this.endAnimation();
        }
	}
	
	private void playAnimation2(int frame)
	{
		for(int i = 1; i <= 24; i++)
		{
			if(frame == i) stage = i + 1;
		}
		
        if(frame == 25)
        {
            Head.rotateAngleX = degToRad(5f);
            UpperBody.rotateAngleX = degToRad(-6f);
            RightArm.rotateAngleX = degToRad(5f);
            LeftArm.rotateAngleX = degToRad(5f);
            RightForeArm.rotateAngleX = degToRad(15f);
            LeftForeArm.rotateAngleX = degToRad(15f);
            stage = 26;
        }
        if(frame == 26)
        {
            Head.rotateAngleX = degToRad(10f);
            UpperBody.rotateAngleX = degToRad(-12f);
            RightArm.rotateAngleX = degToRad(10f);
            RightArm.rotateAngleY = degToRad(10f);
            RightArm.rotateAngleZ = degToRad(-4f);
            LeftArm.rotateAngleX = degToRad(10f);
            RightForeArm.rotateAngleX = degToRad(30f);
            LeftForeArm.rotateAngleX = degToRad(30f);
            stage = 27;
        }
        if(frame == 27)
        {
            Head.rotateAngleX = degToRad(15f);
            UpperBody.rotateAngleX = degToRad(-18f);
            RightArm.rotateAngleX = degToRad(15f);
            RightArm.rotateAngleY = degToRad(15f);
            RightArm.rotateAngleZ = degToRad(-8f);
            LeftArm.rotateAngleX = degToRad(15f);
            RightForeArm.rotateAngleX = degToRad(45f);
            LeftForeArm.rotateAngleX = degToRad(45f);
            stage = 28;
        }
        if(frame == 28)
        {
            Head.rotateAngleX = degToRad(20f);
            UpperBody.rotateAngleX = degToRad(-24f);
            RightArm.rotateAngleX = degToRad(25f);
            RightArm.rotateAngleY = degToRad(25f);
            RightArm.rotateAngleZ = degToRad(-16f);
            LeftArm.rotateAngleX = degToRad(25f);
            RightForeArm.rotateAngleX = degToRad(60f);
            LeftForeArm.rotateAngleX = degToRad(60f);
            stage = 29;
        }
        if(frame == 29)
        {
            Head.rotateAngleX = degToRad(25f);
            UpperBody.rotateAngleX = degToRad(-30f);
            RightArm.rotateAngleX = degToRad(30f);
            RightArm.rotateAngleY = degToRad(30f);
            RightArm.rotateAngleZ = degToRad(-20f);
            LeftArm.rotateAngleX = degToRad(30f);
            RightForeArm.rotateAngleX = degToRad(75f);
            LeftForeArm.rotateAngleX = degToRad(75f);
            stage = 30;
        }
        if(frame == 30)
        {
            Head.rotateAngleX = degToRad(30f);
            UpperBody.rotateAngleX = degToRad(-37.5f);
            RightArm.rotateAngleX = degToRad(35f);
            LeftArm.rotateAngleX = degToRad(35f);
            RightForeArm.rotateAngleX = degToRad(90f);
            LeftForeArm.rotateAngleX = degToRad(90f);
            stage = 31;
        }
		
		for(int i = 31; i <= 89; i++)
		{
			if(frame == i) stage = i + 1;
		}
		
        if(frame == 90)
        {
            Head.rotateAngleX = degToRad(25f);
            UpperBody.rotateAngleX = degToRad(-30f);
            RightArm.rotateAngleX = degToRad(30f);
            RightArm.rotateAngleY = degToRad(30f);
            RightArm.rotateAngleZ = degToRad(-20f);
            LeftArm.rotateAngleX = degToRad(30f);
            RightForeArm.rotateAngleX = degToRad(75f);
            LeftForeArm.rotateAngleX = degToRad(75f);
            stage = 91;
        }
        if(frame == 91)
        {
            Head.rotateAngleX = degToRad(20f);
            UpperBody.rotateAngleX = degToRad(-24f);
            RightArm.rotateAngleX = degToRad(25f);
            RightArm.rotateAngleY = degToRad(25f);
            RightArm.rotateAngleZ = degToRad(-16f);
            LeftArm.rotateAngleX = degToRad(25f);
            RightForeArm.rotateAngleX = degToRad(60f);
            LeftForeArm.rotateAngleX = degToRad(60f);
            stage = 92;
        }
        if(frame == 92)
        {
            Head.rotateAngleX = degToRad(15f);
            UpperBody.rotateAngleX = degToRad(-18f);
            RightArm.rotateAngleX = degToRad(15f);
            RightArm.rotateAngleY = degToRad(15f);
            RightArm.rotateAngleZ = degToRad(-8f);
            LeftArm.rotateAngleX = degToRad(15f);
            RightForeArm.rotateAngleX = degToRad(45f);
            LeftForeArm.rotateAngleX = degToRad(45f);
            stage = 93;
        }
        if(frame == 93)
        {
            Head.rotateAngleX = degToRad(10f);
            UpperBody.rotateAngleX = degToRad(-12f);
            RightArm.rotateAngleX = degToRad(10f);
            RightArm.rotateAngleY = degToRad(10f);
            RightArm.rotateAngleZ = degToRad(-4f);
            LeftArm.rotateAngleX = degToRad(10f);
            RightForeArm.rotateAngleX = degToRad(30f);
            LeftForeArm.rotateAngleX = degToRad(30f);
            stage = 94;
        }
        if(frame == 94)
        {
            Head.rotateAngleX = degToRad(5f);
            UpperBody.rotateAngleX = degToRad(-6f);
            RightArm.rotateAngleX = degToRad(5f);
            RightArm.rotateAngleY = degToRad(0f);
            RightArm.rotateAngleZ = degToRad(0f);
            LeftArm.rotateAngleX = degToRad(5f);
            RightForeArm.rotateAngleX = degToRad(15f);
            LeftForeArm.rotateAngleX = degToRad(15f);
            stage = 95;
        }
        if(frame == 95)
        {
            Head.rotateAngleX = degToRad(0f);
            UpperBody.rotateAngleX = degToRad(0f);
            RightArm.rotateAngleX = degToRad(0f);
            LeftArm.rotateAngleX = degToRad(0f);
            RightForeArm.rotateAngleX = degToRad(0f);
            LeftForeArm.rotateAngleX = degToRad(0f);
            ModelAnimations.stopAnimation(entity);
			this.endAnimation();
        }
	}

}
