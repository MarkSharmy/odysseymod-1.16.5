package mod.arcalitegames.odyssey.entity.animations.common;

import java.util.Random;

import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.system.exceptions.SequenceInterruptedException;
import net.minecraft.client.renderer.model.ModelRenderer;

public class InteractingAnimation extends AbstractAnimation
{
	private int cycles = 0;
    private int variation = 0;

    public InteractingAnimation(ModelRenderer upperBody, ModelRenderer head, ModelRenderer rightArm, ModelRenderer rightForeArm, ModelRenderer leftArm, ModelRenderer leftForeArm, ModelRenderer lowerBody, ModelRenderer rightLeg, ModelRenderer rightCalf, ModelRenderer leftLeg, ModelRenderer leftCalf)
    {
        super(upperBody, head, rightArm, rightForeArm, leftArm, leftForeArm, lowerBody, rightLeg, rightCalf, leftLeg, leftCalf);
    }

    @Override
    public void renderAnimations(ModEntity entity) throws SequenceInterruptedException
    {
        if(finishedAnimating)
        {
            time = seconds;
            finishedAnimating = false;
            variation = new Random().nextInt(12);
        }

        int frame = seconds - time;

        if(isSequenceDisrupted(frame)) throw new SequenceInterruptedException();

        switch (variation)
        {
            case 0: playAnimation1(frame);
            break;
            case 1: playAnimation1(frame);
            break;
            case 2: playAnimation1(frame);
            break;
            case 3: playAnimation1(frame);
            break;
            case 4: playAnimation1(frame);
            break;
            case 5: playAnimation2(frame);
            break;
            case 6: playAnimation1(frame);
            break;
            case 7: playAnimation3(frame);
            break;
            case 8: playAnimation1(frame);
            break;
            case 9: playAnimation4(frame);
            break;
            case 10: playAnimation1(frame);
            break;
            case 11: playAnimation5(frame);
            break;
        }
        
        if(cycles > 3)
        {
        	ModelAnimations.stopAnimation(entity);
        	cycles = 0;
        }

    }

    private void playAnimation1(int frame)
    {
    	if(frame == 1)
        {
            Head.rotateAngleX = degToRad(5f);
            stage = 2;
        }
        if(frame == 2)
        {
            Head.rotateAngleX = degToRad(0f);
            stage = 3;
        }
        if(frame == 3)
        {
            Head.rotateAngleX = degToRad(5f);
            stage = 4;
        }
        if(frame == 4)
        {
            Head.rotateAngleX = degToRad(0f);
            stage = 5;
        }
        if(frame == 5)
        {
            Head.rotateAngleX = degToRad(5f);
            stage = 6;
        }
        if(frame == 6)
        {
            Head.rotateAngleX = degToRad(0f);
            stage = 7;
        }
        if(frame == 7)
        {
            Head.rotateAngleX = degToRad(5f);
            stage = 8;
        }
        if(frame == 8)
        {
            Head.rotateAngleX = degToRad(0f);
            stage = 9;
        }
        if(frame == 9)
        {
            Head.rotateAngleX = degToRad(5f);
            stage = 10;
        }
        if(frame == 10)
        {
            Head.rotateAngleX = degToRad(0f);
            stage = 11;
        }
        if(frame == 11)
        {
            Head.rotateAngleX = degToRad(5f);
            stage = 12;
        }
        if(frame == 12)
        {
            Head.rotateAngleX = degToRad(0f);
            this.endAnimation();
            cycles++;
        }
        
    }

