package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p10 {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		Thread.sleep(3000);
		
		Set<String> childWindow = driver.getWindowHandles();
		for (String child : childWindow) {
			driver.switchTo().window(child);
			if (driver.getTitle().contains("Facebook") ){
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@id=':rj:']")).sendKeys("Siddu.com");
				Thread.sleep(4000);

			}
			
			
		}
	}

}
