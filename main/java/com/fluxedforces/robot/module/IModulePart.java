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
public interface IModulePart {

	public void robotTick(FFRobot robot);
	
	public Method getCallback();
	
}
