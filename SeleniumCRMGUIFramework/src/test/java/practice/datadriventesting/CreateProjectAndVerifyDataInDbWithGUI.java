package practice.datadriventesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;



public class CreateProjectAndVerifyDataInDbWithGUI {

	public static void main(String[] args) throws Throwable {

		//create project in GUI using Seleniun webdriver code
		String projectName = "stacicP";

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("http://49.249.28.218:8091/");

		driver.findElement(By.id("username")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();

		driver.findElement(By.linkText("Projects")).click();
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();

		driver.findElement(By.name("projectName")).sendKeys(projectName);
		driver.findElement(By.name("createdBy")).sendKeys("Deepak");
		Select sel = new Select(driver.findElement(By.xpath("(//select[@name='status'])[2]")));
		sel.selectByVisibleText("On Going");
		driver.findElement(By.xpath("//input[@value='Add Project']")).click();
		
		//verify the project in Backend DB using JDBC             
		boolean flag = false;
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);

		Connection conn = DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_hrm", "root", "root");
        System.out.println("=======Done======");
		Statement stat = conn.createStatement();

		ResultSet resultset = stat.executeQuery("select * from project");
		while (resultset.next()) {
			String actualProjectName = resultset.getString(4);
			if (projectName.equals(actualProjectName)) {
				flag = true;
				System.out.println(projectName + "is available in DB==pass");

			}
		}
		if (flag == false) {
			System.out.println(projectName + " is not available in DB ==fail");
 		}
		conn.close();

		

	}
	

}
