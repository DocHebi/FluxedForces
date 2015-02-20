/**
 * 
 */
package com.fluxedforces.block;

import com.fluxedforces.help.FFUtil;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public class FFBlockOre extends FFBlock {

	private static final ItemStack[] m_drops = new ItemStack[] {};
	private static final int[] m_dropNumbers = new int[] {1};
	private static final String[] m_unlocNames = new String[] {""};
	
	private int m_oreType;
	
	public FFBlockOre(int oreType)
	{
		super("ore/" + m_unlocNames[oreType], m_unlocNames[oreType], Material.rock);
		
		this.m_oreType = oreType;
	}
	
	public void onBlockHarvested(World world, int x, int y, int z, int meta, EntityPlayer player)
	{
		for(int i = 0; i < m_dropNumbers[m_oreType]; i++)
			FFUtil.dropBlock(m_drops[m_oreType], world, x, y, z, player);
	}
	
}
