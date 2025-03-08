
package dataDrivenTesting;

import java.io.FileInputStream;
import java.util.Properties;

public class SampleDataDrivenTesting {

	public static void main(String[] args) throws Throwable {

		
		FileInputStream fis = new FileInputStream("./Configdata/Commandata.properties");
		Properties pObj=new Properties();
		pObj.load(fis);
		String data = pObj.getProperty("Chrome");
		System.out.println(data);
	}

}
