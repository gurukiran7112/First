package webelements_programs;

/* Program using CSS selector */ 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {

	public static void main(String[] args) 
	{
		/* sets the path for chromedriver.exe */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		/* launches the chrome browser */
		WebDriver driver = new ChromeDriver();

		/* Maximize the browser window */
		driver.manage().window().maximize();

		/* fetches the web app under test and waits until it is loaded */
		driver.get("file:///C:/Users/Siddesh/OneDrive/Desktop/selenium3.html");
		
		/* identifies the first check box and enters the data */
		driver.findElement(By.cssSelector("input[tabindex='1']")).sendKeys("Java");
		
		/* identifies the second check box and enters the data */
		driver.findElement(By.cssSelector("input[tabindex='2']")).sendKeys("Selenium");

	}

}
