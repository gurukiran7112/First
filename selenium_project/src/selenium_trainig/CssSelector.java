package selenium_trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Siddesh/selenium5.html");
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("hello");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("absolute xpath /");
		
	}

}
	