package org.dataDriven;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Q11 extends BaseClass {
//	QUESTION 11
//	------------
//	URL : https://my.naukri.com/account/register/basicdetails
//	NOTE: Create an excel sheet with all details required for registration.
//	      Create a maven project. 
//	      Register a form in above url by getting the input data  from excel sheet.
	public static void main(String[] args) throws IOException {
		chromeBrowser();
		maxWindow();
		LinkedHashMap<String, String> map = mapExcelData("Excel1", "nakuri");
		launchUrl(map.get("url"));
		WebElement name = driver.findElement(By.id("name"));
		fillText(name, map.get("name"));
		WebElement email = driver.findElement(By.id("email"));
		fillText(email, map.get("email"));
		WebElement pass = driver.findElement(By.id("password"));
		fillText(pass, map.get("pass"));
		WebElement mobile = driver.findElement(By.id("mobile"));
		fillText(mobile, map.get("mobile"));
		WebElement exp = driver.findElement(By.xpath("(//div[@class='textWrap'])[1]"));
		clickLoc(exp);
		WebElement reg = driver.findElement(By.xpath("//button[@type='submit']"));
		clickLoc(reg);
		
		
	}

}
