package selenium_trainig;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class p7 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File destifile = new File("./Screenshots/HomePage1.png");
		FileHandler.copy(srcfile, destifile);

		System.out.println("Homepage lauched successfully");
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		File srcfile1File=ts.getScreenshotAs(OutputType.FILE);
		File destiFIle2=new File("./Screenshots/HomePage22.png");
		FileHandler.copy(srcfile1File, destiFIle2);
		driver.close();
	}

}
