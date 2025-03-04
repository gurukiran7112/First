package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement Subs = driver.findElement(By.id("newsletter-subscribe-button"));
		TakesScreenshot ts = (TakesScreenshot) driver;

		File tempfile = Subs.getScreenshotAs(OutputType.FILE);
		File pernfile = new File("./ScreenShots/Subs.png");
		org.openqa.selenium.io.FileHandler.copy(tempfile, pernfile);

		driver.findElement(By.xpath("(//a[contains(text(),'Jewelry')])[3]")).click();
		WebElement sortscreen = driver.findElement(By.id("products-orderby"));
		File tempfile1 = sortscreen.getScreenshotAs(OutputType.FILE);
		File permfile = new File("./ScreenShots/SortBy.png");
		org.openqa.selenium.io.FileHandler.copy(tempfile1, permfile);

		driver.close();

	}

}
