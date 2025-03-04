package selenium_trainig;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_Select_class {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);

		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(3000);
//		
//		//Display dropdown
//		WebElement display = driver.findElement(By.id("products-pagesize"));
//		Select objsel1=new Select(display);
//		//objsel1.selectByValue("https://demowebshop.tricentis.com/books?pagesize=12");  hard to dectect so use selectByIndex
//		objsel1.selectByContainsVisibleText("12");
//		Thread.sleep(3000);
//
//		//view as dropdown 
//		WebElement view = driver.findElement(By.id("products-viewmode"));
//		Select Objsel2 = new Select(view);
//		Objsel2.selectByIndex(1);

		// sort by display
		WebElement sort = driver.findElement(By.id("products-orderby"));
		Select objsel = new Select(sort);
		// objsel.selectByContainsVisibleText("Price: Low to High");
		// Thread.sleep(3000);

		// Get options method
		List<WebElement> sortby_values = objsel.getOptions();

		// iterate on the list to print the values
		for (WebElement value : sortby_values) {
			System.out.println(value.getText());
		}

		// To get all values in dropdown
		WebElement display = driver.findElement(By.id("products-pagesize"));
		Select DisplayFullDropdown = new Select(display);
		List<WebElement> DisplayValues = DisplayFullDropdown.getOptions();
		for (WebElement display_Value : DisplayValues) {
			System.out.println(display_Value.getText());

		}
		driver.close();

	}

}
