package ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns;

public class Motocicleta extends InterfataVehicul implements IMotocicleta{
	
	private String numeMoto = null;
	
	public Motocicleta(final String numeMoto) {
		super(null, null);
		this.numeMoto = numeMoto;
		incarcaMotoConcurs();
	}

	public Motocicleta(String marca, String model) {
		super(marca, model);
	}

	@Override
	public String afiseazaTipVehicul() {
		return "Vehicul de tip MOTOCICLETA";
	}

	@Override
	public void afiseazaInformatiiVehicul() {
		System.out.println("Informatii principale Motocicleta: " + this.afiseazaInfoConstructor());
	}

	@Override
	public void afisareMotocicletaConcurs() {
		System.out.println("Intra in concurs motocicleta cu numele: " + numeMoto);;
	}
	
	public void incarcaMotoConcurs() {
		System.out.println("Numele Motocicletei se afiseaza ...");
	}

}
