package com.fluxedforces.init;

import com.fluxedforces.help.RegistryHelper;
import com.fluxedforces.item.ROK;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public class FFItems{

	public static ROK ROK;
	
	public static String getStandartUnlocName(String name)
	{
		return "fluxedforces." + name;
	}
	
	public static boolean init() {
		
		ROK = new ROK();
		
		return false;
	}
	
	public static void registerItems()
	{
		RegistryHelper.registerItem(ROK);
	}

	

}
