package com.creation.Project1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class DDT1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("D:\\SAP_TimeSlot\\SAPDS_TimeSlot.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		for(int i = 1; i<=rowCount; i++) 
		{
			XSSFRow currRow = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) 
			{
				String value = currRow.getCell(j).toString();
				System.out.print("  " +value);
			}
			System.out.println();
		}

	}

}
