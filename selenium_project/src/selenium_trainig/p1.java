package selenium_trainig;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//li[contains(text(),'Disabled')]")).click();	
		driver.findElement(By.id("name")).sendKeys("Siddesh@01");
		driver.findElement(By.id("email")).sendKeys("Sahana@1.com");
		driver.findElement(By.id("password")).sendKeys("Sahana@132345");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		


	}

}
