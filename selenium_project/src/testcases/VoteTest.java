package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VoteTest {

	@Test
	public void Votetest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Reporter.log("Application was launched sucessfully");
		driver.findElement(By.id("pollanswers-1")).click();
		driver.findElement(By.xpath("//input[@value='Vote']")).click();
		Reporter.log("Sucessfully voted");
		driver.close();
	}

}
