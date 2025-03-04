package practice.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class p1 {
	
	@Test
	public void p1() {
		WebDriver driver = new ChromeDriver();
		driver.get(null);
	}

}
