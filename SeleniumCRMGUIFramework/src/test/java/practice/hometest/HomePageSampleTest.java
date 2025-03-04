package practice.hometest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageSampleTest {
	@Test
	public void homePageTest(java.lang.reflect.Method mtd) {
		
		SoftAssert assertObj = new SoftAssert();
		
		Reporter.log(mtd.getName() + " Test Start");    //method mtd : to print method name using .getName()
		Reporter.log("Step-1");
		Reporter.log("Step-2");
		assertObj.assertEquals("Home", "Home");
		Reporter.log("Step-3");
		assertObj.assertEquals("Home-CRM", "Home-CRM");
		Reporter.log("Step-4");
		assertObj.assertAll();                              //use this method whenever we try to use assert
		Reporter.log(mtd.getName() + " Test end");
	}

	@Test
	public void verifyLogoHomePageTest(java.lang.reflect.Method mtd) {
		
		SoftAssert assertObj = new SoftAssert();
		
		Reporter.log(mtd.getName() + " Test Start");
		Reporter.log("Step-1");
		Reporter.log("Step-2");
		assertObj.assertTrue(true);
		Reporter.log("Step-3");
		Reporter.log("Step-4");	
		Reporter.log(mtd.getName() + " Test end");

	}
}
