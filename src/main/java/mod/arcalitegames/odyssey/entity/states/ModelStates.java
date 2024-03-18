package mod.arcalitegames.odyssey.entity.states;

import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.odyssey.entity.animations.Animations;
import mod.arcalitegames.odyssey.entity.states.common.SittingState;

public class ModelStates
{
	public static void renderSittingState(ModEntity entity, SittingState state)
	{
		boolean flag = entity.getDataManager().get(ModEntity.sitting);
		
		if(flag)
		{
			state.renderState();
		}
	}
	
	public static void resetState(ModEntity entity)
	{
		entity.getDataManager().set(ModEntity.animation, Animations.RESET);
	}
}
