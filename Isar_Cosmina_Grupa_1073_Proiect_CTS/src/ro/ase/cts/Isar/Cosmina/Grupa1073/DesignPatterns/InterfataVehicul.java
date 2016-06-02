package ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns;

import ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns.Vehicul.VehiculBuilder;

public abstract class InterfataVehicul extends VehiculBuilder{
	
	public InterfataVehicul(String marca, String model) {
		super(marca, model);
	}
	
	public abstract String afiseazaTipVehicul();
	public abstract void afiseazaInformatiiVehicul();
	
}
