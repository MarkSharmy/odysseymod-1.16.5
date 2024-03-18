package mod.arcalitegames.odyssey.entity.animations.common;

import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.system.exceptions.SequenceInterruptedException;
import net.minecraft.client.renderer.model.ModelRenderer;

public class BarteringAnimation extends AbstractAnimation
{

    public BarteringAnimation(ModelRenderer upperBody, ModelRenderer head, ModelRenderer rightArm, ModelRenderer rightForeArm, ModelRenderer leftArm, ModelRenderer leftForeArm, ModelRenderer lowerBody, ModelRenderer rightLeg, ModelRenderer rightCalf, ModelRenderer leftLeg, ModelRenderer leftCalf) {
        super(upperBody, head, rightArm, rightForeArm, leftArm, leftForeArm, lowerBody, rightLeg, rightCalf, leftLeg, leftCalf);
    }

    @Override
    public void renderAnimations(ModEntity entity) throws SequenceInterruptedException
    {
        if(finishedAnimating) { time = seconds; finishedAnimating = false; }

        int frame = seconds - time;

        if(isSequenceDisrupted(frame)) throw new SequenceInterruptedException();

        if(frame == 1)
        {
            LeftArm.rotateAngleY = degToRad(-30f);
            RightForeArm.rotateAngleX = degToRad(10f);
            stage = 2;
        }
        if(frame == 2)
        {
            Head.rotateAngleX = degToRad(2f);
            UpperBody.rotateAngleX = degToRad(-2f);
            RightArm.rotateAngleX = degToRad(10f);
            stage = 3;
        }
        if(frame == 3)
        {
            Head.rotateAngleX = degToRad(4f);
            UpperBody.rotateAngleX = degToRad(-4f);
            RightArm.rotateAngleX = degToRad(20f);
            stage = 4;
        }
        if(frame == 4)
        {
            Head.rotateAngleX = degToRad(6f);
            UpperBody.rotateAngleX = degToRad(-6f);
            RightArm.rotateAngleX = degToRad(30f);
            stage = 5;
        }
        if(frame == 5)
        {
            Head.rotateAngleX = degToRad(8f);
            UpperBody.rotateAngleX = degToRad(-8f);
            RightArm.rotateAngleX = degToRad(40f);
            stage = 6;
        }
        if(frame == 6)
        {
            Head.rotateAngleX = degToRad(10f);
            UpperBody.rotateAngleX = degToRad(-10f);
            RightArm.rotateAngleX = degToRad(50f);
            stage = 7;
        }
        if(frame == 7)
        {
            Head.rotateAngleX = degToRad(15f);
            stage = 8;
        }
        if(frame == 8)
        {
            Head.rotateAngleX = degToRad(10f);
            stage = 9;
        }
        if(frame == 9)
        {
            Head.rotateAngleX = degToRad(15f);
            stage = 10;
        }
        if(frame == 10)
        {
            Head.rotateAngleX = degToRad(10f);
            stage = 11;
        }
        if(frame == 11)
        {
            Head.rotateAngleX = degToRad(15f);
            stage = 12;
        }
        if(frame == 12)
        {
            Head.rotateAngleX = degToRad(10f);
            stage = 13;
        }
        if(frame == 13)
        {
            Head.rotateAngleX = degToRad(10f);
            UpperBody.rotateAngleX = degToRad(-10f);
            RightArm.rotateAngleX = degToRad(50f);
            stage = 14;
        }
        if(frame == 14)
        {
            Head.rotateAngleX = degToRad(8f);
            UpperBody.rotateAngleX = degToRad(-8f);
            RightArm.rotateAngleX = degToRad(40f);
            stage = 15;
        }
        if(frame == 15)
        {
            Head.rotateAngleX = degToRad(6f);
            UpperBody.rotateAngleX = degToRad(-6f);
            RightArm.rotateAngleX = degToRad(30f);
            stage = 16;
        }
        if(frame == 16)
        {
            Head.rotateAngleX = degToRad(2f);
            UpperBody.rotateAngleX = degToRad(-2f);
            RightArm.rotateAngleX = degToRad(10f);
            stage = 17;
        }
        if(frame == 17)
        {
            Head.rotateAngleX = degToRad(0f);
            UpperBody.rotateAngleX = degToRad(0f);
            LeftArm.rotateAngleY = degToRad(0f);
            RightArm.rotateAngleX = degToRad(0f);
            RightForeArm.rotateAngleX = degToRad(0f);
            ModelAnimations.stopAnimation(entity);
            this.endAnimation();
        }

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
}
