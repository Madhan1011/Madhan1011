package com.data_driven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data1 {

	public static void main(String[] args) throws Throwable {
		File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Adactin_New\\Read Data.xlsx");
		FileInputStream input=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(input);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(0);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		
		}else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
		System.out.println(numericCellValue);
		
		}
		
		
		
		
		
		
		
		
		
		
		
	}
		
	
	
	
	
	
}
