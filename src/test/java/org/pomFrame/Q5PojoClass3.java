package org.pomFrame;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Q5PojoClass3 extends BaseClass{
	public Q5PojoClass3() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radioButton;
	@FindBy (id="continue")
	private WebElement go;
	
	public WebElement getRadioButton() {
		return radioButton;
	}
	public WebElement getGo() {
		return go;
	}
	

}
