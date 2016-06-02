package ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns;

public class MotocicletaCuContainer extends DecoratorMotocicleta{

	public MotocicletaCuContainer(InterfataMotocicleta moto) {
		super(moto);
	}

	@Override
	public String afiseazaImbunatatiriMotocicleta() {
		return super.afiseazaImbunatatiriMotocicleta() + " si container.";
	}

	
	
}
