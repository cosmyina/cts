package ro.ase.cts.Isar.Cosmina.Grupa1073.JUnit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestCaseConstructorVehicul.class,
	TestCaseAdaugarePret.class, 
	TestCaseAdaugareCapacitateCilindrica.class})

public class TestSuiteVehicul {
}
