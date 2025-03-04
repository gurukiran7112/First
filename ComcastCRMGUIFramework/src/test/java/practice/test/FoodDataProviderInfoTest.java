package practice.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.comcast.crm.generic.fileutility.ExcelUtility;

public class FoodDataProviderInfoTest {

	@Test(dataProvider = "getData")
	public void foodDataProviderInfoTest(String foodName, String IteamName) {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.swiggy.com/search");

		// product Search
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurants and food']")).sendKeys(foodName,
				Keys.ENTER);

		// capture product info
		String x = "//div[text()='505']/../../../../div[3]/div/span/div";
		String foodPrice = driver.findElement(By.xpath(x)).getText();
		System.out.println(foodPrice);
		// driver.close();
	}

	@DataProvider
	public Object[][] getData() throws Throwable {
		ExcelUtility eLib = new ExcelUtility();
		
		int rowCount = eLib.getRowcount("food");

		Object[][] obj = new Object[rowCount][2];
		for (int i = 0; i < rowCount; i++) {
			obj[i][0] = eLib.getDataFromExcel("food", i + 1, 0);
			obj[i][1] = eLib.getDataFromExcel("food", i + 1, 1);
		}
		return obj;
	}
}