    private void playAnimation2(int frame)
    {
        if(frame == 1)
        {
            Head.rotateAngleX = degToRad(5f);
            RightArm.rotateAngleZ = degToRad(-15f);
            RightForeArm.rotateAngleX = degToRad(15f);
            stage = 2;
        }
        if(frame == 2)
        {
            Head.rotateAngleX = degToRad(0f);
            LeftArm.rotateAngleX = degToRad(9f);
            RightArm.rotateAngleX = degToRad(9f);
            UpperBody.rotateAngleX = degToRad(-2f);
            stage = 3;
        }
        if(frame == 3)
        {
            Head.rotateAngleX = degToRad(5f);
            LeftArm.rotateAngleX = degToRad(18f);
            RightArm.rotateAngleX = degToRad(18f);
            UpperBody.rotateAngleX = degToRad(-4f);
            stage = 4;
        }
        if(frame == 4)
        {
            Head.rotateAngleX = degToRad(0f);
            LeftArm.rotateAngleX = degToRad(27f);
            RightArm.rotateAngleX = degToRad(27f);
            UpperBody.rotateAngleX = degToRad(-6f);
            stage = 5;
        }
        if(frame == 5)
        {
            Head.rotateAngleX = degToRad(5f);
            LeftArm.rotateAngleX = degToRad(36f);
            RightArm.rotateAngleX = degToRad(36f);
            UpperBody.rotateAngleX = degToRad(-8f);
            stage = 6;
        }
        if(frame == 6)
        {
            Head.rotateAngleX = degToRad(0f);
            LeftArm.rotateAngleX = degToRad(45f);
            RightArm.rotateAngleX = degToRad(45f);
            UpperBody.rotateAngleX = degToRad(-10f);
            stage = 7;
        }
        if(frame == 7)
        {
            Head.rotateAngleX = degToRad(5f);
            stage = 8;
        }
        if(frame == 8)
        {
            Head.rotateAngleX = degToRad(0f);
            stage = 9;
        }
        if(frame == 9)
        {
            Head.rotateAngleX = degToRad(5f);
            LeftArm.rotateAngleX = degToRad(36f);
            RightArm.rotateAngleX = degToRad(36f);
            UpperBody.rotateAngleX = degToRad(-8f);
            stage = 10;
        }
        if(frame == 10)
        {
            Head.rotateAngleX = degToRad(0f);
            LeftArm.rotateAngleX = degToRad(27f);
            RightArm.rotateAngleX = degToRad(27f);
            UpperBody.rotateAngleX = degToRad(-6f);
            stage = 11;
        }
        if(frame == 11)
        {
            Head.rotateAngleX = degToRad(5f);
            LeftArm.rotateAngleX = degToRad(18f);
            RightArm.rotateAngleX = degToRad(18f);
            UpperBody.rotateAngleX = degToRad(-4f);
            stage = 12;
        }
        if(frame == 12)
        {
            Head.rotateAngleX = degToRad(0f);
            LeftArm.rotateAngleX = degToRad(9f);
            RightArm.rotateAngleX = degToRad(9f);
            UpperBody.rotateAngleX = degToRad(-2f);
            stage = 13;
        }
        if(frame == 13)
        {
            Head.rotateAngleX = degToRad(0f);
            LeftArm.rotateAngleX = degToRad(0f);
            RightArm.rotateAngleX = degToRad(0f);
            RightArm.rotateAngleZ = degToRad(0f);
            RightForeArm.rotateAngleX = degToRad(0f);
            UpperBody.rotateAngleX = degToRad(0f);
            cycles++;
            this.endAnimation();
        }

    }

    private void playAnimation3(int frame)
    {
    	if(frame == 1)
        {
            Head.rotateAngleX = degToRad(5f);
            LeftArm.rotateAngleY = degToRad(-30f);
            RightForeArm.rotateAngleX = degToRad(15f);
            stage = 2;
        }
        if(frame == 2)
        {
            Head.rotateAngleX = degToRad(0f);
            RightArm.rotateAngleX = degToRad(9f);
            stage = 3;
        }
        if(frame == 3)
        {
            Head.rotateAngleX = degToRad(5f);
            RightArm.rotateAngleX = degToRad(18f);
            stage = 4;
        }
        if(frame == 4)
        {
            Head.rotateAngleX = degToRad(0f);
            RightArm.rotateAngleX = degToRad(27f);
            stage = 5;
        }
        if(frame == 5)
        {
            Head.rotateAngleX = degToRad(5f);
            RightArm.rotateAngleX = degToRad(36f);
            stage = 6;
        }
        if(frame == 6)
        {
            Head.rotateAngleX = degToRad(0f);
            RightArm.rotateAngleX = degToRad(45f);
            stage = 7;
        }
        if(frame == 7)
        {
            Head.rotateAngleX = degToRad(5f);
            RightArm.rotateAngleY = degToRad(-15f);
            stage = 8;
        }
        if(frame == 8)
        {
            Head.rotateAngleX = degToRad(0f);
            RightArm.rotateAngleY = degToRad(-15f);
            stage = 9;
        }
        if(frame == 9)
        {
            Head.rotateAngleX = degToRad(5f);
            RightArm.rotateAngleY = degToRad(0f);
            stage = 10;
        }
        if(frame == 10)
        {
            Head.rotateAngleX = degToRad(0f);
            RightArm.rotateAngleX = degToRad(36f);
            stage = 11;
        }
        if(frame == 11)
        {
            Head.rotateAngleX = degToRad(5f);
            RightArm.rotateAngleX = degToRad(27f);
            stage = 12;
        }
        if(frame == 12)
        {
            Head.rotateAngleX = degToRad(0f);
            RightArm.rotateAngleX = degToRad(18f);
            stage = 13;
        }
        if(frame == 13)
        {
            Head.rotateAngleX = degToRad(5f);
            RightArm.rotateAngleX = degToRad(9f);
            stage = 14;
        }
        if(frame == 14)
        {
            Head.rotateAngleX = degToRad(0f);
            LeftArm.rotateAngleY = degToRad(0f);
            RightArm.rotateAngleX = degToRad(0f);
            RightForeArm.rotateAngleX = degToRad(0f);
            this.endAnimation();
            cycles++;
        }
    }
    
