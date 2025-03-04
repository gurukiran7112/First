package selenium_trainig;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_With_Syncronization {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		//Thread.sleep(3000);

		WebElement Searchtxt = driver.findElement(By.id("small-searchterms")); // second write this

		// WebDriver wait is nothing but the explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // first write this
		wait.until(ExpectedConditions.elementToBeClickable(Searchtxt)); // third write this

		driver.findElement(By.id("small-searchterms")).sendKeys("Computer");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		//Thread.sleep(2000);

		WebElement searchpage = driver.findElement(By.xpath("//h1[text()='Search']"));

		// Synchronization point for search text
		wait.until(ExpectedConditions.visibilityOf(searchpage));

		driver.quit();
	}

}
