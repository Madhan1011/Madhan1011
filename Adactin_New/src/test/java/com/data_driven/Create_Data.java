package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Create_Data {
public static void main(String[] args) throws Throwable {
	File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Adactin_New\\Read Data.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fis);
	Sheet createSheet = w.createSheet("data1");
	Row createRow = createSheet.createRow(0);
	Row createRow2 = createSheet.createRow(1);
	Cell createCell = createRow.createCell(0);
	createCell.setCellValue("email");
	Cell createCell2 = createRow2.createCell(0);
	createCell2.setCellValue("user");
	w.getSheet("data1").getRow(0).createCell(1).setCellValue("madhanrsm7@gmail.com");
	w.getSheet("data1").getRow(0).createCell(2).setCellValue("status");
	w.getSheet("data1").getRow(1).createCell(1).setCellValue("Madhan");
	w.getSheet("data1").getRow(1).createCell(2).setCellValue("kumar");
	FileOutputStream fs=new FileOutputStream(f);
	w.write(fs);
	w.close();
	System.out.println("Done");
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
}
