package selenium_trainig;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Working_With_FluentWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement Searchtxt = driver.findElement(By.id("small-searchterms"));

		//Fluent Wait
		 FluentWait wait=new FluentWait(driver);
		 
		 wait.pollingEvery(Duration.ofSeconds(1));
		 wait.withTimeout(Duration.ofSeconds(15));
		 wait.until(ExpectedConditions.elementToBeClickable(Searchtxt));

		driver.findElement(By.id("small-searchterms")).sendKeys("Computers");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		WebElement searchpage = driver.findElement(By.xpath("//h1[text()='Search']"));
		
        wait.until(ExpectedConditions.visibilityOf(searchpage));
		
		driver.quit();

	}

}
