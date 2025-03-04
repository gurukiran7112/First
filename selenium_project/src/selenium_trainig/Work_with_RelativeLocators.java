package selenium_trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Work_with_RelativeLocators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// Search field text box
		//driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//input[@type='submit']"))).sendKeys("mobiles");

		// click on search button
		//driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.xpath("//input[@id='small-searchterms']"))).click();
		
		//driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("pollanswers-1"))).click();
		
		driver.findElement(RelativeLocator.with(By.tagName("a")).near(By.linkText("Register"))).click();
	}
	

}
