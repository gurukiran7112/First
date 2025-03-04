package com.comcast.crm.objectrepositaryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Organizations")
	private WebElement orgLink;

	@FindBy(linkText = "Contacts")
	private WebElement ContactLink;

	@FindBy(linkText = "Campaigns")
	private WebElement CampagianLink;

	@FindBy(linkText = "More")
	private WebElement MoreLink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")        //signOut is avail in all page so no need create separate pom page
	public WebElement adminImg;
	
	@FindBy(linkText = "Sign Out")
	public WebElement signOut;
	
	@FindBy(linkText = "Products")
	private WebElement proLink;

	public WebElement getSignOut() {
		return signOut;
	}

	public WebElement getProLink() {
		return proLink;
	}

	public WebElement getAdminImg() {
		return adminImg;
	}

	public WebElement getSignOutLink() {
		return signOut;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrgLink() {
		return orgLink;
	}

	public WebElement getContactLink() {
		return ContactLink;
	}

	public WebElement getCampagianLink() {
		return CampagianLink;
	}

	public WebElement getMoreLink() {
		return MoreLink;
	}

	public void navigateToCampagianPage() {
		Actions action = new Actions(driver);
		action.moveToElement(MoreLink).perform();
		CampagianLink.click();
	}
	
	public void signOut() {
		Actions action = new Actions(driver);
		action.moveToElement(adminImg).perform();
		signOut.click();

		
	}
	
	
}
