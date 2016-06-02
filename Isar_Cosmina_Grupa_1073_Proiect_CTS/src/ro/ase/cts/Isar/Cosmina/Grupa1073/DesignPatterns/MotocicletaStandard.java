package ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns;

public class MotocicletaStandard extends InterfataMotocicleta{

	public MotocicletaStandard(String marca, String model) {
		super(marca, model);
	}

	@Override
	public String afiseazaImbunatatiriMotocicleta() {
		return "Motocicleta cu catalizator";
	}

}
