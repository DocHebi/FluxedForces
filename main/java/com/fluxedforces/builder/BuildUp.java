/**
 * 
 */
package com.fluxedforces.builder;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public class BuildUp {

	public boolean getVerifyPower(int Pay,int Cost)
	{
		
		boolean Gate = false;
		
		if(Pay == Cost)
		{
			Gate = true;
		}
		else
		{
			Gate = false;
		}
		
		return Gate;
	}
	/*
	public boolean getVerifyRecipe(boolean Gate, int Pay,Items A,ModItems B)
	{
		
		Object[] temp, temp1;
		
		
		
		
		return Gate;
	}
	*/
}
