package com.fluxedforces.energy;

public class PowerTransmission {

	/**
	 * 
	 * @param Type The type of generator
	 * @param InitialPower The initial
	 * @param Storage The storage of the generator (?)
	 * @return
	 */
	// This send the amount of energy of a certain type of generation
	public double setEnergy(int Type, double InitialPower, double Storage ){
		
		double Power = 0.0;
		
		if(InitialPower > Storage || InitialPower == Storage)
		{
			Power = 0.0;
		}
		else
		{
			Power +=(100 * getTypeOfGen(Type) );
		}
			
		return Power;
	}
	
	
	/**
	 * 
	 * 
	 * @param Type The type of generator
	 * @return The power ratio
	 */
	//This handle which types of generator output at the ratio they need. Using a simple SWITCH case system
	public double getTypeOfGen(int Type){
		
		double RatioOfPower = 0.0;
		
		// This tell the certain ratio of power for each different type of power. Example
		switch(Type){
		
		case 1: 
		
		
		}
		
		
		
		
		
		
		
		
		return RatioOfPower;
	}
	
}
