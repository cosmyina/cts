package ro.ase.cts.Isar.Cosmina.Grupa1073.JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns.Vehicul;

public class TestCaseAdaugarePret {

	Vehicul vehicul;

	@Test
	public void testAdaugarePretNormal() {
		float pret = 20000;
		
		vehicul = new Vehicul.VehiculBuilder("Audi", "A8")
				.adaugaPret(pret)
				.build();
		
		assertEquals("Verificare valoare pret", pret, vehicul.getPret(), 0.0f);
	}
	
	@Test
	public void testValoarePretZero() {
		float pret = 0;
		
		try{
			vehicul = new Vehicul.VehiculBuilder("Audi", "A8")
					.adaugaPret(pret)
					.build();
			fail("Lipsa exceptie pe pret = 0");
		}
		catch (Exception e) {
		}
	}
	
	@Test
	public void testValoarePretMinimAcceptat() {
		float pretMin = 10000;
		float pret = 20;
		
		try{
			vehicul = new Vehicul.VehiculBuilder("Audi", "A8")
					.adaugaPret(pret)
					.build();
			assertTrue(pretMin >= vehicul.getPret());
			fail("Lipsa exceptie pe valoarea minima a pretului care este: " + pretMin);
		}
		catch (Exception e) {
		}
	}
	
	@Test
	public void testValoarePretMaximAcceptat() {
		float pretMax = 15000000;
		float pret = 20000000;
		
		try{
			vehicul = new Vehicul.VehiculBuilder("Audi", "A8")
					.adaugaPret(pret)
					.build();
			assertTrue(pretMax <= vehicul.getPret());
			fail("Lipsa exceptie pe valoarea maxima a pretului care este: " + pretMax);
		}
		catch (Exception e) {
		}
	}

}
