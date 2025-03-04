package practice;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class p12 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");

		List<WebElement> multiRadio = driver.findElements(By.xpath("//input[@type='radio']"));

		for (WebElement radio : multiRadio) {
			Thread.sleep(2000);
			radio.click();
			System.out.println(radio.isSelected());
			TakesScreenshot ts=(TakesScreenshot)driver;
			File tempFile = ts.getScreenshotAs(OutputType.FILE);
			File permFile = new File("./ScreenShots/radiobutton.png");
		    FileHandler.copy(tempFile, permFile);
		}

	}
}
