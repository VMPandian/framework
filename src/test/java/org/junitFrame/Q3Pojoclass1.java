package org.junitFrame;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Q3Pojoclass1 extends BaseClass{
	public Q3Pojoclass1() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}
	

}
