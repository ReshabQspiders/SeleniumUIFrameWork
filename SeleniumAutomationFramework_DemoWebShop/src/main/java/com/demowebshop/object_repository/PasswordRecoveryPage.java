package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordRecoveryPage {
	public WebDriver driver;
	public PasswordRecoveryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "Email")
	private WebElement yourEmailAddressTextField;
	@FindBy(name = "send-email")
	private WebElement recoveryButton;
	@FindBy(css = "[class='result']")
	private WebElement recoveryMessage;
	//Getters
	public WebElement getYourEmailAddressTextField() {
		return yourEmailAddressTextField;
	}
	public WebElement getRecoveryButton() {
		return recoveryButton;
	}
	public WebElement getRecoveryMessage() {
		return recoveryMessage;
	}
	//Business logic
	public void recoverPassword(String validEmail) {
		yourEmailAddressTextField.sendKeys(validEmail);
		recoveryButton.click();
	}
	public String fetchRecoveryMessage() {
		return recoveryMessage.getText();
	}

}
