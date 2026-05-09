package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	
	@FindBy(xpath = "//div[@class='header-links']/..//a[@class='account']")
	private WebElement accountLink;
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;

	//getters
	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getAccountLink() {
		return accountLink;
	}
	
	public WebElement getRegisterLink() {
		return registerLink;
	}

	//Business Logic
	public void clickOnLoginLink() {
		loginLink.click();
	}
	public void clickOnLogoutLink() {
		logoutLink.click();
	}
	public void clickOnMyAccountLink() {
		accountLink.click();
	}
	public void clickOnRegisterLink() {
		registerLink.click();
	}
	
}
