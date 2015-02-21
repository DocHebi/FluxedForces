/**
 * 
 */
package com.fluxedforces.model.render;

import com.fluxedforces.model.RobotModel;
import com.fluxedforces.robot.FFRobot;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public class RobotRenderer extends Render {

	/* (non-Javadoc)
	 * @see net.minecraft.client.renderer.entity.Render#doRender(net.minecraft.entity.Entity, double, double, double, float, float)
	 */
	@Override
	public void doRender(Entity p_76986_1_, double p_76986_2_,
			double p_76986_4_, double p_76986_6_, float p_76986_8_,
			float p_76986_9_)
	{
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see net.minecraft.client.renderer.entity.Render#getEntityTexture(net.minecraft.entity.Entity)
	 */
	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return ((FFRobot) entity).m_texture;
	}



}
