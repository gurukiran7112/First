import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_test {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
	    Actions action = new Actions(driver);
		WebElement dropdown = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));

        action.moveToElement(dropdown).build().perform();		
	}

}
