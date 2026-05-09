package com.demowebshop.login;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.demowebshop.generic_utility.BaseClass;
import com.demowebshop.object_repository.HomePage;
import com.demowebshop.object_repository.LoginPage;
import com.demowebshop.object_repository.MyAccountCustomerInfoPage;
import com.demowebshop.object_repository.PasswordRecoveryPage;

@Listeners(com.demowebshop.generic_utility.ListnersImplementation.class)
public class LoginTest extends BaseClass {
	
	@Test(groups = {"Regression","Smoke"})
	public void loginAsValidUserTest() throws IOException{
		LoginPage lp= new LoginPage(driver);
		wdu.openWebPage(driver, url);	
		MyAccountCustomerInfoPage acp=new MyAccountCustomerInfoPage(driver);
		hp.clickOnLoginLink();
		lp.loginAsValidUser(email, password);
		hp.clickOnMyAccountLink();
		WebElement pageName = acp.getPageHeader();
		Assert.assertTrue(pageName.isDisplayed(),"Naviagte to 'My Account' Page is Passed");
		hp.clickOnLogoutLink();
		String actualTitle = wdu.fetchTitleOfCurrentWebpage(driver);
		Assert.assertEquals(actualTitle,fu.fetchDataFromKeyOfPropertyFile("ExpectedTitle"));
	}	
	@Test(groups = "System")
	public void forgotPassword() {
		LoginPage lp=new LoginPage(driver);
		PasswordRecoveryPage prp=new PasswordRecoveryPage(driver);
		hp.clickOnLoginLink();
		lp.clickForgotPassword();
		prp.recoverPassword(email);
		String expectedMessage="Email with instructions has been sent to you.";
		Assert.assertEquals(expectedMessage, prp.fetchRecoveryMessage());
	}

}
