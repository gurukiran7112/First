package frame_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* program to switch the control to the default frame */
public class p6 {

	public static void main(String[] args) throws InterruptedException {
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

		/* switches the control to frame with */
		driver.switchTo().frame("f1");

		/* identifies the textbox1 and enters the data */
		driver.findElement(By.id("t1")).sendKeys("Selenium");

		System.out.println("--------------------");

		/* pauses the program for 3 sec */
		Thread.sleep(3000);

		/* identifies the textbox1 and clears the data */
		driver.findElement(By.id("t1")).clear();

		/* switches the control to the default frame */
		driver.switchTo().defaultContent();

		/* identifies the textbox2 and clears the data */
		driver.findElement(By.id("t2")).clear();

	}

}
