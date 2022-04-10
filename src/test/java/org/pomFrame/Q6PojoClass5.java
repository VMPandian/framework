package org.pomFrame;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Q6PojoClass5 extends BaseClass{
	public Q6PojoClass5() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement orderNumber;
	public WebElement getOrderNumber() {
		return orderNumber;
	}
	
	

}
