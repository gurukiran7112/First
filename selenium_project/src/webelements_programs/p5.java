package webelements_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/* program to get text*/

public class p5 {

	public static void main(String[] args) {
		/* sets the path for chromedriver.exe */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		/* launches the chrome browser */
		WebDriver driver = new ChromeDriver();

		/* Maximize the browser window */
		driver.manage().window().maximize();

		/* fetches the web app under test and waits until it is loaded */
		driver.get("file:///C:/Users/Siddesh/Downloads/selenium1.html");

		/* identifies the web element */
		WebElement link = driver.findElement(By.id("i1"));

		/* retrieves the text value of the element */
		String text = link.getText();

		System.out.println(text);

	}

}
