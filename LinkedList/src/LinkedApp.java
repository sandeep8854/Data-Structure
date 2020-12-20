
public class LinkedApp
{
	public static void main(String[] args)
	{
		LinkList theList=new LinkList();
		
		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);
		
		
		theList.displayList();
		
		Link f=theList.find(88);
		if(f!=null)
			System.out.println("Found link with key "+f.iData);
		else
			System.out.println("Can't find it:");
		
		System.out.println("<<<<<<------------>>>>>>>>");
		
		Link d=theList.delete(88);
		if(d!=null)
			System.out.println("Deleted the link with key "+d.iData);
		else
			System.out.println("Can't delete the link");
		theList.displayList();
	}

}
