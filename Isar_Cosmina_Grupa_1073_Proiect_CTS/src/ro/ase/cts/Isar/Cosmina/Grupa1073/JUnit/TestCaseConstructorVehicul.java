package ro.ase.cts.Isar.Cosmina.Grupa1073.JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns.Vehicul;
import ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns.Vehicul.VehiculBuilder;

public class TestCaseConstructorVehicul {
	
	Vehicul vehicul;

	@Test
	public void testConstructorValoriNormale() {
		String marca = "Audi";
		String model = "A8";
		
		vehicul = new Vehicul.VehiculBuilder(marca, model)
				.build();
		
		assertEquals("Verificare constructor marca", marca, vehicul.getMarca());
		assertEquals("Verificare constructor model", model, vehicul.getModel());
	}
	
	@Test
	public void testConstructorMarcaNull() {
		String marca = null;
		String model = "A8";
		
		try{
			vehicul = new Vehicul.VehiculBuilder(marca, model)
					.build();
			fail("Lipsa exceptie pe marca = null");
		}
		catch (Exception e) {
		}
	}
	
	@Test
	public void testConstructorModelNull() {
		String marca = "Audi";
		String model = null;
		
		try{
			vehicul = new Vehicul.VehiculBuilder(marca, model)
					.build();
			fail("Lipsa exceptie pe model = null");
		}
		catch (Exception e) {
		}
	}
	
	@Test
	public void testConstructorParametriNulli() {
		String marca = null;
		String model = null;
		
		try{
			vehicul = new Vehicul.VehiculBuilder(marca, model)
					.build();
			fail("Lipsa exceptie pe marca si model = null");
		}
		catch (Exception e) {
		}
	}
	
}
