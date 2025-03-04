package webDriver_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* program to close only Facebook and twitter window */

public class p7 {

	public static void main(String[] args) {
		/* sets the path for chromedriver.exe */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		/* launches the chrome browser */
		WebDriver driver = new ChromeDriver();

		/* Maximize the browser window */
		driver.manage().window().maximize();

		/* fetches the web app under test and waits until it is loaded */
		driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");

		/* identifies and clicks followall button */
		driver.findElement(By.id("followall")).click();

		/* Retrieves the window of all windows */
		Set<String> allWindows = driver.getWindowHandles();

		/* iterates the set */
		for (String lv : allWindows) {
			/* switches the title of the window */
			driver.switchTo().window(lv);

			/* Retrieves the title of the window */
			String title = driver.getTitle();

			/* closes the facebook and x windows */
			if (title.contains("Facebook") || title.contains("X")) {
				driver.close();

			}

		}

	}

}
