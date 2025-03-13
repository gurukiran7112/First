package com.comcast.crm.objectrepositaryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingAdminPage {

	WebDriver driver;
	public ShoppingAdminPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="collapsed")
	private WebElement Order;
	
	@FindBy(xpath="//a[@href='todays-orders.php']")
	private WebElement dayOrder;
	
	@FindBy(name="DataTables_Table_0_length")
	private WebElement dropdown;
	
	public WebElement getOrder() {
		return Order;
	}
	public WebElement getdayOrder() {
		return dayOrder;
	}
	public WebElement getdropdown() {
		return dropdown;
	}
}
