package selenium_trainig;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_WebElement_Methods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
//		Thread.sleep(1000);
//		driver.findElement(By.id("small-searchterms")).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
//		Thread.sleep(1000);
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
//		Thread.sleep(1000);
//		String Search_Text=driver.findElement(By.xpath("//h1[text()='Search']")).getText();
//		System.out.println(Search_Text);

		// get attribute value
//		String Subscribe_Value = driver.findElement(By.id("newsletter-subscribe-button")).getAttribute("value");
//		System.out.println(Subscribe_Value);

//		// get attribute value before entering the data
//		String SearchField_value = driver.findElement(By.id("small-searchterms")).getAttribute("value");
//		System.out.println(SearchField_value);
//
//		driver.findElement(By.id("small-searchterms")).sendKeys("books");
//
//		String SearchField_After_value = driver.findElement(By.id("small-searchterms")).getAttribute("value");
//		System.out.println(SearchField_After_value);
//		driver.quit();

		// get css value

//		String CssValue = driver.findElement(By.linkText("Register")).getCssValue("color");
//		System.out.println(CssValue);
//		driver.quit();
		
		//verification methods

		if (driver.findElement(By.id("small-searchterms")).isDisplayed()) {
			driver.findElement(By.id("small-searchterms")).sendKeys("books");
		}
	}

}
