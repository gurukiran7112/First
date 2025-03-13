package com.comcast.crm.objectrepositaryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	WebDriver driver;
	public AdminPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	private WebElement usr;
	
	@FindBy(name="password")
	private WebElement pas;
	
	@FindBy(name="submit")
	private WebElement admLogin;
	
	
	public WebElement getAdmLogin() {
		return admLogin;
	}

	public WebElement getUsr() {
		return usr;
	}

	public WebElement getPas() {
		return pas;
	}
}
