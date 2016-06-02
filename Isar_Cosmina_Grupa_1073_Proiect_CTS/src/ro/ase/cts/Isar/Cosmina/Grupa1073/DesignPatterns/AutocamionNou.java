package ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns;

public class AutocamionNou implements IStareAutocamion {

	@Override
	public void afiseazaInfoStare(String text) {
		System.out.println("Autocamion NOU: " + text);
	}

}
