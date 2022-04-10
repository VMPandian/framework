package org.pomFrame;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;

public class Q6 extends BaseClass{
	public static void main(String[] args) throws InterruptedException, IOException {
		LinkedHashMap<String, String> map = mapExcelData("Excel1", "hotel");
		chromeBrowser();
		maxWindow();
		launchUrl("http://www.adactin.com/HotelApp/");
		Q5PojoClass1 p1=new Q5PojoClass1();
		WebElement email = p1.getEmail();
		fillText(email, "tstUserName");
		WebElement pass = p1.getPass();
		fillText(pass, "tstPassWord");
		WebElement login = p1.getLogin();
		clickLoc(login);
		Q5PojoClass2 p2=new Q5PojoClass2();
		WebElement location = p2.getLocation();
		WebElement hotels = p2.getHotels();
		WebElement roomType = p2.getRoomType();
		WebElement submit = p2.getSubmit();
		dropDownSelectByValue(location, map.get("location"));
		dropDownSelectByIndex(hotels, 1);
		dropDownSelectByIndex(roomType, 1);
		clickLoc(submit);
		Q5PojoClass3 p3=new Q5PojoClass3();
		WebElement radioButton = p3.getRadioButton();
		clickLoc(radioButton);
		WebElement go = p3.getGo();
		clickLoc(go);
		Q5PojoClass4 p4=new Q5PojoClass4();
		WebElement firstName = p4.getFirstName();
		fillText(firstName, map.get("first name"));
		WebElement lastName = p4.getLastName();
		fillText(lastName, map.get("last name"));
		WebElement address = p4.getAddress();
		fillText(address, map.get("address"));
		WebElement cardNumber = p4.getCardNumber();
		fillText(cardNumber, map.get("cc num"));
		WebElement cardType = p4.getCardType();
		dropDownSelectByValue(cardType, map.get("cctype"));
		WebElement expMonth = p4.getExpMonth();
		dropDownSelectByValue(expMonth, map.get("cc exp month"));
		WebElement expYear = p4.getExpYear();
		dropDownSelectByValue(expYear, map.get("cc exp year"));
		WebElement cvv = p4.getCvv();
		fillText(cvv, map.get("cvv"));
		WebElement book = p4.getBook();
		clickLoc(book);
		sleep(10000);
		Q5PojoClass5 p5=new Q5PojoClass5();
		WebElement orderNumber = p5.getOrderNumber();
		String value = orderNumber.getAttribute("value");
		storeData("Excel1", "hotel", "order number", value);
		
		
		
		
	}

}
