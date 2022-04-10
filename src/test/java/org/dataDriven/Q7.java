package org.dataDriven;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Q7 extends BaseClass {
	public static void main(String[] args) throws IOException {
//		QUESTION 7
//		----------
//		URL : https://www.facebook.com/
//		NOTE: Create an excel sheet for facebook email and password.
//		      Create a project in maven.
//		      Login in to facebook by getting the input data from excel sheet.
//		      Update the successful login or error message generated after login in excel sheet using DataDriven.
		
		chromeBrowser();
		maxWindow();
		LinkedHashMap<String, String> map = mapExcelData("Excel1","facebook");
		launchUrl(map.get("url"));
		WebElement mail = driver.findElement(By.id("email"));
		fillText(mail, map.get("UserId"));
		WebElement pass = driver.findElement(By.id("pass"));
		fillText(pass, map.get("PassWord"));
		WebElement login = driver.findElement(By.name("login"));
		clickLoc(login);
		
		
	}

}
