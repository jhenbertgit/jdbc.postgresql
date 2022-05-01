import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query extends DBconn {

	Query(String url, String user, String passwd) {
		super(url, user, passwd);
	}
	
	public void getAll() throws SQLException {
		String query = "SELECT* FROM employee";		
		
		Statement statement = connect().createStatement();
		ResultSet result = statement.executeQuery(query);
		
		while(result.next()) {
			String myData = "";
			//reads the column
			for (int i = 1; i <= 3; i++) {
				myData += result.getString(i) + String.format("%-5s\t", "");
			}
			System.out.println(myData);
		}
		
	} //end of getAll() method
	
} //end of Query class
