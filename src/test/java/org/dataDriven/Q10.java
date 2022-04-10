package org.dataDriven;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Q10 extends BaseClass{
	
//	QUESTION 10
//	--------------
//	URL :  http://www.adactin.com/HotelApp/
//
//	NOTE: Create an excel sheet with all details required for Hotel Booking .
//	      Create a maven project. 
//	      Book a hotel using above url by getting the input data  from excel sheet.
//	      Update the orderNo generated after hotel booking in excel sheet using DataDriven.
	
	public static void main(String[] args) throws IOException, InterruptedException {
		chromeBrowser();
		maxWindow();
		LinkedHashMap<String, String> map = mapExcelData("Excel1", "hotel");
		launchUrl(map.get("url"));		
		WebElement username = driver.findElement(By.id("username"));
		fillText(username, map.get("userName"));
		WebElement pass = driver.findElement(By.id("password"));
		fillText(pass, map.get("password"));
		WebElement login = driver.findElement(By.id("login"));
		clickLoc(login);
		WebElement Location = driver.findElement(By.id("location"));
		dropDownSelectByValue(Location,map.get("location"));
		WebElement hotel = driver.findElement(By.id("hotels"));
		dropDownSelectByIndex(hotel,1);
		WebElement room = driver.findElement(By.id("room_type"));
		dropDownSelectByIndex(room,1);
		WebElement submit = driver.findElement(By.id("Submit"));
		clickLoc(submit);
		sleep(2000);
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		clickLoc(radio);
		WebElement conti = driver.findElement(By.id("continue"));
		clickLoc(conti);
		WebElement fname = driver.findElement(By.name("first_name"));
		fillText(fname,map.get("first name"));
		WebElement lname = driver.findElement(By.name("last_name"));
		fillText(lname, map.get("last name"));
		WebElement address = driver.findElement(By.name("address"));
		fillText(address,map.get("address"));
		WebElement ccNum = driver.findElement(By.name("cc_num"));
		fillText(ccNum, map.get("cc num"));
		WebElement dropdown = driver.findElement(By.name("cc_type"));
		dropDownSelectByValue(dropdown, map.get("cctype"));
		WebElement monthdrop = driver.findElement(By.name("cc_exp_month"));
		dropDownSelectByValue(monthdrop, map.get("cc exp month"));
		WebElement yeardrop = driver.findElement(By.name("cc_exp_year"));
		dropDownSelectByValue(yeardrop, map.get("cc exp year"));
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		fillText(cvv, map.get("cvv"));
		WebElement book = driver.findElement(By.name("book_now"));
		clickLoc(book);
		sleep(10000);
		String value = driver.findElement(By.name("order_no")).getAttribute("value");
		storeData("Excel1", "hotel", "order Number", value);
		
	}
}
