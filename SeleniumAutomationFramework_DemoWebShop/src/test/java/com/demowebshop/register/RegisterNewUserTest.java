package com.demowebshop.register;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demowebshop.generic_utility.BaseClass;
import com.demowebshop.object_repository.HomePage;
import com.demowebshop.object_repository.RegisterPage;
import com.demowebshop.object_repository.RegisterResultPage;

@Listeners(com.demowebshop.generic_utility.ListnersImplementation.class)
public class RegisterNewUserTest extends BaseClass{
	
	@Test(groups = {"Regression"})
	public void registerUserTest() throws EncryptedDocumentException, IOException{
		String fn = eu.fetchStringDataFromCellOfExeclFile("registerNewUser",5 , 0);
		String ln = eu.fetchStringDataFromCellOfExeclFile("registerNewUser",5 , 1);
		String emailpart1 = eu.fetchStringDataFromCellOfExeclFile("registerNewUser",5 , 2);
		String emailpart2 = eu.fetchStringDataFromCellOfExeclFile("registerNewUser",5 , 3);
		String password = eu.fetchStringDataFromCellOfExeclFile("registerNewUser",5 , 4);
		RegisterPage rp=new RegisterPage(driver);
		hp.clickOnRegisterLink();
		rp.registerNewUser(true,fn, ln, emailpart1,ju.getRandomNum(99999), emailpart2,password);
		RegisterResultPage rrp=new RegisterResultPage(driver);
		Assert.assertTrue(rrp.getSuccessMessage().isDisplayed());
		Reporter.log("Test case status: Pass",true);
	}

}
