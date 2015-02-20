/**
 * 
 */
package com.fluxedforces.init;

import com.fluxedforces.help.FFUtil;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public class FFTabs {
	
	
	
	public static boolean init()
	{
		return false;
	}
	
	public static class FFTab extends CreativeTabs
	{
		private final Item m_displayItem;
		
		public FFTab(String unlocName, Item displayItem)
		{
			super(CreativeTabs.getNextID(), FFUtil.Translate(unlocName));
			
			this.m_displayItem = displayItem;
		}
		
		public FFTab(String unlocName, String displayItemName)
		{
			this(unlocName, GameRegistry.findItem(displayItemName.split(":")[0], displayItemName.split(":")[1]));
		}

	
		public Item getTabIconItem() {
			if(m_displayItem != null)
			return m_displayItem;
			
			return Items.cake;
		}
	}
	
}
