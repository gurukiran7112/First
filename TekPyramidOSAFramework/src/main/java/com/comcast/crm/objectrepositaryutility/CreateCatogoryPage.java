package com.comcast.crm.objectrepositaryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCatogoryPage {
WebDriver driver;
	public CreateCatogoryPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//a[@href='category.php']")
	private WebElement ccbtn;
	
	public WebElement getCcbtn() {
		return ccbtn;
	}
}