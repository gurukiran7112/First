package practice.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SampleDataDrivenTesting {

	public static void main(String[] args) throws IOException   {
		
		// Step1 : Get the java representation object of the physical file
		FileInputStream fis = new FileInputStream("./src/main/resources/property_file/Commandata.properties");
	
		//Step2 : using properties class , load all the keys
		Properties pObj = new Properties();
		pObj.load(fis);
		
		// Step 3 : get the value based on key
		System.out.println(pObj.getProperty("browser"));

	}

}
