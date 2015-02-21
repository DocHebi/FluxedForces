/**
 * 
 */
package com.fluxedforces.help;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import com.fluxedforces.init.FFItems;
import com.fluxedforces.init.FFTabs;
import com.fluxedforces.item.FFEnergyItem;
import com.fluxedforces.item.FFItem;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public class RegistryHelper {
	
	public static void registerBlock(Block block)
	{
		registerBlock(block, true);
	}
	
	public static void registerBlock(Block block, boolean setTab)
	{
		GameRegistry.registerBlock(block, block.getUnlocalizedName());
		if(setTab)
			block.setCreativeTab(FFTabs.m_mainTab);
	}
	
	public static void registerItem(Item item)
	{
		registerItem(item, true);
	}
	
	public static void registerItem(Item item, boolean setTab)
	{
		GameRegistry.registerItem(item, item.getUnlocalizedName());
		if(setTab)
			item.setCreativeTab(FFTabs.m_mainTab);
	}
	
}
