package ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns;

import java.util.ArrayList;

import ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns.Vehicul.VehiculBuilder;

public class Test {

	public static void main(String[] args) {
		
		//-----TEST BUILDER-----
		System.out.println("----------TEST BUILDER----------");
		
		Vehicul vehicul = new Vehicul.VehiculBuilder("Ford", "Focus")
				.adaugaPret(20000) // EURO
				.adaugaPutere(200) // CP/kW
				.adaugaCapacitateCilindrica(1500) // cm^3
				.adaugaTipCombustibil("benzina")
				.adaugaCuloare("albastru")
				.build();
		
		System.out.println("Marca: " + vehicul.getMarca() + ", Model: " + vehicul.getModel());
		System.out.println("Pret: " + vehicul.getPret() + " Euro.");
		System.out.println("Culoare: " + vehicul.getCuloare());
		
		System.out.println("----------------------------------------");
		
		
		//-----TEST SIMPLE FACTORY-----
		System.out.println("----------TEST SIMPLE FACORY----------");
		
		VehiculFactory factory = new VehiculFactory();
		
		InterfataVehicul v1 = (InterfataVehicul) factory.creareVehicul(TipVehicul.AUTOTURISM, "Lamborghini", "Centenario")
				.adaugaPret(1750000)
				.adaugaPutere(770);
		System.out.println("v1: " + v1.afiseazaTipVehicul());
		v1.afiseazaInformatiiVehicul();
		System.out.println("Pret: " + v1.build().getPret() + " Euro.");
		System.out.println("Putere: " + v1.build().getPutere() + " CP.");
		
		System.out.println("----------------------------------------");

		InterfataVehicul v2 = (InterfataVehicul) factory.creareVehicul(TipVehicul.MOTOCICLETA, "Yamaha", "YZF R1")
				.adaugaCuloare("albastru");
		System.out.println("v2: " + v2.afiseazaTipVehicul());
		v2.afiseazaInformatiiVehicul();
		System.out.println("Culoare: " + v2.build().getCuloare());

		System.out.println("----------------------------------------");

		
		//-----TEST ADAPTER-----
		System.out.println("----------TEST ADAPTER (Obiecte)----------");
		
		Autocamion autocamion = new Autocamion();
		autocamion.tipInstalatieAC("clima manuala");
		//autocamion.afisareTipAC();
		
		Autoturism autoturism = new Autoturism();
		autoturism.tipClimatizare("climatronic");
		//autoturism.afisareTipClimatizare();
		
		ArrayList<IAutoturism> listaTipAutoturism = new ArrayList<>();
		listaTipAutoturism.add(autoturism);
		listaTipAutoturism.add(new Adaptor(autocamion));
		for(IAutoturism elem : listaTipAutoturism)
			elem.afisareTipClimatizare();
		
		System.out.println("----------------------------------------");

		
		//-----TEST FACADE-----
		System.out.println("----------FACADE----------");
		
		Autoturism auto = new Autoturism();
		
		auto.automatizariAutoturismStandard();
		System.out.println(auto.faruriCuXenon.areFaruriCuXenon);
		
		auto.automatizariAutoturismPremium();
		System.out.println(auto.faruriCuXenon.areFaruriCuXenon);
		
		System.out.println("----------------------------------------");

		
		//-----TEST DECORATOR-----
		System.out.println("----------DECORATOR----------");
		
		MotocicletaStandard moto = new MotocicletaStandard("Honda", "CBR 500R");
		MotocicletaCuContainer motoCuContainer = new MotocicletaCuContainer(moto);
		MotocicletaCuDemaratorElectric motoCuDemaratorElectric = new MotocicletaCuDemaratorElectric(moto);
		
		System.out.println(moto.afiseazaImbunatatiriMotocicleta());
		System.out.println(motoCuContainer.afiseazaImbunatatiriMotocicleta());
		System.out.println(motoCuDemaratorElectric.afiseazaImbunatatiriMotocicleta());

		System.out.println("----------------------------------------");

		
		//-----TEST PROXY-----
		System.out.println("----------PROXY----------");
		
		final IMotocicleta moto1 = new ProxyMotocicleta("Zburatoarea");
		final IMotocicleta moto2 = new ProxyMotocicleta("Neinfricata");
		
		moto1.afisareMotocicletaConcurs();
		moto1.afisareMotocicletaConcurs();
		moto2.afisareMotocicletaConcurs();
		moto1.afisareMotocicletaConcurs();
		
		System.out.println("----------------------------------------");

		
		//-----TEST STATE-----
		System.out.println("----------STATE----------");
		
		Autocamion camion = new Autocamion();
		camion.afisareStareInfo("Nerulat.");
		camion.setareStare(StareAutocamion.UTILIZAT);
		camion.afisareStareInfo("Prezinta mici zgarieturi pe plafon.");
		
		System.out.println("----------------------------------------");

		
		//-----TEST MEMENTO-----
		System.out.println("----------MEMENTO----------");
		
		InformatiiLansariAuto infoLansari = new InformatiiLansariAuto();
		GestiuneInformatiiLansariAuto info = new GestiuneInformatiiLansariAuto("Un secol de la infiintarea BMW");
		
		info.adaugaInfo("BMW celebreaza un secol de la infiintare cu un concept de senzatie, BMW Vison Next 100. \n");
		info.adaugaInfo("Acesta este un automobil autonom menit sa ilustreze viitorul intregii industrii auto. \n");
		infoLansari.salveazaInformatiile(info.salveazaInfo());
		System.out.println(info.afiseazaInfo());
		
		info.adaugaInfo("O parte din componente au fost create din reziduurile specifice procedului de productie al fibrei de carbon. \n");
		infoLansari.salveazaInformatiile(info.salveazaInfo());
		System.out.println(info.afiseazaInfo());

		info.ctrl_z(infoLansari.recupereazaUltimaSalvare());
		info.ctrl_z(infoLansari.recupereazaUltimaSalvare());

		System.out.println(info.afiseazaInfo());
		
	}

}
