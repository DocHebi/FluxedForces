package com.fluxedforces;

import com.fluxedforces.help.References;
import com.fluxedforces.init.FFBlocks;
import com.fluxedforces.init.FFItems;
import com.fluxedforces.recipe.FFRecipes;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
@Mod(modid = References.MOD_ID, name = References.MOD_NAME, version = References.MOD_VERSION)
public class FluxedForces {

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		FFItems.init();
		FFBlocks.init();
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		
		FFRecipes.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLInitializationEvent event)
	{
		
	}

	
}
