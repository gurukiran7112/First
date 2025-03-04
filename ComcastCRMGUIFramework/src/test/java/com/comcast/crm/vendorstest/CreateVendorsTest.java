package com.comcast.crm.vendorstest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class CreateVendorsTest {

	public static void main(String[] args) throws Throwable {

		/* Create object */
		FileUtility fLib = new FileUtility();
		ExcelUtility eLib = new ExcelUtility();
		JavaUtility jLib = new JavaUtility();
		WebDriverUtility wLib = new WebDriverUtility();

		// read comman data from FileUtility
		String BROWSER = fLib.getDataFromPropertiesFile("browser");
		String URL = fLib.getDataFromPropertiesFile("url");
		String USERNAME = fLib.getDataFromPropertiesFile("username");
		String PASSWORD = fLib.getDataFromPropertiesFile("password");

		// Read testScript data from ExcelUtility and add random utility
		String VendName = eLib.getDataFromExcel("vendors", 1, 2) + jLib.getRandomNumber();

		WebDriver driver = null;
		if (BROWSER.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("Edge")) {
			driver = new EdgeDriver();
		} else if (BROWSER.equals("Firefox")) {
			driver = new FirefoxDriver();
		}

		wLib.waitForPageToLoad(driver);
		driver.manage().window().maximize();

		// Step 1 : login to app
		driver.get(URL);

		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();

		// Step 2 : navigate to vendors element
		Actions action = new Actions(driver);
		driver.findElement(By.linkText("More")).click();
		WebElement vendorEle = driver.findElement(By.linkText("Vendors"));
		action.moveToElement(vendorEle).click().perform();

		// Step 3 : Click on "create vendor Button
		driver.findElement(By.xpath("//img[@alt='Create Vendor...']")).click();

		// Step 4 : enter all the details & create new vendor
		driver.findElement(By.name("vendorname")).sendKeys(VendName);
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();

		// verify vendor header text info
		String actHeaderInfo = driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
		if (actHeaderInfo.contains(VendName)) {
			System.out.println(VendName + " vendeer information is created ====PASS");
		} else {
			System.out.println(VendName + " vendeer information is not created ====FAIL");

		}

		driver.quit();

	}

}
