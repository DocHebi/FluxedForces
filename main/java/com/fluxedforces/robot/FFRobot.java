/**
 * 
 */
package com.fluxedforces.robot;

import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public class FFRobot extends EntityLiving {

	public ResourceLocation m_texture = new ResourceLocation("fluxedforces:textures/robot/ROB_TEX.png");
	
	/**
	 * @param world
	 */
	public FFRobot(World world) {
		super(world);
		
		
		
	}
	
	public boolean hitByEntity(Entity entity)
	{
		if(entity instanceof EntityPlayer)
		this.setDead();
			
		return true;
		
	}
	
	public void onEntityUpdate()
	{
		super.onEntityUpdate();
		this.setVelocity(0, 0, 0);
	}






}
