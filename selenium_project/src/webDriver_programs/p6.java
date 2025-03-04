package webDriver_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Program to close all the windowds one after the other */

public class p6 {

	public static void main(String[] args) throws InterruptedException {
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
			/* Switches the control to the specified window */
			driver.switchTo().window(lv);

			/* Closes the window where the control is */
			driver.close();

			/* pauses for 1 sec */
			Thread.sleep(1000);

		}

	}

}
