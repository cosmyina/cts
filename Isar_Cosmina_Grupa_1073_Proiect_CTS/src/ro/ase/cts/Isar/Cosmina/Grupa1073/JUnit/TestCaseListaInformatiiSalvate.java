package ro.ase.cts.Isar.Cosmina.Grupa1073.JUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

import org.junit.Test;

import ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns.Autoturism;
import ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns.GestiuneInformatiiLansariAuto;
import ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns.InformatiiLansariAuto;

public class TestCaseListaInformatiiSalvate {

	@Test
	public void testListaInformatiiSalvate() {

		GestiuneInformatiiLansariAuto info = new GestiuneInformatiiLansariAuto("Prima Lansare");
		info.adaugaInfo("Info1");
		info.adaugaInfo("Info2");

		assertEquals("Info1Info2", info.afiseazaInfo());
	}
	
	@Test
	public void testListaInformatiiCtrlZ() {
		InformatiiLansariAuto infoLansari = new InformatiiLansariAuto();
		GestiuneInformatiiLansariAuto info = new GestiuneInformatiiLansariAuto("Prima Lansare");
		
		info.adaugaInfo("Info1");
		info.adaugaInfo("Info2");
		infoLansari.salveazaInformatiile(info.salveazaInfo());
		
		info.adaugaInfo("Info3");
		infoLansari.salveazaInformatiile(info.salveazaInfo());

		info.ctrl_z(infoLansari.recupereazaUltimaSalvare());
		info.ctrl_z(infoLansari.recupereazaUltimaSalvare());
		
		assertEquals("Info1Info2", info.afiseazaInfo());
	}

}
