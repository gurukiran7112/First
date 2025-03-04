package selenium_trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Siidu.com",Keys.TAB,"sahana@123",Keys.TAB,"sahana@123");
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();

	}

}
