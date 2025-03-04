package selenium_trainig;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_FindElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();

		// get all the links on the webpage
		List<WebElement> links = driver.findElements(By.xpath("//input[@type='radio']"));

//		//Iterate on the list of links
//		for (int i = 1; i <= links.size(); i++) {
//			String linktext = links.get(i).getText();
//			System.out.println(linktext);
//		}
//		
//		//Iterate on the list of links
//		for( WebElement element:links) {
//			String Url=element.getAttribute("href");
//			System.out.println(Url);
//		}
//		driver.close();

		//iterate using for each
		for (WebElement element : links) {
			Thread.sleep(3000);
			element.click();
			System.out.println(element.isSelected());
		}
	}

}
