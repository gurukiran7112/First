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

public class p8 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[1]")).click();
		
		WebElement Apprasal = driver.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[3]"));
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File srcfile=Apprasal.getScreenshotAs(OutputType.FILE);
	    File destfile = new File("./Screenshots/Apprasal.png");
	    FileHandler.copy(srcfile, destfile);
	    System.out.println("took screenshot");
	    driver.close();
	}

}
