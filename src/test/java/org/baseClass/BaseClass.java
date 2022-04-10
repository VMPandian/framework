package org.baseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.LinkedHashMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends FileHandlingBase {
	public static WebDriver driver;
	public static Robot r;
	public static Alert alert;
	public static JavascriptExecutor js;
	public static Select s;
	public static WebDriverWait w;

	// chrome Browser Launch
	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	// maximizing window
	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	// launching url
	public static void launchUrl(String url) {
		driver.get(url);
	}

	// sendKeys
	public static void fillText(WebElement ref, String value) {
		ref.sendKeys(value);
	}

	// click
	public static void clickLoc(WebElement ref) {
		ref.click();
	}

	// sleep Time
	public static void sleep(int milliTime) throws InterruptedException {
		Thread.sleep(milliTime);
	}

	// enter key using robot class
	public static void pressEnter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// copy using robot class
	public static void copy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	// dismiss alert box
	public static void dismissAlert() {
		alert = driver.switchTo().alert();
		alert.dismiss();
	}

	// print out
	public static void print(String string) {
		System.out.println(string);
	}

	// scroll up
	public static void scrollUpTo(WebElement loc) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", loc);
	}

	// scroll down
	public static void scrollDownTo(WebElement loc) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", loc);
	}

	// switch to frame using id or name
	public static void switchToFrame(String idOrName) {
		driver.switchTo().frame(idOrName);
	}

	// switch to frame using webElement reference
	public static void switchToFrame(WebElement ref) {
		driver.switchTo().frame(ref);
	}

	// switch to frame by index
	public static void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}

	// dropDownselectByValue
	public static void dropDownSelectByValue(WebElement ele, String value) {
		s = new Select(ele);
		s.selectByValue(value);
	}

	// dropDownselectByIndex
	public static void dropDownSelectByIndex(WebElement ele, int string) {
		s = new Select(ele);
		s.selectByIndex(string);
	}

	// getValue
	public static String getValue(WebElement ref, String attributeName) {
		String str = ref.getAttribute(attributeName);
		return str;
	}

	// create map and store key and values
	public static LinkedHashMap<String, String> mapExcelData(String fileName, String sheetName) throws IOException {
		LinkedHashMap<String, String> maped = new LinkedHashMap<String, String>();
		int rowSize = getRowSize(fileName, sheetName);
		int cellSize = getCellSize(fileName, sheetName);
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < cellSize; j=j+cellSize) {
				maped.put(getCellValue(fileName, sheetName, i, j), getCellValue(fileName, sheetName, i, j + 1));
			}
		}
		return maped;
	}

}
