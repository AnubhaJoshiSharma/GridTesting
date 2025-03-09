package javaAndSeleniumPrograms;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvs {
	@DataProvider(name="SupplyNumbers")
	public Object[][] getNumberData() {
		return new Object[][] {
			{10,20},
			{30,30},
			{5,14}
		};
	}
	
	@Test(dataProvider="SupplyNumbers")
	public void addNums(int x,int y) {
		System.out.println(x+y);
	}

}
