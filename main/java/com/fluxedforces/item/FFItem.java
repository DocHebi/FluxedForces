/**
 * 
 */
package com.fluxedforces.item;

import com.fluxedforces.help.FFUtil;

import net.minecraft.item.Item;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public class FFItem extends Item {

	
	protected FFItem(String unlocName)
	{
		super();
		setUnlocalizedName("fluxedforces." + unlocName);
	}
	
	public void setTexture(String texName)
	{
		if(FFUtil.isValString(texName))
			super.setTextureName("fluxedforces:" + texName);
	}
	
	
}
