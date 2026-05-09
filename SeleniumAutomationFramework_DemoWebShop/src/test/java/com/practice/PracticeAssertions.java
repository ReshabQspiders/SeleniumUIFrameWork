package com.practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeAssertions {
	@Test
	public void add() {
		int a=10;
		int b=5;
		int sum=a-b;
		if (sum==15) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}
	@Test
	public void addAssetionEquals() {
		int a=10;
		int b=5;
		int sum=a-b;
		Assert.assertEquals(sum, a+b);	
		Reporter.log("Pass",true);
	}
	@Test
	public void addAssetionBoolean() {
		boolean expectedCondition=false;
		Assert.assertTrue(expectedCondition);
		Reporter.log("Pass",true);
	}
	
	

}
