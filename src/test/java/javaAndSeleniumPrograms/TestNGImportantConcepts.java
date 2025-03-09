package javaAndSeleniumPrograms;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGImportantConcepts {
	
	@BeforeMethod(alwaysRun=true)
	public void setUp() {
		System.out.println("Before method");
	}
	@Parameters({"myname"})
	@Test(groups= {"roadvehicle","fourwheels"})
	public void method1(String myname) {
		System.out.println("Cars"+myname);
		
	}
	
	@Test(groups= {"roadvehicle","fourwheels"})
public void method2() {
		System.out.println("Buses");
		
	}
	@Test(groups= {"roadvehicle","twowheels"})
public void method3() {
		System.out.println("Bikes");
	}
	@Test(groups= {"watervehicle","nowheels"})
public void method4() {
		System.out.println("Boats");
	}
	@Test
public void method5() {
		System.out.println("Anthing else");
		
	}

}
