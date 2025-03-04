package com.comcast.crm.objectrepositaryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {
	
	WebDriver driver;
	public OrganizationsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearchEdt() {
		return searchEdt;
	}

	public WebElement getSelectDD() {
		return selectDD;
	}

	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement createNewOrgBtn;
	
	@FindBy(name = "search_text")
	private WebElement searchEdt;
	
	@FindBy(id  = "bas_searchfield")
	private WebElement selectDD;
	
	@FindBy(name = "submit")
	private WebElement searchBtn;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactLink;
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement actHeaderVerification;

	public WebElement getActHeaderVerification() {
		return actHeaderVerification;
	}

	public WebElement getContactLink() {
		return contactLink;
	}

	public WebElement getCreateNewOrgBtn() {
		return createNewOrgBtn;
		
		
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

}
