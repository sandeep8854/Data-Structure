
public class ClassDataApp
{
	public static void main(String[] args)
	{
		int maxSize=100;
		ClassDataArray arr;    //reference to array
		arr=new ClassDataArray(maxSize);  //create  the array
		

	
		arr.insert("Malik ", "Harsh", 24);
		
		arr.insert("Kumari ", "Anshika", 7);
		arr.insert("Kashaudhan ", "Ram", 40);
		arr.insert("Yadav", "Shyam", 26);
		arr.insert("Bhandari ", "Yogesh", 16);
		arr.insert("keshav", "Pramesh", 15);
		
		
		
		arr.display();
		
		String searchKey="Yadav";
		Person found;
		found=arr.find(searchKey);
		if(found!=null)
		{
			System.out.print("Found");
			found.displayPerson();
		}
		else
			System.out.println("Can't find "+searchKey);
		System.out.println();
		
		System.out.println("Deleting Keshav,Kumari,Malik");
		
		arr.display();
	}
}
