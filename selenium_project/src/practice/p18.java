package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p18 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com");
		WebElement SearchKey = driver.findElement(By.name("q"));
		SearchKey.sendKeys("Selenium Webdriver");
		SearchKey.sendKeys(Keys.RETURN);
		
		System.out.println("page Title: "+driver.getTitle());
		driver.quit();
	}

}
