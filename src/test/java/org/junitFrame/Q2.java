package org.junitFrame;

import org.baseClass.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Q2 extends BaseClass{
//	QUESTION 2
//	----------
//	URL : https://www.redbus.in/
//
//	NOTE: Click signin and enter the email and password and verify whether the input data is correct or not by using junit framework.
	@Test
	public void tc1() {
		chromeBrowser();
		maxWindow();
		launchUrl("https://www.redbus.in/");
			
	}
	@Test
	public void tc2() {
		Q2PojoClass1 p1=new Q2PojoClass1();
		WebElement src = p1.getSrc();
		fillText(src, "Chennai");
		WebElement dest = p1.getDest();
		fillText(dest, "Madurai");
	}
	@Before
	public void bef() {
		
	}

}
