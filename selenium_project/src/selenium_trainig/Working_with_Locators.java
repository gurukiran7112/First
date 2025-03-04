package selenium_trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Locators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		// WebElement searchField=driver.findElement(By.name("q"));
		// searchField.sendKeys("mobiles");

		// driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");

		// driver.findElement(By.linkText("Register")).click();
		// driver.findElement(By.linkText("Log in")).click();
		// driver.findElement(By.partialLinkText("cart")).click();
		// driver.findElement(By.tagName("input")).sendKeys("Hello");
		// driver.findElement(By.className("search-box-text")).sendKeys("Class name");
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
		//driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
		//driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("grouping for index in realative x path");
		//driver.findElement(By.xpath("//a[text()='Register']")).click();
		//driver.findElement(By.xpath("//a[text()='Log in']")).click();	
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		//driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys("Hello");
		//driver.findElement(By.xpath("(//input[contains(@class,'button')])[1]")).click();
		//driver.findElement(By.xpath("(//a[starts-with(text(),'Electro')])[1]")).click();
		//driver.findElement(By.xpath("//input[starts-with(@name,'News')]")).sendKeys("starts with type");
		//driver.findElement(By.xpath("//input[starts-with(@value,'Subscribe')]")).click();
		
		//driver.findElement(By.xpath("//input[@type='button' and @id='vote-poll-1']")).click();
		//driver.findElement(By.xpath("(//span[@class='cart-label' or text()='Shopping cart'])[1]")).click();
		//driver.get("file:///D:/Siddesh/selenium5.html");
		//driver.findElement(By.xpath("(//input)[2]/preceding-sibling::input")).sendKeys("preceding-siblings");
		//driver.findElement(By.xpath("(//input)[1]/following-sibling::input")).sendKeys("following-siblings");
		//driver.findElement(By.xpath("(//input)[5]/parent::body/input[1]")).sendKeys("Siddesh"); 

		//driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).click();
	}

}
