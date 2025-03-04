package practice.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelTest {

	public static void main(String[] args) throws Throwable, IOException {

		// Step 1 : get the Excel path location & java object of the physical ExcelFile
		FileInputStream fis = new FileInputStream("./src/main/resources/property_file/testScriptData.xlsx");

		// Step 2 : open Workbook in read mode
		Workbook Wb = WorkbookFactory.create(fis);

		// Step 3 : get the control of the "org" sheet
		Sheet sh = Wb.getSheet("org");

		// Step 4 : get the control of the "1st" row
		Row row = sh.getRow(1);

		// Step 5 : get the control of the "2st" cell & read the String data
		 String data = row.getCell(3).getStringCellValue();                       //optimization means method chaining
		System.out.println(data);

		// Step 6 : Close the Workbook
		Wb.close();

	}

}
