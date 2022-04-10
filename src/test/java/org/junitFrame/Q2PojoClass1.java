package org.junitFrame;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Q2PojoClass1 extends BaseClass{
	public Q2PojoClass1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="src")
	private WebElement src;
	@FindBy(id="dest")
	private WebElement dest;
	
	public WebElement getSrc() {
		return src;
	}
	public WebElement getDest() {
		return dest;
	}
	
}
