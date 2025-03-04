package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p14 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://in.bookmyshow.com/");
		driver.findElement(By.xpath("//span[text()='Bengaluru']")).click();
		driver.findElement(By.xpath("//div[text()='Vidaamuyarchi']")).click();
		String txt = driver.findElement(By.xpath("//div[@class='sc-o4g232-3 eAlXok']")).getText();
		System.out.println(txt);
		driver.close();

	}
}
