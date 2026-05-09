package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountCustomerInfoPage {
	
public WebDriver driver;
	
	public MyAccountCustomerInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1")
	private WebElement pageHeader;

	public WebElement getPageHeader() {
		return pageHeader;
	}
	
}
