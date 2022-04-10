package org.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q3 {
//	QUESTION 3
//	----------
//	NOTE: Insert one new row in the excel sheet. 
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\eclipse\\work space\\Tasks\\Excel Files\\Excel1.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fin);
		Sheet sh = wb.getSheet("Q1");
		int noOfRows = sh.getPhysicalNumberOfRows();
		Row r1 = sh.createRow(noOfRows);
		Cell cell = r1.createCell(0);
		cell.setCellValue("new");
		FileOutputStream fout=new FileOutputStream(f);
		wb.write(fout);
	}

	
}
