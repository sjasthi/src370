
import java.sql.*;

public class MovieDriver {

	public static void main(String[] args) {
		
		try {
			// 1. Get a connection to the database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/omdb", "root", "");
			
			
			// 2. Create a statement
			Statement myStmt = myConn.createStatement();
			
			// 3. Execute SQL Query
			ResultSet myRs = myStmt.executeQuery("SELECT english_name FROM movies");
			
			// Process the result set
			while (myRs.next())
			{
			   System.out.println(myRs.getString("english_name"));	
			}
			
		}
		
		catch (Exception exc)
		{
			exc.printStackTrace();
		}

	}

}