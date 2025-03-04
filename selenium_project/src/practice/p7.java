package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p7 {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		WebElement washington = driver.findElement(By.id("box3"));
		WebElement Southkoria = driver.findElement(By.id("box105"));
		Actions action =new Actions(driver);
		

		action.dragAndDrop(washington, Southkoria).perform();
		Thread.sleep(2000);

		driver.close();
		
	}

}
