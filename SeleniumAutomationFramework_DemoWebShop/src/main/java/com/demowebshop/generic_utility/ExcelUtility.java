package com.demowebshop.generic_utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String fetchStringDataFromCellOfExeclFile(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/DWS_TestData/registerTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		wb.close();
		return value;	
	}
	
	public Object[][] getExcelData() throws EncryptedDocumentException, IOException{
		FileInputStream fis=new FileInputStream("./src/test/resources/DWS_TestData/registerTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("registerNewUser");
		int rows = sheet.getLastRowNum();
		int column = sheet.getRow(0).getLastCellNum();
		
		Object[][] data=new Object[rows][column];
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<column;j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		wb.close();
		fis.close();
		return data;
	}

}
