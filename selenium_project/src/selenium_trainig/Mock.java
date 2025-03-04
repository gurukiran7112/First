package selenium_trainig;

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

public class Mock {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[1]")).click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./ScreenShots/AddToCart.png");
		FileHandler.copy(srcfile, destfile);
		
		System.out.println("AddToCart 2 Screenscessfull was sucessful");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[2]")).click();
		Thread.sleep(3000);

		File src = ts.getScreenshotAs(OutputType.FILE);
		File Dest = new File("./ScreenShots/AddToCart2.png");
		FileHandler.copy(src, Dest);
		Thread.sleep(3000);
		System.out.println("AddToCart 3 Screenscessfull was sucessful");

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[4]")).click();
		Thread.sleep(3000);
	
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File Dest1 = new File("./ScreenShots/AddToCart3.png");
		FileHandler.copy(src1, Dest1);

		driver.close();
	}

}
