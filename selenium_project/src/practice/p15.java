package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p15 {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("puma");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='puma'])[3]")).click();
		Thread.sleep(3000);

		String text = driver.findElement(By.xpath("(//a[contains(text(),'Smashic Women Casuals For Women')])[1]")).getText();
		Thread.sleep(3000);

		System.out.println(text);
		driver.close();
	}

}
