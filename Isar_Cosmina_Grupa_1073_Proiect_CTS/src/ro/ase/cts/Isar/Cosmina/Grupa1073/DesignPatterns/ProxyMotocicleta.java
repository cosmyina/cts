package ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns;

public class ProxyMotocicleta implements IMotocicleta{
	
	private Motocicleta moto = null;
	private String numeMoto;
	
	public ProxyMotocicleta(final String numeMoto) {
		this.numeMoto = numeMoto;
	}

	@Override
	public void afisareMotocicletaConcurs() {
		if(moto == null) {
			moto = new Motocicleta(numeMoto);
		}
		moto.afisareMotocicletaConcurs();
	}

}
