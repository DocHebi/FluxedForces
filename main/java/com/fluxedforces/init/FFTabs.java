/**
 * 
 */
package com.fluxedforces.init;

import com.fluxedforces.help.FFUtil;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public class FFTabs {
	
	public static final FFTabs INSTANCE = new FFTabs();
	public static FFTab m_mainTab;
	
	public static boolean init()
	{
		m_mainTab = INSTANCE.new FFTab("main", FFItems.ROK);
		
		return false;
	}
	
	public class FFTab extends CreativeTabs
	{
		private final Item m_displayItem;
		private final String m_lable;
		private final String m_localized_lable;
		
		public FFTab(String unlocName, Item displayItem)
		{
			super(CreativeTabs.getNextID(), null);
			
			m_lable = unlocName;
			m_localized_lable = FFUtil.Translate("tab.fluxedforces." + unlocName);
			
			this.m_displayItem = displayItem;
		}
		
		public FFTab(String unlocName, String displayItemName)
		{
			this(unlocName, GameRegistry.findItem(displayItemName.split(":")[0], displayItemName.split(":")[1]));
		}

		@SideOnly(Side.CLIENT)
	    public String getTranslatedTabLabel()
	    {
	        return m_localized_lable;
	    }
	
		public Item getTabIconItem() {
			if(m_displayItem != null)
			return m_displayItem;
			
			return Items.cake;
		}
	}
	
}
