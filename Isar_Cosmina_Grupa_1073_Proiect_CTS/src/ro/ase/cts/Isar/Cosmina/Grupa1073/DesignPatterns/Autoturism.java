package ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns;

public class Autoturism extends InterfataVehicul implements IAutoturism{
	
	private String tipClimatizare;
	
	private final String infoLansariAuto;
	
	ComputerDeBord computerDeBord;
	ESP esp;
	FaruriCuXenon faruriCuXenon;
	SenzoriDeParcare senzoriDeParcare;
	
	public Autoturism() {
		super("marca", "model");
		this.tipClimatizare = null;
		this.infoLansariAuto = null;
		computerDeBord = new ComputerDeBord();
		esp = new ESP();
		faruriCuXenon = new FaruriCuXenon();
		senzoriDeParcare = new SenzoriDeParcare();
	}

	public Autoturism(String marca, String model) {
		super(marca, model);
		this.infoLansariAuto = null;
	}
	
	public Autoturism(String info) {
		super("marca", "model");
		this.infoLansariAuto = info;
	}

	@Override
	public String afiseazaTipVehicul() {
		return "Vehicul de tip AUTOTURISM";
	}

	@Override
	public void afiseazaInformatiiVehicul() {
		System.out.println("Informatii principale Autoturism: " + this.afiseazaInfoConstructor());
	}

	@Override
	public void tipClimatizare(String tipClimatizare) {
		this.tipClimatizare = tipClimatizare;
	}

	@Override
	public void afisareTipClimatizare() {
		System.out.println("Tip Climatizare Autoturism: " + this.tipClimatizare);
	}
	
	public void automatizariAutoturismStandard() {
		this.computerDeBord.adaugaComputerDeBord();
		this.esp.adaugaESP();
		this.faruriCuXenon.eliminaFaruriCuXenon();
		this.senzoriDeParcare.eliminaSenzoriDeParcare();
	}
	
	public void automatizariAutoturismPremium() {
		this.computerDeBord.adaugaComputerDeBord();
		this.esp.adaugaESP();
		this.faruriCuXenon.adaugaFaruriCuXenon();
		this.senzoriDeParcare.adaugaSenzoriDeParcare();
	}
	
	public String afiseazaInfoLansariAuto() {
		return this.infoLansariAuto;
	}
	
}