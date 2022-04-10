package org.dataDriven;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Q6 extends BaseClass {
//	QUESTION 6
//	----------
//	URL : https://www.facebook.com/
//
//	NOTE: Create an excel sheet for facebook email and password.
//	      Login in to facebook by getting the input data  from excel sheet using DataDriven and execute in maven.      
	public static void main(String[] args) throws IOException {
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
		String value = driver.findElement(By.className("_9ay7")).getText();
		storeData("Excel1", "facebook", "error message", value);
	}
}
