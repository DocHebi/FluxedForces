/**
 * 
 */
package com.fluxedforces.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

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
	 public IIcon getIcon(ItemStack stack, int pass)
	 {
		 int energy;
		 
		 NBTTagCompound tag = stack.getTagCompound();
		 
		 if(stack.stackTagCompound != null)
		 {
		 if(!stack.stackTagCompound.hasKey("Energy"))
		 {
			 stack.stackTagCompound.setInteger("Energy", 0);
		 }
		 
		
		 
		 	energy = this.getEnergyStored(stack);
		
		 
		 	if(energy == 0)
		 	{
			 	return m_iconOff;
		 	}
		 
		 	if(energy <= 250)
		 	{
			 	return m_icon25;
		 	}
		 
		 	if(energy <= 500)
		 	{
			 	return m_icon50;
		 	}
		 
		 	if(energy <= 750)
		 	{
			 	return m_icon75;
		 	}
		 
		 	if(energy <= 1000)
		 	{
			 	return m_iconOn;
		 	}
		 }
		 
		 return m_iconOn;
			 
		 
		 
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
