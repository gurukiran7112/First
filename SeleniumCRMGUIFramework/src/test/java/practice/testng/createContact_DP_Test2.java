package practice.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class createContact_DP_Test2 {

	@Test(dataProvider = "getData")
	public void createContact_DP_test(String FirstName , String LastName) {
		System.out.println("FirstName :" + FirstName +   " , LastName :" + LastName);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] objArr = new Object[3][2];
		objArr[0][0]="Deepak";
		objArr[0][1]="HR";
		
		objArr[1][0]="sam";
		objArr[1][1]="sh";
		
		objArr[2][0]="Jhon";
		objArr[2][1]="smith";
		
		
		return objArr;
		
	}
	
}
 