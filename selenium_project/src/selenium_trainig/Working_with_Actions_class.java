package selenium_trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Actions_class {

	public static void main(String[] args) throws Exception {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		Actions action=new Actions(driver);
		
		//scroll left and right
		//action.scrollByAmount(0, 500).perform();
		
		WebElement scrolltomyaccount = driver.findElement(By.linkText("My account"));
		action.scrollToElement(scrolltomyaccount).perform();
		
		
	}

}
