package ro.ase.cts.Isar.Cosmina.Grupa1073.JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns.Vehicul;

public class TestCaseAdaugareCapacitateCilindrica {

	Vehicul vehicul;

	@Test
	public void testAdaugareCapacitateCilindricaNormala() {
		int capacitateCilindrica = 8000;
		
		vehicul = new Vehicul.VehiculBuilder("Audi", "A8")
				.adaugaCapacitateCilindrica(capacitateCilindrica)
				.build();
		
		assertEquals("Verificare valoare pret", capacitateCilindrica, vehicul.getCapacitateCilindrica());
	}
	
	@Test
	public void testValoareCapacitateCilindricaZero() {
		int capacitateCilindrica = 0;
		
		try{
			vehicul = new Vehicul.VehiculBuilder("Audi", "A8")
					.adaugaCapacitateCilindrica(capacitateCilindrica)
					.build();
			fail("Lipsa exceptie pe capacitateCilindrica = 0");
		}
		catch (Exception e) {
		}
	}
	
	@Test
	public void testValoareCapaciateCilindricaMinimAcceptata() {
		int capMin = 1000;
		int capacitateCilindrica = 100;
		
		try{
			vehicul = new Vehicul.VehiculBuilder("Audi", "A8")
					.adaugaCapacitateCilindrica(capacitateCilindrica)
					.build();
			assertTrue(capMin >= vehicul.getCapacitateCilindrica());
			fail("Lipsa exceptie pe valoarea minima a capacitatii cilindrice care este: " + capMin);
		}
		catch (Exception e) {
		}
	}
	
	@Test
	public void testValoareCapacitateCilindricaMaximAcceptata() {
		int capMax = 9000;
		int capacitateCilindrica = 90000;
		
		try{
			vehicul = new Vehicul.VehiculBuilder("Audi", "A8")
					.adaugaCapacitateCilindrica(capacitateCilindrica)
					.build();
			assertTrue(capMax <= vehicul.getCapacitateCilindrica());
			fail("Lipsa exceptie pe valoarea maxima a capacitatii cilindrice care este: " + capMax);
		}
		catch (Exception e) {
		}
	}

}
