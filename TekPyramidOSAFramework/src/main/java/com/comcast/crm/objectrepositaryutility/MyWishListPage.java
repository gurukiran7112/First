package com.comcast.crm.objectrepositaryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWishListPage {

	WebDriver driver;
	public MyWishListPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Thea Stilton and the Tropical Treasure ']/parent::div")
	private WebElement verifyWishbook;
	
	public WebElement getverifyWishbook() {
		return verifyWishbook;
	}
	
}
