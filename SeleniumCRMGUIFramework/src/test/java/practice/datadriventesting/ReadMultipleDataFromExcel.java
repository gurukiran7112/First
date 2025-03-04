package practice.datadriventesting;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws Throwable {
		String expectedTestId = "tc_100";
		String data1 = "";
		String data2 = "";
		String data3 = "";
		boolean flag = false;

		FileInputStream fis = new FileInputStream("./src/main/resources/property_file/testScriptData.xlsx");
		Workbook Wb = WorkbookFactory.create(fis);
		Sheet sh = Wb.getSheet("org");

		int rowCount = sh.getLastRowNum();

		for (int i = 0; i <= rowCount; i++) {
			String data = "";

			try {
				data = sh.getRow(i).getCell(0).toString(); // method chaining // String data acts a local variable
															// because it is inside try catch block so declare globally
															// or inside for loop
				if (data.equals(expectedTestId)) {
					flag = true;
					data1 = sh.getRow(i).getCell(1).toString();
					data2 = sh.getRow(i).getCell(2).toString();
					data3 = sh.getRow(i).getCell(3).toString();

				}
			} catch (Exception e) {
			}
		} // for loop ends

		if (flag == true) {
			System.out.println(data1);
			System.out.println(data2);
			System.out.println(data3);
		} else {
			System.out.println(expectedTestId + " data is not available");
		}

		Wb.close();

	}

}
