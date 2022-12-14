package DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {
    
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			Class .forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url ="jdbc:mysql://localhost:3306/mgnarega";
		
		try {
		conn  =	DriverManager.getConnection(url,"root", "nk2610");
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		return conn;
	}
}
