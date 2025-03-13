package com.comcast.crm.objectrepositaryutility;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.generic.fileutility.JsonUtility;

public class CartquantityPage extends BaseClass{
	JsonUtility json=new JsonUtility();

	WebDriver driver;
	public CartquantityPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this );
	}
	
	@FindBy(className="ir")
	private WebElement addQuantity;
	
	@FindBy(xpath="//a[@href=\"product-details.php?page=product&action=add&id=15\"]")
	private WebElement addToCart;
	
	@FindBy(xpath="//a[@href='product-details.php?page=product&action=add&id=19']")
	private WebElement addToCartShoe;
	
	@FindBy(className="img-responsive")
	private WebElement ceramicVaseZoom;
	
	@FindBy(className="lb-close")
	private WebElement closeImage;
	
	@FindBy(linkText="Home")
	private WebElement homefromcqp;
	
	@FindBy(className="cart-quantity")
	private WebElement qtyBar;
	

	public WebElement getQtyBar() {
		wLib.scrollByAmt(driver,100, 100);
		return qtyBar;
	}

	public WebElement getHomefromcqp() {
		return homefromcqp;
	}

	public WebElement getCloseImage() {
		return closeImage;
	}

	public WebElement getCeramicVaseZoom() {
		return ceramicVaseZoom;
	}

	public WebElement getAddCartShoe() {
		wLib.scrollByAmt(driver, 200, 2000);
		return addToCartShoe;
	}
	
	
	public WebElement getaddQuantity() {
		wLib.scrollByAmt(driver, 100, 100);
		return addQuantity;
	}
	public WebElement getaddToCart() {
		return addToCart;
	}
	

	public void addRequredQuantity() throws Throwable {
//		while(1<add)
//		addQuantity.click();    //infinite loop
//		    add--;
		for(int i=1;i<40;i++) {
			addQuantity.click();
		
		}
	}
	public void imageZoom7(WebElement element) throws Exception {
		wLib.scrollByAmt(driver, 300, 300);
		for(int i=1;i<7;i++) {
			
			element.click();
			Thread.sleep(1000);
			closeImage.click();	}
	}
	public void qtybar() {
		int j=200;
		wLib.scrollByAmt(driver, j, j);

		for(int i=1;i<40.40;i++) {
			qtyBar.click();
		}
	}

			
		}
	

