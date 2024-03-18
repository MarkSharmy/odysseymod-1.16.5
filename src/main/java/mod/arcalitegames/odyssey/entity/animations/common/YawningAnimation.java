package mod.arcalitegames.odyssey.entity.animations.common;

import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.system.exceptions.SequenceInterruptedException;
import net.minecraft.client.renderer.model.ModelRenderer;

public class YawningAnimation extends AbstractAnimation
{

    public YawningAnimation(ModelRenderer upperBody, ModelRenderer head, ModelRenderer rightArm, ModelRenderer rightForeArm, ModelRenderer leftArm, ModelRenderer leftForeArm, ModelRenderer lowerBody, ModelRenderer rightLeg, ModelRenderer rightCalf, ModelRenderer leftLeg, ModelRenderer leftCalf) {
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
            RightArm.rotateAngleY = degToRad(10f);
            RightArm.rotateAngleZ = degToRad(-10f);
            stage = 2;
        }
        if(frame == 2)
        {
            RightArm.rotateAngleX = degToRad(10f);
            RightArm.rotateAngleY = degToRad(20f);
            RightArm.rotateAngleZ = degToRad(-20f);
            RightForeArm.rotateAngleX = degToRad(15f);
            stage = 3;
        }
        if(frame == 3)
        {
            RightArm.rotateAngleX = degToRad(20f);
            RightArm.rotateAngleY = degToRad(30f);
            RightArm.rotateAngleZ = degToRad(-30f);
            RightForeArm.rotateAngleX = degToRad(30f);
            Head.rotateAngleX = degToRad(5f);
            stage = 4;
        }
        if(frame == 4)
        {
            RightArm.rotateAngleX = degToRad(30f);
            RightArm.rotateAngleY = degToRad(40f);
            RightArm.rotateAngleZ = degToRad(-40f);
            RightForeArm.rotateAngleX = degToRad(45f);
            Head.rotateAngleX = degToRad(10f);
            stage = 5;
        }
        if(frame == 5)
        {
            RightArm.rotateAngleX = degToRad(40f);
            RightForeArm.rotateAngleX = degToRad(60f);
            Head.rotateAngleX = degToRad(15f);
            stage = 6;
        }
        if(frame == 6)
        {
            RightArm.rotateAngleX = degToRad(50f);
            RightForeArm.rotateAngleX = degToRad(75f);
            stage = 7;
        }
        if(frame == 7)
        {
            RightForeArm.rotateAngleX = degToRad(95f);
            stage = 8;
        }
        if(frame == 8)
        {
            RightForeArm.rotateAngleX = degToRad(80f);
            stage = 9;
        }
        if(frame == 9)
        {
            RightForeArm.rotateAngleX = degToRad(80f);
            stage = 10;
        }
        if(frame == 10)
        {
            RightForeArm.rotateAngleX = degToRad(95f);
            stage = 11;
        }
        if(frame == 11)
        {
            RightForeArm.rotateAngleX = degToRad(80f);
            stage = 12;
        }
        if(frame == 12)
        {
            RightForeArm.rotateAngleX = degToRad(80f);
            stage = 13;
        }
        if(frame == 13)
        {
            RightForeArm.rotateAngleX = degToRad(95f);
            stage = 14;
        }
        if(frame == 14)
        {
            RightArm.rotateAngleX = degToRad(50f);
            RightForeArm.rotateAngleX = degToRad(75f);
            Head.rotateAngleX = degToRad(10f);
            stage = 15;
        }
        if(frame == 15)
        {
            RightArm.rotateAngleX = degToRad(40f);
            RightForeArm.rotateAngleX = degToRad(60f);
            Head.rotateAngleX = degToRad(5f);
            stage = 16;
        }
        if(frame == 16)
        {
            RightArm.rotateAngleX = degToRad(30f);
            RightArm.rotateAngleY = degToRad(40f);
            RightArm.rotateAngleZ = degToRad(-40f);
            RightForeArm.rotateAngleX = degToRad(45f);
            Head.rotateAngleX = degToRad(0f);
            stage = 17;
        }
        if(frame == 17)
        {
            RightArm.rotateAngleX = degToRad(20f);
            RightArm.rotateAngleY = degToRad(30f);
            RightArm.rotateAngleZ = degToRad(-30f);
            RightForeArm.rotateAngleX = degToRad(30f);
            stage = 18;
        }
        if(frame == 18)
        {
            RightArm.rotateAngleX = degToRad(10f);
            RightArm.rotateAngleY = degToRad(20f);
            RightArm.rotateAngleZ = degToRad(-20f);
            RightForeArm.rotateAngleX = degToRad(15f);
            stage = 19;
        }
        if(frame == 19)
        {
            RightArm.rotateAngleY = degToRad(10f);
            RightArm.rotateAngleZ = degToRad(-10f);
            RightForeArm.rotateAngleX = degToRad(0f);
            stage = 20;
        }
        if(frame == 20)
        {
        	RightArm.rotateAngleX = degToRad(0f);
            RightArm.rotateAngleY = degToRad(0f);
            RightArm.rotateAngleZ = degToRad(0f);
            this.endAnimation();
            ModelAnimations.stopAnimation(entity);
        }

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
}
