package ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns;

public class Autocamion extends InterfataVehicul implements IAutocamion{

	private String tipAC;
	
	private IStareAutocamion stareCurenta;

	public Autocamion() {
		super(null, null);
		this.tipAC = null;
		stareCurenta = new AutocamionNou();
	}
	
	public Autocamion(String marca, String model) {
		super(marca, model);
	}

	@Override
	public String afiseazaTipVehicul() {
		return "Vehicul de tip AUTOCAMION";
	}

	@Override
	public void afiseazaInformatiiVehicul() {
		System.out.println("Informatii principale Autocamion: " + this.afiseazaInfoConstructor());
	}

	@Override
	public void tipInstalatieAC(String tipAC) {
		this.tipAC = tipAC;
	}

	@Override
	public void afisareTipAC() {
		System.out.println("Tip instalatie AC Autocamion: " + this.tipAC);
	}
	
	public void setareStare(StareAutocamion stare) {
		if (stare == StareAutocamion.NOU)
			this.stareCurenta = new AutocamionNou();
		else
			if(stare == StareAutocamion.UTILIZAT)
				this.stareCurenta = new AutocamionUtilizat();
	}
	
	public void afisareStareInfo(String text) {
		this.stareCurenta.afiseazaInfoStare(text);
	}

}
