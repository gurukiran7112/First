package webDriver_programs;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* program to sets the size of the browser window*/

public class p12 {

	public static void main(String[] args) {
		/* sets the path for chromedriver.exe */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		/* launches the chrome browser */
		WebDriver driver = new ChromeDriver();
		
		/*  Required height and width of browser window */
		int height=500, width=500;
		
		/* creates an object of Dimenstion with specified height and width */
		Dimension dimension = new Dimension(width, height);
		
		/* sets the size of the browser wwindow */
		driver.manage().window().setSize(dimension);

		/* fetches the web app under test and waits until it is loaded */
		driver.get("https://www.facebook.com/");
		
		/* Deletes all cookies*/
		driver.manage().deleteAllCookies();

	}

}
