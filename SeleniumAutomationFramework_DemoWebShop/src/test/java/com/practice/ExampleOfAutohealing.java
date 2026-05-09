package com.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExampleOfAutohealing {
	public WebDriver driver;
	static String orangeUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	static String swagUrl="https://www.saucedemo.com/";
	static String orangeUN="Admin";
	static String orangePwd="admin123";
	static String swagUN="standard_user";
	static String swagPwd="secret_sauce";
	
	public ExampleOfAutohealing(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(name="username"),@FindBy(name="user-name")})
	private WebElement username;
	
	@FindAll({@FindBy(name="password"),@FindBy(name="password")})
	private WebElement password;
	
	@FindAll({@FindBy(css="[type='submit']"),@FindBy(id = "login-button")})
	private WebElement loginButton;
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get(swagUrl);
	    ExampleOfAutohealing ea=new ExampleOfAutohealing(driver);
	    ea.getUsername().sendKeys(swagUN);
	    ea.getPassword().sendKeys(swagPwd);
	    ea.getLoginButton().click();
	}
}
