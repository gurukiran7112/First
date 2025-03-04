package selenium_trainig;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p9 {

	public static void main(String[] args) throws Exception {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	  Actions action = new Actions(driver);
	 WebElement lowerCase = driver.findElement(By.id("small-searchterms"));
	 action.moveToElement(lowerCase).click().keyDown(Keys.SHIFT).sendKeys("Mobiles").perform();
	 Thread.sleep(3000);
	 driver.close();
	    
	}

}
