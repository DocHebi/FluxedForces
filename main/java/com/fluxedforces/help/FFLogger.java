/**
 * 
 */
package com.fluxedforces.help;

import java.util.ArrayList;

import cpw.mods.fml.common.FMLLog;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public class FFLogger {

	public static final Integer INFO = 0;
	public static final Integer WARNING = 1;
	
	public static void Log(String header, ArrayList<String> messages, ArrayList<Integer> importances)
	{
		int max_length = 0;
		String mess;
		Integer impo;
		
		String Header = header;
		
		String Start;
		String End;
		
		int diff;
		
		String spaces = "";
		
		
		
		
		if(messages.size() != importances.size())
		{
			return;
		}
		
		for(int i = 0;i < messages.size(); i++)
		{
			mess = messages.get(i);
			impo = importances.get(i);
			
			if(impo == 0)
			{
				mess = "info: ".concat(mess);
			}
			if(impo == 1)
			{
				mess = "warning: ".concat(mess);
			}
			
			messages.set(i, mess);
		}
		
		
		
		for(String mes : messages)
		{
			if(mes.length() > max_length)
				max_length = mes.length();
		}
		
		End = "+";
		
		for(int i = 0;i<max_length + 2;i++)
		{
			End += "-";
		}
		
		End += "+";
		
		if(Header.length() <= max_length)
		{
		
		for(int i=0;i<((max_length / 2) - (Header.length() / 2));i++)
		{
			spaces += "-";
		}
		
		String space1 = spaces;
		String space2 = spaces;
		
		if(max_length % 2 != 0)
		{
			space1 += "-";
			
		}
		
		if(Header.length() % 2 != 0)
		{
			space2 += "-";
			
		}
		else
		{
			space2 += "--";
		}
			
			
	
		
		
			Start = "+"+space1+Header+space2+"+";
		
		
		}
		else
		{
			Start = "+"+Header+"+";
		}
		FMLLog.info("");
		FMLLog.info(Start);
		
		for(String mes : messages)
		{
			spaces = "";
			
			diff =  max_length - mes.length();
			
			for(int i = 0;i<diff;i++)
			{
				spaces += " ";
			}
			

			
			FMLLog.info("| " + mes + spaces + " |");
		}
		
		FMLLog.info(End);
		FMLLog.info("");
	}
	
	public static void Log(String header, String mes, Integer importance)
	{
		ArrayList<String> m_strings = new ArrayList();
		ArrayList<Integer> m_importantes = new ArrayList();
		
		m_strings.add(mes);
		m_importantes.add(importance);
		
		Log(header, m_strings, m_importantes);
	}
	
	public static void Log(String mes)
	{
		FMLLog.info(mes);
	}
	
	public static void LocalLog(String header, ArrayList<String> messages, ArrayList<Integer> importances)
	{
		for(int i = 0; i < messages.size(); i++)
			messages.set(i, FFUtil.Translate(messages.get(i)));
		
		Log(header, messages, importances);
	}
	
	public static void LocalLog(String header, String mes, Integer importance)
	{
		Log(header, FFUtil.Translate(mes), importance);
	}
	
	public static void LocalLog(String mes)
	{
		Log(FFUtil.Translate(mes));
	}
}
