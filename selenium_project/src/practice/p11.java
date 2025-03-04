package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p11 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();

		Set<String> childWindow = driver.getWindowHandles();
		for (String Child : childWindow) {
			driver.switchTo().window(Child);
			if (driver.getTitle().contains("facebook")) {
				driver.findElement(By.name("email")).sendKeys("Siddesh@1234.com");
				Thread.sleep(10000);
			}
		}
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("small-searchterms")).sendKeys("Comimg back from child window to parent window");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.quit();

	}

}
