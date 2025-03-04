package com.comcast.crm.objectrepositaryutility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.JavaUtility;

public class CreatingNewContactPage extends BaseClass {
	WebDriver driver;

	public CreatingNewContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "lastname")
	private WebElement accNameEdt;

	@FindBy(name = "search_text")
	private WebElement smallWindowSearchField;

	@FindBy(name = "search")
	private WebElement getSmallWindowSearch;

	@FindBy(xpath = "\"//a[text()='\" + orgName + \"']\"")
	private WebElement smallWindowIteamSelect;

	public WebElement getGetSmallWindowSearch() {
		return getSmallWindowSearch;
	}

	public WebElement getSmallWindowSearchField() {
		return smallWindowSearchField;
	}

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;

	public WebElement getSmallWindowIteamSelect() {
		return smallWindowIteamSelect;
	}

	@FindBy(name = "support_start_date")
	private WebElement StrtDate;

	@FindBy(name = "support_end_date")
	private WebElement EndDate;

	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement createContactOrgIntegrationBtn;

	@FindBy(xpath = "(//img[@src='themes/softed/images/select.gif'])[1]")
	private WebElement OrgContactPlusBtn;

	public WebElement getStrtDate() {
		return StrtDate;
	}

	public WebElement getAccNameTxtField() {
		return OrgContactPlusBtn;
	}

	public WebElement getCreateContactOrgIntegrationBtn() {
		return createContactOrgIntegrationBtn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAccNameEdt() {
		return accNameEdt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getStartDate() {
		return StrtDate;
	}

	public WebElement getEndDate() {
		return EndDate;
	}

	public void createContactWithSupportdate(String startDate, String endDate) {
		StrtDate.sendKeys(startDate);
		EndDate.clear();
		EndDate.sendKeys(endDate);
		saveBtn.click();
	}

	public void createContactAndSave(String LastName) {
		accNameEdt.sendKeys(LastName);
		saveBtn.click();
	}

	public void createContactWithOrg(String contactLastName, String orgName) {
		accNameEdt.sendKeys(contactLastName);
		OrgContactPlusBtn.click();
		// switch to child window
		wLib.switchToTabOnURL(driver, "module=Accounts");
		smallWindowSearchField.sendKeys(orgName);
		getSmallWindowSearch.click();
		driver.findElement(By.xpath("//a[text()='" + orgName + "']")).click();
		// switch to parent window
		wLib.switchToTabOnURL(driver, "Contacts&action");
		saveBtn.click();

	}
}
