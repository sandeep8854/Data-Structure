
public class Person
{
	private String lastName;
	private String firstName;
	private int age;
	
	public Person(String last,String first,int a)
	{
		lastName=last;
		firstName=first;
		age=a;
	}
	public void displayPerson()
	{
		System.out.println("Last Name"+lastName);
		System.out.println("First Name"+firstName);
		System.out.println("Age "+age);
	}
	public String getLast()//get last name;
	{
		return lastName;//this is field use for search
	}
}
