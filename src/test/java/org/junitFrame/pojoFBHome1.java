package org.junitFrame;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojoFBHome1 extends BaseClass{
	public pojoFBHome1() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLogin() {
		return login;
	}

	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement login;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

}
