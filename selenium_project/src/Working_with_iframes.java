import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_iframes {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Siddesh/iframe.html");
		Thread.sleep(2000);
		
		//switch to frame by index
		driver.switchTo().frame(0);
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().defaultContent();   //switch back to main page
		driver.findElement(By.linkText("Google")).click();

	}

}
