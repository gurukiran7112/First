package practice.orgtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testy {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement username = driver.findElement(By.name("user_name"));
		username.sendKeys("admin");
		username.click();

		WebElement password = driver.findElement(By.name("user_password"));
		password.sendKeys("admin");
		password.click();

		WebElement login = driver.findElement(By.id("submitButton"));
		login.click();
		
		driver.findElement(By.linkText("Organizations")).click();
		
		WebElement dropdown =driver.findElement(By.id("viewname"));
		Select select =new Select(dropdown);
		select.selectByContainsVisibleText("Prospect Accounts");
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
