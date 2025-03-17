package com.dollibar.ExcelUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_utility {

	
	public String getDataFromExcel(String sheetname,int rownum ,int cell) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./src/main/resources/propertyFile/dollibar.erp.excel.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(rownum).getCell(cell).toString();
		
		wb.close();
		return data;
	}
	public int getRowcount(String sheetname) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./src/main/resources/propertyFile/dollibar.erp.excel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheet(sheetname).getLastRowNum();
		wb.close();
		return rowcount;
	}
	
	public void setDataIntoExcel(String sheetname,int rownum,int cellnum,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/main/resources/propertyFile/dollibar.erp.excel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(rownum).createCell(cellnum);
		
		FileOutputStream fos=new FileOutputStream("./src/main/resources/propertyFile/dollibar.erp.excel.xlsx");
		wb.write(fos);
		wb.close();
		
	}
//	public String getDataFromExcel(String sheetname) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}
