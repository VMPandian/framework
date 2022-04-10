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

public class Q4 {
	public static void main(String[] args) throws IOException {
//		QUESTION 4
//		----------
//		URL : https://demoqa.com/registration/
//		NOTE: Create an excel sheet with all required details for registration .
		File f=new File("C:\\eclipse\\work space\\Tasks\\Excel Files\\Excel1.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fin);
		Sheet sh = wb.createSheet("demoQa");
		Row r1 = sh.createRow(0);
		Cell cell = r1.createCell(0);
		cell.setCellValue("new");
		FileOutputStream fout=new FileOutputStream(f);
		wb.write(fout);	
	}
}
