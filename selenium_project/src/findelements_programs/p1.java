package findelements_programs;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* program to identify all the links */
public class p1 {

	public static void main(String[] args) {
		/* sets the path for chromedriver.exe */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		/* launches the chrome browser */
		WebDriver driver = new ChromeDriver();

		/* Maximize the browser window */
		driver.manage().window().maximize();

		/* fetches the web app under test and waits until it is loaded */
		driver.get("https://www.facebook.com/");
		/* Identifies all the links */
		List<WebElement> links = driver.findElements(By.xpath("//a"));

		/* Returns the type of list */
		System.out.println(links.getClass().getName());
		System.out.println("---------------------");

		/* Returns the no of links */
		System.out.println("The total number of links=" + links.size());

		System.out.println("---------------------");

		/* Iterates the List */
		for (WebElement lv : links) {
			/* prints the text value of every links */
			System.out.println(lv.getText());

		}

		System.out.println("---------------------");

		/* Iterates the List */
		Iterator<WebElement> itr = links.iterator();
		while (itr.hasNext()) {
			/* prints the text value of every links */
			System.out.println(itr.next().getText());
		}

		System.out.println("---------------------");

		/* Iterates the List */
		ListIterator<WebElement> ltr = links.listIterator();
		while (ltr.hasNext()) {
			/* prints the text value of every links */
			System.out.println(ltr.next().getText());

		}

	}

}
