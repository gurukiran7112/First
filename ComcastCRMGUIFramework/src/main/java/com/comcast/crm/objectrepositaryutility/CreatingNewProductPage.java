package com.comcast.crm.objectrepositaryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.basetest.BaseClass;

public class CreatingNewProductPage extends BaseClass {
	WebDriver driver;

	public CreatingNewProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "productname")
	private WebElement productNametxtField;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;

	@FindBy(id = "qty_per_unit")
	private WebElement productQuant;

	@FindBy(xpath = "(//input[@name='assigntype'])[2]")
	private WebElement groupRadioBtn;

	public WebElement getHandlerDropdwn() {
		return handlerDropdwn;
	}

	@FindBy(name = "assigned_group_id")
	private WebElement handlerDropdwn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getGroupRadioBtn() {
		return groupRadioBtn;
	}

	public WebElement getProductNametxtField() {
		return productNametxtField;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void productInfo(String productName) {
		productNametxtField.sendKeys(productName);
		saveBtn.click();
	}

	public void productWithQuantity(String productName, String productQuantity) {
		productNametxtField.sendKeys(productName);
		productQuant.sendKeys(productQuantity);
		groupRadioBtn.click();
		wLib.select(handlerDropdwn, "Support Group");
		saveBtn.click();
	}

	public WebElement getProductQuant() {
		return productQuant;
	}
}
