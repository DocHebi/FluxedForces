/**
 * 
 */
package com.fluxedforces.robot.module;

import java.util.ArrayList;
import java.util.HashMap;

import com.fluxedforces.help.FFLogger;

/**
 * @author tim4242, kaigan54, TheCrimsonSpark
 *
 */
public class ModuleRegistry {

	private HashMap<String, IRobotModule> m_modules;
	private HashMap<String, IModulePart> m_parts;
	
	public void registerModule(String id, IRobotModule module)
	{
		if(m_modules.containsKey(id))
		{
			FFLogger.LocalLog("error.fluxedforces.registry.module.exists");
			return;
		}
		
		m_modules.put(id, module);
	}
	
	public void registerPart(String id, IModulePart part)
	{
		if(m_parts.containsKey(id))
		{
			FFLogger.LocalLog("error.fluxedforces.registry.part.exists");
			return;
		}
		
		m_parts.put(id, part);
	}
	
	public IRobotModule getModuleFromID(String id)
	{
		if(!m_modules.containsKey(id))
		{
			FFLogger.LocalLog("error.fluxedforces.registry.module.not.exists");
			return null;
		}
		
		return m_modules.get(id);
	}
	
	public IModulePart getPartFromID(String id)
	{
		if(!m_parts.containsKey(id))
		{
			FFLogger.LocalLog("error.fluxedforces.registry.part.not.exists");
			return null;
		}
		
		return m_parts.get(id);
	}
	
	public ArrayList<IRobotModule> getModules()
	{
		String[] keys = (String[]) m_modules.keySet().toArray();
		ArrayList<IRobotModule> res = new ArrayList<IRobotModule>(keys.length);
		
		for(int i = 0; i < keys.length; i++)
			res.add(m_modules.get(keys[i]));
		
		return res;
	}
	
	public ArrayList<IModulePart> getParts()
	{
		String[] keys = (String[]) m_parts.keySet().toArray();
		ArrayList<IModulePart> res = new ArrayList<IModulePart>(keys.length);
		
		for(int i = 0; i < keys.length; i++)
			res.add(m_parts.get(keys[i]));
		
		return res;
	}
	
}
