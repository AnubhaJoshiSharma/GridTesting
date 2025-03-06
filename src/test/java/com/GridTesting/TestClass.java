package com.GridTesting;

import org.testng.annotations.Test;

import basePackage.BaseClass;

public class TestClass extends BaseClass {
	@Test
	public void simpleTest() {
		System.out.println(getDriver().getCurrentUrl());
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
