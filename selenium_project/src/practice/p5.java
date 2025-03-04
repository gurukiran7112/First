package practice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class p5 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("Siddesh@123.com", Keys.TAB, "sahana@12345", Keys.TAB,
				"sahana@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		Thread.sleep(4000);
		WebElement mousescreen = driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		mousescreen.click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tempscreen = mousescreen.getScreenshotAs(OutputType.FILE);
		File permnent = new File("./ScreenShots/mouseAction.png");
		FileHandler.copy(tempscreen, permnent);
		driver.quit();
	}

}
