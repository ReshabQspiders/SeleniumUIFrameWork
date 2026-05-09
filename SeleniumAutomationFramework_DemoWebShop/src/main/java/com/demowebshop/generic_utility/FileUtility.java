package com.demowebshop.generic_utility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String fetchDataFromKeyOfPropertyFile(String keyName) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/DWS_CommonData/CommonData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(keyName);

	}

}
