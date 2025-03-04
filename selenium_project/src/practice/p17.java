package practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p17 {

	public static void main(String[] args) throws Exception {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
	    for (WebElement lik : links) {
			if (!lik.getText().isEmpty()) {
				System.out.println(lik.getText());
			}
			
		}
	    List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		driver.quit();
	    
		
	}

}
