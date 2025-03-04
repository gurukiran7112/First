package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p9 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);

		driver.findElement(By.name("q")).sendKeys("samsung s23 ultra 5g");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//header[@class='_3EOQ5Q']")).click();
	}

}
