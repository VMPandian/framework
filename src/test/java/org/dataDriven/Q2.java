package org.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q2 {
	public static void main(String[] args) throws IOException {
//		QUESTION 2
//		----------
//		NOTE: Print all the data present  in excel sheet.
		File f=new File("C:\\eclipse\\work space\\Tasks\\Excel Files\\Excel1.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fin);
		Sheet sh = wb.getSheet("Q1");
		int noOfRows = sh.getPhysicalNumberOfRows();
		for (int i = 0; i < noOfRows; i++) {
			Row r = sh.getRow(i);
			int cells = r.getPhysicalNumberOfCells();
			System.out.print("\n");
			for (int j = 0; j < cells; j++) {
				Cell cell = r.getCell(j);
				int type = cell.getCellType();
				if(type==1) {
				String value = cell.getStringCellValue();
				System.out.println(value);
				}
				else {
					double value = cell.getNumericCellValue();
					System.out.println(value);
				}
			}
				
			}
		
	}

}
