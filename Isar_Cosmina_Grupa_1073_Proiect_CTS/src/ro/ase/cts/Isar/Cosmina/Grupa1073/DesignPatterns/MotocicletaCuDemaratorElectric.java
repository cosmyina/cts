package ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns;

public class MotocicletaCuDemaratorElectric extends DecoratorMotocicleta{

	public MotocicletaCuDemaratorElectric(InterfataMotocicleta moto) {
		super(moto);
	}
	
	@Override
	public String afiseazaImbunatatiriMotocicleta() {
		return super.afiseazaImbunatatiriMotocicleta() + " si demarator electric.";
	}

}
