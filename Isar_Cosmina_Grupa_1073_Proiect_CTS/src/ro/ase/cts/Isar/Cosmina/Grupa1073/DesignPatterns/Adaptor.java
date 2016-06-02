package ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns;

public class Adaptor implements IAutoturism{
	
	IAutocamion autocamion;
	
	public Adaptor(IAutocamion ref) {
		this.autocamion = ref;
	}

	@Override
	public void tipClimatizare(String tipClimatizare) {
		autocamion.tipInstalatieAC(tipClimatizare);
	}

	@Override
	public void afisareTipClimatizare() {
		autocamion.afisareTipAC();
	}
	
}
