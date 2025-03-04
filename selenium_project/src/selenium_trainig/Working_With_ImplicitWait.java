package selenium_trainig;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Implicit wait statement (Important)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.id("small-searchterms")).sendKeys("Computers");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.quit();

	}

}
