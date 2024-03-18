package mod.arcalitegames.odyssey.entity.animations.common;

import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.system.exceptions.SequenceInterruptedException;
import mod.arcalitegames.system.util.Counter;
import mod.arcalitegames.system.util.ICounter;
import net.minecraft.client.renderer.model.ModelRenderer;

public abstract class AbstractAnimation implements ICounter
{
    protected final ModelRenderer UpperBody;
    protected final ModelRenderer Head;
    protected final ModelRenderer RightArm;
    protected final ModelRenderer RightForeArm;
    protected final ModelRenderer LeftArm;
    protected final ModelRenderer LeftForeArm;
    protected final ModelRenderer LowerBody;
    protected final ModelRenderer RightLeg;
    protected final ModelRenderer RightCalf;
    protected final ModelRenderer LeftLeg;
    protected final ModelRenderer LeftCalf;
    protected boolean finishedAnimating = true;
    protected int stage = 1;
    protected int seconds = 0;
    protected int ticks = 0;
    protected int time = 0;

    public AbstractAnimation(ModelRenderer upperBody, ModelRenderer head, ModelRenderer rightArm, ModelRenderer rightForeArm, ModelRenderer leftArm, ModelRenderer leftForeArm, ModelRenderer lowerBody, ModelRenderer rightLeg, ModelRenderer rightCalf, ModelRenderer leftLeg, ModelRenderer leftCalf) {
        UpperBody = upperBody;
        Head = head;
        RightArm = rightArm;
        RightForeArm = rightForeArm;
        LeftArm = leftArm;
        LeftForeArm = leftForeArm;
        LowerBody = lowerBody;
        RightLeg = rightLeg;
        RightCalf = rightCalf;
        LeftLeg = leftLeg;
        LeftCalf = leftCalf;
        Counter.Countable.registerCounter(this);
    }

    protected float degToRad(float degrees)
    {
        return -degrees * (float)Math.PI / 180 ;
    }

    public abstract void renderAnimations(ModEntity entity) throws SequenceInterruptedException;

    protected boolean isSequenceDisrupted(int frame)
    {
        if(frame == 0) return false;

        if(frame == stage || frame == (stage - 1)) return false;

        else return true;
    }


    public void resetAnimations()
    {
        this.endAnimation();
        Head.rotateAngleX = degToRad(0.0f);
        Head.rotateAngleY = degToRad(0.0f);
        Head.rotateAngleZ = degToRad(0.0f);
        UpperBody.rotateAngleX = degToRad(0.0f);
        UpperBody.rotateAngleY = degToRad(0.0f);
        UpperBody.rotateAngleZ = degToRad(0.0f);
        RightArm.rotateAngleX = degToRad(0.0f);
        RightArm.rotateAngleY = degToRad(0.0f);
        RightArm.rotateAngleZ = degToRad(0.0f);
        LeftArm.rotateAngleX = degToRad(0.0f);
        LeftArm.rotateAngleY = degToRad(0.0f);
        LeftArm.rotateAngleZ = degToRad(0.0f);
        RightForeArm.rotateAngleX = degToRad(0.0f);
        RightForeArm.rotateAngleY = degToRad(0.0f);
        RightForeArm.rotateAngleZ = degToRad(0.0f);
        LeftForeArm.rotateAngleX = degToRad(0.0f);
        LeftForeArm.rotateAngleY = degToRad(0.0f);
        LeftForeArm.rotateAngleZ = degToRad(0.0f);
        LowerBody.rotateAngleX = degToRad(0.0f);
        LowerBody.rotateAngleY = degToRad(0.0f);
        LowerBody.rotateAngleZ = degToRad(0.0f);
        RightLeg.rotateAngleX = degToRad(0.0f);
        RightLeg.rotateAngleY = degToRad(0.0f);
        RightLeg.rotateAngleZ = degToRad(0.0f);
        LeftLeg.rotateAngleX = degToRad(0.0f);
        LeftLeg.rotateAngleY = degToRad(0.0f);
        LeftLeg.rotateAngleZ = degToRad(0.0f);
        RightCalf.rotateAngleX = degToRad(0.0f);
        RightCalf.rotateAngleY = degToRad(0.0f);
        RightCalf.rotateAngleZ = degToRad(0.0f);
        LeftCalf.rotateAngleX = degToRad(0.0f);
        LeftCalf.rotateAngleY = degToRad(0.0f);
        LeftCalf.rotateAngleZ = degToRad(0.0f);
    }

    protected void endAnimation()
    {
        stage = 1;
        finishedAnimating = true;
        
    }
}
