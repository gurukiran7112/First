package practice.datadriventesting;

import org.testng.annotations.Test;

public class ReadRuntimeMavenParameterTest {
	@Test
	public void runtimeParameterTest() {
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");

		
		System.out.println("Env data==>URL ===="+URL);                                  //capturing  data from maven parameter through commnad line 
		System.out.println("Browser data======="+BROWSER); 
		System.out.println("username======"+USERNAME); 
		System.out.println("password==="+PASSWORD); 

	}

}
