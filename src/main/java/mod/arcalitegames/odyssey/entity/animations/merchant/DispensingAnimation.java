package mod.arcalitegames.odyssey.entity.animations.merchant;

import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.odyssey.entity.animations.common.AbstractAnimation;
import mod.arcalitegames.system.exceptions.SequenceInterruptedException;
import net.minecraft.client.renderer.model.ModelRenderer;

public class DispensingAnimation extends AbstractAnimation
{

    public DispensingAnimation(ModelRenderer upperBody, ModelRenderer head, ModelRenderer rightArm, ModelRenderer rightForeArm, ModelRenderer leftArm, ModelRenderer leftForeArm, ModelRenderer lowerBody, ModelRenderer rightLeg, ModelRenderer rightCalf, ModelRenderer leftLeg, ModelRenderer leftCalf) {
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
            Head.rotateAngleX = degToRad(3f);
            UpperBody.rotateAngleX = degToRad(-3f);
            RightArm.rotateAngleX = degToRad(9f);
            RightForeArm.rotateAngleX = degToRad(12f);
            stage = 2;
        }
        if(frame == 2)
        {
            Head.rotateAngleX = degToRad(6f);
            UpperBody.rotateAngleX = degToRad(-6f);
            RightArm.rotateAngleX = degToRad(18f);
            RightForeArm.rotateAngleX = degToRad(24f);
            stage = 3;
        }
        if(frame == 3)
        {
            Head.rotateAngleX = degToRad(9f);
            UpperBody.rotateAngleX = degToRad(-9f);
            RightArm.rotateAngleX = degToRad(27f);
            RightForeArm.rotateAngleX = degToRad(36f);
            stage = 4;
        }
        if(frame == 4)
        {
            Head.rotateAngleX = degToRad(12f);
            UpperBody.rotateAngleX = degToRad(-12f);
            RightArm.rotateAngleX = degToRad(36f);
            RightForeArm.rotateAngleX = degToRad(48f);
            stage = 5;
        }
        if(frame == 5)
        {
            Head.rotateAngleX = degToRad(15f);
            UpperBody.rotateAngleX = degToRad(-15f);
            RightArm.rotateAngleX = degToRad(45f);
            RightForeArm.rotateAngleX = degToRad(60f);
            stage = 6;
        }
        if(frame == 6)
        {
            Head.rotateAngleX = degToRad(15f);
            UpperBody.rotateAngleX = degToRad(-15f);
            RightArm.rotateAngleX = degToRad(60f);
            RightForeArm.rotateAngleX = degToRad(45f);
            stage = 7;
        }
        if(frame == 7)
        {
            Head.rotateAngleX = degToRad(15f);
            UpperBody.rotateAngleX = degToRad(-15f);
            RightArm.rotateAngleX = degToRad(60f);
            RightForeArm.rotateAngleX = degToRad(30f);
            stage = 8;
        }
        if(frame == 8)
        {
            Head.rotateAngleX = degToRad(9f);
            UpperBody.rotateAngleX = degToRad(-9f);
            RightArm.rotateAngleX = degToRad(27f);
            RightForeArm.rotateAngleX = degToRad(36f);
            stage = 9;
        }
        if(frame == 9)
        {
            Head.rotateAngleX = degToRad(6f);
            UpperBody.rotateAngleX = degToRad(-6f);
            RightArm.rotateAngleX = degToRad(18f);
            RightForeArm.rotateAngleX = degToRad(24f);
            stage = 10;
        }
        if(frame == 10)
        {
            Head.rotateAngleX = degToRad(0f);
            UpperBody.rotateAngleX = degToRad(0f);
            RightArm.rotateAngleX = degToRad(0f);
            RightForeArm.rotateAngleX = degToRad(0f);
            ModelAnimations.stopAnimation(entity);
        }

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
}
