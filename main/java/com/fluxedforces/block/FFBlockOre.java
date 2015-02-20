/**
 * 
 */
package com.fluxedforces.block;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public class FFBlockOre extends FFBlock {

	private static final String[] m_names = new String[] {};
	private static final Item[] m_drops = new Item[] {};
	private static final int[] m_dropNumbers = new int[] {};
	private static final String[] m_unlocNames = new String[] {};
	
	private int m_oreType;
	
	public FFBlockOre(int oreType)
	{
		super(m_unlocNames[oreType], m_unlocNames[oreType], Material.rock);
		
		this.m_oreType = oreType;
	}
	
}
