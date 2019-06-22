
public class Person {

	protected String firstName; //Stores the first name
	protected String lastName;  //Stores the last name
	public Person()				//Default constructor
	{
		firstName = "";  
		lastName = "";
	}					//Constructor with parameters
	public Person(String first, String last) 
	{
		setName(first,last);
	}		//Method to output the first name and last name
	public String toString()
	{
		return (firstName + " " + lastName);
	}		//Method to set first name and first name and last name
	public void setName(String first, String last)
	{
		firstName = first;
		lastName = last;
	}		//method to return firstName
	public String getFirstname()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	
	
}
