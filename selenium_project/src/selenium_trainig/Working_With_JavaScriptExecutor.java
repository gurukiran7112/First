package selenium_trainig;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_JavaScriptExecutor {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		//make assumption we are not able to identify couple of webelements through our html code
		
		//Typecasting of javaScriptExecutor with driver instance
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('small-searchterms').value='mobiles';");
	}

}
