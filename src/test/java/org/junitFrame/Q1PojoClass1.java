package org.junitFrame;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Q1PojoClass1 extends BaseClass {
	public Q1PojoClass1() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement pass;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}
	
}
