package org.pomFrame;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Q6PojoClass2 extends BaseClass {
	public Q6PojoClass2() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="Submit")
	private WebElement submit;
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getSubmit() {
		return submit;
	}

}
