import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconn {
	String url, user, passwd;
	
	DBconn(String url, String user, String passwd) {
		this.url = url;
		this.user = user;
		this.passwd = passwd;
	}
	
	/*
	 * Establish connection to database
	 */
	public Connection connect() {
		Connection conn = null;
		
		try {
			Class.forName("org.postgresql.Driver");
		} catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
	
		try {
			conn = DriverManager.getConnection(this.url, this.user, this.passwd);
			
			if (conn != null) {
				System.out.println("Connection sucessfull!");
			} else {
				System.out.println("Connection failed!");
			}
				
		} catch(SQLException e) {
			System.out.println(e.getMessage());
			}
		
		return conn;
	} //end of connect() method
	
} //end of DBconn class
