package com.comcast.crm.orgtest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepositaryutility.CreatingNewOrganizationPage;
import com.comcast.crm.objectrepositaryutility.HomePage;
import com.comcast.crm.objectrepositaryutility.OrganizationInformationPage;
import com.comcast.crm.objectrepositaryutility.OrganizationsPage;

public class CreateOrganizationTest extends BaseClass {

	@Test(groups = "smokeTest")
	public void createOrganization() throws Throwable {

		// Read testScript data from ExcelUtility and add random utility
		String orgName = eLib.getDataFromExcel("org", 1, 2) + jLib.getRandomNumber();

		// Step 2 : navigate to organization module
		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();

		// Step 3 : Click on "create Organization" Button
		OrganizationsPage orgP = new OrganizationsPage(driver);
		orgP.getCreateNewOrgBtn().click();

		// Step 4 : enter all the details & create new organizations
		CreatingNewOrganizationPage cnop = new CreatingNewOrganizationPage(driver);
		cnop.createOrg(orgName);

		// verify header msg Expecte;
		OrganizationInformationPage oip = new OrganizationInformationPage(driver);
		String actorgName = oip.getOrgInfoheaderMsg().getText();
		if (actorgName.contains(orgName)) {
			System.out.println(orgName + " name is verified=====PASS");
		} else {
			System.out.println(orgName + " name is not verified=====FAIL");
		}
	}

	@Test(groups = "regressionTest")
	public void createOrganizationWithIndustriesTest() throws Throwable {
		// Read testScript data from ExcelUtility and add random utility
		String orgName = eLib.getDataFromExcel("org", 4, 2) + jLib.getRandomNumber();
		String industry = eLib.getDataFromExcel("org", 4, 3);

		// Step 2 : navigate to organization module
		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();
		// Step 3 : Click on "create Organization" Button
		OrganizationsPage op = new OrganizationsPage(driver);
		op.getCreateNewOrgBtn().click();

		// Step 4 : enter all the details & create new organizations
		CreatingNewOrganizationPage cnop = new CreatingNewOrganizationPage(driver);
		cnop.createOrg(orgName, industry);

		// verify the industries info
		String actIndustries = driver.findElement(By.id("dtlview_Industry")).getText();
		if (actIndustries.equals(industry)) {
			System.out.println(industry + "  information is created===PASS");
		} else {
			System.out.println(industry + "  information is not created===Fail");
		}
	}

	@Test(groups = "regressionTest")
	public void createOrganizationWithPhoneNumber() throws Throwable {
		// Read testScript data from ExcelUtility and add random utility
		String orgName = eLib.getDataFromExcel("org", 7, 2) + jLib.getRandomNumber();
		String phoneNumber = eLib.getDataFromExcel("org", 7, 3);

		// Step 2 : navigate to organization module
		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();

		// Step 3 : Click on "create Organization" Button
		OrganizationsPage op = new OrganizationsPage(driver);
		op.getCreateNewOrgBtn().click();

		// Step 4 : enter all the details & create new organizations
		CreatingNewOrganizationPage cnop = new CreatingNewOrganizationPage(driver);
		cnop.createOrgWithPhone(orgName, phoneNumber);

		// verify phone number info
		String actPhoneNumber = driver.findElement(By.id("dtlview_Phone")).getText();
		if (actPhoneNumber.equals(phoneNumber)) {
			System.out.println(phoneNumber + "    Phone number is created===Pass");
		} else {
			System.out.println(phoneNumber + "    Phone number is not created===Fail");

		}

	}

}
