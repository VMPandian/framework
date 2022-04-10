package org.pomFrame;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Q6PojoClass1 extends BaseClass{
	public Q6PojoClass1() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement email;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement login;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	
}
