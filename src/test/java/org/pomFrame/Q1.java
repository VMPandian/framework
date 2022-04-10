package org.pomFrame;

import java.io.IOException;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;

public class Q1 extends BaseClass{
//	QUESTION 1
//	----------
//	URL : https://www.facebook.com/
//
//	NOTE: Enter the username and password by using POM framework.
	public static void main(String[] args) throws IOException {
		chromeBrowser();
		maxWindow();
		launchUrl("https://www.facebook.com/");
		Q1PojoClass1 p1=new Q1PojoClass1();
		WebElement txtEmail = p1.getTxtEmail();
		fillText(txtEmail, getCellValue("Excel1", "facebook", 1, 1));
		WebElement txtPass = p1.getTxtPass();
		fillText(txtPass, getCellValue("Excel1", "facebook", 2, 1));
		WebElement btnLogin = p1.getBtnLogin();
		clickLoc(btnLogin);
		
	}

}
