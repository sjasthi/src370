
import java.sql.*;

public class MovieDriver {

	/**
	* This method retrieves the movie details given a movie id
	 */

	public Movie getMovieInfo(int movie_id)
	{

	}


	/**
	* This method deletes a movie based on the movie id
	* Returns true if the operation is successful.
	* Returns false if there is any issue
	 */

	public boolean deleteMovieById(int movie_id)
	{

	}


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
