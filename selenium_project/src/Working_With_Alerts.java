import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Alerts {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		//Click on search button without entering search text field
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Handle the alert
		Alert ale = driver.switchTo().alert();
		ale.accept();                              //if its is positive alert we have to take accept() ,if it is negative select dismiss() 
		System.out.println("Alert is handled sucessfully");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Alert was handled");
	}

}
