package com.demowebshop.generic_utility;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.demowebshop.object_repository.HomePage;

public class BaseClass {
	public  JavaUtility ju;
	public  WebDriver driver;
	public  FileUtility fu;
	public  ExcelUtility eu;
	public  String url; 
	public  String email;
	public  String password;
	public  String browser;
	public  WebDriverUtility wdu;
	public HomePage hp;
	@BeforeSuite
	public void configBeforeSuite() {
		System.out.println("--Triggring suite execution and connecting to the Database--");
	}
	@BeforeTest
	public void configBeforeTest() {
		System.out.println("--Triggring test execution and configuring the environment settings--");
	}
	@BeforeClass
	public void configBeforeClass() throws IOException {
		fu=new FileUtility();
		eu=new ExcelUtility();
		wdu=new WebDriverUtility();	
		ju=new JavaUtility();
		url = fu.fetchDataFromKeyOfPropertyFile("URL");
		browser=fu.fetchDataFromKeyOfPropertyFile("Browser");
		email = fu.fetchDataFromKeyOfPropertyFile("Email");
		password = fu.fetchDataFromKeyOfPropertyFile("Password");
	}
	@BeforeMethod
	public void configBeforeMethod() {
		if (browser.contains("chrome")) {
			driver=new ChromeDriver();
		}else if (browser.contains("firefox")) {
			driver=new FirefoxDriver();
		}else if (browser.contains("edge")) {
			driver=new EdgeDriver();
		}
		hp=new HomePage(driver);
		wdu.maximizeBrowserWindow(driver);
		wdu.addGlobalWaitForTheWebPage(driver, 15);
		wdu.openWebPage(driver, url);	

	}
	@AfterMethod
	public void configAfterMethod() {
		wdu.quitBrowser(driver);
	}
	@AfterClass
	public void configAfterClass() {
		System.out.println("--Class execution terminated--");

	}
	@AfterTest
	public void configAfterTest() {
		System.out.println("--Test execution terminated--");
	}
	@AfterSuite
	public void configAfterSuite() {
		System.out.println("--Suite execution terminated and disconnecting from database--");
	}
	

}
