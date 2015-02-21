package com.fluxedforces;

import com.fluxedforces.help.References;
import com.fluxedforces.init.FFBlocks;
import com.fluxedforces.init.FFItems;
import com.fluxedforces.init.FFTabs;
import com.fluxedforces.recipe.FFRecipes;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms.IMCEvent;
import cpw.mods.fml.common.event.FMLInterModComms.IMCMessage;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
@Mod(modid = References.MOD_ID, name = References.MOD_NAME, version = References.MOD_VERSION)
public class FluxedForces {

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		FFItems.init();
		FFBlocks.init();
		
		FFTabs.init();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		
		FFItems.registerItems();
		FFBlocks.registerBlocks();
		
		
		
		FFRecipes.init();
	}
	
	@EventHandler
	public void postInit(FMLInitializationEvent event)
	{
		
	}

	 @EventHandler
	 public void imcCallback(IMCEvent event)
	 {
		 
		 for (final IMCMessage imcMessage : event.getMessages()) {
		 
		 }
	 
	 }
	
}
