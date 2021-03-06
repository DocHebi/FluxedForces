package com.fluxedforces;

import com.fluxedforces.help.References;
import com.fluxedforces.init.FFBlocks;
import com.fluxedforces.init.FFItems;
import com.fluxedforces.init.FFTabs;
import com.fluxedforces.model.render.RobotRenderer;
import com.fluxedforces.recipe.FFRecipes;
import com.fluxedforces.robot.FFRobot;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms.IMCEvent;
import cpw.mods.fml.common.event.FMLInterModComms.IMCMessage;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
@Mod(modid = References.MOD_ID, name = References.MOD_NAME, version = References.MOD_VERSION)
public class FluxedForces {

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		RenderingRegistry.registerEntityRenderingHandler(FFRobot.class, new RobotRenderer());
		
		FFItems.init();
		FFBlocks.init();
		
		FFTabs.init();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		
		FFItems.registerItems();
		FFBlocks.registerBlocks();
		
		EntityRegistry.registerGlobalEntityID(FFRobot.class, "fluxedforces.robot", EntityRegistry.findGlobalUniqueEntityId());
		
		
		
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
