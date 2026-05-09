package com.practice;


import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PracticeSoftAssert {
	@Test
	public void addAssetionEquals() {
		int a=10;
		int b=5;
		int sum=a+b;
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(sum, a-b);
		Reporter.log("Checking soft assert",true);
		sa.assertAll();
		
	}
	@Test
	public void addAssetionBoolean() {
		boolean expectedCondition=false;
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(expectedCondition);
		Reporter.log("Checking soft assert",true);
		sa.assertAll();
		
	}
	
}
