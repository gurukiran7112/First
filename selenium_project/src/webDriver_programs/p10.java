package webDriver_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/* program to close tabs*/

public class p10 {

	public static void main(String[] args) {
		/* sets the path for chromedriver.exe */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		/* launches the chrome browser */
		WebDriver driver = new ChromeDriver();

		/* Maximize the browser window */
		driver.manage().window().maximize();

		/* fetches the web app under test and waits until it is loaded */
		driver.get("https://app.elorus.com/login/");

		/* identifies and clicks Terms of use button */
		driver.findElement(By.linkText("Terms of use")).click();

		multipleTabs(driver);

		/* identifies and clicks on PRICING */
		driver.findElement(By.linkText("PRICING")).click();

	}

	/* method to handle multiple windows */
	public static void multipleTabs(WebDriver driver) {
		/* Retrieves the window of main Tab */
		String mainTab = driver.getWindowHandle();

		/* Retrieves the window of all tabs */
		Set<String> allTabs = driver.getWindowHandles();

		/* iterates the set */
		for (String lv : allTabs) {

			/* Switches the control to the specified window */
			driver.switchTo().window(lv);

			/* closes the windows except main window */
			if (lv.equals(mainTab)) {
				driver.close();
			}
		}
	}

}
