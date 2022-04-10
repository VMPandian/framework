package org.junitFrame;

import org.baseClass.BaseClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class Q1 extends BaseClass {
	// QUESTION 1
	// ----------
	// URL : https://www.facebook.com/
	//
	// NOTE: Enter the username and password and verify whether the input data is
	// correct or not by using junit framework.
	@Test
	public void tc1() {
		chromeBrowser();
		maxWindow();
		launchUrl("https://www.facebook.com/");	
	}
	@Test
	public void tc2() {
		Q1PojoClass1 p1 = new Q1PojoClass1();
		WebElement email = p1.getEmail();
		fillText(email, "marudhu");
		WebElement pass = p1.getPass();
		fillText(pass, "its pass");
		Assert.assertTrue("check email", "marudhu".equals(email.getAttribute("value")));
		Assert.assertEquals("its pass", pass.getAttribute("value"));
	}

}
