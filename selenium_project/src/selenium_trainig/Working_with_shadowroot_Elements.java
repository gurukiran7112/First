package selenium_trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_shadowroot_Elements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[contains(text(),'Shadow Root Elements')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//section[contains(text(),'Shadow Root')])[2]")).click();
		Thread.sleep(2000);
		

		// Shadow host -> Identify shadow host (username textfield)
		SearchContext Shadow_host_user = driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
		Thread.sleep(2000);
		Shadow_host_user.findElement(By.cssSelector("input[type='text']")).sendKeys("Username");

		// Shadow host -> Identify shadow host (password textfield)
		SearchContext Shadow_host_pass = driver.findElement(By.xpath("//form/div[2]")).getShadowRoot();
		Thread.sleep(2000);
		Shadow_host_pass.findElement(By.cssSelector("input[type='text']")).sendKeys("Passwords");
	}

}
