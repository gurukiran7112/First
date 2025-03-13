import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class JuninsCiCDTest {

	WebDriver driver = new ChromeDriver();

	@Test
	public void CreateJobTest() throws Exception {
		
	Properties po=new Properties();
	po.load(new FileReader("C:\\Users\\Gurup\\git\\GiTBASH-REP1\\TekPyramidOSAFramework\\configAppData\\Commandata.properties"));
	String un=po.getProperty("un");
String pwd=	po.getProperty("pwd");
String buildp=	po.getProperty("build");
String git=po.getProperty("gituri");
String pom=po.getProperty("pom");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login?from=%2F"); /* login to junkin */
		
		

		driver.findElement(By.id("j_username")).sendKeys(un); /* add username */

		driver.findElement(By.id("j_password")).sendKeys(pwd, Keys.ENTER); /* add password and click on login */

		driver.findElement(By.xpath("//a[contains(@class,'task-link task-link-no-confirm ')]")).click(); /* Click on new item / job*/

		WebElement newitem=driver.findElement(By.className("jenkins-breadcrumbs__list-item"));	
		Actions action=new Actions(driver);
	//action.moveToElement(newitem).keyDown(Keys.TAB).sendKeys("added").keyUp(Keys.TAB); 		                           /* Click on maven project */
	WebElement tf=	 driver.findElement(By.className("jenkins-input"));
	
	Random ran=new Random();
int random=	ran.nextInt(200);
		 
	      tf.sendKeys("added_"+random);
	      
	      driver.findElement(By.className("hudson_maven_MavenModuleSet")).click();
	      
	      driver.findElement(By.id("ok-button")).click();
	      
	    WebElement config=  driver.findElement(By.xpath("//li[text()='Configuration']"));
 action.moveToElement(config).doubleClick().keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
 Thread.sleep(2000);
 
 
	    
	      
//	      driver.findElement(By.xpath("//span[contains(text(),'Source Code Management')]"));
//	      Thread.sleep(2000);
//	      action.scrollByAmount(10000, 10000);
//	      Thread.sleep(2000);

	      
	     driver.findElement(By.xpath("//label[text()='Git']")).click();
	     driver.findElement(By.name("_.url")).sendKeys(git);
	     
	WebElement usernamegit=     driver.findElement(By.name("_.credentialsId"));
	     Select sel=new Select(usernamegit);
	     sel.selectByIndex(1);

	      	      
	      Thread.sleep(1000);
WebElement trigger=	      driver.findElement(By.xpath("//span[contains(text(),'Triggers')]/preceding-sibling::span"));
       trigger.click();
	   Thread.sleep(1000);
	      driver.findElement(By.xpath("//label[text()='Build periodically']")).click();
	      
	      driver.findElement(By.name("_.spec")).sendKeys(buildp);
	      Thread.sleep(1000);
	      
	        action.doubleClick(trigger).perform();

	    action.moveToElement(trigger).click().keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	 
	    driver.findElement(By.name("rootPOM")).sendKeys(pom);
	    
	    driver.findElement(By.name("goals")).sendKeys("mvn test");
	    
		 driver.findElement(By.name("Submit")).click();
		


	}
}
