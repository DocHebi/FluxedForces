/**
 * 
 */
package com.fluxedforces.block;

import com.fluxedforces.robot.FFRobot;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public class RobotProjector extends FFBlock
{
	
	private FFRobot robot;

	/**
	 * @param unlocName
	 * @param textureName
	 * @param material
	 */
	public RobotProjector()
	{
		super("fluxedforces.projector", "projector", Material.iron);
	}
	
	public int onBlockPlaced(World world, int x, int y, int z, int site, float f1, float f2, float f3, int meta)
	{
		super.onBlockPlaced(world, x, y, z, site, f1, f2, f3, meta);
		
		robot = new FFRobot(world);
		robot.setPosition(x + 0.5, y + 2, z + 0.5);
		
		world.spawnEntityInWorld(robot);
		
		return 2;
	}
	

}
