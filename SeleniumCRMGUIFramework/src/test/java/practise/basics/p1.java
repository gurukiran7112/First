package practise.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class p1 {
	@Test
	public void projectCheckTest() throws SQLException {
		boolean flag = false;
		String expectedProjectName = "FB_1";

		// step 1 : load/register the database driver
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);

		// step 2 : connect to database
		Connection conn = DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_hrm", "root", "root");

		// step 3 : create Sql statement
		Statement stat = conn.createStatement();

		// step 4 : execute select query & get result
		ResultSet resultset = stat.executeQuery("select * from project");
		while (resultset.next()) {
			String actualProjectName = resultset.getString(1);
			System.out.println(actualProjectName);
			if (expectedProjectName.equals(actualProjectName)) {
				flag = true;
				System.out.println(expectedProjectName + "is available ==pass");

			}
		}
		if (flag == false) {
			System.out.println(expectedProjectName + " is not available ==fail");
		}

		// Step 5 : Close the connection
		conn.close();

	}

}
