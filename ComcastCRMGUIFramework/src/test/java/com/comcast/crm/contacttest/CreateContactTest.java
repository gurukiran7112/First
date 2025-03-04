package com.comcast.crm.contacttest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepositaryutility.ContactsPage;
import com.comcast.crm.objectrepositaryutility.CreatingNewContactPage;
import com.comcast.crm.objectrepositaryutility.CreatingNewOrganizationPage;
import com.comcast.crm.objectrepositaryutility.HomePage;
import com.comcast.crm.objectrepositaryutility.OrganizationsPage;

/**
 * 
 * @author Siddesh
 */
public class CreateContactTest extends BaseClass {

	@Test(groups = "smokeTest")
	public void createContactTest() throws Throwable {

		UtilityClassObject.getTest().log(Status.INFO, "read data from excel");
		
		/* Read testScript data from ExcelUtility and add random utility */
		String lastName = eLib.getDataFromExcel("contact", 1, 2) + jLib.getRandomNumber();

		// Step 2 : navigate to Contacts module
		UtilityClassObject.getTest().log(Status.INFO, "navigate to Contact page");
		HomePage hp = new HomePage(driver);
		hp.getContactLink().click();

		// Step 3 : Click on "create Contacts" Button
		UtilityClassObject.getTest().log(Status.INFO, "navigate to create Contact page");
		ContactsPage cp = new ContactsPage(driver);
		cp.getCreateNewContactBtn().click();

		// Step 4 : enter last name the details and select save
		UtilityClassObject.getTest().log(Status.INFO, "Create a new Contact with last name");
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.createContactAndSave(lastName);

		UtilityClassObject.getTest().log(Status.INFO, lastName +  "======>Create a new Contact with last name");
		
		// verify header info (mandotorty so use hard assert)
		UtilityClassObject.getTest().log(Status.INFO, "navigate to create Contact page");
		String actHeader = cp.getHeaderMsg().getText();
		boolean status = actHeader.contains(lastName); /* Header is dynamic data so use boolean and contains */
		Assert.assertEquals(status, true);

		// verify last name info (not mandotorty so use soft assert with soft Object
		// creation and asserAll method)

		String actLastName = cp.getLastnameVerication().getText();
		SoftAssert softObj = new SoftAssert();
		softObj.assertEquals(actLastName, lastName);
		softObj.assertAll();

	}

	@Test(groups = "regressionTest")
	public void CreateContactWithSupportDateTest() throws Throwable {
		
		UtilityClassObject.getTest().log(null, null)
		
		// Read testScript data from ExcelUtility and add random utility
		String lastName = eLib.getDataFromExcel("contact", 4, 2) + jLib.getRandomNumber();

		// Step 2 : navigate to contacts module
		HomePage hp = new HomePage(driver);
		hp.getContactLink().click();

		// Step 3 : Click on "create contact" Button
		ContactsPage cp = new ContactsPage(driver);
		cp.getCreateNewContactBtn().click();

		// Step 4 : enter all the details & create new contact

		String startDate = jLib.getSystemDateYYYYDDMM();
		String endDate = jLib.getRequiredDateYYYYDDMM(30);

		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);

		cncp.createContactWithSupportdate(lastName, startDate, endDate);

		/* verify start Date info */
		String actStartDate = cp.getActStartDate().getText();
		Assert.assertEquals(actStartDate, startDate);

		// verify End Date info
		String actEndDate = cp.getActEndDate().getText();
		Assert.assertEquals(actEndDate, endDate);
	}

	@Test(groups = "regressionTest")
	public void CreateContactWithOrgTest() throws Throwable {

		// Read testScript data from ExcelUtility and add random utility
		String orgName = eLib.getDataFromExcel("contact", 7, 2) + jLib.getRandomNumber();
		String contactLastName = eLib.getDataFromExcel("contact", 7, 3) + jLib.getRandomNumber();

		// Step 2 : navigate to organization module
		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();

		// Step 3 : Click on "create Organization" Button
		OrganizationsPage op = new OrganizationsPage(driver);
		op.getCreateNewOrgBtn().click();

		// Step 4 : enter all the details & create new organizations
		CreatingNewOrganizationPage cnop = new CreatingNewOrganizationPage(driver);
		cnop.createOrg(orgName);

		// verify orgName header text info
//		String OrgheaderInfo = op.getActHeaderVerification().getTagName();
//		boolean status = OrgheaderInfo.contains(orgName);
//		Assert.assertEquals(status, true);

		// Step 5 : Navigate to contact module(integration)

		hp.getContactLink().click();

		// Step 6 : Click on "create Contacts" Button
		ContactsPage cp = new ContactsPage(driver);
		cp.getCreateNewContactBtn().click();

		// Step 7 : enter last name details and select createContactOrgIntegration
		// button
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.createContactWithOrg(contactLastName, orgName);

		// verify Header info info Expected Result

//		String actLastNemeField = cp.getLastNameTxtFieldInContactPage().getText();
//		SoftAssert soft = new SoftAssert();
//		soft.assertEquals(actLastNemeField, contactLastName);
//		soft.assertAll();
//
//		// verify Header OrgName info Expected Result
//		String actOrgNameInTxtFieldContactPg = cp.getOrgNameTxtFieldInContactPage().getText();
//		boolean actOrgName = actOrgNameInTxtFieldContactPg.contains(orgName);
//		Assert.assertEquals(actOrgName, true);

	}
}
