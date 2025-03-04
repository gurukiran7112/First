package webDriver_programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* program for getWindowHandle() and  getWindowHandles() */

public class p5 {

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

		/* Retrieves the window of main window */
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		System.out.println("----------------------------------------------");

		/* Retrieves the window of all windows including main window */
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);

		/* Returns the type of set */
		System.out.println(allWindows.getClass().getName());

		/* Iterates the data */
		for (String lv : allWindows) {
			System.out.println(lv);

		}
		System.out.println("----------------------------------------------");

		/* Iterates the data */
		Iterator<String> itr = allWindows.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
