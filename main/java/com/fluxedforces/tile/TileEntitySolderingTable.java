package com.fluxedforces.tile;

import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyHandler;
import cpw.mods.fml.common.Optional.Method;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEntitySolderingTable extends TileEntity implements IEnergyHandler{
	
	private EnergyStorage storage;
	
	
	public TileEntitySolderingTable(){
		storage  = new EnergyStorage (100000);
		
	}

	@Method(modid = "CoFHCore")
	@Override
	public boolean canConnectEnergy(ForgeDirection from) {
		return true;
	}

	@Method(modid = "CoFHCore")
	@Override
	public int receiveEnergy(ForgeDirection from, int maxReceive,
			boolean simulate) {
		return 0;
	}

	@Method(modid = "CoFHCore")
	@Override
	public int extractEnergy(ForgeDirection from, int maxExtract,
			boolean simulate) {
		return storage.extractEnergy(storage.getMaxExtract(), simulate);
	}

	@Method(modid = "CoFHCore")
	@Override
	public int getEnergyStored(ForgeDirection from) {
		return storage.getEnergyStored();
	}

	@Method(modid = "CoFHCore")
	@Override
	public int getMaxEnergyStored(ForgeDirection from) {
		return storage.getMaxEnergyStored();
	}
	
	
	

}
