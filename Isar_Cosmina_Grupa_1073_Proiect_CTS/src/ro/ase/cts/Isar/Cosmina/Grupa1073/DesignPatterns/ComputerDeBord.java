package ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns;

public class ComputerDeBord {
	
	protected boolean areComputerDeBord = true;
	
	public void adaugaComputerDeBord() {
		this.areComputerDeBord = true;
	}
	
	public void eliminaComputerDeBord() {
		this.areComputerDeBord = false;
	}

}
