package selenium_trainig;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
        Thread.sleep(2000);
        //WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
        
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("admin@gmail.com",Keys.TAB,"Admin@1234",Keys.TAB,"Admin@1234",Keys.ENTER);
        driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
        
	}

}
