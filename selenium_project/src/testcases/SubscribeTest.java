package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SubscribeTest {
	
	@Test
	public void Subscribetest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Reporter.log("Application launched sucessfully");
		
		driver.findElement(By.id("newsletter-email")).sendKeys("Siddu@878@.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		Reporter.log("Subscribed sucessfully");
		driver.close();
	}

}
