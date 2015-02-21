/**
 * 
 */
package com.fluxedforces.robot;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public class FFRobot extends Entity {

	public ResourceLocation m_texture = new ResourceLocation("fluxedforces:textures/robot/ROB_TEX");
	
	/**
	 * @param world
	 */
	public FFRobot(World world) {
		super(world);
	}

	/* (non-Javadoc)
	 * @see net.minecraft.entity.Entity#entityInit()
	 */
	@Override
	protected void entityInit() 
	{
			
	}

	/* (non-Javadoc)
	 * @see net.minecraft.entity.Entity#readEntityFromNBT(net.minecraft.nbt.NBTTagCompound)
	 */
	@Override
	protected void readEntityFromNBT(NBTTagCompound tag) 
	{
		
	}

	/* (non-Javadoc)
	 * @see net.minecraft.entity.Entity#writeEntityToNBT(net.minecraft.nbt.NBTTagCompound)
	 */
	@Override
	protected void writeEntityToNBT(NBTTagCompound tag) 
	{
		
	}
	
	 public void onUpdate()
	 {
	        this.onEntityUpdate();
	 }





}
