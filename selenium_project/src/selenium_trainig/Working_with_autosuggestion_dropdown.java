package selenium_trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_autosuggestion_dropdown {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://demowebshop.tricentis.com/");
	//	Thread.sleep(3000);
//		driver.findElement(By.id("small-searchterms")).sendKeys("Compu");
//		Thread.sleep(2000);
//		//driver.findElement(By.xpath("(//a[contains(text(),'Build your own computer')])[2]")).click();     //approch 1 -search field popup remains same
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Puma");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='puma slippers men']")).click();                //approch 2--search field popup is disolve after typing
	}

}
