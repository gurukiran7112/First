package frame_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* program to handle frame using id and name */

public class p2 {

	public static void main(String[] args) {
		/* sets the path for chromedriver.exe */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		/* launches the chrome browser */
		WebDriver driver = new ChromeDriver();

		/* Maximize the browser window */
		driver.manage().window().maximize();

		/* fetches the web app under test and waits until it is loaded */
		driver.get("file:///D:/Siddesh/page2.html");

		/* identifies the textbox t2 and enters the data */
		driver.findElement(By.id("t2")).sendKeys("Java");

		/* switches the control to frame with id= f1 */
		// driver.switchTo().frame("f1");

		/* switches the control to frame with name */
		driver.switchTo().frame("n1");

		/* identifies the textbox1 and enters the data */
		driver.findElement(By.id("t1")).sendKeys("Selenium");

	}

}
