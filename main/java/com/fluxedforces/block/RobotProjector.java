/**
 * 
 */
package com.fluxedforces.block;

import com.fluxedforces.robot.FFRobot;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public class RobotProjector extends FFBlock
{

	/**
	 * @param unlocName
	 * @param textureName
	 * @param material
	 */
	protected RobotProjector()
	{
		super("projector", "projector", Material.iron);
	}
	
	public int onBlockPlaced(World world, int x, int y, int z, int meta, float f1, float f2, float f3, int i1)
	{
		world.spawnEntityInWorld(new FFRobot(world));
		
		return i1;
	}

}
