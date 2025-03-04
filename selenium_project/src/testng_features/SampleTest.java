package testng_features;

//testNG class
import org.testng.annotations.Test;

//testNG class(full program)
public class SampleTest {
	@Test
	public void Demo() { // Test case
		System.out.println("Welcome to testng");
		// Test Steps
	}

	@Test
	public void RegisterTest() {
		System.out.println("Executing Register Test Case");
	}

	@Test
	public void LoginTest() {
		System.out.println("Executing Login Test Case");

	}

	@Test
	public void SearchTest() {
		System.out.println("Executing Search Test case");
	}
}
