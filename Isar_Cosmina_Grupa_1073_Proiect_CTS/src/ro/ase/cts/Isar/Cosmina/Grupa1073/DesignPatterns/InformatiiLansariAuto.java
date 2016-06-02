package ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns;

import java.util.List;
import java.util.ArrayList;

public class InformatiiLansariAuto {
	
	private List<Autoturism> informatiiSalvate = new ArrayList<Autoturism>();
	
	public void salveazaInformatiile(Autoturism info) {
		this.informatiiSalvate.add(info);
	}
	
	public Autoturism recupereazaUltimaSalvare() {
		if(informatiiSalvate.size() != 0) {
			Autoturism info = informatiiSalvate.get(informatiiSalvate.size() - 1);
			informatiiSalvate.remove(informatiiSalvate.size() - 1);
			return info;
		} else
			return new Autoturism("");
	}

}
