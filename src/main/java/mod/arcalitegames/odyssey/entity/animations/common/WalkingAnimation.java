package mod.arcalitegames.odyssey.entity.animations.common;

import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.system.exceptions.SequenceInterruptedException;
import net.minecraft.client.renderer.model.ModelRenderer;

public class WalkingAnimation extends AbstractAnimation
{

    public WalkingAnimation(ModelRenderer upperBody, ModelRenderer head, ModelRenderer rightArm, ModelRenderer rightForeArm, ModelRenderer leftArm, ModelRenderer leftForeArm, ModelRenderer lowerBody, ModelRenderer rightLeg, ModelRenderer rightCalf, ModelRenderer leftLeg, ModelRenderer leftCalf) {
        super(upperBody, head, rightArm, rightForeArm, leftArm, leftForeArm, lowerBody, rightLeg, rightCalf, leftLeg, leftCalf);
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

    public void renderAnimations(ModEntity entity) throws SequenceInterruptedException
    {
        if(finishedAnimating) { time = seconds; finishedAnimating = false; }

        int frame = seconds - time;

        if(isSequenceDisrupted(frame)) throw new SequenceInterruptedException();

        if(frame == 1)
        {
            RightArm.rotateAngleX = degToRad(-10.0f);
            LeftArm.rotateAngleX = degToRad(10.0f);
            RightLeg.rotateAngleX = degToRad(10.0f);
            LeftLeg.rotateAngleX = degToRad(-10.0f);
            Head.rotateAngleY = degToRad(7.5f);
            stage = 2;
        }
        if(frame == 2)
        {
            RightArm.rotateAngleX = degToRad(-12.5f);
            LeftArm.rotateAngleX = degToRad(12.5f);
            LeftForeArm.rotateAngleX = degToRad(10.0f);
            RightLeg.rotateAngleX = degToRad(12.5f);
            RightCalf.rotateAngleX = degToRad(-10.0f);
            LeftLeg.rotateAngleX = degToRad(-12.5f);
            LeftCalf.rotateAngleX = degToRad(-10.0f);
            Head.rotateAngleY = degToRad(10.0f);
            stage = 3;
        }
        if(frame == 3)
        {
            RightArm.rotateAngleX = degToRad(-17.5f);
            LeftArm.rotateAngleX = degToRad(17.5f);
            LeftForeArm.rotateAngleX = degToRad(17.5f);
            RightLeg.rotateAngleX = degToRad(17.5f);
            RightCalf.rotateAngleX = degToRad(-17.5f);
            LeftLeg.rotateAngleX = degToRad(-17.5f);
            LeftCalf.rotateAngleX = degToRad(-12.5f);
            Head.rotateAngleY = degToRad(10.0f);
            stage = 4;
        }
        if(frame == 4)
        {
            RightArm.rotateAngleX = degToRad(-12.5f);
            LeftArm.rotateAngleX = degToRad(12.5f);
            LeftForeArm.rotateAngleX = degToRad(10.0f);
            RightLeg.rotateAngleX = degToRad(12.5f);
            RightCalf.rotateAngleX = degToRad(-10.0f);
            LeftLeg.rotateAngleX = degToRad(-12.5f);
            LeftCalf.rotateAngleX = degToRad(-10.0f);
            Head.rotateAngleY = degToRad(10.0f);
            stage = 5;
        }
        if(frame == 5)
        {
            RightArm.rotateAngleX = degToRad(-10.0f);
            LeftArm.rotateAngleX = degToRad(10.0f);
            LeftForeArm.rotateAngleX = degToRad(0.0f);
            RightLeg.rotateAngleX = degToRad(10.0f);
            RightCalf.rotateAngleX = degToRad(0.0f);
            LeftLeg.rotateAngleX = degToRad(-10.0f);
            LeftCalf.rotateAngleX = degToRad(0.0f);
            Head.rotateAngleY = degToRad(7.5f);
            stage = 6;
        }
        if(frame == 6)
        {
            RightArm.rotateAngleX = degToRad(0.0f);
            LeftArm.rotateAngleX = degToRad(0.0f);
            RightLeg.rotateAngleX = degToRad(0.0f);
            LeftLeg.rotateAngleX = degToRad(0.0f);
            Head.rotateAngleY = degToRad(0.0f);
            stage = 7;
        }
        if(frame == 7)
        {
            RightArm.rotateAngleX = degToRad(10.0f);
            LeftArm.rotateAngleX = degToRad(-10.0f);
            RightLeg.rotateAngleX = degToRad(-10.0f);
            LeftLeg.rotateAngleX = degToRad(10.0f);
            Head.rotateAngleY = degToRad(-7.5f);
            stage = 8;
        }
        if(frame == 8)
        {
            RightArm.rotateAngleX = degToRad(12.5f);
            RightForeArm.rotateAngleX = degToRad(10.0f);
            RightLeg.rotateAngleX = degToRad(-12.5f);
            RightCalf.rotateAngleX = degToRad(-10.0f);
            LeftLeg.rotateAngleX = degToRad(12.5f);
            LeftCalf.rotateAngleX = degToRad(-10.0f);
            Head.rotateAngleY = degToRad(-10.0f);
            stage = 9;
        }
        if(frame == 9)
        {
            RightArm.rotateAngleX = degToRad(17.5f);
            RightForeArm.rotateAngleX = degToRad(17.5f);
            LeftArm.rotateAngleX = degToRad(-17.5f);
            RightLeg.rotateAngleX = degToRad(-17.5f);
            RightCalf.rotateAngleX = degToRad(-12.5f);
            LeftLeg.rotateAngleX = degToRad(17.5f);
            LeftCalf.rotateAngleX = degToRad(-17.5f);
            Head.rotateAngleY = degToRad(-10.0f);
            stage = 10;
        }
        if(frame == 10)
        {
            RightArm.rotateAngleX = degToRad(12.5f);
            RightForeArm.rotateAngleX = degToRad(10.0f);
            LeftArm.rotateAngleX = degToRad(-12.5f);
            RightLeg.rotateAngleX = degToRad(-12.5f);
            RightCalf.rotateAngleX = degToRad(-10.0f);
            LeftLeg.rotateAngleX = degToRad(12.5f);
            LeftCalf.rotateAngleX = degToRad(-10.0f);
            Head.rotateAngleY = degToRad(-10.0f);
            stage = 11;
        }
        if(frame == 11)
        {
            RightArm.rotateAngleX = degToRad(10.0f);
            RightForeArm.rotateAngleX = degToRad(0.0f);
            RightLeg.rotateAngleX = degToRad(-10.0f);
            RightCalf.rotateAngleX = degToRad(0.0f);
            LeftLeg.rotateAngleX = degToRad(10.0f);
            LeftCalf.rotateAngleX = degToRad(0.0f);
            Head.rotateAngleY = degToRad(-7.5f);
            stage = 12;
        }
        if(frame == 12)
        {
            RightArm.rotateAngleX = degToRad(0.0f);
            LeftArm.rotateAngleX = degToRad(0.0f);
            RightLeg.rotateAngleX = degToRad(0.0f);
            LeftLeg.rotateAngleX = degToRad(0.0f);
            Head.rotateAngleY = degToRad(0.0f);
            ModelAnimations.stopAnimation(entity);
            this.endAnimation();
            
        }
    }
}
