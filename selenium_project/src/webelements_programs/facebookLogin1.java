package webelements_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLogin1 {

	public static void main(String[] args) {
		/* sets the path for chromedriver.exe */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		/* launches the chrome browser */
		WebDriver driver = new ChromeDriver();

		/* Maximize the browser window */
		driver.manage().window().maximize();

		/* fetches the web app under test and waits until it is loaded */
		driver.get("https://www.facebook.com/");

		/* identifies the username and enters the data */
		driver.findElement(By.id("email")).sendKeys("siddu");

		/* identifies the password and enters the data */
		driver.findElement(By.id("pass")).sendKeys("swathi@123457");

		/* identifies the login button and clicks */
		driver.findElement(By.name("login")).click();

	}

}
