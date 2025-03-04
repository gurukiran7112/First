package webDriver_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* program for getTitle() , getCurrentUrl() and  getPageSource()*/

public class p2 {

	public static void main(String[] args) {
		/* sets the path for chromedriver.exe */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		/* launches the chrome browser */
		WebDriver driver = new ChromeDriver();

		/* fetches the web app under test and waits until it is loaded */
		driver.get("https://www.Facebook.com/");

		/* Retrieves the title of the Webpage */ 
		String loginPagetitle = driver.getTitle();
		System.out.println("loginPagetitle");

		/* Retrieves the URL of the Webpage */
		String loginPageUrl = driver.getCurrentUrl();
		System.out.println("loginPageUrl");

		/* Retrieves the source code of the Webpage */

		String loginPageSourceCode = driver.getPageSource();
		System.out.println("loginPageSourceCode");

	}

}
