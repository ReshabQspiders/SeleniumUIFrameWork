package com.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PracticeAnnotations {
	
	public WebDriver driver;
	public PracticeAnnotations(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Works like AND operator
	@FindBys({@FindBy(id = "pollanswers-1"),@FindBy(xpath =  "//input[@value='1']")})
	private WebElement excellentRadio;
	
	public WebElement getExcellentRadio() {
		return excellentRadio;
	}
	//Autohealing
	//Works like OR operator
	@FindAll({@FindBy(id = "pollanswers"),@FindBy(xpath  = "//input[@value='2']")})
	private WebElement goodRadio;

	public WebElement getGoodRadio() {
		return goodRadio;
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demowebshop.tricentis.com/");
	    PracticeAnnotations pa=new PracticeAnnotations(driver);
	    pa.getExcellentRadio().click();
	    Thread.sleep(2000);
	    pa.getGoodRadio().click();
	    
	}

}
