
package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class p4 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement checkbox = driver.findElement(By.id("pollanswers-1"));
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tempfile = checkbox.getScreenshotAs(OutputType.FILE);
		File permfile = new File("./ScreenShots/dropy.png");
		FileHandler.copy(tempfile, permfile);
		driver.close();

	}

}
