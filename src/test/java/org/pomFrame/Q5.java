package org.pomFrame;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;

public class Q5 extends BaseClass{
//	QUESTION 5
//	----------
//	URL : http://www.adactin.com/HotelApp/
//	NOTE: Book a room by using POM and print the order no generated.
	public static void main(String[] args) throws InterruptedException {
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
		dropDownSelectByValue(location, "Sydney");
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
		fillText(firstName, "marudhu");
		WebElement lastName = p4.getLastName();
		fillText(lastName, "pandian");
		WebElement address = p4.getAddress();
		fillText(address, "its my addresss");
		WebElement cardNumber = p4.getCardNumber();
		fillText(cardNumber, "1234567890123456");
		WebElement cardType = p4.getCardType();
		dropDownSelectByValue(cardType, "VISA");
		WebElement expMonth = p4.getExpMonth();
		dropDownSelectByValue(expMonth, "12");
		WebElement expYear = p4.getExpYear();
		dropDownSelectByValue(expYear, "2022");
		WebElement cvv = p4.getCvv();
		fillText(cvv, "123");
		WebElement book = p4.getBook();
		clickLoc(book);
		sleep(10000);
		Q5PojoClass5 p5=new Q5PojoClass5();
		WebElement orderNumber = p5.getOrderNumber();
		System.out.println(orderNumber.getAttribute("value"));
		
		
		
		
	}
	

}
