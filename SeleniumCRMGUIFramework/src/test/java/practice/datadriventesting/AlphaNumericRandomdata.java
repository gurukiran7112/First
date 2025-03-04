package practice.datadriventesting;

import java.util.Iterator;

public class AlphaNumericRandomdata {

	public static void main(String[] args) {

		int n = 20;

		// choose a charater random from the string
		String AlphaNumericString = "QWERTYUIOOOPASDFGHJKLZXCVBNM123456789qwertyuioopasdfghjkllllzxcvbnm";

		// create StringBuffer size of AlphaNumaricString
		StringBuilder sb = new StringBuilder(n); // to concatinate 20 alhanumeric

		for (int i = 0; i < n; i++) { // using loop
			// generate a rondom number between 0 to AlphaNumericString variable length
			int index = (int) (AlphaNumericString.length() * Math.random());

			// add character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}
		System.out.println(sb);
		

	}

}
