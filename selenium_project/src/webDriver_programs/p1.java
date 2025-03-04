package webDriver_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Program for get() and close() */
public class p1 {

	public static void main(String[] args) 
	{
		/* sets the path for chromedriver.exe */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		/*launches the chrome browser*/
		WebDriver driver = new ChromeDriver();
		
		/* fetches the web app under test and waits until it is loaded */
		
		driver.get("https://www.myntra.com/");
		
		/* closes the browser window*/
		driver.close();
	}

}
 