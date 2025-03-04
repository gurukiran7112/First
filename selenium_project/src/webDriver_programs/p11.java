package webDriver_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* quit() closes all tab and windows*/

public class p11 {

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
    
		/* closes all the windows */
		driver.quit();

	}

}
