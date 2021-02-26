

/*================================
 Author     : Jasthi.java Program
 Class Name : Book
 Date       :       18 Feb 2021
 Course     : ICS141 Programming with Objects (Siva Jasthi)
 Purpose    : Lab/Program Number
=================================*/


public class Book
{	

	//for representing the title of a Book
	private String title;	

	//for representing theauthor of a Book
	private String author;

	/**
	 * Default Constructor For Book Class
	 */
	 public Book()
	 {
 
	 };

	/**
	* Overloded Constructor For Book Class
	*/
	 public Book(String a_title, String a_author)
	 { 
		title = a_title;
		author = a_author;
	 }

	/**
	 * Set method for the variable title
	 */
	public void setTitle(String a_title)
	{
		title = a_title;
	}

	/**
	 * Set method for the variable author
	 */
	public void setAuthor(String a_author)
	{
		author = a_author;
	}

	/**
	 * Get method for the variable title
	 */
	public String getTitle( )
	{
		return title;
	}

	/**
	 * Get method for the variable author
	 */
	public String getAuthor( )
	{
		return author;
	}

	/** 
	 * Returns the String representation of Book object 
	 */
	 public String toString()
	{
		 String temp = 
			"\ntitle = " + title +
			"\nauthor = " + author;

		 return temp;
	}

	/**
	* main( ) method for  Book Class
	*/
	public static void main(String args[])
	{ 
		Book book_1 = new Book( );
		book_1.setTitle("title_dummy_string");
		book_1.setAuthor("author_dummy_string");
		System.out.println(book_1);
	}
}