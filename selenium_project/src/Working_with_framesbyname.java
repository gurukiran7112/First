import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_framesbyname {

	public static void main(String[] args) throws Exception {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Siddesh/iframe.html");
		Thread.sleep(3000);
		
		//Switch the frame by name
		driver.switchTo().frame("frame1");
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Google")).click();
	}

}
