package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class All_Data {

	public static void main(String[] args) throws Throwable {
		File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Adactin_New\\Read Data.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fi);
		Sheet sheetAt = wb.getSheetAt(0);
		 int row_Size = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < row_Size; i++) {
			Row row = sheetAt.getRow(i);
              int Cell_Size = row.getPhysicalNumberOfCells();		
		for (int j = 0; j < Cell_Size; j++) {
			Cell cell = row.getCell(j);
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		
		}else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int value = (int) numericCellValue;
		System.out.println(value);
		}
		
		}
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
