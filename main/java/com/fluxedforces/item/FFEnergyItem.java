/**
 * 
 */
package com.fluxedforces.item;

import com.fluxedforces.help.FFUtil;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import cofh.api.energy.IEnergyContainerItem;
import cofh.api.energy.ItemEnergyContainer;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public class FFEnergyItem extends ItemEnergyContainer {

	public FFEnergyItem(String unlocName)
	{
		super();
		this.setUnlocalizedName("fluxedforces." + unlocName);
	}
	
	public FFEnergyItem(int capacity) {

		this(capacity, capacity, capacity);
	}

	public FFEnergyItem(int capacity, int maxTransfer) {

		this(capacity, maxTransfer, maxTransfer);
	}

	public FFEnergyItem(int capacity, int maxReceive, int maxExtract) {

		super(capacity, maxReceive, maxExtract);
	}
	
	public void setTexture(String texName)
	{
		if(FFUtil.isValString(texName))
			super.setTextureName("fluxedforces:" + texName);
	}
	
}
