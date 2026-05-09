package com.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SampleBaseTest {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("--Executing Before Suite--");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("--Executing Before Test--");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("--Executing Before Class--");
	}	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("--Executing Before Method--");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("--Executing after method--");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("--Executing after class--");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("--Executing after test--");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("--Executing after suite--");	
	}

}
