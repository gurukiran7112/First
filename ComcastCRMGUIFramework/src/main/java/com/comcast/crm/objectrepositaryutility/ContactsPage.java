package com.comcast.crm.objectrepositaryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	WebDriver driver;

	public ContactsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewContactBtn() {
		return CreateNewContactBtn;
	}

	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement CreateNewContactBtn;

	@FindBy(id = "dtlview_Last Name")
	private WebElement lastnameVerication;

	@FindBy(id = "dtlview_Support Start Date")
	private WebElement actStartDate;

	@FindBy(id = "dtlview_Support End Date")
	private WebElement actEndDate;

	public WebElement getActEndDate() {
		return actEndDate;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getActStartDate() {
		return actStartDate;
	}

	public WebElement getLastnameVerication() {
		return lastnameVerication;
	}

	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement headerMsg;

	public WebElement getHeaderMsg() {
		return headerMsg;
	}


	public WebElement getOrgNameTxtFieldInContactPage() {
		return orgNameTxtFieldInContactPage;
	}

	/* After Intergartion checking org name in contacts page */
	@FindBy(id = "mouseArea_Organization Name")
	private WebElement orgNameTxtFieldInContactPage;
	
	/* After Intergartion checking org name in contacts page */
	@FindBy(id = "mouseArea_Last Name")
	private WebElement lastNameTxtFieldInContactPage;

	public WebElement getLastNameTxtFieldInContactPage() {
		return lastNameTxtFieldInContactPage;
	}
}

