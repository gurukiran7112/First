package selenium_trainig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Frame_By_WebElement {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Siddesh/iframe.html");
		Thread.sleep(3000);
	
		//switch to frame by Webelement
		
		driver.switchTo().frame(driver.findElement(By.id("FR1")));
		
		driver.findElement(By.id("newsletter-email")).sendKeys("aaa@test.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
	}

}
