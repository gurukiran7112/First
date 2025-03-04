package webDriver_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* program for navigate() */

public class p4 {

	public static void main(String[] args) {
		/* sets the path for chromedriver.exe */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		/* launches the chrome browser */
		WebDriver driver = new ChromeDriver();

		/* fetches the web app under test and waits until it is loaded */
		driver.get("https://www.Myntra.com/");

		/* navigates to the specified URL */
		driver.navigate().to("https://www.facebook.com/");

		/* navigates backward */
		driver.navigate().back();

		/* navigates forward */
		driver.navigate().forward();
		
		/* navigates the webpage*/
		driver.navigate().refresh();

	}

}
