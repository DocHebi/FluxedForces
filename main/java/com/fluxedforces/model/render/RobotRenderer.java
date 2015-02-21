/**
 * 
 */
package com.fluxedforces.model.render;

import com.fluxedforces.model.RobotModel;
import com.fluxedforces.robot.FFRobot;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public class RobotRenderer extends RendererLivingEntity {

	/**
	 * @param model
	 * @param shadow
	 */
	public RobotRenderer() 
	{
		super(new RobotModel(), 0.5f);
	}

	/* (non-Javadoc)
	 * @see net.minecraft.client.renderer.entity.Render#getEntityTexture(net.minecraft.entity.Entity)
	 */
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		if(entity instanceof FFRobot)
		{
			return (ResourceLocation) ((FFRobot) entity).m_texture;
		}
		return null;
	}

}
