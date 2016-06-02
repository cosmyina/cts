package ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns;

public class DecoratorMotocicleta extends InterfataMotocicleta{

	protected final InterfataMotocicleta moto;
	
	public DecoratorMotocicleta(InterfataMotocicleta moto) {
		super("marca", "model");
		this.moto = moto;
	}

	@Override
	public String afiseazaImbunatatiriMotocicleta() {
		return this.moto.afiseazaImbunatatiriMotocicleta();
	}

}
