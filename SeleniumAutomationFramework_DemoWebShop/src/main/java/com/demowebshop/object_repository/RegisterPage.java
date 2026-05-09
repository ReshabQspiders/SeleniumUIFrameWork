package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.generic_utility.JavaUtility;

public class RegisterPage {
	public WebDriver driver;
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;
	@FindBy(id = "gender-female")
	private WebElement  femaleRadioButton;
	@FindBy(id = "FirstName")
	private WebElement firstNameTextField;
	@FindBy(id="LastName")
	private WebElement lastNameTextField;
	@FindBy(id = "Email")
	private WebElement emailTextField;
	@FindBy(id="Password")
	private WebElement passwordTextField;
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPasswordTextField;
	@FindBy(id = "register-button")
	private WebElement registerButton;
	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}
	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}
	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}
	public WebElement getRegisterButton() {
		return registerButton;
	}
	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}
	//business logic
	public void registerNewUser(Boolean isMale,String firstName,String lastName,String emailPart1,int randomNumber,String emailPart2,String password) {
		if (isMale) {
			maleRadioButton.click();
		}else {
			femaleRadioButton.click();
		}
		firstNameTextField.sendKeys(firstName);
		lastNameTextField.sendKeys(lastName);
		emailTextField.sendKeys(emailPart1+randomNumber+emailPart2);
		passwordTextField.sendKeys(password);
		confirmPasswordTextField.sendKeys(password);
		registerButton.click();
	}

}
