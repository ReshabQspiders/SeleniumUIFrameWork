package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	private WebElement emailTextFiled;

	@FindBy(id = "Password")
	private WebElement passwordTextFiled;
	
	@FindBy(css = "[value='Log in']")
	private WebElement loginButton;
	
	@FindBy(linkText = "Forgot password?")
	private WebElement forgotPasswordLink;
	
	//getters
	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}
	public WebElement getEmailTextFiled() {
		return emailTextFiled;
	}

	public WebElement getPasswordTextFiled() {
		return passwordTextFiled;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	//Bussiness logic
	public void loginAsValidUser(String email,String password) {
		emailTextFiled.sendKeys(email);
		passwordTextFiled.sendKeys(password);
		loginButton.click();
	}
	public void clickForgotPassword() {
		forgotPasswordLink.click();
	}
}
