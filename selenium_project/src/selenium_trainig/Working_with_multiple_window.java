package selenium_trainig;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_multiple_window {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);

		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(3000);

		Set<String> childwindows = driver.getWindowHandles();
		for (String window : childwindows) {
			driver.switchTo().window(window);
			if (driver.getTitle().contains("Facebook")) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("Prad@Test.com");
				driver.close(); // closes the facebook window
			}

		}
		driver.switchTo().window(parentwindow);   //switches to parent window
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mobiles");    //we can use id or xpath
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
