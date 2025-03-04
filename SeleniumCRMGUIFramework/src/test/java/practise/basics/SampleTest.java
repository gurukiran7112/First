package practise.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class SampleTest {

	public static void main(String[] args) throws Throwable {

		// step 1 : load/register the database driver
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);

		// step 2 : connect to database

		Connection conn = DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_hrm", "root", "root");
		System.out.println("=======Done======");
		// step 3 : create Sql statement

		// step 4 : execute select query & get result

		// step 5 : close the connection
	}

}
