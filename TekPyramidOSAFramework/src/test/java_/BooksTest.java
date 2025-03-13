import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepositaryutility.AdminPage;
import com.comcast.crm.objectrepositaryutility.CartPage;
import com.comcast.crm.objectrepositaryutility.CartquantityPage;
import com.comcast.crm.objectrepositaryutility.CategoryPage;
import com.comcast.crm.objectrepositaryutility.CreateCatogoryPage;
import com.comcast.crm.objectrepositaryutility.OrderHistoryPage;
import com.comcast.crm.objectrepositaryutility.PaymentPage;
import com.comcast.crm.objectrepositaryutility.ShoppingAdminPage;


public class BooksTest extends BaseClass {

	@Test
	public void bookQuantityTest() throws Throwable {
		CategoryPage bp = new CategoryPage(driver);
		CartPage cp = new CartPage(driver);
		CartquantityPage cqp = new CartquantityPage(driver);
		PaymentPage pp = new PaymentPage(driver);

		System.out.println("book");

		cp.getBooks().click(); /* click on books category */

		bp.getbookclik().click(); /* click on particulatr book */

		cqp.addRequredQuantity();  /* enter quantity */


		cqp.getaddToCart().click(); /* add to cart */
		
		wLib.alertHandling(driver);

		cqp.addRequredQuantity();
    	cqp.getaddToCart().click(); /* add to cart */

		wLib.scrollToElement(driver, cp.getUpdatebtn()); /* scroll to element */

		cp.getProcedToCheckout().click(); /* click on checkout */

		pp.getsubmitbtn().click(); /* click on sumbit button */

	}

//	@Test
//	public void wishListTest() throws Throwable {
//		CartPage cp = new CartPage(driver);
//		MyWishListPage mw = new MyWishListPage(driver);
//
//		String bookName = fLib.getDataFromPropertiesFile("search");
//		cp.getsearchField().sendKeys(bookName);
//		cp.getsearchbtn().click();
//
//		cp.getwishlist().click();
//
//		String bookname = fLib.getDataFromPropertiesFile("text");
//
//		cp.getBooks().click();
//		String veifywish = mw.getverifyWishbook().getText();
//		SoftAssert soft = new SoftAssert();
//		soft.assertEquals(veifywish, bookname);
//		soft.assertAll();
//	}

	@Test
	public void fashionAddtoCartTest() throws Throwable {
		CartPage cp = new CartPage(driver);
		CategoryPage bp = new CategoryPage(driver);
		CartquantityPage cqp = new CartquantityPage(driver);

		cp.getFashionLink().click();
		bp.getwhiteShoes().click();
		cqp.getAddCartShoe().click();
		wLib.alertHandling(driver);
		cp.getCartlist().click();

		cp.getCheckCart().click();

		String shoe = fLib.getDataFromPropertiesFile("total");

		String expectedresult = cp.getverifyShoe().getText();

		Assert.assertEquals(expectedresult, shoe);
	
	}
	
	@Test
	public void ZoomInImageTest() throws Exception {
  		CartPage cp = new CartPage(driver);
		CartquantityPage cqp = new CartquantityPage(driver);
 		 CategoryPage bp=new CategoryPage(driver);

  		 cp.gethomeDecor().click();
  		 bp.getCeramicvaseHomeDecor().click();
  		 
  WebElement zoom= cqp.getCeramicVaseZoom();
           cqp.imageZoom7(zoom);
           
           cqp.getHomefromcqp().click();
		
	}
	
	@Test
	public void adminLogin() throws Throwable {
		OrderHistoryPage ohp=new OrderHistoryPage(driver);
	    ohp.getLogoutbtn().click();

		
 		CartPage cp = new CartPage(driver);
 		AdminPage ap=new AdminPage(driver);
 	String username=	fLib.getDataFromPropertiesFile("un");
 	String password=	fLib.getDataFromPropertiesFile("pwd");
	ShoppingAdminPage sap=new ShoppingAdminPage(driver);
 	
    cp.getAdminbtn().click();

 		ap.getPas().sendKeys(username);
 		ap.getUsr().sendKeys(password);
      ap.getAdmLogin().click();
   	sap.getOrder().click();
   	sap.getdayOrder().click();
     WebElement drop=sap.getdropdown();
     wLib.select(drop, 2);
      
	}
	@Test
	public void creatCatogoryTest() {
		CreateCatogoryPage ccp=new CreateCatogoryPage(driver);
		ccp.getCcbtn().click();
	}


}
