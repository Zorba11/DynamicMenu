package menubar;

import java.sql.*;

public class DBUtil {
//methods for connecting to the database
	//has two methods get connection and close connection
	
	
	public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //load and register oracle driver
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
			//takes 3 parameters DbURL,Username and password
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void closeConnection(Connection conn) {
		
		try {
			
			conn.close();
		}
		
		catch(SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
}
