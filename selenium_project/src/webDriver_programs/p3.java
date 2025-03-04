package webDriver_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* program to manage() */

public class p3 { 

	public static void main(String[] args) {
		/* sets the path for chromedriver.exe */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		/* launches the chrome browser */
		WebDriver driver = new ChromeDriver();

		/* fetches the web app under test and waits until it is loaded */

		// driver.get("https://www.Facebook.com/");

		/* Maximaize the browser window */
		// driver.manage().window().maximize();

		/* Maximaize the browser window */
		// driver.manage().window().fullscreen();

		/* Minimizes the browser window */
		driver.manage().window().minimize();

	}

}
