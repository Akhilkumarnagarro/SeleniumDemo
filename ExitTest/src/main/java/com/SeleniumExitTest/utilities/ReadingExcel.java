package com.SeleniumExitTest.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.*;

public class ReadingExcel {
	public static void main(String[] args) throws IOException {

		// here I'm creating FilePath or getting location of the file
		String excelFilePath = ".\\dataFiles\\ApachePoiDemo.xlsx";

		/*
		 * here we connected the stream to that file to whom we have created the
		 * filepath so that we can open file in reading mode
		 */
		FileInputStream inputstream = new FileInputStream(excelFilePath);

		// now i'm creating workbook object

		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);

		// Here I'm getting sheet from that workbook

		XSSFSheet sheet = workbook.getSheetAt(0);

		// we are reading data from sheet with the help of forLoop

		/*
		 * int rows = sheet.getLastRowNum();//fetching no. of rows here int cols =
		 * sheet.getRow(1).getLastCellNum();//finding out no.of cells in particular row
		 * 
		 * //Accordingly now we have to write two diffirent statement which will read
		 * the data from excel
		 * 
		 * for(int r=0;r<=rows;r++) {
		 * 
		 * 
		 * XSSFRow row = sheet.getRow(r);
		 * 
		 * for(int c=0;c<cols;c++ ) { //this inner loop representing the cells in
		 * excelsheet
		 * 
		 * XSSFCell cell = row.getCell(c);//return the paticular shell from the row or a
		 * cellobject
		 * 
		 * 
		 * 
		 * switch (cell.getCellType()) { case
		 * STRING:System.out.println(cell.getStringCellValue()); break; case
		 * NUMERIC:System.out.println(cell.getNUMERICCellValue()); break; case
		 * BOOLEAN:System.out.println(cell.getBooleanCellValue()); break;
		 * 
		 * default: break; } cell.getCellType();//returns the TYPE of the cell }
		 */
		Iterator iterator = sheet.iterator(); // it is going to return the iterator object

		while (iterator.hasNext())// verifying that iterator is having another record or not
		{
			XSSFRow row = (XSSFRow) iterator.next();// returns firstrow and storing in a variable of XSSFRow clas object

			Iterator cellIterator = row.cellIterator();// adding the row to iterator

			while (cellIterator.hasNext()) // checking cellIterator is present or not
			{
				XSSFCell cell = (XSSFCell) cellIterator.next();// getting cell

				switch (cell.getCellType()) { // checking cellobject type
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.println(cell.getBooleanCellValue());
				}
				System.out.print("  |  ");
			}
			System.out.println();

		}

	}
}
