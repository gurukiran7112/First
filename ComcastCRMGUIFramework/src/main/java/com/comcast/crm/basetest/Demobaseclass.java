package com.comcast.crm.basetest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Demobaseclass {
	@BeforeSuite
	public void demo() {
		System.out.println("@@BeforeSuite");
	}
	@BeforeClass
	public void demo1() {
		System.out.println("@BeforeClass");
	}
	@BeforeMethod
	public void demo2() {
		System.out.println("@@BeforeMethod");
	}
	@AfterMethod
	public void demo3() {
		System.out.println("@@@AfterMethod");
	}
	@AfterClass
	public void demo4() {
		System.out.println("@@@AfterClass");
	}
	@AfterSuite
	public void demo5() {
		System.out.println("@@@AfterSuite");
	}
}
