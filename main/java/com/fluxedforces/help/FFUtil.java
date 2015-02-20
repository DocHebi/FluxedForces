/**
 * 
 */
package com.fluxedforces.help;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public class FFUtil {

	public static String Translate(String unlocName)
	{
		return StatCollector.translateToLocal(unlocName);
	}
	
	public static boolean isValString(String str)
	{
		return (!str.equals("") && str != null);
	}
	
	public static void dropBlock(ItemStack stack, World world, float x, float y, float z, EntityPlayer player)
	{
		  if (!world.isRemote && world.getGameRules().getGameRuleBooleanValue("doTileDrops") && !world.restoringBlockSnapshots)
	        {
	           
	            float f = 0.7F;
	            double d0 = (double)(world.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
	            double d1 = (double)(world.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
	            double d2 = (double)(world.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
	            EntityItem entityitem = new EntityItem(world, (double)x + d0, (double)y + d1, (double)z + d2, stack);
	            entityitem.delayBeforeCanPickup = 10;
	            world.spawnEntityInWorld(entityitem);
	        }
	}
	
}
