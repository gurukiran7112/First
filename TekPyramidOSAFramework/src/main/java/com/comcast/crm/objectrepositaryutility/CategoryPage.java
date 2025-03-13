package com.comcast.crm.objectrepositaryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.basetest.BaseClass;

public class CategoryPage extends BaseClass {
	
WebDriver driver;
	public CategoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='product-details.php?pid=15']")
	private WebElement bookClick;
	
	@FindBy(xpath="//a[@href='product-details.php?pid=19']")
	private WebElement whiteShoes;
	
	@FindBy(partialLinkText="ceramic")
	private WebElement ceramicvaseHomeDecor;
	
	@FindBy(xpath="//a[@href='category.php?cid=8']")
	private WebElement jeweleryLink;
	
	public WebElement getJeweleryLink() {
		return jeweleryLink;
	}
	public WebElement getCeramicvaseHomeDecor() {
		wLib.scrollByAmt(driver, 400, 400);
		return ceramicvaseHomeDecor;
	}
	public WebElement getbookclik() {
		wLib.scrollByAmt(driver, 100, 100);
		return bookClick;
	}
	public WebElement getwhiteShoes() {
		wLib.scrollByAmt(driver, 400, 400);
		return whiteShoes;
	}
}
