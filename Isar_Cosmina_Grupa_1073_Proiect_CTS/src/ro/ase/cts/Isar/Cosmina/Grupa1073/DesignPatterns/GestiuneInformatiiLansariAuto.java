package ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns;

public class GestiuneInformatiiLansariAuto {
	
	private StringBuilder continut;
	private String numeLansare;
	
	public GestiuneInformatiiLansariAuto(String numeLansare) {
		this.continut = new StringBuilder();
		this.numeLansare = numeLansare;
	}
	
	public void adaugaInfo(String info) {
		continut.append(info);
	}
	
	public Autoturism salveazaInfo() {
		return new Autoturism(this.continut.toString());
	}
	
	public void ctrl_z(Autoturism info) {
		this.continut = new StringBuilder();
		this.continut.append(info.afiseazaInfoLansariAuto());
	}
	
	public String afiseazaInfo() {
		return this.continut.toString();
	}

}
