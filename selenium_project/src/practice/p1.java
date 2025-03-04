package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		String disable = "document.getElementsByName('name')[0].removeAttribute('disabled');";
		Js.executeScript(disable);
		driver.findElement(By.id("name")).sendKeys("Disable nalli data");
	}

}