    private void playAnimation4(int frame)
    {
    	if(frame == 1)
        {
            RightArm.rotateAngleY = degToRad(10f);
            RightArm.rotateAngleZ = degToRad(-10f);
            Head.rotateAngleX = degToRad(5f);
            stage = 2;
        }
        if(frame == 2)
        {
            RightArm.rotateAngleX = degToRad(10f);
            RightArm.rotateAngleY = degToRad(20f);
            RightArm.rotateAngleZ = degToRad(-20f);
            RightForeArm.rotateAngleX = degToRad(30f);
            Head.rotateAngleX = degToRad(0f);
            stage = 3;
        }
        if(frame == 3)
        {
            RightArm.rotateAngleX = degToRad(20f);
            RightArm.rotateAngleY = degToRad(30f);
            RightArm.rotateAngleZ = degToRad(-30f);
            RightForeArm.rotateAngleX = degToRad(60f);
            Head.rotateAngleX = degToRad(5f);
            stage = 4;
        }
        if(frame == 4)
        {
            RightArm.rotateAngleX = degToRad(30f);
            RightArm.rotateAngleY = degToRad(40f);
            RightArm.rotateAngleZ = degToRad(-40f);
            RightForeArm.rotateAngleX = degToRad(90f);
            Head.rotateAngleX = degToRad(0f);
            stage = 5;
        }
        if(frame == 5)
        {
            RightArm.rotateAngleX = degToRad(40f);
            LeftArm.rotateAngleY = degToRad(-10f);
            Head.rotateAngleX = degToRad(5f);
            stage = 6;
        }
        if(frame == 6)
        {
            RightArm.rotateAngleX = degToRad(50f);
            LeftArm.rotateAngleY = degToRad(-20f);
            Head.rotateAngleX = degToRad(0f);
            stage = 7;
        }
        if(frame == 7)
        {
            Head.rotateAngleX = degToRad(5f);
            stage = 8;
        }
        if(frame == 8)
        {
            Head.rotateAngleX = degToRad(0f);
            stage = 9;
        }
        if(frame == 9)
        {
            Head.rotateAngleX = degToRad(5f);
            stage = 10;
        }
        if(frame == 10)
        {
            Head.rotateAngleX = degToRad(0f);
            stage = 11;
        }
        if(frame == 11)
        {
            Head.rotateAngleX = degToRad(5f);
            stage = 12;
        }
        if(frame == 12)
        {
            Head.rotateAngleX = degToRad(0f);
            stage = 13;
        }
        if(frame == 13)
        {
            Head.rotateAngleX = degToRad(5f);
            stage = 14;
        }
        if(frame == 14)
        {
            Head.rotateAngleX = degToRad(0f);
            stage = 15;
        }
        if(frame == 15)
        {
            Head.rotateAngleX = degToRad(5f);
            stage = 16;
        }
        if(frame == 16)
        {
            Head.rotateAngleX = degToRad(0f);
            stage = 17;
        }
        if(frame == 17)
        {
            Head.rotateAngleX = degToRad(5f);
            stage = 18;
        }
        if(frame == 18)
        {
            Head.rotateAngleX = degToRad(0f);
            stage = 19;
        }
        if(frame == 19)
        {
            Head.rotateAngleX = degToRad(5f);
            stage = 20;
        }
        if(frame == 20)
        {
            Head.rotateAngleX = degToRad(0f);
            stage = 21;
        }
        if(frame == 21)
        {
            Head.rotateAngleX = degToRad(5f);
            stage = 22;
        }
        if(frame == 22)
        {
            Head.rotateAngleX = degToRad(0f);
            stage = 23;
        }
        if(frame == 23)
        {
            RightArm.rotateAngleX = degToRad(40f);
            RightForeArm.rotateAngleX = degToRad(75f);
            LeftArm.rotateAngleY = degToRad(-10f);
            stage = 24;
        }
        if(frame == 24)
        {
            RightArm.rotateAngleX = degToRad(30f);
            RightArm.rotateAngleY = degToRad(40f);
            RightArm.rotateAngleZ = degToRad(-30f);
            RightForeArm.rotateAngleX = degToRad(60f);
            LeftArm.rotateAngleY = degToRad(0f);
            stage = 25;
        }
        if(frame == 25)
        {
            RightArm.rotateAngleX = degToRad(20f);
            RightArm.rotateAngleY = degToRad(30f);
            RightArm.rotateAngleZ = degToRad(-20f);
            RightForeArm.rotateAngleX = degToRad(30f);
            stage = 26;
        }
        if(frame == 26)
        {
            RightArm.rotateAngleX = degToRad(10f);
            RightArm.rotateAngleY = degToRad(20f);
            RightArm.rotateAngleZ = degToRad(-10f);
            RightForeArm.rotateAngleX = degToRad(15f);
            stage = 27;
        }
        if(frame == 27)
        {
            RightArm.rotateAngleX = degToRad(0f);
            RightArm.rotateAngleY = degToRad(0f);
            RightArm.rotateAngleZ = degToRad(0f);
            RightForeArm.rotateAngleX = degToRad(0f);
           this.endAnimation();
		   cycles++;
        }
    }
    
