package practice.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class createContact_DP_Test {

	@Test(dataProvider = "getData")
	public void createContact_DP_test(String FirstName , String LastName , long PhoneNumber) {
		System.out.println("FirstName :" + FirstName +   " , LastName :" + LastName + " , PhoneNumber :" + PhoneNumber);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] objArr = new Object[3][3];
		objArr[0][0]="Deepak";
		objArr[0][1]="HR";
		objArr[0][2]=2345678900l;
		
		objArr[1][0]="sam";
		objArr[1][1]="sh";
		objArr[1][2]=2345678900l;
		
		objArr[2][0]="Jhon";
		objArr[2][1]="smith";
		objArr[2][2]=2345678900l;
		
		
		return objArr;
		
	}
	
}
 