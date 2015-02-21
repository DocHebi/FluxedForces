/**
 * 
 */
package com.fluxedforces.robot.module;

import java.lang.reflect.Method;

import com.fluxedforces.robot.FFRobot;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public interface IRobotModule {

	public IModulePart[] getParts();
	
	public void robotTick(FFRobot robot);
	
	public Method getCallback();
	
}
