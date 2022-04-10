package org.baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandlingBase {
	public static String getCellValue(String fileName,String sheetName, int rowNum, int cellNum) throws IOException {
		//file location
		File f=new File("C:\\eclipse\\work space\\Tasks\\Excel Files\\"+fileName+".xlsx");
		//read existing file
		FileInputStream fin=new FileInputStream(f);
		//read workBook
		Workbook wb=new XSSFWorkbook(fin);
		//get sheet
		Sheet sh = wb.getSheet(sheetName);
		//get row
		Row r = sh.getRow(rowNum);
		//create new cell
		Cell c = r.getCell(cellNum);
		//to fetch type of cell value
		int type =c.getCellType();
		//check the value is string type or not
		String data;
		if(type==1) {
			//get value of string type
			data = c.getStringCellValue();
			//check the value is date format or not
		}else if (DateUtil.isCellDateFormatted(c)) {
			//get value of date type
			Date da = c.getDateCellValue();
			//make new simple date format
			SimpleDateFormat sim=new SimpleDateFormat("dd/mm/yyyy");
			//convert date format to simple format
			data = String.valueOf(sim.format(da));
		}else {
			//get numeric value of cell
			double d = c.getNumericCellValue();
			long lo=(long)d;
			data=String.valueOf(lo);
			}	return data;	
	}
	public static int getRowSize(String fileName,String sheet) throws IOException {
	File f=new File("C:\\eclipse\\work space\\Tasks\\Excel Files\\"+fileName+".xlsx");
	FileInputStream fin=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fin);
	Sheet sh = wb.getSheet(sheet);
	int noOfRows = sh.getPhysicalNumberOfRows();
	return noOfRows;
	}
	public static int getCellSize(String fileName,String sheet) throws IOException {
		File f=new File("C:\\eclipse\\work space\\Tasks\\Excel Files\\"+fileName+".xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fin);
		Sheet sh = wb.getSheet(sheet);
		int noOfRows = sh.getPhysicalNumberOfRows();
		int noOfCellsInARow=0;
		for (int i = 0; i < noOfRows; i++) {
			Row r = sh.getRow(i);
			noOfCellsInARow = r.getPhysicalNumberOfCells();
		}		return noOfCellsInARow;
	}
	public static void storeData(String fileName,String sheetName,String key,String value) throws IOException {
	
	File f=new File("C:\\eclipse\\work space\\Tasks\\Excel Files\\"+fileName+".xlsx");
	FileInputStream fin=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fin);
	Sheet sh = wb.getSheet(sheetName);
	int noOfRows = sh.getPhysicalNumberOfRows();
	Row r1 = sh.createRow(noOfRows);
	Cell c1 = r1.createCell(0);
	Cell c2 = r1.createCell(1);
	c1.setCellValue(key);
	c2.setCellValue(value);
	FileOutputStream fout=new FileOutputStream(f);
	wb.write(fout);
	}
}
