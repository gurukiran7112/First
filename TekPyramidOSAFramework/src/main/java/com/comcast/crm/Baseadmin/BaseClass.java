	package com.comcast.crm.Baseadmin;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.comcast.crm.generic.databaseutility.DataBaseUtility;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.fileutility.JsonUtility;
import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositaryutility.HomePage;
import com.comcast.crm.objectrepositaryutility.LoginPage;
import com.comcast.crm.objectrepositaryutility.OrderHistoryPage;

public class BaseClass {

	/* Create object */

	public DataBaseUtility dbLib = new DataBaseUtility();
	public FileUtility fLib = new FileUtility();
	public JavaUtility jLib = new JavaUtility();
	public WebDriverUtility wLib = new WebDriverUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public JsonUtility jlib=new JsonUtility();
	public WebDriver driver = null; // driver object created grobally

	@BeforeSuite
	public void configBS() throws SQLException {
		System.out.println("===Connect to DB , Report Config===");
		dbLib.getDbconnection();
	}

	// @Parameters("BROWSER")
	@BeforeClass

	public void configBC() throws Throwable {
		System.out.println("===Launch the BROWSER===");

		//String BROWSER = fLib.getDataFromPropertiesFile("browser");
		// browser; //(used during cross browser )
		
		String BROWSER =System.getProperty("browser" , fLib.getDataFromPropertiesFile("browser"));

		if (BROWSER.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("FireFox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("Edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver(); // After launching the browser, inside driver we have browser session ID and we
											// want this driver object in my listner implementation class and we cannot
											// create object of baseclass because they are (annotation methods got
											// executed automatically we cannot invoke them because they are
											// instructions so made them static and then by taking help of
											// classname(BaseClass) we can access the driver object but one problem is
											// it will not execute in parallel execution (static method will have only
											// one instance) so create one more variable called "sdriver"
		}		
		wLib.waitForPageToLoad(driver);

		String URL = fLib.getDataFromPropertiesFile("url");
		driver.get(URL);
	}

	@BeforeMethod
	public void configBM() throws Throwable {
	//	System.out.println("===Login to Application===");
	//	String USERNAME = fLib.getDataFromPropertiesFile("username");
	//	String PASSWORD = fLib.getDataFromPropertiesFile("password");
		
		String email=fLib.getDataFromPropertiesFile("email");
		String password=fLib.getDataFromPropertiesFile("password");

HomePage hp=new HomePage(driver);
hp.getLogin().click();

LoginPage lp=new LoginPage(driver);
driver.manage().window().maximize();
lp.login(email, password);

	}

	@AfterMethod
	public void configAM() {
		System.out.println("===Logout to Application");
	    OrderHistoryPage ohp=new OrderHistoryPage(driver);
    ohp.getLogoutbtn().click();
	}

	@AfterClass
	public void configAC() {
		System.out.println("===Close the BROWSER===");
		
		driver.close();
	}

	@AfterSuite
	public void configAS() throws SQLException {
		System.out.println("====Close DB , Report BackUp====");
		dbLib.closeDbconnection();
	}

}
