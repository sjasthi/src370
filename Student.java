

/*================================
 Author     : Jasthi.java Program
 Class Name : Student
 Date       :       
 Course     : ICS141 Programming with Objects (Siva Jasthi)
 Purpose    : Lab/Program Number
=================================*/


public class Student
{	

	//for representing the name of Student
	private String name;	

	//for representing the marks of Student
	private int marks;	

	//for representing the email of a Student
	public String email;

	/**
	 * Default Constructor For Student Class
	 */
	 public Student()
	 {
 
	 };

	/**
	* Overloded Constructor For Student Class
	*/
	 public Student(String a_name, int a_marks, String a_email)
	 { 
		name = a_name;
		marks = a_marks;
		email = a_email;
	 }

	/**
	 * Set method for the variable name
	 */
	public void setName(String a_name)
	{
		name = a_name;
	}

	/**
	 * Set method for the variable marks
	 */
	public void setMarks(int a_marks)
	{
		marks = a_marks;
	}

	/**
	 * Set method for the variable email
	 */
	public void setEmail(String a_email)
	{
		email = a_email;
	}

	/**
	 * Get method for the variable name
	 */
	public String getName( )
	{
		return name;
	}

	/**
	 * Get method for the variable marks
	 */
	public int getMarks( )
	{
		return marks;
	}

	/**
	 * Get method for the variable email
	 */
	public String getEmail( )
	{
		return email;
	}

	/** 
	 * Returns the String representation of Student object 
	 */
	 public String toString()
	{
		 String temp = 
			"\nname = " + name +
			"\nmarks = " + marks +
			"\nemail = " + email;

		 return temp;
	}

	/**
	* main( ) method for  Student Class
	*/
	public static void main(String args[])
	{ 
		Student student_1 = new Student( );
		student_1.setName("name_dummy_string");
		student_1.setMarks(100);
		student_1.setEmail("email_dummy_string");
		System.out.println(student_1);
	}
}