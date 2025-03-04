package webelements_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {

	public static void main(String[] args) {
		/* sets the path for chromedriver.exe */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		/* launches the chrome browser */
		WebDriver driver = new ChromeDriver();

		/* Maximize the browser window */
		driver.manage().window().maximize();

		/* fetches the web app under test and waits until it is loaded */
		driver.get("file:///C:/Users/Siddesh/OneDrive/Desktop/selenium2.html");

		/* identifies the textbox with id= i1 */
		WebElement textBox = driver.findElement(By.id("i1"));
		
		/* enters data into the textBox */
		textBox.sendKeys("selenium");
		
		

	}

}
