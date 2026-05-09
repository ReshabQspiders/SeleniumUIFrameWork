package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningTimeouts {
	@Test(timeOut = 5000)
	public void testScript() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
	}
	
}
