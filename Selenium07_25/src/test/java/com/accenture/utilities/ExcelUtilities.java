package com.accenture.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.accenture.pages.Registration;

public class ExcelUtilities {

	public void getTestData() throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\pdc4-training.pdc4\\Desktop\\Test Data.xls");
		HSSFWorkbook x = new HSSFWorkbook(fin);
		HSSFSheet s = x.getSheet("Sheet1");
		int rcnt = s.getLastRowNum();
		for(int i=1; i <= rcnt ;i++)
		{
			String FN = s.getRow(i).getCell(0).getStringCellValue();
			String LN = s.getRow(i).getCell(1).getStringCellValue();
			String EM = s.getRow(i).getCell(2).getStringCellValue();
			String PSD = s.getRow(i).getCell(3).getStringCellValue();
			String CPSD = s.getRow(i).getCell(4).getStringCellValue();
			System.out.println(FN +" "+ LN +" "+EM+" "+PSD);
			Registration.regn(FN, LN, EM, PSD, CPSD);
		}
		System.out.println(rcnt);
	}
	public static void main(String args[]) throws IOException {
		ExcelUtilities e = new ExcelUtilities();
		e.getTestData();
	}
}