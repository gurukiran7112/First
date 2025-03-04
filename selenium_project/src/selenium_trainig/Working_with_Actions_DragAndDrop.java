package selenium_trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Actions_DragAndDrop {

	public static void main(String[] args) throws Exception {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(3000);
		
		Actions action=new Actions(driver);
		
		//source element
		WebElement source = driver.findElement(By.id("box3"));
		
		//target webelement
		WebElement target = driver.findElement(By.id("box103"));
		
		action.dragAndDrop(source, target).build().perform();
		
		
		//source element
		WebElement source1 = driver.findElement(By.id("box6"));
		
		//target webelement
		WebElement target2 = driver.findElement(By.id("box106"));
		
		action.dragAndDrop(source1, target2).build().perform();


	}

}
