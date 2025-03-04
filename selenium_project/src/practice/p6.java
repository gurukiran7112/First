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

public class p6 {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]")).click();
		WebElement comscreen = driver.findElement(By.xpath("//img[@alt='Picture for category Desktops']"));
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempfile = comscreen.getScreenshotAs(OutputType.FILE);
		File PerFilenew = new File("./ScreenShots/Computerpic.png");
		org.openqa.selenium.io.FileHandler.copy(tempfile, PerFilenew);
		driver.close();
	}

}
