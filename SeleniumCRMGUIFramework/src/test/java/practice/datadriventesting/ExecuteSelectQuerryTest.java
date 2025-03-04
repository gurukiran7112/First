package practice.datadriventesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class ExecuteSelectQuerryTest {

	public static void main(String[] args) throws SQLException {
		// step 1 : load/register the database driver
				Driver driverRef=new Driver();
				DriverManager.registerDriver(driverRef);
				
				// step 2 : connect to database
				
				Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
				System.out.println("=======Done======");
				// step 3 : create Sql statement
				// step 4 : execute select query & get result
				// step 5 : close the connection
	}

}