    private void playAnimation5(int frame)
    {
    	if(frame == 1)
        {
            RightArm.rotateAngleX = degToRad(5f);
            RightForeArm.rotateAngleX = degToRad(5f);
            LeftArm.rotateAngleY = degToRad(-5f);
            Head.rotateAngleX = degToRad(5f);
            stage = 2;
        }
        if(frame == 2)
        {
            RightArm.rotateAngleX = degToRad(10f);
            RightForeArm.rotateAngleX = degToRad(10f);
            LeftArm.rotateAngleY = degToRad(-10f);
            Head.rotateAngleX = degToRad(0f);
            stage = 3;
        }
        if(frame == 3)
        {
            RightArm.rotateAngleX = degToRad(15f);
            RightForeArm.rotateAngleX = degToRad(15f);
            LeftArm.rotateAngleY = degToRad(-15f);
            Head.rotateAngleX = degToRad(5f);
            stage = 4;
        }
        if(frame == 4)
        {
            Head.rotateAngleX = degToRad(0f);
            stage = 5;
        }
        if(frame == 5)
        {
            Head.rotateAngleX = degToRad(5f);
            stage = 6;
        }
        if(frame == 6)
        {
            Head.rotateAngleX = degToRad(0f);
            stage = 7;
        }
        if(frame == 7)
        {
            Head.rotateAngleX = degToRad(5f);
            stage = 8;
        }
        if(frame == 8)
        {
            Head.rotateAngleX = degToRad(0f);
            stage = 9;
        }
        if(frame == 9)
        {
            Head.rotateAngleX = degToRad(5f);
            stage = 10;
        }
        if(frame == 10)
        {
            Head.rotateAngleX = degToRad(0f);
            stage = 11;
        }
        if(frame == 11)
        {
            Head.rotateAngleX = degToRad(5f);
            stage = 12;
        }
        if(frame == 12)
        {
            Head.rotateAngleX = degToRad(0f);
            stage = 13;
        }
        if(frame == 13)
        {
            Head.rotateAngleX = degToRad(5f);
            stage = 14;
        }
        if(frame == 14)
        {
            Head.rotateAngleX = degToRad(0f);
            stage = 15;
        }
        if(frame == 16)
        {
            Head.rotateAngleX = degToRad(5f);
            stage = 17;
        }
        if(frame == 17)
        {
            Head.rotateAngleX = degToRad(0f);
            stage = 18;
        }
        if(frame == 18)
        {
            RightArm.rotateAngleX = degToRad(10f);
            RightForeArm.rotateAngleX = degToRad(10f);
            LeftArm.rotateAngleY = degToRad(-10f);
            stage = 19;
        }
        if(frame == 19)
        {
            RightArm.rotateAngleX = degToRad(5f);
            RightForeArm.rotateAngleX = degToRad(5f);
            LeftArm.rotateAngleY = degToRad(-5f);
            stage = 20;
        }
        if(frame == 20)
        {
            RightArm.rotateAngleX = degToRad(0f);
            RightForeArm.rotateAngleX = degToRad(0f);
            LeftArm.rotateAngleY = degToRad(0f);
            this.endAnimation();
            cycles++;
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
