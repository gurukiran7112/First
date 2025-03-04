package practice.hometest;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.org.apache.bcel.internal.classfile.Method;

public class HomePageVerificationTest {
	@Test
	public void homePageTest(java.lang.reflect.Method mtd) {
		System.out.println(mtd.getName() + " Test Start");
		String expectedPage = "Home Page";

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8888/");

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();

		String actTitle = driver.findElement(By.xpath("//a[contains(text(),'Home')]")).getText();

		// Hard Assert
		Assert.assertEquals(actTitle, expectedPage);
		System.out.println(mtd.getName() + " Test end");

		driver.close();
	}

	@Test
	public void verifyLogoHomePageTest(java.lang.reflect.Method mtd) {
		System.out.println(mtd.getName() + " Test Start");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8888/");

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();

		boolean status = driver.findElement(By.xpath("//img[@alt='vtiger-crm-logo.gif']")).isEnabled();

		// Hard Assart
		Assert.assertTrue(status);
		System.out.println(mtd.getName() + " Test End");

		driver.close();

	}
}
