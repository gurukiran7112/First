package selenium_trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_keyBoard_Actions {

	public static void main(String[] args) throws Exception {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		WebElement searchtextfield = driver.findElement(By.id("small-searchterms"));
		//action.moveToElement(searchtextfield).click().sendKeys("mobiles").perform();
		
		//key up and key down
		action.moveToElement(searchtextfield).click().keyDown(Keys.SHIFT).sendKeys("mobiles").keyUp(Keys.SHIFT).perform();
		
		driver.close();
		
		
		
	}

}
