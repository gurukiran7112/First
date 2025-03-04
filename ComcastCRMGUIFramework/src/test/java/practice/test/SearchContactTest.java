package practice.test;

/**
 * test class for contact module
 * @author Siddesh
 * 
 */

import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepositaryutility.LoginPage;

public class SearchContactTest extends BaseClass {
	/**
	 * Scenario : login()==>navigateContact==>createContact()==verify
	 * 
	 * 
	 */
	@Test
	public void searchContactTest() {
		/* Step 1 : login to app */
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp("username", "password");

	}
}
