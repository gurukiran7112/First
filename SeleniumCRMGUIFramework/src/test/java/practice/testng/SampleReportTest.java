package practice.testng;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReportTest {

	public ExtentReports report;

	@BeforeSuite
	public void configBS() {
		// spark report config
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReport/report.html");
		spark.config().setDocumentTitle("CRM Test Suite results");
		spark.config().setReportName("CRM Report");
		spark.config().setTheme(Theme.DARK);

		// add Env information & create test
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows-10");
		report.setSystemInfo("BROWSER", "CHROME-100");
	}

	@AfterSuite
	public void configAS() {
		report.flush(); // taking the backup
	}

	@Test
	public void createContact() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=index&module=Home");

		TakesScreenshot edriver = (TakesScreenshot) driver;
		String filePath = edriver.getScreenshotAs(OutputType.BASE64);

		ExtentTest test = report.createTest("createContact"); // name of the test case =createContact
		test.log(Status.INFO, "login to app");
		test.log(Status.INFO, "navigate to contact page");
		test.log(Status.INFO, "create Contact");
		if ("HDFCss".equals("HDFC")) {
			test.log(Status.PASS, "contact is created PASS");
		} else {
			test.addScreenCaptureFromBase64String(filePath, "ErrorFile"); // attaching the screenshot
		}
		driver.close();
	}

	@Test
	public void createContactWithOrg() {

		ExtentTest test = report.createTest("createContactWithOrg"); // name of the test case =createContactWithOrg
		test.log(Status.INFO, "login to app");
		test.log(Status.INFO, "navigate to contact page");
		test.log(Status.INFO, "create Contact");
		if ("HDFC".equals("HDFC")) {
			test.log(Status.PASS, "contact is created PASS");
		} else {
			test.log(Status.FAIL, "contact is not created");
		}
	}

	@Test
	public void createContactWithPhonenumber() {

		ExtentTest test = report.createTest("createContactWithPhonenumber"); // name of the test case
																				// =createContactWithPhonenumber
		test.log(Status.INFO, "login to app");
		test.log(Status.INFO, "navigate to contact page");
		test.log(Status.INFO, "create Contact");
		if ("HDFC".equals("HDFC")) {
			test.log(Status.PASS, "contact is created PASS");
		} else {
		}

	}

}
