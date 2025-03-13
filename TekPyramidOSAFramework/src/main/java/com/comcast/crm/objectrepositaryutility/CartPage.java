package com.comcast.crm.objectrepositaryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.basetest.BaseClass;

public class CartPage extends BaseClass {

	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),' Books')]")
	private WebElement books;

	@FindBy(name = "shipupdate")
	private WebElement updatebtn;

	@FindBy(name = "ordersubmit")
	private WebElement procedToCheckout;

	@FindBy(className = "search-field")
	private WebElement searchField;

	@FindBy(className = "search-button")
	private WebElement searchbtn;

	@FindBy(xpath="//a[@href='category.php?pid=16&&action=wishlist']")
	private WebElement wishlist;
	
	@FindBy(xpath="//a[contains(text(),'Fashion')]")
	private WebElement fashionLink;
	
	@FindBy(className="sign")
	private WebElement cartlist;
	
	@FindBy(xpath="//a[contains(@class,'btn btn-upper btn-primary btn-block m-t-20')]")
	private WebElement checkCart;
	
	@FindBy(xpath="//h4")
	private WebElement verifyShoe;
	
	@FindBy(xpath="//a[@href='category.php?cid=7']")
	private WebElement homeDecor;
	
	@FindBy(xpath="//a[@href='product-details.php?pid=26']")
	private WebElement jeweleryItem;
	
	@FindBy(xpath="//a[@href=\"admin\"]")
	private WebElement adminbtn;
	
	public WebElement getAdminbtn() {
		return adminbtn;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSearchField() {
		return searchField;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public WebElement getWishlist() {
		return wishlist;
	}
	public WebElement getVerifyShoe() {
		return verifyShoe;
	}
	public WebElement getHomeDecor() {
		return homeDecor;
	}
	public WebElement getJeweleryItem() {
		wLib.scrollByAmt(driver, 200, 200);
		return jeweleryItem;
	}
	public WebElement gethomeDecor() {
	       return homeDecor;
	}
	public WebElement getverifyShoe() {
		return verifyShoe;
	}

	public WebElement getCheckCart() {
		return checkCart;
	}

	public WebElement getCartlist() {
		return cartlist;
	}

	public WebElement getFashionLink() {
		return fashionLink;
	}

	public WebElement getBooks() {
		return books;
	}

	public WebElement getUpdatebtn() {
		return updatebtn;
	}

	public WebElement getProcedToCheckout() {
		wLib.scrollByAmt(driver, 150, 150);

		return procedToCheckout;
	}

	public WebElement getsearchField() {
		return searchField;
	}

	public WebElement getsearchbtn() {
		return searchbtn;
	}

	public WebElement getwishlist() {
		wLib.scrollByAmt(driver, 100, 100);
		return wishlist;
	}

}