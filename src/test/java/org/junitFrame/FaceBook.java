package org.junitFrame;

import java.io.IOException;
import java.util.Date;

import org.baseClass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class FaceBook extends BaseClass {	
		@Test 
		public void tc1() throws IOException {
			launchUrl("https://www.facebook.com/");
			pojoFBHome1 p1=new pojoFBHome1();
			WebElement email = p1.getEmail();
			fillText(email, getCellValue("Excel1", "facebook", 1, 1));
			Assert.assertEquals("check email", "8807148820",email.getAttribute("value"));
			WebElement pass = p1.getPass();
			fillText(pass, getCellValue("Excel1", "facebook", 2, 1));
			Assert.assertEquals("check password","123456789",pass.getAttribute("value"));
		}
		@Before
		public void bef() {
			Date d=new Date();
			System.out.println(d);
		}
		@After
		public void aft() {
			Date d=new Date();
			System.out.println(d);
		}
		@BeforeClass
		public static void befcls() {
			System.out.println("starts....");
			chromeBrowser();
			maxWindow();
		}
		@AfterClass
		public static void aftcls() throws InterruptedException {
			sleep(2000);
			//driver.quit();
		}
		@Test
		public void tc2() {
			pojoFBHome1 p1=new pojoFBHome1();
			WebElement login = p1.getLogin();
			clickLoc(login);
			String title = driver.getTitle();
			Assert.assertTrue("check login", title.contains("og"));
		}
	}
