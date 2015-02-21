package com.fluxedforces.init;

import com.fluxedforces.block.RobotProjector;
import com.fluxedforces.help.RegistryHelper;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public class FFBlocks{

	public static RobotProjector RobotProjector;
	
	public static boolean init() {
		
		RobotProjector = new RobotProjector();
		
		return false;
	}
	
	public static void registerBlocks()
	{
		RegistryHelper.registerBlock(RobotProjector);
	}

}
