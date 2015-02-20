/**
 * 
 */
package com.fluxedforces.block;

import com.fluxedforces.help.FFUtil;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public abstract class FFBlock extends Block {

	private String m_unlocName;
	private String m_textureLocation;
	
	/**
	 * @param unlocName The unlocalized name of the {@link Block}
	 * 
	 * @param material The {@link Material} used on this {@link Block}
	 */
	protected FFBlock(String unlocName, Material material) {
		this(unlocName, unlocName, material);
	}
	
	/**
	 * 
	 * @param unlocName The unlocalized name of the {@link Block}
	 * @param textureName The texture name of the {@link Block}
	 * @param material The {@link Material} used on this {@link Block}
	 */
	protected FFBlock(String unlocName, String textureName, Material material)
	{
		super(material);
		
		setUnlocalizedName(unlocName);
		setTextureName(textureName);
	}
	
	/**
	 * 
	 * @param unlocName The unlocalized name of the {@link Block}
	 */
	public void setUnlocalizedName(String unlocName)
	{
		if(FFUtil.isValString(unlocName))
		m_unlocName = unlocName;
	}
	
	/**
	 * @ return The unlocalized name of the {@link Block}
	 */
	public String getUnlocalizedName()
	{
		return m_unlocName;
	}
	
	/**
	 * 
	 * @param texName The texture name of the {@link Block}
	 */
	public void setTextureName(String texName)
	{
		if(FFUtil.isValString(texName))
			super.setBlockTextureName("fluxedforces:" + texName); m_textureLocation = texName;
	}

}
