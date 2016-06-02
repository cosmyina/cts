package ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns;

public class VehiculFactory {

	public InterfataVehicul creareVehicul(TipVehicul tipVehicul, String marca, String model) {
		
		InterfataVehicul vehicul = null;
		
		switch(tipVehicul) {
		case AUTOTURISM:
			vehicul = new Autoturism(marca, model);
			break;
		case MOTOCICLETA:
			vehicul = new Motocicleta(marca, model);
			break;
		case AUTOCAMION:
			vehicul = new Autocamion(marca, model);
			break;
		}
		
		return vehicul;
		
	}
	
}
