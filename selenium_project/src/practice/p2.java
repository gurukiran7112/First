package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String disable="document.getElementsByName('name')[0].removeAttribute('disabled');";
		js.executeScript(disable);
		driver.findElement(By.id("name")).sendKeys("I'm able to work on disable");
		

	}

}
