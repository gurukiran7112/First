package selenium_trainig;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_With_Screenshot_Webelement {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchtxt = driver.findElement(By.id("small-searchterms"));
		searchtxt.sendKeys("Mobiles");

		// typeCating
		TakesScreenshot ts = (TakesScreenshot) driver; // upcating
		File srcfile = searchtxt.getScreenshotAs(OutputType.FILE); // temp loc
		File destfile = new File("./ScreenShots/Searchfield.png"); // destination loc
		FileHandler.copy(srcfile, destfile); // copy from temp loc to desti loc

		System.out.println("Screenshot on the webelement searchtxt field was successfull");

		WebElement searchbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		File src = searchbtn.getScreenshotAs(OutputType.FILE);
		File Dest = new File("./ScreenShots/SearchButton.png");
		FileHandler.copy(src, Dest);

		driver.close();

	}

}
