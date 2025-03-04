package com.comcast.crm.objectrepositaryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.comcast.crm.generic.webdriverutility.JavaUtility;

public class CreatingNewOrganizationPage extends JavaUtility{
	WebDriver driver;

	public CreatingNewOrganizationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "accountname")
	private WebElement orgNameEdt;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	
	@FindBy(name = "industry")
	private WebElement indEdit;
	
	@FindBy(id="phone")
	private WebElement phnNumEdit;
	

	public WebElement getPhnNumEdit() {
		return phnNumEdit;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrgNameEdt() {
		return orgNameEdt;
	}

	public WebElement getIndEdit() {
		return indEdit;
	}

	public WebElement getAccountName() {
		return orgNameEdt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void createOrg(String orgName) {  // orgName  is coming from excel 
		orgNameEdt.sendKeys(orgName);
		saveBtn.click();
	}

;
	
	public void createOrg(String orgName , String industry) {  // orgName  is coming from excel 
		orgNameEdt.sendKeys(orgName);
		Select select = new Select(indEdit);
		select.selectByContainsVisibleText(industry);
		saveBtn.click();
		}
	
	public void createOrgWithPhone(String orgName , String phoneNumber) {
		orgNameEdt.sendKeys(orgName);
        phnNumEdit.sendKeys(phoneNumber);
        saveBtn.click();
	}
	
		
	
}

