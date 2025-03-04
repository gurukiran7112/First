package selenium_trainig;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_With_Screenshot {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");

		// typeCasting
		TakesScreenshot ts = (TakesScreenshot) driver;

		// Temprory location
		File srcfile = ts.getScreenshotAs(OutputType.FILE);

		// Destination file
		File destfile = new File("./ScreenShots/HomePage.png");

		// Copy from Temprory location to Destination file
		FileHandler.copy(srcfile, destfile);
		System.out.println("homePage launched Sucessfully");

		// another screenshot ex for after search
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		// Screenshot after clicking on search button
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/SearchPage.png");
		FileHandler.copy(src, dest);
		
		driver.close();
	}

}
