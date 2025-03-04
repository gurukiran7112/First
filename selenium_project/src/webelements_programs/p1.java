package webelements_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*     Program for loacators  */

public class p1 {

	public static void main(String[] args) {
		/* sets the path for chromedriver.exe */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		/* launches the chrome browser */
		WebDriver driver = new ChromeDriver();

		/* Maximize the browser window */
		driver.manage().window().maximize();

		/* fetches the web app under test and waits until it is loaded */
		driver.get("file:///C:/Users/Siddesh/Downloads/selenium1.html");

		/* identify the web element with id = i1 */
		// WebElement link = driver.findElement(By.id("i1"));

		/* identify the web element with name = n1 */
		// WebElement link = driver.findElement(By.name("n1"));

		/* identify the web element with class = c1 */
		// WebElement link = driver.findElement(By.className("c1"));

		/* identify the web element with tagname =a */
		//WebElement link = driver.findElement(By.tagName("a"));
		
		
		/* identify the web element with linktext= Facebooooook  */
		//WebElement link = driver.findElement(By.linkText("Facebooooook"));
		
		/* identify the web element with partial linktext  = Face*/
		WebElement link = driver.findElement(By.partialLinkText("Face"));
		
		
		/* clicks on the webelement */
		link.click();

	}

}
