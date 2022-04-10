package org.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q1 {
//	QUESTION 1
//	-----------
//	NOTE: Find the Total number of Rows and Total number of cells in excel sheet.
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\eclipse\\work space\\Tasks\\Excel Files\\Excel1.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fin);
		Sheet sh = wb.getSheet("Q1");
		int noOfRows = sh.getPhysicalNumberOfRows();
		int noOfCells=0;
		for (int i = 0; i < noOfRows; i++) {
			Row r = sh.getRow(i);
			int noOfCellsInARow = r.getPhysicalNumberOfCells();
			 noOfCells =noOfCells+noOfCellsInARow;
		}
		System.out.println("Total No Of Rows : "+noOfRows);
		System.out.println("Total No Of Cells : "+noOfCells);
		
	}

}
