package com.demowebshop.generic_utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {
	
	JavaUtility ju=new JavaUtility();
	
	public void takeScreenShotOfPage(WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm=new File("./FailureScreenshot/failed_demowebshop_ss"+ju.getTimeStamp()+".png");
		FileHandler.copy(temp, perm);
	}
	
	public void takeScreenShotOfWebElement(WebElement targetElement) throws IOException {
		File temp = targetElement.getScreenshotAs(OutputType.FILE);
		File perm=new File("./FailureScreenshot/failed_demowebshop_ss"+ju.getTimeStamp()+".png");
		FileHandler.copy(temp, perm);
	}

}
