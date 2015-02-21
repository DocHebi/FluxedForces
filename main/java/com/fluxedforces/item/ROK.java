/**
 * 
 */
package com.fluxedforces.item;

import com.fluxedforces.init.FFTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public class ROK extends FFEnergyItem {

	private IIcon m_iconOff;
	private IIcon m_icon25;
	private IIcon m_icon50;
	private IIcon m_icon75;
	private IIcon m_iconOn;
	
	public ROK()
	{
		super(30000, 1000, 1000);
		
		super.setUnlocalizedName("fluxedforces.rok");
		
		this.setHasSubtypes(true);
	}
	
	 @SideOnly(Side.CLIENT)
	    public IIcon getIconFromDamage(int damage)
	    {
	        switch(damage)
	        {
	        case 0:
	        	return m_iconOff;
	        case 1:
	        	return m_icon25;
	        case 2:
	        	return m_icon50;
	        case 3:
	        	return m_icon75;
	        case 4:
	        	return m_iconOn;
	        default:
	        	return m_iconOn;
	        }
	    }
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister registry)
    {
        m_iconOff = registry.registerIcon("fluxedforces:rok/rok_off");
        m_icon25 = registry.registerIcon("fluxedforces:rok/rok_25");
        m_icon50 = registry.registerIcon("fluxedforces:rok/rok_50");
        m_icon75 = registry.registerIcon("fluxedforces:rok/rok_75");
        m_iconOn = registry.registerIcon("fluxedforces:rok/rok_on");
    }
}
