package com.demowebshop.generic_utility;

import java.io.File;
import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnersImplementation extends BaseClass implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test case execution started",true);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test case execution passed",true);
	}
	@Override
	public void onTestFailure(ITestResult result){
		Reporter.log("Test case execution Failed",true);
		ScreenshotUtility su=new ScreenshotUtility();
		try {
			su.takeScreenShotOfPage(driver);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test case execution skipped",true);

	}
	@Override
	public void onStart(ITestContext context) {
		
	}
	@Override
	public void onFinish(ITestContext context) {
		
	}
}
