package com.practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.demowebshop.generic_utility.DataProvidersHelper;

public class DemoTestScriptToReadDataFromExeclUsingDataProvider {
	
	@Test(dataProvider = "excelData",dataProviderClass = DataProvidersHelper.class)
	public void practiceDataProvider(String s1,String s2,String s3,String s4, String s5) throws EncryptedDocumentException, IOException {
		System.out.println("-----------------------------");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println("-----------------------------");

		




		
	}

}
