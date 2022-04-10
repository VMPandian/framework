package org.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class trail {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\eclipse\\work space\\Tasks\\Excel Files\\Excel1.xlsx");
		// read existing file
		FileInputStream fin = new FileInputStream(f);
		// read workBook
		Workbook wb = new XSSFWorkbook(fin);
		// get sheet
		Sheet sh = wb.getSheet("facebook");
		int noOfRows = sh.getPhysicalNumberOfRows();
		for (int i = 0; i < noOfRows; i++) {
			// get row
			Row r = sh.getRow(i);
			int noOfCellsInARow = r.getPhysicalNumberOfCells();
			String data="";
			for (int j = 0; j <noOfCellsInARow; j++) {
				// get cell
				Cell c = r.getCell(j);
				// to fetch type of cell value
				int type = c.getCellType();
				// check the value is string type or not
				if (type == 1) {
					// get value of string type
					data = c.getStringCellValue();
					// check the value is date format or not
				} else if (DateUtil.isCellDateFormatted(c)) {
					// get value of date type
					Date da = c.getDateCellValue();
					// make new simple date format
					SimpleDateFormat sim = new SimpleDateFormat("dd/mm/yyyy");
					// convert date format to simple format
					data = String.valueOf(sim.format(da));
				} else {
					// get numeric value of cell
					double d = c.getNumericCellValue();
					long lo = (long) d;
					data = String.valueOf(lo);
				}
				System.out.println(data);
			}
			
		}

	}
}
