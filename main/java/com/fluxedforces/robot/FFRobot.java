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
public class FFRobot extends EntityLiving {

	public ResourceLocation m_texture = new ResourceLocation("fluxedforces:textures/robot/ROB_TEX.png");
	
	/**
	 * @param world
	 */
	public FFRobot(World world) {
		super(world);
	}






}
