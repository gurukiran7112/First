package frame_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* program to handle frame with WebElement */

public class p1 {

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

		/* identifies the page1 frame */
		WebElement page1Frame = driver.findElement(By.id("f1"));

		/* switches the control to page1 frame */
		driver.switchTo().frame(page1Frame);

		/* identifies the textbox1 and enters the data */
		driver.findElement(By.id("t1")).sendKeys("Selenium");

	}

}
