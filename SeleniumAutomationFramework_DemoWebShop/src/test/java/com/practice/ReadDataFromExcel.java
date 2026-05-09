package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Object of file class
		File file =new File("C:\\Users\\qspiders wakad\\Desktop\\ReadingDataFromexcel (2).xlsx");
		//Object file input stream
		FileInputStream fis=new FileInputStream(file);
		//Virtually opening the excel workbook
		Workbook wb = WorkbookFactory.create(fis);
		//Navigating into the sheet level
		Sheet sh = wb.getSheet("Sheet1");
		//Navigate into row level
		Row rh = sh.getRow(1);
		//Navigate into the cell level
		Cell cell = rh.getCell(1);
		//Converting the cell data to string type
		String name1 = cell.getStringCellValue();
		 String contact1 = rh.getCell(2).toString();
		//Printing the data
		System.out.println("The first name is: "+name1);
		System.out.println("His contact is: "+contact1);
		
		//Reading data from Row 3
		Row rh2 = sh.getRow(2);
		System.out.println(rh2.getCell(1).getStringCellValue());
		System.out.println(rh2.getCell(2).getStringCellValue());
		
		//Reading data from row 4
		Row rh3 = sh.getRow(3);
		System.out.println(rh3.getCell(1).getStringCellValue());
		System.out.println(rh3.getCell(2).getStringCellValue());

		//Closing the workbook
		wb.close();

	}

}
