package mod.arcalitegames.odyssey.entity.animations.merchant;

import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.odyssey.entity.animations.common.AbstractAnimation;
import mod.arcalitegames.system.exceptions.SequenceInterruptedException;
import net.minecraft.client.renderer.model.ModelRenderer;

public class WipingAnimation extends AbstractAnimation
{
	
    public WipingAnimation(ModelRenderer upperBody, ModelRenderer head, ModelRenderer rightArm, ModelRenderer rightForeArm, ModelRenderer leftArm, ModelRenderer leftForeArm, ModelRenderer lowerBody, ModelRenderer rightLeg, ModelRenderer rightCalf, ModelRenderer leftLeg, ModelRenderer leftCalf) {
        super(upperBody, head, rightArm, rightForeArm, leftArm, leftForeArm, lowerBody, rightLeg, rightCalf, leftLeg, leftCalf);
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
    public void renderAnimations(ModEntity entity) throws SequenceInterruptedException
    {
        if(finishedAnimating) { time = seconds; finishedAnimating = false; }

        int frame = seconds - time;

        if(isSequenceDisrupted(frame)) throw new SequenceInterruptedException();

        for(int i = 1; i <= 24; i++)
        {
        	if(frame == i) stage = i + 1;
        }
        
        if(frame == 25)
        {
            UpperBody.rotateAngleX = degToRad(-6f);
            RightArm.rotateAngleX = degToRad(5f);
            RightForeArm.rotateAngleX = degToRad(15f);
            LeftForeArm.rotateAngleX = degToRad(15f);
            stage = 26;
        }
        if(frame == 26)
        {
            UpperBody.rotateAngleX = degToRad(-12f);
            RightArm.rotateAngleX = degToRad(10f);
            RightForeArm.rotateAngleX = degToRad(30f);
            LeftForeArm.rotateAngleX = degToRad(30f);
            stage = 27;
        }
        if(frame == 27)
        {
            UpperBody.rotateAngleX = degToRad(-18f);
            RightArm.rotateAngleX = degToRad(15f);
            RightForeArm.rotateAngleX = degToRad(45f);
            LeftForeArm.rotateAngleX = degToRad(45f);
            stage = 28;
        }
        if(frame == 28)
        {
            UpperBody.rotateAngleX = degToRad(-24f);
            RightArm.rotateAngleX = degToRad(20f);
            RightForeArm.rotateAngleX = degToRad(60f);
            LeftForeArm.rotateAngleX = degToRad(60f);
            stage = 29;
        }
        if(frame == 29)
        {
            UpperBody.rotateAngleX = degToRad(-30f);
            RightArm.rotateAngleX = degToRad(25f);
            RightForeArm.rotateAngleX = degToRad(80f);
            LeftForeArm.rotateAngleX = degToRad(75f);
            stage = 30;
        }
        if(frame == 30)
        {
            UpperBody.rotateAngleX = degToRad(-37.5f);
            RightArm.rotateAngleX = degToRad(30f);
            RightForeArm.rotateAngleX = degToRad(100f);
            LeftForeArm.rotateAngleX = degToRad(90f);
            stage = 31;
        }
        if(frame == 31)
        {
            RightArm.rotateAngleX = degToRad(35f);
            RightArm.rotateAngleY = degToRad(30f);
            RightArm.rotateAngleZ = degToRad(-20f);
            stage = 32;
        }
        if(frame == 32)
        {
            RightArm.rotateAngleX = degToRad(30f);
            RightArm.rotateAngleY = degToRad(13f);
            RightArm.rotateAngleZ = degToRad(-7f);
            stage = 33;
        }
        if(frame == 33)
        {
            RightArm.rotateAngleX = degToRad(35f);
            RightArm.rotateAngleY = degToRad(30f);
            RightArm.rotateAngleZ = degToRad(-20f);
            stage = 34;
        }
        if(frame == 34)
        {
            RightArm.rotateAngleX = degToRad(30f);
            RightArm.rotateAngleY = degToRad(13f);
            RightArm.rotateAngleZ = degToRad(-7f);
            stage = 35;
        }
        if(frame == 35)
        {
            RightArm.rotateAngleX = degToRad(30f);
            RightArm.rotateAngleY = degToRad(0f);
            RightArm.rotateAngleZ = degToRad(0f);
            stage = 36;
        }
        if(frame == 36)
        {
            UpperBody.rotateAngleX = degToRad(-30f);
            RightArm.rotateAngleX = degToRad(25f);
            RightForeArm.rotateAngleX = degToRad(80f);
            LeftForeArm.rotateAngleX = degToRad(75f);
            stage = 37;
        }
        if(frame == 37)
        {
            UpperBody.rotateAngleX = degToRad(-24f);
            RightArm.rotateAngleX = degToRad(20f);
            RightForeArm.rotateAngleX = degToRad(60f);
            LeftForeArm.rotateAngleX = degToRad(60f);
            stage = 38;
        }
        if(frame == 38)
        {
            UpperBody.rotateAngleX = degToRad(-18f);
            RightArm.rotateAngleX = degToRad(15f);
            RightForeArm.rotateAngleX = degToRad(45f);
            LeftForeArm.rotateAngleX = degToRad(45f);
            stage = 39;
        }
        if(frame == 39)
        {
            UpperBody.rotateAngleX = degToRad(-12f);
            RightArm.rotateAngleX = degToRad(10f);
            RightForeArm.rotateAngleX = degToRad(30f);
            LeftForeArm.rotateAngleX = degToRad(30f);
            stage = 40;
        }
        if(frame == 40)
        {
            UpperBody.rotateAngleX = degToRad(0f);
            RightArm.rotateAngleX = degToRad(0f);
            RightForeArm.rotateAngleX = degToRad(0f);
            LeftForeArm.rotateAngleX = degToRad(0f);
            ModelAnimations.stopAnimation(entity);
            this.endAnimation();
        }
    }
}
