package selenium_trainig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Alerts_Dismiss {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);

		driver.findElement(By.name("cusid")).sendKeys("989392");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		System.out.println("Alert was handled with dismiss method");
		Thread.sleep(2000);
		driver.quit();

	}

}
