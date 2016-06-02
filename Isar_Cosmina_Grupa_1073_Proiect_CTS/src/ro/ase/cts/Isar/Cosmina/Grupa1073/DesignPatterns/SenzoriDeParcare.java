package ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns;

public class SenzoriDeParcare {
	
	protected boolean areSenzoriDeParcare = true;
	
	public void adaugaSenzoriDeParcare() {
		this.areSenzoriDeParcare = true;
	}
	
	public void eliminaSenzoriDeParcare() {
		this.areSenzoriDeParcare = false;
	}

}
