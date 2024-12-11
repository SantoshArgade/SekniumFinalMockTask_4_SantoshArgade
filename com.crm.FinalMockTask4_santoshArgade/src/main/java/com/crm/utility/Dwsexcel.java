package com.crm.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.crm.Baseclass.Dwsbaseclass;

public class Dwsexcel extends Dwsbaseclass {
	public static String org_name;
	public static String factoryexcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Selenium\\Vtigerlogin.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet2");
		org_name =sheet.getRow(0).getCell(0).toString();
		return org_name;
	}
}
