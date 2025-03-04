package practice.contacttest;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class createContactWithOrgTest {

	public static void main(String[] args) throws Throwable {

		// read comman data from properties file
		FileInputStream fis = new FileInputStream("./src/main/resources/property_file/Commandata.properties");
		Properties pObj = new Properties();
		pObj.load(fis);

		String BROWSER = pObj.getProperty("browser");
		String URL = pObj.getProperty("url");
		String USERNAME = pObj.getProperty("username");
		String PASSWORD = pObj.getProperty("password");

		// generate the ramdom number
		Random random = new Random();
		int randomint = random.nextInt(10000);

		// Read testScript data from Excel file
		FileInputStream fis1 = new FileInputStream("./src/main/resources/property_file/testScriptData.xlsx");
		Workbook Wb = WorkbookFactory.create(fis1);
		Sheet sh = Wb.getSheet("contact");
		Row row = sh.getRow(7);
		String orgName = row.getCell(2).toString() + randomint;
		String contactLastName = row.getCell(3).getStringCellValue();
		Wb.close();

		WebDriver driver = null;

		if (BROWSER.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("FireFox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("Edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		// Step 1 : login to app
		driver.get(URL);

		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();

		// Step 2 : navigate to organization module
		driver.findElement(By.linkText("Organizations")).click();

		// Step 3 : Click on "create Organization" Button
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();

		// Step 4 : enter all the details & create new organizations
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();

		// verify orgName header text info
		String headerInfo = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if (headerInfo.contains(orgName)) {
			System.out.println(orgName + "header verified ==PASS");
		} else {
			System.out.println(orgName + "header is verified===FAIL");
		}

		// Step 5 : Navigate to contact module(integration)
		driver.findElement(By.linkText("Contacts")).click();

		// Step 6 : Click on "create Contacts" Button
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();

		// Step 7 : enter last name the details and select save
		driver.findElement(By.name("lastname")).sendKeys(contactLastName);
		driver.findElement(By.xpath("//input[@name='account_name']/following-sibling::img")).click();

		// switch to child window
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String windowID = it.next();
			driver.switchTo().window(windowID);

			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains("module=Accounts")) {
				break;
			}
		}

		driver.findElement(By.id("search_txt")).sendKeys(orgName);
		driver.findElement(By.name("search")).click();
		driver.findElement(By.xpath("//a[text()='" + orgName + "']")).click();

		// switch to parent window
		Set<String> set1 = driver.getWindowHandles();
		Iterator<String> it1 = set1.iterator();
		while (it1.hasNext()) {
			String windowID = it1.next();
			driver.switchTo().window(windowID);

			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains("Contacts&action")) {
				break;
			}
		}

		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();

		// verify Header phone Number info Expected Result
		headerInfo = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if (headerInfo.contains(contactLastName)) {
			System.out.println(contactLastName + "header verified ==PASS");
		} else {
			System.out.println(contactLastName + "header is verified===FAIL");
		}

		// verify Header OrgName info Expected Result
		String actOrtgName = driver.findElement(By.id("mouseArea_Organization Name")).getText();
		if (actOrtgName.trim().equals(orgName)) {
			System.out.println(actOrtgName + "information is created===PASS");
		} else {
			System.out.println(actOrtgName + "information is not created===Fail");

		}

		driver.quit();
	}

}
