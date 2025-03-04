package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p16 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://open.spotify.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Aashiqui')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//div[contains(text(),'Tum Hi Ho')])[1]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//span[contains(text(),'Sign up')])[2]")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("buttonSecondary")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[contains(text(),'Siddesh')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
		driver.close();

	}

}
