package webDriver_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Program to close all the child windows using handles ( important real time ex )*/
public class p9 {

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

		/* calling 'multipleWindows' method in main method */
		multipleWindows(driver);

		/* identifies and clicks Get Started Free button */
		driver.findElement(By.linkText("Get Started Free")).click();

	}

	/* method to handle multiple windows */
	public static void multipleWindows(WebDriver driver) {

		/* Retrieves the window of main window */
		String mainWindow = driver.getWindowHandle();

		/* Retrieves the window of all windows */
		Set<String> allWindows = driver.getWindowHandles();

		/* iterates the set */
		for (String lv : allWindows) {

			/* Switches the control to the specified window */
			driver.switchTo().window(lv);

			/* closes the windows except main window */
			if (lv.equals(mainWindow)) {
				driver.close();
			}
		}
		/* switches the control to the main method */
		driver.switchTo().window(mainWindow);
	}

}
