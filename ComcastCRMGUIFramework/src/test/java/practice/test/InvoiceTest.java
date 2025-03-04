package practice.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)                     // we have to use listner annotations with fully qualified name in SUITE LEVEL
public class InvoiceTest extends BaseClass{
	@Test(retryAnalyzer = com.comcast.crm.generic.listenerutility.RetryListenerImp.class)
	public void activateSim() {
		System.out.println("execute createInvoiceTest");
		Assert.assertEquals(" ", "Login");
		String actTitle=driver.getTitle();
		//Assert.assertEquals(actTitle, "login");
		System.out.println("step-1");
		System.out.println("step-2");
		System.out.println("step-3");
		System.out.println("step-4");	
	}
}
